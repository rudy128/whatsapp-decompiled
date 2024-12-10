package X;

/* renamed from: X.CCi  reason: case insensitive filesystem */
public abstract class C24622CCi {
    public static final void A00(C17130tn r14, C17090tj r15, C24323BzK bzK, int i, int i2) {
        C24323BzK bzK2 = bzK;
        C17090tj r6 = r15;
        C17130tn r5 = r14;
        r14.COC(647767549);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r5, r15) | i;
            } else {
                i6 = i5;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0R(r5, bzK2);
        }
        if ((i6 & 19) != 18 || !r5.BZO()) {
            if (i4 != 0) {
                r6 = C17090tj.A00;
            }
            if (i7 != 0) {
                bzK2 = C24323BzK.A03;
            }
            AnonymousClass0ED.A00(r5, r6, bzK2.thickness, i6 & 14, 0, BE6.A0g(r5, CG7.A00).A08());
        } else {
            r5.CNR();
        }
        C05660Vf BKF = r5.BKF();
        if (BKF != null) {
            BKF.A06 = new C27148DWj(r6, i5, bzK2, i3, 1);
        }
    }
}
