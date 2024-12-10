package X;

/* renamed from: X.71E  reason: invalid class name */
public final class AnonymousClass71E {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final String A00(int i) {
        if (i == 400) {
            return "BAD_REQUEST";
        }
        if (i == 500) {
            return "INTERNAL_SERVER_ERROR";
        }
        if (i == 503) {
            return "SERVICE_UNAVAILABLE";
        }
        if (i == 405) {
            return "REQUEST_NOT_ALLOWED";
        }
        if (i != 406) {
            return "UNKNOWN";
        }
        return "REQUEST_NOT_ACCEPTABLE";
    }

    public AnonymousClass71E(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public static final void A01(C1606789m r4, AnonymousClass705 r5, AnonymousClass71E r6, C122936Sm r7, C22821Di r8) {
        if (!r5.A04() || r5.A03()) {
            r4.Bsw(r7);
            return;
        }
        r5.A02();
        C35021lW r3 = C35021lW.A08;
        ((C35031lX) r6.A02.get()).A03(r3);
        ((C35041lY) r6.A03.get()).A01(r3, new C144217Gl(r4, r8, 1));
    }
}
