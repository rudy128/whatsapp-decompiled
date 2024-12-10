package X;

import androidx.compose.animation.core.MutableTransitionState;

/* renamed from: X.0Nf  reason: invalid class name */
public abstract class AnonymousClass0Nf {
    public static final AnonymousClass0Q5 A01(AnonymousClass0Q5 r5, C17130tn r6, Object obj, Object obj2, int i) {
        r6.COB(-198307638);
        boolean A1X = AnonymousClass001.A1X(r6, r5);
        Object CER = r6.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            MutableTransitionState mutableTransitionState = new MutableTransitionState(obj);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(r5.A0A);
            CER = new AnonymousClass0Q5(mutableTransitionState, AnonymousClass001.A1H(" > ", "EnterExitTransition", A10));
            r6.CRH(CER);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r6;
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0Q5 r4 = (AnonymousClass0Q5) CER;
        boolean A1a = AnonymousClass001.A1a(r6, r5, r4, 1951131101);
        Object CER2 = r6.CER();
        if (A1a || CER2 == AnonymousClass0MH.A00) {
            CER2 = new C10160ht(r5, r4);
            r3.A0c(CER2);
        }
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0QC.A03(r6, r4, (C22821Di) CER2);
        if (AnonymousClass001.A1b(r5.A04)) {
            r4.A0C(obj, obj2, r5.A00);
        } else {
            r4.A0B(r6, obj2, ((i >> 3) & 8) | ((i >> 6) & 14));
            AnonymousClass000.A1C(r4.A04, false);
        }
        AnonymousClass0VR.A0R(r3, false);
        return r4;
    }

    public static final C03520Io A00(AnonymousClass0Q5 r4, C16590sg r5, C17130tn r6, String str, int i) {
        r6.COB(-1714122528);
        if ((i & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean A1X = AnonymousClass001.A1X(r6, r4);
        Object CER = r6.CER();
        if (A1X || CER == AnonymousClass0MH.A00) {
            CER = new C03520Io(r4, r5, str);
            r6.CRH(CER);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r6;
        AnonymousClass0VR.A0R(r2, false);
        C03520Io r3 = (C03520Io) CER;
        AnonymousClass0QC.A03(r6, r3, new C10170hu(r3, r4));
        if (AnonymousClass001.A1b(r4.A04)) {
            r3.A01();
        }
        AnonymousClass0VR.A0R(r2, false);
        return r3;
    }

    public static final AnonymousClass0Q5 A02(C17130tn r6, Object obj, String str, int i) {
        Object A1C = AnonymousClass001.A1C(r6, 2029166765);
        Object obj2 = AnonymousClass0MH.A00;
        if (A1C == obj2) {
            A1C = new AnonymousClass0Q5(new MutableTransitionState(obj), str);
            r6.CRH(A1C);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r6;
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0Q5 r5 = (AnonymousClass0Q5) A1C;
        r5.A0A(r6, obj, (i & 8) | 48 | (i & 14));
        boolean A1V = AnonymousClass000.A1V(r6, r5, 1951093734);
        Object CER = r6.CER();
        if (A1V || CER == obj2) {
            CER = new C09480gm(r5);
            r3.A0c(CER);
        }
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0QC.A03(r6, r5, (C22821Di) CER);
        AnonymousClass0VR.A0R(r3, false);
        return r5;
    }
}
