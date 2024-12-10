package X;

import android.os.Build;

/* renamed from: X.8KH  reason: invalid class name */
public final class AnonymousClass8KH extends C192949pI {
    public boolean A01(A2t a2t) {
        Integer num = a2t.A0B.A00;
        if (num == AnonymousClass00R.A0C) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30 || num != AnonymousClass00R.A0j) {
            return false;
        }
        return true;
    }
}
