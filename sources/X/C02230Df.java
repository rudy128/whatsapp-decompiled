package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.PainterElement;

/* renamed from: X.0Df  reason: invalid class name and case insensitive filesystem */
public abstract class C02230Df {
    public static final void A00(C17130tn r15, Alignment alignment, C17090tj r17, AnonymousClass0HD r18, C04640Oe r19, C17050tf r20, String str, float f, int i, int i2) {
        AnonymousClass0HD r10 = r18;
        float f2 = f;
        C17050tf r12 = r20;
        Alignment alignment2 = alignment;
        C17090tj r9 = r17;
        C17130tn r4 = r15;
        r15.COC(1142754848);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            r9 = C17090tj.A00;
        }
        if ((i2 & 8) != 0) {
            alignment2 = AnonymousClass0MX.A05;
        }
        if ((i2 & 16) != 0) {
            r12 = AnonymousClass0ML.A00;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 64) != 0) {
            r10 = null;
        }
        C17090tj r2 = C17090tj.A00;
        String str2 = str;
        if (str != null) {
            boolean A1V = AnonymousClass000.A1V(r15, str2, -175855396);
            Object CER = r15.CER();
            if (A1V || CER == AnonymousClass0MH.A00) {
                CER = new C09490gn(str2);
                AnonymousClass0VR.A0V(r15, CER);
            }
            AnonymousClass0VR.A0U(r15);
            r2 = AnonymousClass0PD.A02(r2, (C22821Di) CER, false);
        }
        C04640Oe r11 = r19;
        C17090tj CP5 = AnonymousClass0LF.A00(r9.CP5(r2)).CP5(new PainterElement(alignment2, r10, r11, r12, f2));
        AnonymousClass0X2 r7 = AnonymousClass0X2.A00;
        r15.COB(544976794);
        AnonymousClass0VR r3 = (AnonymousClass0VR) r4;
        int i4 = r3.A01;
        C17090tj A00 = C04470Nn.A00(r15, CP5);
        C17350uW BPs = r15.BPs();
        C18090vk A002 = C05030Qc.A00();
        if (AnonymousClass0VR.A0X(r15, r3)) {
            r15.BHe(new C07770e1(A002));
        } else {
            r15.CRc();
        }
        AnonymousClass0EM.A00(r15, r7, C05030Qc.A04());
        AnonymousClass0EM.A00(r15, BPs, C05030Qc.A06());
        AnonymousClass0EM.A00(r15, A00, C05030Qc.A05());
        AnonymousClass1OS A01 = C05030Qc.A01();
        if (r3.A0K || !C18070vi.A18(r15.CER(), Integer.valueOf(i4))) {
            r15.BCJ(AnonymousClass000.A0r(r15, i4), A01);
        }
        AnonymousClass0VR.A0R(r3, true);
        AnonymousClass0VR.A0L(r3);
        C05660Vf BKF = r15.BKF();
        if (BKF != null) {
            BKF.A03(new C12960mb(alignment2, r9, r10, r11, r12, str2, f2, i, i3));
        }
    }
}
