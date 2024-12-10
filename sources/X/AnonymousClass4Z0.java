package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.4Z0  reason: invalid class name */
public abstract class AnonymousClass4Z0 {
    public static final Object A00(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (!collection.isEmpty()) {
            return collection.iterator().next();
        }
        throw new NoSuchElementException();
    }

    public static final LinkedHashMap A01(Map map) {
        C18070vi.A0d(map, 0);
        Set entrySet = map.entrySet();
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            ((List) C72473Md.A0h(A16.getValue(), A13)).add(A16.getKey());
        }
        return A13;
    }

    public static final void A02(Map map, Object[] objArr) {
        C18070vi.A0d(objArr, 1);
        for (Object remove : objArr) {
            map.remove(remove);
        }
    }
}
