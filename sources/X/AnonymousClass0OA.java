package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0OA  reason: invalid class name */
public abstract class AnonymousClass0OA {
    public static final Set A00 = new CopyOnWriteArraySet();
    public static final Map A01 = new HashMap();
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public static final AtomicReference A03 = new AtomicReference(AnonymousClass0CT.DEBUG);

    public static final AnonymousClass0CT A00() {
        Object obj = A03.get();
        C18070vi.A0X(obj);
        return (AnonymousClass0CT) obj;
    }

    public static final void A01() {
        Set set = A00;
        if (!(!set.isEmpty())) {
            return;
        }
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("getEvents");
            }
        }
    }
}
