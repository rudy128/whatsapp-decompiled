package X;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.66I  reason: invalid class name */
public final class AnonymousClass66I extends C42061xY {
    public LottieAnimationView A00;
    public final View A01;

    public void A0B() {
        LottieAnimationView lottieAnimationView = this.A00;
        if (lottieAnimationView != null) {
            C42491yG.A0C(lottieAnimationView, AnonymousClass3Ma.A00(AnonymousClass3MY.A04(lottieAnimationView), 2130968684, 2131099733));
            LottieAnimationView lottieAnimationView2 = this.A00;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.A04();
                return;
            }
        }
        C18070vi.A11("animation");
        throw null;
    }

    public AnonymousClass66I(View view) {
        super(view);
        this.A01 = view;
    }
}
