package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class BEH extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ BM6 A01;

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public BEH(BM6 bm6) {
        this.A01 = bm6;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        BM6 bm6 = this.A01;
        if (C108985cd.A00(bm6.A0K) == 0.0f) {
            bm6.A02 = 0;
            bm6.A07(0);
            return;
        }
        bm6.A02 = 2;
        bm6.A0A.invalidate();
    }
}
