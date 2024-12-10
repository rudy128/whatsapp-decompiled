package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class BGe extends MetricAffectingSpan {
    public final float A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public BGe(float f) {
        this.A00 = f;
    }
}
