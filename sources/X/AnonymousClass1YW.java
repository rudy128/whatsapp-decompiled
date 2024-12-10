package X;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.1YW  reason: invalid class name */
public abstract class AnonymousClass1YW {
    public static final TimeInterpolator A00 = new DecelerateInterpolator();
    public static final TimeInterpolator A01 = new AnonymousClass1YY();
    public static final TimeInterpolator A02 = new AnonymousClass1YX();
    public static final TimeInterpolator A03 = new LinearInterpolator();
    public static final TimeInterpolator A04 = new C23621Gz();

    public static float A00(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }
}
