package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;

/* renamed from: X.Bw4  reason: case insensitive filesystem */
public final class C24138Bw4 extends BGZ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        boolean A16 = C18070vi.A16(canvas, paint);
        C18070vi.A0d(charSequence2, 7);
        C18070vi.A0d(layout, 11);
        if ((charSequence2 instanceof Spanned) && (spanned = (Spanned) charSequence2) != null && spanned.getSpanStart(this) == i6) {
            int i8 = this.A03;
            if (i8 == 0) {
                Paint.Style style = paint.getStyle();
                C108945cZ.A1L(paint);
                int i9 = this.A00;
                canvas.drawCircle((float) (i + (i2 * i9)), (((float) (i3 + i5)) / 2.0f) + 2.0f, (float) i9, paint);
                paint.setStyle(style);
            } else if (i8 == A16) {
                Paint.Style style2 = paint.getStyle();
                float strokeWidth = paint.getStrokeWidth();
                AnonymousClass3MW.A1P(paint);
                paint.setStrokeWidth(this.A00);
                int i10 = this.A01;
                canvas.drawCircle((float) (i + (i2 * i10)), (((float) (i3 + i5)) / 2.0f) + 2.0f, (float) i10, paint);
                paint.setStyle(style2);
                paint.setStrokeWidth(strokeWidth);
            } else if (i8 == 2) {
                int i11 = this.A02 / 2;
                Paint.Style style3 = paint.getStyle();
                C108945cZ.A1L(paint);
                float f = (((float) (i3 + i5)) / 2.0f) + 2.0f;
                float f2 = (float) (i + (i2 * i11));
                float f3 = (float) i11;
                canvas2.drawRect(f2 - f3, f - f3, f2 + f3, f + f3, paint2);
                paint.setStyle(style3);
            }
        }
    }

    public C24138Bw4(float f, int i, int i2, int i3, int i4, int i5) {
        super(i, i2);
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = f;
        this.A02 = i5;
    }
}
