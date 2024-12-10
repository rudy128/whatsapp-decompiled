package X;

import java.util.UUID;

/* renamed from: X.DqQ  reason: case insensitive filesystem */
public final class C28051DqQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ UUID $attemptDeviceUUID;
    public final /* synthetic */ BXH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28051DqQ(BXH bxh, UUID uuid) {
        super(1);
        this.$attemptDeviceUUID = uuid;
        this.this$0 = bxh;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26127Csp csp;
        C26127Csp csp2 = (C26127Csp) obj;
        C18070vi.A0d(csp2, 0);
        UUID uuid = csp2.A0B;
        if (C18070vi.A18(uuid, this.$attemptDeviceUUID)) {
            C25845Cn1 cn1 = C24712CGy.A01;
            cn1.A02("sup:SocketConnectionStateDelegateV2", AnonymousClass001.A1E(uuid, "onDeviceAdded for ", AnonymousClass000.A10()));
            C22871BTf bTf = this.this$0.A00.A00.A04;
            if (bTf == null || ((csp = bTf.A00) != null && csp.A04())) {
                this.this$0.A00.A00.A04 = new C22871BTf(csp2, (C22868BTc) null, uuid);
                BQm.A0Q.A09(uuid);
                BQm bQm = this.this$0.A00;
                bQm.A04(new BXR(bQm.A09()));
            } else {
                C26127Csp csp3 = bTf.A00;
                if (csp3 != null && !csp3.A04() && this.this$0.A00.A0G.A03 == AnonymousClass00R.A0N) {
                    cn1.A02("sup:SocketConnectionStateDelegateV2", "Success switching to Wifi Direct");
                    CYR cyr = this.this$0.A00.A0I;
                    if (cyr != null && !C72453Mb.A1a(cyr.A01)) {
                        cyr.A00.markerPoint(325398066, "wifi_direct_connected");
                    }
                    CYR cyr2 = this.this$0.A00.A0I;
                    if (cyr2 != null) {
                        cyr2.A00(2);
                    }
                    this.this$0.A00.A0M.invoke(new C22937BWf(true));
                }
            }
        }
        return C27621Wu.A00;
    }
}
