package X;

/* renamed from: X.C2o  reason: case insensitive filesystem */
public class C24415C2o extends IllegalStateException {
    public Throwable cause;

    public C24415C2o(String str) {
        super(str);
    }

    public C24415C2o(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
