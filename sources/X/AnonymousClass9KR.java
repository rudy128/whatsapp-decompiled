package X;

/* renamed from: X.9KR  reason: invalid class name */
public enum AnonymousClass9KR implements E68 {
    NONE(0),
    VIDEO(1),
    PLACEHOLDER(4),
    IMAGE(5),
    PAYMENT_LINKS(6),
    PROFILE(7);
    
    public final int value;

    public static AnonymousClass9KR A00(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return VIDEO;
        }
        if (i == 4) {
            return PLACEHOLDER;
        }
        if (i == 5) {
            return IMAGE;
        }
        if (i == 6) {
            return PAYMENT_LINKS;
        }
        if (i != 7) {
            return null;
        }
        return PROFILE;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KR(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
