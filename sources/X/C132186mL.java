package X;

/* renamed from: X.6mL  reason: invalid class name and case insensitive filesystem */
public final class C132186mL {
    public final C34991lS A00;
    public final C35051lZ A01;

    public final void A00(C1606789m r6) {
        C35051lZ r1 = this.A01;
        if (AnonymousClass11P.A00(r1.A01) > C17890vO.A05(C35051lZ.A00(r1), "pref_ping_validity_time")) {
            C34991lS r3 = this.A00;
            AnonymousClass732 A002 = r3.A00(C35011lV.A00);
            if (A002 == null) {
                C108965cb.A1C(r6, "user does not exist");
            } else {
                r3.A01(A002, new AnonymousClass7GS(r6, 5), AnonymousClass705.A00());
            }
        } else {
            r6.C7I(this.A00.A00(C35011lV.A00));
        }
    }

    public C132186mL(C34991lS r1, C35051lZ r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
