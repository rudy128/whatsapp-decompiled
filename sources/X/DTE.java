package X;

public final /* synthetic */ class DTE implements Runnable {
    public final /* synthetic */ C23841Bqy A00;
    public final /* synthetic */ C37721q1 A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        C37721q1 r8 = this.A01;
        C23841Bqy bqy = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        Boolean bool = this.A02;
        Integer num = this.A03;
        C18070vi.A0d(bqy, 1);
        Boolean valueOf = Boolean.valueOf(z2);
        C37721q1.A01(bqy, r8, 2, r8.A0A);
        bqy.A07 = 9;
        bqy.A03 = Boolean.valueOf(z);
        bqy.A0A = num;
        bqy.A09 = null;
        bqy.A00 = null;
        bqy.A04 = null;
        bqy.A05 = null;
        bqy.A0B = null;
        if (r8.A01.A07()) {
            bqy.A02 = bool;
            bqy.A01 = valueOf;
            bqy.A06 = null;
        }
        r8.A02.CC7(bqy);
    }

    public /* synthetic */ DTE(C23841Bqy bqy, C37721q1 r2, Boolean bool, Integer num, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = bqy;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = bool;
        this.A03 = num;
    }
}
