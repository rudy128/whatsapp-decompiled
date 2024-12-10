package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.Set;

/* renamed from: X.3Nb  reason: invalid class name and case insensitive filesystem */
public final class C72673Nb extends CharacterStyle {
    public final String A00;
    public final Set A01;

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(true);
        }
    }

    public C72673Nb(String str, Set set) {
        this.A00 = str;
        this.A01 = set;
    }
}
