package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6wt  reason: invalid class name and case insensitive filesystem */
public final class C138326wt {
    public final AnonymousClass1KB A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03 = C217517g.A00(32801);

    public C138326wt(AnonymousClass1KB r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final void A00(C138326wt r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass725 A0y = C108945cZ.A0y(it);
            A0y.A09 = ((AnonymousClass167) r4.A03.get()).A01.containsKey(AnonymousClass725.A00(A0y));
        }
    }
}
