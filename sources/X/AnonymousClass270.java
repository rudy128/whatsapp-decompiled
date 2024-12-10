package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.270  reason: invalid class name */
public final class AnonymousClass270 extends ReplacementSpan {
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C18070vi.A0d(canvas, 0);
        C18070vi.A0d(paint, 8);
        canvas.drawText(C43271zX.A00, f, (float) i4, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C18070vi.A0d(paint, 0);
        return (int) Math.ceil((double) paint.measureText(C43271zX.A00));
    }
}
