package X;

public enum C0u implements E68 {
    CONTROL_STREAM_ACTION_NONE(0),
    CONTROL_STREAM_ACTION_START(1),
    CONTROL_STREAM_ACTION_STOP(2),
    CONTROL_STREAM_ACTION_PREEMPT_STOP(3),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C0u(int i) {
        this.value = i;
    }
}
