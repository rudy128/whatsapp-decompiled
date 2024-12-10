package X;

/* renamed from: X.Aj2  reason: case insensitive filesystem */
public final /* synthetic */ class C21373Aj2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C24421Kg A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void run() {
        C24421Kg r3 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        int i = this.A00;
        C24421Kg.A09(r3);
        synchronized (r3.A0I) {
            if (r3.A0B() != null) {
                C24421Kg.A00(r3, str, str2, str3, i, false).A00(new AVT(r3, 1));
            }
        }
    }

    public /* synthetic */ C21373Aj2(C24421Kg r1, String str, String str2, String str3, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
    }
}
