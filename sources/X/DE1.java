package X;

public class DE1 implements EA3 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public CZB A04;
    public CWX A05;
    public boolean A06;

    public void A00(float[] fArr) {
        CZB czb = this.A04;
        if (czb != null) {
            System.arraycopy(fArr, 0, czb.A02.A03, 0, 16);
        }
    }

    public int BOx() {
        return this.A00;
    }

    public int BQb() {
        return this.A01;
    }

    public C3L BSL() {
        return null;
    }

    public int BVv() {
        return this.A02;
    }

    public long BaR() {
        return this.A03;
    }

    public CWX Bbf() {
        return this.A05;
    }

    public boolean Bev() {
        return this.A06;
    }

    public CZB getTexture() {
        return this.A04;
    }
}
