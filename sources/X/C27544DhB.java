package X;

import java.util.UUID;

/* renamed from: X.DhB  reason: case insensitive filesystem */
public final class C27544DhB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27544DhB(BXH bxh) {
        super(0);
        this.this$0 = bxh;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C27544DhB.super.A07();
        BXH bxh = this.this$0;
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A02("sup:SocketConnectionStateDelegateV2", "[SOCKET_CONNECTION_BTC_V2]: Called handleLinkedDeviceSetup()");
        C26153CtL ctL = BQm.A0Q;
        if (ctL.A04().isEmpty()) {
            cn1.A06("sup:SocketConnectionStateDelegateV2", "[SOCKET_CONNECTION_BTC_V2]: no devices ready for connect!", (Throwable) null);
            bxh.A00.A0C(new C22951BWx("DEVICE_ERROR"), (Throwable) null, false);
        } else {
            UUID fromString = UUID.fromString(((CXV) C29431cG.A0b(ctL.A04())).A00());
            BQm bQm = bxh.A00;
            C25258Cbx cbx = bQm.A00;
            CZ7 cz7 = cbx.A05;
            if (cz7 != null) {
                cz7.A04.A04 = new C28051DqQ(bxh, fromString);
            }
            if (bQm.A0G.A03 == AnonymousClass00R.A0N && cz7 != null) {
                cz7.A04.A03 = new C27969Dp5(bxh);
            }
            cn1.A02("sup:SocketConnectionStateDelegateV2", AnonymousClass001.A1E(fromString, "[SOCKET_CONNECTION_BTC_V2]: Establishing BTC connection for ", AnonymousClass000.A10()));
            C25838Cms cms = bQm.A0J;
            if (cms != null) {
                cms.A03("socket_connection_request");
            }
            CZ7 cz72 = cbx.A05;
            if (cz72 != null) {
                C18070vi.A0b(fromString);
                cz72.A01(C24337BzY.BTC, fromString, new C27970Dp6(bxh));
            }
        }
        return C27621Wu.A00;
    }
}
