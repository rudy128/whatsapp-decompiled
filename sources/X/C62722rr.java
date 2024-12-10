package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;

/* renamed from: X.2rr  reason: invalid class name and case insensitive filesystem */
public abstract class C62722rr {
    public static void A00(Object obj) {
        ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
    }

    public static void A01(Object obj, Object obj2) {
        ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
    }

    public static void A02(Object obj, Object obj2) {
        ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
    }
}
