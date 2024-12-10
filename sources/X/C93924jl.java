package X;

import java.util.List;

/* renamed from: X.4jl  reason: invalid class name and case insensitive filesystem */
public final class C93924jl implements C108695c9 {
    public final int A00;
    public final AnonymousClass1GV A01;
    public final C18000vb A02;
    public final C41111vp A03 = AnonymousClass3MW.A0n(AnonymousClass000.A0h());
    public final Runnable A04;
    public final List A05 = AnonymousClass000.A13();

    public C93924jl(AnonymousClass1GV r2, C18000vb r3, Runnable runnable, int i) {
        C18070vi.A0d(r3, 1);
        this.A02 = r3;
        this.A00 = i;
        this.A04 = runnable;
        this.A01 = r2;
    }

    public boolean CP4(int i, Object obj) {
        boolean A1O = C72463Mc.A1O(this.A03);
        if (4 - i != 0) {
            return !A1O;
        }
        if (A1O) {
            List list = this.A05;
            if (!list.isEmpty()) {
                if (obj == null) {
                    return false;
                }
                if (C20103A7h.A04(this.A02, ((AnonymousClass4V0) obj).A00.A06, list, true)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
