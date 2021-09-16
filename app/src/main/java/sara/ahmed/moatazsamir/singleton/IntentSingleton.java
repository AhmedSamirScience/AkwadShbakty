package sara.ahmed.moatazsamir.singleton;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import static android.Manifest.permission.CALL_PHONE;

public class IntentSingleton
{
    private static IntentSingleton intentSingleton ;

    private IntentSingleton()
    {
    }

    public static  IntentSingleton getInstance()
    {
        synchronized (GeneralSingleton.class)
        {
            if (intentSingleton == null)
            {
                intentSingleton = new IntentSingleton();
            }
        }
        return intentSingleton;
    }

    public void intentActionView (Context context, String  url)
    {
        Uri webPage = Uri.parse(url);
        Intent i = new Intent(Intent.ACTION_VIEW, webPage);
        if (i.resolveActivity(context.getPackageManager()) != null)
        {
            context.startActivity(i);
        }
    }
    public void intentActionDial (Context context, String  url)
    {
        Uri numUri = Uri.parse("tel:" + Uri.encode(url));
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(numUri);

        if (i.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(i);
        }
    }
    public void intentActionCall (Context context, String  url)
    {
        Uri numUri = Uri.parse("tel:"+url);
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(numUri);

        if (ContextCompat.checkSelfPermission(context, CALL_PHONE) == PackageManager.PERMISSION_GRANTED && i.resolveActivity(context.getPackageManager()) != null)
        {

            context.startActivity(i);
        }
        else
        {
            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.CALL_PHONE},1);
        }
    }





}
