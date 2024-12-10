package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.os.Handler;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class BEI extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;

    public BEI(C26155CtN ctN, int i, int i2) {
        this.A00 = i2;
        this.A02 = ctN;
        this.A01 = i;
    }

    public void onAnimationEnd(Animator animator) {
        ((C26155CtN) this.A02).A0A(this.A01);
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        C26155CtN ctN = (C26155CtN) this.A02;
        Handler handler = C26155CtN.A0M;
        E2T e2t = ctN.A0K;
        int i = ctN.A0B;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) e2t;
        snackbarContentLayout.A02.setAlpha(1.0f);
        long j = (long) i;
        ViewPropertyAnimator duration = snackbarContentLayout.A02.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.A03;
        duration.setInterpolator(timeInterpolator).setStartDelay(0).start();
        if (snackbarContentLayout.A01.getVisibility() == 0) {
            snackbarContentLayout.A01.setAlpha(1.0f);
            snackbarContentLayout.A01.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0).start();
        }
    }
}
