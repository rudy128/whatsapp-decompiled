package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1D7  reason: invalid class name */
public abstract class AnonymousClass1D7 extends C200610r {
    public static final Object A06(Object obj, Map map) {
        C18070vi.A0d(map, 0);
        return C200510q.A01(obj, map);
    }

    public static final HashMap A07(AnonymousClass1D6... r2) {
        HashMap hashMap = new HashMap(C200610r.A03(r2.length));
        A0K(hashMap, r2);
        return hashMap;
    }

    public static final LinkedHashMap A08(Map map) {
        C18070vi.A0d(map, 0);
        return new LinkedHashMap(map);
    }

    public static final LinkedHashMap A09(Map map, Map map2) {
        C18070vi.A0d(map, 0);
        C18070vi.A0d(map2, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final LinkedHashMap A0A(Map map, C22821Di r6) {
        C18070vi.A0d(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) r6.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap A0B(AnonymousClass1D6... r2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200610r.A03(r2.length));
        A0K(linkedHashMap, r2);
        return linkedHashMap;
    }

    public static final LinkedHashMap A0C(AnonymousClass1D6... r2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200610r.A03(r2.length));
        A0K(linkedHashMap, r2);
        return linkedHashMap;
    }

    public static final Map A0D(Iterable iterable) {
        Object next;
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                AnonymousClass1CQ r1 = AnonymousClass1CQ.A00;
                C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                return r1;
            } else if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C200610r.A03(collection.size()));
                A0J(iterable, linkedHashMap);
                return linkedHashMap;
            } else {
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return C200610r.A04((AnonymousClass1D6) next);
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            A0J(iterable, linkedHashMap2);
            return A0E(linkedHashMap2);
        }
    }

    public static final Map A0F(Map map) {
        C18070vi.A0d(map, 0);
        int size = map.size();
        if (size == 0) {
            AnonymousClass1CQ r1 = AnonymousClass1CQ.A00;
            C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return r1;
        } else if (size != 1) {
            return new LinkedHashMap(map);
        } else {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            C18070vi.A0X(singletonMap);
            return singletonMap;
        }
    }

    public static final void A0K(Map map, AnonymousClass1D6[] r5) {
        for (AnonymousClass1D6 r0 : r5) {
            map.put(r0.first, r0.second);
        }
    }

    public static final Map A0H(AnonymousClass1JQ r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = r4.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
            linkedHashMap.put(r0.first, r0.second);
        }
        return A0E(linkedHashMap);
    }

    public static final AnonymousClass1CQ A0I() {
        AnonymousClass1CQ r1 = AnonymousClass1CQ.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r1;
    }

    public static final Map A0E(Map map) {
        int size = map.size();
        if (size == 0) {
            AnonymousClass1CQ r2 = AnonymousClass1CQ.A00;
            C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return r2;
        } else if (size != 1) {
            return map;
        } else {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            C18070vi.A0X(singletonMap);
            return singletonMap;
        }
    }

    public static final Map A0G(Map map, AnonymousClass1D6 r4) {
        if (map.isEmpty()) {
            return C200610r.A04(r4);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(r4.first, r4.second);
        return linkedHashMap;
    }

    public static final void A0J(Iterable iterable, Map map) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
            map.put(r0.first, r0.second);
        }
    }
}
