package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Q9  reason: invalid class name */
public final class AnonymousClass1Q9 {
    public long A00 = -1;
    public final AnonymousClass1CJ A01;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final AnonymousClass11P A03;

    public AnonymousClass1Q9(AnonymousClass11P r3, AnonymousClass1CJ r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A03 = r3;
        this.A01 = r4;
    }

    public final void A00(AnonymousClass1BI r6, String str) {
        C18070vi.A0d(str, 1);
        if (this.A00 == -1) {
            this.A00 = AnonymousClass11P.A01(this.A03);
        }
        Map map = this.A02;
        Set set = (Set) map.get(r6);
        if (set == null) {
            set = new HashSet();
        }
        set.add(str);
        map.put(r6, set);
    }
}
