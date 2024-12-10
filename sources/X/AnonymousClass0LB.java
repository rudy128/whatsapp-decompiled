package X;

/* renamed from: X.0LB  reason: invalid class name */
public abstract class AnonymousClass0LB {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("index: ");
            A10.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass001.A1I(", size: ", A10, i2));
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("index: ");
            A10.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass001.A1I(", size: ", A10, i2));
        }
    }
}
