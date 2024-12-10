package X;

/* renamed from: X.CnM  reason: case insensitive filesystem */
public abstract class C25858CnM {
    public static final long A02(int i, int i2) {
        if (i < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            BEA.A1P("start cannot be negative. [start: ", ", end: ", A10, i, i2);
            A10.append(']');
            throw AnonymousClass000.A0j(A10);
        } else if (i2 >= 0) {
            return BE7.A0C(i2) | (((long) i) << 32);
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            BEA.A1P("end cannot be negative. [start: ", ", end: ", A102, i, i2);
            A102.append(']');
            throw AnonymousClass000.A0j(A102);
        }
    }

    public static final long A00(int i) {
        return A02(i, i);
    }

    public static final long A01(int i, int i2) {
        return A02(i, i2);
    }
}
