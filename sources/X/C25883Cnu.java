package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cnu  reason: case insensitive filesystem */
public abstract class C25883Cnu {
    public static DFL A00(DFL dfl, DFL dfl2, Object obj, int i) {
        DFL dfl3 = dfl2;
        DFL dfl4 = dfl;
        if (dfl != dfl2 || !C25337Cdw.A00(DFL.A00(dfl2, i), obj)) {
            if (dfl == dfl2) {
                int i2 = dfl2.A04;
                dfl4 = new DFL(dfl3.A01, dfl3.A02, dfl3, dfl3, dfl3.A0A, i2);
            }
            dfl4.A0H(i, obj);
        }
        return dfl4;
    }

    public static DFL A01(DFL dfl, List list, int i) {
        if (list != null) {
            if (i < list.size()) {
                DFL A0G = AnonymousClass8BR.A0G(list, i);
                if (A0G.A04 == dfl.A04) {
                    return A0G;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DFL A0d = BE6.A0d(it);
                if (A0d.A04 == dfl.A04) {
                    return A0d;
                }
            }
        }
        return null;
    }

    public static String A02(DFL dfl) {
        StringBuilder A10 = AnonymousClass000.A10();
        String A0C = dfl.A0C();
        if (A0C != null) {
            A10.append(" id: ");
            A10.append(A0C);
        }
        List list = dfl.A0A;
        if (list != null && !list.isEmpty()) {
            A10.append(" keyPath: ");
            A10.append(C108955ca.A0p(list));
            for (int i = 1; i < list.size(); i++) {
                A10.append("/");
                A10.append(list.get(i));
            }
        }
        A10.append(" styleId: ");
        return C17880vN.A0t(A10, dfl.A05);
    }
}
