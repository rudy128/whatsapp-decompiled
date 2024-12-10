package X;

import java.util.Map;

public final class AZL implements BBN {
    public final /* synthetic */ BBM A00;
    public final /* synthetic */ C20130A8q A01;
    public final /* synthetic */ String A02;

    public AZL(BBM bbm, C20130A8q a8q, String str) {
        this.A01 = a8q;
        this.A02 = str;
        this.A00 = bbm;
    }

    public void Bu4(C19976A1m a1m) {
        this.A00.Btu(new C19980A1q(Integer.valueOf((int) a1m.A00), "", a1m.A01), (Map) null);
    }

    public void Bu5(AnonymousClass9DP r3) {
        C20062A5l.A03(this.A01, r3, this.A02);
        this.A00.C7V(C20062A5l.A00(r3));
    }
}
