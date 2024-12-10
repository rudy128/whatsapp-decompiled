package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9jr  reason: invalid class name and case insensitive filesystem */
public class C189789jr {
    public final List A00;

    public final C188299hC A00(C188729ht r16, AnonymousClass5YR r17) {
        C188299hC BCN;
        AnonymousClass5YR r2 = r17;
        C18070vi.A0d(r2, 0);
        C188729ht r3 = r16;
        C191209mC r7 = r3.A07;
        C22484B9q b9q = r3.A09;
        if (b9q != null) {
            b9q.BmW(r2);
        }
        C201110w r8 = null;
        try {
            Iterator it = this.A00.iterator();
            String str = null;
            do {
                try {
                    if (!it.hasNext()) {
                        return C196959vv.A00();
                    }
                    C22528BBl bBl = (C22528BBl) it.next();
                    str = bBl.CS6();
                    BCN = bBl.BCN(r3, r2);
                    if (!BCN.A04) {
                        if (str != null) {
                            C21319Ai4 ai4 = (C21319Ai4) r2;
                            String str2 = ai4.A0F;
                            String str3 = BCN.A01;
                            boolean z = !ai4.A0O;
                            AnonymousClass9ZF r1 = ai4.A06;
                            C22485B9r b9r = BCN.A00;
                            if (b9r != null) {
                                r8 = b9r.BDY();
                            }
                            r7.A00(r8, r1, str2, str, str3, false, z);
                        }
                        return BCN;
                    } else if (str != null) {
                        C21319Ai4 ai42 = (C21319Ai4) r2;
                        r7.A00((C201110w) null, ai42.A06, ai42.A0F, str, BCN.A01, true, !ai42.A0O);
                    }
                } catch (Exception e) {
                    e = e;
                    if (str != null) {
                        C21319Ai4 ai43 = (C21319Ai4) r2;
                        r7.A00((C201110w) null, ai43.A06, ai43.A0F, str, e.toString(), false, !ai43.A0O);
                    }
                    return new C188299hC((C186309dz) null, (C198249y2) null, (C22485B9r) null, e.getMessage(), e, false, false, false);
                }
            } while (!BCN.A03);
            return BCN;
        } catch (Exception e2) {
            e = e2;
            return new C188299hC((C186309dz) null, (C198249y2) null, (C22485B9r) null, e.getMessage(), e, false, false, false);
        }
    }

    public C189789jr(List list) {
        this.A00 = list;
    }
}
