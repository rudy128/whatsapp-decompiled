package X;

/* renamed from: X.C0x  reason: case insensitive filesystem */
public enum C24378C0x implements E68 {
    SystemHealthEventTypeUnknown(0),
    Connectivity(1),
    Battery(2),
    Thermal(3),
    PeakPower(4),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C24378C0x(int i) {
        this.value = i;
    }
}
