package X;

/* renamed from: X.C8r  reason: case insensitive filesystem */
public abstract class C24546C8r {
    public static RuntimeException A00(Throwable th) {
        Class cls = Error.class;
        if (!cls.isInstance(th)) {
            cls = RuntimeException.class;
            if (!cls.isInstance(th)) {
                throw AnonymousClass8BR.A0x(th);
            }
        }
        throw ((Throwable) cls.cast(th));
    }
}
