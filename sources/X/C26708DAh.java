package X;

/* renamed from: X.DAh  reason: case insensitive filesystem */
public class C26708DAh implements E4A {
    public final /* synthetic */ DHE A00;

    public C26708DAh(DHE dhe) {
        this.A00 = dhe;
    }

    public void Bxu() {
        DHE dhe = this.A00;
        Object obj = dhe.A0J;
        synchronized (obj) {
            dhe.A04 = true;
            dhe.A00--;
            obj.notifyAll();
        }
    }
}
