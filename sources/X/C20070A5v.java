package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.A5v  reason: case insensitive filesystem */
public abstract class C20070A5v {
    public static Set A00;

    public static String A02(Signature signature) {
        try {
            return AnonymousClass8BT.A0x(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static boolean A03(PackageInfo packageInfo) {
        Set set = A00;
        if (set == null) {
            HashSet A12 = C17880vN.A12();
            A12.add("ijxLJi1yGs1JpL-X1SExmchvork");
            A12.add("xW-31ZG6ZwTfBH_Zj1NTcv6gAhE");
            A12.add("Sr9mhPKOEwo6NysnYn803dZ3UiY");
            A12.add("OKD31QX-GP7GT780Psqq8xDb15k");
            A12.add("Dp3faO2KC6cZg6irlvtu9yL9H3E");
            set = Collections.unmodifiableSet(A12);
            A00 = set;
        }
        return set.contains(A01(packageInfo));
    }

    public static Signature A00(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        int length;
        try {
            int i = 64;
            if (AnonymousClass112.A05()) {
                i = 134217728;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
            String str2 = packageInfo.packageName;
            if (str.equals(str2)) {
                if (AnonymousClass112.A05()) {
                    signatureArr = packageInfo.signingInfo.getApkContentsSigners();
                } else {
                    signatureArr = packageInfo.signatures;
                }
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    throw new SecurityException(AnonymousClass001.A1H("Signatures are missing: ", str, AnonymousClass000.A10()));
                } else if (length <= 1) {
                    return signatureArr[0];
                } else {
                    throw new SecurityException(AnonymousClass001.A1H("Multiple signatures not supported: ", str, AnonymousClass000.A10()));
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Package name mismatch: expected=");
                A10.append(str);
                throw new SecurityException(AnonymousClass001.A1H(", was=", str2, A10));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass001.A1H("Name not found: ", str, AnonymousClass000.A10()));
        }
    }

    public static String A01(PackageInfo packageInfo) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (!AnonymousClass112.A05() || (signingInfo = packageInfo.signingInfo) == null) {
            signatureArr = packageInfo.signatures;
        } else {
            signatureArr = signingInfo.getApkContentsSigners();
        }
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        return A02(signatureArr[0]);
    }
}
