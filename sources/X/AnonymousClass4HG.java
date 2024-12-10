package X;

import java.util.Iterator;

/* renamed from: X.4HG  reason: invalid class name */
public abstract class AnonymousClass4HG {
    public static final AnonymousClass4DO A00(String str) {
        Object obj;
        Iterator it = AnonymousClass4DO.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((AnonymousClass4DO) obj).id, str)) {
                break;
            }
        }
        return (AnonymousClass4DO) obj;
    }
}
