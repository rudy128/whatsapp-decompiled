package X;

import androidx.compose.foundation.layout.FillElement;

public abstract class CDI {
    public static final void A00(C17130tn r26, C18090vk r27, C18090vk r28, int i, int i2) {
        int i3;
        C18090vk r3 = r28;
        C18090vk r13 = r27;
        C17130tn r9 = r26;
        r9.COC(-637433304);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AnonymousClass000.A09(r9.BEh(r13) ? 1 : 0) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AnonymousClass001.A0b(r9, r3);
        }
        if ((i3 & 19) != 18 || !r9.BZO()) {
            if (i5 != 0) {
                r13 = new DWU(12);
            }
            if (i7 != 0) {
                r3 = new DWU(13);
            }
            AnonymousClass0WC r2 = C17090tj.A00;
            FillElement fillElement = C05130Qo.A01;
            C16870tM A0R = BEA.A0R(r9, AnonymousClass0MX.A00);
            AnonymousClass0VR r0 = (AnonymousClass0VR) r9;
            int i8 = r0.A01;
            C17350uW BPs = r9.BPs();
            C18090vk r1 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(fillElement);
            BEA.A19(r9, r0, r1);
            BE9.A18(r9, A0R, BPs);
            AnonymousClass1OS r5 = C05030Qc.A01;
            if (r0.A0K || !BE9.A1R(r9, i8)) {
                BE9.A19(r9, r5, i8);
            }
            BEB.A0r(r9, A01);
            AnonymousClass07W r12 = CG8.A00;
            r9.BFh(r12);
            r9.BFh(r12);
            C26231CvN.A06(r9, AnonymousClass0Q7.A05(r2, 8.0f, 20.0f), new C26018CqZ(3), AnonymousClass0LT.A00(r9, 2131897699), 0, 4, 0);
            C24626CCm.A00(r9, (C17090tj) null, AnonymousClass0LS.A00(r9, 2131233389), AnonymousClass0LT.A00(r9, 2131897695), r13, (i3 << 15) & 458752, 26, 0, 0);
            C04640Oe A00 = AnonymousClass0LS.A00(r9, 2131231846);
            AnonymousClass07W r6 = CG7.A00;
            int i9 = (i3 << 12) & 458752;
            C17130tn r14 = r9;
            C18090vk r18 = r3;
            C24626CCm.A00(r14, (C17090tj) null, A00, AnonymousClass0LT.A00(r9, 2131897697), r18, i9, 2, C26257Cw2.A07(r9, r6), C26257Cw2.A07(r9, r6));
            r9.BFh(r12);
            C02280Dk.A00(r9, C05130Qo.A06(r2, 24.0f));
            BEA.A18(r9, r0);
        } else {
            r9.CNR();
        }
        C05660Vf BKF = r9.BKF();
        if (BKF != null) {
            BKF.A06 = new C27148DWj(r13, i6, r3, i4, 3);
        }
    }
}
