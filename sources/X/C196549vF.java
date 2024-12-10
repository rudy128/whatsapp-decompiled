package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9vF  reason: invalid class name and case insensitive filesystem */
public abstract class C196549vF {
    public static final boolean A00(Context context) {
        if (C24211Jh.A01(context, "com.facebook.katana") == -1 && C24211Jh.A01(context, "com.facebook.wakizashi") == -1) {
            return false;
        }
        return true;
    }

    public static final boolean A01(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.instagram.android", 0)) == null || TextUtils.isEmpty(packageInfo.versionName) || Integer.parseInt(packageInfo.versionName.split("\\.", 2)[0]) < 339) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("Failed to get package info", e);
            return false;
        } catch (NumberFormatException e2) {
            Log.e("Version name doesn't have number format", e2);
        }
    }
}
