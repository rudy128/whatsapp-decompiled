package X;

/* renamed from: X.9LX  reason: invalid class name */
public class AnonymousClass9LX extends Exception {
    public final Throwable cause;
    public final String message;

    public AnonymousClass9LX(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public AnonymousClass9LX() {
        this((String) null, (Throwable) null);
    }
}
