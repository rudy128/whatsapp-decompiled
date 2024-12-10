package X;

import java.util.Comparator;

public class DUQ implements Comparator {
    public final double A00;
    public final double A01;
    public final int A02;

    public DUQ(double d, double d2, int i) {
        this.A02 = i;
        this.A00 = d;
        this.A01 = d2;
    }

    public final int compare(Object obj, Object obj2) {
        if (this.A02 != 0) {
            double d = this.A00;
            double d2 = this.A01;
            return Double.compare(A00((C25280Ccd) obj, d, d2), A00((C25280Ccd) obj2, d, d2));
        }
        double d3 = this.A00;
        double d4 = this.A01;
        C20269AEc aEc = ((BPT) obj).A0E;
        double d5 = aEc.A00 - d3;
        double d6 = aEc.A01 - d4;
        double d7 = (d5 * d5) + (d6 * d6);
        C20269AEc aEc2 = ((BPT) obj2).A0E;
        double d8 = aEc2.A00 - d3;
        double d9 = aEc2.A01 - d4;
        return Double.compare(d7, (d8 * d8) + (d9 * d9));
    }

    public static double A00(C25280Ccd ccd, double d, double d2) {
        return ((ccd.A00().A00 - d) * (ccd.A00().A00 - d)) + ((ccd.A00().A01 - d2) * (ccd.A00().A01 - d2));
    }
}
