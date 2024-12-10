package X;

/* renamed from: X.BnR  reason: case insensitive filesystem */
public final class C23658BnR extends C23577Bm6 implements C22356B4k {
    public static final C23658BnR DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    public static final int HIGHPRIORITYAPP_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public int errorCode_;
    public int errorDataCase_ = 0;
    public Object errorData_;
    public EE9 status_ = C23579Bm9.A02;

    static {
        C23658BnR bnR = new C23658BnR();
        DEFAULT_INSTANCE = bnR;
        C23577Bm6.A0E(bnR, C23658BnR.class);
    }

    public C14 A0R() {
        switch (this.errorCode_) {
            case 0:
                return C14.SNAPP_UNKNOWN_ERROR;
            case 1:
                return C14.SNAPP_SUCCESS;
            case 2:
                return C14.SNAPP_UNKNOWN_MESSAGE;
            case 3:
                return C14.SNAPP_UNHANDLED_MESSAGE;
            case 4:
                return C14.SNAPP_PAYLOAD_CORRUPTED;
            case 5:
                return C14.SNAPP_UNSUPPORTED_APP;
            case 6:
                return C14.SNAPP_NOT_ENOUGH_BATTERY;
            case 7:
                return C14.SNAPP_THERMAL_THROTTLING;
            case 8:
                return C14.SNAPP_NOT_ENOUGH_STORAGE;
            case 9:
                return C14.SNAPP_START_APP_FAILED;
            case 10:
                return C14.SNAPP_STOP_APP_FAILED;
            case 11:
                return C14.SNAPP_APP_NOT_RUNNING;
            case 12:
                return C14.SNAPP_APP_ALREADY_STARTED;
            case 13:
                return C14.SNAPP_NOT_ENOUGH_PRIORITY;
            case 14:
                return C14.SNAPP_CHARGING_NOT_CONNECTED;
            case 15:
                return C14.SNAPP_DENIED_BY_PEAK_POWER;
            case 16:
                return C14.SNAPP_POWER_DOWN;
            default:
                return C14.UNRECOGNIZED;
        }
    }
}
