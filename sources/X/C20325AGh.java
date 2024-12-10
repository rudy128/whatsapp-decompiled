package X;

import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.AGh  reason: case insensitive filesystem */
public class C20325AGh implements AnonymousClass1GC, C218317o {
    public final int A00;
    public final Object A01;

    public C20325AGh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C6U(C27581Wq r4, AnonymousClass1F9 r5) {
        A34 a34;
        switch (this.A00) {
            case 0:
                C20039A4i a4i = (C20039A4i) this.A01;
                C18070vi.A0d(r4, 2);
                if (r4 == C27581Wq.ON_DESTROY) {
                    a4i.A00 = null;
                    return;
                }
                return;
            case 1:
                C191409mY r2 = (C191409mY) this.A01;
                if (r4.ordinal() == 5 && (a34 = r2.A01) != null) {
                    a34.A0B(true);
                    r2.A01 = null;
                    return;
                }
                return;
            default:
                PaymentView.A04(r4, (PaymentView) this.A01);
                return;
        }
    }
}
