package X;

/* renamed from: X.CrP  reason: case insensitive filesystem */
public abstract class C26054CrP {
    public static final boolean A03(long j) {
        C25759ClU[] clUArr = C26130Cst.A02;
        return AnonymousClass000.A1P(((j & 1095216660480L) > 0 ? 1 : ((j & 1095216660480L) == 0 ? 0 : -1)));
    }

    public static final long A01(float f, long j) {
        long A0C = j | BE7.A0C(Float.floatToIntBits(f));
        C25759ClU[] clUArr = C26130Cst.A02;
        return A0C;
    }

    public static final long A00(double d) {
        return A01((float) d, 4294967296L);
    }

    public static final long A02(int i) {
        return A01((float) i, 4294967296L);
    }
}
