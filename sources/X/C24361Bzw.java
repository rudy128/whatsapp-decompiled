package X;

import java.util.Map;

/* renamed from: X.Bzw  reason: case insensitive filesystem */
public enum C24361Bzw {
    UNKNOWN(0, "Unknown error"),
    NO_DEVICE_IDENTITY_KEYS(1, "Missing device public keys"),
    DEVICE_IDENTITY_KEYS_MISMATCH(2, "service UUID from linking app does not match the registered UUID"),
    RESOURCE_BUSY(3, "Requested resource is busy"),
    BTC_ADDRESS_RETRIEVAL_FAIL(4, "Failed to get btcAddress for any paired device"),
    WIFI_ADDRESS_RETRIEVAL_FAIL(5, "Failed to get IP address for any paired device"),
    WIFI_DISABLED(6, "WiFi is disabled"),
    WIFI_DIRECT_GROUP_FAIL(7, "Failed to create WiFi Direct group"),
    WIFI_LOCATION_PERMISSIONS_DISABLED(8, "Location permissions are not granted for MWA"),
    WIFI_LOCATION_SERVICE_DISABLED(9, "Location service is not enabled on the phone"),
    WIFI_NEARBY_DEVICES_PERMISSIONS_DISABLED(10, "NEARBY_DEVICES permission is not granted for MWA"),
    HOTSPOT_ENABLED(11, "Failed to create WiFi Direct group as hotspot is enabled");
    
    public static final Map A00 = null;
    public final int error;
    public final String message;

    /* access modifiers changed from: public */
    static {
        int i;
        C24361Bzw[] bzwArr;
        A01 = C19780yz.A00(bzwArr);
        DVM dvm = new DVM();
        for (C24361Bzw bzw : values()) {
            dvm.put(Integer.valueOf(bzw.error), bzw);
        }
        A00 = C200610r.A05(dvm);
    }

    /* access modifiers changed from: public */
    C24361Bzw(int i, String str) {
        this.error = i;
        this.message = str;
    }
}
