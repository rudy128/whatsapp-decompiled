package X;

/* renamed from: X.9KS  reason: invalid class name */
public enum AnonymousClass9KS implements E68 {
    ERROR(0),
    PENDING(1),
    SERVER_ACK(2),
    DELIVERY_ACK(3),
    READ(4),
    PLAYED(5);
    
    public final int value;

    public static AnonymousClass9KS A00(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return SERVER_ACK;
        }
        if (i == 3) {
            return DELIVERY_ACK;
        }
        if (i == 4) {
            return READ;
        }
        if (i != 5) {
            return null;
        }
        return PLAYED;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KS(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
