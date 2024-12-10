package X;

public class C2U extends Exception {
    public C2U(String str, Throwable th) {
        super(str, th);
    }

    public C2U(String str) {
        super(str);
    }

    public C2U() {
    }
}
