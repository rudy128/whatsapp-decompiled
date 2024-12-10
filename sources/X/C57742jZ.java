package X;

/* renamed from: X.2jZ  reason: invalid class name and case insensitive filesystem */
public final class C57742jZ {
    public final C26261Rl A00;
    public final C19830z4 A01;
    public final C26481Sh A02;
    public final C26491Si A03;

    public final void A00() {
        if (this.A03.A00()) {
            int i = 0;
            try {
                i = C17890vO.A0B(this.A01).getInt("privacy_calladd", 0);
            } catch (ClassCastException unused) {
            }
            if (i != 5) {
                this.A00.A03("calladd", "known");
            }
        }
    }

    public C57742jZ(C26261Rl r1, C19830z4 r2, C26481Sh r3, C26491Si r4) {
        C18070vi.A0s(r4, r2, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
