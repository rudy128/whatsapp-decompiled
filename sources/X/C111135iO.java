package X;

/* renamed from: X.5iO  reason: invalid class name and case insensitive filesystem */
public final class C111135iO extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00 = C108945cZ.A0S();
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1EC A02;
    public final C23581Gv A03;
    public final C24671Lf A04;

    public C111135iO(AnonymousClass1M9 r3, C24671Lf r4, AnonymousClass1EC r5) {
        C18070vi.A0e(r3, 1, r4);
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
        AnonymousClass7E1 r1 = new AnonymousClass7E1(this, 1);
        this.A03 = r1;
        r4.registerObserver(r1);
    }

    public void A0S() {
        this.A04.unregisterObserver(this.A03);
    }
}
