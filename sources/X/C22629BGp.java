package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: X.BGp  reason: case insensitive filesystem */
public final class C22629BGp extends Fade {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ Cb1 A01;

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        C18070vi.A0d(viewGroup, 0);
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        C18070vi.A0z(createAnimator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) createAnimator;
        Cb1 cb1 = this.A01;
        if (cb1.A01 != 0) {
            Window window = this.A00;
            objectAnimator.addUpdateListener(new C26320Cxd(objectAnimator, window, cb1, window.getStatusBarColor()));
            int navigationBarColor = window.getNavigationBarColor();
            int i = cb1.A00;
            Number number = (Number) objectAnimator.getAnimatedValue();
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            window.setNavigationBarColor(AnonymousClass1Z2.A03(f, i, navigationBarColor));
        }
        return objectAnimator;
    }

    public C22629BGp(Window window, Cb1 cb1) {
        this.A01 = cb1;
        this.A00 = window;
    }
}
