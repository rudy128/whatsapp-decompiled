package X;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.10q  reason: invalid class name and case insensitive filesystem */
public abstract class C200510q {
    public static int A00(Iterable iterable) {
        int A03 = C200610r.A03(C29351c6.A0C(iterable, 10));
        if (A03 < 16) {
            return 16;
        }
        return A03;
    }

    public static final Object A01(Object obj, Map map) {
        if (map instanceof C41621wm) {
            C41621wm r3 = (C41621wm) map;
            Map map2 = r3.A00;
            Object obj2 = map2.get(obj);
            if (obj2 != null || map2.containsKey(obj)) {
                return obj2;
            }
            return r3.A01.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(obj);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map, X.1wm] */
    public static final Map A02(Map map, C22821Di r2) {
        if (map instanceof C41621wm) {
            return A02(((C41621wm) map).A00, r2);
        }
        return new C41621wm(map, r2);
    }
}
