package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.Map;

/* renamed from: X.Co2  reason: case insensitive filesystem */
public abstract class C25891Co2 {
    public static final void A02(C17130tn r28, CharSequence charSequence, int i) {
        int i2;
        CharSequence charSequence2 = charSequence;
        C18070vi.A0d(charSequence2, 0);
        C17130tn r5 = r28;
        r5.COC(88388329);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = AnonymousClass001.A0a(r5, charSequence2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r5.BZO()) {
            if (charSequence2 instanceof C27069DRu) {
                r5.COB(-1347192548);
                C27069DRu dRu = (C27069DRu) charSequence2;
                AnonymousClass0PA.A00(r5, (C17090tj) null, dRu, (C26251Cvq) null, (C24693CGf) null, (C25823Cma) null, DSF.A02, (C26018CqZ) null, (C25827Cme) null, (Map) null, (C22821Di) null, 2, 1, 0, 199680, 3120, 251858, AnonymousClass0FW.A00(r5, 2131101314), C26054CrP.A02(17), 0, 0, false);
            } else {
                r5.COB(-1346946191);
                AnonymousClass0PA.A01(r5, (C17090tj) null, (C26251Cvq) null, (C24693CGf) null, (C25823Cma) null, DSF.A02, (C26018CqZ) null, (C25827Cme) null, charSequence2.toString(), (C22821Di) null, 2, 1, 0, 199680, 3120, 120786, AnonymousClass0FW.A00(r5, 2131101314), C26054CrP.A02(17), 0, 0, false);
            }
            AnonymousClass0VR.A0U(r5);
        } else {
            r5.CNR();
        }
        C05660Vf BKF = r5.BKF();
        if (BKF != null) {
            BKF.A06 = new C28186Dsw(charSequence2, i3);
        }
    }

    public static final void A01(C17130tn r42, C17090tj r43, AnonymousClass7EH r44, C22821Di r45, int i, int i2) {
        int i3;
        C17090tj r21 = r43;
        AnonymousClass7EH r2 = r44;
        C22821Di r15 = r45;
        boolean A17 = C18070vi.A17(r2, r15);
        C17130tn r1 = r42;
        r1.COC(-75484165);
        int i4 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AnonymousClass000.A09(r1.BEh(r2) ? 1 : 0) | i;
        } else {
            i3 = i4;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass001.A0b(r1, r15);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i4 & 384) == 0) {
            i3 |= AnonymousClass001.A0S(r1, r21);
        }
        if ((i3 & 147) != 146 || !r1.BZO()) {
            if (i5 != 0) {
                r21 = C17090tj.A00;
            }
            Object A0u = AnonymousClass000.A0u(r1, -775846038);
            Object obj = AnonymousClass0MH.A00;
            if (A0u == obj) {
                A0u = r2.A00();
                r1.CRH(A0u);
            }
            String str = (String) A0u;
            AnonymousClass0VR r0 = (AnonymousClass0VR) r1;
            AnonymousClass0VR.A0R(r0, false);
            C16340s6 r11 = AnonymousClass0MX.A03;
            C17090tj A06 = C05130Qo.A06(r21.CP5(C05130Qo.A01), 68.0f);
            r1.COB(-775837927);
            int i6 = i3 & 112;
            boolean A1T = AnonymousClass000.A1T(i6, 32) | r1.BEh(r2);
            Object CER = r1.CER();
            if (A1T || CER == obj) {
                CER = new C27828DmP(r2, r15);
                r1.CRH(CER);
            }
            AnonymousClass0VR.A0R(r0, false);
            C17090tj A05 = AnonymousClass0Q7.A05(C04470Nn.A01(A06, AnonymousClass0O1.A00, new C14860ph((C18090vk) CER)), 14.0f, 0.0f);
            C16870tM A0N = BEB.A0N(r1, r11);
            int i7 = r0.A01;
            C17350uW BPs = r1.BPs();
            C18090vk r14 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(A05);
            BEA.A19(r1, r0, r14);
            AnonymousClass1OS r13 = C05030Qc.A02;
            AnonymousClass0EM.A00(r1, A0N, r13);
            AnonymousClass1OS r12 = C05030Qc.A03;
            AnonymousClass0EM.A00(r1, BPs, r12);
            AnonymousClass1OS r112 = C05030Qc.A01;
            if (r0.A0K || !BE9.A1R(r1, i7)) {
                BE9.A19(r1, r112, i7);
            }
            Integer A0g = BE9.A0g(r1, A01);
            r1.COB(2058660585);
            A00(r1, (C17090tj) null, 0, A17 ? 1 : 0);
            C17090tj CP5 = AnonymousClass0Q7.A06(C17090tj.A00, 14.0f, 0.0f, 0.0f, 0.0f).CP5(new LayoutWeightElement());
            C16870tM A0Q = BEA.A0Q(r1);
            r1.COB(-1323940314);
            int i8 = r0.A01;
            C17350uW BPs2 = r1.BPs();
            AnonymousClass04D A012 = AnonymousClass0LO.A01(CP5);
            BEA.A19(r1, r0, r14);
            AnonymousClass0EM.A00(r1, A0Q, r13);
            AnonymousClass0EM.A00(r1, BPs2, r12);
            if (r0.A0K || !BE9.A1R(r1, i8)) {
                BE9.A19(r1, r112, i8);
            }
            BE9.A17(r1, A012, A0g);
            A02(r1, r2.A00, 0);
            long A02 = C26054CrP.A02(15);
            C17130tn r22 = r1;
            AnonymousClass0PA.A01(r22, (C17090tj) null, (C26251Cvq) null, (C24693CGf) null, (C25823Cma) null, (DSF) null, (C26018CqZ) null, (C25827Cme) null, str, (C22821Di) null, 2, A17 ? 1 : 0, 0, 3078, 3120, 120818, AnonymousClass0FW.A00(r1, 2131101312), A02, 0, 0, false);
            BEA.A18(r1, r0);
            r1.COB(921464472);
            boolean BEh = r1.BEh(r2) | AnonymousClass000.A1T(i6, 32);
            Object CER2 = r1.CER();
            if (BEh || CER2 == obj) {
                CER2 = new C27829DmQ(r2, r15);
                r1.CRH(CER2);
            }
            AnonymousClass0VR.A0R(r0, false);
            C04440Nk.A02((AnonymousClass0JY) null, (C17210uI) null, (AnonymousClass0tB) null, (AnonymousClass0Ip) null, (AnonymousClass0NL) null, r1, (C17090tj) null, (C16370s9) null, (C18090vk) CER2, CGB.A00, 805306368, 510, false);
            BEA.A18(r1, r0);
        } else {
            r1.CNR();
        }
        C05660Vf BKF = r1.BKF();
        if (BKF != null) {
            BKF.A06 = new Dt7(r21, r2, r15, i4, i2);
        }
    }

    public static final void A00(C17130tn r13, C17090tj r14, int i, int i2) {
        C17130tn r4 = r13;
        r13.COC(1735667318);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i5 = AnonymousClass001.A0Q(r13, r14) | i;
            } else {
                i5 = i;
            }
        }
        if ((i5 & 3) != 2 || !r13.BZO()) {
            if (i4 != 0) {
                r14 = C17090tj.A00;
            }
            C04640Oe A00 = AnonymousClass0LS.A00(r13, 2131231047);
            C02230Df.A00(r4, AnonymousClass0MX.A05, AnonymousClass0LF.A01(C05130Qo.A08(r14, 40.0f), C04540Nu.A00), (AnonymousClass0HD) null, A00, AnonymousClass0ML.A00, (String) null, 0.0f, 27696, 96);
        } else {
            r13.CNR();
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A06 = new Dt1(r14, i, i3);
        }
    }
}
