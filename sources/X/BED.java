package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

public final class BED extends Animator {
    public int A00;
    public boolean A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public BED(Animator animator, DOZ doz, int i) {
        C18070vi.A0d(animator, 2);
        C26272CwJ.A05(animator, doz);
        this.A05 = animator;
        this.A04 = C26258Cw3.A01(animator);
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new BEN(this, i));
        }
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        C18070vi.A0d(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    public void start() {
        this.A00 = 0;
        this.A01 = false;
        long j = this.A02;
        if (j != 0) {
            C26258Cw3.A03(this.A05, j);
        }
        this.A05.start();
    }

    public void cancel() {
        this.A05.cancel();
    }

    public void end() {
        this.A05.end();
    }

    public long getDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return j * ((long) i);
        }
        return -1;
    }

    public long getStartDelay() {
        return this.A02;
    }

    public long getTotalDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return (j * ((long) i)) + this.A02;
        }
        return -1;
    }

    public boolean isPaused() {
        return this.A05.isPaused();
    }

    public boolean isRunning() {
        return this.A05.isRunning();
    }

    public void pause() {
        this.A05.pause();
    }

    public void resume() {
        this.A05.resume();
    }

    public static final void A00(BED bed, C22821Di r2) {
        ArrayList<Animator.AnimatorListener> listeners = bed.getListeners();
        if (listeners != null) {
            for (Object next : C29431cG.A0t(listeners)) {
                C18070vi.A0b(next);
                r2.invoke(next);
            }
        }
    }

    public Animator setDuration(long j) {
        return this;
    }

    public void setStartDelay(long j) {
        this.A02 = j;
    }
}
