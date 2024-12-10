package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2iO  reason: invalid class name and case insensitive filesystem */
public final class C57012iO {
    public final AnonymousClass00H A00;

    public C57012iO(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(C122646Re r8, Collection collection) {
        Integer A03;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            long A07 = C17890vO.A07(it);
            AnonymousClass00H r3 = this.A00;
            if (((AnonymousClass738) r3.get()).A05(r8, A07) && ((A03 = ((AnonymousClass738) r3.get()).A03(r8, A07)) == null || 4 != A03.intValue())) {
                return false;
            }
        }
        return true;
    }
}
