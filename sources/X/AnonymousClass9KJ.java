package X;

/* renamed from: X.9KJ  reason: invalid class name */
public enum AnonymousClass9KJ implements E68 {
    UNKNOWN(0),
    KEEP_FOR_ALL(1),
    UNDO_KEEP_FOR_ALL(2);
    
    public final int value;

    public static AnonymousClass9KJ A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return KEEP_FOR_ALL;
        }
        if (i != 2) {
            return null;
        }
        return UNDO_KEEP_FOR_ALL;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KJ(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
