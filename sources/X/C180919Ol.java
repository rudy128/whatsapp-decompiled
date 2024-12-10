package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.9Ol  reason: invalid class name and case insensitive filesystem */
public abstract class C180919Ol {
    public static final C192529oY A00(Context context, String str, int i) {
        PackageInfo packageInfo;
        C18070vi.A0h(context, str);
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((i & 64) == 64) {
                i = (i & -65) | 134217728;
            }
            if (i2 >= 33) {
                packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of((long) i));
            }
            packageInfo = packageManager.getPackageInfo(str, i);
        } else {
            if ((i & 134217728) == 134217728) {
                i = (i & -134217729) | 64;
            }
            packageInfo = packageManager.getPackageInfo(str, i);
        }
        if (packageInfo != null) {
            return new C192529oY(packageInfo);
        }
        throw new PackageManager.NameNotFoundException(AnonymousClass001.A1H("PackageManager returned null PackageInfo for ", str, AnonymousClass000.A10()));
    }
}
