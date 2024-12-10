package X;

/* renamed from: X.DAg  reason: case insensitive filesystem */
public final /* synthetic */ class C26707DAg implements E49 {
    public final /* synthetic */ DHE A00;

    public final void Bxl(C2X c2x) {
        DHE dhe = this.A00;
        Object obj = dhe.A0J;
        synchronized (obj) {
            dhe.A0W = c2x;
            dhe.A00--;
            obj.notifyAll();
        }
    }

    public /* synthetic */ C26707DAg(DHE dhe) {
        this.A00 = dhe;
    }
}
