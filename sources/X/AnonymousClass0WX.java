package X;

/* renamed from: X.0WX  reason: invalid class name */
public class AnonymousClass0WX implements C16380sA {
    public final double A00;
    public final int A01;

    public AnonymousClass0WX(int i, double d) {
        this.A01 = i;
        this.A00 = d;
    }

    public final double Bdp(double d) {
        int i = this.A01;
        double d2 = this.A00;
        int i2 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i != 0) {
            if (i2 < 0) {
                d = 0.0d;
            }
            return Math.pow(d, d2);
        }
        if (i2 < 0) {
            d = 0.0d;
        }
        return Math.pow(d, 1.0d / d2);
    }
}
