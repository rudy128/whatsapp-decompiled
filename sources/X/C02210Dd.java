package X;

/* renamed from: X.0Dd  reason: invalid class name and case insensitive filesystem */
public abstract class C02210Dd {
    public static final void A00(C17130tn r2, C17090tj r3, C22821Di r4, int i) {
        int i2;
        r2.COC(-932836462);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r2, r3) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0b(r2, r4);
        }
        if ((i2 & 91) != 18 || !r2.BZO()) {
            C02280Dk.A00(r2, C04490Np.A00(r3, r4));
        } else {
            r2.CNR();
        }
        C05660Vf BKF = r2.BKF();
        if (BKF != null) {
            BKF.A03(new AnonymousClass0n1(r3, r4, i));
        }
    }
}
