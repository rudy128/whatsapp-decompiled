package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0IH  reason: invalid class name */
public final class AnonymousClass0IH {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final void A00() {
        Map map = this.A00;
        Collection<Map> values = map.values();
        ArrayList A13 = AnonymousClass000.A13();
        for (Map values2 : values) {
            C29401cD.A0J(values2.values(), A13);
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            AnonymousClass0K6 r1 = (AnonymousClass0K6) it.next();
            r1.A01();
            r1.A00 = null;
        }
        map.clear();
        Map map2 = this.A01;
        for (AnonymousClass0K6 r12 : map2.values()) {
            r12.A01();
            r12.A00 = null;
        }
        map2.clear();
    }
}
