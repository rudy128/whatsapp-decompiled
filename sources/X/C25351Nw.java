package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.1Nw  reason: invalid class name and case insensitive filesystem */
public final class C25351Nw implements C25341Nv {
    public final C25331Nu A00;

    public C25351Nw(C25331Nu r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return AnonymousClass25A.A0K(r2.A0u);
    }

    public void Bhl(AnonymousClass25F r4) {
        C18070vi.A0d(r4, 0);
        if (!r4.A03) {
            AnonymousClass206 r2 = r4.A00;
            C693336u A0O = r2.A0O();
            if (A0O != null) {
                byte[] A13 = r2.A13();
                if (A13 != null || (A13 = this.A00.A05(r2)) != null) {
                    A0O.A00(A13);
                } else {
                    return;
                }
            }
            r4.A00();
        }
    }

    public Set BZv() {
        Set<C693336u> singleton = Collections.singleton(C693336u.class);
        C18070vi.A0X(singleton);
        return singleton;
    }
}
