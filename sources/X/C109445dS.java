package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.5dS  reason: invalid class name and case insensitive filesystem */
public class C109445dS extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05;
    public final String A06;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public C109445dS(Typeface typeface, String str, int i, int i2, int i3, int i4, int i5) {
        this.A06 = str;
        this.A01 = i4;
        TextPaint textPaint = new TextPaint();
        this.A04 = textPaint;
        textPaint.setColor(i2);
        Paint A062 = AnonymousClass3MW.A06();
        this.A03 = A062;
        Paint.Style style = Paint.Style.FILL;
        A062.setStyle(style);
        A062.setColor(i);
        A062.setAntiAlias(true);
        textPaint.setTextSize((float) i3);
        textPaint.setStyle(style);
        textPaint.setColor(i2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Rect A07 = AnonymousClass3MW.A07();
        this.A05 = A07;
        textPaint.getTextBounds(str, 0, str.length(), A07);
        int i6 = i4 * 2;
        this.A00 = A07.width() + i6 + (i5 * 2);
        this.A02 = A07.height() + i6;
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        Rect rect = this.A05;
        int height = (getBounds().height() / 2) + (rect.height() / 2);
        float f = (float) (width / 2);
        float width2 = f - (((float) rect.width()) / 2.0f);
        int i = this.A01;
        float f2 = (float) i;
        RectF rectF = new RectF(width2 - f2, (float) ((height - rect.height()) - i), width2 + ((float) rect.width()) + f2, (float) (i + height));
        float height2 = ((float) (rect.height() + (i * 2))) / 2.0f;
        canvas.drawRoundRect(rectF, height2, height2, this.A03);
        String str = this.A06;
        canvas.drawText(str, 0, str.length(), f, (float) height, this.A04);
    }

    public int getIntrinsicHeight() {
        return this.A02;
    }

    public int getIntrinsicWidth() {
        return this.A00;
    }
}
