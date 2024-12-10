package X;

import java.util.Iterator;

/* renamed from: X.4HH  reason: invalid class name */
public abstract class AnonymousClass4HH {
    public static final AnonymousClass4DP A00(String str) {
        Object obj;
        Iterator it = AnonymousClass4DP.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((AnonymousClass4DP) obj).id, str)) {
                break;
            }
        }
        return (AnonymousClass4DP) obj;
    }
}
