package sara.ahmed.moatazsamir.home.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProviders;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import sara.ahmed.moatazsamir.main.ui.MainActivity;
import sara.ahmed.moatazsamir.R;
import sara.ahmed.moatazsamir.singleton.IntentSingleton;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.etisalatButton)
    CardView etisalatButton;
    @BindView(R.id.orangeButton)
    CardView orangeButton;
    @BindView(R.id.vodafoneButton)
    CardView vodafoneButton;
    @BindView(R.id.weButton)
    CardView weButton;
    @BindView(R.id.rateButton)
    CardView rateButton;
    @BindView(R.id.moreAppsButton)
    CardView moreAppsButton;
    @BindView(R.id.feedbackButton)
    CardView feedbackButton;
    @BindView(R.id.shareAppButton)
    CardView shareAppButton;
    @BindView(R.id.privacyPolicyButton)
    CardView privacyPolicyButton;

    HomeViewModel mainViewModel;
    @BindView(R.id.feedbackButtonForChange)
    Button feedbackButtonForChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);


        orangeButton.setOnClickListener(this);
        vodafoneButton.setOnClickListener(this);
        weButton.setOnClickListener(this);
        etisalatButton.setOnClickListener(this);
        privacyPolicyButton.setOnClickListener(this);
        rateButton.setOnClickListener(this);
        moreAppsButton.setOnClickListener(this);
        feedbackButton.setOnClickListener(this);
        shareAppButton.setOnClickListener(this);
        feedbackButtonForChange.setOnClickListener(this);

        feedbackButtonForChange.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_in));



        if(Locale.getDefault().getDisplayLanguage().equals("العربية"))
        {
            orangeButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            weButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            moreAppsButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            shareAppButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));

            etisalatButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            vodafoneButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            rateButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            feedbackButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            privacyPolicyButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
        }
        else
        {
            orangeButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            weButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            moreAppsButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));
            shareAppButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_left));

            etisalatButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            vodafoneButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            rateButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            feedbackButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));
            privacyPolicyButton.setAnimation(AnimationUtils.loadAnimation(HomeActivity.this, R.anim.fade_transition_animation_to_right));

        }

        mainViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        mainViewModel.subjectMessageTextMutableLiveData.observe(this, strings -> {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{strings.get(0)});
            i.putExtra(Intent.EXTRA_SUBJECT, strings.get(1));
            i.putExtra(Intent.EXTRA_TEXT, strings.get(2));
            startActivity(i);
            if (i.resolveActivity(getPackageManager()) != null) {
                startActivity(i);
            }
        });

        mainViewModel.moreAppUrlMutableLiveData.observe(this, s -> IntentSingleton.getInstance().intentActionView(this, s));

        mainViewModel.privacyPolicyUrlMutableLiveData.observe(this, s -> IntentSingleton.getInstance().intentActionView(this, s));

        mainViewModel.shareTextAndUrlMutableLiveData.observe(this, strings -> {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, strings.get(0));
            i.putExtra(Intent.EXTRA_TEXT, strings.get(1) + getPackageName());

            if (i.resolveActivity(getPackageManager()) != null) {
                startActivity(i);
            }
        });

    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.orangeButton:
                i = new Intent(this, MainActivity.class);
                i.putExtra("CompanyName", "Orange");
                if (i.resolveActivity(getPackageManager()) != null) {

                    startActivity(i);
                }
                break;

            case R.id.weButton:
                i = new Intent(this, MainActivity.class);
                i.putExtra("CompanyName", "We");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                break;

            case R.id.etisalatButton:
                i = new Intent(this, MainActivity.class);
                i.putExtra("CompanyName", "Etisalat");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                break;

            case R.id.vodafoneButton:
                i = new Intent(this, MainActivity.class);
                i.putExtra("CompanyName", "Vodafone");
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                break;

            case R.id.rateButton:
                IntentSingleton.getInstance().intentActionView(this, "market://details?id=" + getPackageName());
                break;

            case R.id.shareAppButton:
                mainViewModel.getShareData();
                break;

            case R.id.privacyPolicyButton:
                mainViewModel.getPrivacyPolicyData();
                break;

            case R.id.moreAppsButton:
                mainViewModel.getMoreAppData();
                break;

            case R.id.feedbackButton:
            case R.id.feedbackButtonForChange:
                mainViewModel.getFeedbackData();
                break;
        }

    }
}