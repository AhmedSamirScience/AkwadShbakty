package sara.ahmed.moatazsamir.singleton;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;

import androidx.core.app.ActivityCompat;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import sara.ahmed.moatazsamir.R;

public class GeneralSingleton {

    private static GeneralSingleton  generalSingleton ;
    private final int REQUEST_CODE_HANDLE_CAMERA_PERM = 3;

    private GeneralSingleton()
    {
    }
    public static  GeneralSingleton getInstance()
    {
        synchronized (GeneralSingleton.class) {
            if (generalSingleton == null) {
                generalSingleton = new GeneralSingleton();
            }
        }
        return generalSingleton;
    }

    //Calculations
    public ArrayList<Integer> getCalculatedBalance(String amount)
    {

        int myNum = 0;
        ArrayList<Integer> myNums = new ArrayList<>();

        try
        {
            myNum = Integer.parseInt(amount);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Could not parse " + nfe);
        }

        myNums.add((int) (myNum*0.7));
        myNums.add((int) (myNum * (1.42857142859)));

        return myNums;

    }

    //Ask about permissions
    public  void askCameraPermission(Context context)
    {
        final String[] permissions = new String[]{Manifest.permission.CAMERA};
        if (!ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.CAMERA))
        {
            ActivityCompat.requestPermissions((Activity) context, permissions, REQUEST_CODE_HANDLE_CAMERA_PERM);
        }
    }
    public  int getRequestCodeHandleCameraPermission()
    {
        return REQUEST_CODE_HANDLE_CAMERA_PERM;
    }

    //Check Errors
    public  String checkPhoneNumber(String phoneNumber, String companyName, Context context)
    {

        if( phoneNumber.equals("") )
        {
            return context.getString(R.string.emptyCellPhone);
        }

        if( phoneNumber.length() != 11 )
        {
            return context.getString(R.string.lengthProblemPhone);
        }



        if(companyName.equals("Vodafone"))
        {
            if((( phoneNumber.charAt(0) != '0' || phoneNumber.charAt(1) != '1' || phoneNumber.charAt(2) != '0' ) ))
            {
                return context.getString(R.string.formatProblemPhone);
            }
        }

        return "Correct";

    }
    public  String checkAmount(String amount, Context context)
    {
        if(amount.equals(""))
        {
            return context.getString(R.string.emptyCellAmount);
        }

        if(amount.charAt(0) == '0')
        {
            return context.getString(R.string.startProblemAmount);
        }

        if(amount.contains(".")||amount.contains(",") )
        {
            return context.getString(R.string.floatProblemAmount);
        }

        return "Correct";
    }


    //SnackBar
    public void displaySnackBar( String s, LinearLayout linearLayout)
    {
        Snackbar.make(linearLayout,s,Snackbar.LENGTH_LONG).show();

    }



}
