package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class BEF extends AnimatorListenerAdapter {
    public void onAnimationEnd(Animator animator) {
        C18070vi.A0d(animator, 0);
        super.onAnimationEnd(animator);
        animator.start();
    }
}
