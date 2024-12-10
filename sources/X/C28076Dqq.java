package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Dqq  reason: case insensitive filesystem */
public final class C28076Dqq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Throwable $error;
    public final /* synthetic */ C24496C6o $readyLink;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28076Dqq(C24496C6o c6o, C26256Cw0 cw0, Throwable th) {
        super(1);
        this.$error = th;
        this.this$0 = cw0;
        this.$readyLink = c6o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C22867BTb bTb = (C22867BTb) obj;
        C18070vi.A0d(bTb, 0);
        C25647Cjd cjd = bTb.A00;
        if (cjd != null) {
            Throwable th = this.$error;
            C18070vi.A0d(th, 0);
            C25647Cjd.A00(cjd, C108945cZ.A1J(th));
        }
        bTb.A00 = null;
        bTb.A08 = null;
        bTb.A07 = null;
        bTb.A02 = null;
        ConcurrentHashMap concurrentHashMap = this.this$0.A07;
        C41681wt.A03(concurrentHashMap).remove(this.$readyLink.A06());
        ConcurrentHashMap concurrentHashMap2 = this.this$0.A08;
        C41681wt.A03(concurrentHashMap2).remove(this.$readyLink.A07());
        return C27621Wu.A00;
    }
}
