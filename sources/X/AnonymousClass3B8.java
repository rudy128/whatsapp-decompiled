package X;

/* renamed from: X.3B8  reason: invalid class name */
public final class AnonymousClass3B8 implements C22486B9s {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass1QD A02;

    public boolean BCL(C186309dz r10, C22484B9q b9q, AnonymousClass5YR r12) {
        C18070vi.A0d(r10, 1);
        String A0s = C17880vN.A0s("param", r10.A01);
        if (A0s == null) {
            return false;
        }
        long A012 = AnonymousClass11P.A01(this.A00);
        int parseInt = Integer.parseInt(A0s) * 1000;
        AnonymousClass1QD r5 = this.A02;
        if (r5.A03().getInt("payments_two_factor_nudge_count", 0) < C18020vd.A00(C18040vf.A02, this.A01, 1124) || A012 <= C17890vO.A05(r5.A03(), "payments_last_two_factor_nudge_time") + ((long) parseInt)) {
            return false;
        }
        return true;
    }

    public AnonymousClass3B8(AnonymousClass11P r1, C18030ve r2, AnonymousClass1QD r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
