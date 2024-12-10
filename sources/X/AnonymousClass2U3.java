package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2U3  reason: invalid class name */
public abstract class AnonymousClass2U3 {
    public static final void A00(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        Iterator A0i = C17890vO.A0i(linkedHashMap);
        while (A0i.hasNext()) {
            Object next = A0i.next();
            C18070vi.A0X(next);
            Map.Entry entry = (Map.Entry) next;
            if (((C59402mF) entry.getValue()).A00 < 3) {
                linkedHashMap2.put(entry.getKey(), ((C59402mF) entry.getValue()).A01);
            } else {
                A0i.remove();
            }
        }
    }
}
