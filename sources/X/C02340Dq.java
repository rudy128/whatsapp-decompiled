package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.0Dq  reason: invalid class name and case insensitive filesystem */
public abstract class C02340Dq {
    public static final void A00(C06830Zv r12, C17130tn r13, Object obj, AnonymousClass1OS r15, int i, int i2) {
        Snapshot A02;
        AnonymousClass0XM r0;
        r13.COC(-2079116560);
        Object obj2 = obj;
        C06830Zv r8 = r12;
        boolean A1V = AnonymousClass000.A1V(r13, obj, 511388516) | r13.BEf(r12);
        Object CER = r13.CER();
        if (A1V || CER == AnonymousClass0MH.A00) {
            CER = new AnonymousClass0XM(r12, obj);
            AnonymousClass0VR.A0V(r13, CER);
        }
        AnonymousClass0VR r4 = (AnonymousClass0VR) r13;
        AnonymousClass0VR.A0R(r4, false);
        AnonymousClass0XM r5 = (AnonymousClass0XM) CER;
        int i3 = i;
        r5.A00.CJC(i3);
        AnonymousClass07W r3 = AnonymousClass0GG.A00;
        C16440sG r7 = (C16440sG) r13.BFh(r3);
        Snapshot A00 = C04790Ov.A00();
        try {
            A02 = A00.A02();
            C17330uU r1 = r5.A02;
            if (r7 != ((C16440sG) r1.getValue())) {
                r1.setValue(r7);
                if (r5.A01.BT8() > 0) {
                    C17330uU r14 = r5.A03;
                    C16430sF r02 = (C16430sF) r14.getValue();
                    if (r02 != null) {
                        r02.release();
                    }
                    if (r7 != null) {
                        r0 = r7.CBi();
                    } else {
                        r0 = null;
                    }
                    r14.setValue(r0);
                }
            }
            AnonymousClass0N4.A00(A02);
            A00.A0D();
            boolean A1V2 = AnonymousClass000.A1V(r13, r5, -913235405);
            Object CER2 = r13.CER();
            if (A1V2 || CER2 == AnonymousClass0MH.A00) {
                CER2 = new C09610gz(r5);
                r4.A0c(CER2);
            }
            AnonymousClass0VR.A0R(r4, false);
            AnonymousClass0QC.A03(r13, r5, (C22821Di) CER2);
            int i4 = i2;
            AnonymousClass1OS r10 = r15;
            AnonymousClass0PZ.A03(r13, r3.A03(r5), r15, 0 | ((i2 >> 6) & 112));
            C05660Vf BKF = r13.BKF();
            if (BKF != null) {
                BKF.A03(new C13470nS(r8, obj2, r10, i3, i4));
            }
        } catch (Throwable th) {
            A00.A0D();
            throw th;
        }
    }
}
