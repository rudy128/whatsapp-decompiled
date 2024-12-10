package X;

public class C2Z extends Exception {
    public C2Z(String str, Throwable th) {
        super(str, th);
    }

    public C2Z(String str) {
        super(str);
    }

    public C2Z() {
    }

    public C2Z(Throwable th) {
        super(th);
    }
}
