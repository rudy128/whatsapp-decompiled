package X;

import java.util.Iterator;

public class DTA implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ DGH A02;
    public final /* synthetic */ D49 A03;

    public DTA(DGH dgh, D49 d49, float f, long j) {
        this.A02 = dgh;
        this.A00 = f;
        this.A01 = j;
        this.A03 = d49;
    }

    public void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            BE6.A0U(it).C0n(this.A03, this.A00, this.A01);
        }
    }
}
