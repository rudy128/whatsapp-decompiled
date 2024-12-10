package X;

/* renamed from: X.6Xt  reason: invalid class name and case insensitive filesystem */
public abstract class C124286Xt {
    public static final String A00(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case 272787191:
                    str2 = "UNBANNED";
                    break;
                case 527514546:
                    str2 = "IN_REVIEW";
                    break;
                case 1166090011:
                    str2 = "NO_APPEAL_OPENED";
                    break;
                case 1951953694:
                    str2 = "BANNED";
                    break;
            }
            if (str.equals(str2)) {
                return str2;
            }
        }
        return "UNKNOWN_IN_CLIENT";
    }
}
