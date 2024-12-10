package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.1u6  reason: invalid class name and case insensitive filesystem */
public class C40061u6 {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C23571Gu> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C23571Gu BmV : set) {
                    BmV.BmV();
                }
            }
        }
    }

    public void A01() {
        Set<C23571Gu> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                LinkedList<C23571Gu> linkedList = null;
                for (C23571Gu r1 : set) {
                    if (r1.BlE()) {
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                        }
                        linkedList.add(r1);
                    }
                }
                if (linkedList != null) {
                    for (C23571Gu remove : linkedList) {
                        set.remove(remove);
                    }
                }
            }
        }
    }

    public void A02(C23571Gu r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
