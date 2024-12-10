package X;

/* renamed from: X.0Ll  reason: invalid class name and case insensitive filesystem */
public abstract class C04000Ll {
    public static final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.NaN);
        A00 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static long A00(C28644ECa eCa) {
        return AnonymousClass001.A0p(eCa.BQU(), eCa.BRu());
    }
}
