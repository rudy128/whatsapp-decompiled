package X;

public enum C0t implements E68 {
    VIDEO_QUALITY_LOW(0),
    VIDEO_QUALITY_MEDIUM(1),
    VIDEO_QUALITY_HIGH(2),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C0t(int i) {
        this.value = i;
    }
}
