package X;

import java.util.Iterator;

public class DTN implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ DGH A02;
    public final /* synthetic */ CA0 A03;
    public final /* synthetic */ D40 A04;
    public final /* synthetic */ D49 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public DTN(DGH dgh, CA0 ca0, D40 d40, D49 d49, Integer num, String str, String str2, String str3, long j, long j2, boolean z) {
        this.A02 = dgh;
        this.A05 = d49;
        this.A04 = d40;
        this.A03 = ca0;
        this.A01 = j;
        this.A06 = num;
        this.A00 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A0A = z;
        this.A09 = str3;
    }

    public void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            C28613EAh A0U = BE6.A0U(it);
            D49 d49 = this.A05;
            D40 d40 = this.A04;
            CA0 ca0 = this.A03;
            long j = this.A01;
            Integer num = this.A06;
            long j2 = this.A00;
            A0U.C9z(ca0, d40, d49, num, this.A07, this.A08, this.A09, j, j2, this.A0A);
        }
    }
}
