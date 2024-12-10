package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.3Nf  reason: invalid class name and case insensitive filesystem */
public final class C72713Nf extends ClickableSpan implements C1604588o {
    public final /* synthetic */ InAppBugReportingActivity A00;
    public final /* synthetic */ String A01;

    public void onClick(View view) {
    }

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        AnonymousClass3MX.A19(this.A00, textPaint, 2131103345);
        textPaint.setUnderlineText(false);
    }

    public C72713Nf(InAppBugReportingActivity inAppBugReportingActivity, String str) {
        this.A00 = inAppBugReportingActivity;
        this.A01 = str;
    }

    public void Bos() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.A01));
        this.A00.startActivity(intent);
    }

    public void BxU() {
        InAppBugReportingActivity inAppBugReportingActivity = this.A00;
        C29551cT.A02(inAppBugReportingActivity.A05, inAppBugReportingActivity.A08, this.A01);
    }
}
