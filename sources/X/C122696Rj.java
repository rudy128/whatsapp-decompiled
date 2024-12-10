package X;

/* renamed from: X.6Rj  reason: invalid class name and case insensitive filesystem */
public enum C122696Rj {
    VIDEO,
    PHOTO,
    TEXT;

    /* access modifiers changed from: public */
    static {
        C122696Rj[] r0;
        A00 = C19780yz.A00(r0);
    }

    public final String A00() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("COMPOSER_MODE_");
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1) {
            str = "CAMERA";
        } else if (ordinal == 2) {
            str = "TEXT";
        } else {
            throw AnonymousClass3MW.A14();
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
