package X;

/* renamed from: X.8uF  reason: invalid class name and case insensitive filesystem */
public final class C172928uF extends C172848u7 {
    public final Throwable cause;
    public final String message;

    public C172928uF(String str, Throwable th) {
        super(str, "mex-parsing-failure-unknown", new Throwable[]{th}, 472);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public C172928uF() {
        this((String) null, (Throwable) null);
    }
}
