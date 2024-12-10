package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0DO  reason: invalid class name */
public abstract class AnonymousClass0DO {
    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT < 23 || context == null || context.getPackageManager() == null || !AnonymousClass0DN.A00(context.getPackageManager())) {
            return false;
        }
        return true;
    }
}
