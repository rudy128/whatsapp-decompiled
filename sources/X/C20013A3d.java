package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.A3d  reason: case insensitive filesystem */
public abstract class C20013A3d {
    public static Set A00;

    public static ArrayList A00(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        ArrayList A13 = AnonymousClass000.A13();
        String packageName = context.getPackageName();
        for (PackageInfo next : installedPackages) {
            if (!next.packageName.equals(packageName)) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    String str = next.packageName;
                    int i = 64;
                    if (AnonymousClass112.A05()) {
                        i = 134217728;
                    }
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
                    if (C20070A5v.A03(packageInfo)) {
                        A13.add(packageInfo.packageName);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("could not find package; packageName=");
                    C108985cd.A1M(next.packageName, A10, e);
                }
            }
        }
        return A13;
    }

    public static boolean A01(Context context) {
        String packageName = context.getPackageName();
        int i = 64;
        if (AnonymousClass112.A05()) {
            i = 134217728;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, i);
            if (packageInfo == null || !C20070A5v.A03(packageInfo)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e((Throwable) e);
        }
    }

    public static boolean A02(Context context, String str) {
        try {
            String A0x = AnonymousClass8BT.A0x(C108945cZ.A1I().digest(C20070A5v.A00(context.getPackageManager(), str).toByteArray()));
            Set set = A00;
            if (set == null) {
                HashSet A12 = C17880vN.A12();
                for (C21339AiQ aiQ : BVL.A0b) {
                    A12.add(aiQ.sha256Hash);
                }
                for (C21339AiQ aiQ2 : BVL.A0e) {
                    A12.add(aiQ2.sha256Hash);
                }
                set = Collections.unmodifiableSet(A12);
                A00 = set;
            }
            return set.contains(A0x);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
