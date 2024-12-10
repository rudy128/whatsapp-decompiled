package X;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.KeyboardPopupLayout;

public final class A9D implements Animator.AnimatorListener {
    public final /* synthetic */ LottieAnimationView A00;
    public final /* synthetic */ KeyboardPopupLayout A01;
    public final /* synthetic */ AnonymousClass4X0 A02;
    public final /* synthetic */ AnonymousClass205 A03;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public A9D(LottieAnimationView lottieAnimationView, KeyboardPopupLayout keyboardPopupLayout, AnonymousClass4X0 r3, AnonymousClass205 r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = keyboardPopupLayout;
        this.A00 = lottieAnimationView;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass4X0 r4 = this.A02;
        r4.A00.A0K(new C70833Cr((Object) r4, (Object) this.A03, (Object) this.A01, (Object) this.A00, 13), 250);
    }
}
