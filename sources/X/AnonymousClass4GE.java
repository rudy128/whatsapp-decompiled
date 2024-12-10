package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* renamed from: X.4GE  reason: invalid class name */
public abstract class AnonymousClass4GE {
    public static final AnimationSet A00(boolean z) {
        AnonymousClass1D6 A01;
        AnonymousClass1D6 A012;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (z) {
            A01 = AnonymousClass1D6.A01(valueOf, valueOf2);
        } else {
            A01 = AnonymousClass1D6.A01(valueOf2, valueOf);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(AnonymousClass000.A04(A01.first), AnonymousClass000.A04(A01.second));
        alphaAnimation.setDuration(160);
        if (z) {
            A012 = AnonymousClass1D6.A01(valueOf, valueOf2);
        } else {
            A012 = AnonymousClass1D6.A01(valueOf2, valueOf);
        }
        float A04 = AnonymousClass000.A04(A012.first);
        float A042 = AnonymousClass000.A04(A012.second);
        ScaleAnimation scaleAnimation = new ScaleAnimation(A04, A042, A04, A042, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(160);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(160);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }
}
