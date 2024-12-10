package X;

public class AMH implements BCP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C198809yw A01;
    public final /* synthetic */ AMJ A02;
    public final /* synthetic */ C198959zC A03;
    public final /* synthetic */ String A04;

    public AMH(C198809yw r1, AMJ amj, C198959zC r3, String str, long j) {
        this.A01 = r1;
        this.A02 = amj;
        this.A04 = str;
        this.A03 = r3;
        this.A00 = j;
    }

    public void Blr(int i, CharSequence charSequence) {
        AnonymousClass1QE r2 = this.A01.A0J;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("authenticateBiometric/onAuthenticationError/error: ");
        r2.A05(AnonymousClass000.A0y(charSequence.toString(), A10));
        this.A02.Blr(i, charSequence);
    }

    public void Bls() {
        this.A01.A0J.A05("authenticateBiometric/onAuthenticationFailed");
        this.A02.Bls();
    }

    public void Blu(int i, CharSequence charSequence) {
        AnonymousClass1QE r2 = this.A01.A0J;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("authenticateBiometric/onAuthenticationHelp/help: ");
        r2.A05(AnonymousClass000.A0y(charSequence.toString(), A10));
        this.A02.Blu(i, charSequence);
    }

    public void Blv(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            C198809yw r10 = this.A01;
            r10.A0J.A06("authenticateBiometric/onAuthenticationSucceeded/success");
            AMJ amj = this.A02;
            amj.Blv(bArr2);
            String str = this.A04;
            r10.A0R.CGN(new C21456AkN(r10, amj, this.A03.A01(C198169xt.A00(false, bArr2, "AUTH", (String) null, (byte[]) null, new Object[0], this.A00)), str, 36));
            return;
        }
        this.A01.A0J.A05("authenticateBiometric/onAuthenticationSucceeded/null signature");
        this.A02.Bls();
    }
}
