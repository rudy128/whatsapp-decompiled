package X;

/* renamed from: X.9on  reason: invalid class name and case insensitive filesystem */
public final class C192679on {
    public final C19830z4 A00;
    public final AnonymousClass19D A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1DC A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (((X.C195909u8) r3.get()).A01() == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00() {
        /*
            r5 = this;
            X.00H r3 = r5.A03
            r3.get()
            boolean r0 = X.AnonymousClass112.A05()
            if (r0 != 0) goto L_0x0023
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
        L_0x000d:
            X.19D r2 = r5.A01
            r1 = 4733(0x127d, float:6.632E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            int r1 = r3.intValue()
            r0 = 0
            if (r1 != r0) goto L_0x0022
            if (r2 == 0) goto L_0x0080
            java.lang.Integer r3 = X.AnonymousClass00R.A00
        L_0x0022:
            return r3
        L_0x0023:
            r3.get()
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x0050
            r3.get()
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x004d
            X.19D r2 = r5.A01
            r1 = 7644(0x1ddc, float:1.0712E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r3.get()
            X.9u8 r0 = (X.C195909u8) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0050
        L_0x004d:
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            goto L_0x000d
        L_0x0050:
            java.lang.Object r0 = r3.get()
            X.9u8 r0 = (X.C195909u8) r0
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x005f
            java.lang.Integer r3 = X.AnonymousClass00R.A0Y
            goto L_0x000d
        L_0x005f:
            java.lang.Object r0 = r3.get()
            X.9u8 r0 = (X.C195909u8) r0
            long r3 = r0.A00()
            r1 = 231300000(0xdc95ba0, double:1.14277384E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyGooglePlayChecks / gmsVersionIsNewEnoughForLogin : "
            X.C17900vP.A0n(r0, r1, r2)
            if (r2 != 0) goto L_0x004d
            java.lang.Integer r3 = X.AnonymousClass00R.A0u
            goto L_0x000d
        L_0x0080:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192679on.A00():java.lang.Integer");
    }

    public final boolean A01() {
        this.A03.get();
        if (!AnonymousClass112.A05()) {
            return false;
        }
        return C18020vd.A05(C18040vf.A02, this.A02, 5060);
    }

    public C192679on(C19830z4 r1, AnonymousClass19D r2, C18030ve r3, AnonymousClass1DC r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r2, r5, r1, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r5;
        this.A00 = r1;
        this.A04 = r4;
    }
}
