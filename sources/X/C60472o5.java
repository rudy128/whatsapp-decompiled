package X;

/* renamed from: X.2o5  reason: invalid class name and case insensitive filesystem */
public abstract class C60472o5 {
    public static final C692336k A00(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        return (C692336k) C18070vi.A09(r1, C692336k.class).A02;
    }

    public static final void A01(C692336k r4, AnonymousClass206 r5) {
        Integer num;
        C18070vi.A0d(r5, 0);
        Object obj = r5.A0w;
        C18070vi.A0W(obj);
        synchronized (obj) {
            C18070vi.A09(r5, C692336k.class).A02(r4);
            if (r4 == null) {
                r5.A0c(16777216);
            } else {
                if (r4 instanceof C48312Lz) {
                    r5.A0b(16777216);
                    num = C17880vN.A0j();
                } else {
                    r5.A0c(16777216);
                    num = null;
                }
                r5.A0S = num;
                if (r4 instanceof C48302Ly) {
                    r5.A0V(16);
                }
            }
        }
    }
}
