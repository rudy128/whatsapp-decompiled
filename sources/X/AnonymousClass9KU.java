package X;

/* renamed from: X.9KU  reason: invalid class name */
public enum AnonymousClass9KU implements E68 {
    REQUEST_SUCCESS(0),
    REQUEST_TIME_EXPIRED(1),
    DECLINED_SHARING_HISTORY(2),
    GENERIC_ERROR(3),
    ERROR_REQUEST_ON_NON_SMB_PRIMARY(4),
    ERROR_HOSTED_DEVICE_NOT_CONNECTED(5),
    ERROR_HOSTED_DEVICE_LOGIN_TIME_NOT_SET(6);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass9KU(int i) {
        this.value = i;
    }

    public static AnonymousClass9KU A00(int i) {
        switch (i) {
            case 0:
                return REQUEST_SUCCESS;
            case 1:
                return REQUEST_TIME_EXPIRED;
            case 2:
                return DECLINED_SHARING_HISTORY;
            case 3:
                return GENERIC_ERROR;
            case 4:
                return ERROR_REQUEST_ON_NON_SMB_PRIMARY;
            case 5:
                return ERROR_HOSTED_DEVICE_NOT_CONNECTED;
            case 6:
                return ERROR_HOSTED_DEVICE_LOGIN_TIME_NOT_SET;
            default:
                return null;
        }
    }

    public final int BVW() {
        return this.value;
    }
}
