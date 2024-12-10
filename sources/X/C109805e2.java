package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.5e2  reason: invalid class name and case insensitive filesystem */
public class C109805e2 extends ScaleGestureDetector {
    public float A00;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y;
        if (motionEvent.getPointerCount() == 2) {
            float x = motionEvent.getX(0) - motionEvent.getX(1);
            if (x == 0.0f) {
                y = Float.MAX_VALUE;
                this.A00 = Float.MAX_VALUE;
            } else {
                y = (motionEvent.getY(0) - motionEvent.getY(1)) / x;
            }
            this.A00 = y;
        }
        return super.onTouchEvent(motionEvent);
    }
}
