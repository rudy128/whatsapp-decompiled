package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* renamed from: X.1ZD  reason: invalid class name */
public abstract class AnonymousClass1ZD {
    public static final int[] A00 = {16842910, 16842919};
    public static final int[] A01 = {16842908};
    public static final int[] A02 = {16842919};
    public static final int[] A03 = {16842913, 16842919};
    public static final int[] A04 = {16842913};

    public static ColorStateList A01(ColorStateList colorStateList) {
        int[] iArr = A01;
        return new ColorStateList(new int[][]{A04, iArr, StateSet.NOTHING}, new int[]{A00(colorStateList, A03), A00(colorStateList, iArr), A00(colorStateList, A02)});
    }

    public static ColorStateList A02(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(A00, 0)) != 0) {
            Log.w("RippleUtils", "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static int A00(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return AnonymousClass1Z2.A06(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
