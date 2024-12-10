package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class BH0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ E6R A00;
    public final /* synthetic */ BM2 A01;

    public BH0(E6R e6r, BM2 bm2) {
        this.A01 = bm2;
        this.A00 = e6r;
    }

    public boolean onDown(MotionEvent motionEvent) {
        E6R e6r = this.A00;
        if (e6r == null) {
            return false;
        }
        return e6r.C6x();
    }
}
