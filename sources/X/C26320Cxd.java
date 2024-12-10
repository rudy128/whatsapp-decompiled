package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.Window;

/* renamed from: X.Cxd  reason: case insensitive filesystem */
public final /* synthetic */ class C26320Cxd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ObjectAnimator A01;
    public final /* synthetic */ Window A02;
    public final /* synthetic */ Cb1 A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Window window = this.A02;
        Cb1 cb1 = this.A03;
        int i = this.A00;
        ObjectAnimator objectAnimator = this.A01;
        C18070vi.A0d(objectAnimator, 3);
        int i2 = cb1.A01;
        Number number = (Number) objectAnimator.getAnimatedValue();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        window.setStatusBarColor(AnonymousClass1Z2.A03(f, i2, i));
    }

    public /* synthetic */ C26320Cxd(ObjectAnimator objectAnimator, Window window, Cb1 cb1, int i) {
        this.A02 = window;
        this.A03 = cb1;
        this.A00 = i;
        this.A01 = objectAnimator;
    }
}
