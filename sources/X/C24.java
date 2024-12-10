package X;

public abstract class C24 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C24(String str) {
        super(str);
        this.message = str;
    }
}
