package X;

/* renamed from: X.0WW  reason: invalid class name */
public class AnonymousClass0WW implements C16380sA {
    public final int A00;

    public AnonymousClass0WW(int i) {
        this.A00 = i;
    }

    public final double Bdp(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6 = d;
        switch (this.A00) {
            case 0:
                C016509i r0 = C03090Go.A03;
                if (d < 0.0d) {
                    d4 = -d6;
                } else {
                    d4 = d6;
                }
                if (d4 >= 0.04045d * 0.07739938080495357d) {
                    d5 = (Math.pow(d4, 1.0d / 2.4d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d5 = d4 / 0.07739938080495357d;
                }
                return Math.copySign(d5, d6);
            case 1:
                C016509i r02 = C03090Go.A03;
                if (d < 0.0d) {
                    d2 = -d6;
                } else {
                    d2 = d6;
                }
                if (d2 >= 0.04045d) {
                    d3 = Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d);
                } else {
                    d3 = d2 * 0.07739938080495357d;
                }
                return Math.copySign(d3, d6);
            default:
                return d6;
        }
    }
}
