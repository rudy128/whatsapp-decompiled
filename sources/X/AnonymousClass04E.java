package X;

/* renamed from: X.04E  reason: invalid class name */
public final class AnonymousClass04E extends RuntimeException {
    public AnonymousClass04E() {
        super("Redex: Unreachable code. This should never get triggered.");
    }

    public static AnonymousClass04E createAndThrow() {
        throw new AnonymousClass04E();
    }
}
