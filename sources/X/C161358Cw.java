package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;

/* renamed from: X.8Cw  reason: invalid class name and case insensitive filesystem */
public class C161358Cw extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C161358Cw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onClick(View view) {
        if (this.A00 != 0) {
            IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = (IndiaUpiEditTransactionDescriptionFragment) this.A01;
            indiaUpiEditTransactionDescriptionFragment.A08.BiM((C20112A7u) null, C108955ca.A0f(), "payment_description", (String) null, 1);
            indiaUpiEditTransactionDescriptionFragment.A1k(AnonymousClass3MY.A07(Uri.parse("https://faq.whatsapp.com/general/payments/about-the-security-of-your-payment-descriptions")));
            return;
        }
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
        AnonymousClass4VU r1 = new AnonymousClass4VU(16);
        AnonymousClass8BS.A12(restoreFromBackupActivity, r1, 2131890738);
        r1.A05(false);
        AnonymousClass8BS.A11(restoreFromBackupActivity, r1, 2131899286);
        PromptDialogFragment A0I = AnonymousClass8BW.A0I(restoreFromBackupActivity, r1, 2131899432);
        if (!RestoreFromBackupActivity.A19(restoreFromBackupActivity)) {
            AnonymousClass8BV.A18(AnonymousClass3Ma.A0H(restoreFromBackupActivity), A0I, "one-time-setup-taking-too-long");
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (1 - this.A00 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        textPaint.setColor(AnonymousClass3MZ.A09((Fragment) this.A01).getColor(2131101209));
        textPaint.setUnderlineText(false);
    }
}
