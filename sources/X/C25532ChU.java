package X;

/* renamed from: X.ChU  reason: case insensitive filesystem */
public final class C25532ChU {
    public static final C25532ChU A00 = new Object();
    public volatile C25532ChU next;
    public volatile Thread thread;

    public C25532ChU() {
        C6U c6u = DMs.A00;
        Thread currentThread = Thread.currentThread();
        if (c6u instanceof C22729BMr) {
            this.thread = currentThread;
        } else {
            ((C22730BMs) c6u).A03.lazySet(this, currentThread);
        }
    }
}
