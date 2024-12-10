package X;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: X.1rc  reason: invalid class name and case insensitive filesystem */
public class C38621rc implements C38591rZ {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00.get();
        if (lottieAnimationView != null) {
            int i = lottieAnimationView.A00;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            C38591rZ r0 = lottieAnimationView.A02;
            if (r0 == null) {
                r0 = LottieAnimationView.A0E;
            }
            r0.onResult(obj);
        }
    }

    public C38621rc(LottieAnimationView lottieAnimationView) {
        this.A00 = new WeakReference(lottieAnimationView);
    }
}
