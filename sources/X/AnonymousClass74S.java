package X;

import android.animation.Animator;
import com.whatsapp.calling.callgrid.view.PipViewContainer;

/* renamed from: X.74S  reason: invalid class name */
public class AnonymousClass74S implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PipViewContainer A01;
    public final /* synthetic */ boolean A02;

    public void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass74S(PipViewContainer pipViewContainer, int i, boolean z) {
        this.A01 = pipViewContainer;
        this.A02 = z;
        this.A00 = i;
    }

    public void onAnimationCancel(Animator animator) {
        PipViewContainer pipViewContainer = this.A01;
        int i = 0;
        pipViewContainer.A0J = false;
        boolean z = this.A02;
        if (z) {
            i = pipViewContainer.A05.y - this.A00;
        }
        pipViewContainer.A01 = i;
        pipViewContainer.A0K = z;
        pipViewContainer.setTranslationX(0.0f);
        pipViewContainer.setTranslationY(0.0f);
        PipViewContainer.A01(pipViewContainer);
    }

    public void onAnimationEnd(Animator animator) {
        PipViewContainer pipViewContainer = this.A01;
        int i = 0;
        pipViewContainer.A0J = false;
        boolean z = this.A02;
        if (z) {
            i = pipViewContainer.A05.y - this.A00;
        }
        pipViewContainer.A01 = i;
        pipViewContainer.A0K = z;
        pipViewContainer.setTranslationX(0.0f);
        pipViewContainer.setTranslationY(0.0f);
        PipViewContainer.A01(pipViewContainer);
    }

    public void onAnimationStart(Animator animator) {
        this.A01.A0J = true;
    }
}
