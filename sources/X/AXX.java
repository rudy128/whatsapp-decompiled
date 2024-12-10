package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel;

public class AXX implements B8a {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AXX(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void C3q(UserJid userJid, C1418477e r14, C1418477e r15, C1418477e r16, A7B a7b, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        UserJid userJid2;
        boolean z6;
        Object r0;
        C1418477e r5 = r14;
        String str3 = str2;
        boolean z7 = z2;
        if (this.A00 != 0) {
            String str4 = this.A02;
            C18070vi.A0d(str4, 1);
            AnonymousClass1DT r1 = ((IndiaUpiPayNumberContactPickerViewModel) this.A01).A02;
            if (a7b != null) {
                r0 = new AnonymousClass963(str4);
            } else {
                r0 = new AnonymousClass965(new C188449hR(userJid, r5, r15, r16, str, str3, z4, z7), str4);
            }
            r1.A0E(r0);
            return;
        }
        AnonymousClass933 r4 = (AnonymousClass933) this.A01;
        String str5 = this.A02;
        r4.CEx();
        if (!z || a7b != null) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = r4.getString(2131891337);
            r4.BhU(A1a, 0, 2131893635);
            return;
        }
        r4.A07 = r14;
        C1418477e A0K = AnonymousClass8BW.A0K(str5, "upiHandle");
        r4.A08 = A0K;
        r4.A0J = z7;
        r4.A0a = str3;
        if (z3) {
            boolean z8 = r4 instanceof IndiaUpiMandatePaymentActivity;
            C191339mR r3 = r4.A09;
            if (z8) {
                z5 = true;
                z6 = false;
                userJid2 = null;
            } else {
                z5 = false;
                userJid2 = null;
                z6 = false;
            }
            r3.A00(r4, r4, userJid2, A0K, z5, z6);
            return;
        }
        r4.A5H(r4.A0B);
    }
}
