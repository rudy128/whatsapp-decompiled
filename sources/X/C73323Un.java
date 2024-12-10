package X;

/* renamed from: X.3Un  reason: invalid class name and case insensitive filesystem */
public class C73323Un extends AnonymousClass1J2 {
    public AnonymousClass1E7 A00;
    public final C25181Nf A01;
    public final C41731wy A02 = AnonymousClass3MW.A0o();
    public final C23581Gv A03;
    public final C24671Lf A04;
    public final C42211xo A05;

    public static void A00(C73323Un r4) {
        C82974Cw r0;
        C41731wy r3 = r4.A02;
        C42211xo r2 = r4.A05;
        AnonymousClass1E7 r1 = r4.A00;
        if (r2.A00(r1)) {
            r0 = C82974Cw.DEACTIVATED;
        } else if (r2.A01(r1)) {
            r0 = C82974Cw.SUSPENDED;
        } else {
            r0 = C82974Cw.NOT_ENFORCED;
        }
        r3.A0E(r0);
    }

    public void A0S() {
        this.A04.unregisterObserver(this.A03);
    }

    public C73323Un(C24671Lf r3, C25181Nf r4, AnonymousClass1E7 r5, C42211xo r6) {
        C94174kA r0 = new C94174kA(this, 5);
        this.A03 = r0;
        this.A00 = r5;
        this.A04 = r3;
        this.A05 = r6;
        this.A01 = r4;
        r3.registerObserver(r0);
    }
}
