package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* renamed from: X.4Qj  reason: invalid class name and case insensitive filesystem */
public class C86144Qj {
    public HashMap A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass11P A03;

    public final void A00(AnonymousClass1BI r6, int i) {
        if (r6 != null) {
            HashMap hashMap = this.A00;
            if (!hashMap.containsKey(r6)) {
                hashMap.put(r6, C17880vN.A12());
            }
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r6);
            if (abstractCollection != null) {
                Integer valueOf = Integer.valueOf(i);
                if (!abstractCollection.contains(valueOf)) {
                    if (C18020vd.A05(C18040vf.A02, this.A01, 2013)) {
                        C80993yW r0 = new C80993yW();
                        r0.A00 = valueOf;
                        AnonymousClass18K r1 = this.A02;
                        r1.CC7(r0);
                        r1.CHJ(true);
                    }
                    abstractCollection.add(valueOf);
                }
            }
        }
    }

    public C86144Qj(AnonymousClass11P r1, C18030ve r2, AnonymousClass18K r3, HashMap hashMap) {
        C18070vi.A0o(r1, r2, r3);
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = hashMap;
    }
}
