package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class CCE {
    public static final C25140CZq A00(Map map) {
        C18070vi.A0d(map, 0);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            A13.put(A16.getKey(), new C26972DNu((E9O) null, AnonymousClass8BR.A10(A16), (List) null, -1));
        }
        return new C25140CZq(A13);
    }
}
