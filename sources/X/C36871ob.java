package X;

/* renamed from: X.1ob  reason: invalid class name and case insensitive filesystem */
public final class C36871ob {
    public final AnonymousClass1QR A00;
    public final AnonymousClass1QD A01;
    public final AnonymousClass1QO A02;
    public final AnonymousClass10I A03;

    public C36871ob(AnonymousClass1QR r2, AnonymousClass1QD r3, AnonymousClass1QO r4, AnonymousClass10I r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r2, 4);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final boolean A00() {
        if (C18020vd.A05(C18040vf.A02, this.A02.A02, 2055)) {
            AnonymousClass1QD r2 = this.A01;
            if (r2.A03().contains("payments_has_unseen_requests")) {
                boolean z = r2.A03().getBoolean("payments_has_unseen_requests", false);
                if (Boolean.valueOf(z) != null) {
                    return z;
                }
            }
            this.A03.CGF(new C21448AkF(this, 13));
        }
        return false;
    }
}
