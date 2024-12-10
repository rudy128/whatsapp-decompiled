package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9RR  reason: invalid class name */
public abstract class AnonymousClass9RR {
    public static final ArrayList A00(List list, List list2) {
        C20285AEt aEt;
        C20279AEn aEn;
        ArrayList A13 = AnonymousClass000.A13();
        if (!list2.isEmpty()) {
            HashMap A11 = C17880vN.A11();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8BY.A1M(A11, it);
            }
            list2.size();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AnonymousClass21L r3 = (AnonymousClass21L) it2.next();
                AnonymousClass1BI r1 = r3.A0v.A00;
                String str = null;
                if (r1 != null) {
                    str = r1.getRawString();
                }
                Object obj = A11.get(str);
                if (!(obj == null || A13.contains(obj) || (aEt = r3.A00) == null || (aEn = aEt.A02) == null)) {
                    if (C20089A6r.A00(aEn) != 1 || aEn.A08 != null || aEn.A09) {
                        A13.add(obj);
                    }
                }
            }
            A13.size();
        }
        return A13;
    }
}
