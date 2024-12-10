package X;

import android.window.BackEvent;

/* renamed from: X.0Om  reason: invalid class name and case insensitive filesystem */
public abstract class C04720Om {
    public static final float A00(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static final float A01(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static final float A02(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static final int A03(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }
}
