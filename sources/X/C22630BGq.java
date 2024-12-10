package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Map;

/* renamed from: X.BGq  reason: case insensitive filesystem */
public final class C22630BGq extends Fade {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Window A01;
    public final /* synthetic */ Cb1 A02;

    public void captureStartValues(TransitionValues transitionValues) {
        C18070vi.A0d(transitionValues, 0);
        super.captureStartValues(transitionValues);
        float f = this.A00;
        if (f != 0.0f) {
            Map map = transitionValues.values;
            C18070vi.A0W(map);
            map.put("android:fade:transitionAlpha", Float.valueOf(f));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C18070vi.A0d(viewGroup, 0);
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        C18070vi.A0z(createAnimator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) createAnimator;
        Cb1 cb1 = this.A02;
        if (cb1.A03 != 0) {
            objectAnimator.addUpdateListener(new C26319Cxc(objectAnimator, this.A01, cb1, this.A00));
        }
        return objectAnimator;
    }

    public C22630BGq(Window window, Cb1 cb1, float f) {
        this.A00 = f;
        this.A02 = cb1;
        this.A01 = window;
    }
}
