package X;

/* renamed from: X.C9l  reason: case insensitive filesystem */
public abstract class C24564C9l {
    public static final long A00(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
    }
}
