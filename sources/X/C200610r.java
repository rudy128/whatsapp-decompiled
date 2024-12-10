package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.10r  reason: invalid class name and case insensitive filesystem */
public abstract class C200610r extends C200510q {
    public static final int A03(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A04(AnonymousClass1D6 r2) {
        C18070vi.A0d(r2, 0);
        Map singletonMap = Collections.singletonMap(r2.first, r2.second);
        C18070vi.A0X(singletonMap);
        return singletonMap;
    }

    public static final DVM A05(Map map) {
        DVM dvm = (DVM) map;
        dvm.A05();
        dvm.isReadOnly = true;
        if (dvm.size() > 0) {
            return dvm;
        }
        DVM dvm2 = DVM.A00;
        C18070vi.A0z(dvm2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dvm2;
    }
}
