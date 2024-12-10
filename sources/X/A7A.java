package X;

import java.util.List;
import java.util.Map;

public class A7A {
    public boolean A00;
    public final C188989iK A01;
    public final Map A02 = C17880vN.A11();
    public final Map A03 = C17880vN.A11();
    public final Map A04 = C17880vN.A11();
    public final Map A05 = C17880vN.A11();

    public static List A00(C190899lh r4, A7A a7a) {
        try {
            return A01(r4, a7a.A05, a7a.A04);
        } catch (IllegalStateException e) {
            a7a.A01.A00("InternalStateManager", "Failed to remove internal load", e, false);
            return AnonymousClass000.A13();
        }
    }

    public static void A02(C190899lh r4, A7A a7a) {
        if (a7a.A05.put(r4, AnonymousClass000.A13()) != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InternalLoadRequest already in mInternalToExternalMap: ");
            a7a.A01.A00("InternalStateManager", "Internal load request added to InternalStateManager multiple times", AnonymousClass000.A0o(r4.A03.A01.A0A, A10), false);
        }
    }

    public static void A03(C190899lh r4, A7A a7a) {
        Map map = a7a.A03;
        String str = r4.A03.A01.A0A;
        if (map.remove(str) != r4) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InternalLoadRequest not in mAssetIdToInternalLoadRequestMap: ");
            a7a.A01.A00("InternalStateManager", "internal request not found", AnonymousClass000.A0o(str, A10), false);
        }
    }

    public List A04(C192849p5 r6) {
        try {
            return A01(r6, this.A04, this.A05);
        } catch (IllegalStateException e) {
            this.A01.A00("InternalStateManager", "Failed to remove external load request", e, false);
            return AnonymousClass000.A13();
        }
    }

    public A7A(C188989iK r2) {
        this.A01 = r2;
    }

    public static List A01(Object obj, Map map, Map map2) {
        List list = (List) map.remove(obj);
        if (list != null) {
            for (Object next : list) {
                Object obj2 = map2.get(next);
                C26159CtX.A01(obj2);
                if (!((List) obj2).remove(obj)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Value was not in map: ");
                    A10.append(next);
                    throw AnonymousClass000.A0n(AnonymousClass001.A1E(map2, " ", A10));
                }
            }
            return list;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Key was not in map: ");
        A102.append(obj);
        throw AnonymousClass000.A0n(AnonymousClass001.A1E(map, " ", A102));
    }
}
