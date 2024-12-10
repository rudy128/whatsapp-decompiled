package X;

public class DZY extends RuntimeException {
    public DZY(Exception exc) {
        super("GeoAPI is not available. Please register your own location provider.", exc);
    }
}
