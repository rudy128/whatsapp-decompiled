package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.BGa  reason: case insensitive filesystem */
public class C22619BGa extends MetricAffectingSpan {
    public final float A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.A00)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.A00)));
    }

    public C22619BGa(float f) {
        this.A00 = f;
    }
}
