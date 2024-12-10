package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1hk  reason: invalid class name and case insensitive filesystem */
public class C32781hk {
    public final AnonymousClass00H A00;
    public final Map A01 = new HashMap();

    private synchronized C58552ks A00(AnonymousClass1BI r4) {
        C58552ks r1;
        Map map = this.A01;
        r1 = (C58552ks) map.get(r4.getRawString());
        if (r1 == null) {
            r1 = new C58552ks(this);
            map.put(r4.getRawString(), r1);
        }
        return r1;
    }

    public void A01(AnonymousClass206 r4) {
        AnonymousClass205 r2 = r4.A0v;
        AnonymousClass1BI r0 = r2.A00;
        C17960vV.A07(r0);
        C58552ks A002 = A00(r0);
        synchronized (A002) {
            A002.A01.put(r2, r4);
            A002.toString();
        }
    }

    public void A02(AnonymousClass206 r5) {
        AnonymousClass205 r3 = r5.A0v;
        AnonymousClass1BI r0 = r3.A00;
        C17960vV.A07(r0);
        C58552ks A002 = A00(r0);
        synchronized (A002) {
            boolean z = false;
            if (A002.A01.remove(r3) != null) {
                z = true;
            }
            A002.A00.remove(r3);
            A002.toString();
            if (z) {
                A002.A00();
            }
        }
    }

    public void A03(AnonymousClass206 r4) {
        AnonymousClass205 r1 = r4.A0v;
        AnonymousClass1BI r0 = r1.A00;
        C17960vV.A07(r0);
        C58552ks A002 = A00(r0);
        synchronized (A002) {
            if (!A002.A01.containsKey(r1)) {
                A002.toString();
                C32781hk r02 = A002.A02;
                boolean A0w = r4.A0w();
                C203911y r03 = (C203911y) r02.A00.get();
                if (A0w) {
                    r03.A02(r4);
                } else {
                    r03.A01(r4);
                }
            } else {
                A002.toString();
                A002.A00.add(r1);
                A002.A00();
            }
        }
    }

    public C32781hk(AnonymousClass00H r2) {
        this.A00 = r2;
    }
}
