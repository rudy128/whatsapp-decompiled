package X;

import java.util.Iterator;

/* renamed from: X.6XA  reason: invalid class name */
public abstract class AnonymousClass6XA {
    public static final AnonymousClass6RZ A00(long j) {
        Object obj;
        Iterator it = AnonymousClass6RZ.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass6RZ) obj).noticeId == j) {
                break;
            }
        }
        return (AnonymousClass6RZ) obj;
    }
}
