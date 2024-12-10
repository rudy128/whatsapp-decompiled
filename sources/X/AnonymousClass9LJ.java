package X;

/* renamed from: X.9LJ  reason: invalid class name */
public final class AnonymousClass9LJ extends Exception {
    public final Throwable cause = null;
    public final int errorCode;
    public final String iqId;
    public final String message = null;

    public AnonymousClass9LJ(String str, int i) {
        super((String) null, (Throwable) null);
        this.iqId = str;
        this.errorCode = i;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
