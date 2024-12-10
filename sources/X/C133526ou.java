package X;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6ou  reason: invalid class name and case insensitive filesystem */
public final class C133526ou {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C149907jo(this));

    public C133526ou(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str) {
        C18070vi.A0d(str, 0);
        ((AbstractMap) this.A01.getValue()).remove(str);
    }

    public final void A01(String str, List list, List list2) {
        ((AbstractMap) this.A01.getValue()).put(str, new C134636qu(new LinkedHashSet(list), new HashSet(list2)));
    }
}
