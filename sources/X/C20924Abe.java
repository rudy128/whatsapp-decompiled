package X;

import android.os.Build;

/* renamed from: X.Abe  reason: case insensitive filesystem */
public final class C20924Abe implements B9J {
    public int BXv() {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            return 2131894454;
        }
        if (i < 33) {
            return 2131894456;
        }
        return 2131894457;
    }
}
