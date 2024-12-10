package X;

public abstract class C23 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C23(String str) {
        super(str);
        this.message = str;
    }
}
