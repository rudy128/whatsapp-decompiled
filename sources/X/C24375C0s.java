package X;

/* renamed from: X.C0s  reason: case insensitive filesystem */
public enum C24375C0s implements E68 {
    CODEC_TYPE_NONE(0),
    CODEC_TYPE_AUDIO(1),
    CODEC_TYPE_VIDEO(2),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24375C0s(int i) {
        this.value = i;
    }
}
