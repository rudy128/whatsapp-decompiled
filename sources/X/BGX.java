package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.UpdateLayout;

public final class BGX extends LeadingMarginSpan.Standard implements UpdateLayout {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public BGX(float f, int i, int i2, int i3) {
        super(0);
        this.A03 = i;
        this.A02 = i2;
        this.A00 = f;
        this.A01 = i3;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float f;
        CharSequence charSequence2 = charSequence;
        char A17 = C18070vi.A17(canvas, paint);
        C18070vi.A0d(charSequence2, 7);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        Spanned spanned = (Spanned) charSequence2;
        float f2 = 0.0f;
        if (spanned.getSpanStart(this) == i6) {
            f = this.A00;
            fArr[0] = 3.0f;
            fArr[A17] = 3.0f;
            fArr[2] = 3.0f;
            fArr[3] = 3.0f;
        } else {
            f = 0.0f;
        }
        if (spanned.getSpanEnd(this) == i7) {
            f2 = this.A00;
            fArr[4] = 3.0f;
            fArr[5] = 3.0f;
            fArr[6] = 3.0f;
            fArr[7] = 3.0f;
        }
        Paint.Style style = paint.getStyle();
        float f3 = ((float) i3) + f;
        C108945cZ.A1L(paint);
        int color = paint.getColor();
        paint.setColor(this.A01);
        Path A0L = C108945cZ.A0L();
        A0L.addRoundRect(new RectF((float) ((i2 * 3) + i), f3, (float) (i + (i2 * (this.A03 + 3))), ((float) i5) - f2), fArr, Path.Direction.CW);
        paint.setStyle(style);
        canvas.drawPath(A0L, paint);
        paint.setColor(color);
    }

    public int getLeadingMargin(boolean z) {
        return this.A02;
    }
}
