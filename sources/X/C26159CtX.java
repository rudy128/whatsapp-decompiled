package X;

import java.util.Map;

/* renamed from: X.CtX  reason: case insensitive filesystem */
public abstract class C26159CtX {
    public static void A01(Object obj) {
        if (obj == null) {
            throw BE6.A0m();
        }
    }

    public static void A02(Object obj, String str) {
        if (obj == null) {
            throw AnonymousClass000.A0s(str);
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw BE6.A0k();
        }
    }

    public static void A04(boolean z, String str) {
        if (!z) {
            throw AnonymousClass000.A0n(str);
        }
    }

    public static Object A00(Object obj, Map map) {
        Object obj2 = map.get(obj);
        A01(obj2);
        return obj2;
    }
}
