package X;

/* renamed from: X.C0y  reason: case insensitive filesystem */
public enum C24379C0y implements E68 {
    ERROR_CODE_SUCCESS(0),
    ERROR_CODE_INTERNAL(1),
    ERROR_CODE_INVALID_PARAMETER(2),
    ERROR_CODE_UNSUPPORTED_PARAMETER(3),
    ERROR_CODE_DOFF(4),
    ERROR_CODE_BUSY(5),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24379C0y(int i) {
        this.value = i;
    }
}
