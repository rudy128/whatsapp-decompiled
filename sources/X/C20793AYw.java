package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.AYw  reason: case insensitive filesystem */
public class C20793AYw implements BBK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20793AYw(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bss(A7B a7b) {
        AnonymousClass1DT r1;
        int i;
        Object valueOf;
        if (this.A00 != 0) {
            ((BBK) this.A01).Bss(a7b);
            if (a7b == null || 10756 != a7b.A00) {
                r1 = ((AnonymousClass8FR) this.A02).A00;
                if (a7b != null) {
                    i = a7b.A00;
                } else {
                    i = 503;
                }
                valueOf = Integer.valueOf(i);
            } else {
                r1 = ((AnonymousClass8FR) this.A02).A01;
                valueOf = "NEEDS_MORE_INFO";
            }
            r1.A0E(valueOf);
            return;
        }
        AnonymousClass91q r2 = (AnonymousClass91q) this.A01;
        r2.A00 = 0;
        int i2 = a7b.A00;
        if (i2 == 10756) {
            ((C194839sN) this.A02).A00("on_failure");
        } else if (i2 == 10755) {
            r2.CMl(PaymentsUnavailableDialogFragment.A00());
        } else {
            HashMap A11 = C17880vN.A11();
            AnonymousClass8BU.A1N(A11, i2);
            ((C194839sN) this.A02).A01("on_exception", A11);
        }
    }

    public void Byv() {
        if (this.A00 != 0) {
            ((BBK) this.A01).Byv();
            ((AnonymousClass8FR) this.A02).A01.A0E("COMPLETED");
            return;
        }
        ((AnonymousClass91q) this.A01).A00 = 0;
        ((C194839sN) this.A02).A00("on_success");
    }
}
