package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4ag  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C88724ag implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ValueAnimator A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ Integer A04;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A03;
        ValueAnimator valueAnimator2 = this.A02;
        Integer num = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        C18070vi.A0d(num, 2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (num == AnonymousClass00R.A00 || num == AnonymousClass00R.A01) {
                Object animatedValue = valueAnimator2.getAnimatedValue();
                C18070vi.A0z(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                layoutParams.width = (int) (AnonymousClass000.A04(animatedValue) * ((float) i));
            }
            Object animatedValue2 = valueAnimator2.getAnimatedValue();
            C18070vi.A0z(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            AnonymousClass3MZ.A1G(view, layoutParams, AnonymousClass000.A04(animatedValue2), (float) i2);
            Object animatedValue3 = valueAnimator2.getAnimatedValue();
            C18070vi.A0z(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(AnonymousClass000.A04(animatedValue3));
            return;
        }
        throw AnonymousClass3MY.A0k();
    }

    public /* synthetic */ C88724ag(ValueAnimator valueAnimator, View view, Integer num, int i, int i2) {
        this.A03 = view;
        this.A02 = valueAnimator;
        this.A04 = num;
        this.A00 = i;
        this.A01 = i2;
    }
}
