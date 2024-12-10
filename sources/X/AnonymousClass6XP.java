package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.6XP  reason: invalid class name */
public abstract class AnonymousClass6XP {
    public static final ValueAnimator A00(View view, Runnable runnable, int i) {
        int height = view.getHeight();
        int[] A1W = C108945cZ.A1W();
        A1W[0] = height;
        A1W[1] = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
        C1411074h.A00(ofInt, view, 25);
        ofInt.setInterpolator(new AnonymousClass1YX());
        ofInt.setDuration(((long) C108945cZ.A05(height, i)) / 8);
        C109195cy.A02(ofInt, runnable, 27);
        return ofInt;
    }
}
