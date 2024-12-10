package X;

public class C29 extends Exception {
    public Throwable cause;

    public C29(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
