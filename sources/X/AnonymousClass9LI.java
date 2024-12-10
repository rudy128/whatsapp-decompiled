package X;

/* renamed from: X.9LI  reason: invalid class name */
public class AnonymousClass9LI extends Exception {
    public final Throwable cause;
    public final String message = "Can't create Mutation";

    public AnonymousClass9LI(Throwable th) {
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
