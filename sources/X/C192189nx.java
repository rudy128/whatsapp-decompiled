package X;

import java.util.Set;

/* renamed from: X.9nx  reason: invalid class name and case insensitive filesystem */
public final class C192189nx {
    public final C173738ve A00;
    public final Set A01 = C17880vN.A12();

    public C192189nx(C173738ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final synchronized void A00(APC apc) {
        this.A01.add(apc);
    }

    public final synchronized void A01(APC apc) {
        C18070vi.A0d(apc, 0);
        this.A01.remove(apc);
    }
}
