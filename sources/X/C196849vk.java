package X;

/* renamed from: X.9vk  reason: invalid class name and case insensitive filesystem */
public abstract class C196849vk {
    public static final AnonymousClass9KQ A01(int i) {
        if (i == 1) {
            return AnonymousClass9KQ.CHAT_SETTING;
        }
        if (i == 2) {
            return AnonymousClass9KQ.ACCOUNT_SETTING;
        }
        if (i == 3) {
            return AnonymousClass9KQ.BULK_CHANGE;
        }
        if (i != 4) {
            return AnonymousClass9KQ.UNKNOWN;
        }
        return AnonymousClass9KQ.BIZ_SUPPORTS_FB_HOSTING;
    }

    public static final int A00(AnonymousClass9KQ r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal != 4) {
            return 0;
        }
        return 4;
    }
}
