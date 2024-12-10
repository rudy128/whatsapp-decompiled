package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.6Wl  reason: invalid class name and case insensitive filesystem */
public abstract class C123946Wl {
    public static final void A00(C133536ov r3) {
        C18070vi.A0d(r3, 0);
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new OvershootInterpolator(1.2f));
        C109195cy.A02(ofFloat, r3, 20);
        C1411074h.A00(ofFloat, r3, 17);
        ofFloat.start();
    }
}
