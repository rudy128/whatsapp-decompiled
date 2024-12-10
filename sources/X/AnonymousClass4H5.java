package X;

/* renamed from: X.4H5  reason: invalid class name */
public abstract class AnonymousClass4H5 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "UNMUTE";
            case 2:
                return "FOLLOW";
            case 3:
                return "UNFOLLOW";
            case 4:
                return "VERIFY";
            case 5:
                return "UNVERIFY";
            case 6:
                return "LOAD_INSIGHTS";
            case 7:
                return "WAMO_SUB_ACTIVE";
            case 8:
                return "WAMO_SUB_INACTIVE";
            default:
                return "MUTE";
        }
    }
}
