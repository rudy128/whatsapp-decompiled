package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.9nW  reason: invalid class name and case insensitive filesystem */
public abstract class C191989nW {
    public boolean A03(long[] jArr) {
        C162388Kn r3 = (C162388Kn) this;
        synchronized (r3) {
            if (!r3.A02) {
                return false;
            }
            r3.A04();
            System.arraycopy(r3.A04, 0, jArr, 0, 8);
            return true;
        }
    }

    public static C191989nW A01(Context context, C29831cw r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C162398Ko(context);
        }
        AnonymousClass29Q r1 = new AnonymousClass29Q();
        if (r1.A03(new long[8])) {
            return r1;
        }
        return new C162388Kn(context, r3);
    }

    public boolean A02() {
        return false;
    }
}
