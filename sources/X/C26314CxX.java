package X;

import android.animation.ValueAnimator;

/* renamed from: X.CxX  reason: case insensitive filesystem */
public class C26314CxX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BM6 A00;

    public C26314CxX(BM6 bm6) {
        this.A00 = bm6;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A002 = (int) (C108985cd.A00(valueAnimator) * 255.0f);
        BM6 bm6 = this.A00;
        bm6.A0O.setAlpha(A002);
        bm6.A0M.setAlpha(A002);
        bm6.A0A.invalidate();
    }
}
