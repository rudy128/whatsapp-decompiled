package X;

/* renamed from: X.8uG  reason: invalid class name and case insensitive filesystem */
public final class C172938uG extends C172818u4 {
    public final Throwable cause;

    public C172938uG(A2F a2f, Throwable th) {
        super(AnonymousClass001.A1E(a2f, "Uncaught exception during onData callback for:\n", AnonymousClass000.A10()), th);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
