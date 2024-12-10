package X;

/* renamed from: X.9kS  reason: invalid class name and case insensitive filesystem */
public final class C190149kS {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21950AvE(this));

    public C190149kS(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C183299Xs A00(C179279Hi r3) {
        C183299Xs r0;
        AnonymousClass00H r02 = (AnonymousClass00H) AnonymousClass8BV.A0n(r3, this.A01);
        if (r02 != null && (r0 = (C183299Xs) r02.get()) != null) {
            return r0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("No storage config found for ");
        throw AnonymousClass000.A0o("GENERIC_RESOURCES", A10);
    }
}
