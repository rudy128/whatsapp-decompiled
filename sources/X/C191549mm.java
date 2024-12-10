package X;

import java.util.Map;

/* renamed from: X.9mm  reason: invalid class name and case insensitive filesystem */
public final class C191549mm {
    public final /* synthetic */ C20129A8p A00;
    public final /* synthetic */ C195919u9 A01;
    public final /* synthetic */ AnonymousClass90N A02;
    public final /* synthetic */ C19980A1q A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C191549mm(C20129A8p a8p, C195919u9 r2, AnonymousClass90N r3, C19980A1q a1q, String str, Map map) {
        this.A00 = a8p;
        this.A04 = str;
        this.A02 = r3;
        this.A05 = map;
        this.A01 = r2;
        this.A03 = a1q;
    }

    public void A00() {
        C20129A8p a8p = this.A00;
        C192289o7 r2 = a8p.A03;
        if (r2 == null) {
            C18070vi.A11("fcsLoadingEventManager");
            throw null;
        }
        r2.A01((C19980A1q) null, "onLoadingCompletion", this.A04, (Map) null);
        AnonymousClass90N r5 = this.A02;
        Map map = this.A05;
        C20129A8p.A03(a8p, r5, map);
        C20129A8p.A01(a8p, this.A01, r5, this.A03, AnonymousClass00R.A00, (Integer) null, (String) null, map);
    }
}
