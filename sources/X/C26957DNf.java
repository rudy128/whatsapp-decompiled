package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DNf  reason: case insensitive filesystem */
public final class C26957DNf implements E88 {
    public final Object A00;
    public final C25653Cjj A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public C26957DNf(C25653Cjj cjj, Object obj, String str, String str2, Map map, boolean z) {
        C18070vi.A0d(str2, 4);
        C18070vi.A0d(cjj, 6);
        this.A02 = str;
        this.A00 = obj;
        this.A05 = z;
        this.A03 = str2;
        this.A04 = map;
        this.A01 = cjj;
    }

    public Runnable BFH(CFu cFu, E6H e6h) {
        C27073DSb dSb;
        C18070vi.A0d(cFu, 2);
        boolean z = this.A05;
        C25653Cjj cjj = this.A01;
        String str = this.A02;
        Object obj = this.A00;
        String str2 = this.A03;
        synchronized (cjj) {
            if (z) {
                cjj.A01(str, obj);
                CQL A002 = C25653Cjj.A00(e6h, cjj);
                Map map = A002.A02;
                Set set = (Set) map.get(str);
                HashSet hashSet = set;
                if (set == null) {
                    HashSet hashSet2 = new HashSet(1);
                    hashSet2.add(str2);
                    map.put(str, hashSet2);
                    hashSet = hashSet2;
                }
                hashSet.add(str2);
                dSb = A002.A00;
            } else {
                Object obj2 = cjj.A00.get(str);
                if (obj2 == null) {
                    cjj.A01(str, obj);
                } else if (!obj2.equals(obj)) {
                    e6h.BKK(cjj.A00, obj2, "gs", str2);
                }
                CQL A003 = C25653Cjj.A00(e6h, cjj);
                Map map2 = A003.A02;
                Set set2 = (Set) map2.get(str);
                HashSet hashSet3 = set2;
                if (set2 == null) {
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(str2);
                    map2.put(str, hashSet4);
                    hashSet3 = hashSet4;
                }
                hashSet3.add(str2);
                dSb = A003.A00;
            }
        }
        return dSb;
    }

    public Object BSx() {
        return this.A00;
    }
}
