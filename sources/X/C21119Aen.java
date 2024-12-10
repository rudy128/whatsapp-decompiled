package X;

import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.List;

/* renamed from: X.Aen  reason: case insensitive filesystem */
public final /* synthetic */ class C21119Aen implements AnonymousClass1TI {
    public final /* synthetic */ C20809AZm A00;
    public final /* synthetic */ ConfirmPaymentFragment A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ String A03;

    public final void accept(Object obj) {
        C20809AZm aZm = this.A00;
        ConfirmPaymentFragment confirmPaymentFragment = this.A01;
        String str = this.A03;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        List list = (List) obj;
        C17960vV.A07(list);
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(list);
        A002.A1V(confirmPaymentFragment, 0);
        A002.A05 = new C20830Aa8(aZm, str);
        paymentBottomSheet.A2L(A002);
    }

    public /* synthetic */ C21119Aen(C20809AZm aZm, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, String str) {
        this.A00 = aZm;
        this.A01 = confirmPaymentFragment;
        this.A03 = str;
        this.A02 = paymentBottomSheet;
    }
}
