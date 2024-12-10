package X;

import java.util.Iterator;

public class DTC implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ DGH A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public DTC(DGH dgh, long j, long j2, boolean z, boolean z2) {
        this.A02 = dgh;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A04 = z2;
    }

    public void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            BE6.A0U(it).C72(this.A01, this.A00, this.A03, this.A04);
        }
    }
}
