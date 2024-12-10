package X;

/* renamed from: X.9lp  reason: invalid class name and case insensitive filesystem */
public final class C190979lp {
    public final C24921Me A00;
    public final C18030ve A01;
    public final AnonymousClass1UL A02;
    public final AnonymousClass00H A03;

    public C190979lp(C24921Me r1, C18030ve r2, AnonymousClass1UL r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r4, r1, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r2 != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4ZN A00(X.AnonymousClass1E7 r7) {
        /*
            r6 = this;
            boolean r1 = r7.A0B()
            X.1Me r0 = r6.A00
            X.1yg r0 = r0.A0C(r7)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x00c3
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00c3
            X.482 r3 = new X.482
            r3.<init>(r1)
        L_0x001b:
            return r3
        L_0x001c:
            java.lang.String r2 = r0.A01
            X.0ve r3 = r6.A01
            r1 = 9231(0x240f, float:1.2935E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0084
            X.00H r0 = r6.A03
            java.lang.Object r5 = r0.get()
            X.9ag r5 = (X.C184269ag) r5
            java.lang.String r1 = X.AnonymousClass17K.A02(r7)     // Catch:{ 1Mf -> 0x007e }
            if (r1 != 0) goto L_0x003a
            goto L_0x0086
        L_0x003a:
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ 1Mf -> 0x007e }
            X.1ym r1 = r0.A0H(r1, r3)     // Catch:{ 1Mf -> 0x007e }
            int r0 = r1.countryCode_     // Catch:{ 1Mf -> 0x007e }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ 1Mf -> 0x007e }
            long r0 = r1.nationalNumber_     // Catch:{ 1Mf -> 0x007e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 1Mf -> 0x007e }
            java.lang.String r4 = X.AnonymousClass1K3.A01(r4, r0)     // Catch:{ 1Mf -> 0x007e }
            X.C18070vi.A0X(r4)     // Catch:{ 1Mf -> 0x007e }
            X.11S r0 = r5.A00     // Catch:{ 1Mf -> 0x007e }
            r0.A0I()     // Catch:{ 1Mf -> 0x007e }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ 1Mf -> 0x007e }
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r0.cc     // Catch:{ 1Mf -> 0x007e }
            java.lang.String r0 = r0.number     // Catch:{ 1Mf -> 0x007e }
            java.lang.String r0 = X.AnonymousClass1K3.A01(r1, r0)     // Catch:{ 1Mf -> 0x007e }
            boolean r0 = r4.equals(r0)     // Catch:{ 1Mf -> 0x007e }
            if (r0 != 0) goto L_0x0082
        L_0x006c:
            java.lang.String r0 = ""
            java.util.Locale r1 = new java.util.Locale     // Catch:{ 1Mf -> 0x007e }
            r1.<init>(r0, r4)     // Catch:{ 1Mf -> 0x007e }
            X.0vb r0 = r5.A01     // Catch:{ 1Mf -> 0x007e }
            java.util.Locale r0 = r0.A0N()     // Catch:{ 1Mf -> 0x007e }
            java.lang.String r4 = r1.getDisplayCountry(r0)     // Catch:{ 1Mf -> 0x007e }
            goto L_0x0087
        L_0x007e:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
        L_0x0082:
            r4 = r3
            goto L_0x0087
        L_0x0084:
            r4 = r3
            goto L_0x0087
        L_0x0086:
            r4 = r3
        L_0x0087:
            if (r2 == 0) goto L_0x008f
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0099
        L_0x008f:
            if (r4 == 0) goto L_0x00d0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00d0
            if (r2 == 0) goto L_0x00b6
        L_0x0099:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00ca
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00ca
            r1 = 2131897314(0x7f122be2, float:1.9429514E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass001.A1Q(r2, r4, r0)
            X.6IR r3 = X.C1402670q.A02(r0, r1)
            return r3
        L_0x00b6:
            java.lang.String r0 = "IncomingCallHeaderUserCase/unknown contact has no push name"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r4 == 0) goto L_0x001b
            X.482 r3 = new X.482
            r3.<init>(r4)
            return r3
        L_0x00c3:
            java.lang.String r0 = "IncomingCallHeaderUserCase/address book contact does not have an associated phone number"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
            return r3
        L_0x00ca:
            X.482 r3 = new X.482
            r3.<init>(r2)
            return r3
        L_0x00d0:
            java.lang.String r0 = "IncomingCallHeaderUserCase/unknown contact has no country and push name"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190979lp.A00(X.1E7):X.4ZN");
    }
}
