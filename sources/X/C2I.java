package X;

public class C2I extends Exception {
    public C2I(String str, Throwable th) {
        super(str, th);
    }

    public C2I(String str) {
        super(str);
    }
}
