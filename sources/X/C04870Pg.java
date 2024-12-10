package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.0Pg  reason: invalid class name and case insensitive filesystem */
public abstract class C04870Pg {
    public static final C16870tM A00 = new AnonymousClass0X1(AnonymousClass0MX.A08, false);
    public static final C16870tM A01 = AnonymousClass0X3.A00;

    public static final void A02(Alignment alignment, C17500ul r7, AnonymousClass0XJ r8, C24246By4 by4, int i, int i2) {
        AnonymousClass09K r1;
        Alignment alignment2;
        Alignment alignment3 = alignment;
        Object BWC = r7.BWC();
        if (!(!(BWC instanceof AnonymousClass09K) || (r1 = (AnonymousClass09K) BWC) == null || (alignment2 = r1.A00) == null)) {
            alignment3 = alignment2;
        }
        AnonymousClass0QZ.A04(r8, 0.0f, alignment3.BC1(by4, C25293Ccv.A00(r8.A01, r8.A00), C25293Ccv.A00(i, i2)));
    }

    public static final C16870tM A00(C17130tn r2, Alignment alignment, boolean z) {
        C16870tM r1;
        r2.COB(56522820);
        if (!C18070vi.A18(alignment, AnonymousClass0MX.A08) || z) {
            boolean A1Z = AnonymousClass001.A1Z(r2, alignment, Boolean.valueOf(z));
            Object CER = r2.CER();
            if (A1Z || CER == AnonymousClass0MH.A00) {
                CER = new AnonymousClass0X1(alignment, z);
                r2.CRH(CER);
            }
            AnonymousClass0VR.A0T(r2);
            r1 = (C16870tM) CER;
        } else {
            r1 = A00;
        }
        AnonymousClass0VR.A0T(r2);
        return r1;
    }

    public static final void A01(C17130tn r7, C17090tj r8, int i) {
        int i2;
        r7.COC(-211209833);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Q(r7, r8) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r7.BZO()) {
            C16870tM r6 = A01;
            r7.COB(544976794);
            AnonymousClass0VR r3 = (AnonymousClass0VR) r7;
            int i3 = r3.A01;
            C17090tj A002 = C04470Nn.A00(r7, r8);
            C17350uW BPs = r7.BPs();
            C18090vk A003 = C05030Qc.A00();
            if (AnonymousClass0VR.A0X(r7, r3)) {
                r7.BHe(new C07860eA(A003));
            } else {
                r7.CRc();
            }
            AnonymousClass0EM.A00(r7, r6, C05030Qc.A04());
            AnonymousClass0EM.A00(r7, BPs, C05030Qc.A06());
            AnonymousClass0EM.A00(r7, A002, C05030Qc.A05());
            AnonymousClass1OS A012 = C05030Qc.A01();
            if (r3.A0K || !C18070vi.A18(r7.CER(), Integer.valueOf(i3))) {
                r7.BCJ(AnonymousClass000.A0r(r7, i3), A012);
            }
            AnonymousClass0VR.A0R(r3, true);
            AnonymousClass0VR.A0L(r3);
        } else {
            r7.CNR();
        }
        C05660Vf BKF = r7.BKF();
        if (BKF != null) {
            BKF.A03(new C12750mG(r8, i));
        }
    }
}
