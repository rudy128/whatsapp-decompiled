package X;

import com.whatsapp.util.Log;

public class AYB implements BCC {
    public final /* synthetic */ C1418477e A00;
    public final /* synthetic */ C33661jB A01;
    public final /* synthetic */ C175818zK A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ void BzI(AnonymousClass9O3 r1) {
    }

    public AYB(C1418477e r1, C33661jB r2, C175818zK r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public void Bpz(AnonymousClass8pF r7) {
        C175818zK r3 = this.A02;
        C1418477e r0 = r7.A01;
        C17960vV.A07(r0);
        String str = r7.A02;
        C175818zK.A00(r0, this.A00, this.A01, r3, str, this.A03);
    }

    public void Bss(A7B a7b) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to remove payment method");
        this.A01.C3L(a7b);
    }
}
