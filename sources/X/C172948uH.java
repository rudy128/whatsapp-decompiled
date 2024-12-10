package X;

/* renamed from: X.8uH  reason: invalid class name and case insensitive filesystem */
public final class C172948uH extends C172818u4 {
    public final Throwable cause;

    public C172948uH(A2F a2f, Throwable th) {
        super(AnonymousClass001.A1E(a2f, "Uncaught exception during onError callback for:\n", AnonymousClass000.A10()), th);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
