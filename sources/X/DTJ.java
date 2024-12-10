package X;

import java.util.Iterator;

public class DTJ implements Runnable {
    public final /* synthetic */ DGH A00;
    public final /* synthetic */ CA0 A01;
    public final /* synthetic */ D40 A02;
    public final /* synthetic */ D49 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public DTJ(DGH dgh, CA0 ca0, D40 d40, D49 d49, Integer num, String str, boolean z, boolean z2) {
        this.A00 = dgh;
        this.A03 = d49;
        this.A02 = d40;
        this.A01 = ca0;
        this.A04 = num;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
    }

    public void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            C28613EAh A0U = BE6.A0U(it);
            D49 d49 = this.A03;
            D40 d40 = this.A02;
            A0U.C9x(this.A01, d40, d49, this.A04, this.A05, this.A07, this.A06);
        }
    }
}
