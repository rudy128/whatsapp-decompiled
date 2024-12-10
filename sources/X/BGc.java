package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class BGc extends MetricAffectingSpan {
    public final float A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public BGc(float f) {
        this.A00 = f;
    }
}
