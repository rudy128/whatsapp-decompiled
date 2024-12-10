package X;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: X.9LW  reason: invalid class name */
public class AnonymousClass9LW extends Exception {
    public String a = "CLException";
    public String b;
    public String c;
    public Context d;

    public AnonymousClass9LW(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = context;
        A00(context, str2);
    }

    public AnonymousClass9LW(Context context, String str, String str2, Throwable th) {
        super(th);
        this.b = str;
        this.c = str2;
        this.d = context;
        A00(context, str2);
    }

    public void A00(Context context, String str) {
        InputStream inputStream;
        Properties properties = new Properties();
        try {
            inputStream = context.getAssets().open("cl-messages_en_us.properties");
        } catch (IOException e) {
            Log.e(this.a, e.getLocalizedMessage());
            inputStream = null;
        }
        try {
            properties.load(inputStream);
        } catch (IOException e2) {
            Log.e(this.a, e2.getLocalizedMessage());
        }
        Log.e(this.a, AnonymousClass001.A1H("ErrorMsg: ", properties.getProperty(str), AnonymousClass000.A10()));
        String string = context.getResources().getString(2131898965);
        Activity activity = (Activity) context;
        activity.findViewById(2131430529).setVisibility(0);
        ((TextView) activity.findViewById(2131430530)).setText(string);
    }
}
