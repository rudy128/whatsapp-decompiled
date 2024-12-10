package X;

import android.graphics.Rect;

/* renamed from: X.CnZ  reason: case insensitive filesystem */
public abstract class C25866CnZ {
    public static final int A00(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (1 != i) {
                throw BEA.A0h("Could not convert camera facing from optic: ", AnonymousClass000.A10(), i);
            }
        }
        return i2;
    }

    public static final C24851CMu A01(C25751ClL clL) {
        if (clL == null) {
            return null;
        }
        Object A00 = clL.A00(C25751ClL.A0M);
        C18070vi.A0X(A00);
        Object A002 = clL.A00(C25751ClL.A0N);
        C18070vi.A0X(A002);
        Object A003 = clL.A00(C25751ClL.A0L);
        C18070vi.A0X(A003);
        ((Number) A003).intValue();
        A00(AnonymousClass8BU.A03(clL.A00(C25751ClL.A0K)));
        clL.A01(C25751ClL.A0T);
        clL.A01(C25751ClL.A0Z);
        clL.A01(C25751ClL.A0O);
        clL.A01(C25751ClL.A0V);
        clL.A01(C25751ClL.A0P);
        C24851CMu cMu = new C24851CMu((Rect) A00, (Rect) A002);
        clL.A01(C25751ClL.A0R);
        return cMu;
    }

    public static final CZ9 A02(C25815CmS cmS) {
        Object obj;
        if (cmS == null) {
            return null;
        }
        int intValue = cmS.A00(C25815CmS.A0H).intValue();
        int intValue2 = cmS.A00(C25815CmS.A0G).intValue();
        String str = (String) cmS.A01(C25815CmS.A0K);
        String str2 = (String) cmS.A01(C25815CmS.A0M);
        int intValue3 = cmS.A00(C25815CmS.A0I).intValue();
        int A00 = A00(cmS.A00(C25815CmS.A0F).intValue());
        Object A01 = cmS.A01(C25815CmS.A0L);
        if (A01 != null) {
            if (AnonymousClass000.A1Y(A01)) {
                obj = cmS.A01(C25815CmS.A0J);
                if (obj == null) {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else {
                obj = BE7.A0Z();
            }
            C18070vi.A0b(obj);
            Object A012 = cmS.A01(C25815CmS.A0R);
            if (A012 != null) {
                ((Number) A012).intValue();
                return new CZ9(str, str2, intValue, intValue2, intValue3, A00);
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
