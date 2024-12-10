package X;

import java.util.Iterator;

/* renamed from: X.6X1  reason: invalid class name */
public abstract class AnonymousClass6X1 {
    public static final C122676Rh A00(int i) {
        Object obj;
        Iterator it = C122676Rh.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C122676Rh) obj).type == i) {
                break;
            }
        }
        return (C122676Rh) obj;
    }
}
