package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9iY  reason: invalid class name and case insensitive filesystem */
public final class C189129iY {
    public final C198239y1 A00(String str, Map map) {
        Set set;
        C198239y1 r0;
        Object obj;
        ArrayList A16 = C108955ca.A16(str, 0);
        if (map == null || (set = map.entrySet()) == null) {
            set = C25511Om.A00;
        }
        Iterator it = set.iterator();
        while (true) {
            Map map2 = null;
            if (!it.hasNext()) {
                return new C198239y1(str, (C198239y1[]) A16.toArray(new C198239y1[0]));
            }
            Map.Entry A162 = AnonymousClass000.A16(it);
            if (A162.getValue() == null || !(A162.getValue() instanceof Map)) {
                r0 = new C198239y1(C17880vN.A0x(A162), (C198239y1[]) null);
            } else {
                String A0x = C17880vN.A0x(A162);
                if (map != null) {
                    obj = map.get(A162.getKey());
                } else {
                    obj = null;
                }
                if (obj instanceof Map) {
                    map2 = (Map) obj;
                }
                r0 = A00(A0x, map2);
            }
            A16.add(r0);
        }
    }
}
