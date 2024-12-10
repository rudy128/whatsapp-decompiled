package X;

/* renamed from: X.0Hh  reason: invalid class name and case insensitive filesystem */
public final class C03270Hh {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C03270Hh(Object obj, long j) {
        int i = (int) ((j >> 32) & 4294967295L);
        int i2 = (int) (j & 4294967295L);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw AnonymousClass001.A13("width must be >= 0, but was: ", AnonymousClass000.A10(), i);
        } else if (i2 < 0) {
            throw AnonymousClass001.A13("height must be >= 0, but was: ", AnonymousClass000.A10(), i2);
        }
    }
}
