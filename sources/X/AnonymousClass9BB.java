package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.List;

/* renamed from: X.9BB  reason: invalid class name */
public final class AnonymousClass9BB extends A34 {
    public final AnonymousClass1M9 A00;
    public final C26021Qn A01;
    public final AnonymousClass9YT A02;
    public final C198369yE A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C184959bn r10 = (C184959bn) obj;
        C18070vi.A0d(r10, 0);
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A02.A00;
        List list = r10.A00;
        indiaUpiPaymentSettingsFragment.A0e = list;
        IndiaUpiPaymentSettingsFragment.A0C(indiaUpiPaymentSettingsFragment, list);
        List list2 = r10.A01;
        indiaUpiPaymentSettingsFragment.A0e.size();
        if (!list2.isEmpty()) {
            AnonymousClass1OZ A0U = C17880vN.A0U(indiaUpiPaymentSettingsFragment.A0c);
            C678831f r5 = indiaUpiPaymentSettingsFragment.A09;
            AnonymousClass9BV r2 = new AnonymousClass9BV(indiaUpiPaymentSettingsFragment.A07, indiaUpiPaymentSettingsFragment.A0H, r5, A0U, indiaUpiPaymentSettingsFragment, list2);
            indiaUpiPaymentSettingsFragment.A08 = r2;
            AnonymousClass3MW.A1T(r2, indiaUpiPaymentSettingsFragment.A0n, 0);
            return;
        }
        IndiaUpiPaymentSettingsFragment.A0C(indiaUpiPaymentSettingsFragment, indiaUpiPaymentSettingsFragment.A0e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9BB(AnonymousClass1M9 r2, C26021Qn r3, AnonymousClass9YT r4, PaymentSettingsFragment paymentSettingsFragment, C198369yE r6) {
        super(paymentSettingsFragment, true);
        C18070vi.A0p(r2, r3, r6);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r4;
    }
}
