package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9PX  reason: invalid class name */
public abstract class AnonymousClass9PX {
    public static final boolean A00(C41461wR r0, Set set) {
        C18070vi.A0h(r0, set);
        if (r0.A00()) {
            return true;
        }
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (C22971Dz.A0S(C17880vN.A0S(it))) {
                return true;
            }
        }
        return false;
    }
}
