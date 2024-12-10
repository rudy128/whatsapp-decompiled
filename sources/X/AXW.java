package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiSendPaymentViewModel;

public class AXW implements B8a {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public AXW(IndiaUpiSendPaymentViewModel indiaUpiSendPaymentViewModel, int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = indiaUpiSendPaymentViewModel;
    }

    public final void C3q(UserJid userJid, C1418477e r15, C1418477e r16, C1418477e r17, A7B a7b, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object r1;
        Object obj;
        AnonymousClass1DT r0;
        int i = this.A00;
        boolean z5 = this.A02;
        IndiaUpiSendPaymentViewModel indiaUpiSendPaymentViewModel = (IndiaUpiSendPaymentViewModel) this.A01;
        UserJid userJid2 = userJid;
        C1418477e r6 = r15;
        C1418477e r7 = r16;
        C1418477e r8 = r17;
        A7B a7b2 = a7b;
        String str3 = str;
        String str4 = str2;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        if (i != 0) {
            if (a7b != null || !z) {
                obj = new AnonymousClass967(a7b2, z5);
            } else {
                C188449hR r4 = new C188449hR(userJid2, r6, r7, r8, str3, str4, z8, z6);
                r4.A06 = z7;
                obj = new AnonymousClass968(r4, z5);
            }
            r0 = indiaUpiSendPaymentViewModel.A03;
        } else {
            if (a7b != null || !z) {
                r1 = new AnonymousClass967(a7b2, z5);
            } else {
                C188449hR r42 = new C188449hR(userJid2, r6, r7, r8, str3, str4, z8, z6);
                r42.A06 = z7;
                r1 = new AnonymousClass968(r42, z5);
            }
            r0 = indiaUpiSendPaymentViewModel.A02;
        }
        r0.A0E(obj);
    }
}
