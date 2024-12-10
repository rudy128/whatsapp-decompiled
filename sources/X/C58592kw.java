package X;

/* renamed from: X.2kw  reason: invalid class name and case insensitive filesystem */
public final class C58592kw {
    public final C35101le A00;
    public final C34951lN A01;
    public final C35051lZ A02;

    public final String A00() {
        int A002 = this.A00.A00(C35131lh.A07);
        if ((A002 == 2 || A002 == 1) && C18070vi.A19(this.A01.A05(), false)) {
            return C17880vN.A0r(C35051lZ.A00(this.A02), "waffle_machine_id");
        }
        return null;
    }

    public final void A01(String str) {
        int A002 = this.A00.A00(C35131lh.A07);
        if ((A002 == 2 || A002 == 1) && C18070vi.A19(this.A01.A05(), false)) {
            C17880vN.A1E(C18070vi.A02(this.A02), "waffle_machine_id", str);
        }
    }

    public C58592kw(C35101le r1, C34951lN r2, C35051lZ r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
