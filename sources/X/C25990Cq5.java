package X;

/* renamed from: X.Cq5  reason: case insensitive filesystem */
public final class C25990Cq5 {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public boolean A08;
    public final CMP A09 = A00(this);

    public CMP A01(double d, double d2, long j) {
        double d3;
        double d4;
        double d5;
        double d6;
        if (!this.A08) {
            if (this.A02 != Double.MAX_VALUE) {
                double d7 = this.A01;
                if (d7 > 1.0d) {
                    double d8 = this.A05;
                    double d9 = (-d7) * d8;
                    double sqrt = d8 * Math.sqrt((d7 * d7) - 1.0d);
                    this.A04 = d9 + sqrt;
                    this.A03 = d9 - sqrt;
                } else if (d7 >= 0.0d && d7 < 1.0d) {
                    this.A00 = this.A05 * Math.sqrt(1.0d - (d7 * d7));
                }
                this.A08 = true;
            } else {
                throw AnonymousClass000.A0n("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d10 = ((double) j) / 1000.0d;
        double d11 = this.A02;
        double d12 = d - d11;
        double d13 = this.A01;
        if (d13 > 1.0d) {
            double d14 = this.A03;
            double d15 = this.A04;
            double d16 = ((d14 * d12) - d2) / (d14 - d15);
            double d17 = d12 - d16;
            double pow = Math.pow(2.718281828459045d, d14 * d10);
            double pow2 = Math.pow(2.718281828459045d, d15 * d10);
            d3 = (pow * d17) + (pow2 * d16);
            d6 = d17 * d14 * pow;
            d5 = d16 * d15 * pow2;
        } else if (d13 == 1.0d) {
            double d18 = this.A05;
            double d19 = d2 + (d18 * d12);
            double d20 = -d18;
            double pow3 = Math.pow(2.718281828459045d, d20 * d10);
            d3 = pow3 * ((d19 * d10) + d12);
            d5 = d3 * d20;
            d6 = d19 * pow3;
        } else {
            double d21 = this.A00;
            double d22 = this.A05;
            double d23 = (1.0d / d21) * ((d13 * d22 * d12) + d2);
            double pow4 = Math.pow(2.718281828459045d, (-d13) * d22 * d10);
            double d24 = d21 * d10;
            double cos = Math.cos(d24);
            double sin = Math.sin(d24);
            d3 = pow4 * ((cos * d12) + (sin * d23));
            d4 = ((-d22) * d3 * d13) + (pow4 * (((-d21) * d12 * sin) + (d23 * d21 * cos)));
            CMP cmp = this.A09;
            cmp.A00 = (float) (d3 + d11);
            cmp.A01 = (float) d4;
            return cmp;
        }
        d4 = d6 + d5;
        CMP cmp2 = this.A09;
        cmp2.A00 = (float) (d3 + d11);
        cmp2.A01 = (float) d4;
        return cmp2;
    }

    public C25990Cq5(float f) {
        this.A02 = (double) f;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.CMP] */
    public static CMP A00(C25990Cq5 cq5) {
        cq5.A05 = Math.sqrt(1500.0d);
        cq5.A01 = 0.5d;
        cq5.A08 = false;
        cq5.A02 = Double.MAX_VALUE;
        return new Object();
    }

    public C25990Cq5() {
    }
}
