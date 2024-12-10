package X;

/* renamed from: X.7Kq  reason: invalid class name and case insensitive filesystem */
public final class C145277Kq implements C437420t {
    public final AnonymousClass118 A00;

    public C145277Kq(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass3KT BXT(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        C441522i r32 = (C441522i) r3;
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass6WO.A00(A10, r32.A18());
        AnonymousClass6WO.A00(A10, r32.A03);
        AnonymousClass6WO.A00(A10, r32.A04);
        AnonymousClass6WO.A00(A10, r32.A05);
        if (A10.length() > 0) {
            A10.deleteCharAt(A10.length() - 1);
        }
        return new C690335q(C18070vi.A0H(A10));
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r4) {
        return new C690335q(AnonymousClass001.A1H("💟 ", C18070vi.A0G(this.A00, 2131889035), AnonymousClass000.A10()));
    }
}
