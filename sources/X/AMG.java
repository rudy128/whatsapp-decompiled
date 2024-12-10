package X;

public class AMG implements BCP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C187759gK A01;
    public final /* synthetic */ AMI A02;

    public void Blv(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            C187759gK r2 = this.A01;
            r2.A03.A06("sendWithBiometric/onAuthenticationSucceeded/success");
            this.A02.Blv(C198169xt.A00(false, bArr2, r2.A05, (String) null, (byte[]) null, new Object[0], this.A00));
            return;
        }
        this.A01.A03.A05("sendWithBiometric/onAuthenticationSucceeded/null signature");
        this.A02.Bls();
    }

    public AMG(C187759gK r1, AMI ami, long j) {
        this.A01 = r1;
        this.A02 = ami;
        this.A00 = j;
    }

    public void Blr(int i, CharSequence charSequence) {
        AnonymousClass1QE r2 = this.A01.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sendWithBiometric/onAuthenticationError/error: ");
        r2.A05(AnonymousClass000.A0y(charSequence.toString(), A10));
        this.A02.Blr(i, charSequence);
    }

    public void Bls() {
        this.A01.A03.A05("sendWithBiometric/onAuthenticationFailed");
        this.A02.Bls();
    }

    public void Blu(int i, CharSequence charSequence) {
        AnonymousClass1QE r2 = this.A01.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sendWithBiometric/onAuthenticationHelp/help: ");
        r2.A05(AnonymousClass000.A0y(charSequence.toString(), A10));
        this.A02.Blu(i, charSequence);
    }
}
