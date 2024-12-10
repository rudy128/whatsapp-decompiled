package X;

import android.os.Build;
import android.util.DisplayMetrics;

/* renamed from: X.6VK  reason: invalid class name */
public abstract class AnonymousClass6VK {
    public static float A00(DisplayMetrics displayMetrics, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AnonymousClass6VJ.A00(displayMetrics, f);
        }
        float f2 = displayMetrics.scaledDensity;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }
}
