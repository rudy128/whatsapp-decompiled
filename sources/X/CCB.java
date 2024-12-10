package X;

public abstract class CCB {
    public static int A00(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || str.offsetByCodePoints(0, 1) != length) {
            return -1;
        }
        return str.codePointAt(0);
    }
}
