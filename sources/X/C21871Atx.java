package X;

import java.util.List;

/* renamed from: X.Atx  reason: case insensitive filesystem */
public final class C21871Atx extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C20135A8w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21871Atx(C20135A8w a8w) {
        super(0);
        this.this$0 = a8w;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C20135A8w a8w = this.this$0;
        A4G a4g = (A4G) AnonymousClass8BT.A0F(a8w).A0D.get();
        List list = a4g.A00;
        C18070vi.A0W(list);
        synchronized (list) {
            list.clear();
            C21446AkD.A01(a4g.A04, a4g, 32);
        }
        C21446AkD.A00(a8w.A0G, a8w, 30);
        return C27621Wu.A00;
    }
}
