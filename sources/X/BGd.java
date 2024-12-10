package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class BGd extends MetricAffectingSpan {
    public final float A00;

    public BGd(float f) {
        this.A00 = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }

    public void updateMeasureState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }
}
