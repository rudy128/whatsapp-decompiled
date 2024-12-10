package X;

import android.transition.Transition;

public class D4U implements Transition.TransitionListener {
    public final /* synthetic */ BLT A00;
    public final /* synthetic */ Runnable A01;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }

    public D4U(BLT blt, Runnable runnable) {
        this.A00 = blt;
        this.A01 = runnable;
    }

    public void onTransitionEnd(Transition transition) {
        this.A01.run();
    }
}
