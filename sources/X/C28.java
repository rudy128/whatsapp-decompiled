package X;

public abstract class C28 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C28(String str) {
        super(str);
        this.message = str;
    }
}
