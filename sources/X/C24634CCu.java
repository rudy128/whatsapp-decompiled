package X;

/* renamed from: X.CCu  reason: case insensitive filesystem */
public abstract class C24634CCu {
    public static final void A00(C17130tn r51, C22821Di r52, int i, int i2, boolean z, boolean z2) {
        int i3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        C22821Di r14 = r52;
        boolean z3 = z2;
        boolean z4 = z;
        C17130tn r2 = r51;
        r2.COC(227117790);
        int i4 = i2 & 1;
        int i5 = i;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AnonymousClass000.A09(r2.BEg(z4) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass000.A0A(r2.BEg(z3) ? 1 : 0);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= AnonymousClass001.A0c(r2, r14);
        }
        if ((i3 & 147) != 146 || !r2.BZO()) {
            boolean z5 = true;
            if (i4 != 0) {
                z4 = true;
            }
            if (i6 != 0) {
                z3 = true;
            }
            if (i7 != 0) {
                r14 = new C27139DWa(3);
            }
            Object A0u = AnonymousClass000.A0u(r2, 1700703002);
            Object obj = AnonymousClass0MH.A00;
            if (A0u == obj) {
                A0u = AnonymousClass0Q9.A02(Boolean.valueOf(z4));
                r2.CRH(A0u);
            }
            C17330uU r5 = (C17330uU) A0u;
            AnonymousClass0VR r8 = (AnonymousClass0VR) r2;
            AnonymousClass0VR.A0R(r8, false);
            boolean A1b = AnonymousClass001.A1b(r5);
            r2.COB(-755613635);
            AnonymousClass07W r3 = CG7.A00;
            long A02 = C26257Cw2.A02(r2, r3);
            long A06 = C26257Cw2.A06(r2, r3);
            long A062 = C26257Cw2.A06(r2, r3);
            long A063 = C26257Cw2.A06(r2, r3);
            C26257Cw2 A0g = BE6.A0g(r2, r3);
            if (A0g instanceof BqD) {
                j = ((BqD) A0g).A0A;
            } else {
                j = ((BqC) A0g).A0A;
            }
            long j7 = j;
            C26257Cw2 A0g2 = BE6.A0g(r2, r3);
            if (A0g2 instanceof BqD) {
                j2 = ((BqD) A0g2).A07;
            } else {
                j2 = ((BqC) A0g2).A07;
            }
            long j8 = j2;
            C26257Cw2 A0g3 = BE6.A0g(r2, r3);
            if (A0g3 instanceof BqD) {
                j3 = ((BqD) A0g3).A0A;
            } else {
                j3 = ((BqC) A0g3).A0A;
            }
            C26257Cw2 A0g4 = BE6.A0g(r2, r3);
            if (A0g4 instanceof BqD) {
                j4 = ((BqD) A0g4).A0A;
            } else {
                j4 = ((BqC) A0g4).A0A;
            }
            long A03 = C26257Cw2.A03(r2, r3);
            C26257Cw2 A0g5 = BE6.A0g(r2, r3);
            if (A0g5 instanceof BqD) {
                j5 = ((BqD) A0g5).A07;
            } else {
                j5 = ((BqC) A0g5).A07;
            }
            long A032 = C26257Cw2.A03(r2, r3);
            long A033 = C26257Cw2.A03(r2, r3);
            long A034 = C26257Cw2.A03(r2, r3);
            C26257Cw2 A0g6 = BE6.A0g(r2, r3);
            if (A0g6 instanceof BqD) {
                j6 = ((BqD) A0g6).A07;
            } else {
                j6 = ((BqC) A0g6).A07;
            }
            long A035 = C26257Cw2.A03(r2, r3);
            long A036 = C26257Cw2.A03(r2, r3);
            r2.COB(1937926421);
            AnonymousClass0J3 r19 = new AnonymousClass0J3(A02, A06, A062, A063, j7, j8, j3, j4, A03, j5, A032, A033, A034, j6, A035, A036);
            AnonymousClass0VR.A0R(r8, false);
            AnonymousClass0VR.A0R(r8, false);
            r2.COB(1700708353);
            if ((i3 & 896) != 256) {
                z5 = false;
            }
            Object CER = r2.CER();
            if (z5 || CER == obj) {
                CER = new C27141DWc(r14, r5, 2);
                r2.CRH(CER);
            }
            AnonymousClass0VR.A0R(r8, false);
            AnonymousClass0QL.A06((C17210uI) null, r19, r2, (C17090tj) null, (C22821Di) CER, (AnonymousClass1OS) null, (i3 << 9) & 57344, 76, A1b, z3);
        } else {
            r2.CNR();
        }
        C05660Vf BKF = r2.BKF();
        if (BKF != null) {
            BKF.A06 = new DX4(r14, i5, i2, z4, z3);
        }
    }
}
