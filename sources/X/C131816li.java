package X;

/* renamed from: X.6li  reason: invalid class name and case insensitive filesystem */
public final class C131816li {
    public final AnonymousClass00H A00;

    public C131816li(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C1606789m r6) {
        AnonymousClass00H r2 = this.A00;
        C34991lS A0f = C108945cZ.A0f(r2);
        C35021lW r4 = C35011lV.A00;
        AnonymousClass732 A002 = A0f.A00(r4);
        if (A002 == null) {
            C108965cb.A1C(r6, "user does not exist");
            return;
        }
        C108945cZ.A0f(r2).A04(new AnonymousClass7GS(r6, 4), r4, AnonymousClass705.A00(), new C53932dK(1, A002));
    }
}
