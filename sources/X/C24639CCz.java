package X;

import androidx.compose.foundation.layout.HorizontalAlignElement;

/* renamed from: X.CCz  reason: case insensitive filesystem */
public abstract class C24639CCz {
    public static final void A00(C17130tn r40, C17090tj r41, C18090vk r42, C18090vk r43, int i, int i2, boolean z, boolean z2) {
        int i3;
        String A00;
        C17090tj r19 = r41;
        C18090vk r15 = r42;
        C18070vi.A0d(r15, 1);
        C18090vk r11 = r43;
        C18070vi.A0d(r11, 2);
        C17130tn r0 = r40;
        r0.COC(-1596585280);
        int i4 = i;
        boolean z3 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AnonymousClass000.A09(r0.BEg(z3) ? 1 : 0) | i;
        } else {
            i3 = i4;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass001.A0b(r0, r15);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i4 & 384) == 0) {
            i3 |= AnonymousClass001.A0c(r0, r11);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i3 |= AnonymousClass001.A0T(r0, r19);
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i3 |= AnonymousClass000.A08(r0.BEg(z4) ? 1 : 0);
        }
        if ((i3 & 9363) != 9362 || !r0.BZO()) {
            if (i5 != 0) {
                r19 = C17090tj.A00;
            }
            C17090tj A06 = AnonymousClass0Q7.A06(r19.CP5(C05130Qo.A00), 0.0f, 8.0f, 0.0f, 20.0f);
            r0.COB(-483455358);
            C16870tM A002 = C03910Lc.A00(AnonymousClass0OB.A05, r0, AnonymousClass0MX.A02);
            r0.COB(-1323940314);
            AnonymousClass0VR r1 = (AnonymousClass0VR) r0;
            int i6 = r1.A01;
            C17350uW BPs = r0.BPs();
            C18090vk r7 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(A06);
            int i7 = ((((0 << 3) & 112) << 9) & 7168) | 6;
            BEA.A19(r0, r1, r7);
            BE9.A18(r0, A002, BPs);
            AnonymousClass1OS r72 = C05030Qc.A01;
            if (r1.A0K || !BE9.A1R(r0, i6)) {
                BE9.A19(r0, r72, i6);
            }
            BE8.A0y(r0, A01, new AnonymousClass0OT(r0), Integer.valueOf((i7 >> 3) & 112));
            r0.COB(-291263188);
            if (!z2) {
                CD2.A00(r0, (C17090tj) null, r15, (i3 >> 3) & 14, 2);
            }
            AnonymousClass0VR.A0R(r1, false);
            CD1.A00(r0, (C17090tj) null, 0, 3, false);
            if (z) {
                r0.COB(-439077821);
                A00 = AnonymousClass0LT.A00(r0, 2131892933);
                AnonymousClass0VR.A0R(r1, false);
            } else {
                r0.COB(-438980450);
                A00 = AnonymousClass0LT.A00(r0, 2131894328);
                AnonymousClass0VR.A0R(r1, false);
            }
            C16330s5 r73 = AnonymousClass0MX.A00;
            C17090tj A062 = AnonymousClass0Q7.A06(new HorizontalAlignElement(r73), 14.0f, 40.0f, 14.0f, 32.0f);
            long A003 = AnonymousClass0FW.A00(r0, 2131102439);
            long A02 = C26054CrP.A02(14);
            C17130tn r20 = r0;
            AnonymousClass0PA.A01(r20, A062, C26251Cvq.A01((C26251Cvq) r0.BFh(AnonymousClass0PA.A00), 0, 16646143, C26054CrP.A02(18)), (C24693CGf) null, (C25823Cma) null, (DSF) null, new C26018CqZ(3), (C25827Cme) null, A00, (C22821Di) null, 0, 0, 0, 3072, 0, 65008, A003, A02, 0, 0, false);
            r0.COB(-291238887);
            if (!z) {
                r0.COB(-291237314);
                boolean A1T = AnonymousClass000.A1T(i3 & 896, 256);
                Object CER = r0.CER();
                if (A1T || CER == AnonymousClass0MH.A00) {
                    CER = new C27714Djw(r11);
                    r0.CRH(CER);
                }
                AnonymousClass0VR.A0R(r1, false);
                C04440Nk.A00((AnonymousClass0JY) null, (C17210uI) null, (AnonymousClass0tB) null, (AnonymousClass0Ip) null, (AnonymousClass0NL) null, r0, new HorizontalAlignElement(r73), (C16370s9) null, (C18090vk) CER, CGC.A00, 805306368, 508, false);
            }
            AnonymousClass0VR.A0R(r1, false);
            BEA.A18(r0, r1);
        } else {
            r0.CNR();
        }
        C05660Vf BKF = r0.BKF();
        if (BKF != null) {
            BKF.A06 = new C28194DtC(r19, r15, r11, i4, i2, z, z2);
        }
    }
}
