package X;

/* renamed from: X.37s  reason: invalid class name and case insensitive filesystem */
public final class C695737s implements C108145bC {
    public AnonymousClass1CJ A00;
    public C18030ve A01;

    public /* synthetic */ boolean Bfz(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 1);
        return BgC(r2);
    }

    public boolean BgC(AnonymousClass206 r5) {
        String str;
        C46162Dk r1;
        C18070vi.A0d(r5, 0);
        AnonymousClass1BI r12 = r5.A0v.A00;
        if (C22971Dz.A0V(r12)) {
            AnonymousClass1CJ r0 = this.A00;
            if (r0 != null) {
                C29691ci A0A = r0.A0A(r12);
                if (!(A0A instanceof C46162Dk) || (r1 = (C46162Dk) A0A) == null || !r1.A0P()) {
                    return false;
                }
                C18030ve r2 = this.A01;
                if (r2 == null) {
                    str = "abProps";
                } else if (C18020vd.A05(C18040vf.A02, r2, 7211)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                str = "chatsCache";
            }
            C18070vi.A11(str);
            throw null;
        }
        return true;
    }
}
