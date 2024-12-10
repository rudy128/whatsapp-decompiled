package X;

/* renamed from: X.CCq  reason: case insensitive filesystem */
public abstract class C24630CCq {
    public static final void A00(C17130tn r18, C17090tj r19, C24265ByO byO, int i, int i2) {
        long A06;
        int i3;
        int i4;
        float f;
        long j;
        C17090tj r9;
        C24265ByO byO2 = byO;
        C17090tj r2 = r19;
        C17130tn r8 = r18;
        r8.COC(-399016872);
        int i5 = i2;
        int i6 = i2 & 1;
        int i7 = i;
        int i8 = i | 6;
        if (i6 == 0) {
            if ((i & 6) == 0) {
                i8 = AnonymousClass001.A0Q(r8, r2) | i;
            } else {
                i8 = i7;
            }
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            i8 |= AnonymousClass001.A0R(r8, byO2);
        }
        if ((i8 & 19) != 18 || !r8.BZO()) {
            if (i6 != 0) {
                r2 = C17090tj.A00;
            }
            if (i9 != 0) {
                byO2 = C24265ByO.NORMAL;
            }
            int ordinal = byO2.ordinal();
            if (ordinal == 0) {
                r8.COB(-801251941);
                A06 = C26257Cw2.A06(r8, CG7.A00);
                i3 = i8 & 14;
                i4 = 28;
                f = 0.0f;
                j = 0;
                r9 = r2;
            } else if (ordinal == 1) {
                r8.COB(-801247578);
                long j2 = CIM.A00;
                r9 = C05130Qo.A08(r2, 24.0f);
                A06 = C26257Cw2.A06(r8, CG7.A00);
                f = 2.0f;
                i3 = 384;
                i4 = 24;
                j = 0;
            } else {
                r8.COB(-801253681);
                AnonymousClass0VR.A0U(r8);
                throw AnonymousClass3MW.A14();
            }
            AnonymousClass0QN.A03(r8, r9, f, 0, i3, i4, A06, j);
            AnonymousClass0VR.A0U(r8);
        } else {
            r8.CNR();
        }
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A06 = new C27148DWj(r2, i7, byO2, i5, 2);
        }
    }
}
