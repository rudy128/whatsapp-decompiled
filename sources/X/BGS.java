package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class BGS extends CharacterStyle {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        textPaint.setShadowLayer(this.A02, this.A00, this.A01, this.A03);
    }

    public BGS(float f, float f2, float f3, int i) {
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = i;
    }
}
