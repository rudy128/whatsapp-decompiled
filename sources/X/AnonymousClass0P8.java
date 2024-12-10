package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0P8  reason: invalid class name */
public abstract class AnonymousClass0P8 {
    public static final AnonymousClass1D6 A00;

    public static final AnonymousClass1D6 A00(C27069DRu dRu, Map map) {
        if (map == null || map.isEmpty()) {
            return A00;
        }
        List A04 = dRu.A04(dRu.A02().length());
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        int size = A04.size();
        for (int i = 0; i < size; i++) {
            map.get(((C26047CrE) A04.get(i)).A04());
        }
        return new AnonymousClass1D6(A13, A132);
    }

    static {
        C18460wS A09 = AnonymousClass1ZU.A09();
        A00 = new AnonymousClass1D6(A09, A09);
    }

    public static final void A01(C17130tn r12, C27069DRu dRu, List list, int i) {
        r12.COC(-1794596951);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C26047CrE crE = (C26047CrE) list.get(i2);
            C36001nB r6 = (C36001nB) crE.A03();
            int A01 = crE.A01();
            int A02 = crE.A02();
            AnonymousClass0X5 r2 = AnonymousClass0X5.A00;
            r12.COB(-1323940314);
            AnonymousClass0WC r0 = C17090tj.A00;
            AnonymousClass0VR r3 = (AnonymousClass0VR) r12;
            int i3 = r3.A01;
            C17350uW BPs = r12.BPs();
            C18090vk A002 = C05030Qc.A00();
            AnonymousClass04D A012 = AnonymousClass0LO.A01(r0);
            r12.COE();
            if (r3.A0K) {
                r12.BHe(A002);
            } else {
                r12.CRc();
            }
            AnonymousClass0EM.A00(r12, r2, C05030Qc.A04());
            AnonymousClass0EM.A00(r12, BPs, C05030Qc.A06());
            AnonymousClass1OS A013 = C05030Qc.A01();
            if (r3.A0K || !C18070vi.A18(r12.CER(), Integer.valueOf(i3))) {
                r12.BCJ(AnonymousClass000.A0r(r12, i3), A013);
            }
            A012.invoke(new AnonymousClass0OT(r12), r12, 0);
            r12.COB(2058660585);
            r6.invoke(dRu.subSequence(A01, A02).A02(), r12, 0);
            AnonymousClass0VR.A0R(r3, false);
            AnonymousClass0VR.A0J(r3);
        }
        C05660Vf BKF = r12.BKF();
        if (BKF != null) {
            BKF.A03(new C13230n4(dRu, list, i));
        }
    }

    public static final boolean A02(C27069DRu dRu) {
        return dRu.A05(dRu.A02().length());
    }
}
