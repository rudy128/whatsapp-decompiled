package X;

/* renamed from: X.2RE  reason: invalid class name */
public enum AnonymousClass2RE implements E68 {
    FULL(1),
    TALL(2),
    COMPACT(3);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass2RE(int i) {
        this.value = i;
    }

    public static AnonymousClass2RE A00(int i) {
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return TALL;
        }
        if (i != 3) {
            return null;
        }
        return COMPACT;
    }

    public final int BVW() {
        return this.value;
    }
}
