package X;

/* renamed from: X.6Rs  reason: invalid class name and case insensitive filesystem */
public enum C122736Rs {
    TWENTY_FOUR_HOURS(24, 2, 1, false),
    SEVEN_DAYS(7, 3, 1, false),
    THIRTY_DAYS(30, 3, 1, false),
    DYNAMIC_DURATION(-1, 1, 2, false),
    FIVE_SECONDS(5, 0, 1, true),
    FIFTEEN_SECONDS(15, 0, 1, true);
    
    public final boolean debugMenuOnlyField;
    public final int displayTimeUnit;
    public final int durationInDisplayTimeUnit;
    public final int expiryType;

    /* access modifiers changed from: public */
    static {
        C122736Rs[] r1;
        A00 = C19780yz.A00(r1);
    }

    public final int A00() {
        if (this == DYNAMIC_DURATION) {
            return -1;
        }
        int i = this.durationInDisplayTimeUnit;
        int i2 = this.displayTimeUnit;
        int i3 = 1;
        if (i2 != 0) {
            i3 = 60;
            if (i2 != 1) {
                i3 = 3600;
                if (i2 != 2) {
                    if (i2 == 3) {
                        i3 = 86400;
                    } else {
                        throw AnonymousClass000.A0n("TimeUnit not allowed in PinInChat expiration dialog");
                    }
                }
            }
        }
        return i * i3;
    }

    /* access modifiers changed from: public */
    C122736Rs(int i, int i2, int i3, boolean z) {
        this.durationInDisplayTimeUnit = i;
        this.displayTimeUnit = i2;
        this.debugMenuOnlyField = z;
        this.expiryType = i3;
    }
}
