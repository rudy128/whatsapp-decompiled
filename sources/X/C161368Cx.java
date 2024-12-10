package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;

/* renamed from: X.8Cx  reason: invalid class name and case insensitive filesystem */
public class C161368Cx extends ClickableSpan {
    public final /* synthetic */ AnonymousClass95J A00;
    public final /* synthetic */ C1767695m A01;

    public C161368Cx(AnonymousClass95J r1, C1767695m r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.A01.A03;
        AnonymousClass95J r1 = this.A00;
        List list = C42011xT.A0I;
        onClickListener.onClick(r1.A08);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        AnonymousClass95J r1 = this.A00;
        List list = C42011xT.A0I;
        View view = r1.A01;
        textPaint.setColor(AnonymousClass000.A0Y(view).getColor(C72463Mc.A02(view.getContext())));
        textPaint.setUnderlineText(false);
    }
}
