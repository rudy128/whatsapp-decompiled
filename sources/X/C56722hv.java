package X;

/* renamed from: X.2hv  reason: invalid class name and case insensitive filesystem */
public final class C56722hv {
    public final AnonymousClass1UD A00;

    public C56722hv(AnonymousClass1UD r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass2R0 r7, C446324e r8) {
        C18070vi.A0d(r8, 0);
        int ordinal = r7.ordinal();
        boolean z = r8.A0I;
        if (ordinal != 0) {
            if (z) {
                return this.A00.A0A();
            }
            return false;
        } else if (z) {
            return this.A00.A0B();
        } else {
            if (r8.A0J) {
                return false;
            }
            AnonymousClass1UD r1 = this.A00;
            if (!r1.A0B()) {
                return false;
            }
            if (!C18020vd.A05(C18040vf.A01, r1.A00, 9576)) {
                return false;
            }
            if ((r8.A02 & AnonymousClass2R0.A03.flagValue) != 0) {
                return true;
            }
            return false;
        }
    }
}
