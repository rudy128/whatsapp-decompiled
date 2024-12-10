package X;

/* renamed from: X.8u6  reason: invalid class name and case insensitive filesystem */
public final class C172838u6 extends C173518vD {
    public final Throwable cause;
    public final String message;

    public C172838u6(String str, Throwable th) {
        super(str, "CLIENT", "mex-unknown-error", th, 417);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public C172838u6() {
        this((String) null, (Throwable) null);
    }
}
