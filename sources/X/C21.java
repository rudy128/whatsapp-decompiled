package X;

public abstract class C21 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C21(String str) {
        super(str);
        this.message = str;
    }
}
