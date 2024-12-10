package X;

/* renamed from: X.36S  reason: invalid class name */
public final class AnonymousClass36S implements C437420t {
    public static final C41661wr A03 = new C41661wr("_+");
    public final C88534a3 A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;

    public AnonymousClass3KT BXT(AnonymousClass206 r7) {
        AnonymousClass3KT r0;
        C62572rc r02;
        String str;
        C18070vi.A0d(r7, 0);
        CM2 cm2 = null;
        if (r7 instanceof C441822l) {
            C88534a3 r3 = this.A00;
            C441722k r72 = (C441722k) r7;
            C18070vi.A0d(r72, 0);
            C18030ve r2 = r3.A01;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 2890) && C18020vd.A05(r1, r2, 10286) && r3.A0C(r72, false)) {
                AnonymousClass7LG r03 = (AnonymousClass7LG) r72.A00.A02;
                if (r03 != null) {
                    cm2 = r03.A04;
                }
                if (!(!(cm2 instanceof C24126Bvs) || (r02 = r72.A02) == null || (str = r02.A0P) == null)) {
                    r0 = C690335q.A01(A03.A00(str, "\n"));
                    return r0;
                }
            }
        }
        r0 = C690235p.A00;
        return r0;
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r7) {
        String str;
        String str2;
        C18070vi.A0d(r7, 0);
        AnonymousClass21V r72 = (AnonymousClass21V) r7;
        if (r72.A09 == 1) {
            str = "🎤";
        } else {
            str = "🎵";
        }
        if (r72.A0D != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(" (");
            str2 = C17900vP.A0B(C64052u8.A0D(this.A02, (String) null, (long) r72.A0D), A10);
        } else {
            str2 = "";
        }
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(' ');
        return C690335q.A01(AnonymousClass001.A1H(this.A01.A00.getString(2131897906), str2, A11));
    }

    public AnonymousClass36S(AnonymousClass118 r1, C18000vb r2, C88534a3 r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
