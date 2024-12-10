package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Pk  reason: invalid class name and case insensitive filesystem */
public abstract class C181169Pk {
    public static final void A00(String str, HashMap hashMap, HashSet hashSet, List list) {
        List list2;
        if (hashSet.contains(str)) {
            throw new C21581AmV("Dependency cycle detected in biz_value_features");
        } else if (!list.contains(str) && (list2 = (List) hashMap.get(str)) != null) {
            hashSet.add(str);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                if (!C18070vi.A18(A0v, str)) {
                    A00(A0v, hashMap, hashSet, list);
                }
            }
            hashSet.remove(str);
            list.add(str);
        }
    }
}
