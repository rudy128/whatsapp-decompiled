package X;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: X.1rb  reason: invalid class name and case insensitive filesystem */
public class C38611rb implements C38591rZ {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        C39801tf r2 = (C39801tf) obj;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00.get();
        if (lottieAnimationView != null) {
            lottieAnimationView.setComposition(r2);
        }
    }

    public C38611rb(LottieAnimationView lottieAnimationView) {
        this.A00 = new WeakReference(lottieAnimationView);
    }
}
