package X;

/* renamed from: X.6pW  reason: invalid class name and case insensitive filesystem */
public final class C133806pW {
    public final C19830z4 A00;
    public final C18000vb A01;
    public final C25181Nf A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;

    public final boolean A00() {
        C18030ve r2 = this.A03;
        String A0v = C108955ca.A0v(r2, 4631);
        if (AnonymousClass1YF.A0T(A0v) || !C108985cd.A0s(A0v, 1).contains(this.A01.A05()) || !C18020vd.A05(C18040vf.A02, r2, 4445)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (!C17880vN.A1W(C17890vO.A0B(this.A00), "fun_stickers_notice_started_clicked") && A00()) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 4837)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C133806pW(C19830z4 r1, C18000vb r2, C25181Nf r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0w(r4, r2, r5, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
    }
}
