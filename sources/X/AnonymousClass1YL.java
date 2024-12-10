package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1YL  reason: invalid class name */
public abstract class AnonymousClass1YL {
    public static final HashMap A00 = AnonymousClass1D7.A07(new AnonymousClass1D6(2130970299, new Integer[]{2131103345, 2131103342}), new AnonymousClass1D6(2130970343, new Integer[]{2131103232, 2131103220}), new AnonymousClass1D6(2130970830, new Integer[]{2131103383, 2131103221}), new AnonymousClass1D6(2130971617, new Integer[]{2131103394, 2131103221}), new AnonymousClass1D6(2130968843, new Integer[]{2131103383, 2131103221}), new AnonymousClass1D6(2130969232, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130970098, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130971983, new Integer[]{2131103394, 2131103221}), new AnonymousClass1D6(2130970064, new Integer[]{2131103271, 2131103284}), new AnonymousClass1D6(2130970060, new Integer[]{2131103394, 2131103221}), new AnonymousClass1D6(2130971848, new Integer[]{2131103280, 2131103275}), new AnonymousClass1D6(2130971847, new Integer[]{2131103272, 2131103281}), new AnonymousClass1D6(2130969226, new Integer[]{2131103232, 2131103220}), new AnonymousClass1D6(2130971874, new Integer[]{2131103271, 2131103284}), new AnonymousClass1D6(2130971875, new Integer[]{2131103272, 2131103281}), new AnonymousClass1D6(2130971861, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130971746, new Integer[]{2131103398, 2131103275}), new AnonymousClass1D6(2130971972, new Integer[]{2131103226, 2131103221}), new AnonymousClass1D6(2130971876, new Integer[]{2131103281, 2131103271}), new AnonymousClass1D6(2130971137, new Integer[]{2131103383, 2131103221}), new AnonymousClass1D6(2130971138, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130971139, new Integer[]{2131103383, 2131103221}), new AnonymousClass1D6(2130969251, new Integer[]{2131103383, 2131103220}), new AnonymousClass1D6(2130971952, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130970828, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130970488, new Integer[]{2131103383, 2131103220}), new AnonymousClass1D6(2130969438, new Integer[]{2131103220, 2131103221}), new AnonymousClass1D6(2130969197, new Integer[]{2131103383, 2131103221}), new AnonymousClass1D6(2130971087, new Integer[]{2131103220, 2131103231}), new AnonymousClass1D6(2130971968, new Integer[]{2131103394, 2131103231}), new AnonymousClass1D6(2130970057, new Integer[]{2131103277, 2131103275}), new AnonymousClass1D6(2130971099, new Integer[]{2131103383, 2131103221}), new AnonymousClass1D6(2130970058, new Integer[]{2131103221, 2131103226}), new AnonymousClass1D6(2130971969, new Integer[]{2131103271, 2131103283}), new AnonymousClass1D6(2130968627, new Integer[]{2131103280, 2131103275}), new AnonymousClass1D6(2130971985, new Integer[]{2131103234, 2131103385}), new AnonymousClass1D6(2130971109, new Integer[]{2131103228, 2131103220}), new AnonymousClass1D6(2130969231, new Integer[]{2131103278, 2131103278}));
    public static final HashMap A01 = new HashMap();

    public static final int A00(Context context, int i, int i2) {
        return A01(context, i, i2, C22891Dp.A01);
    }

    public static final int A01(Context context, int i, int i2, boolean z) {
        Integer num;
        int intValue;
        String str;
        if (context == null) {
            str = "ColorHelper/getThemeColorResourceId context is null";
        } else if (context instanceof Application) {
            str = "ColorHelper/getThemeColorResourceId context is AppContext";
        } else {
            if (C22891Dp.A02) {
                if (z) {
                    int i3 = context.getResources().getConfiguration().uiMode & 48;
                    Integer[] numArr = (Integer[]) A00.get(Integer.valueOf(i));
                    if (i3 == 32) {
                        if (numArr != null) {
                            num = AnonymousClass00R.A01;
                        }
                    } else if (numArr != null) {
                        num = AnonymousClass00R.A00;
                    }
                    Integer num2 = numArr[num.intValue()];
                    if (!(num2 == null || (intValue = num2.intValue()) == 0)) {
                        return intValue;
                    }
                }
                try {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    if (theme != null) {
                        theme.resolveAttribute(i, typedValue, true);
                    }
                    int i4 = typedValue.resourceId;
                    if (i4 != 0) {
                        return i4;
                    }
                    String format = String.format(Locale.US, "Color attr not found on provided context Theme: %s", Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
                    C18070vi.A0X(format);
                    Log.e(format);
                    return i2;
                } catch (Exception unused) {
                    return i2;
                }
            }
            return i2;
        }
        Log.w(str);
        return i2;
    }

    public static final boolean A02(int i) {
        boolean z = false;
        if (Color.alpha(i) == 255) {
            z = true;
        }
        C17960vV.A0G(z, "Color must be opaque!");
        if (i == -16051174) {
            return false;
        }
        if (i == -1 || AnonymousClass1Z2.A01(-1, i) < AnonymousClass1Z2.A01(-16777216, i)) {
            return true;
        }
        return false;
    }
}
