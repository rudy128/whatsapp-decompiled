package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.9wo  reason: invalid class name and case insensitive filesystem */
public abstract class C197509wo {
    public static HashMap A00 = C17880vN.A11();
    public static HashMap A01 = C17880vN.A11();

    public static void A00(Class cls) {
        Class<Object> cls2 = Object.class;
        HashMap hashMap = A01;
        synchronized (hashMap) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(cls2);
            if (linkedHashSet == null) {
                linkedHashSet = C17880vN.A14();
                hashMap.put(cls2, linkedHashSet);
            }
            linkedHashSet.add(cls);
        }
    }

    static {
        A00(C181909Sh.class);
        A00(A86.class);
    }
}
