package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.CxU  reason: case insensitive filesystem */
public class C26311CxU implements TimeInterpolator {
    public final Interpolator A00 = C29111bd.A00(0.5f, 0.0f, 0.5f, 1.0f);

    public float getInterpolation(float f) {
        if (f < 0.5f) {
            return this.A00.getInterpolation(f * 2.0f);
        }
        return 1.0f - this.A00.getInterpolation((f - 0.5f) * 2.0f);
    }
}
