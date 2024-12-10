package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class BGQ extends CharacterStyle {
    public final boolean A00;
    public final boolean A01;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.A01);
        textPaint.setStrikeThruText(this.A00);
    }

    public BGQ(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
