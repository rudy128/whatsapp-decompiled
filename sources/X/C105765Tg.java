package X;

import java.util.Map;

/* renamed from: X.5Tg  reason: invalid class name and case insensitive filesystem */
public final class C105765Tg extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass440 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105765Tg(AnonymousClass440 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        C18070vi.A0d(map, 0);
        Object obj2 = map.get(this.this$0.A05);
        if (obj2 != null) {
            return obj2;
        }
        AnonymousClass440 r0 = this.this$0;
        return r0.A02.A02(r0.A05);
    }
}
