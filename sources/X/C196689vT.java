package X;

/* renamed from: X.9vT  reason: invalid class name and case insensitive filesystem */
public abstract class C196689vT {
    public static final AnonymousClass9K9 A00(C49552Qx r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return AnonymousClass9K9.GOING;
        }
        if (ordinal == 2) {
            return AnonymousClass9K9.NOT_GOING;
        }
        if (ordinal == 3) {
            return AnonymousClass9K9.MAYBE;
        }
        if (ordinal == 0) {
            return AnonymousClass9K9.UNKNOWN;
        }
        throw AnonymousClass3MW.A14();
    }

    public static final C49552Qx A01(AnonymousClass9K9 r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return C49552Qx.GOING;
        }
        if (ordinal == 2) {
            return C49552Qx.NOT_GOING;
        }
        if (ordinal == 3) {
            return C49552Qx.MAYBE;
        }
        if (ordinal == 0) {
            return C49552Qx.UNKNOWN;
        }
        throw AnonymousClass3MW.A14();
    }
}
