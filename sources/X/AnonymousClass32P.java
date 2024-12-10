package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.32P  reason: invalid class name */
public final class AnonymousClass32P implements AnonymousClass20p {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public boolean Bes(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        if (r6 instanceof AnonymousClass247) {
            AnonymousClass247 r62 = (AnonymousClass247) r6;
            if (r62.A02 <= 0 && r62.A03 <= 0) {
                return false;
            }
            if (!C18020vd.A05(C18040vf.A02, this.A00, 12535)) {
                return true;
            }
            ArrayList A17 = r62.A17();
            if ((A17 instanceof Collection) && A17.isEmpty()) {
                return false;
            }
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                if (((C32911hx) this.A01.get()).A01(C17880vN.A0Y(it))) {
                    return true;
                }
            }
            return false;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }

    public AnonymousClass32P(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass206 BHO(C59652mf r5, AnonymousClass206 r6) {
        C18070vi.A0h(r6, r5);
        if (r6 instanceof AnonymousClass247) {
            AnonymousClass247 r1 = new AnonymousClass247(r5.A01, r5.A00);
            r1.A0a(2);
            return r1;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }
}
