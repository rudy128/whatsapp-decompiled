package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9cb  reason: invalid class name and case insensitive filesystem */
public final class C185449cb {
    public final AnonymousClass4DE A00;
    public final C85904Pe A01;
    public final Map A02;

    public C185449cb(AnonymousClass4DE r5, C85904Pe r6, List list) {
        C18070vi.A0d(list, 1);
        this.A00 = r5;
        this.A01 = r6;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C193389q1 r0 = (C193389q1) it.next();
            linkedHashMap.put(r0.A01, r0.A00);
        }
        this.A02 = linkedHashMap;
    }
}
