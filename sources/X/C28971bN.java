package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: X.1bN  reason: invalid class name and case insensitive filesystem */
public abstract class C28971bN {
    public static Method A00;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float A00(Context context, ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C38071qe.A00(viewConfiguration);
        }
        return A02(context, viewConfiguration);
    }

    public static float A01(Context context, ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C38071qe.A01(viewConfiguration);
        }
        return A02(context, viewConfiguration);
    }

    public static float A02(Context context, ViewConfiguration viewConfiguration) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = A00) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int A03(Context context, ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        int i4;
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 34) {
            return C60232nc.A00(viewConfiguration, i, i2, i3);
        }
        InputDevice device = InputDevice.getDevice(i);
        if (device == null || device.getMotionRange(i2, i3) == null) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        if (i3 == 4194304 && i2 == 26) {
            i4 = resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        } else {
            i4 = -1;
        }
        viewConfiguration.getClass();
        if (i4 == -1) {
            return viewConfiguration.getScaledMaximumFlingVelocity();
        }
        if (i4 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i4)) < 0) {
            return Integer.MIN_VALUE;
        }
        return dimensionPixelSize;
    }

    public static int A04(Context context, ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        int i4;
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 34) {
            return C60232nc.A01(viewConfiguration, i, i2, i3);
        }
        InputDevice device = InputDevice.getDevice(i);
        if (device == null || device.getMotionRange(i2, i3) == null) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        if (i3 == 4194304 && i2 == 26) {
            i4 = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        } else {
            i4 = -1;
        }
        viewConfiguration.getClass();
        if (i4 == -1) {
            return viewConfiguration.getScaledMinimumFlingVelocity();
        }
        if (i4 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i4)) < 0) {
            return Integer.MAX_VALUE;
        }
        return dimensionPixelSize;
    }

    public static int A05(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C28981bO.A00(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean A06(Context context, ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C28981bO.A01(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (identifier == 0 || !resources.getBoolean(identifier)) {
            return false;
        }
        return true;
    }
}
