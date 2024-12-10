package X;

/* renamed from: X.C0v  reason: case insensitive filesystem */
public enum C24376C0v implements E68 {
    EMPTY(0),
    IPV4(1),
    IPV6(2),
    BTC(3),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24376C0v(int i) {
        this.value = i;
    }
}
