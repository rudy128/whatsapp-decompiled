package X;

public enum C14 implements E68 {
    SNAPP_UNKNOWN_ERROR(0),
    SNAPP_SUCCESS(1),
    SNAPP_UNKNOWN_MESSAGE(2),
    SNAPP_UNHANDLED_MESSAGE(3),
    SNAPP_PAYLOAD_CORRUPTED(4),
    SNAPP_UNSUPPORTED_APP(5),
    SNAPP_NOT_ENOUGH_BATTERY(6),
    SNAPP_THERMAL_THROTTLING(7),
    SNAPP_NOT_ENOUGH_STORAGE(8),
    SNAPP_START_APP_FAILED(9),
    SNAPP_STOP_APP_FAILED(10),
    SNAPP_APP_NOT_RUNNING(11),
    SNAPP_APP_ALREADY_STARTED(12),
    SNAPP_NOT_ENOUGH_PRIORITY(13),
    SNAPP_CHARGING_NOT_CONNECTED(14),
    SNAPP_DENIED_BY_PEAK_POWER(15),
    SNAPP_POWER_DOWN(16),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C14(int i) {
        this.value = i;
    }
}
