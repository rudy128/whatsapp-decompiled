package X;

public abstract class C9k {
    public static final long A00(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        C24563C9j c9j = C24563C9j.$redex_init_class;
        return floatToIntBits2;
    }
}
