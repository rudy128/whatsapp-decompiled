package X;

import java.util.ArrayList;
import java.util.Collection;

public final class AR3 implements C72143Ku {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1PS A01;
    public final C18030ve A02;

    public void C0w(C171888sR r9) {
        int i;
        C18070vi.A0d(r9, 0);
        AnonymousClass1PS r5 = this.A01;
        r9.A13 = C17880vN.A0n(r5.A00());
        if (C18020vd.A05(C18040vf.A02, this.A02, 7402)) {
            Collection A0H = this.A00.A0H();
            ArrayList<C29691ci> A0t = C108965cb.A0t(A0H);
            for (Object next : A0H) {
                if (((C29691ci) next).A0e.expiration > 0) {
                    A0t.add(next);
                }
            }
            long size = (long) A0t.size();
            boolean z = true;
            if (!(A0t instanceof Collection) || !A0t.isEmpty()) {
                i = 0;
                for (C29691ci r0 : A0t) {
                    C59162lr r02 = r0.A0d;
                    if (r02 != null && C18070vi.A19(r02.A01, true) && (i = i + 1) < 0) {
                        AnonymousClass1ZU.A0A();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            long j = (long) i;
            r9.A0N = Boolean.valueOf(r5.A06());
            if (j <= 0) {
                z = false;
            }
            r9.A0O = Boolean.valueOf(z);
            r9.A10 = Long.valueOf(size);
            r9.A11 = Long.valueOf(j);
        }
    }

    public AR3(AnonymousClass1CJ r1, AnonymousClass1PS r2, C18030ve r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
