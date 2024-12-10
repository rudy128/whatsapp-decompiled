package X;

import java.util.Iterator;

/* renamed from: X.9QK  reason: invalid class name */
public abstract class AnonymousClass9QK {
    public static final C179469Ib A00(Integer num) {
        Object obj;
        Iterator it = C179469Ib.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i = ((C179469Ib) obj).value;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        C179469Ib r2 = (C179469Ib) obj;
        if (r2 == null) {
            return C179469Ib.NOT_SET;
        }
        return r2;
    }
}
