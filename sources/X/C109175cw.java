package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.5cw  reason: invalid class name and case insensitive filesystem */
public class C109175cw extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C109175cw(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A01 = i;
        this.A06 = obj;
        this.A02 = i2;
        this.A04 = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A01 != 0) {
            ((View) this.A06).setTranslationX(0.0f);
        }
        if (this.A02 != 0) {
            ((View) this.A06).setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        int i = this.A00;
        C108965cb.A1M(this.A04);
        Object obj = this.A03;
        if (i != 0) {
            C113685nY r2 = (C113685nY) obj;
            C42011xT r1 = (C42011xT) this.A05;
            r2.A08(r1);
            r2.A05.remove(r1);
            r2.A0N();
            return;
        }
        C37981qV r22 = (C37981qV) obj;
        C42011xT r12 = (C42011xT) this.A05;
        r22.A08(r12);
        r22.A04.remove(r12);
        if (!r22.A0F()) {
            r22.A07();
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            ((C113685nY) this.A03).A08 = true;
        }
    }
}
