package X;

/* renamed from: X.2Is  reason: invalid class name and case insensitive filesystem */
public final class C47522Is extends C47532It {
    public final C42341y1 A00;

    public boolean Bes(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        Class<C438121a> cls = C438121a.class;
        if (!(r5 instanceof C438121a)) {
            String A0U = C17890vO.A0U(r5);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r5, name, A0U, C17890vO.A0W(str), str);
        }
        C20083A6j A01 = this.A00.A01((AnonymousClass21K) r5);
        if (A01 == null || !A01.A0J()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47522Is(C18030ve r1, C42341y1 r2) {
        super(r1);
        C18070vi.A0j(r1, r2);
        this.A00 = r2;
    }
}
