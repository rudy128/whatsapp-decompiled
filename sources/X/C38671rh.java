package X;

import android.animation.ValueAnimator;

/* renamed from: X.1rh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38671rh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C38631rd A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C38631rd r2 = this.A00;
        C49342Qc r1 = r2.A0D;
        if (r1 == null) {
            r1 = AnonymousClass9U1.A00;
        }
        if (r1 == C49342Qc.ENABLED) {
            r2.invalidateSelf();
            return;
        }
        BN4 bn4 = r2.A0L;
        if (bn4 != null) {
            bn4.A0A(r2.A0d.A00());
        }
    }

    public /* synthetic */ C38671rh(C38631rd r1) {
        this.A00 = r1;
    }
}
