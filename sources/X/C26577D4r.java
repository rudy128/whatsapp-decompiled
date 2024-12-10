package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.D4r  reason: case insensitive filesystem */
public final class C26577D4r implements View.OnKeyListener {
    public final C28486E3q A00;

    public C26577D4r(C28486E3q e3q) {
        C18070vi.A0d(e3q, 1);
        this.A00 = e3q;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        C18070vi.A0e(view, 0, keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 66 && keyCode != 23 && keyCode != 109 && keyCode != 108 && (keyCode != 62 || (view instanceof EditText))) {
            return false;
        }
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            i2 = 1;
        } else if (this.A00.Bgj()) {
            return false;
        } else {
            i2 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(keyEvent.getDownTime(), keyEvent.getEventTime(), i2, ((float) (view.getRight() - view.getLeft())) / 2.0f, ((float) (view.getBottom() - view.getTop())) / 2.0f, 0);
        if (obtain != null) {
            return view.dispatchTouchEvent(obtain);
        }
        return false;
    }
}
