package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4dq  reason: invalid class name and case insensitive filesystem */
public class C90294dq implements View.OnTouchListener {
    public final int A00;

    public C90294dq(int i) {
        this.A00 = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return true;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) != 1) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }
}
