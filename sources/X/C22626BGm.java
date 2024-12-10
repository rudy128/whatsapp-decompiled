package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: X.BGm  reason: case insensitive filesystem */
public class C22626BGm extends ReplacementSpan {
    public int A00;
    public int A01;
    public Rect A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint.FontMetricsInt A06 = new Paint.FontMetricsInt();
    public final Rect A07;
    public final Drawable A08;

    public C22626BGm(Rect rect, Drawable drawable, int i, int i2) {
        C18070vi.A0d(drawable, 1);
        this.A08 = drawable;
        this.A05 = i;
        this.A07 = rect;
        A01();
        this.A03 = i;
        this.A04 = i2;
    }

    public int A00(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.A05;
        if (i5 == 0) {
            return (i2 - this.A00) - this.A07.bottom;
        }
        if (i5 != 2) {
            i4 = -this.A00;
            i3 = this.A07.bottom;
        } else {
            Rect rect = this.A07;
            i3 = rect.bottom;
            i4 = i + (((((i2 - i) + rect.top) + i3) - this.A00) / 2);
        }
        return i4 - i3;
    }

    public void A01() {
        Rect bounds = this.A08.getBounds();
        this.A02 = bounds;
        int width = bounds.width();
        Rect rect = this.A07;
        this.A01 = width + rect.left + rect.right;
        this.A00 = this.A02.height();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int A002;
        Paint.FontMetricsInt fontMetricsInt = this.A06;
        paint.getFontMetricsInt(fontMetricsInt);
        int i6 = fontMetricsInt.ascent;
        int i7 = fontMetricsInt.descent;
        if (this.A04 == 1) {
            A002 = A00(i6, i7);
        } else {
            A002 = A00(i3 - i4, i5 - i4);
        }
        int i8 = i4 + A002;
        float f2 = f + ((float) this.A07.left);
        canvas.translate(f2, (float) i8);
        this.A08.draw(canvas);
        canvas.translate(-f2, (float) (-i8));
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        A01();
        if (fontMetricsInt != null) {
            int i5 = this.A04;
            if (i5 == 1) {
                i3 = fontMetricsInt.ascent;
                i4 = fontMetricsInt.descent;
            } else {
                i3 = fontMetricsInt.top;
                i4 = fontMetricsInt.bottom;
            }
            int A002 = A00(i3, i4);
            int i6 = this.A00 + A002;
            int i7 = this.A03;
            Rect rect = this.A07;
            int i8 = A002 - rect.top;
            if (i7 == 2) {
                i6 += rect.bottom;
                if (i5 == 0) {
                    int abs = Math.abs(fontMetricsInt.bottom) / 2;
                    i8 -= abs;
                    i6 += abs;
                }
            }
            if (i8 < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = i8;
            }
            if (i8 < fontMetricsInt.top) {
                fontMetricsInt.top = i8;
            }
            if (i6 > fontMetricsInt.descent) {
                fontMetricsInt.descent = i6;
            }
            if (i6 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i6;
            }
        }
        return this.A01;
    }
}
