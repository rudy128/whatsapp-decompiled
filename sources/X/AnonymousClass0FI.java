package X;

import android.view.MotionEvent;

/* renamed from: X.0FI  reason: invalid class name */
public abstract class AnonymousClass0FI {
    public static final boolean A00(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i);
            if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
