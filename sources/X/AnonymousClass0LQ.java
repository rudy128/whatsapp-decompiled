package X;

/* renamed from: X.0LQ  reason: invalid class name */
public abstract class AnonymousClass0LQ {
    public static final C08720fY A00(AnonymousClass05G r2, C23381Fv r3) {
        if (r3.A04().compareTo(C23401Fx.DESTROYED) > 0) {
            AnonymousClass0Y7 r1 = new AnonymousClass0Y7(r2);
            r3.A05(r1);
            return new C08720fY(r3, r1);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Cannot configure ");
        A10.append(r2);
        A10.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        A10.append(r3);
        throw AnonymousClass000.A0o("is already destroyed", A10);
    }
}
