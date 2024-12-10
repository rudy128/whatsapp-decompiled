package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class BEL extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BEL(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 == 0) {
            C25972Cpf cpf = (C25972Cpf) this.A02;
            cpf.A00.A08(1.0f);
            C22672BJn.A03((View) this.A03, cpf);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        TransitionValues transitionValues = (TransitionValues) this.A03;
        transitionValues.view.setAlpha(1.0f);
        CZN czn = (CZN) this.A02;
        if (((float) czn.A07) / ((float) czn.A06) < 1.0f || ((float) czn.A04) / ((float) czn.A05) < 1.0f) {
            ViewParent parent = transitionValues.view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            }
        }
    }
}
