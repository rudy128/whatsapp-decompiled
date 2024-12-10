package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9xm  reason: invalid class name and case insensitive filesystem */
public final class C198099xm {
    public final C22621Co A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass00H A02;

    public static final LinkedHashMap A00(C198099xm r7, List list) {
        long A002 = ((C190609lE) r7.A02.get()).A00();
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (((C29691ci) next).A05() >= A002) {
                A13.add(next);
            }
        }
        C98534rJ A15 = C29431cG.A15(C29431cG.A0v(C21486Akr.A00(A13, 31), 50));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A15));
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C194139rE r2 = (C194139rE) it.next();
            C17880vN.A1P(((C29691ci) r2.A01).A08(), linkedHashMap, r2.A00);
        }
        return linkedHashMap;
    }

    public C198099xm(C22621Co r1, AnonymousClass1CJ r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
