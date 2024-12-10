package X;

/* renamed from: X.0MS  reason: invalid class name */
public abstract class AnonymousClass0MS {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03 = ((4 << 32) | 3);

    static {
        long j = 3 << 32;
        A01 = j;
        A02 = j | 1;
        A00 = j | 2;
    }

    public static String A00(long j) {
        if (j == A01) {
            return "Rgb";
        }
        if (j == A02) {
            return "Xyz";
        }
        if (j == A00) {
            return "Lab";
        }
        if (j == A03) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
