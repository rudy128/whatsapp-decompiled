package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.2uI  reason: invalid class name and case insensitive filesystem */
public class C64142uI implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C64142uI(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A01 != 0) {
            ((View) this.A02).setTranslationX(valueAnimator.getAnimatedFraction() * this.A00);
            return;
        }
        C29221bq.A04((C29221bq) this.A02, AnonymousClass000.A04(valueAnimator.getAnimatedValue()), this.A00);
    }
}
