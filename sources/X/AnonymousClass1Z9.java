package X;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: X.1Z9  reason: invalid class name */
public abstract class AnonymousClass1Z9 {
    public static TypedValue A01(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int A00(Context context, int i, int i2) {
        TypedValue A01 = A01(context, i);
        if (A01 == null || A01.type != 16) {
            return i2;
        }
        return A01.data;
    }

    public static TypedValue A02(Context context, String str, int i) {
        TypedValue A01 = A01(context, i);
        if (A01 != null) {
            return A01;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    public static boolean A03(Context context, int i, boolean z) {
        TypedValue A01 = A01(context, i);
        if (A01 == null || A01.type != 18) {
            return z;
        }
        if (A01.data != 0) {
            return true;
        }
        return false;
    }
}
