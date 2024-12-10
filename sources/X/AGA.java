package X;

import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;

public class AGA implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public AGA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        switch (this.A00) {
            case 0:
                PasswordInputFragment passwordInputFragment = (PasswordInputFragment) this.A01;
                if (i != 6) {
                    return false;
                }
                passwordInputFragment.A27();
                return false;
            case 1:
                IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this.A01;
                if (i != 6) {
                    return false;
                }
                IndiaUpiDebitCardVerificationActivity.A0V(indiaUpiDebitCardVerificationActivity);
                return true;
            case 2:
                IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity = (IndiaUpiCreateCustomNumberActivity) this.A01;
                if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                    return false;
                }
                AZ6 az6 = indiaUpiCreateCustomNumberActivity.A05;
                if (az6 != null) {
                    Intent intent = indiaUpiCreateCustomNumberActivity.getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra("extra_referral_screen");
                    } else {
                        str = null;
                    }
                    az6.BiL((Integer) null, "create_numeric_upi_alias", str, 2);
                    IndiaUpiCreateCustomNumberActivity.A03(indiaUpiCreateCustomNumberActivity);
                    return true;
                }
                C18070vi.A11("fieldStatsLogger");
                throw null;
            default:
                IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) this.A01;
                if (i != 6) {
                    return false;
                }
                indiaUpiDisplaySecureQrCodeView.A0G.A02.A0F(AnonymousClass3Ma.A12(indiaUpiDisplaySecureQrCodeView.A0F));
                return true;
        }
    }
}
