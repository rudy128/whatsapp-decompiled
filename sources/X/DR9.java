package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class DR9 implements C28543E6r {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final C1407873b A02;
    public final AnonymousClass10I A03;
    public final C88534a3 A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new C27784Dl4(this));

    public void CPe(C25209Cb3 cb3, E8I e8i) {
        C18070vi.A0d(e8i, 1);
        C18100vl r6 = this.A05;
        List A0t = C29431cG.A0t(AnonymousClass3MW.A12(r6).keySet());
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        Iterator it = A0t.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            A13.put(A0v, new DR7(e8i, A0v, A0t, A132));
        }
        Iterator A15 = AnonymousClass000.A15(AnonymousClass3MW.A12(r6));
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            C28543E6r e6r = (C28543E6r) A16.getValue();
            Object obj = A13.get(key);
            if (obj != null) {
                e6r.CPe(cb3, (E8I) obj);
            } else {
                throw C17880vN.A0g();
            }
        }
    }

    public DR9(AnonymousClass1KB r2, AnonymousClass118 r3, C1407873b r4, AnonymousClass10I r5, C88534a3 r6) {
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
    }
}
