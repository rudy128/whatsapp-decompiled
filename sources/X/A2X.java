package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class A2X {
    public final Map A00 = new WeakHashMap();
    public final Map A01 = C17880vN.A11();

    public synchronized void A01(B9W b9w, Class cls, Object obj) {
        synchronized (this) {
            Map map = this.A01;
            Map A0u = AnonymousClass8BS.A0u(cls, map);
            if (A0u == null) {
                A0u = new WeakHashMap();
                map.put(cls, A0u);
            }
            A0u.put(obj, b9w);
            Map map2 = this.A00;
            Set set = (Set) map2.get(obj);
            if (set == null) {
                set = C17880vN.A12();
                map2.put(obj, set);
            }
            set.add(cls);
        }
    }

    public synchronized void A02(C22396B5z b5z) {
        String.format("UIObserver.fire: %s", AnonymousClass8BV.A1b(b5z));
        Map A0u = AnonymousClass8BS.A0u(b5z.getClass(), this.A01);
        if (A0u != null) {
            Iterator A0x = AnonymousClass8BU.A0x(A0u);
            while (A0x.hasNext()) {
                B9W b9w = (B9W) A0u.get(A0x.next());
                if (b9w != null) {
                    b9w.BtO(b5z);
                }
            }
        }
    }

    public synchronized void A03(Class cls, Object obj) {
        Map A0u = AnonymousClass8BS.A0u(cls, this.A01);
        if (A0u != null) {
            A0u.remove(obj);
        }
        Set set = (Set) this.A00.get(obj);
        if (set != null) {
            set.remove(cls);
        }
    }

    public synchronized void A04(Object obj) {
        Set set = (Set) this.A00.get(obj);
        if (set != null) {
            Iterator it = AnonymousClass8BR.A12(set).iterator();
            while (it.hasNext()) {
                A03((Class) it.next(), obj);
            }
        }
    }

    public static void A00(A2X a2x, Class cls, Object obj, int i) {
        a2x.A01(new C21087AeH(obj, i), cls, obj);
    }
}
