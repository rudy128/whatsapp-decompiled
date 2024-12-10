package X;

import android.view.MotionEvent;
import android.view.View;

public class D51 implements View.OnTouchListener {
    public final int A00;

    public D51(int i) {
        this.A00 = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }
}
