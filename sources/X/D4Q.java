package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

public final class D4Q implements LeadingMarginSpan {
    public int getLeadingMargin(boolean z) {
        return 0;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i6)) == layout.getLineCount() - 1) {
            C22591BEq bEq = C25430Cfc.A01;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float A00 = C25287Ccp.A00(paint, layout, lineForOffset) + C25287Ccp.A01(paint, layout, lineForOffset);
                if (A00 != 0.0f) {
                    C18070vi.A0b(canvas);
                    canvas.translate(A00, 0.0f);
                }
            }
        }
    }
}
