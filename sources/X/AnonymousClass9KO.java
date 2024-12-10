package X;

/* renamed from: X.9KO  reason: invalid class name */
public enum AnonymousClass9KO implements E68 {
    UNKNOWN(0),
    IMAGINE(1),
    MEMU(2),
    FLASH(3),
    EDIT(4);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass9KO(int i) {
        this.value = i;
    }

    public static AnonymousClass9KO A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return IMAGINE;
        }
        if (i == 2) {
            return MEMU;
        }
        if (i == 3) {
            return FLASH;
        }
        if (i != 4) {
            return null;
        }
        return EDIT;
    }

    public final int BVW() {
        return this.value;
    }
}
