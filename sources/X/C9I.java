package X;

public abstract class C9I {
    public static final int A00(DRJ drj, int i) {
        if (drj.A02 < 0 || drj.A05 < 0 || drj.A01 < 0) {
            return 1;
        }
        DRJ.A03(drj);
        C25783Clu clu = CIN.A06;
        int i2 = 1;
        DRJ.A03(drj);
        int i3 = drj.A01;
        DRJ.A03(drj);
        int max = Math.max(i3, drj.A05);
        float f = (float) i;
        while (((float) (max / i2)) > f) {
            DRJ.A03(drj);
            if (drj.A07 == clu) {
                i2 *= 2;
            } else {
                i2++;
            }
        }
        return i2;
    }
}
