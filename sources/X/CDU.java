package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class CDU {
    public static final LinkedHashMap A00(Map map) {
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object obj = ((AnonymousClass9NR) A16.getValue()).A02;
            if ((obj instanceof CO9) && obj != null) {
                A13.put(A16.getKey(), obj);
            }
        }
        return A13;
    }
}
