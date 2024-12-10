package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.0ys  reason: invalid class name and case insensitive filesystem */
public class C19730ys {
    public boolean A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final C18430wO A03;

    public C19730ys(Context context, C18430wO r6, String str) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        context = Build.VERSION.SDK_INT >= 24 ? C19740yt.A02(context) : context;
        this.A01 = context;
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.A02 = sharedPreferences;
        this.A03 = r6;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = this.A01;
                PackageManager packageManager = context2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A00 = z;
    }
}
