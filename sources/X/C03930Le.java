package X;

/* renamed from: X.0Le  reason: invalid class name and case insensitive filesystem */
public abstract class C03930Le {
    public static final C16870tM A00;

    static {
        Integer num = AnonymousClass00R.A00;
        A00 = new AnonymousClass0XA(AnonymousClass0OB.A01, (C16130rl) null, new AnonymousClass07I(AnonymousClass0MX.A04), num, num);
    }

    public static final C16870tM A00(C16120rk r6, C17130tn r7, C16340s6 r8) {
        C16870tM r1;
        r7.COB(-837807694);
        C16120rk r2 = r6;
        if (!C18070vi.A18(r6, AnonymousClass0OB.A01) || !C18070vi.A18(r8, AnonymousClass0MX.A04)) {
            boolean A1Y = AnonymousClass001.A1Y(r7, r6, r8);
            Object CER = r7.CER();
            if (A1Y || CER == AnonymousClass0MH.A00) {
                Integer num = AnonymousClass00R.A00;
                CER = new AnonymousClass0XA(r2, (C16130rl) null, new AnonymousClass07I(r8), num, num);
                AnonymousClass0VR.A0V(r7, CER);
            }
            AnonymousClass0VR.A0T(r7);
            r1 = (C16870tM) CER;
        } else {
            r1 = A00;
        }
        AnonymousClass0VR.A0T(r7);
        return r1;
    }
}
