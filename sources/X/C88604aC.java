package X;

/* renamed from: X.4aC  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C88604aC {
    public static final C30511e4 A03(AnonymousClass1OX r2, C23421Fz r3) {
        return AnonymousClass3MY.A0s(new AnonymousClass50E((C30391dr) null, r3), r2);
    }

    public static final Object A00(C30391dr r5, AnonymousClass1OS r6, C23421Fz r7) {
        C23421Fz r0;
        AnonymousClass4Z6 r02 = AnonymousClass4Z6.$redex_init_class;
        AnonymousClass5WQ A00 = AnonymousClass4Z6.A00(new AnonymousClass5AH((C30391dr) null, r6), r7);
        C25691Pg r3 = C25691Pg.SUSPEND;
        boolean z = A00 instanceof AnonymousClass1G5;
        AnonymousClass1OR r1 = AnonymousClass1OR.A00;
        if (z) {
            r0 = A00.BLm(r1, r3, 0);
        } else {
            r0 = new AnonymousClass5WR(r1, r3, A00, 0);
        }
        return AnonymousClass3MX.A13(A01(r5, r0));
    }

    public static final Object A01(C30391dr r1, C23421Fz r2) {
        return AnonymousClass3MX.A13(r2.BFC(r1, C99604tA.A00));
    }

    public static final Object A02(C30391dr r1, C23421Fz r2, AnonymousClass1G2 r3) {
        if (!(r3 instanceof C99504sv)) {
            return AnonymousClass3MX.A13(r2.BFC(r1, r3));
        }
        throw ((C99504sv) r3).A00;
    }

    public static void A04(AnonymousClass1OS r2, AnonymousClass1OX r3, C23421Fz r4) {
        A03(r3, new C27183DXs(r2, r4, 10));
    }
}
