package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.1Ye  reason: invalid class name and case insensitive filesystem */
public abstract class C27931Ye extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public boolean A02;
    public final /* synthetic */ AnonymousClass1YV A03;

    public C27931Ye(AnonymousClass1YV r1) {
        this.A03 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass1YV r2 = this.A03;
        float f = (float) ((int) this.A00);
        C27801Xq r0 = r2.A0D;
        if (r0 != null) {
            r0.A0C(f);
        }
        this.A02 = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!this.A02) {
            C27801Xq r0 = this.A03.A0D;
            if (r0 == null) {
                f = 0.0f;
            } else {
                f = r0.A01.A00;
            }
            this.A01 = f;
            if (this instanceof C27971Yi) {
                f2 = ((C27971Yi) this).A00.A00;
            } else {
                if (this instanceof C27941Yf) {
                    AnonymousClass1YV r02 = ((C27941Yf) this).A00;
                    f3 = r02.A00;
                    f4 = r02.A03;
                } else if (this instanceof C27961Yh) {
                    AnonymousClass1YV r03 = ((C27961Yh) this).A00;
                    f3 = r03.A00;
                    f4 = r03.A01;
                } else {
                    f2 = 0.0f;
                }
                f2 = f3 + f4;
            }
            this.A00 = f2;
            this.A02 = true;
        }
        AnonymousClass1YV r3 = this.A03;
        float f5 = this.A01;
        float animatedFraction = (float) ((int) (f5 + ((this.A00 - f5) * valueAnimator.getAnimatedFraction())));
        C27801Xq r04 = r3.A0D;
        if (r04 != null) {
            r04.A0C(animatedFraction);
        }
    }
}
