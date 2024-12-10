package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Alignment;

/* renamed from: X.CCx  reason: case insensitive filesystem */
public abstract class C24637CCx {
    public static final void A00(C17130tn r38, C17090tj r39, String str, C18090vk r41, int i, int i2) {
        C17090tj r5 = r39;
        C18070vi.A0d(str, 0);
        C18090vk r4 = r41;
        C18070vi.A0d(r4, 1);
        C17130tn r2 = r38;
        r2.COC(-951904419);
        int i3 = i2;
        int i4 = i;
        int i5 = i | 6;
        if ((i2 & 1) == 0) {
            i5 = i4;
            if ((i & 6) == 0) {
                i5 = AnonymousClass001.A0Q(r2, str) | i;
            }
        }
        if ((i2 & 2) != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= AnonymousClass001.A0b(r2, r4);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i4 & 384) == 0) {
            i5 |= AnonymousClass001.A0S(r2, r5);
        }
        if ((i5 & 147) != 146 || !r2.BZO()) {
            if (i6 != 0) {
                r5 = C17090tj.A00;
            }
            FillElement fillElement = C05130Qo.A01;
            C17090tj CP5 = r5.CP5(fillElement);
            C16870tM A0Q = BEA.A0Q(r2);
            r2.COB(-1323940314);
            AnonymousClass0VR r0 = (AnonymousClass0VR) r2;
            int i7 = r0.A01;
            C17350uW BPs = r2.BPs();
            C18090vk r14 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(CP5);
            BEA.A19(r2, r0, r14);
            AnonymousClass1OS r13 = C05030Qc.A02;
            AnonymousClass0EM.A00(r2, A0Q, r13);
            AnonymousClass1OS r12 = C05030Qc.A03;
            AnonymousClass0EM.A00(r2, BPs, r12);
            AnonymousClass1OS r11 = C05030Qc.A01;
            if (r0.A0K || !BE9.A1R(r2, i7)) {
                BE9.A19(r2, r11, i7);
            }
            Integer A0g = BE9.A0g(r2, A01);
            r2.COB(2058660585);
            Alignment alignment = AnonymousClass0MX.A05;
            C17090tj A05 = AnonymousClass0Q7.A05(C05130Qo.A06(C17090tj.A00, 68.0f), 14.0f, 0.0f);
            C16870tM A0S = BEA.A0S(r2, alignment);
            int i8 = r0.A01;
            C17350uW BPs2 = r2.BPs();
            AnonymousClass04D A012 = AnonymousClass0LO.A01(A05);
            BEA.A19(r2, r0, r14);
            AnonymousClass0EM.A00(r2, A0S, r13);
            AnonymousClass0EM.A00(r2, BPs2, r12);
            if (r0.A0K || !BE9.A1R(r2, i8)) {
                BE9.A19(r2, r11, i8);
            }
            BE9.A17(r2, A012, A0g);
            String A013 = AnonymousClass0LT.A01(r2, BE7.A1b(str), 2131895497);
            long A02 = C26054CrP.A02(17);
            C17130tn r142 = r2;
            AnonymousClass0PA.A01(r142, fillElement, (C26251Cvq) null, (C24693CGf) null, (C25823Cma) null, DSF.A02, new C26018CqZ(3), (C25827Cme) null, A013, (C22821Di) null, 2, 1, 0, 199728, 3120, 120272, AnonymousClass0FW.A00(r2, 2131101314), A02, 0, 0, false);
            BEA.A18(r2, r0);
            CD2.A00(r2, (C17090tj) null, r4, (i5 >> 3) & 14, 2);
            BEA.A18(r2, r0);
        } else {
            r2.CNR();
        }
        C05660Vf BKF = r2.BKF();
        if (BKF != null) {
            BKF.A06 = new Dt6(r5, str, r4, i4, i3);
        }
    }
}
