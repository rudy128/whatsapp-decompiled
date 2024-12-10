package X;

/* renamed from: X.32b  reason: invalid class name and case insensitive filesystem */
public final class C681032b implements AnonymousClass16D {
    public final C18030ve A00;

    public C681032b(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public C59082lj C1O(AnonymousClass206 r4) {
        boolean A05;
        C18070vi.A0d(r4, 0);
        if (!r4.A0w()) {
            return null;
        }
        C18030ve r2 = this.A00;
        C691336a A002 = C50382Uf.A00(r4);
        if (A002 == null || !A002.A07) {
            int i = 4338;
            if (r4 instanceof AnonymousClass22H) {
                i = 10412;
            }
            A05 = C18020vd.A05(C18040vf.A02, r2, i);
        } else {
            A05 = false;
        }
        return new C59082lj(A05, "newsletter");
    }

    public /* synthetic */ AnonymousClass206 C1M(C59652mf r2, AnonymousClass206 r3) {
        return null;
    }
}
