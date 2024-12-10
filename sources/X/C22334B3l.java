package X;

import java.util.Map;

/* renamed from: X.B3l  reason: case insensitive filesystem */
public final class C22334B3l extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C20129A8p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22334B3l(C20129A8p a8p) {
        super(3);
        this.this$0 = a8p;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Map map = (Map) obj2;
        C19980A1q a1q = (C19980A1q) obj3;
        C20129A8p a8p = this.this$0;
        C192819p2 r1 = a8p.A05;
        if (r1 != null) {
            C187379fi r0 = a8p.A01;
            if (r0 == null) {
                C18070vi.A11("flowManager");
                throw null;
            }
            r1.A01((String) AnonymousClass8BT.A0s(r0.A03));
        }
        C20129A8p a8p2 = this.this$0;
        if (str == null) {
            C176198zw r02 = a8p2.A0G;
            r02.A01.A04(a8p2.A00, 3);
            C20129A8p.A06(this.this$0, a1q, map);
        } else {
            C20129A8p.A05(a8p2, a1q, str, map, 2);
        }
        return C27621Wu.A00;
    }
}
