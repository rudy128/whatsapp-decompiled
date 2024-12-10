package X;

/* renamed from: X.9Pp  reason: invalid class name and case insensitive filesystem */
public abstract class C181219Pp {
    public static final String A00(int i) {
        if (i == 0) {
            return "kCallLinkStateNone";
        }
        if (i == 1) {
            return "kCallLinkStateQuerySent";
        }
        if (i == 2) {
            return "kCallLinkStateQueryAcked";
        }
        if (i == 3) {
            return "kCallLinkStateJoinSent";
        }
        if (i == 4) {
            return "kCallLinkStateJoinAcked";
        }
        C17960vV.A0F(false, "UNKNOWN CallLinkState");
        return "UNKNOWN CallLinkState";
    }
}
