package X;

public abstract class C25 extends Exception {
    public final String message;

    public String getMessage() {
        return this.message;
    }

    public C25(String str) {
        super(str);
        this.message = str;
    }
}
