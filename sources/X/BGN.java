package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class BGN extends CharacterStyle {
    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        textPaint.setStrikeThruText(false);
    }
}
