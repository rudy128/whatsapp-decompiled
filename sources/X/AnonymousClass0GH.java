package X;

/* renamed from: X.0GH  reason: invalid class name */
public abstract class AnonymousClass0GH {
    public static final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.NaN);
        A00 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }
}
