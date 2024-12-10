package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9u6  reason: invalid class name */
public final class AnonymousClass9u6 {
    public final Object A00 = C17880vN.A0p();
    public final Map A01 = C17880vN.A13();

    public final AnonymousClass9UL A00(C193279pp r3) {
        AnonymousClass9UL r0;
        C18070vi.A0d(r3, 0);
        synchronized (this.A00) {
            r0 = (AnonymousClass9UL) this.A01.remove(r3);
        }
        return r0;
    }

    public final List A02(String str) {
        List A0t;
        C18070vi.A0d(str, 0);
        synchronized (this.A00) {
            Map map = this.A01;
            LinkedHashMap A13 = C17880vN.A13();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (C18070vi.A18(((C193279pp) A16.getKey()).A01, str)) {
                    C108985cd.A1R(A13, A16);
                }
            }
            Iterator A0x = AnonymousClass8BU.A0x(A13);
            while (A0x.hasNext()) {
                map.remove((C193279pp) A0x.next());
            }
            A0t = C29431cG.A0t(A13.values());
        }
        return A0t;
    }

    public final AnonymousClass9UL A01(C193279pp r4) {
        AnonymousClass9UL r0;
        synchronized (this.A00) {
            Map map = this.A01;
            Object obj = map.get(r4);
            if (obj == null) {
                obj = new AnonymousClass9UL(r4);
                map.put(r4, obj);
            }
            r0 = (AnonymousClass9UL) obj;
        }
        return r0;
    }

    public final boolean A03(C193279pp r3) {
        boolean containsKey;
        synchronized (this.A00) {
            containsKey = this.A01.containsKey(r3);
        }
        return containsKey;
    }
}
