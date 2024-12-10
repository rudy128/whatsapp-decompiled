package X;

/* renamed from: X.9KN  reason: invalid class name */
public enum AnonymousClass9KN implements E68 {
    GENERAL_ERROR(0),
    SUCCESS(1),
    NOT_FOUND(2),
    DECRYPTION_ERROR(3);
    
    public final int value;

    public static AnonymousClass9KN A00(int i) {
        if (i == 0) {
            return GENERAL_ERROR;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return NOT_FOUND;
        }
        if (i != 3) {
            return null;
        }
        return DECRYPTION_ERROR;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KN(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
