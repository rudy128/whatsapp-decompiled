package com.google.android.gms.common.util;

import X.AnonymousClass000;
import X.C25937Cp3;
import X.C41401wK;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

public abstract class UidVerifier {
    public static boolean A00(Context context, int i) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C41401wK.A00(context).A00.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, "com.google.android.gms");
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    C25937Cp3 A00 = C25937Cp3.A00(context);
                    if (packageInfo == null) {
                        return false;
                    }
                    if (C25937Cp3.A01(packageInfo, false)) {
                        return true;
                    }
                    if (!C25937Cp3.A01(packageInfo, true)) {
                        return false;
                    }
                    if (GooglePlayServicesUtil.A02(A00.A00)) {
                        return true;
                    }
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                } catch (PackageManager.NameNotFoundException unused) {
                    if (!Log.isLoggable("UidVerifier", 3)) {
                        return false;
                    }
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                    return false;
                }
            } else {
                throw AnonymousClass000.A0s("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
        } catch (SecurityException unused2) {
            return false;
        }
    }
}
