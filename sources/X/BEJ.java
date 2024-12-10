package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;

public class BEJ extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BEJ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            CT2 ct2 = (CT2) this.A01;
            ValueAnimator valueAnimator = ct2.A04;
            if (!valueAnimator.isRunning() && ct2.A02) {
                valueAnimator.start();
                return;
            }
            return;
        }
        ((AnonymousClass00O) this.A02).remove(animator);
        ((AnonymousClass1LG) this.A01).A0A.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            C24931CQe cQe = (C24931CQe) this.A02;
            Handler handler = cQe.A00;
            if (handler == null) {
                handler = C17890vO.A0D();
                cQe.A00 = handler;
            }
            handler.post(cQe.A01);
            return;
        }
        ((AnonymousClass1LG) this.A01).A0A.add(animator);
    }
}
