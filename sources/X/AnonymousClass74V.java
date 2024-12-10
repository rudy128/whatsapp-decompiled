package X;

import android.animation.Animator;
import com.whatsapp.calling.callgrid.view.PipViewContainer;

/* renamed from: X.74V  reason: invalid class name */
public class AnonymousClass74V implements Animator.AnimatorListener {
    public final /* synthetic */ PipViewContainer A00;
    public final /* synthetic */ AnonymousClass70A A01;
    public final /* synthetic */ boolean A02;

    public void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass74V(PipViewContainer pipViewContainer, AnonymousClass70A r2, boolean z) {
        this.A00 = pipViewContainer;
        this.A02 = z;
        this.A01 = r2;
    }

    public static void A00(AnonymousClass74V r3) {
        PipViewContainer pipViewContainer = r3.A00;
        pipViewContainer.A0L = false;
        if (!r3.A02) {
            PipViewContainer.A04(pipViewContainer, (AnonymousClass70A) null);
            pipViewContainer.setVisibility(8);
            pipViewContainer.setScaleX(1.0f);
            pipViewContainer.setScaleY(1.0f);
            return;
        }
        pipViewContainer.setAlpha(1.0f);
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass70A r1;
        if (this.A02 && (r1 = this.A01) != null) {
            PipViewContainer.A04(this.A00, r1);
        }
    }

    public void onAnimationCancel(Animator animator) {
        A00(this);
    }

    public void onAnimationEnd(Animator animator) {
        A00(this);
    }
}
