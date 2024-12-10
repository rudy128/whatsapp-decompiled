package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.03T  reason: invalid class name */
public abstract class AnonymousClass03T {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final int[] A01 = {16842912};
    public static final int[] A02 = {-16842910};
    public static final int[] A03 = new int[0];
    public static final int[] A04 = {16842908};
    public static final int[] A05 = {16842919};
    public static final int[] A06 = new int[1];

    public static int A02(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A03(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        C002401c r0 = new C002401c(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r0.A01(0);
        } finally {
            r0.A02.recycle();
        }
    }

    public static void A04(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C002501d.A09);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int A00(Context context, float f, int i) {
        int A022 = A02(context, i);
        return AnonymousClass1Z2.A06(A022, Math.round(((float) Color.alpha(A022)) * f));
    }

    public static int A01(Context context, int i) {
        ColorStateList A032 = A03(context, i);
        if (A032 != null && A032.isStateful()) {
            return A032.getColorForState(A02, A032.getDefaultColor());
        }
        ThreadLocal threadLocal = A00;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        return A00(context, typedValue.getFloat(), i);
    }
}
