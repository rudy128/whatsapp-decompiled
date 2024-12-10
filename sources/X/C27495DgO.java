package X;

import java.util.concurrent.Executors;

/* renamed from: X.DgO  reason: case insensitive filesystem */
public final class C27495DgO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ DBA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27495DgO(DBA dba) {
        super(0);
        this.this$0 = dba;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CTD ctd = this.this$0.A01;
        E4K e4k = ctd.A05;
        String str = ctd.A06;
        CET cet = ctd.A01;
        DAN dan = new DAN(cet, e4k, str);
        Executors.newSingleThreadExecutor();
        return new C25963CpV(cet, ctd.A02, ctd.A03, dan);
    }
}
