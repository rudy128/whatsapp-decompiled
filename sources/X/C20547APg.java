package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.APg  reason: case insensitive filesystem */
public final class C20547APg implements C22496BAd {
    public final AnonymousClass1M9 A00;
    public final Collection A01;

    public C20547APg(AnonymousClass1M9 r2, Collection collection) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = collection;
    }

    private final C193679qU A00() {
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1M2.A0C(this.A00.A04, A13, 2, false, true, false, false, false);
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0l = C72453Mb.A0l(it);
            if (A0l != null && !this.A01.contains(A0l)) {
                A132.add(A0l);
            }
        }
        return new C193679qU(this, A132);
    }

    public C193679qU Bhg() {
        return A00();
    }

    public C193679qU Bhh() {
        return A00();
    }
}
