package X;

/* renamed from: X.8uE  reason: invalid class name and case insensitive filesystem */
public final class C172918uE extends C172848u7 {
    public final Throwable cause;
    public final String message;

    public C172918uE(String str, Throwable th) {
        super(str, "mex-parsing-failure-oom", new Throwable[]{th}, 477);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
