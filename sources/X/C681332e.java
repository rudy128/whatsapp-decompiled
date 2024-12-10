package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.32e  reason: invalid class name and case insensitive filesystem */
public final class C681332e implements C25341Nv {
    public final AnonymousClass00H A00;

    public C681332e(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof AnonymousClass22H) || r3.A08 == 0) {
            return false;
        }
        return r3.A10(2);
    }

    public Set BZv() {
        return C18070vi.A0P(C693036r.class);
    }

    public void Bhl(AnonymousClass25F r6) {
        AnonymousClass206 A08 = C18070vi.A08(r6);
        C18070vi.A0z(A08, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePoll");
        AnonymousClass22H r4 = (AnonymousClass22H) A08;
        ArrayList A0D = ((AnonymousClass1WM) this.A00.get()).A0D(r4, 67);
        if (A0D.isEmpty()) {
            r6.A00();
            return;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AnonymousClass22E) {
                A13.add(next);
            }
        }
        if (r4.A0w()) {
            r4.A19(A13);
        } else {
            r4.A18(A13);
        }
    }
}
