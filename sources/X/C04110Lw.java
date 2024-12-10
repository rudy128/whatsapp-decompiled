package X;

/* renamed from: X.0Lw  reason: invalid class name and case insensitive filesystem */
public abstract class C04110Lw {
    public static final Object A00 = new Object();

    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("index (");
            A10.append(i);
            A10.append(") is out of bound of [0, ");
            throw new IndexOutOfBoundsException(AnonymousClass001.A1L(A10, i2));
        }
    }
}
