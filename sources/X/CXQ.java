package X;

public final class CXQ {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int A05;
    public final C26207Cui A06;
    public final C26207Cui A07;
    public final boolean A08;

    public boolean A00() {
        long A09;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        boolean z = this.A08;
        C26207Cui cui = this.A06;
        if (z) {
            A09 = cui.A0A();
        } else {
            A09 = cui.A09();
        }
        this.A04 = A09;
        if (i2 == this.A01) {
            C26207Cui cui2 = this.A07;
            this.A02 = cui2.A05();
            cui2.A0J(4);
            int i3 = this.A03 - 1;
            this.A03 = i3;
            if (i3 > 0) {
                i = cui2.A05() - 1;
            } else {
                i = -1;
            }
            this.A01 = i;
        }
        return true;
    }

    public CXQ(C26207Cui cui, C26207Cui cui2, boolean z) {
        this.A07 = cui;
        this.A06 = cui2;
        this.A08 = z;
        cui2.A0I(12);
        this.A05 = cui2.A05();
        cui.A0I(12);
        this.A03 = cui.A05();
        C84.A00(C17890vO.A1R(cui.A03()), "first_chunk must be 1");
    }
}
