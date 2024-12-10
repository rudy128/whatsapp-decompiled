package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

public abstract class A3B {
    public static int A00(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return A39.A00((AppOpsManager) A39.A01(context), str, str2);
        }
        return 1;
    }

    public static int A01(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return A00(context, str, str2);
        }
        AppOpsManager A01 = A3A.A01(context);
        int A00 = A3A.A00(A01, str, str2, Binder.getCallingUid());
        if (A00 == 0) {
            return A3A.A00(A01, str, A3A.A02(context), i);
        }
        return A00;
    }

    public static String A02(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return A39.A02(str);
        }
        return null;
    }
}
