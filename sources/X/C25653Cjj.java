package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cjj  reason: case insensitive filesystem */
public class C25653Cjj {
    public Map A00 = C17880vN.A11();
    public final List A01 = AnonymousClass000.A13();

    public synchronized void A01(String str, Object obj) {
        if (obj == null) {
            if (!this.A00.containsKey(str)) {
            }
        } else if (obj.equals(this.A00.get(str))) {
        }
        HashMap A10 = BE6.A10(this.A00);
        this.A00 = A10;
        A10.put(str, obj);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            CQL cql = (CQL) it.next();
            E6H e6h = (E6H) cql.A01.get();
            if (cql.A00.A00 || e6h == null) {
                it.remove();
            } else {
                Set set = (Set) cql.A02.get(str);
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        e6h.BKK(this.A00, obj, "gs", C17880vN.A0v(it2));
                    }
                } else {
                    C26962DNk.A04(new C21459AkQ(e6h, this.A00, "gs", 8));
                }
            }
        }
    }

    public static CQL A00(E6H e6h, C25653Cjj cjj) {
        List list = cjj.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CQL cql = (CQL) it.next();
            Object obj = cql.A01.get();
            if (cql.A00.A00 || obj == null) {
                it.remove();
            } else if (obj == e6h) {
                return cql;
            }
        }
        CQL cql2 = new CQL(e6h);
        list.add(cql2);
        return cql2;
    }
}
