package X;

/* renamed from: X.Dyk  reason: case insensitive filesystem */
public class C28400Dyk extends DZM {
    public String BMl() {
        return "SHA-512";
    }

    public int BQf() {
        return 64;
    }

    public void CFg(E8N e8n) {
        A05((DZM) e8n);
    }

    public void reset() {
        super.reset();
        this.A02 = 7640891576956012808L;
        this.A03 = -4942790177534073029L;
        this.A04 = 4354685564936845355L;
        this.A05 = -6534734903238641935L;
        this.A06 = 5840696475078001361L;
        this.A07 = -7276294671716946913L;
        this.A0C = 2270897969802886507L;
        this.A0D = 6620516959819538809L;
    }

    public E8N BFx() {
        return new DZM(this);
    }

    public void BJ6(byte[] bArr, int i) {
        DZM.A03(this, bArr, i);
        C26210Cuo.A03(bArr, i + 48, this.A0C);
        C26210Cuo.A03(bArr, i + 56, this.A0D);
        reset();
    }
}
