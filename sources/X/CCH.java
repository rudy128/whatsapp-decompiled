package X;

public abstract class CCH {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CENTER";
            case 2:
                return "END";
            case 3:
                return "NONE";
            default:
                return "START";
        }
    }
}
