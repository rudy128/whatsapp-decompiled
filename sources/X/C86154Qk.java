package X;

/* renamed from: X.4Qk  reason: invalid class name and case insensitive filesystem */
public final class C86154Qk {
    public long A00;
    public boolean A01;
    public final C19830z4 A02;
    public final AnonymousClass11P A03;

    public final void A00() {
        if (this.A01) {
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            C19830z4 r4 = this.A02;
            C17880vN.A1D(C19830z4.A00(r4), "language_selector_time_spent", C17890vO.A05(C17890vO.A0B(r4), "language_selector_time_spent") + currentTimeMillis);
        }
        this.A01 = false;
    }

    public C86154Qk(AnonymousClass11P r1, C19830z4 r2) {
        C18070vi.A0j(r1, r2);
        this.A03 = r1;
        this.A02 = r2;
    }
}
