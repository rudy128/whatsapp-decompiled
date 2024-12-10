package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.6Wp  reason: invalid class name and case insensitive filesystem */
public abstract class C123986Wp {
    public static final ValueAnimator A00(View view, int i) {
        int dimensionPixelSize = AnonymousClass000.A0Y(view).getDimensionPixelSize(2131169084);
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        ofFloat.setDuration(ofFloat.getDuration());
        ofFloat.addUpdateListener(new C1410874f(view, AnonymousClass000.A0Y(view).getDimensionPixelSize(2131169151), AnonymousClass000.A0Y(view).getDimensionPixelSize(2131169085) + i, dimensionPixelSize, 1));
        return ofFloat;
    }
}
