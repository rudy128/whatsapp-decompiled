package X;

/* renamed from: X.Dp5  reason: case insensitive filesystem */
public final class C27969Dp5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BXH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27969Dp5(BXH bxh) {
        super(1);
        this.this$0 = bxh;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C24361Bzw bzw = (C24361Bzw) obj;
        C18070vi.A0d(bzw, 0);
        BXH bxh = this.this$0;
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failed to switch to Wifi Direct due to ");
        cn1.A04("sup:SocketConnectionStateDelegateV2", AnonymousClass000.A0y(bzw.name(), A10), (Throwable) null);
        C24595CAq cAq = C24595CAq.$redex_init_class;
        switch (bzw.ordinal()) {
            case 1:
                str = "request_wifi_direct_no_device_identity_keys";
                break;
            case 2:
                str = "request_wifi_direct_device_identity_keys_mismatch";
                break;
            case 3:
                str = "request_wifi_direct_resource_busy";
                break;
            case 4:
                str = "request_wifi_direct_btc_address_retrieval_fail";
                break;
            case 5:
                str = "request_wifi_direct_wifi_address_retrieval_fail";
                break;
            case 6:
                str = "request_wifi_direct_wifi_disabled";
                break;
            case 7:
                str = "request_wifi_direct_group_fail";
                break;
            case 8:
                str = "request_wifi_direct_location_permissions_disabled";
                break;
            case 9:
                str = "request_wifi_direct_location_service_disabled";
                break;
            case 10:
                str = "request_wifi_direct_nearby_devices_permissions_disabled";
                break;
            case 11:
                str = "request_wifi_direct_hotspot_enabled";
                break;
            case 12:
                str = "request_wifi_direct_vpn_enabled";
                break;
            default:
                str = "request_wifi_direct_unknown_failure";
                break;
        }
        CYR cyr = bxh.A00.A0I;
        if (cyr != null) {
            cyr.A01("failure_reason", str);
            cyr.A00(3);
        }
        return C27621Wu.A00;
    }
}
