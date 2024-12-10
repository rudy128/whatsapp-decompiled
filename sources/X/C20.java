package X;

public abstract class C20 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C20(String str) {
        super(str);
        this.message = str;
    }
}
