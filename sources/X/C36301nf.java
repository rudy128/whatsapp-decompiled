package X;

/* renamed from: X.1nf  reason: invalid class name and case insensitive filesystem */
public abstract class C36301nf {
    public static final int A00(C18030ve r2, int i, int i2) {
        C18070vi.A0d(r2, 0);
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 9798)) {
            return C18020vd.A00(r1, r2, i);
        }
        return i2;
    }

    public static final boolean A01(C18030ve r1, int i) {
        C18070vi.A0d(r1, 0);
        return A02(r1, C18040vf.A02, i);
    }

    public static final boolean A02(C18030ve r2, C18040vf r3, int i) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 2);
        if (C18020vd.A05(C18040vf.A02, r2, 9798) || !C18020vd.A05(r3, r2, i)) {
            return false;
        }
        return true;
    }
}
