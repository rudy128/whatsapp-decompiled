package X;

/* renamed from: X.00U  reason: invalid class name */
public final class AnonymousClass00U implements AnonymousClass00H, AnonymousClass00T {
    public static final AnonymousClass00U A01 = new AnonymousClass00U((Object) null);
    public final Object A00;

    public static AnonymousClass00U A00(Object obj) {
        if (obj != null) {
            return new AnonymousClass00U(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public AnonymousClass00U(Object obj) {
        this.A00 = obj;
    }

    public Object get() {
        return this.A00;
    }
}
