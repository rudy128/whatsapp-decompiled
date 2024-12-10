package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.9oY  reason: invalid class name and case insensitive filesystem */
public final class C192529oY {
    public final ApplicationInfo A00;
    public final String A01;
    public final String A02;
    public final PackageInfo A03;

    public final long A00() {
        int i = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = this.A03;
        if (i >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    public final C194179rJ A01() {
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        if (Build.VERSION.SDK_INT < 28 || (signingInfo = this.A03.signingInfo) == null) {
            Signature[] signatureArr = this.A03.signatures;
            if (signatureArr == null) {
                return null;
            }
            List asList = Arrays.asList(signatureArr);
            C18070vi.A0X(asList);
            List A0q = C29431cG.A0q(asList);
            if (A0q.isEmpty()) {
                return null;
            }
            boolean z = true;
            if (A0q.size() <= 1) {
                z = false;
            }
            return new C194179rJ(A0q, z, false);
        }
        boolean hasMultipleSigners = signingInfo.hasMultipleSigners();
        boolean hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
        if (hasMultipleSigners) {
            signingCertificateHistory = signingInfo.getApkContentsSigners();
        } else {
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        }
        if (signingCertificateHistory == null) {
            return null;
        }
        List asList2 = Arrays.asList(signingCertificateHistory);
        C18070vi.A0X(asList2);
        List A0q2 = C29431cG.A0q(asList2);
        if (!A0q2.isEmpty()) {
            return new C194179rJ(A0q2, hasMultipleSigners, hasPastSigningCertificates);
        }
        return null;
    }

    public C192529oY(PackageInfo packageInfo) {
        this.A03 = packageInfo;
        String str = packageInfo.packageName;
        this.A01 = str == null ? "" : str;
        String str2 = packageInfo.versionName;
        this.A02 = str2 == null ? "" : str2;
        this.A00 = packageInfo.applicationInfo;
    }
}
