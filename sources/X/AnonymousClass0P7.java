package X;

/* renamed from: X.0P7  reason: invalid class name */
public abstract class AnonymousClass0P7 {
    public static final float A00 = ((25.0f * 2.0f) / 2.4142137f);

    public static final C17090tj A00(C17090tj r1) {
        return C04470Nn.A01(r1, AnonymousClass0O1.A01(), C15170qC.A00);
    }

    public static final void A01(C17130tn r2, C17090tj r3, int i) {
        int i2;
        r2.COC(694251107);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Q(r2, r3) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r2.BZO()) {
            C02280Dk.A00(r2, A00(C05130Qo.A0B(r3, A00, 25.0f)));
        } else {
            r2.CNR();
        }
        C05660Vf BKF = r2.BKF();
        if (BKF != null) {
            BKF.A03(new C12760mH(r3, i));
        }
    }

    public static final void A02(C17130tn r9, C17090tj r10, AnonymousClass1OS r11, int i, long j) {
        int i2;
        r9.COC(-5185995);
        int i3 = i;
        long j2 = j;
        if ((i & 14) == 0) {
            i2 = AnonymousClass000.A09(r9.BEe(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        C17090tj r4 = r10;
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0R(r9, r10);
        }
        AnonymousClass1OS r5 = r11;
        if ((i & 896) == 0) {
            i2 |= AnonymousClass001.A0c(r9, r11);
        }
        if ((i2 & 731) != 146 || !r9.BZO()) {
            r9.COB(-1739374713);
            boolean BEe = r9.BEe(j);
            Object CER = r9.CER();
            if (BEe || CER == AnonymousClass0MH.A00) {
                CER = new AnonymousClass0VL(j);
                r9.CRH(CER);
            }
            AnonymousClass0VR.A0T(r9);
            AnonymousClass0Q8.A02(AnonymousClass0CO.TopMiddle, (C16250rx) CER, r9, AnonymousClass0LC.A00(r9, new C13120mr(r10, r11), -1458480226), 432);
        } else {
            r9.CNR();
        }
        C05660Vf BKF = r9.BKF();
        if (BKF != null) {
            BKF.A03(new C13360nH(r4, r5, i3, j2));
        }
    }
}
