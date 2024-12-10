package X;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* renamed from: X.3Nh  reason: invalid class name and case insensitive filesystem */
public final class C72733Nh extends ForegroundColorSpan {
    public final /* synthetic */ Resources A00;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setTextSize(this.A00.getDimension(2131169436));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72733Nh(Resources resources, int i) {
        super(i);
        this.A00 = resources;
    }
}
