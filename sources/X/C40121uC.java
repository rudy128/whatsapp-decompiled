package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.1uC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C40121uC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BitmapDrawable A00;
    public final /* synthetic */ BitmapDrawable A01;
    public final /* synthetic */ C40071u7 A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C40071u7 r5 = this.A02;
        BitmapDrawable bitmapDrawable = this.A00;
        BitmapDrawable bitmapDrawable2 = this.A01;
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(valueAnimator, 3);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C18070vi.A0z(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r5.A05.CGF(new AnonymousClass3C6(bitmapDrawable, bitmapDrawable2, r5, ((Number) animatedValue).floatValue()));
    }

    public /* synthetic */ C40121uC(BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, C40071u7 r3) {
        this.A02 = r3;
        this.A00 = bitmapDrawable;
        this.A01 = bitmapDrawable2;
    }
}
