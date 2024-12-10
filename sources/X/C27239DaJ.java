package X;

/* renamed from: X.DaJ  reason: case insensitive filesystem */
public class C27239DaJ extends Thread {
    public final /* synthetic */ C26697D9v A00;

    public C27239DaJ(C26697D9v d9v) {
        this.A00 = d9v;
    }

    public void run() {
        C26697D9v d9v = this.A00;
        synchronized (d9v) {
            C26697D9v.A03(d9v);
            Object obj = d9v.A01;
            synchronized (obj) {
                d9v.A02 = true;
                obj.notifyAll();
            }
        }
    }
}
