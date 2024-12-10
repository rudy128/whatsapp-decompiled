package X;

public final class C2K extends Exception {
    public final int reason;

    public C2K(Exception exc, int i) {
        super(exc);
        this.reason = i;
    }

    public C2K() {
        this.reason = 1;
    }
}
