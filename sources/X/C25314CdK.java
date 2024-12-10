package X;

/* renamed from: X.CdK  reason: case insensitive filesystem */
public abstract class C25314CdK {
    public static C26132Csv A01(C26132Csv csv, C26132Csv csv2) {
        int i = csv.A02;
        int i2 = csv.A01;
        double A00 = A00(i, i2);
        int i3 = csv2.A02;
        int i4 = csv2.A01;
        if (BE6.A01(A00, A00(i3, i4)) <= 0.019999999552965164d) {
            return null;
        }
        if ((i - i2) * (i3 - i4) < 0) {
            csv2 = new C26132Csv(i4, i3);
        }
        float f = (float) csv2.A01;
        float f2 = (float) csv2.A02;
        int i5 = (int) (((float) i) * (f / f2));
        if (i5 <= i2) {
            return new C26132Csv(i, i5);
        }
        return new C26132Csv((int) (((float) i2) * (f2 / f)), i2);
    }

    public static double A00(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return ((double) Math.max(i, i2)) / ((double) Math.min(i, i2));
    }
}
