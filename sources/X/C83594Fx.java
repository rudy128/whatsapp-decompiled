package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Fx  reason: invalid class name and case insensitive filesystem */
public abstract class C83594Fx {
    public static final int A00(Map map) {
        C18070vi.A0d(map, 0);
        Set entrySet = map.entrySet();
        int i = 0;
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                if (((C134216qE) C17890vO.A0P(it)).A04 == 1 && (i = i + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        }
        return i;
    }
}
