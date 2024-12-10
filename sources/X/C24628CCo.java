package X;

/* renamed from: X.CCo  reason: case insensitive filesystem */
public abstract class C24628CCo {
    public static final void A00(C17130tn r33, C17090tj r34, String str, String str2, int i, int i2) {
        int i3;
        C17090tj r9 = r34;
        C17130tn r13 = r33;
        r13.COC(108507457);
        String str3 = str;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AnonymousClass001.A0Z(r13, str3) | i;
        } else {
            i3 = i4;
        }
        String str4 = str2;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass001.A0R(r13, str4);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i4 & 384) == 0) {
            i3 |= AnonymousClass001.A0S(r13, r9);
        }
        if ((i3 & 147) != 146 || !r13.BZO()) {
            if (i5 != 0) {
                r9 = C17090tj.A00;
            }
            C16870tM A0Q = BEA.A0Q(r13);
            r13.COB(-1323940314);
            AnonymousClass0VR r1 = (AnonymousClass0VR) r13;
            int i6 = r1.A01;
            C17350uW BPs = r13.BPs();
            C18090vk r4 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(r9);
            int i7 = ((((((i3 >> 6) & 14) << 3) & 112) << 9) & 7168) | 6;
            BEA.A19(r13, r1, r4);
            BE9.A18(r13, A0Q, BPs);
            AnonymousClass1OS r42 = C05030Qc.A01;
            if (r1.A0K || !BE9.A1R(r13, i6)) {
                BE9.A19(r13, r42, i6);
            }
            BE8.A0y(r13, A01, new AnonymousClass0OT(r13), Integer.valueOf((i7 >> 3) & 112));
            AnonymousClass0WC r43 = C17090tj.A00;
            AnonymousClass07W r3 = CG8.A00;
            r13.BFh(r3);
            C17090tj A06 = AnonymousClass0Q7.A06(r43, 0.0f, 16.0f, 0.0f, 0.0f);
            AnonymousClass07W r5 = CGA.A00;
            C26251Cvq cvq = ((C25618Ciy) r13.BFh(r5)).A00;
            AnonymousClass07W r6 = CG7.A00;
            String str5 = str3;
            AnonymousClass0PA.A01(r13, A06, cvq, (C24693CGf) null, (C25823Cma) null, (DSF) null, (C26018CqZ) null, (C25827Cme) null, str5, (C22821Di) null, 0, 0, 0, i3 & 14, 0, 65528, C26257Cw2.A01(r13, r6), 0, 0, 0, false);
            r13.BFh(r3);
            r13.BFh(r3);
            String str6 = str4;
            AnonymousClass0PA.A01(r13, AnonymousClass0Q7.A06(r43, 0.0f, 2.0f, 0.0f, 16.0f), ((C25618Ciy) r13.BFh(r5)).A02, (C24693CGf) null, (C25823Cma) null, (DSF) null, (C26018CqZ) null, (C25827Cme) null, str6, (C22821Di) null, 0, 0, 0, (i3 >> 3) & 14, 0, 65528, C26257Cw2.A05(r13, r6), 0, 0, 0, false);
            BEA.A18(r13, r1);
        } else {
            r13.CNR();
        }
        C05660Vf BKF = r13.BKF();
        if (BKF != null) {
            BKF.A06 = new DX3(r9, str3, str4, i4, i2);
        }
    }
}
