package X;

import com.whatsapp.util.Log;

public class AYC implements BCC {
    public final /* synthetic */ C1418477e A00;
    public final /* synthetic */ AnonymousClass8pS A01;
    public final /* synthetic */ C22451B8j A02;
    public final /* synthetic */ C175808zJ A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ void BzI(AnonymousClass9O3 r1) {
    }

    public AYC(C1418477e r1, AnonymousClass8pS r2, C22451B8j b8j, C175808zJ r4, String str) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A00 = r1;
        this.A02 = b8j;
    }

    public void Bpz(AnonymousClass8pF r8) {
        C175808zJ r4 = this.A03;
        C1418477e r0 = r8.A01;
        C17960vV.A07(r0);
        String str = r8.A02;
        C175808zJ.A00(r0, this.A00, this.A01, this.A02, r4, str, this.A04);
    }

    public void Bss(A7B a7b) {
        Log.w("PAY: IndiaUpiOtpAction: could not fetch VPA information to request OTP");
        this.A02.Bzl(a7b);
    }
}
