package X;

/* renamed from: X.9Lc  reason: invalid class name and case insensitive filesystem */
public class C180099Lc extends IllegalStateException {
    public Throwable cause;

    public C180099Lc(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
