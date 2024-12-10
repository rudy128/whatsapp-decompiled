package X;

/* renamed from: X.C0w  reason: case insensitive filesystem */
public enum C24377C0w implements E68 {
    APPLICATION_TYPE_UNKNOWN(0),
    APPLICATION_TYPE_FACEBOOK(1),
    APPLICATION_TYPE_INSTAGRAM(2),
    APPLICATION_TYPE_FAIR_DEMO(3),
    APPLICATION_TYPE_MMAI_LIVE(4),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24377C0w(int i) {
        this.value = i;
    }
}
