package X;

import androidx.compose.ui.Alignment;

public abstract class CD2 {
    public static final void A00(C17130tn r39, C17090tj r40, C18090vk r41, int i, int i2) {
        int i3;
        long j;
        C17090tj r18 = r40;
        C18090vk r15 = r41;
        C18070vi.A0d(r15, 0);
        C17130tn r0 = r39;
        r0.COC(-284508356);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AnonymousClass000.A09(r0.BEh(r15) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass001.A0R(r0, r18);
        }
        if ((i3 & 19) != 18 || !r0.BZO()) {
            if (i6 != 0) {
                r18 = C17090tj.A00;
            }
            C16340s6 r7 = AnonymousClass0MX.A03;
            boolean z = true;
            C17090tj A06 = C05130Qo.A06(r18.CP5(C05130Qo.A01), 68.0f);
            r0.COB(-1235166635);
            if ((i3 & 14) != 4) {
                z = false;
            }
            Object CER = r0.CER();
            if (z || CER == AnonymousClass0MH.A00) {
                CER = new C27715Djx(r15);
                r0.CRH(CER);
            }
            AnonymousClass0VR r3 = (AnonymousClass0VR) r0;
            AnonymousClass0VR.A0R(r3, false);
            C17090tj A05 = AnonymousClass0Q7.A05(C04470Nn.A01(A06, AnonymousClass0O1.A00, new C14860ph((C18090vk) CER)), 14.0f, 0.0f);
            r0.COB(693286680);
            C16870tM A00 = C03930Le.A00(AnonymousClass0OB.A01, r0, r7);
            r0.COB(-1323940314);
            int i7 = r3.A01;
            C17350uW BPs = r0.BPs();
            C18090vk r13 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(A05);
            BEA.A19(r0, r3, r13);
            AnonymousClass1OS r12 = C05030Qc.A02;
            AnonymousClass0EM.A00(r0, A00, r12);
            AnonymousClass1OS r11 = C05030Qc.A03;
            AnonymousClass0EM.A00(r0, BPs, r11);
            AnonymousClass1OS r10 = C05030Qc.A01;
            if (r3.A0K || !BE9.A1R(r0, i7)) {
                BE9.A19(r0, r10, i7);
            }
            Integer A0g = BE9.A0g(r0, A01);
            r0.COB(2058660585);
            Alignment alignment = AnonymousClass0MX.A05;
            AnonymousClass0WC r4 = C17090tj.A00;
            AnonymousClass07W r8 = CG7.A00;
            C17090tj A08 = C05130Qo.A08(C02190Db.A00(r4, C04540Nu.A00, C26257Cw2.A06(r0, r8)), 40.0f);
            r0.COB(733328855);
            C16870tM A002 = C04870Pg.A00(r0, alignment, false);
            r0.COB(-1323940314);
            int i8 = r3.A01;
            C17350uW BPs2 = r0.BPs();
            AnonymousClass04D A012 = AnonymousClass0LO.A01(A08);
            BEA.A19(r0, r3, r13);
            AnonymousClass0EM.A00(r0, A002, r12);
            AnonymousClass0EM.A00(r0, BPs2, r11);
            if (r3.A0K || !BE9.A1R(r0, i8)) {
                BE9.A19(r0, r10, i8);
            }
            BE9.A17(r0, A012, A0g);
            C04640Oe A003 = AnonymousClass0LS.A00(r0, 2131232296);
            C17050tf r25 = AnonymousClass0ML.A00;
            C26257Cw2 A0g2 = BE6.A0g(r0, r8);
            if (A0g2 instanceof BqD) {
                j = ((BqD) A0g2).A0B;
            } else {
                j = ((BqC) A0g2).A0B;
            }
            C17130tn r20 = r0;
            C02230Df.A00(r20, (Alignment) null, C05130Qo.A08(AnonymousClass0Q7.A04(r4, 8.0f), 40.0f), new AnonymousClass09Z(j, 5), A003, r25, (String) null, 0.0f, 25008, 40);
            BEA.A18(r0, r3);
            String A004 = AnonymousClass0LT.A00(r0, 2131896095);
            long A005 = AnonymousClass0FW.A00(r0, 2131101314);
            long A02 = C26054CrP.A02(17);
            C17130tn r19 = r0;
            AnonymousClass0PA.A01(r19, AnonymousClass0Q7.A06(r4, 14.0f, 0.0f, 0.0f, 0.0f), (C26251Cvq) null, (C24693CGf) null, (C25823Cma) null, DSF.A02, (C26018CqZ) null, (C25827Cme) null, A004, (C22821Di) null, 2, 1, 0, 199728, 3120, 120784, A005, A02, 0, 0, false);
            BEA.A18(r0, r3);
        } else {
            r0.CNR();
        }
        C05660Vf BKF = r0.BKF();
        if (BKF != null) {
            BKF.A06 = new Dt3(r18, r15, i5, i4);
        }
    }
}
