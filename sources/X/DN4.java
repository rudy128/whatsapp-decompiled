package X;

public class DN4 implements BAB {
    public C25775Clm A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final DN3 A03;

    public void BAt(String str) {
        if (!this.A01) {
            this.A01 = true;
            this.A03.A05(this.A00, str, this.A02);
            return;
        }
        throw new C21580AmU("Cannot encode a second value in the ValueEncoderContext");
    }

    public void BAu(boolean z) {
        if (!this.A01) {
            this.A01 = true;
            this.A03.A03(this.A00, z ? 1 : 0, this.A02);
            return;
        }
        throw new C21580AmU("Cannot encode a second value in the ValueEncoderContext");
    }

    public DN4(DN3 dn3) {
        this.A03 = dn3;
    }
}
