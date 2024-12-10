package X;

/* renamed from: X.Bzt  reason: case insensitive filesystem */
public enum C24358Bzt {
    UNKNOWN(0, "Unknown error"),
    DEVICE_NOT_SECURED_OVER_BLE(1, "Device needs to be secured over BLE first"),
    UNSUPPORTED_TRANSPORT_TYPE(2, "Transport type not supported"),
    DEVICE_NOT_CONNECTED_OVER_BLE(3, "Device needs to be connected over BLE first"),
    FAILED_TO_CONNECT_SOCKET(4, "Failed to connect to socket"),
    BLUETOOTH_NOT_ENABLED(5, "Bluetooth not enabled"),
    FAILED_TO_SWITCH_TO_BTC(6, "Failed to switch to BTC link"),
    FAILED_TO_SWITCH_TO_WIFI(7, "Failed to switch to WiFi link");
    
    public final int error;
    public final String message;

    /* access modifiers changed from: public */
    static {
        C24358Bzt[] bztArr;
        A00 = C19780yz.A00(bztArr);
    }

    /* access modifiers changed from: public */
    C24358Bzt(int i, String str) {
        this.error = i;
        this.message = str;
    }
}
