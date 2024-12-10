package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;

public class AYR implements C22452B8k {
    public final int A00;
    public final Object A01;

    public AYR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C0D(A7B a7b) {
        if (this.A00 != 0) {
            IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = (IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel) this.A01;
            if (a7b == null) {
                C21448AkF.A00(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0B, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel, 1);
            } else {
                AnonymousClass3MX.A1J(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0H.A00, 3);
            }
        } else {
            AnonymousClass91R.A19(a7b, (AnonymousClass91R) this.A01, false);
        }
    }
}
