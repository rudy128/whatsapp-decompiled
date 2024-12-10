package X;

import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;

/* renamed from: X.Crm  reason: case insensitive filesystem */
public final class C26072Crm {
    public static final C26072Crm A00 = new Object();

    public static final float A00(RectF rectF, Layout layout, Spannable spannable, TextPaint textPaint, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        Object absoluteSizeSpan;
        StaticLayout staticLayout;
        int height;
        float f5;
        boolean z4;
        boolean z5;
        float f6 = f;
        while (f <= f2) {
            float f7 = (f + f2) / 2.0f;
            if (z3) {
                absoluteSizeSpan = new RelativeSizeSpan(f7);
            } else {
                absoluteSizeSpan = new AbsoluteSizeSpan(C22339B3q.A01(f7));
            }
            boolean z6 = false;
            Spannable spannable2 = spannable;
            spannable2.setSpan(absoluteSizeSpan, i2, i3, 0);
            Layout.Alignment alignment = layout.getAlignment();
            C18070vi.A0X(alignment);
            RectF rectF2 = rectF;
            int A01 = C22339B3q.A01(rectF2.right);
            int i4 = i;
            int i5 = i4;
            TextPaint textPaint2 = textPaint;
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(spannable2, 0, spannable2.length(), textPaint2, A01).setAlignment(alignment);
                if (i4 == -1) {
                    i5 = Integer.MAX_VALUE;
                }
                staticLayout = alignment2.setMaxLines(i5).build();
                C18070vi.A0b(staticLayout);
                if (staticLayout == null) {
                    height = 0;
                }
                height = staticLayout.getHeight();
            } else {
                staticLayout = new StaticLayout(spannable2, textPaint2, A01, alignment, 1.0f, 0.0f, false);
                height = staticLayout.getHeight();
            }
            if (z3) {
                f5 = f3 * f7;
            } else {
                f5 = f7;
            }
            boolean A1A = C108975cc.A1A((f5 > ((float) staticLayout.getWidth()) ? 1 : (f5 == ((float) staticLayout.getWidth()) ? 0 : -1)));
            float f8 = (float) height;
            boolean A1A2 = C108975cc.A1A((f5 > f8 ? 1 : (f5 == f8 ? 0 : -1)));
            if (z || (((float) staticLayout.getWidth()) <= rectF2.right && A1A)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 || (f8 <= rectF2.bottom && A1A2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i <= 0 || staticLayout.getLineCount() <= i4) {
                z6 = true;
            }
            if (!z4 || !z5 || !z6) {
                f2 = f7 - f4;
            } else {
                f = f7 + f4;
                f6 = f7;
            }
            spannable2.removeSpan(absoluteSizeSpan);
        }
        return f6;
    }

    public static final int A01(DOZ doz, String str, int i) {
        try {
            return (int) TypedValue.applyDimension(2, A90.A02(str), C108965cb.A08(doz.A00));
        } catch (AnonymousClass9HX e) {
            C25913CoX.A00(doz, "ResizeToFitSpanStyle", "Error parsing text size value", e);
            return i;
        }
    }
}
