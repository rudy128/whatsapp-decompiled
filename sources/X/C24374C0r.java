package X;

/* renamed from: X.C0r  reason: case insensitive filesystem */
public enum C24374C0r implements E68 {
    READY(0),
    MAIN(1),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24374C0r(int i) {
        this.value = i;
    }
}
