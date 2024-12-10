package X;

/* renamed from: X.0Lz  reason: invalid class name and case insensitive filesystem */
public abstract class C04140Lz {
    public static final long A00 = AnonymousClass001.A0p(0.0f, 0.0f);

    public static String A00(long j) {
        float A02 = AnonymousClass001.A02(j);
        float A01 = AnonymousClass001.A01(j);
        int i = (A02 > A01 ? 1 : (A02 == A01 ? 0 : -1));
        StringBuilder A10 = AnonymousClass000.A10();
        if (i == 0) {
            A10.append("CornerRadius.circular(");
        } else {
            A10.append("CornerRadius.elliptical(");
            C02460Ec.A00(A10, A02);
            A10.append(", ");
            A02 = A01;
        }
        C02460Ec.A00(A10, A02);
        A10.append(')');
        return A10.toString();
    }
}
