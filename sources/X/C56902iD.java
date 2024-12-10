package X;

/* renamed from: X.2iD  reason: invalid class name and case insensitive filesystem */
public final class C56902iD {
    public final C18030ve A00;

    public C56902iD(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(C49432Ql r4) {
        C18030ve r2;
        int i;
        C18070vi.A0d(r4, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            r2 = this.A00;
            i = 8428;
        } else if (ordinal == 2 || ordinal == 3) {
            r2 = this.A00;
            i = 8429;
        } else if (ordinal == 4) {
            return C18020vd.A05(C18040vf.A01, this.A00, 8520);
        } else {
            throw new AnonymousClass3EW();
        }
        return C18020vd.A05(C18040vf.A02, r2, i);
    }
}
