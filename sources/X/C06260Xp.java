package X;

import android.view.ViewConfiguration;

/* renamed from: X.0Xp  reason: invalid class name and case insensitive filesystem */
public final class C06260Xp implements C16880tN {
    public final ViewConfiguration A00;

    public /* synthetic */ long BV0() {
        return A00();
    }

    public float BUX() {
        return (float) this.A00.getScaledMaximumFlingVelocity();
    }

    public float Baf() {
        return (float) this.A00.getScaledTouchSlop();
    }

    public C06260Xp(ViewConfiguration viewConfiguration) {
        this.A00 = viewConfiguration;
    }

    public static long A00() {
        return C25291Cct.A00();
    }

    public long BQp() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public long BUE() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }
}
