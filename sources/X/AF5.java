package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.wds.components.button.WDSButton;

public class AF5 implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiDebitCardVerificationActivity A02;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AF5(EditText editText, IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity, int i) {
        this.A02 = indiaUpiDebitCardVerificationActivity;
        this.A00 = i;
        this.A01 = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int parseInt;
        if (i3 != 0) {
            this.A02.A02.setVisibility(4);
        }
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = this.A02;
        int A03 = IndiaUpiDebitCardVerificationActivity.A03(indiaUpiDebitCardVerificationActivity);
        WDSButton wDSButton = indiaUpiDebitCardVerificationActivity.A06;
        if (A03 == 0) {
            wDSButton.setEnabled(true);
        } else {
            wDSButton.setEnabled(false);
        }
        if (charSequence.length() >= this.A00) {
            EditText editText = this.A01;
            if (editText != null) {
                editText.requestFocus();
                if (editText == indiaUpiDebitCardVerificationActivity.A04) {
                    WaEditText waEditText = indiaUpiDebitCardVerificationActivity.A03;
                    if (!TextUtils.isEmpty(C108985cd.A0h(waEditText)) && (parseInt = Integer.parseInt(C108985cd.A0h(waEditText))) != -1) {
                        if (parseInt < 1 || parseInt > 12) {
                            indiaUpiDebitCardVerificationActivity.A02.setText(2131889216);
                            IndiaUpiDebitCardVerificationActivity.A0Q(indiaUpiDebitCardVerificationActivity);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            IndiaUpiDebitCardVerificationActivity.A0c(indiaUpiDebitCardVerificationActivity, indiaUpiDebitCardVerificationActivity.A00, indiaUpiDebitCardVerificationActivity.A01, false);
        }
    }
}
