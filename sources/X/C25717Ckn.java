package X;

/* renamed from: X.Ckn  reason: case insensitive filesystem */
public class C25717Ckn {
    public boolean A00;
    public final C28617EAp A01;

    public synchronized void A00() {
        this.A00 = false;
    }

    public synchronized boolean A01() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public C25717Ckn(C28617EAp eAp) {
        this.A01 = eAp;
    }

    public C25717Ckn() {
        this(C28617EAp.A00);
    }
}
