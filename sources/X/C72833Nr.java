package X;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: X.3Nr  reason: invalid class name and case insensitive filesystem */
public final class C72833Nr extends URLSpan {
    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C72833Nr(String str) {
        super(str);
    }
}
