package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.9v0  reason: invalid class name and case insensitive filesystem */
public abstract class C196409v0 {
    public static A2W A00() {
        Set<Object> set = BVL.A0e;
        Set set2 = BVK.A03;
        HashMap A11 = C17880vN.A11();
        for (Object put : set) {
            A11.put(put, Collections.unmodifiableSet(set2));
        }
        return new A2W(Collections.unmodifiableMap(A11));
    }

    public static A2W A01(Set set) {
        HashMap A11 = C17880vN.A11();
        for (Object put : set) {
            A11.put(put, Collections.unmodifiableSet(AnonymousClass8BR.A12(Collections.singletonList("*|all_packages|*"))));
        }
        return new A2W(Collections.unmodifiableMap(A11));
    }
}
