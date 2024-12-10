package X;

/* renamed from: X.6xr  reason: invalid class name and case insensitive filesystem */
public final class C138886xr {
    public final C27031Ul A00;
    public final C18030ve A01;

    public final String A01() {
        String A012 = C18020vd.A01(C18040vf.A01, this.A01, 9037);
        C18070vi.A0X(A012);
        if (A012.length() <= 0) {
            return C17880vN.A0r(C17880vN.A0C(this.A00.A01), "pref_avatar_art_revision");
        }
        return A012;
    }

    public C138886xr(C18030ve r1, C27031Ul r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static String A00(AnonymousClass00H r0) {
        return ((C138886xr) r0.get()).A01();
    }
}
