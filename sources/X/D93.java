package X;

public final class D93 implements E8X {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C26207Cui A04;

    public int BRp() {
        return -1;
    }

    public int BYT() {
        return this.A03;
    }

    public int CDS() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A04();
        }
        if (i == 16) {
            return this.A04.A06();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A042 = this.A04.A04();
        this.A00 = A042;
        return (A042 & 240) >> 4;
    }

    public D93(C22768BOh bOh) {
        C26207Cui cui = bOh.A00;
        this.A04 = cui;
        cui.A0I(12);
        this.A02 = cui.A05() & 255;
        this.A03 = cui.A05();
    }
}
