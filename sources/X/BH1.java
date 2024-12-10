package X;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class BH1 extends GestureDetector.SimpleOnGestureListener {
    public final BIJ A00;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BIJ bij = this.A00;
        if (bij.getContext() == null) {
            return false;
        }
        float translationY = bij.getTranslationY();
        if (f2 > 0.0f) {
            bij.A03((int) Math.abs(((C108945cZ.A04(bij) - translationY) / f2) * 1000.0f));
        } else {
            bij.A04((Animator.AnimatorListener) null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        bij.A08 = true;
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BIJ bij = this.A00;
        if (bij.getTranslationY() <= 0.0f && f2 > 0.0f) {
            return false;
        }
        bij.A08 = false;
        return true;
    }

    public BH1(BIJ bij) {
        this.A00 = bij;
    }
}
