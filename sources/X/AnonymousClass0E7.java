package X;

/* renamed from: X.0E7  reason: invalid class name */
public abstract class AnonymousClass0E7 {
    public static final void A00(C17130tn r8, C17090tj r9, AnonymousClass1OS r10, int i, int i2) {
        r8.COC(-2105228848);
        int i3 = i2 & 1;
        int i4 = i | 6;
        if (i3 == 0) {
            if ((i & 14) == 0) {
                i4 = AnonymousClass001.A0Q(r8, r9) | i;
            } else {
                i4 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= AnonymousClass001.A0b(r8, r10);
        }
        if ((i4 & 91) != 18 || !r8.BZO()) {
            if (i3 != 0) {
                r9 = C17090tj.A00;
            }
            AnonymousClass0X6 r7 = AnonymousClass0X6.A00;
            int i5 = ((i4 << 3) & 112) | ((i4 >> 3) & 14) | 384;
            r8.COB(-1323940314);
            AnonymousClass0VR r2 = (AnonymousClass0VR) r8;
            int i6 = r2.A01;
            C17350uW BPs = r8.BPs();
            C18090vk A00 = C05030Qc.A00();
            AnonymousClass04D A01 = AnonymousClass0LO.A01(r9);
            int A0O = AnonymousClass001.A0O(r8, i5);
            if (r2.A0K) {
                r8.BHe(A00);
            } else {
                r8.CRc();
            }
            AnonymousClass0EM.A00(r8, r7, C05030Qc.A04());
            AnonymousClass0EM.A00(r8, BPs, C05030Qc.A06());
            AnonymousClass1OS A012 = C05030Qc.A01();
            if (r2.A0K || !C18070vi.A18(r8.CER(), Integer.valueOf(i6))) {
                r8.BCJ(AnonymousClass000.A0r(r8, i6), A012);
            }
            A01.invoke(new AnonymousClass0OT(r8), r8, AnonymousClass000.A0q(A0O));
            r8.COB(2058660585);
            r10.invoke(r8, AnonymousClass000.A0p(A0O >> 9));
            AnonymousClass0VR.A0R(r2, false);
            AnonymousClass0VR.A0J(r2);
        } else {
            r8.CNR();
        }
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A03(new C13410nM(r9, r10, i, i2));
        }
    }
}
