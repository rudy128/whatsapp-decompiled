package X;

/* renamed from: X.0Do  reason: invalid class name and case insensitive filesystem */
public abstract class C02320Do {
    public static final void A00(C16610si r8, C17130tn r9, Object obj, Object obj2, int i, int i2) {
        int i3;
        r9.COC(1439843069);
        int i4 = i2;
        C16610si r3 = r8;
        if ((i2 & 14) == 0) {
            i3 = AnonymousClass001.A0Z(r9, r8) | i2;
        } else {
            i3 = i2;
        }
        Object obj3 = obj;
        if ((i2 & 112) == 0) {
            i3 |= AnonymousClass001.A0R(r9, obj);
        }
        int i5 = i;
        if ((i2 & 896) == 0) {
            int i6 = 128;
            if (r9.BEd(i)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        Object obj4 = obj2;
        if ((i2 & 7168) == 0) {
            i3 |= AnonymousClass001.A0T(r9, obj2);
        }
        if ((i3 & 5851) != 1170 || !r9.BZO()) {
            ((C16670so) obj3).BAG(r9, obj2, AnonymousClass0LC.A00(r9, new C12810mM(r8, obj2, i), 980966366), 568);
        } else {
            r9.CNR();
        }
        C05660Vf BKF = r9.BKF();
        if (BKF != null) {
            BKF.A03(new C12870mS(r3, obj3, obj4, i5, i4));
        }
    }
}
