package X;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.radio.RadioButtonWithSubtitle;

/* renamed from: X.3Ni  reason: invalid class name and case insensitive filesystem */
public final class C72743Ni extends ForegroundColorSpan {
    public final /* synthetic */ RadioButtonWithSubtitle A00;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setTextSize(this.A00.getResources().getDimension(2131169436));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72743Ni(RadioButtonWithSubtitle radioButtonWithSubtitle, int i) {
        super(i);
        this.A00 = radioButtonWithSubtitle;
    }
}
