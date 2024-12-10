package X;

/* renamed from: X.9jh  reason: invalid class name and case insensitive filesystem */
public final class C189719jh {
    public final /* synthetic */ C185089c0 A00;

    public C189719jh(C185089c0 r1) {
        this.A00 = r1;
    }

    public void A00(Integer num) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AppManagerInstallReferrerUtils/getInstallReferrerFromAppManager/onError ");
        switch (num.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "INTERNAL_UNRECOVERABLE";
                break;
            case 2:
                str = "INTERNAL_RECOVERABLE";
                break;
            case 3:
                str = "AM_DISABLED";
                break;
            case 4:
                str = "NOT_PRELOADED";
                break;
            case 5:
                str = "FEATURE_NOT_SUPPORTED";
                break;
            default:
                str = "NO_VALID_REFERRER";
                break;
        }
        C17890vO.A19(A10, str);
    }
}
