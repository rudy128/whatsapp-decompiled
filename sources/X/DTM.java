package X;

import java.util.Iterator;

public class DTM implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ DGH A01;
    public final /* synthetic */ D40 A02;
    public final /* synthetic */ D49 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public DTM(DGH dgh, D40 d40, D49 d49, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.A01 = dgh;
        this.A03 = d49;
        this.A02 = d40;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C28613EAh A0U = BE6.A0U(it);
            D49 d49 = this.A03;
            D40 d40 = this.A02;
            boolean z = this.A0A;
            boolean z2 = this.A09;
            A0U.CA4(d40, d49, this.A08, this.A04, this.A05, this.A06, this.A07, this.A00, z, z2);
        }
    }
}
