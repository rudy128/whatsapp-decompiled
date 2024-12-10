package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Q6  reason: invalid class name */
public class AnonymousClass1Q6 extends C24741Lm {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1Q7 A01 = new AnonymousClass1Q7();
    public final Map A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final AtomicBoolean A04 = new AtomicBoolean();
    public final int A05;

    public void A0A(AnonymousClass1BI r7) {
        AnonymousClass1Q7 r5 = this.A01;
        synchronized (r5) {
            C002100z r3 = r5.A01;
            Iterator it = new HashSet(r3.A06().keySet()).iterator();
            while (it.hasNext()) {
                AnonymousClass205 r1 = (AnonymousClass205) it.next();
                if (r7.equals(r1.A00)) {
                    r3.A05(r1);
                }
            }
            ArrayList arrayList = new ArrayList();
            Map map = r5.A02;
            for (AnonymousClass205 r12 : map.keySet()) {
                if (r7.equals(r12.A00)) {
                    arrayList.add(r12);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map.remove((AnonymousClass205) it2.next());
            }
        }
        Map map2 = this.A02;
        Iterator it3 = new HashSet(map2.keySet()).iterator();
        while (it3.hasNext()) {
            AnonymousClass205 r13 = (AnonymousClass205) it3.next();
            if (r7.equals(r13.A00)) {
                map2.remove(r13);
            }
        }
        C29691ci A0A = this.A00.A0A(r7);
        if (A0A != null) {
            A0A.A0g = null;
            A0A.A0f = null;
        }
    }

    public void A0B(AnonymousClass206 r5) {
        AnonymousClass1Q7 r0 = this.A01;
        AnonymousClass205 r3 = r5.A0v;
        r0.A01(r5, r3);
        AnonymousClass1CJ r2 = this.A00;
        synchronized (r2) {
            C29691ci A0A = r2.A0A(r3.A00);
            if (A0A != null) {
                AnonymousClass206 r02 = A0A.A0g;
                if (r02 != null && r02.A0v.equals(r3)) {
                    A0A.A0g = r5;
                }
                AnonymousClass206 r03 = A0A.A0f;
                if (r03 != null && r03.A0v.equals(r3)) {
                    A0A.A0f = r5;
                }
            }
        }
        this.A03.remove(r3);
    }

    public void A0C(AnonymousClass205 r2) {
        this.A01.A02(r2);
        this.A02.remove(r2);
        this.A00.A0N(r2);
        this.A03.remove(r2);
    }

    public String BZc() {
        int A022;
        StringBuilder sb = new StringBuilder();
        sb.append("MessageCache/");
        AnonymousClass1Q7 r2 = this.A01;
        synchronized (r2) {
            A022 = r2.A01.A02() + r2.A02.size();
        }
        sb.append(A022);
        return sb.toString();
    }

    public AnonymousClass1Q6(AnonymousClass1CJ r3, C18030ve r4, C24571Kv r5) {
        super(r5);
        this.A00 = r3;
        int A002 = C18020vd.A00(C18040vf.A02, r4, 7810);
        this.A05 = A002;
        if (A002 >= 0) {
            A09();
        }
    }

    public void C9L(C122516Qr r4, boolean z) {
        if (r4.ordinal() >= this.A05) {
            AnonymousClass1Q7 r2 = this.A01;
            synchronized (r2) {
                r2.A01.A07(-1);
                r2.A02.clear();
            }
        }
    }
}
