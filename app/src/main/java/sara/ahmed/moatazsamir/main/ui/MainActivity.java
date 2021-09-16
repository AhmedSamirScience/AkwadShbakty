package sara.ahmed.moatazsamir.main.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import sara.ahmed.moatazsamir.R;
import sara.ahmed.moatazsamir.camera.CameraHighPerformanceActivity;
import sara.ahmed.moatazsamir.singleton.GeneralSingleton;
import sara.ahmed.moatazsamir.singleton.IntentSingleton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.balanceTransferButton)
    Button balanceButton;
    @BindView(R.id.numberTransferBalanceEditText)
    EditText numberTransferEditText;
    @BindView(R.id.amountNumberTransferBalanceEditText)
    EditText amountNumberTransferEditText;
    @BindView(R.id.knowBalanceButton)
    Button knowBalanceButton;
    @BindView(R.id.knowBalanceEditText)
    EditText knowBalanceEditText;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.changeAdapterListHekayaButton)
    Button changeAdapterListHekayaButton;
    @BindView(R.id.changeAdapterListConnectButton)
    Button changeAdapterListServicesButton;
    @BindView(R.id.changeAdapterListEntertainmentButton)
    Button changeAdapterListEntertainmentButton;
    @BindView(R.id.changeAdapterListCallCenterButton)
    Button changeAdapterListCallCenterButton;
    @BindView(R.id.changeAdapterListOthersButton)
    Button changeAdapterListOthersButton;
    @BindView(R.id.cameraRecharge)
    Button cameraRecharge;

    ViewModel viewModel;
    ListAdapter listAdapterCodes;
    String companyName = "";
    @BindView(R.id.toolbarTextView)
    TextView toolbarTextView;
    @BindView(R.id.linearLayoutMainSnackBar)
    LinearLayout linearLayoutMainSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        balanceButton.setOnClickListener(this);
        knowBalanceButton.setOnClickListener(this);
        changeAdapterListHekayaButton.setOnClickListener(this);
        changeAdapterListServicesButton.setOnClickListener(this);
        changeAdapterListEntertainmentButton.setOnClickListener(this);
        changeAdapterListCallCenterButton.setOnClickListener(this);
        changeAdapterListOthersButton.setOnClickListener(this);
        cameraRecharge.setOnClickListener(this);

        viewModel = ViewModelProviders.of(this).get(ViewModel.class);

        Intent callingIntent = getIntent();

        if (callingIntent != null) {
            companyName = callingIntent.getStringExtra("CompanyName");
        }
        viewModel.setData(companyName);

        viewModel.balanceTransferMutableLiveData.observe(this, s -> IntentSingleton.getInstance().intentActionDial(this, s));

        listAdapterCodes = new ListAdapter(this, viewModel.ViewModelCodesDataHekayaBundles);
        recycler.setAdapter(listAdapterCodes);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        viewModel.adapterListAdapterCodesMutableLiveData.observe(this, models -> listAdapterCodes.setList(models));

        switch (companyName) {
            case "Etisalat":
                toolbarTextView.setText(getResources().getString(R.string.toolbarEtisalat));
                balanceButton.setBackground(balanceButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));
                knowBalanceButton.setBackground(knowBalanceButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));
                changeAdapterListHekayaButton.setBackground(changeAdapterListHekayaButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));
                changeAdapterListServicesButton.setBackground(changeAdapterListServicesButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));
                changeAdapterListEntertainmentButton.setBackground(changeAdapterListEntertainmentButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));
                changeAdapterListCallCenterButton.setBackground(changeAdapterListCallCenterButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));
                changeAdapterListOthersButton.setBackground(changeAdapterListOthersButton.getContext().getResources().getDrawable(R.drawable.etisalat_drawable));

                break;
            case "We":
                toolbarTextView.setText(getResources().getString(R.string.toolbarWe));
                balanceButton.setBackground(balanceButton.getContext().getResources().getDrawable(R.drawable.we_drawable));
                knowBalanceButton.setBackground(knowBalanceButton.getContext().getResources().getDrawable(R.drawable.we_drawable));
                changeAdapterListHekayaButton.setBackground(changeAdapterListHekayaButton.getContext().getResources().getDrawable(R.drawable.we_drawable));
                changeAdapterListServicesButton.setBackground(changeAdapterListServicesButton.getContext().getResources().getDrawable(R.drawable.we_drawable));
                changeAdapterListEntertainmentButton.setBackground(changeAdapterListEntertainmentButton.getContext().getResources().getDrawable(R.drawable.we_drawable));
                changeAdapterListCallCenterButton.setBackground(changeAdapterListCallCenterButton.getContext().getResources().getDrawable(R.drawable.we_drawable));
                changeAdapterListOthersButton.setBackground(changeAdapterListOthersButton.getContext().getResources().getDrawable(R.drawable.we_drawable));

                break;
            case "Vodafone":
                toolbarTextView.setText(getResources().getString(R.string.toolbarVodafone));
                balanceButton.setBackground(balanceButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));
                knowBalanceButton.setBackground(knowBalanceButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));
                changeAdapterListHekayaButton.setBackground(changeAdapterListHekayaButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));
                changeAdapterListServicesButton.setBackground(changeAdapterListServicesButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));
                changeAdapterListEntertainmentButton.setBackground(changeAdapterListEntertainmentButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));
                changeAdapterListCallCenterButton.setBackground(changeAdapterListCallCenterButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));
                changeAdapterListOthersButton.setBackground(changeAdapterListOthersButton.getContext().getResources().getDrawable(R.drawable.vodafone_drawable));

                break;
            case "Orange":
                toolbarTextView.setText(getResources().getString(R.string.toolbarOrange));

                balanceButton.setBackground(balanceButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));
                knowBalanceButton.setBackground(knowBalanceButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));
                changeAdapterListHekayaButton.setBackground(changeAdapterListHekayaButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));
                changeAdapterListServicesButton.setBackground(changeAdapterListServicesButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));
                changeAdapterListEntertainmentButton.setBackground(changeAdapterListEntertainmentButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));
                changeAdapterListCallCenterButton.setBackground(changeAdapterListCallCenterButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));
                changeAdapterListOthersButton.setBackground(changeAdapterListOthersButton.getContext().getResources().getDrawable(R.drawable.orange_drawable));

                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.balanceTransferButton:
                String numberBalanceTransfer = numberTransferEditText.getText().toString();
                String amountNumberBalanceTransfer = amountNumberTransferEditText.getText().toString();

                String stateNumber = GeneralSingleton.getInstance().checkPhoneNumber(numberBalanceTransfer, "Etisalat", getApplicationContext());
                String stateAmount = GeneralSingleton.getInstance().checkAmount(amountNumberBalanceTransfer, getApplicationContext());

                if (stateNumber.equals("Correct")) {
                    if (stateAmount.equals("Correct")) {
                        viewModel.getBalanceDataTransfer(numberBalanceTransfer, amountNumberBalanceTransfer);
                    } else {
                        GeneralSingleton.getInstance().displaySnackBar( stateAmount, linearLayoutMainSnackBar);
                    }
                } else {
                    GeneralSingleton.getInstance().displaySnackBar( stateNumber,linearLayoutMainSnackBar);
                }
                break;

            case R.id.knowBalanceButton:

                String knowBalance = knowBalanceEditText.getText().toString();
                String stateKnowBalance = GeneralSingleton.getInstance().checkAmount(knowBalance, getApplicationContext());
                if (stateKnowBalance.equals("Correct")) {

                    ArrayList<Integer> amounts = GeneralSingleton.getInstance().getCalculatedBalance(knowBalance);

                    GeneralSingleton.getInstance().displaySnackBar(MainActivity.this.getString(R.string.phoneMoney) +" "+ amounts.get(0)+ MainActivity.this.getString(R.string.phoneMoneyRest)  +"\t\n"+ MainActivity.this.getString(R.string.phoneCredit) +" "+ amounts.get(1)+ MainActivity.this.getString(R.string.phoneCreditRest)  , linearLayoutMainSnackBar);

                } else {
                    GeneralSingleton.getInstance().displaySnackBar( stateKnowBalance,linearLayoutMainSnackBar);
                }

                break;

            case R.id.changeAdapterListConnectButton:
                viewModel.getArrayAdapterConnectBundles();
                break;

            case R.id.changeAdapterListHekayaButton:
                viewModel.getArrayAdapterHekayaBundles();
                break;

            case R.id.changeAdapterListEntertainmentButton:
                viewModel.getArrayAdapterEntertainmentBundles();
                break;

            case R.id.changeAdapterListCallCenterButton:
                viewModel.getArrayAdapterCallCenter();
                break;

            case R.id.changeAdapterListOthersButton:
                viewModel.getArrayAdapterOthers();
                break;

            case R.id.cameraRecharge:
                GeneralSingleton.getInstance().askCameraPermission(this);
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode != GeneralSingleton.getInstance().getRequestCodeHandleCameraPermission()) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }

        if (grantResults.length != 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Intent i = new Intent(this, CameraHighPerformanceActivity.class);
            i.putExtra("CompanyName", companyName);
            if (i.resolveActivity(getPackageManager()) != null) {
                startActivity(i);
            }
        }
    }

}