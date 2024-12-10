package X;

public final class AXI implements C33661jB {
    public final /* synthetic */ AnonymousClass122 A00;
    public final /* synthetic */ BBR A01;
    public final /* synthetic */ AnonymousClass8Gd A02;
    public final /* synthetic */ AnonymousClass21K A03;
    public final /* synthetic */ String A04;

    public void C3Y(C186089dd r10) {
        C186089dd r5 = r10;
        C18070vi.A0d(r10, 0);
        if (!(r10 instanceof C176028zf)) {
            C3L(A7B.A00());
            return;
        }
        AnonymousClass8Gd r2 = this.A02;
        AnonymousClass10I r0 = r2.A0C;
        String str = this.A04;
        r0.CGN(new C21463AkU(r2, this.A03, this.A01, r5, this.A00, str, 7));
    }

    public AXI(AnonymousClass122 r1, BBR bbr, AnonymousClass8Gd r3, AnonymousClass21K r4, String str) {
        this.A01 = bbr;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = r1;
    }

    public void C3L(A7B a7b) {
        StringBuilder A0K = C18070vi.A0K(a7b);
        A0K.append("Request error on fetching transaction detail, error code:");
        A0K.append(a7b.A00);
        C17890vO.A0w(A0K);
        this.A01.C96();
    }

    public void C3X(A7B a7b) {
        StringBuilder A0K = C18070vi.A0K(a7b);
        A0K.append("Response error on fetching transaction detail, error code:");
        A0K.append(a7b.A00);
        C17890vO.A0w(A0K);
        this.A01.C96();
    }
}
