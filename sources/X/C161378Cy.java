package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Map;

/* renamed from: X.8Cy  reason: invalid class name and case insensitive filesystem */
public final class C161378Cy extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ URLSpan A01;
    public final /* synthetic */ Map A02;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        int i = this.A00;
        textPaint.setUnderlineText(false);
        if (i == 0) {
            i = textPaint.linkColor;
        }
        textPaint.setColor(i);
    }

    public C161378Cy(URLSpan uRLSpan, Map map, int i) {
        this.A02 = map;
        this.A01 = uRLSpan;
        this.A00 = i;
    }

    public void onClick(View view) {
        Runnable runnable = (Runnable) this.A02.get(this.A01.getURL());
        if (runnable != null) {
            runnable.run();
        }
    }
}
