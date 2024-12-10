package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.32q  reason: invalid class name and case insensitive filesystem */
public final class C682532q implements C25341Nv {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2.A10(1);
    }

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass8BG.class);
    }

    public C682532q(AnonymousClass11S r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bhl(AnonymousClass25F r6) {
        AnonymousClass206 A08 = C18070vi.A08(r6);
        ArrayList A0D = ((AnonymousClass1WM) this.A01.get()).A0D(A08, 56);
        if (A0D.isEmpty()) {
            r6.A00();
            return;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AnonymousClass227) {
                A13.add(next);
            }
        }
        C63892tr.A07(new AnonymousClass7CA(this.A00, A13), A08);
    }
}
