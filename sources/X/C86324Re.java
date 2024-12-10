package X;

/* renamed from: X.4Re  reason: invalid class name and case insensitive filesystem */
public final class C86324Re {
    public final C18030ve A00;

    public C86324Re(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass206 r5) {
        C20941Abv A002;
        C18070vi.A0d(r5, 0);
        C20941Abv A003 = C60532oB.A00(r5);
        if (A003 == null || !A003.A0L || (A002 = C60532oB.A00(r5)) == null || A002.A0F == null) {
            return false;
        }
        C18030ve r2 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 1307) || C18020vd.A05(r1, r2, 1325)) {
            return true;
        }
        return false;
    }

    public final boolean A01(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        C20941Abv A002 = C60532oB.A00(r5);
        if (A002 == null || !A002.A0M) {
            return false;
        }
        if (C18020vd.A05(C18040vf.A02, this.A00, 1307)) {
            return true;
        }
        return false;
    }
}
