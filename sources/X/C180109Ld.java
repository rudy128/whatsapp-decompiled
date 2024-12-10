package X;

/* renamed from: X.9Ld  reason: invalid class name and case insensitive filesystem */
public class C180109Ld extends IllegalStateException {
    public Throwable cause;

    public C180109Ld(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
