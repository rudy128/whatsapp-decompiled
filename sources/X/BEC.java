package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class BEC extends Animator {
    public long A00;
    public long A01;
    public final List A02;
    public final Integer A03;

    public void cancel() {
        for (Animator cancel : this.A02) {
            cancel.cancel();
        }
        A00(this, new C27930DoS(this));
    }

    public void end() {
        for (Animator end : this.A02) {
            end.end();
        }
    }

    public long getDuration() {
        return this.A00;
    }

    public long getStartDelay() {
        return this.A01;
    }

    public long getTotalDuration() {
        long j = this.A00;
        if (!AnonymousClass000.A1P((j > -1 ? 1 : (j == -1 ? 0 : -1)))) {
            return j + this.A01;
        }
        return j;
    }

    public boolean isRunning() {
        for (Animator isRunning : this.A02) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public boolean isStarted() {
        for (Animator isStarted : this.A02) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        for (Animator interpolator : this.A02) {
            interpolator.setInterpolator(timeInterpolator);
        }
    }

    public void setStartDelay(long j) {
        this.A01 = j;
        for (Animator animator : this.A02) {
            if (animator instanceof BEC) {
                animator.setStartDelay(j);
            } else {
                C26258Cw3.A03(animator, j);
            }
        }
    }

    public void start() {
        List<Animator> list = this.A02;
        for (Animator start : list) {
            start.start();
        }
        A00(this, new C27931DoT(this));
        if (list.isEmpty()) {
            A00(this, new C27932DoU(this));
        }
    }

    public BEC(Integer num, List list) {
        Object next;
        this.A03 = num;
        this.A02 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long A012 = C26258Cw3.A01((Animator) it.next());
            if (A012 == -1) {
                this.A00 = -1;
                break;
            }
            this.A00 = Math.max(this.A00, A012);
        }
        if (this.A00 != -1 && (!this.A02.isEmpty())) {
            int intValue = this.A03.intValue();
            if (intValue == 0 || intValue == 2) {
                Iterator it2 = this.A02.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long A013 = C26258Cw3.A01((Animator) next);
                        do {
                            Object next2 = it2.next();
                            long A014 = C26258Cw3.A01((Animator) next2);
                            if (A013 < A014) {
                                next = next2;
                                A013 = A014;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    throw BE6.A14();
                }
            } else if (intValue == 1) {
                next = C29431cG.A0d(this.A02);
            } else {
                throw AnonymousClass3MW.A14();
            }
            BEQ.A00((Animator) next, this, 5);
        }
    }

    public static final void A00(BEC bec, C22821Di r2) {
        ArrayList<Animator.AnimatorListener> listeners = bec.getListeners();
        if (listeners != null) {
            for (Object next : C29431cG.A0t(listeners)) {
                C18070vi.A0b(next);
                r2.invoke(next);
            }
        }
    }

    public void pause() {
        super.pause();
        if (isPaused()) {
            for (Animator pause : this.A02) {
                pause.pause();
            }
        }
    }

    public void resume() {
        super.resume();
        if (!isPaused()) {
            for (Animator resume : this.A02) {
                resume.resume();
            }
        }
    }

    public Animator setDuration(long j) {
        return this;
    }
}
