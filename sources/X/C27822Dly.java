package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.Dly  reason: case insensitive filesystem */
public final class C27822Dly extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24361Bzw $error;
    public final /* synthetic */ BXI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27822Dly(BXI bxi, C24361Bzw bzw) {
        super(0);
        this.this$0 = bxi;
        this.$error = bzw;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C25838Cms cms = this.this$0.A00.A0J;
        if (cms != null) {
            cms.A04(UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION, "illegal_wifi_setup");
            cms.A01(4);
        }
        C24361Bzw bzw = this.$error;
        C24596CAr cAr = C24596CAr.$redex_init_class;
        int ordinal = bzw.ordinal();
        if (ordinal == 6) {
            throw new C24411C2j(new C22951BWx("WIFI_DISABLED"), "[DISCOVERED] Wifi is disabled");
        } else if (ordinal == 11) {
            throw new C24411C2j(new C22951BWx("HOTSPOT_ENABLED"), "[DISCOVERED] Hotspot is enabled");
        } else if (ordinal != 12) {
            throw new C24411C2j(new C22951BWx("SOCKET_CONNECTION_UNKNOWN_APPLINK_ERROR"), "[DISCOVERED] Unknown Applink Error");
        } else {
            throw new C24411C2j(new C22951BWx("VPN_ENABLED"), "[DISCOVERED] VPN is enabled");
        }
    }
}
