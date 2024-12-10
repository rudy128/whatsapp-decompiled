package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1kF  reason: invalid class name and case insensitive filesystem */
public final class C34291kF {
    public static final C34291kF A02;
    public final Map A00;
    public final Set A01;

    public C34291kF(Map map, Set set) {
        C18070vi.A0d(set, 1);
        C18070vi.A0d(map, 3);
        this.A01 = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.A00 = linkedHashMap;
    }

    static {
        C25511Om r2 = C25511Om.A00;
        AnonymousClass1CQ r1 = AnonymousClass1CQ.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A02 = new C34291kF(r1, r2);
    }
}
