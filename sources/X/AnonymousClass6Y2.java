package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* renamed from: X.6Y2  reason: invalid class name */
public abstract class AnonymousClass6Y2 {
    public static AnimationSet A00(boolean z) {
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (!z) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(125);
        animationSet.addAnimation(alphaAnimation);
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(75);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(75);
        return animationSet;
    }
}
