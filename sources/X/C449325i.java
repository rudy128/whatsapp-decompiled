package X;

/* renamed from: X.25i  reason: invalid class name and case insensitive filesystem */
public class C449325i implements Runnable {
    public final int A00;

    public C449325i(int i) {
        this.A00 = i;
    }

    public final void run() {
        if (this.A00 == 0) {
            AnonymousClass18M.A0E.countDown();
        }
    }
}
