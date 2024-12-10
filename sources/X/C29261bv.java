package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.ActionMode;
import android.widget.TextView;

/* renamed from: X.1bv  reason: invalid class name and case insensitive filesystem */
public abstract class C29261bv {
    public static ActionMode.Callback A00(ActionMode.Callback callback) {
        if (!(callback instanceof C64642v6) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((C64642v6) callback).A00();
    }

    public static ActionMode.Callback A01(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C64642v6) || callback == null) {
            return callback;
        }
        return new C64642v6(callback, textView);
    }

    public static void A03(PorterDuff.Mode mode, TextView textView) {
        if (Build.VERSION.SDK_INT >= 24) {
            C63762te.A03(mode, textView);
        } else if (textView instanceof C27761Xl) {
            ((C27761Xl) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void A04(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C60262nf.A00(textView, i);
        } else if (textView instanceof C27751Xk) {
            ((C27751Xk) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void A08(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void A09(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            C60262nf.A01(textView, i, i2, i3, i4);
        } else if (textView instanceof C27751Xk) {
            ((C27751Xk) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static void A02(ColorStateList colorStateList, TextView textView) {
        C28111Yx.A02(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C63762te.A02(colorStateList, textView);
        } else if (textView instanceof C27761Xl) {
            ((C27761Xl) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void A05(TextView textView, int i) {
        int i2;
        C28111Yx.A00(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C62702rp.A01(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void A06(TextView textView, int i) {
        int i2;
        C28111Yx.A00(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void A07(TextView textView, int i) {
        C28111Yx.A00(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }
}
