package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.Cxa  reason: case insensitive filesystem */
public class C26317Cxa implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C26317Cxa(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A00) {
            case 0:
                C199029zJ r1 = (C199029zJ) this.A01;
                C25974Cph.A00((C23736Boh) this.A02, r1, (E8A) this.A03);
                return;
            case 1:
                ((C23511BiR) this.A01).A0S((View) this.A02, (CoordinatorLayout) this.A03, AnonymousClass000.A0M(valueAnimator.getAnimatedValue()));
                return;
            default:
                C110585gH.A00((View) this.A02, (View) this.A03, (C110585gH) this.A01, valueAnimator.getAnimatedFraction());
                return;
        }
    }
}
