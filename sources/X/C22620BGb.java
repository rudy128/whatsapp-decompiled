package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.BGb  reason: case insensitive filesystem */
public final class C22620BGb extends MetricAffectingSpan {
    public final String A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public C22620BGb(String str) {
        this.A00 = str;
    }
}
