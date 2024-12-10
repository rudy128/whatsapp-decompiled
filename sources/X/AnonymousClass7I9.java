package X;

import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import com.whatsapp.graphql.GraphqlRequest$postAwaitResult$2;

/* renamed from: X.7I9  reason: invalid class name */
public final class AnonymousClass7I9 implements AnonymousClass8AB {
    public final C1601787l A00;
    public final C131206ki A01;
    public final C133856pc A02;
    public final C136936ue A03;

    public void CBv(C1606989o r9) {
        C18070vi.A0d(r9, 0);
        if (this.A02.A00() != null) {
            C131206ki r2 = this.A01;
            C35021lW r3 = C35021lW.A03;
            C144567Hu r5 = new C144567Hu(this, 1);
            C18070vi.A0d(r3, 0);
            r2.A01(r3, (AnonymousClass6WV) null, r5, 0).CBv(r9);
            return;
        }
        Exception exc = new Exception("Trying to send Avatar GQL request without existing user.");
        this.A03.A02(0, "GQL request without user acount", (String) null);
        r9.Bsw(exc);
    }

    public /* synthetic */ Object CBx(C30391dr r3, C18560wh r4) {
        return C30451dy.A00(r3, r4, new GraphqlRequest$postAwait$2(this, (C30391dr) null));
    }

    public /* synthetic */ Object CBy(C30391dr r3, C18560wh r4) {
        return C30451dy.A00(r3, r4, new GraphqlRequest$postAwaitResult$2(this, (C30391dr) null));
    }

    public AnonymousClass7I9(C131206ki r1, C133856pc r2, C1601787l r3, C136936ue r4) {
        C18070vi.A0s(r4, r2, r1, r3);
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }

    public long BQn() {
        return 0;
    }
}
