package X;

public abstract class C2C extends Exception {
    public C2C(String str, Throwable th) {
        super(str, th);
    }

    public C2C(String str) {
        super(str);
    }
}
