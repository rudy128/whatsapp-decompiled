package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class BGg extends MetricAffectingSpan {
    public final Typeface A00;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public BGg(Typeface typeface) {
        this.A00 = typeface;
    }
}
