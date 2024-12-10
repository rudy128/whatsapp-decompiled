package X;

/* renamed from: X.6Xo  reason: invalid class name and case insensitive filesystem */
public abstract class C124236Xo {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ERROR_CONNECTION";
            case 2:
                return "ERROR_SERVER";
            case 3:
                return "ERROR_UNKNOWN";
            case 4:
                return "DONE";
            default:
                return "LOADING";
        }
    }
}
