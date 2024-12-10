package X;

public class DZr extends RuntimeException {
    public DZr() {
        super("Presented MAC doesn't match calculated MAC (MAC prepended)");
    }
}
