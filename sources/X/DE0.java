package X;

public class DE0 implements EA3 {
    public EA3 A00;
    public final BUT A01 = new BUT();

    public void A00(int i, int i2, int i3, int i4) {
        BUT but = this.A01;
        if (but.A02 != i || but.A03 != i2 || but.A01 != i3 || but.A00 != i4) {
            but.A02 = i;
            but.A03 = i2;
            but.A01 = i3;
            but.A00 = i4;
            but.A01 = true;
        }
    }

    public int BOx() {
        return this.A00.BOx();
    }

    public int BQb() {
        return this.A00.BQb();
    }

    public C3L BSL() {
        return this.A00.BSL();
    }

    public int BVv() {
        return this.A00.BVv();
    }

    public long BaR() {
        return this.A00.BaR();
    }

    public CWX Bbf() {
        CWX Bbf = this.A00.Bbf();
        if (Bbf != null) {
            BUT but = this.A01;
            but.A09(Bbf.A03);
            int i = Bbf.A01;
            int i2 = Bbf.A00;
            but.A07(i, i2, i, i2, 0, false, false);
        }
        return this.A01.A06();
    }

    public boolean Bev() {
        return this.A00.Bev();
    }

    public CZB getTexture() {
        return this.A00.getTexture();
    }
}
