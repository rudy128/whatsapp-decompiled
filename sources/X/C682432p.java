package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.32p  reason: invalid class name and case insensitive filesystem */
public final class C682432p implements C25341Nv {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2.A10(8);
    }

    public void Bhl(AnonymousClass25F r5) {
        C18070vi.A0d(r5, 0);
        boolean z = true;
        AnonymousClass206 r3 = r5.A00;
        ArrayList A0D = ((AnonymousClass1WM) this.A01.get()).A0D(r3, 79);
        if (A0D.isEmpty()) {
            r5.A00();
            return;
        }
        if (A0D.size() > 1) {
            z = false;
        }
        C17960vV.A0F(z, "Multiple PinInChat add-on message linked to a parent message");
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            AnonymousClass212 r1 = (AnonymousClass212) it.next();
            if (r1 instanceof AnonymousClass22C) {
                C63892tr.A06(r3, (AnonymousClass22C) r1);
            }
        }
    }

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass22C.class);
    }

    public C682432p(AnonymousClass190 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
