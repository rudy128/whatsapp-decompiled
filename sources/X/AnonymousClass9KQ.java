package X;

/* renamed from: X.9KQ  reason: invalid class name */
public enum AnonymousClass9KQ implements E68 {
    UNKNOWN(0),
    CHAT_SETTING(1),
    ACCOUNT_SETTING(2),
    BULK_CHANGE(3),
    BIZ_SUPPORTS_FB_HOSTING(4),
    UNKNOWN_GROUPS(5);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass9KQ(int i) {
        this.value = i;
    }

    public static AnonymousClass9KQ A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CHAT_SETTING;
        }
        if (i == 2) {
            return ACCOUNT_SETTING;
        }
        if (i == 3) {
            return BULK_CHANGE;
        }
        if (i == 4) {
            return BIZ_SUPPORTS_FB_HOSTING;
        }
        if (i != 5) {
            return null;
        }
        return UNKNOWN_GROUPS;
    }

    public final int BVW() {
        return this.value;
    }
}
