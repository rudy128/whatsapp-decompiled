package X;

/* renamed from: X.4VM  reason: invalid class name */
public abstract class AnonymousClass4VM {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final C18100vl A02 = C99164sN.A01(this, 2);

    public abstract int A00();

    public abstract String A01();

    public abstract void A03();

    public final void A02() {
        AnonymousClass00H r8 = this.A00;
        C18020vd A0P = C17880vN.A0P(r8);
        int A002 = A00();
        C18040vf r6 = C18040vf.A02;
        int A003 = C18020vd.A00(r6, A0P, A002);
        if (A003 != 0) {
            AnonymousClass00H r2 = this.A01;
            C18100vl r3 = this.A02;
            boolean A1T = AnonymousClass000.A1T(A003, ((C24621La) r2.get()).A00(AnonymousClass3MW.A0y(r3), 0));
            if (Boolean.valueOf(A1T) != null) {
                if (!A1T) {
                    A03();
                    ((C24621La) r2.get()).A04(AnonymousClass3MW.A0y(r3), C18020vd.A00(r6, C17880vN.A0P(r8), A002));
                    r3.getValue();
                    return;
                }
                return;
            }
        }
        throw new AnonymousClass4E2(AnonymousClass3MW.A0y(this.A02));
    }

    public AnonymousClass4VM(AnonymousClass00H r2, AnonymousClass00H r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
