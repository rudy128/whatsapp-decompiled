package X;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.1ZA  reason: invalid class name */
public abstract class AnonymousClass1ZA {
    public static boolean A04(int i) {
        if (i == 0 || AnonymousClass1Z2.A00(i) <= 0.5d) {
            return false;
        }
        return true;
    }

    public static int A00(float f, int i, int i2) {
        return AnonymousClass1Z2.A05(AnonymousClass1Z2.A06(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static int A01(Context context, int i, int i2) {
        TypedValue A01 = AnonymousClass1Z9.A01(context, i);
        if (A01 == null) {
            return i2;
        }
        int i3 = A01.resourceId;
        if (i3 != 0) {
            return C19740yt.A00(context, i3);
        }
        return A01.data;
    }

    public static int A02(Context context, String str, int i) {
        TypedValue A02 = AnonymousClass1Z9.A02(context, str, i);
        int i2 = A02.resourceId;
        if (i2 != 0) {
            return C19740yt.A00(context, i2);
        }
        return A02.data;
    }

    public static int A03(View view, int i) {
        Context context = view.getContext();
        TypedValue A02 = AnonymousClass1Z9.A02(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = A02.resourceId;
        if (i2 != 0) {
            return C19740yt.A00(context, i2);
        }
        return A02.data;
    }
}
