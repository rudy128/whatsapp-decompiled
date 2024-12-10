package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.Window;

/* renamed from: X.Cxc  reason: case insensitive filesystem */
public final /* synthetic */ class C26319Cxc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ObjectAnimator A01;
    public final /* synthetic */ Window A02;
    public final /* synthetic */ Cb1 A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        ObjectAnimator objectAnimator = this.A01;
        float f2 = this.A00;
        Window window = this.A02;
        Cb1 cb1 = this.A03;
        C18070vi.A0d(objectAnimator, 0);
        Number number = (Number) objectAnimator.getAnimatedValue();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        float f3 = (f - f2) / (1.0f - f2);
        window.setStatusBarColor(AnonymousClass1Z2.A03(f3, cb1.A03, -16777216));
        window.setNavigationBarColor(AnonymousClass1Z2.A03(f3, cb1.A02, -16777216));
    }

    public /* synthetic */ C26319Cxc(ObjectAnimator objectAnimator, Window window, Cb1 cb1, float f) {
        this.A01 = objectAnimator;
        this.A00 = f;
        this.A02 = window;
        this.A03 = cb1;
    }
}
