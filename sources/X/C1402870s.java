package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.70s  reason: invalid class name and case insensitive filesystem */
public abstract class C1402870s {
    public static final boolean A02(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C17880vN.A0Y(it).A0H <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A00(AnonymousClass206 r2) {
        AnonymousClass205 A0U = C108965cb.A0U(r2);
        if (!C108945cZ.A1S(A0U) || !A0U.A02) {
            return false;
        }
        if ((r2 instanceof AnonymousClass210) || (r2 instanceof AnonymousClass21Y) || (r2 instanceof C438421d) || (r2 instanceof C440021t) || (r2 instanceof C441822l)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!A00(C17880vN.A0Y(it))) {
                return false;
            }
        }
        return true;
    }
}
