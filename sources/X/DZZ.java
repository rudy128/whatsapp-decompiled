package X;

public class DZZ extends RuntimeException {
    public DZZ() {
        super("Invalid bytebuf. Already closed");
    }
}
