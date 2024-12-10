package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.UpdateLayout;

public class BGZ extends LeadingMarginSpan.Standard implements UpdateLayout {
    public final int A00;
    public final int A01;

    public BGZ(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        C18070vi.A0h(canvas, paint);
        C18070vi.A0d(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            C108945cZ.A1L(paint);
            int i8 = this.A00;
            canvas.drawCircle((float) (i + (i2 * i8)), (((float) (i3 + i5)) / 2.0f) + 2.0f, (float) i8, paint);
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z) {
        return this.A01;
    }

    public BGZ() {
        this(4, 2);
    }
}
