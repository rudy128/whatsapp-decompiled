package X;

public abstract class C22 extends Exception {
    public final String message = "varint must be encoded as 10-bytes or less";

    public C22() {
        super("varint must be encoded as 10-bytes or less");
    }

    public String getMessage() {
        return this.message;
    }
}
