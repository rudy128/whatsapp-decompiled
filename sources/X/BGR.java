package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class BGR extends CharacterStyle {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.A02, this.A00, this.A01, this.A03);
    }

    public BGR(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }
}
