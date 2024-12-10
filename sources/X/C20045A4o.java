package X;

import java.util.HashSet;

/* renamed from: X.A4o  reason: case insensitive filesystem */
public final class C20045A4o {
    public static final boolean A01(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        return C18020vd.A05(C18040vf.A02, r2, 5957);
    }

    public final boolean A02(C18030ve r3) {
        C18070vi.A0d(r3, 0);
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r3, 5256) || C18020vd.A05(r1, r3, 6743)) {
            return true;
        }
        return false;
    }

    public final boolean A03(C18030ve r3) {
        C18070vi.A0d(r3, 0);
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r3, 5257) || C18020vd.A05(r1, r3, 6743)) {
            return true;
        }
        return false;
    }

    public static final HashSet A00(C18030ve r4) {
        String A0v = C108955ca.A0v(r4, 6777);
        if (A0v.length() == 0) {
            return C17880vN.A12();
        }
        HashSet A12 = C17880vN.A12();
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = ":";
        for (Object add : AnonymousClass1YF.A0S(A0v, A1Y, 0)) {
            A12.add(add);
        }
        return A12;
    }
}
