package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.2qR  reason: invalid class name and case insensitive filesystem */
public final class C61882qR {
    public final AnonymousClass00O A00 = new AnonymousClass00O(0);

    public boolean A01(Object obj, Object obj2) {
        AnonymousClass00O r1 = this.A00;
        if (!r1.containsKey(obj) || !r1.containsKey(obj2)) {
            throw AnonymousClass000.A0k("All nodes must be present in the graph before being added as an edge");
        }
        List list = (List) r1.get(obj);
        if (list == null) {
            list = AnonymousClass000.A13();
            r1.put(obj, list);
        }
        return list.add(obj2);
    }

    public static void A00(C61882qR r2, Object obj, List list, Set set) {
        if (list.contains(obj)) {
            return;
        }
        if (!set.contains(obj)) {
            set.add(obj);
            List<Object> list2 = (List) r2.A00.get(obj);
            if (list2 != null) {
                for (Object A002 : list2) {
                    A00(r2, A002, list, set);
                }
            }
            set.remove(obj);
            list.add(obj);
            return;
        }
        throw new AnonymousClass2RK();
    }
}
