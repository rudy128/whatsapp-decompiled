package X;

import java.util.Iterator;

/* renamed from: X.9QJ  reason: invalid class name */
public abstract class AnonymousClass9QJ {
    public static final AnonymousClass9IZ A00(Integer num) {
        Object obj;
        Iterator it = AnonymousClass9IZ.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i = ((AnonymousClass9IZ) obj).value;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        AnonymousClass9IZ r2 = (AnonymousClass9IZ) obj;
        if (r2 == null) {
            return AnonymousClass9IZ.UNKNOWN_VERIFICATION_SOURCE;
        }
        return r2;
    }
}
