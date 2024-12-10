package X;

/* renamed from: X.9OW  reason: invalid class name */
public abstract class AnonymousClass9OW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "PAUSED";
            case 3:
                return "FINISHED";
            default:
                return "CANCELLED";
        }
    }
}
