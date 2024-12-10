package X;

/* renamed from: X.CsA  reason: case insensitive filesystem */
public abstract /* synthetic */ class C26092CsA {
    public static final AnonymousClass1OS A00 = C28221Dtd.A00;
    public static final C22821Di A01 = C28154DsE.A00;

    public static final C23421Fz A00(C22821Di r2, AnonymousClass1OS r3, C23421Fz r4) {
        if (r4 instanceof C27181DXq) {
            C27181DXq dXq = (C27181DXq) r4;
            if (dXq.A00 == r2 && dXq.A01 == r3) {
                return r4;
            }
        }
        return new C27181DXq(r2, r3, r4);
    }

    public static final C23421Fz A01(AnonymousClass1OS r2, C23421Fz r3) {
        C22821Di r1 = A01;
        C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        C41681wt.A04(r2, 2);
        return A00(r1, r2, r3);
    }

    public static final C23421Fz A02(C23421Fz r2) {
        if (!(r2 instanceof AnonymousClass1G1)) {
            return A00(A01, A00, r2);
        }
        return r2;
    }
}
