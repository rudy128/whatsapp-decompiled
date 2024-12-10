package X;

import java.util.Map;

public class CZK {
    public C25124CYx A00;
    public Map A01;
    public C24147BwD A02;
    public final int A03;
    public final C25640CjT A04 = new C25640CjT();
    public final C28468E2j A05;
    public final C28526E6a A06;
    public volatile boolean A07 = false;

    public synchronized void A00() {
        if (this.A07) {
            this.A07 = false;
            C24147BwD bwD = this.A02;
            C17960vV.A07(bwD);
            bwD.interrupt();
            this.A02 = null;
        }
    }

    public synchronized void A01() {
        if (!this.A07) {
            this.A07 = true;
            C24147BwD bwD = new C24147BwD(this);
            this.A02 = bwD;
            bwD.start();
        }
    }

    public CZK(C28468E2j e2j, C28526E6a e6a, int i) {
        this.A03 = i;
        this.A06 = e6a;
        this.A05 = e2j;
    }
}
