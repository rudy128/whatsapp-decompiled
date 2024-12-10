package X;

/* renamed from: X.0Dy  reason: invalid class name and case insensitive filesystem */
public abstract class C02420Dy {
    public static final void A00(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("both minLines ");
            A10.append(i);
            A10.append(" and maxLines ");
            A10.append(i2);
            throw AnonymousClass001.A12(" must be greater than zero", A10);
        } else if (i > i2) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("minLines ");
            A102.append(i);
            throw AnonymousClass001.A13(" must be less than or equal to maxLines ", A102, i2);
        }
    }
}
