package X;

import android.animation.Animator;

/* renamed from: X.CxP  reason: case insensitive filesystem */
public final class C26306CxP implements Animator.AnimatorListener {
    public final /* synthetic */ C26995DOr A00;
    public final /* synthetic */ boolean A01;

    public void onAnimationRepeat(Animator animator) {
    }

    public C26306CxP(C26995DOr dOr, boolean z) {
        this.A00 = dOr;
        this.A01 = z;
    }

    public void onAnimationCancel(Animator animator) {
        if (!this.A01) {
            C26995DOr dOr = this.A00;
            dOr.A0A = false;
            C26995DOr.A04(dOr, false);
            C28597E9o e9o = dOr.A02;
            if (e9o != null) {
                e9o.CPZ(false);
            }
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A01) {
            C26995DOr dOr = this.A00;
            dOr.A0A = false;
            C26995DOr.A04(dOr, false);
            C28597E9o e9o = dOr.A02;
            if (e9o != null) {
                e9o.CPZ(false);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        C26995DOr dOr = this.A00;
        if (!dOr.A0A && this.A01) {
            dOr.A0A = true;
            C26995DOr.A04(dOr, false);
        }
    }
}
