package X;

/* renamed from: X.Aj0  reason: case insensitive filesystem */
public final /* synthetic */ class C21371Aj0 implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ A7P A04;

    public final void run() {
        A7P a7p = this.A04;
        int i = this.A01;
        double d = this.A00;
        long j = this.A02;
        long j2 = this.A03;
        C171778sG A002 = A7P.A00(a7p, i);
        A002.A01 = Double.valueOf(d);
        A002.A0H = Long.valueOf(j);
        A002.A0I = Long.valueOf(j2);
        synchronized (a7p) {
            AnonymousClass1Ez r2 = a7p.A0A;
            r2.A01 = 0;
            r2.A00 = 0;
            r2.A04();
        }
        A7P.A01(A002, a7p);
    }

    public /* synthetic */ C21371Aj0(A7P a7p, double d, int i, long j, long j2) {
        this.A04 = a7p;
        this.A01 = i;
        this.A00 = d;
        this.A02 = j;
        this.A03 = j2;
    }
}
