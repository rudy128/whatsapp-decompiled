package X;

/* renamed from: X.2mt  reason: invalid class name and case insensitive filesystem */
public final class C59792mt {
    public final AnonymousClass18O A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;
    public final C24661Le A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r0 = X.C60502o8.A00(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.AnonymousClass21V r8) {
        /*
            r7 = this;
            r6 = 0
            int r5 = r8.A0u
            r0 = 25
            r4 = 62
            r3 = 57
            if (r5 == r0) goto L_0x0014
            r0 = 28
            if (r5 == r0) goto L_0x0014
            if (r5 == r3) goto L_0x0019
            if (r5 == r4) goto L_0x0019
        L_0x0013:
            return r6
        L_0x0014:
            X.0ve r2 = r7.A06
            r1 = 8394(0x20ca, float:1.1762E-41)
            goto L_0x001d
        L_0x0019:
            X.0ve r2 = r7.A06
            r1 = 9970(0x26f2, float:1.3971E-41)
        L_0x001d:
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0013
            X.36w r0 = X.C60502o8.A00(r8)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A02()
            r1 = 1
            if (r0 != r1) goto L_0x0013
            java.lang.String r0 = X.C20120A8f.A04(r8)
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0043
            if (r5 == r3) goto L_0x0013
            if (r5 != r4) goto L_0x0043
            return r6
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59792mt.A00(X.21V):boolean");
    }

    public final boolean A01(AnonymousClass21V r5) {
        if (r5.A0w()) {
            AnonymousClass00H r2 = this.A07;
            if (AnonymousClass1c4.A00((AnonymousClass1c4) r2.get(), 2) || AnonymousClass1c4.A00((AnonymousClass1c4) r2.get(), 3)) {
                if (!(r5 instanceof AnonymousClass21Y)) {
                    return true;
                }
                return C18020vd.A05(C18040vf.A02, ((AnonymousClass1c4) r2.get()).A02, 7588);
            }
        }
        return false;
    }

    public final boolean A02(AnonymousClass21V r6) {
        C693436v A17;
        if (!C22971Dz.A0g(r6) || (A17 = r6.A17()) == null) {
            return false;
        }
        if (!C50282Tv.A00(this.A03, this.A04, this.A06, r6) || !(r6 instanceof C438421d) || !A17.A05() || r6.A16()) {
            return false;
        }
        return true;
    }

    public C59792mt(AnonymousClass18O r1, AnonymousClass1M9 r2, AnonymousClass11C r3, AnonymousClass11P r4, C19830z4 r5, C24661Le r6, C18030ve r7, AnonymousClass00H r8) {
        C18070vi.A0w(r4, r7, r6, r1, r2);
        C18070vi.A0q(r8, r5, r3);
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
    }
}
