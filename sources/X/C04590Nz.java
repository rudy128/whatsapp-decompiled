package X;

/* renamed from: X.0Nz  reason: invalid class name and case insensitive filesystem */
public abstract class C04590Nz {
    public static final C03390Hw A00 = new C03390Hw();

    public static final void A00(C17130tn r10, C17090tj r11, AnonymousClass0NO r12, AnonymousClass1OS r13, int i, int i2) {
        C17090tj r7 = r11;
        r10.COC(-511989831);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            r7 = C17090tj.A00;
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r10;
        int i4 = r3.A01;
        r10.COB(-1165786124);
        AnonymousClass07S BDX = r10.BDX();
        AnonymousClass0VR.A0R(r3, false);
        C17090tj A002 = C04470Nn.A00(r10, r7);
        C17350uW BPs = r10.BPs();
        C18090vk A003 = AnonymousClass0F3.A00();
        if (AnonymousClass0VR.A0X(r10, r3)) {
            r10.BHe(new C08200ei(A003));
        } else {
            r10.CRc();
        }
        AnonymousClass0NO r8 = r12;
        AnonymousClass0EM.A00(r10, r12, r12.A03());
        AnonymousClass0EM.A00(r10, BDX, r12.A01());
        AnonymousClass1OS r9 = r13;
        AnonymousClass0EM.A00(r10, r13, r12.A02());
        AnonymousClass0EM.A00(r10, BPs, C05030Qc.A06());
        AnonymousClass0EM.A00(r10, A002, C05030Qc.A05());
        AnonymousClass1OS A01 = C05030Qc.A01();
        if (r3.A0K || !C18070vi.A18(r10.CER(), Integer.valueOf(i4))) {
            r10.BCJ(AnonymousClass000.A0r(r10, i4), A01);
        }
        AnonymousClass0VR.A0J(r3);
        if (!r10.BZO()) {
            AnonymousClass0QC.A05(r10, new C08210ej(r12));
        }
        C05660Vf BKF = r10.BKF();
        if (BKF != null) {
            BKF.A03(new C13520nX(r7, r8, r9, i, i3));
        }
    }

    public static final void A01(C17130tn r7, C17090tj r8, AnonymousClass1OS r9, int i, int i2) {
        C17090tj r5 = r8;
        C17130tn r4 = r7;
        r7.COC(-1298353104);
        int i3 = i2 & 1;
        int i4 = i | 6;
        if (i3 == 0) {
            if ((i & 14) == 0) {
                i4 = AnonymousClass001.A0Q(r7, r8) | i;
            } else {
                i4 = i;
            }
        }
        AnonymousClass1OS r72 = r9;
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= AnonymousClass001.A0b(r4, r9);
        }
        if ((i4 & 91) != 18 || !r4.BZO()) {
            if (i3 != 0) {
                r5 = C17090tj.A00;
            }
            Object A1A = AnonymousClass001.A1A(r4);
            if (A1A == AnonymousClass0MH.A00) {
                A1A = new AnonymousClass0NO();
                AnonymousClass0VR.A0V(r4, A1A);
            }
            AnonymousClass0VR.A0R((AnonymousClass0VR) r4, false);
            int i5 = i4 << 3;
            A00(r4, r5, (AnonymousClass0NO) A1A, r72, (i5 & 112) | 8 | (i5 & 896), 0);
        } else {
            r4.CNR();
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A03(new C13450nQ(r5, r72, i, i2));
        }
    }
}
