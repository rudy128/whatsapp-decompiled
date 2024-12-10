package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.26n  reason: invalid class name */
public class AnonymousClass26n extends Drawable {
    public final int A00;
    public final int A01;
    public final TextPaint A02;
    public final CharSequence A03;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public AnonymousClass26n(Typeface typeface, CharSequence charSequence, int i, int i2) {
        this.A03 = charSequence;
        TextPaint textPaint = new TextPaint();
        this.A02 = textPaint;
        textPaint.setTextSize((float) i2);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        this.A01 = (int) Math.ceil((double) textPaint.measureText(charSequence, 0, charSequence.length()));
        this.A00 = textPaint.getFontMetricsInt((Paint.FontMetricsInt) null);
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width() / 2;
        TextPaint textPaint = this.A02;
        int height = (int) (((float) (getBounds().height() / 2)) - ((textPaint.descent() + textPaint.ascent()) / 2.0f));
        CharSequence charSequence = this.A03;
        canvas.drawText(charSequence, 0, charSequence.length(), (float) width, (float) height, textPaint);
    }

    public int getIntrinsicHeight() {
        return this.A00;
    }

    public int getIntrinsicWidth() {
        return this.A01;
    }
}
