package X;

public final /* synthetic */ class DTO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23841Bqy A01;
    public final /* synthetic */ C37721q1 A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public final void run() {
        C37721q1 r10 = this.A02;
        C23841Bqy bqy = this.A01;
        boolean z = this.A08;
        Boolean bool = this.A04;
        boolean z2 = this.A09;
        int i = this.A00;
        boolean z3 = this.A0A;
        boolean z4 = this.A0B;
        boolean z5 = this.A07;
        Boolean bool2 = this.A03;
        Integer num = this.A05;
        Integer num2 = this.A06;
        C18070vi.A0d(bqy, 1);
        Boolean valueOf = Boolean.valueOf(z2);
        Integer valueOf2 = Integer.valueOf(i);
        Boolean valueOf3 = Boolean.valueOf(z3);
        Boolean valueOf4 = Boolean.valueOf(z4);
        Boolean valueOf5 = Boolean.valueOf(z5);
        C37721q1.A01(bqy, r10, 2, r10.A0A);
        bqy.A07 = 10;
        bqy.A03 = Boolean.valueOf(z);
        bqy.A0A = valueOf2;
        bqy.A09 = num;
        bqy.A00 = valueOf3;
        bqy.A04 = valueOf4;
        bqy.A05 = valueOf5;
        bqy.A0B = num2;
        if (r10.A01.A07()) {
            bqy.A02 = valueOf;
            bqy.A01 = bool;
            bqy.A06 = bool2;
        }
        r10.A02.CC7(bqy);
    }

    public /* synthetic */ DTO(C23841Bqy bqy, C37721q1 r2, Boolean bool, Boolean bool2, Integer num, Integer num2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = r2;
        this.A01 = bqy;
        this.A08 = z;
        this.A04 = bool;
        this.A09 = z2;
        this.A00 = i;
        this.A0A = z3;
        this.A0B = z4;
        this.A07 = z5;
        this.A03 = bool2;
        this.A05 = num;
        this.A06 = num2;
    }
}
