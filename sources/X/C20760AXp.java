package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;

/* renamed from: X.AXp  reason: case insensitive filesystem */
public class C20760AXp implements AnonymousClass3LD {
    public final int A00;
    public final Object A01;

    public C20760AXp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void COy(AW0 aw0) {
        C33651jA r3;
        String str;
        boolean A0N;
        C33671jC r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            IndiaUpiPaymentsAccountSetupActivity indiaUpiPaymentsAccountSetupActivity = (IndiaUpiPaymentsAccountSetupActivity) obj;
            r3 = indiaUpiPaymentsAccountSetupActivity.A01;
            str = indiaUpiPaymentsAccountSetupActivity.A0s;
            A0N = aw0.A0N();
            r0 = indiaUpiPaymentsAccountSetupActivity.A00;
        } else {
            C33681jD r02 = (C33681jD) obj;
            r3 = r02.A06;
            str = aw0.A0K;
            A0N = aw0.A0N();
            r0 = r02.A05;
        }
        r3.A02(r0, str, A0N);
    }
}
