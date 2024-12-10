package X;

/* renamed from: X.C0z  reason: case insensitive filesystem */
public enum C24380C0z implements E68 {
    Unknown(0),
    Critical(1),
    PreCritical(2),
    Warning(3),
    Normal(4),
    Ideal(5),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24380C0z(int i) {
        this.value = i;
    }
}
