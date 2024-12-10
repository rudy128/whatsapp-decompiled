package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3B2  reason: invalid class name */
public final class AnonymousClass3B2 implements C22486B9s {
    public final AnonymousClass1TG A00;

    public AnonymousClass3B2(AnonymousClass1TG r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean BCL(C186309dz r5, C22484B9q b9q, AnonymousClass5YR r7) {
        ArrayList A04 = this.A00.A04(AnonymousClass1E5.A00, -1);
        if (!(A04 instanceof Collection) || !A04.isEmpty()) {
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                if (!AnonymousClass25A.A0p(A0Y)) {
                    C18070vi.A0b(A0Y);
                    if (C446824j.A02(A0Y.A0D(), 3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
