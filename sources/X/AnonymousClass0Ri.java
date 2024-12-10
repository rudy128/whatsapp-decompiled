package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0Ri  reason: invalid class name */
public class AnonymousClass0Ri implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass0SF A00;

    public AnonymousClass0Ri(AnonymousClass0SF r1) {
        this.A00 = r1;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            AnonymousClass0SF r2 = this.A00;
            PopupWindow popupWindow = r2.A0A;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
                return false;
            }
            r2.A0K.postDelayed(r2.A0M, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            AnonymousClass0SF r0 = this.A00;
            r0.A0K.removeCallbacks(r0.A0M);
            return false;
        }
    }
}
