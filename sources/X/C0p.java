package X;

public enum C0p implements E68 {
    Secp256r1(0),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C0p(int i) {
        this.value = i;
    }
}
