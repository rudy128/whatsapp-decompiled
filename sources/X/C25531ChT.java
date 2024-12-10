package X;

/* renamed from: X.ChT  reason: case insensitive filesystem */
public final class C25531ChT {
    public static final C25531ChT A00 = new Object();
    public volatile C25531ChT next;
    public volatile Thread thread;

    public C25531ChT() {
        C6S c6s = DMr.A00;
        Thread currentThread = Thread.currentThread();
        if (c6s instanceof BJJ) {
            this.thread = currentThread;
        } else {
            ((BJK) c6s).A03.lazySet(this, currentThread);
        }
    }
}
