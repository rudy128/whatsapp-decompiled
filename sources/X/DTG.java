package X;

import java.util.Iterator;

public class DTG implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ DGH A01;
    public final /* synthetic */ D40 A02;
    public final /* synthetic */ D49 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public DTG(DGH dgh, D40 d40, D49 d49, String str, long j, boolean z, boolean z2) {
        this.A01 = dgh;
        this.A03 = d49;
        this.A02 = d40;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A04 = str;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C28613EAh A0U = BE6.A0U(it);
            D49 d49 = this.A03;
            D40 d40 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            A0U.C6I(d40, d49, this.A04, this.A00, z, z2);
        }
    }
}
