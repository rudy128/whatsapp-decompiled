package X;

public abstract class C2S extends Exception {
    public Throwable cause;

    public C2S() {
    }

    public C2S(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.cause;
    }
}
