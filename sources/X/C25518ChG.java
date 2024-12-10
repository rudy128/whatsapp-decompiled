package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* renamed from: X.ChG  reason: case insensitive filesystem */
public class C25518ChG {
    public final AnimatorSet A00;
    public final Animation A01;

    public C25518ChG(Animator animator) {
        this.A01 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.play(animator);
    }

    public C25518ChG(Animation animation) {
        this.A01 = animation;
        this.A00 = null;
    }
}
