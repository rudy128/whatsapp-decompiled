package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7EZ  reason: invalid class name */
public abstract class AnonymousClass7EZ implements C108445bi {
    public boolean CMC(Collection collection) {
        C62572rc r1;
        C18070vi.A0d(collection, 0);
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        AnonymousClass206 A0Y = C17880vN.A0Y(it);
        if (!(A0Y instanceof AnonymousClass21V) || ((r1 = ((AnonymousClass21V) A0Y).A02) != null && r1.A0U && !r1.A0f && r1.A0V)) {
            return !AnonymousClass25A.A0p(A0Y);
        }
        return false;
    }

    public boolean BRj() {
        return true;
    }
}
