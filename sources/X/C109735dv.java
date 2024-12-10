package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.5dv  reason: invalid class name and case insensitive filesystem */
public class C109735dv extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C1407773a A00;

    public C109735dv(C1407773a r1) {
        this.A00 = r1;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        Runnable runnable = this.A00.A0L;
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C1407773a r0 = this.A00;
        r0.A03.onClick(r0.A0E);
        return true;
    }
}
