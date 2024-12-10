package X;

/* renamed from: X.CYy  reason: case insensitive filesystem */
public final class C25125CYy {
    public final AnonymousClass18O A00;
    public final AnonymousClass11E A01;
    public final C18030ve A02;
    public final C19830z4 A03;

    public final int A00() {
        return AnonymousClass2TA.A00(this.A03, this.A01.A03(true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(int r6, int r7, long r8, boolean r10, boolean r11) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x014c
            r0 = 1
            if (r6 == r0) goto L_0x014c
            r0 = 2
            if (r6 == r0) goto L_0x0148
            r0 = 3
            if (r6 == r0) goto L_0x0144
            r0 = 9
            if (r6 == r0) goto L_0x0140
            r0 = 13
            if (r6 == r0) goto L_0x013c
            r0 = 20
            if (r6 == r0) goto L_0x0138
            r0 = 23
            if (r6 == r0) goto L_0x014c
            r0 = 37
            if (r6 == r0) goto L_0x014c
            r0 = 57
            if (r6 == r0) goto L_0x014c
            r0 = 105(0x69, float:1.47E-43)
            if (r6 == r0) goto L_0x0134
            r0 = 25
            if (r6 == r0) goto L_0x014c
            r0 = 26
            if (r6 == r0) goto L_0x0130
            r0 = 28
            if (r6 == r0) goto L_0x0144
            r0 = 29
            if (r6 == r0) goto L_0x013c
            r0 = 42
            if (r6 == r0) goto L_0x014c
            r0 = 43
            if (r6 == r0) goto L_0x0144
            r0 = 62
            if (r6 == r0) goto L_0x0144
            r0 = 63
            if (r6 == r0) goto L_0x0130
            r0 = 81
            if (r6 == r0) goto L_0x0144
            r0 = 82
            if (r6 == r0) goto L_0x0148
            X.Bty r1 = X.C24012Bty.A00
        L_0x0051:
            X.Btr r0 = X.C24005Btr.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x007c
            int r0 = r5.A00()
            r0 = r0 & 2
            r2 = 1
            if (r0 != 0) goto L_0x007b
            if (r7 != r2) goto L_0x0150
            X.0ve r3 = r5.A02
            r1 = 6040(0x1798, float:8.464E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r1)
            long r3 = (long) r0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            X.11E r0 = r5.A01
            int r0 = r0.A03(r2)
            if (r0 != r2) goto L_0x0150
        L_0x007b:
            return r2
        L_0x007c:
            X.Bts r0 = X.C24006Bts.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00a9
            X.18O r1 = r5.A00
            X.18Q r0 = X.AnonymousClass18O.A19
            int r0 = r1.A04(r0)
            long r3 = (long) r0
            r0 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r0
            r0 = 7
            r2 = 1
            if (r7 != r0) goto L_0x00a2
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00a2
            X.11E r0 = r5.A01
            int r1 = r0.A03(r2)
            r0 = 3
            if (r1 == r0) goto L_0x00a2
            return r2
        L_0x00a2:
            int r0 = r5.A00()
            r0 = r0 & 8
            goto L_0x00f2
        L_0x00a9:
            X.Btt r0 = X.C24007Btt.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00ce
            X.0ve r2 = r5.A02
            r1 = 6041(0x1799, float:8.465E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r3 = (long) r0
            r2 = 0
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            int r0 = r5.A00()
            if (r1 > 0) goto L_0x00cb
            r0 = r0 & 1
        L_0x00c7:
            if (r0 == 0) goto L_0x007b
        L_0x00c9:
            r2 = 1
            return r2
        L_0x00cb:
            r0 = r0 & 4
            goto L_0x00c7
        L_0x00ce:
            X.Btu r0 = X.C24008Btu.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x012a
            X.Btv r0 = X.C24009Btv.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00f5
            r2 = 1
            if (r10 == 0) goto L_0x00e3
            if (r11 == 0) goto L_0x00ec
        L_0x00e3:
            X.11E r0 = r5.A01
            int r1 = r0.A03(r2)
            r0 = 3
            if (r1 != r0) goto L_0x007b
        L_0x00ec:
            int r0 = r5.A00()
        L_0x00f0:
            r0 = r0 & 1
        L_0x00f2:
            if (r0 == 0) goto L_0x0150
            return r2
        L_0x00f5:
            X.Btx r0 = X.C24011Btx.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0106
            int r0 = r5.A00()
            r0 = r0 & 8
        L_0x0103:
            if (r0 == 0) goto L_0x0150
            goto L_0x00c9
        L_0x0106:
            X.Btz r0 = X.C24013Btz.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0115
            int r0 = r5.A00()
            r0 = r0 & 4
            goto L_0x0103
        L_0x0115:
            X.Btw r0 = X.C24010Btw.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x012a
            X.Bty r0 = X.C24012Bty.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0150
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x012a:
            int r0 = r5.A00()
            r2 = 1
            goto L_0x00f0
        L_0x0130:
            X.Btx r1 = X.C24011Btx.A00
            goto L_0x0051
        L_0x0134:
            X.Btw r1 = X.C24010Btw.A00
            goto L_0x0051
        L_0x0138:
            X.Btv r1 = X.C24009Btv.A00
            goto L_0x0051
        L_0x013c:
            X.Btt r1 = X.C24007Btt.A00
            goto L_0x0051
        L_0x0140:
            X.Bts r1 = X.C24006Bts.A00
            goto L_0x0051
        L_0x0144:
            X.Btz r1 = X.C24013Btz.A00
            goto L_0x0051
        L_0x0148:
            X.Btr r1 = X.C24005Btr.A00
            goto L_0x0051
        L_0x014c:
            X.Btu r1 = X.C24008Btu.A00
            goto L_0x0051
        L_0x0150:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25125CYy.A01(int, int, long, boolean, boolean):boolean");
    }

    public C25125CYy(AnonymousClass18O r1, AnonymousClass11E r2, C19830z4 r3, C18030ve r4) {
        C18070vi.A0s(r4, r1, r3, r2);
        this.A02 = r4;
        this.A00 = r1;
        this.A03 = r3;
        this.A01 = r2;
    }
}
