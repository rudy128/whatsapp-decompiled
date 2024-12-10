package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.1Xu  reason: invalid class name and case insensitive filesystem */
public abstract class C27831Xu {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static int A00(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C60202nZ.A00(drawable);
        }
        if (!A02) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            A02 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                A00 = null;
            }
        }
        return 0;
    }

    public static Drawable A01(Drawable drawable) {
        if (drawable instanceof AnonymousClass3LV) {
            return ((AnonymousClass26s) ((AnonymousClass3LV) drawable)).A00;
        }
        return drawable;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.26s, android.graphics.drawable.Drawable] */
    public static Drawable A02(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof C24271Jn)) {
            return drawable;
        }
        ? drawable2 = new Drawable();
        drawable2.A01 = new AnonymousClass26i(drawable2.A01);
        drawable2.CLU(drawable);
        AnonymousClass26s.A00();
        return drawable2;
    }

    public static void A09(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawable2;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            drawable2 = ((InsetDrawable) drawable).getDrawable();
        } else if (drawable instanceof AnonymousClass3LV) {
            drawable2 = ((AnonymousClass26s) ((AnonymousClass3LV) drawable)).A00;
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    A09(child);
                }
            }
            return;
        } else {
            return;
        }
        A09(drawable2);
    }

    public static boolean A0G(int i, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C60202nZ.A01(i, drawable);
        }
        if (!A03) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                A01 = null;
            }
        }
        return false;
    }

    public static boolean A0H(Drawable drawable) {
        return C62682rn.A02(drawable);
    }

    public static void A03(ColorStateList colorStateList, Drawable drawable) {
        A04(colorStateList, drawable);
    }

    public static void A04(ColorStateList colorStateList, Drawable drawable) {
        drawable.setTintList(colorStateList);
    }

    public static void A05(Resources.Theme theme, Drawable drawable) {
        A06(theme, drawable);
    }

    public static void A06(Resources.Theme theme, Drawable drawable) {
        drawable.applyTheme(theme);
    }

    public static void A07(PorterDuff.Mode mode, Drawable drawable) {
        A08(mode, drawable);
    }

    public static void A08(PorterDuff.Mode mode, Drawable drawable) {
        drawable.setTintMode(mode);
    }

    public static void A0C(Drawable drawable, int i) {
        A0D(drawable, i);
    }

    public static void A0D(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void A0A(Drawable drawable, float f, float f2) {
        A0B(drawable, f, f2);
    }

    public static void A0B(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void A0E(Drawable drawable, int i, int i2, int i3, int i4) {
        A0F(drawable, i, i2, i3, i4);
    }

    public static void A0F(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }
}
