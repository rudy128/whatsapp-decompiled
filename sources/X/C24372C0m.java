package X;

/* renamed from: X.C0m  reason: case insensitive filesystem */
public enum C24372C0m implements C28457E1x {
    NONE(-1),
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17);
    
    public static final E5N A00 = null;
    public final int value;

    /* JADX WARNING: type inference failed for: r0v22, types: [X.E5N, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        A00 = new Object();
    }

    /* access modifiers changed from: public */
    C24372C0m(int i) {
        this.value = i;
    }
}
