package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.5cv  reason: invalid class name and case insensitive filesystem */
public class C109165cv extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C109165cv(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((AnonymousClass1HM) this.A02).BlO((View) this.A03);
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ((AnonymousClass1HM) this.A02).BlP((View) this.A03);
                return;
            case 1:
                super.onAnimationEnd(animator);
                C38631rd r2 = (C38631rd) this.A02;
                ((ImageView) this.A03).setImageDrawable(r2);
                r2.A0d.setRepeatCount(-1);
                r2.start();
                return;
            default:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                C1407472v r3 = (C1407472v) this.A03;
                AnonymousClass1JD r22 = r3.A04;
                boolean isEmpty = r22.isEmpty();
                Object obj = this.A02;
                if (isEmpty) {
                    r22.addFirst(AnonymousClass1D6.A01(obj, this.A01));
                } else if (obj == AnonymousClass6RF.CONNECTING) {
                    r3.A02.invoke();
                }
                C1407472v.A02(r3);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((AnonymousClass1HM) this.A02).BlQ();
        }
    }
}
