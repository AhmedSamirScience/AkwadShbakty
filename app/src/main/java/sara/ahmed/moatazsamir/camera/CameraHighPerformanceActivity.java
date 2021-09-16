package sara.ahmed.moatazsamir.camera;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import sara.ahmed.moatazsamir.R;
import sara.ahmed.moatazsamir.singleton.GeneralSingleton;
import sara.ahmed.moatazsamir.singleton.IntentSingleton;

public class CameraHighPerformanceActivity extends AppCompatActivity {
    @BindView(R.id.surfaceView)
    SurfaceView surfaceView;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;
    private String textDetected = "";
    private static final int REQUEST_CODE_HANDLE_CAMERA_PERM = 3;
    String codeNumber = "";
    public CameraSource cameraSource;

    Boolean stateThread = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_high_performance);
        ButterKnife.bind(this);



        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            startingTextRecognizer();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cameraSource.release();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode != REQUEST_CODE_HANDLE_CAMERA_PERM) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        if (grantResults.length != 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startingTextRecognizer();
        }
    }

    private void startingTextRecognizer() {
        TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();

        if (!textRecognizer.isOperational()) {
            GeneralSingleton.getInstance().displaySnackBar(  CameraHighPerformanceActivity.this.getString(R.string.nextReleaseCamera),activityMain);
        } else {
             surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
                @Override
                public void surfaceCreated(@NonNull SurfaceHolder holder) {
                    cameraSource = new CameraSource.Builder(getApplicationContext(), textRecognizer)
                            .setFacing(0)
                            .setAutoFocusEnabled(true)
                            //.setRequestedFps(2.0f)
                            .setRequestedPreviewSize(1280,1024)
                            .build();
                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                        try {
                            cameraSource.start(surfaceView.getHolder());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {
                }

                @Override
                public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
                    cameraSource.stop();
                    stateThread=false;
                }
            });

            textRecognizer.setProcessor(new Detector.Processor<TextBlock>() {
                                            @Override
                                            public void release() {

                                            }

                                            @Override
                                            public void receiveDetections(@NotNull Detector.Detections<TextBlock> detections) {
                                                final SparseArray<TextBlock> items = detections.getDetectedItems();
                                                if (items.size() != 0) {
                                                    Thread thread = new Thread(() -> {

                                                        StringBuilder sb = new StringBuilder();
                                                        for (int i = 0; i < items.size(); i++) {
                                                            final Pattern pattern = Pattern.compile("(\\d{14,16})");
                                                            sb.append(items.valueAt(i).getValue().replace(" ", "").replace("-", ""));
                                                            Matcher matcher = pattern.matcher(sb.toString());
                                                            if (matcher.find()) {
                                                                textDetected = matcher.group(0);
                                                                cameraSource.stop();
                                                                CameraHighPerformanceActivity.this.runOnUiThread(() -> {

                                                                    if (stateThread)
                                                                        return;
                                                                    Intent callingIntent = getIntent();
                                                                    String companyName = "";
                                                                    if (callingIntent != null) {
                                                                        companyName = callingIntent.getStringExtra("CompanyName");
                                                                    }

                                                                    assert companyName != null;
                                                                    switch (companyName) {
                                                                        case "Etisalat":
                                                                            codeNumber = "*566*" + CameraHighPerformanceActivity.this.textDetected + "#";
                                                                            break;

                                                                        case "Orange":
                                                                            codeNumber = "*102*" + CameraHighPerformanceActivity.this.textDetected + "#";
                                                                            break;

                                                                        case "We":
                                                                            codeNumber = "*555*" + CameraHighPerformanceActivity.this.textDetected + "#";
                                                                            break;

                                                                        case "Vodafone":
                                                                            codeNumber = "*858*" + CameraHighPerformanceActivity.this.textDetected + "#";
                                                                            break;


                                                                    }



                                                                    AlertDialog dialog = new AlertDialog.Builder(CameraHighPerformanceActivity.this)
                                                                            .setTitle(CameraHighPerformanceActivity.this.getString(R.string.alertDialogTitle))
                                                                            .setMessage(CameraHighPerformanceActivity.this.getString(R.string.alertDialogMessage) + textDetected)
                                                                            .setPositiveButton(CameraHighPerformanceActivity.this.getString(R.string.alertDialogCheckDetectedCodeRight), null)
                                                                            .setNegativeButton(CameraHighPerformanceActivity.this.getString(R.string.alertDialogCheckDetectedCodeWrong), null)
                                                                            .show();

                                                                    Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                                                                    positiveButton.setOnClickListener(v -> {
                                                                        dialog.dismiss();
                                                                        IntentSingleton.getInstance().intentActionDial(CameraHighPerformanceActivity.this,codeNumber);
                                                                    });

                                                                    Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                                                                    negativeButton.setOnClickListener(v -> {
                                                                        dialog.dismiss();
                                                                        if (ActivityCompat.checkSelfPermission(CameraHighPerformanceActivity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED)
                                                                        {
                                                                            stateThread = false;

                                                                            try
                                                                            {
                                                                                cameraSource.start(surfaceView.getHolder());
                                                                            }
                                                                            catch (IOException e)
                                                                            {
                                                                                e.printStackTrace();
                                                                            }
                                                                        }
                                                                    });

                                                                    stateThread =true ;
                                                                });

                                                            } else {
                                                                sb.append("\n");
                                                            }
                                                        }
                                                    });
                                                    thread.start();
                                                }
                                            }
                                        }
            );
        }
    }

}