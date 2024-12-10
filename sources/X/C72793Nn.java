package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: X.3Nn  reason: invalid class name and case insensitive filesystem */
public class C72793Nn extends ImageSpan {
    public WeakReference A00;

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (drawable = (Drawable) weakReference.get()) == null) {
            drawable = getDrawable();
            this.A00 = AnonymousClass3MW.A0z(drawable);
        }
        C72483Me.A0i(canvas, paint, drawable, f, i4);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (drawable = (Drawable) weakReference.get()) == null) {
            drawable = getDrawable();
            this.A00 = AnonymousClass3MW.A0z(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
