package X;

/* renamed from: X.9KM  reason: invalid class name */
public enum AnonymousClass9KM implements E68 {
    UNDEFINED(0),
    LOW(1),
    MID(2),
    HIGH(3);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass9KM(int i) {
        this.value = i;
    }

    public static AnonymousClass9KM A00(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return LOW;
        }
        if (i == 2) {
            return MID;
        }
        if (i != 3) {
            return null;
        }
        return HIGH;
    }

    public final int BVW() {
        return this.value;
    }
}
