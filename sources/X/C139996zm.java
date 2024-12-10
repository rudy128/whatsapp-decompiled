package X;

/* renamed from: X.6zm  reason: invalid class name and case insensitive filesystem */
public final class C139996zm {
    public static final C35021lW A05 = C35011lV.A00;
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A01(C1606789m r5, Exception exc) {
        C18070vi.A0d(r5, 0);
        C108945cZ.A0f(this.A02).A05(new AnonymousClass7GT(exc, r5, 6), A05, (AnonymousClass705) null, (String) null);
    }

    public final void A02(AnonymousClass705 r3, C72383Ls r4, Exception exc) {
        C18070vi.A0d(r3, 2);
        if (!r3.A04() || r3.A03()) {
            r4.Bsw(exc);
            return;
        }
        r3.A02();
        C35021lW r1 = A05;
        ((C35031lX) this.A01.get()).A03(r1);
        ((C35041lY) this.A03.get()).A01(r1, r4);
    }

    public final void A00() {
        ((C57022iP) this.A04.get()).A00();
    }

    public C139996zm(AnonymousClass10I r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }
}
