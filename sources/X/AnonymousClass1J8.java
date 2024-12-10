package X;

import android.content.Context;

/* renamed from: X.1J8  reason: invalid class name */
public abstract class AnonymousClass1J8 {
    public static Boolean A00;
    public static Boolean A01;

    public static final C18030ve A00(Context context) {
        C18070vi.A0d(context, 0);
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        return ((C000100c) AnonymousClass00E.A00(applicationContext, C000100c.class)).BAL();
    }

    public static final boolean A05(C18030ve r3) {
        return r3 != null && C18020vd.A05(C18040vf.A01, r3, 8808);
    }

    public static final boolean A06(C18030ve r3) {
        return r3 != null && C18020vd.A05(C18040vf.A01, r3, 12190);
    }

    public static final boolean A07(C18030ve r3) {
        return r3 != null && C18020vd.A05(C18040vf.A01, r3, 9051);
    }

    public static final boolean A08(C18030ve r3) {
        return r3 != null && C18020vd.A05(C18040vf.A01, r3, 10803);
    }

    public static final boolean A01(C18030ve r2) {
        if (!C22891Dp.A02 || r2 == null || !C18020vd.A05(C18040vf.A02, r2, 7736)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C18030ve r2) {
        return A0A(r2, C18040vf.A01, 5332);
    }

    public static final boolean A03(C18030ve r3) {
        Boolean bool = A00;
        if (bool == null) {
            boolean z = false;
            if (r3 != null) {
                z = C18020vd.A05(C18040vf.A02, r3, 8133);
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
            if (bool == null) {
                return false;
            }
        }
        return bool.booleanValue();
    }

    public static final boolean A04(C18030ve r3) {
        Boolean bool = A01;
        if (bool == null) {
            boolean z = false;
            if (r3 != null) {
                z = C18020vd.A05(C18040vf.A02, r3, 7456);
            }
            bool = Boolean.valueOf(z);
            A01 = bool;
            if (bool == null) {
                return false;
            }
        }
        return bool.booleanValue();
    }

    public static final boolean A09(C18030ve r2) {
        if (r2 != null) {
            return C18020vd.A05(C18040vf.A01, r2, 11278);
        }
        return false;
    }

    public static final boolean A0A(C18030ve r2, C18040vf r3, int i) {
        boolean A05;
        if (r2 != null) {
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 3908)) {
                if (r3 == null) {
                    A05 = C18020vd.A05(r1, r2, i);
                } else {
                    A05 = C18020vd.A05(r3, r2, i);
                }
                Boolean valueOf = Boolean.valueOf(A05);
                if (valueOf == null || !valueOf.booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
