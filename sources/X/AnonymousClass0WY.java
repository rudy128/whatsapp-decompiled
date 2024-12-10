package X;

/* renamed from: X.0WY  reason: invalid class name */
public class AnonymousClass0WY implements C16380sA {
    public final int A00;
    public final Object A01;

    public AnonymousClass0WY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final double Bdp(double d) {
        switch (this.A00) {
            case 0:
                return C016509i.A01((C016509i) this.A01, d);
            case 1:
                AnonymousClass0KB r0 = (AnonymousClass0KB) this.A01;
                double d2 = r0.A00;
                double d3 = r0.A01;
                double d4 = r0.A02;
                double d5 = r0.A03;
                double d6 = r0.A04;
                if (d >= d5) {
                    return Math.pow((d2 * d) + d3, d6);
                }
                return d * d4;
            case 2:
                return C016509i.A00((C016509i) this.A01, d);
            default:
                AnonymousClass0KB r2 = (AnonymousClass0KB) this.A01;
                double d7 = r2.A00;
                double d8 = r2.A01;
                double d9 = r2.A02;
                double d10 = r2.A03;
                double d11 = r2.A04;
                if (d >= d10 * d9) {
                    return (Math.pow(d, 1.0d / d11) - d8) / d7;
                }
                return d / d9;
        }
    }
}
