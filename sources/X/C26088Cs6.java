package X;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: X.Cs6  reason: case insensitive filesystem */
public class C26088Cs6 {
    public static volatile UserManager A00;
    public static volatile boolean A01 = (!C108975cc.A1C(Build.VERSION.SDK_INT, 24));

    public static boolean A01(Context context) {
        boolean z = A01;
        if (!z) {
            UserManager userManager = A00;
            if (userManager == null) {
                synchronized (C26088Cs6.class) {
                    userManager = A00;
                    if (userManager == null) {
                        userManager = (UserManager) context.getSystemService(UserManager.class);
                        A00 = userManager;
                        if (userManager == null) {
                            A01 = true;
                            return true;
                        }
                    }
                }
            }
            z = userManager.isUserUnlocked();
            A01 = z;
            if (z) {
                A00 = null;
            }
        }
        return z;
    }

    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT < 24 || A01(context)) {
            return false;
        }
        return true;
    }
}
