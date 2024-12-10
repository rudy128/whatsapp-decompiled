package X;

/* renamed from: X.00f  reason: invalid class name */
public final class AnonymousClass00f implements AnonymousClass00S {
    public static final Object A02 = new Object();
    public volatile AnonymousClass00S A00;
    public volatile Object A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.00S, java.lang.Object, X.00f] */
    public static AnonymousClass00S A00(AnonymousClass00S r2) {
        if ((r2 instanceof AnonymousClass00f) || (r2 instanceof C000200d)) {
            return r2;
        }
        ? obj = new Object();
        obj.A01 = A02;
        obj.A00 = r2;
        return obj;
    }

    public Object get() {
        Object obj = this.A01;
        if (obj != A02) {
            return obj;
        }
        AnonymousClass00S r0 = this.A00;
        if (r0 == null) {
            return this.A01;
        }
        Object obj2 = r0.get();
        this.A01 = obj2;
        this.A00 = null;
        return obj2;
    }
}
