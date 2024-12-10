package X;

public abstract class CD1 {
    public static final void A00(C17130tn r28, C17090tj r29, int i, int i2, boolean z) {
        DSF dsf;
        boolean z2 = z;
        C17090tj r2 = r29;
        C17130tn r8 = r28;
        r8.COC(654557652);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r8, r2) | i;
            } else {
                i6 = i5;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass000.A0A(r8.BEg(z2) ? 1 : 0);
        }
        if ((i6 & 19) != 18 || !r8.BZO()) {
            if (i4 != 0) {
                r2 = C17090tj.A00;
            }
            if (i7 != 0) {
                z2 = false;
            }
            String A00 = AnonymousClass0LT.A00(r8, 2131899050);
            C17090tj A05 = AnonymousClass0Q7.A05(r2, 14.0f, 8.0f);
            long A002 = AnonymousClass0FW.A00(r8, 2131101321);
            long A02 = C26054CrP.A02(14);
            if (z2) {
                dsf = DSF.A02;
            } else {
                dsf = null;
            }
            AnonymousClass0PA.A01(r8, A05, (C26251Cvq) null, (C24693CGf) null, (C25823Cma) null, dsf, (C26018CqZ) null, (C25827Cme) null, A00, (C22821Di) null, 0, 1, 0, 3072, 3072, 122832, A002, A02, 0, 0, false);
        } else {
            r8.CNR();
        }
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A06 = new C28189Dt2(r2, i5, i3, z2);
        }
    }
}
