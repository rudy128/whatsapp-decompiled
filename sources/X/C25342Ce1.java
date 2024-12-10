package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.Ce1  reason: case insensitive filesystem */
public abstract class C25342Ce1 {
    public static final float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, C108965cb.A08(context));
    }

    public static final float A01(Context context, float f) {
        DisplayMetrics A08 = C108965cb.A08(context);
        C18070vi.A0X(A08);
        return f / A08.density;
    }
}
