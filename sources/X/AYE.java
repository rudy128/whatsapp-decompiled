package X;

import com.whatsapp.util.Log;

public class AYE implements BCC {
    public final /* synthetic */ C1418477e A00;
    public final /* synthetic */ C33661jB A01;
    public final /* synthetic */ C175818zK A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ void BzI(AnonymousClass9O3 r1) {
    }

    public AYE(C1418477e r1, C33661jB r2, C175818zK r3, String str, boolean z, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = z;
        this.A01 = r2;
        this.A05 = z2;
    }

    public void Bpz(AnonymousClass8pF r9) {
        C175818zK r0 = this.A02;
        C1418477e r1 = r9.A01;
        C17960vV.A07(r1);
        String str = r9.A02;
        r0.A01(r1, this.A00, this.A01, str, this.A03, this.A04, this.A05);
    }

    public void Bss(A7B a7b) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to set default payment method");
        this.A01.C3L(a7b);
    }
}
