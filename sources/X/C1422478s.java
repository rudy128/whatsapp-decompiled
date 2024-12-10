package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.78s  reason: invalid class name and case insensitive filesystem */
public class C1422478s implements View.OnTouchListener {
    public final int A00;

    public C1422478s(int i) {
        this.A00 = i;
    }

    public static void A00(View view, int i) {
        view.setOnTouchListener(new C1422478s(i));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A00) {
            case 4:
                view.getParent().getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) != 1) {
                    return false;
                }
                view.getParent().getParent().requestDisallowInterceptTouchEvent(false);
                view.performClick();
                return false;
            case 7:
                if (motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1 || motionEvent.getY() >= 0.0f) {
                    return false;
                }
                break;
        }
        return true;
    }
}
