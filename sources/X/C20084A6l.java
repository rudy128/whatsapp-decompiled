package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.A6l  reason: case insensitive filesystem */
public abstract class C20084A6l {
    public static String[] A04(Context context, int i) {
        try {
            C18070vi.A0d(context, 0);
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                return packagesForUid;
            }
            throw new C21588Amc(AnonymousClass001.A1I("No packageName associated with uid=", AnonymousClass000.A10(), i));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    public static C192529oY A01(Context context, String str) {
        try {
            C192529oY A00 = C180919Ol.A00(context, str, 64);
            String str2 = A00.A01;
            if (str.equals(str2)) {
                return A00;
            }
            throw new C21587Amb(str, str2);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C21588Amc(AnonymousClass000.A0y(" not found by PackageManager.", AnonymousClass000.A11(str)));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    public static boolean A03(Context context, ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
        int i = applicationInfo.uid;
        int i2 = applicationInfo2.uid;
        if (!AnonymousClass000.A1T(i, i2)) {
            try {
                if (context.getPackageManager().checkSignatures(i, i2) != 0) {
                    return false;
                }
            } catch (RuntimeException e) {
                throw new SecurityException(e);
            }
        }
        return true;
    }

    public static Signature A00(C192529oY r3) {
        C194179rJ A01 = r3.A01();
        if (A01 == null) {
            throw new C21589Amd(r3.A01);
        } else if (Build.VERSION.SDK_INT >= 28 || A01.A00.size() <= 1) {
            return (Signature) C108955ca.A0p(A01.A00);
        } else {
            throw new C21586Ama(r3.A01);
        }
    }

    public static C21339AiQ A02(Context context, String str) {
        try {
            return new C21339AiQ(AnonymousClass8BT.A0x(AnonymousClass8BW.A1W(A00(A01(context, str)).toByteArray(), "SHA-256")));
        } catch (NoSuchAlgorithmException unused) {
            throw new SecurityException("Error obtaining SHA1/SHA256");
        }
    }
}
