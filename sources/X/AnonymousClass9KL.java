package X;

/* renamed from: X.9KL  reason: invalid class name */
public enum AnonymousClass9KL implements E68 {
    UNKNOWN(0),
    FBPAY(1),
    NOVI(2),
    UPI(3);
    
    public final int value;

    public static AnonymousClass9KL A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FBPAY;
        }
        if (i == 2) {
            return NOVI;
        }
        if (i != 3) {
            return null;
        }
        return UPI;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KL(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
