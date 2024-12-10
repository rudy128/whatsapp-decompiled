package X;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.02p  reason: invalid class name and case insensitive filesystem */
public abstract class C005902p {
    public static final Rect A00 = new Rect();
    public static final int[] A01 = {16842912};
    public static final int[] A02 = new int[0];

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return AnonymousClass0MU.A00(C27831Xu.A01(drawable));
        }
        Insets A002 = AnonymousClass0DE.A00(drawable);
        return new Rect(A002.left, A002.top, A002.right, A002.bottom);
    }

    public static void A02(Drawable drawable) {
        String str;
        int[] iArr;
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            str = "android.graphics.drawable.VectorDrawable";
        } else if (i >= 29 && i < 31) {
            str = "android.graphics.drawable.ColorStateListDrawable";
        } else {
            return;
        }
        if (str.equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                iArr = A01;
            } else {
                iArr = A02;
            }
            drawable.setState(iArr);
            drawable.setState(state);
        }
    }
}
