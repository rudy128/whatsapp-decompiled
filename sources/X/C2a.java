package X;

public abstract class C2a extends Exception {
    public C2a(String str, Throwable th) {
        super(str, th);
    }

    public C2a(String str) {
        super(str);
    }

    public C2a() {
    }

    public C2a(Throwable th) {
        super(th);
    }
}
