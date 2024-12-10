package X;

/* renamed from: X.0Cp  reason: invalid class name and case insensitive filesystem */
public final class C02070Cp {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public boolean A06;

    public final long A00(float f, float f2, long j) {
        double d;
        double d2;
        if (!this.A06) {
            if (this.A05 != Float.MAX_VALUE) {
                float f3 = this.A04;
                double d3 = (double) f3;
                double d4 = d3 * d3;
                if (f3 > 1.0f) {
                    double d5 = this.A03;
                    double d6 = ((double) (-f3)) * d5;
                    double sqrt = d5 * Math.sqrt(d4 - 1.0d);
                    this.A02 = d6 + sqrt;
                    this.A01 = d6 - sqrt;
                } else if (f3 >= 0.0f && f3 < 1.0f) {
                    this.A00 = this.A03 * Math.sqrt(1.0d - d4);
                }
                this.A06 = true;
            } else {
                throw AnonymousClass000.A0n("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f4 = this.A05;
        float f5 = f - f4;
        double d7 = ((double) j) / 1000.0d;
        float f6 = this.A04;
        float f7 = f2;
        if (f6 > 1.0f) {
            double d8 = (double) f5;
            double d9 = this.A01;
            double d10 = this.A02;
            double d11 = ((d8 * d9) - ((double) f7)) / (d9 - d10);
            double d12 = d8 - d11;
            double exp = Math.exp(d9 * d7);
            double exp2 = Math.exp(d10 * d7);
            d = (exp * d12) + (exp2 * d11);
            d2 = (d12 * d9 * exp) + (d11 * d10 * exp2);
        } else if (f6 == 1.0f) {
            double d13 = this.A03;
            double d14 = (double) f5;
            double d15 = ((double) f7) + (d14 * d13);
            double d16 = -d13;
            double exp3 = Math.exp(d16 * d7);
            d = exp3 * (d14 + (d15 * d7));
            d2 = (d15 * exp3) + (d * d16);
        } else {
            double d17 = this.A00;
            double d18 = (double) f6;
            double d19 = this.A03;
            double d20 = (double) f5;
            double d21 = (1.0d / d17) * ((d18 * d19 * d20) + ((double) f7));
            double exp4 = Math.exp(((double) (-f6)) * d19 * d7);
            double d22 = d17 * d7;
            double cos = Math.cos(d22);
            double sin = Math.sin(d22);
            d = exp4 * ((d20 * cos) + (sin * d21));
            d2 = ((-d19) * d * d18) + (exp4 * (((-d17) * d20 * sin) + (d21 * d17 * cos)));
        }
        return AnonymousClass001.A0p((float) (d + ((double) f4)), (float) d2);
    }
}
