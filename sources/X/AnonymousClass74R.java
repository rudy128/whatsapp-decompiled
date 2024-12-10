package X;

import android.animation.Animator;
import android.view.View;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.74R  reason: invalid class name */
public class AnonymousClass74R implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass74R(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 == 0) {
            ((Animator) this.A01).start();
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C1407172r r1 = (C1407172r) this.A01;
                r1.A00 = 1.0f;
                WDSButton wDSButton = r1.A01;
                if (wDSButton != null) {
                    wDSButton.postDelayed(r1.A02, 2000);
                    return;
                }
                return;
            default:
                C117015z4 r0 = (C117015z4) this.A01;
                C117015z4.A02(r0);
                View view = r0.A0J;
                if (view != null) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
