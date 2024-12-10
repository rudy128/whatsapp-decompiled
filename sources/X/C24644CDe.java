package X;

import java.util.List;

/* renamed from: X.CDe  reason: case insensitive filesystem */
public abstract class C24644CDe {
    public static final void A00(C17130tn r14, C17090tj r15, List list, int i, int i2) {
        List list2 = list;
        C18070vi.A0d(list2, 1);
        r14.COC(-882086200);
        int i3 = i2;
        if ((i2 & 1) != 0) {
            r15 = C17090tj.A00;
        }
        C98494rF A00 = C98494rF.A00();
        Object A0u = AnonymousClass000.A0u(r14, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = AnonymousClass0Q9.A02(C18460wS.A00);
            r14.CRH(A0u);
        }
        AnonymousClass0VR r5 = (AnonymousClass0VR) r14;
        AnonymousClass0VR.A0R(r5, false);
        C17330uU r9 = (C17330uU) A0u;
        Object A0u2 = AnonymousClass000.A0u(r14, -492369756);
        if (A0u2 == obj) {
            A0u2 = AnonymousClass0Q9.A02(C17890vO.A0L());
            r14.CRH(A0u2);
        }
        AnonymousClass0VR.A0R(r5, false);
        C17330uU r8 = (C17330uU) A0u2;
        Object A0u3 = AnonymousClass000.A0u(r14, -492369756);
        if (A0u3 == obj) {
            A0u3 = AnonymousClass0Q9.A02(AnonymousClass3MW.A07());
            r14.CRH(A0u3);
        }
        AnonymousClass0VR.A0R(r5, false);
        C17330uU r10 = (C17330uU) A0u3;
        AnonymousClass0QC.A04(r14, C27621Wu.A00, new C27436DfH(r8, r9, r10, list2, (C30391dr) null, A00));
        r14.COB(1157296644);
        boolean BEf = r14.BEf(r10);
        Object CER = r14.CER();
        if (BEf || CER == obj) {
            CER = new C28029Dq4(r10);
            r14.CRH(CER);
        }
        AnonymousClass0VR.A0R(r5, false);
        C17090tj A002 = C02640Eu.A00(r15, (C22821Di) CER);
        r14.COB(1157296644);
        boolean BEf2 = r14.BEf(r9);
        Object CER2 = r14.CER();
        if (BEf2 || CER2 == obj) {
            CER2 = new C28030Dq5(r9);
            r14.CRH(CER2);
        }
        AnonymousClass0VR.A0R(r5, false);
        C02210Dd.A00(r14, A002, (C22821Di) CER2, 0);
        C05660Vf BKF = r14.BKF();
        if (BKF != null) {
            BKF.A06 = new C28190Dt8(r15, list2, i, i3);
        }
    }
}
