package X;

import java.util.Iterator;

/* renamed from: X.9PK  reason: invalid class name */
public abstract class AnonymousClass9PK {
    public static final C179409Hv A00(String str) {
        Object obj;
        Iterator it = C179409Hv.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass1YE.A09(((C179409Hv) obj).name(), str, true)) {
                break;
            }
        }
        C179409Hv r2 = (C179409Hv) obj;
        if (r2 == null) {
            return C179409Hv.UNKNOWN;
        }
        return r2;
    }
}
