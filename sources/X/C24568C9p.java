package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C9p  reason: case insensitive filesystem */
public abstract class C24568C9p {
    public static final void A00(Object... objArr) {
        if (r3 % 2 == 0) {
            HashMap A11 = C17880vN.A11();
            ArrayList A0z = C17880vN.A0z(r3);
            for (Object A1U : objArr) {
                C108955ca.A1U(A1U, A0z);
            }
            Iterator it = C29431cG.A0i(A0z, 2, 2).iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                A11.put(list.get(0), list.get(1));
            }
            return;
        }
        throw AnonymousClass000.A0k("Must pass a key & value in pairs.");
    }
}
