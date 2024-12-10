package X;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A2W {
    public final Map A00;
    public final Set A01;

    @Deprecated
    public boolean A01(Context context, int i) {
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(C20084A6l.A04(context, i)));
        return A02(new A5J((String) null, (String) null, unmodifiableList, Collections.singletonList(C20084A6l.A02(context, (String) C108955ca.A0p(unmodifiableList))), i), AnonymousClass000.A1O(BVL.A0b.contains(C20084A6l.A02(context, context.getPackageName())) ? 1 : 0));
    }

    public boolean A02(A5J a5j, boolean z) {
        C21339AiQ aiQ;
        if (a5j != null) {
            List list = a5j.A04;
            if (!list.isEmpty() && ((C21339AiQ) C108955ca.A0p(list)) != null && !list.isEmpty() && (aiQ = (C21339AiQ) C108955ca.A0p(list)) != null) {
                for (C21339AiQ A002 : this.A01) {
                    if (A00(aiQ, A002, z)) {
                        return true;
                    }
                }
                Map map = this.A00;
                Iterator A0x = AnonymousClass8BU.A0x(map);
                while (A0x.hasNext()) {
                    C21339AiQ aiQ2 = (C21339AiQ) A0x.next();
                    if (A00(aiQ, aiQ2, z)) {
                        for (Object contains : a5j.A03) {
                            if (((Set) map.get(aiQ2)).contains(contains)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        boolean A1X;
        boolean A1X2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A2W)) {
            return false;
        }
        A2W a2w = (A2W) obj;
        Set set = a2w.A01;
        Set set2 = this.A01;
        if (set != null) {
            A1X = set.equals(set2);
        } else {
            A1X = AnonymousClass000.A1X(set2);
        }
        Map map = a2w.A00;
        Map map2 = this.A00;
        if (map != null) {
            A1X2 = map.equals(map2);
        } else {
            A1X2 = AnonymousClass000.A1X(map2);
        }
        return A1X && A1X2;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A01;
        return AnonymousClass000.A0P(this.A00, objArr, 1);
    }

    public A2W(Map map) {
        HashSet A12 = C17880vN.A12();
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Set set = (Set) A16.getValue();
            if (set == null || !set.contains("*|all_packages|*")) {
                if (!A11.containsKey(key)) {
                    A11.put(key, C17880vN.A12());
                }
                ((Set) A11.get(key)).addAll(set);
            } else {
                A12.add(key);
            }
        }
        this.A01 = Collections.unmodifiableSet(A12);
        this.A00 = Collections.unmodifiableMap(A11);
    }

    public static boolean A00(C21339AiQ aiQ, C21339AiQ aiQ2, boolean z) {
        if (!aiQ.equals(aiQ2)) {
            if (!z) {
                return false;
            }
            Set set = BVL.A0b;
            C18070vi.A0d(aiQ2, 0);
            Set set2 = (Set) BVL.A0a.get(aiQ2);
            if (set2 == null) {
                set2 = C18070vi.A0P(BVL.A00);
            }
            if (set2.contains(aiQ)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
