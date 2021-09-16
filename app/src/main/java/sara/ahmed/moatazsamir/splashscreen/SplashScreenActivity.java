package sara.ahmed.moatazsamir.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import gr.net.maroulis.library.EasySplashScreen;
import sara.ahmed.moatazsamir.home.ui.HomeActivity;
import sara.ahmed.moatazsamir.R;

public class SplashScreenActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                //.withFullScreen()
                .withSplashTimeOut(1900)
                .withTargetActivity(HomeActivity.class)
                .withBackgroundResource(R.mipmap.background_down)
                .withHeaderText("Copyright © 2021 NIF.")
                .withLogo(R.mipmap.logo_splash_screen);

        //change text color
        config.getHeaderTextView().setTextColor(Color.rgb(103,36,171));

        //finally create the view
        View easySplashScreenView = config.create();
        setContentView(easySplashScreenView);
    }
}