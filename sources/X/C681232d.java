package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.32d  reason: invalid class name and case insensitive filesystem */
public final class C681232d implements C25341Nv {
    public final AnonymousClass00H A00;

    public C681232d(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2.A10(4);
    }

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass22A.class);
    }

    public void Bhl(AnonymousClass25F r5) {
        AnonymousClass206 A08 = C18070vi.A08(r5);
        ArrayList A0D = ((AnonymousClass1WM) this.A00.get()).A0D(A08, 68);
        if (A0D.isEmpty()) {
            r5.A00();
            return;
        }
        boolean z = true;
        if (A0D.size() > 1) {
            z = false;
        }
        C17960vV.A0F(z, "Multiple KeepInChat messages linked to a parent message");
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            AnonymousClass212 r1 = (AnonymousClass212) it.next();
            if (r1 instanceof AnonymousClass22A) {
                C63892tr.A05(A08, (AnonymousClass22A) r1);
            }
        }
    }
}
