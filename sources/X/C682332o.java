package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.32o  reason: invalid class name and case insensitive filesystem */
public final class C682332o implements C25341Nv {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof C445823z) || !r3.A10(32)) {
            return false;
        }
        return true;
    }

    public Set BZv() {
        return C18070vi.A0P(C692936q.class);
    }

    public C682332o(AnonymousClass11S r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bhl(AnonymousClass25F r6) {
        AnonymousClass206 A08 = C18070vi.A08(r6);
        C18070vi.A0z(A08, "null cannot be cast to non-null type com.whatsapp.event.fmessage.FMessageEvent");
        C445823z r4 = (C445823z) A08;
        ArrayList A0D = ((AnonymousClass1WM) this.A01.get()).A0D(r4, 93);
        if (A0D.isEmpty()) {
            r6.A00();
            return;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AnonymousClass24H) {
                A13.add(next);
            }
        }
        r4.A1A(this.A00, A13);
    }
}
