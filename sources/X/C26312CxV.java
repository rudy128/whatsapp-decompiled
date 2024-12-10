package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.CxV  reason: case insensitive filesystem */
public class C26312CxV implements TimeInterpolator, Interpolator {
    public final int A00;

    public C26312CxV(int i) {
        this.A00 = i;
    }

    public float getInterpolation(float f) {
        if (1 - this.A00 == 0) {
            return f * f * f * f * f;
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
