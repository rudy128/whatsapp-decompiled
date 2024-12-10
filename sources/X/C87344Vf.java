package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.4Vf  reason: invalid class name and case insensitive filesystem */
public abstract class C87344Vf {
    public static int A01(Context context, WindowManager windowManager) {
        int i;
        DisplayMetrics displayMetrics;
        if (Build.VERSION.SDK_INT < 30) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.densityDpi;
        } else {
            i = context.getResources().getConfiguration().densityDpi;
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        float f = displayMetrics.density;
        if (i >= 320) {
            return (int) (f * 25.0f);
        }
        if (i >= 240) {
            return 38;
        }
        if (i >= 160) {
            return 25;
        }
        return 19;
    }

    public static int A00(Context context) {
        float A00 = C72463Mc.A00(context);
        float f = 2.0f;
        if (((float) C72453Mb.A09(context)) / A00 >= 360.0f) {
            f = 7.0f;
        }
        return Math.round(f * A00);
    }
}
