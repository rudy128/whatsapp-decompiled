package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.1wF  reason: invalid class name and case insensitive filesystem */
public abstract class C41371wF {
    public static volatile int A00 = -1;

    public static int A00(Context context) {
        int i;
        if (A00 == 0) {
            return A00;
        }
        try {
            i = C41381wH.A00.A02(context, 12451000);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("google-utils/checkGooglePlayServicesStatus/unexpected exception/");
            sb.append(e);
            Log.e(sb.toString());
            i = 8;
        }
        A00 = i;
        return i;
    }

    public static Account[] A01(Context context) {
        try {
            return AccountManager.get(context).getAccountsByType("com.google");
        } catch (Exception e) {
            Log.e("gdrive-activity/get-google-accounts", e);
            return new Account[0];
        }
    }
}
