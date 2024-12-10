package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Vp  reason: invalid class name and case insensitive filesystem */
public abstract class C123726Vp {
    public static final boolean A00(C20245ADd aDd, AnonymousClass77B r4, int i, int i2) {
        C20245ADd A01 = C196499vA.A01(r4, i2);
        if (i == 0) {
            Map map = r4.A02;
            Set keySet = map.keySet();
            ArrayList<Object> A13 = AnonymousClass000.A13();
            for (Object next : keySet) {
                AnonymousClass1D6 r1 = (AnonymousClass1D6) next;
                if (C18070vi.A18(r1.first, A01) || C18070vi.A18(r1.second, A01)) {
                    A13.add(next);
                }
            }
            if ((A13 instanceof Collection) && A13.isEmpty()) {
                return false;
            }
            for (Object obj : A13) {
                C20256ADo aDo = (C20256ADo) map.get(obj);
                if (aDo != null && aDo.A02) {
                    return true;
                }
            }
            return false;
        }
        C20256ADo A00 = C196499vA.A00(A01, aDd, r4.A02);
        if (A00 != null) {
            return A00.A02;
        }
        return false;
    }
}
