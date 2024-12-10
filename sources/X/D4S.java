package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class D4S implements LineHeightSpan {
    public final float A00;

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.A00));
            int ceil2 = (int) Math.ceil(((double) i5) * ((double) ((((float) ceil) * 1.0f) / ((float) i6))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }

    public D4S(float f) {
        this.A00 = f;
    }
}
