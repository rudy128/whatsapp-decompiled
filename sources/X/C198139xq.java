package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9xq  reason: invalid class name and case insensitive filesystem */
public final class C198139xq {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final Map A02 = C17880vN.A13();

    public C198139xq(AnonymousClass11P r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final void A00(C198139xq r10) {
        LinkedHashSet A14 = C17880vN.A14();
        Map map = r10.A02;
        synchronized (map) {
            Set entrySet = map.entrySet();
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : entrySet) {
                if (((C194499rp) ((Map.Entry) next).getValue()).A00 <= AnonymousClass11P.A01(r10.A00)) {
                    A13.add(next);
                }
            }
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                A14.add(AnonymousClass000.A16(it).getKey());
            }
            Iterator it2 = A14.iterator();
            while (it2.hasNext()) {
                map.remove(C17880vN.A0v(it2));
            }
        }
    }
}
