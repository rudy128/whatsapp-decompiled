package X;

/* renamed from: X.AmS  reason: case insensitive filesystem */
public final class C21578AmS extends RuntimeException {
    public final AnonymousClass9I6 callbackName;
    public final Throwable cause;

    public C21578AmS(AnonymousClass9I6 r1, Throwable th) {
        super(th);
        this.callbackName = r1;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
