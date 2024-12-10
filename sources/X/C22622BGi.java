package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.BGi  reason: case insensitive filesystem */
public final class C22622BGi extends MetricAffectingSpan {
    public final Typeface A00;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        A00(textPaint);
    }

    public C22622BGi(Typeface typeface) {
        this.A00 = typeface;
    }

    private final void A00(Paint paint) {
        int i;
        Typeface typeface = paint.getTypeface();
        if (typeface != null) {
            i = typeface.getStyle();
        } else {
            i = 0;
        }
        Typeface typeface2 = this.A00;
        int style = i & (typeface2.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface2);
    }
}
