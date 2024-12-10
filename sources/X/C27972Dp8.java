package X;

import java.util.UUID;

/* renamed from: X.Dp8  reason: case insensitive filesystem */
public final class C27972Dp8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BXI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27972Dp8(BXI bxi) {
        super(1);
        this.this$0 = bxi;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26127Csp csp = (C26127Csp) obj;
        C18070vi.A0d(csp, 0);
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onDeviceAdded for ");
        UUID uuid = csp.A0B;
        cn1.A02("sup:WiFiDirectStateDelegate", C17890vO.A0V(uuid, A10));
        this.this$0.A00.A00.A04 = new C22871BTf(csp, (C22868BTc) null, uuid);
        BQm.A0Q.A09(uuid);
        C25838Cms cms = this.this$0.A00.A0J;
        if (cms != null) {
            cms.A03("socket_connection_connected");
        }
        BQm bQm = this.this$0.A00;
        bQm.A04(new BXR(bQm.A09()));
        return C27621Wu.A00;
    }
}
