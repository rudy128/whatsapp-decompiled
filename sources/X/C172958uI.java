package X;

/* renamed from: X.8uI  reason: invalid class name and case insensitive filesystem */
public final class C172958uI extends C172818u4 {
    public final Throwable cause;
    public final String message;

    public C172958uI(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public C172958uI() {
        this((String) null, (Throwable) null);
    }
}
