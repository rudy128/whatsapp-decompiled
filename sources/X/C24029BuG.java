package X;

/* renamed from: X.BuG  reason: case insensitive filesystem */
public class C24029BuG extends C4Z {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DEBUG";
            case 2:
                return "INFO";
            case 3:
                return "WARN";
            default:
                return "ERROR";
        }
    }
}
