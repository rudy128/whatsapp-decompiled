package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9oA  reason: invalid class name and case insensitive filesystem */
public final class C192319oA {
    public final C19830z4 A00;
    public final AnonymousClass00H A01;

    public final void A00(String str) {
        C19830z4 r4 = this.A00;
        ArrayList A0u = r4.A0u();
        if (A0u != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass3MZ.A1V(next, A13, C18070vi.A18(next, str) ? 1 : 0);
            }
            r4.A1y(A13);
        }
    }

    public final boolean A01() {
        ArrayList A0u = this.A00.A0u();
        if (A0u == null || !(!A0u.isEmpty())) {
            return false;
        }
        return true;
    }

    public C192319oA(C19830z4 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
