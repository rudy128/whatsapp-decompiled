package X;

/* renamed from: X.1Pv  reason: invalid class name and case insensitive filesystem */
public final class C25841Pv {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1MZ A01;
    public final C25831Pu A02;
    public final AnonymousClass00H A03;

    public C25841Pv(AnonymousClass1CJ r2, AnonymousClass1MZ r3, C25831Pu r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r4, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final boolean A00(AnonymousClass1E7 r3, AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 1);
        if (A01(r3, r4) || this.A02.A00(r3, r4)) {
            return true;
        }
        return false;
    }

    public final boolean A01(AnonymousClass1E7 r3, AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(r3, 1);
        AnonymousClass1MZ r1 = this.A01;
        if (!r1.A0J(r4) || !r1.A0K(r4) || ((C42211xo) this.A03.get()).A00(r3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r3.A02.A00(r4, r5) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.AnonymousClass1E7 r4, X.AnonymousClass1EC r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r4.A04
            r2 = 1
            r1 = 0
            if (r0 <= 0) goto L_0x0007
            r1 = 1
        L_0x0007:
            boolean r0 = r3.A01(r4, r5)
            if (r0 != 0) goto L_0x0018
            if (r1 != 0) goto L_0x0018
            X.1Pu r0 = r3.A02
            boolean r0 = r0.A00(r4, r5)
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r0 = r0.A02(r4)
            if (r6 != 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            if (r0 != 0) goto L_0x002c
            return r2
        L_0x002c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25841Pv.A02(X.1E7, X.1EC, boolean):boolean");
    }
}
