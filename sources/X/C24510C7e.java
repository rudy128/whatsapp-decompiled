package X;

import android.content.Context;
import android.view.WindowMetrics;

/* renamed from: X.C7e  reason: case insensitive filesystem */
public abstract class C24510C7e {
    public static final float A00(Context context, WindowMetrics windowMetrics) {
        try {
            return windowMetrics.getDensity();
        } catch (NoSuchMethodError unused) {
            return C72463Mc.A00(context);
        }
    }
}
