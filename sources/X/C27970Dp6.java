package X;

/* renamed from: X.Dp6  reason: case insensitive filesystem */
public final class C27970Dp6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BXH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27970Dp6(BXH bxh) {
        super(1);
        this.this$0 = bxh;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C24358Bzt bzt = (C24358Bzt) obj;
        C18070vi.A0d(bzt, 0);
        BXH bxh = this.this$0;
        C24712CGy.A01.A04("sup:SocketConnectionStateDelegateV2", AnonymousClass001.A1E(bzt, "Failed to switchLink to BTC: ", AnonymousClass000.A10()), (Throwable) null);
        C24595CAq cAq = C24595CAq.$redex_init_class;
        switch (bzt.ordinal()) {
            case 1:
                str = "LINK_SWITCH_DEVICE_NOT_SECURED_OVER_BLE";
                break;
            case 2:
                str = "LINK_SWITCH_UNSUPPORTED_TRANSPORT_TYPE";
                break;
            case 3:
                str = "LINK_SWITCH_DEVICE_NOT_CONNECTED_OVER_BLE";
                break;
            case 4:
                str = "LINK_SWITCH_FAILED_TO_CONNECT_SOCKET";
                break;
            case 5:
                str = "LINK_SWITCH_BLUETOOTH_NOT_ENABLED";
                break;
            case 6:
                str = "LINK_SWITCH_FAILED_TO_SWITCH_TO_BTC";
                break;
            case 7:
                str = "LINK_SWITCH_FAILED_TO_SWITCH_TO_WIFI";
                break;
            default:
                str = "LINK_SWITCH_UNKNOWN_ERROR";
                break;
        }
        bxh.A00.A0C(new C22951BWx(str), (Throwable) null, false);
        return C27621Wu.A00;
    }
}
