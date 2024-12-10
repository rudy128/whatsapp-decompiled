package X;

import android.animation.ValueAnimator;

/* renamed from: X.Cxb  reason: case insensitive filesystem */
public final /* synthetic */ class C26318Cxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CT2 A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CT2 ct2 = this.A03;
        float f = this.A00;
        float f2 = this.A01;
        int i = this.A02;
        float A002 = C108985cd.A00(valueAnimator);
        ct2.A00 = Math.max(f, ((f2 - f) * A002) + f);
        float f3 = (float) i;
        ct2.A01 = (int) Math.min(f3, Math.min(1.2f * A002, A002) * f3);
    }

    public /* synthetic */ C26318Cxb(CT2 ct2, float f, float f2, int i) {
        this.A03 = ct2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }
}
