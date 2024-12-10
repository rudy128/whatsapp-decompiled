package X;

public abstract class C27 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C27(String str) {
        super(str);
        this.message = str;
    }
}
