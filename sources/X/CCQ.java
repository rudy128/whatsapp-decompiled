package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CCQ {
    public static final List A00(Context context, String str) {
        PackageInfo packageInfo;
        int i;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0));
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str, 128);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("versionName=");
            A10.append(packageInfo.versionName);
            C26294Cx6.A06("lam:CompanionAppUtil", C17890vO.A0c(A10, ' '));
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                List A0S = AnonymousClass1YF.A0S(str2, new String[]{"."}, 0);
                ArrayList A0D = C29351c6.A0D(A0S);
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    if (A0v.length() == 0) {
                        i = 0;
                    } else {
                        i = Integer.parseInt(A0v);
                    }
                    C17890vO.A1D(A0D, i);
                }
                return A0D;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
