package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* renamed from: X.9lN  reason: invalid class name and case insensitive filesystem */
public class C190699lN {
    public final C131516lE A00;
    public final AnonymousClass1K3 A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentsDobManager", "infra", "COMMON");

    public boolean A00(AnonymousClass1FU r4, A7B a7b) {
        AnonymousClass8BX.A1D(this.A02, a7b, "maybeHandleUnderageError: ", AnonymousClass000.A10());
        if (a7b.A00 != 2896001) {
            return false;
        }
        r4.CMl(PaymentsUnavailableDialogFragment.A01());
        return true;
    }

    public C190699lN(C131516lE r4, AnonymousClass1K3 r5) {
        this.A01 = r5;
        this.A00 = r4;
    }
}
