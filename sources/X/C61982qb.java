package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2qb  reason: invalid class name and case insensitive filesystem */
public final class C61982qb {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new AnonymousClass3HS(this));
    public final C18030ve A02;

    public static final String A00(C61982qb r2, int i, int i2, int i3) {
        boolean A05 = C18020vd.A05(C18040vf.A02, r2.A02, 10500);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(i);
        if (A05) {
            A10.append('_');
            A10.append(i2);
        } else {
            A10.append('_');
            A10.append(i3);
        }
        return AnonymousClass000.A0y("_bandwidths", A10);
    }

    public final List A01(int i, int i2, int i3) {
        String string = C17880vN.A0C(this.A01).getString(A00(this, i, i2, i3), "");
        if (string == null) {
            return C18460wS.A00;
        }
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = ",";
        List A0S = AnonymousClass1YF.A0S(string, A1Y, 0);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            Integer A03 = AnonymousClass1YD.A03(C17880vN.A0v(it));
            if (A03 != null) {
                A13.add(A03);
            }
        }
        return A13;
    }

    public C61982qb(C18030ve r3, C18010vc r4) {
        C18070vi.A0j(r3, r4);
        this.A02 = r3;
        this.A00 = r4;
    }
}
