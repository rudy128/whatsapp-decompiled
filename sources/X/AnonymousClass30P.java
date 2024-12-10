package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.30P  reason: invalid class name */
public final class AnonymousClass30P implements C72143Ku {
    public final AnonymousClass1SB A00;

    public AnonymousClass30P(AnonymousClass1SB r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void C0w(C171888sR r8) {
        int i;
        C18070vi.A0d(r8, 0);
        AnonymousClass1SB r0 = this.A00;
        List A0E = r0.A0E();
        ArrayList A0C = r0.A0C();
        int i2 = 0;
        ArrayList A0D = r0.A0D(0);
        r8.A1D = C17880vN.A0n(A0E.size());
        if (!(A0C instanceof Collection) || !A0C.isEmpty()) {
            Iterator it = A0C.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass725) it.next()).A0Q && (i = i + 1) < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            i = 0;
        }
        r8.A1C = C17880vN.A0n(i);
        r8.A1E = C17880vN.A0o((long) A0E.size(), (long) A0C.size());
        if (!(A0D instanceof Collection) || !A0D.isEmpty()) {
            Iterator it2 = A0D.iterator();
            while (it2.hasNext()) {
                AnonymousClass73B r02 = ((C1418377d) it2.next()).A04;
                if (r02 != null && r02.A03 && (i2 = i2 + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        }
        r8.A17 = C17880vN.A0n(i2);
        r8.A18 = C17880vN.A0n(A0D.size());
    }
}
