package X;

/* renamed from: X.C7v  reason: case insensitive filesystem */
public abstract class C24525C7v {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "Success";
            case 1:
                return "CDLNotReady";
            case 2:
                return "CDLError";
            case 3:
                return "NoCurrentAvatar";
            case 4:
                return "UnknownRequestId";
            case 5:
                return "DuplicateRequestId";
            case 6:
                return "SkippedRequest";
            case 7:
                return "InternalError";
            default:
                return "Unknown";
        }
    }
}
