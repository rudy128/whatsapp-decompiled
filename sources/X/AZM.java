package X;

public final class AZM implements BBN {
    public final /* synthetic */ C190479l0 A00;
    public final /* synthetic */ C20130A8q A01;
    public final /* synthetic */ A2X A02;
    public final /* synthetic */ String A03;

    public AZM(C190479l0 r1, C20130A8q a8q, A2X a2x, String str) {
        this.A02 = a2x;
        this.A01 = a8q;
        this.A03 = str;
        this.A00 = r1;
    }

    public void Bu4(C19976A1m a1m) {
        A2X a2x = this.A02;
        if (a2x != null) {
            a2x.A02(new C21102AeW(true));
        }
        this.A00.A00(C20062A5l.A01(Integer.valueOf((int) a1m.A00), (String) null, a1m.A01, a1m.A02));
    }

    public void Bu5(AnonymousClass9DP r4) {
        A2X a2x = this.A02;
        if (a2x != null) {
            a2x.A02(new C21102AeW(true));
        }
        C20062A5l.A03(this.A01, r4, this.A03);
        this.A00.A00(C20062A5l.A00(r4));
    }
}
