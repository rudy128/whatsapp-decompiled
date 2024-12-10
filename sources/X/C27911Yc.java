package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: X.1Yc  reason: invalid class name and case insensitive filesystem */
public final class C27911Yc {
    public final Animator.AnimatorListener A00 = new C27921Yd(this);
    public final ArrayList A01 = new ArrayList();

    public void A00(ValueAnimator valueAnimator, int[] iArr) {
        C27951Yg r1 = new C27951Yg(valueAnimator, iArr);
        valueAnimator.addListener(this.A00);
        this.A01.add(r1);
    }
}
