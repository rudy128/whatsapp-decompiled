package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.AYq  reason: case insensitive filesystem */
public class C20787AYq implements BBJ {
    public final int A00;
    public final Object A01;

    public C20787AYq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bs2() {
        if (this.A00 != 0) {
            IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = (IndiaUpiPaymentTransactionDetailsActivity) this.A01;
            IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = indiaUpiPaymentTransactionDetailsActivity.A07;
            if (indiaUpiDobPickerBottomSheet != null) {
                indiaUpiDobPickerBottomSheet.A29();
            }
            indiaUpiPaymentTransactionDetailsActivity.finish();
            return;
        }
        ((C20835AaD) this.A01).A01.A28();
    }

    public void Bss(A7B a7b) {
        if (this.A00 != 0) {
            IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = (IndiaUpiPaymentTransactionDetailsActivity) this.A01;
            IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = indiaUpiPaymentTransactionDetailsActivity.A07;
            if (indiaUpiDobPickerBottomSheet != null) {
                indiaUpiDobPickerBottomSheet.A29();
            }
            if (!indiaUpiPaymentTransactionDetailsActivity.A05.A00(indiaUpiPaymentTransactionDetailsActivity, a7b) && a7b.A00 == 10755) {
                indiaUpiPaymentTransactionDetailsActivity.CMl(PaymentsUnavailableDialogFragment.A00());
                return;
            }
            return;
        }
        ((C20835AaD) this.A01).A01.A28();
    }
}
