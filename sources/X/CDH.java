package X;

public abstract class CDH {
    public static final void A00(C17130tn r13, C17090tj r14, C18090vk r15, C18090vk r16, C18090vk r17, int i, int i2) {
        long j;
        C18090vk r11 = r17;
        C18090vk r10 = r16;
        C18090vk r9 = r15;
        C17090tj r8 = r14;
        C17130tn r2 = r13;
        r13.COC(-794005665);
        int i3 = i2;
        int i4 = i2 & 1;
        int i5 = i;
        int i6 = i | 6;
        if (i4 == 0) {
            if ((i & 6) == 0) {
                i6 = AnonymousClass001.A0Q(r2, r14) | i;
            } else {
                i6 = i5;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= AnonymousClass001.A0b(r2, r15);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i6 |= 384;
        } else if ((i5 & 384) == 0) {
            i6 |= AnonymousClass001.A0c(r2, r10);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i6 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i6 |= AnonymousClass001.A0d(r2, r11);
        }
        if ((i6 & 1171) != 1170 || !r2.BZO()) {
            if (i4 != 0) {
                r8 = C17090tj.A00;
            }
            if (i7 != 0) {
                r9 = new DWU(9);
            }
            if (i8 != 0) {
                r10 = new DWU(10);
            }
            if (i9 != 0) {
                r11 = new DWU(11);
            }
            C05400Ua A00 = C03880Kz.A00(r2);
            C17090tj CP5 = r8.CP5(C05130Qo.A00);
            C26257Cw2 A0g = BE6.A0g(r2, CG7.A00);
            if (A0g instanceof BqD) {
                j = ((BqD) A0g).A0D;
            } else {
                j = ((BqC) A0g).A0D;
            }
            C17090tj A002 = C02190Db.A00(CP5, AnonymousClass0GC.A00, j);
            C16870tM A0S = BEA.A0S(r2, AnonymousClass0MX.A05);
            AnonymousClass0VR r5 = (AnonymousClass0VR) r2;
            int i10 = r5.A01;
            C17350uW BPs = r2.BPs();
            C18090vk r0 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(A002);
            BEA.A19(r2, r5, r0);
            BE9.A18(r2, A0S, BPs);
            AnonymousClass1OS r1 = C05030Qc.A01;
            if (r5.A0K || !BE9.A1R(r2, i10)) {
                BE9.A19(r2, r1, i10);
            }
            BEB.A0r(r2, A01);
            AnonymousClass0WC r12 = C17090tj.A00;
            r2.BFh(CG8.A00);
            C24620CCg.A00(r2, AnonymousClass0Q7.A04(r12, 40.0f), AnonymousClass0LC.A00(r2, new C27153DWo(r10, A00, r11, r9, 0), -837188479), 48, 0);
            BEA.A18(r2, r5);
        } else {
            r2.CNR();
        }
        C05660Vf BKF = r2.BKF();
        if (BKF != null) {
            BKF.A06 = new DX5(r8, r9, r10, r11, i5, i3);
        }
    }
}
