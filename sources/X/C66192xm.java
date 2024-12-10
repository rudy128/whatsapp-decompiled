package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2xm  reason: invalid class name and case insensitive filesystem */
public final class C66192xm implements AnonymousClass191, C72113Kr {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;

    public /* synthetic */ void Blf() {
    }

    private final void A00() {
        if (C18020vd.A06(this.A02)) {
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass1M9 r8 = this.A00;
            ArrayList A0L = r8.A0L();
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = A0L.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass1E7 r1 = (AnonymousClass1E7) next;
                if (r1.A0a != null && r1.A0F > 0) {
                    A132.add(next);
                }
            }
            Iterator it2 = A132.iterator();
            while (it2.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it2);
                if (AnonymousClass11P.A01(this.A01) > A0O.A0F) {
                    A0O.A0Z = null;
                    A0O.A0a = "";
                    A0O.A0F = 0;
                    A13.add(A0O);
                }
            }
            r8.A0t(A13, false);
        }
    }

    public C66192xm(AnonymousClass1M9 r1, AnonymousClass11P r2, C18030ve r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void Ba9() {
    }

    public void Blg() {
        A00();
    }

    public void Bqf() {
        A00();
    }
}
