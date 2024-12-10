package X;

import android.animation.ValueAnimator;

/* renamed from: X.CxZ  reason: case insensitive filesystem */
public final /* synthetic */ class C26316CxZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ CT2 A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CT2 ct2 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        float A002 = C108985cd.A00(valueAnimator);
        ct2.A00 = Math.min(ct2.A00, Math.max(f, f2 - ((f2 - f) * (0.5f * A002))));
        float f3 = (float) ct2.A01;
        ct2.A01 = (int) Math.max(f3 - (A002 * f3), 0.0f);
    }

    public /* synthetic */ C26316CxZ(CT2 ct2, float f, float f2) {
        this.A02 = ct2;
        this.A00 = f;
        this.A01 = f2;
    }
}
