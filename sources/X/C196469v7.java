package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9v7  reason: invalid class name and case insensitive filesystem */
public final class C196469v7 {
    public static final boolean A00(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass8BR.A0J(it).A01.A05 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
