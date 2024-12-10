package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;

/* renamed from: X.CoC  reason: case insensitive filesystem */
public abstract class C25900CoC {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int color;
        int defaultColor;
        int colorForState;
        int i = -7829368;
        if (num != null) {
            color = num.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{2130969111});
            color = obtainStyledAttributes.getColor(0, -7829368);
            obtainStyledAttributes.recycle();
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{2130969154});
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
        obtainStyledAttributes2.recycle();
        if (num2 != null) {
            defaultColor = num2.intValue();
        } else if (colorStateList == null) {
            defaultColor = -7829368;
        } else {
            defaultColor = colorStateList.getDefaultColor();
        }
        if (num3 != null) {
            colorForState = num3.intValue();
        } else if (colorStateList == null) {
            colorForState = -7829368;
        } else {
            colorForState = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        if (num4 != null) {
            i = num4.intValue();
        } else if (colorStateList != null) {
            i = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        return new ColorStateList(A00, new int[]{color, defaultColor, colorForState, i});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A07;
        int A072;
        int A06;
        int A062;
        if (num != null) {
            A07 = num.intValue();
        } else {
            A07 = BEA.A07(context.getTheme(), 16843818, -7829368);
        }
        if (num2 != null) {
            A072 = num2.intValue();
        } else {
            A072 = BEA.A07(context.getTheme(), 16842800, -7829368);
        }
        if (num3 != null) {
            A06 = num3.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            A06 = AnonymousClass1Z2.A06(obtainStyledAttributes.getColor(0, -7829368), BE6.A04((float) Color.alpha(A07), 0.25f));
            obtainStyledAttributes.recycle();
        }
        if (num4 != null) {
            A062 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            A062 = AnonymousClass1Z2.A06(obtainStyledAttributes2.getColor(0, -7829368), BE6.A04((float) Color.alpha(A072), 0.25f));
            obtainStyledAttributes2.recycle();
        }
        return new ColorStateList(A00, new int[]{A07, A072, A06, A062});
    }
}
