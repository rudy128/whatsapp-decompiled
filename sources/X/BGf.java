package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class BGf extends MetricAffectingSpan {
    public final Typeface A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public BGf(Typeface typeface) {
        this.A00 = typeface;
    }
}
