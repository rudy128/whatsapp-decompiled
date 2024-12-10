package X;

public abstract class CCT {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "REQUEST_ENCRYPTION";
            case 1:
                return "ENABLE_ENCRYPTION";
            case 2:
                return "END_LINK_SETUP";
            case 3:
                return "BYPASS_LINK_SETUP_2P";
            case 4:
                return "IDENTIFY_3P";
            default:
                return "ASSOCIATE_3P";
        }
    }
}
