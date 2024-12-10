package X;

import java.util.Iterator;

/* renamed from: X.6WE  reason: invalid class name */
public abstract class AnonymousClass6WE {
    public static final AnonymousClass6RJ A00(Integer num) {
        Object obj;
        if (num != null) {
            int intValue = num.intValue();
            Iterator it = AnonymousClass6RJ.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AnonymousClass6RJ) obj).value == intValue) {
                    break;
                }
            }
            AnonymousClass6RJ r1 = (AnonymousClass6RJ) obj;
            if (r1 != null) {
                return r1;
            }
        }
        return AnonymousClass6RJ.NONE;
    }
}
