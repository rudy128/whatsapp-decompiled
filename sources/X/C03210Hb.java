package X;

/* renamed from: X.0Hb  reason: invalid class name and case insensitive filesystem */
public final class C03210Hb {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C03210Hb(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw AnonymousClass001.A13("startIndex should be >= 0, but was ", AnonymousClass000.A10(), i);
        }
    }
}
