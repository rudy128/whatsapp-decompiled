package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

public class AY9 implements BCC {
    public final int A00;
    public final Object A01;

    public AY9(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, int i) {
        this.A00 = i;
        this.A01 = indiaUpiSendPaymentActivity;
    }

    public void Bpz(AnonymousClass8pF r3) {
        switch (this.A00) {
            case 0:
                ((AnonymousClass91S) this.A01).A57();
                return;
            case 1:
                IndiaUpiSendPaymentActivity.A0c(r3, (IndiaUpiSendPaymentActivity) this.A01);
                return;
            default:
                if (r3 != null && !C20061A5k.A02(r3.A00)) {
                    ((AnonymousClass91T) this.A01).A0H = r3.A00;
                    return;
                }
                return;
        }
    }

    public void Bss(A7B a7b) {
        int i = this.A00;
        AnonymousClass91R r3 = (AnonymousClass91R) this.A01;
        switch (i) {
            case 0:
                if (!C20752AXh.A01(r3, "upi-get-vpa", a7b.A00, false)) {
                    r3.A0i.A06("could not get account vpa: showErrorAndFinish");
                    break;
                } else {
                    return;
                }
            case 1:
                r3.A0d = false;
                r3.CEx();
                if (!C20752AXh.A01(r3, "upi-get-vpa", a7b.A00, false)) {
                    AnonymousClass1QE r2 = r3.A0i;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("could not get vpa for jid: ");
                    A10.append(r3.A0F);
                    AnonymousClass8BV.A1E(r2, "; showErrorAndFinish", A10);
                    break;
                } else {
                    return;
                }
            default:
                AnonymousClass1QE r22 = r3.A0i;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("could not get payee name for jio: ");
                r22.A05(C17890vO.A0V(r3.A0F, A102));
                return;
        }
        r3.A5W(a7b);
    }

    public /* synthetic */ void BzI(AnonymousClass9O3 r4) {
        if (1 - this.A00 == 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A01;
            IndiaUpiSendPaymentActivity.A0c(r4.A01, indiaUpiSendPaymentActivity);
            IndiaUpiSendPaymentActivity.A0q(indiaUpiSendPaymentActivity);
            indiaUpiSendPaymentActivity.A0o = r4.A04;
            String str = r4.A02;
            indiaUpiSendPaymentActivity.A0V = str;
            if (str != null && !str.equals("0000")) {
                indiaUpiSendPaymentActivity.A0t = "p2m";
            }
        }
    }
}
