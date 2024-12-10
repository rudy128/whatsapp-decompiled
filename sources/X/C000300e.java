package X;

/* renamed from: X.00e  reason: invalid class name and case insensitive filesystem */
public final class C000300e implements AnonymousClass00T {
    public AnonymousClass00S A00;

    public static void A00(AnonymousClass00S r1, AnonymousClass00S r2) {
        C000300e r12 = (C000300e) r1;
        AnonymousClass00W.A01(r2);
        if (r12.A00 == null) {
            r12.A00 = r2;
            return;
        }
        throw new IllegalStateException();
    }

    public Object get() {
        AnonymousClass00S r0 = this.A00;
        if (r0 != null) {
            return r0.get();
        }
        throw new IllegalStateException();
    }
}
