package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.1pQ  reason: invalid class name and case insensitive filesystem */
public abstract class C37371pQ {
    public static final C37361pP A00(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            ClassLoader classLoader = C37361pP.class.getClassLoader();
            C18070vi.A0b(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(obj, parcelableArrayList2.get(i));
            }
            return new C37361pP(linkedHashMap);
        } else if (bundle2 == null) {
            return new C37361pP();
        } else {
            HashMap hashMap = new HashMap();
            for (String next : bundle2.keySet()) {
                C18070vi.A0V(next);
                hashMap.put(next, bundle2.get(next));
            }
            return new C37361pP(hashMap);
        }
    }
}
