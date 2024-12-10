package X;

import android.os.Build;

/* renamed from: X.0Ft  reason: invalid class name and case insensitive filesystem */
public abstract class C02880Ft {
    public static final C17090tj A00;

    static {
        int i = Build.VERSION.SDK_INT;
        C17090tj r1 = C17090tj.A00;
        if (i >= 31) {
            r1 = C02620Es.A00(C02620Es.A00(r1, C15070q2.A00), C15080q3.A00);
        }
        A00 = r1;
    }
}
