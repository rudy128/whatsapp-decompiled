package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;

/* renamed from: X.6vL  reason: invalid class name and case insensitive filesystem */
public final class C137366vL {
    public static final Integer A00(PackageManager packageManager) {
        Bundle bundle = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.meta.testing", 192);
            C18070vi.A0b(packageInfo);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length != 1 || !C18070vi.A18(C124466Yl.A00, signatureArr[0])) {
                return null;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            if (bundle == null) {
                return 0;
            }
            return Integer.valueOf(applicationInfo.metaData.getInt("com.meta.testing.group", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            C17900vP.A0X(e, "MarkerAppExperimentHelper/RuntimeException while retrieving package info ", AnonymousClass000.A10());
            return null;
        }
    }
}
