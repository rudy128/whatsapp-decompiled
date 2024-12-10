package X;

/* renamed from: X.6Ru  reason: invalid class name and case insensitive filesystem */
public enum C122756Ru implements E68 {
    NONE(0),
    MINIMAL(1),
    FULL(2);
    
    public final int value;

    public static C122756Ru A00(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return MINIMAL;
        }
        if (i != 2) {
            return null;
        }
        return FULL;
    }

    /* access modifiers changed from: public */
    C122756Ru(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
