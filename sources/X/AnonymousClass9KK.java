package X;

/* renamed from: X.9KK  reason: invalid class name */
public enum AnonymousClass9KK implements E68 {
    DEFAULT(0),
    OFF(1),
    ON(2);
    
    public final int value;

    public static AnonymousClass9KK A00(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return OFF;
        }
        if (i != 2) {
            return null;
        }
        return ON;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KK(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
