package X;

/* renamed from: X.9ut  reason: invalid class name and case insensitive filesystem */
public abstract class C196349ut {
    public static final boolean A01(Integer num) {
        if (num == AnonymousClass00R.A0C || num == AnonymousClass00R.A0N || num == AnonymousClass00R.A0j) {
            return true;
        }
        return false;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RUNNING";
            case 2:
                return "SUCCEEDED";
            case 3:
                return "FAILED";
            case 4:
                return "BLOCKED";
            case 5:
                return "CANCELLED";
            default:
                return "ENQUEUED";
        }
    }
}
