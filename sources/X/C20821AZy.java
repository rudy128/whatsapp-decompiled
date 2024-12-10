package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AZy  reason: case insensitive filesystem */
public class C20821AZy implements B91 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20821AZy(HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, AnonymousClass92s r2, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = r2;
            this.A02 = hybridPaymentMethodPickerFragment;
            return;
        }
        this.A01 = r2;
        this.A02 = hybridPaymentMethodPickerFragment;
    }

    public final void Bss(A7B a7b) {
        switch (this.A00) {
            case 0:
                AnonymousClass92s r4 = (AnonymousClass92s) this.A01;
                ARR arr = (ARR) this.A02;
                r4.A5p(false);
                if (!AnonymousClass8BX.A1R(r4, a7b) || a7b.A00 != 21034) {
                    String A5s = r4.A5s(a7b);
                    r4.A0H = new AtomicBoolean(false);
                    r4.BhR(A5s);
                    return;
                }
                r4.A5S(r4.A0B, arr, (PaymentBottomSheet) null, AnonymousClass000.A0i());
                return;
            case 1:
                AnonymousClass92s r2 = (AnonymousClass92s) this.A01;
                HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) this.A02;
                WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment.A01;
                if (waButtonWithLoader != null) {
                    waButtonWithLoader.A01();
                }
                if (!AnonymousClass8BX.A1R(r2, a7b) || a7b.A00 != 21034) {
                    r2.BhR(r2.A5s(a7b));
                    return;
                }
                C73203Rj A002 = AnonymousClass4a6.A00(r2);
                A002.A0T(true);
                A002.A0D(2131893475);
                C20154A9q.A00(A002, hybridPaymentMethodPickerFragment, 19, 2131899286);
                AnonymousClass3MY.A1G(A002);
                return;
            default:
                WaButtonWithLoader waButtonWithLoader2 = ((HybridPaymentMethodPickerFragment) this.A02).A01;
                if (waButtonWithLoader2 != null) {
                    waButtonWithLoader2.A01();
                    return;
                }
                return;
        }
    }

    public C20821AZy(ARR arr, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A00 = 0;
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A02 = arr;
    }
}
