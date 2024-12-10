package X;

import java.util.Iterator;

public class DTL implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ DGH A01;
    public final /* synthetic */ D40 A02;
    public final /* synthetic */ D49 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public DTL(DGH dgh, D40 d40, D49 d49, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01 = dgh;
        this.A03 = d49;
        this.A02 = d40;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A08 = z;
        this.A07 = str4;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C28613EAh A0U = BE6.A0U(it);
            D49 d49 = this.A03;
            A0U.C9v(this.A02, d49, this.A05, this.A06, this.A04, this.A07, this.A00, this.A08);
        }
    }
}
