package X;

import android.view.KeyEvent;

/* renamed from: X.0Eo  reason: invalid class name and case insensitive filesystem */
public abstract class C02580Eo {
    public static final int A00(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return 2;
        }
        if (action != 1) {
            return 0;
        }
        return 1;
    }
}
