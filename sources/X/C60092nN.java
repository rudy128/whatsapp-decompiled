package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2nN  reason: invalid class name and case insensitive filesystem */
public class C60092nN {
    public final Map A00 = C17880vN.A11();
    public final Set A01 = C17880vN.A14();

    public synchronized void A02() {
        this.A00.clear();
        this.A01.clear();
    }

    public synchronized void A03(C199249zg r6, C60002nE r7) {
        synchronized (this) {
            Map map = this.A00;
            if (map.size() > 1000) {
                Iterator it = this.A01.iterator();
                while (it.hasNext() && map.size() > 1000) {
                    map.remove((C60002nE) it.next());
                    it.remove();
                }
            }
            if (map.containsKey(r7)) {
                this.A01.add(r7);
            }
            if (r7.A01 != 3) {
                map.put(r7, r6);
            }
        }
    }

    public synchronized void A04(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C60002nE r4 = (C60002nE) it.next();
            Map map = this.A00;
            if (!map.containsKey(r4)) {
                C199249zg r2 = new C199249zg();
                if (r4.A01 != 3) {
                    map.put(r4, r2);
                }
            }
        }
    }

    public HashSet A00(List list) {
        HashSet hashSet = new HashSet(list.size());
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60002nE r1 = (C60002nE) it.next();
                C199249zg r0 = (C199249zg) this.A00.get(r1);
                if (r0 != null && r0.A00) {
                    hashSet.add(r1);
                }
            }
        }
        return hashSet;
    }

    public HashSet A01(List list) {
        HashSet hashSet = new HashSet(list.size());
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60002nE r1 = (C60002nE) it.next();
                if (!this.A00.containsKey(r1)) {
                    hashSet.add(r1);
                }
            }
        }
        return hashSet;
    }
}
