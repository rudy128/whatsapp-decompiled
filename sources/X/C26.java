package X;

public abstract class C26 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C26(String str) {
        super(str);
        this.message = str;
    }
}
