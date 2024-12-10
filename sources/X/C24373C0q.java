package X;

/* renamed from: X.C0q  reason: case insensitive filesystem */
public enum C24373C0q implements E68 {
    ACQUIRE(0),
    RELEASE(1),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24373C0q(int i) {
        this.value = i;
    }
}
