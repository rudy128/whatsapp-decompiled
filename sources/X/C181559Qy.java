package X;

/* renamed from: X.9Qy  reason: invalid class name and case insensitive filesystem */
public abstract class C181559Qy {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INSTALL_PLAY_SERVICES";
            case 1:
                return "UPDATE_PLAY_SERVICES";
            case 2:
                return "SECURE_DEVICE";
            case 3:
                return "CHECK_NETWORK";
            case 4:
                return "NO_REMEDY_REQUIRED";
            default:
                return "NO_REMEDY_AVAILABLE";
        }
    }
}
