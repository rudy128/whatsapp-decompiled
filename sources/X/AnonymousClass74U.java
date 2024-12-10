package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;

/* renamed from: X.74U  reason: invalid class name */
public final class AnonymousClass74U implements Animator.AnimatorListener {
    public final /* synthetic */ ObjectAnimator A00;
    public final /* synthetic */ AnonymousClass7DY A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ boolean A03;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public AnonymousClass74U(ObjectAnimator objectAnimator, AnonymousClass7DY r2, Runnable runnable, boolean z) {
        this.A02 = runnable;
        this.A03 = z;
        this.A01 = r2;
        this.A00 = objectAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        this.A02.run();
        if (this.A03) {
            AnonymousClass7DY r4 = this.A01;
            C160978Av r3 = r4.A0K;
            if (r3 == null) {
                C18070vi.A11("camera");
                throw null;
            } else {
                r3.setCameraSwitchedCallback(new AnonymousClass7RL(this.A00, r4, 17));
            }
        } else {
            this.A00.start();
        }
    }
}
