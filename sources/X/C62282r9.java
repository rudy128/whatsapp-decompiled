package X;

/* renamed from: X.2r9  reason: invalid class name and case insensitive filesystem */
public final class C62282r9 {
    public final AnonymousClass118 A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final C18000vb A03;

    public final String A01(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        AnonymousClass205 r1 = r6.A0v;
        if (C22971Dz.A0e(r1.A00)) {
            boolean z = r1.A02;
            AnonymousClass118 r12 = this.A00;
            int i = 2131896358;
            if (z) {
                i = 2131896360;
            }
            String A012 = r12.A01(i);
            C18070vi.A0b(A012);
            return A012;
        } else if (!r1.A02) {
            return this.A00.A01(2131896357);
        } else {
            String A002 = A00(r6);
            if (A002 == null) {
                return null;
            }
            return this.A00.A02(2131896359, A002);
        }
    }

    public final String A02(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        if (r6.A0v.A02) {
            return this.A00.A01(2131896356);
        }
        String A002 = A00(r6);
        if (A002 == null) {
            return null;
        }
        return this.A00.A02(2131896354, A002);
    }

    private final String A00(AnonymousClass206 r4) {
        String A0I;
        AnonymousClass1BI r2 = r4.A0v.A00;
        if (!(r2 == null && (r2 = r4.A0H()) == null)) {
            AnonymousClass1M9 r0 = this.A01;
            C17960vV.A07(r2);
            AnonymousClass1E7 A0D = r0.A0D(r2);
            if (A0D != null) {
                if (!A0D.A0B()) {
                    C24921Me r1 = this.A02;
                    if (C24921Me.A06(A0D)) {
                        A0I = C24921Me.A03(r1, A0D, 2131898919);
                        return this.A03.A0F(A0I);
                    }
                }
                A0I = this.A02.A0I(A0D);
                return this.A03.A0F(A0I);
            }
        }
        return null;
    }

    public C62282r9(AnonymousClass1M9 r1, C24921Me r2, AnonymousClass118 r3, C18000vb r4) {
        C18070vi.A0s(r1, r4, r2, r3);
        this.A01 = r1;
        this.A03 = r4;
        this.A02 = r2;
        this.A00 = r3;
    }
}
