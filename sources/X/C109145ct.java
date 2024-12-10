package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.TransitionDrawable;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.5ct  reason: invalid class name and case insensitive filesystem */
public class C109145ct extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    public C109145ct(Object obj, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = i;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationEnd(animator);
            if (!this.A03) {
                GetCredential getCredential = (GetCredential) this.A02;
                getCredential.A04.setVisibility(8);
                getCredential.A05.setVisibility(8);
                getCredential.A03.resetTransition();
                return;
            }
            return;
        }
        ((AnonymousClass7M6) this.A02).A01.setVisibility(this.A01);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationStart(animator);
            boolean z = this.A03;
            GetCredential getCredential = (GetCredential) this.A02;
            TransitionDrawable transitionDrawable = getCredential.A03;
            if (z) {
                transitionDrawable.startTransition(300);
                getCredential.A04.setVisibility(0);
                getCredential.A05.setVisibility(0);
                getCredential.A05.setLayoutDirection(0);
                if (getCredential.A04.getY() == 0.0f) {
                    getCredential.A04.setY((float) (-this.A01));
                    return;
                }
                return;
            }
            transitionDrawable.reverseTransition(300);
        } else if (this.A03) {
            ((AnonymousClass7M6) this.A02).A01.setVisibility(0);
        }
    }
}
