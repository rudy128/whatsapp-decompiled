package X;

/* renamed from: X.Dyj  reason: case insensitive filesystem */
public class C28399Dyj extends DZM {
    public String BMl() {
        return "SHA-384";
    }

    public int BQf() {
        return 48;
    }

    public void CFg(E8N e8n) {
        super.A05((DZM) e8n);
    }

    public void reset() {
        super.reset();
        this.A02 = -3766243637369397544L;
        this.A03 = 7105036623409894663L;
        this.A04 = -7973340178411365097L;
        this.A05 = 1526699215303891257L;
        this.A06 = 7436329637833083697L;
        this.A07 = -8163818279084223215L;
        this.A0C = -2662702644619276377L;
        this.A0D = 5167115440072839076L;
    }

    public E8N BFx() {
        return new DZM(this);
    }

    public void BJ6(byte[] bArr, int i) {
        DZM.A03(this, bArr, i);
        reset();
    }
}
