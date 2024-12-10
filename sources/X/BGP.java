package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class BGP extends CharacterStyle {
    public int A00;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        textPaint.setAlpha(this.A00);
    }

    public BGP(int i) {
        int max = Math.max(i, 0);
        this.A00 = max;
        this.A00 = Math.min(max, 255);
    }
}
