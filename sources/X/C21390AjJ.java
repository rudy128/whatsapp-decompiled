package X;

import java.util.Map;

/* renamed from: X.AjJ  reason: case insensitive filesystem */
public final /* synthetic */ class C21390AjJ implements Runnable {
    public final /* synthetic */ A8V A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;

    public final void run() {
        A8V a8v = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        String str5 = this.A05;
        Map map = this.A06;
        A98 a98 = (A98) a8v.A02.get();
        synchronized (a8v) {
        }
        a98.A0Q(str, str2, str3, str4, str5, map);
    }

    public /* synthetic */ C21390AjJ(A8V a8v, String str, String str2, String str3, String str4, String str5, Map map) {
        this.A00 = a8v;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = map;
    }
}
