package X;

import java.util.Iterator;

public class DTD implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ DGH A01;
    public final /* synthetic */ C25951CpJ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public DTD(DGH dgh, C25951CpJ cpJ, String str, String str2, String str3, long j) {
        this.A01 = dgh;
        this.A00 = j;
        this.A05 = str;
        this.A02 = cpJ;
        this.A03 = str2;
        this.A04 = str3;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C28613EAh A0U = BE6.A0U(it);
            long j = this.A00;
            A0U.BtN(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
