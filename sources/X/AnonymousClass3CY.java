package X;

/* renamed from: X.3CY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CY implements Runnable {
    public final /* synthetic */ C32861hs A00;
    public final /* synthetic */ AnonymousClass34B A01;
    public final /* synthetic */ C62022qf A02;
    public final /* synthetic */ C63642tS A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r11 != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            X.1hs r3 = r1.A00
            X.34B r2 = r1.A01
            X.2tS r8 = r1.A03
            boolean r7 = r1.A04
            boolean r6 = r1.A05
            X.2qf r0 = r1.A02
            r17 = r0
            boolean r5 = r1.A06
            boolean r11 = r1.A07
            boolean r12 = r1.A08
            byte[] r10 = r1.A09
            if (r2 == 0) goto L_0x002e
            X.1TJ r0 = r2.A0D
            java.lang.Object r1 = r0.A00()
            java.lang.Number r1 = (java.lang.Number) r1
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x002e
            if (r1 == 0) goto L_0x0125
            int r0 = r1.intValue()
            if (r0 == 0) goto L_0x0125
        L_0x002e:
            X.00H r0 = r3.A0O
            java.lang.Object r4 = r0.get()
            X.6ub r4 = (X.C136906ub) r4
            X.11S r13 = r3.A02
            X.1RK r1 = r3.A06
            X.1Sc r0 = r3.A0H
            r14 = r1
            r15 = r4
            r16 = r0
            r18 = r8
            r19 = r5
            X.2ta r0 = X.C63722ta.A01(r13, r14, r15, r16, r17, r18, r19)
            X.1T6 r9 = r3.A09
            X.34B r5 = r9.A0D(r0, r11)
            X.1Sa r4 = r3.A0F
            if (r12 == 0) goto L_0x0056
            r16 = 1
            if (r11 == 0) goto L_0x0058
        L_0x0056:
            r16 = 0
        L_0x0058:
            java.lang.String r1 = r5.A04()
            X.21V r0 = r8.A01()
            int r13 = r0.A0u
            X.2kI r0 = r5.A02()
            int r12 = r0.A01
            int r14 = X.AnonymousClass1SR.A00(r8)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.0ve r15 = r4.A00
            r0 = 9144(0x23b8, float:1.2813E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r15, r0)
            if (r0 != 0) goto L_0x00ad
            r0 = 9142(0x23b6, float:1.281E-41)
            boolean r0 = X.C18020vd.A05(r11, r15, r0)
            if (r0 != 0) goto L_0x00ad
        L_0x0084:
            r3.A06(r5, r8, r7, r6)
            if (r2 == 0) goto L_0x0100
            X.1TJ r0 = r2.A0H
            java.lang.Object r4 = r0.A00()
            X.2fe r4 = (X.C55362fe) r4
            if (r4 == 0) goto L_0x0100
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0100
            X.1TJ r0 = r2.A0B
            java.lang.Object r1 = r0.A00()
            if (r1 == 0) goto L_0x00a4
            X.1TJ r0 = r5.A0B
            r0.A04(r1)
        L_0x00a4:
            X.1TJ r0 = r5.A0H
            r0.A04(r4)
            X.73e r4 = r2.A0O
            monitor-enter(r4)
            goto L_0x00f6
        L_0x00ad:
            int r1 = r1.hashCode()
            monitor-enter(r4)
            r0 = 9144(0x23b8, float:1.2813E-41)
            boolean r0 = X.C18020vd.A05(r11, r15, r0)     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x00cc
            boolean r0 = X.C22781De.A03()     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x00df
            X.10s r15 = r4.A02     // Catch:{ all -> 0x0122 }
            r11 = 14
            X.7RM r0 = new X.7RM     // Catch:{ all -> 0x0122 }
            r0.<init>((java.lang.Object) r4, (int) r1, (int) r11)     // Catch:{ all -> 0x0122 }
            r15.execute(r0)     // Catch:{ all -> 0x0122 }
        L_0x00cc:
            X.2gb r11 = new X.2gb     // Catch:{ all -> 0x0122 }
            r11.<init>()     // Catch:{ all -> 0x0122 }
            r11.A03 = r14     // Catch:{ all -> 0x0122 }
            r0 = 0
            int r0 = X.C1409973w.A01(r13, r12, r0)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0122 }
            r11.A05 = r0     // Catch:{ all -> 0x0122 }
            goto L_0x00e3
        L_0x00df:
            X.C26411Sa.A01(r4, r1)     // Catch:{ all -> 0x0122 }
            goto L_0x00cc
        L_0x00e3:
            if (r16 == 0) goto L_0x00eb
            int r0 = r11.A02     // Catch:{ all -> 0x0122 }
            int r0 = r0 + 1
            r11.A02 = r0     // Catch:{ all -> 0x0122 }
        L_0x00eb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0122 }
            java.util.HashMap r0 = r4.A03     // Catch:{ all -> 0x0122 }
            r0.put(r1, r11)     // Catch:{ all -> 0x0122 }
            monitor-exit(r4)
            goto L_0x0084
        L_0x00f6:
            X.70S r1 = r4.A06     // Catch:{ all -> 0x0122 }
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0100
            X.73e r0 = r5.A0O
            r0.A0C(r1)
        L_0x0100:
            X.C32861hs.A02(r3, r5, r8)
            boolean r0 = r9.A0L(r5)
            if (r0 == 0) goto L_0x010b
            r5.A06 = r10
        L_0x010b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = r8.A02()
            r2.append(r0)
            java.lang.String r1 = "; action_params: "
            r0 = r17
            java.lang.String r0 = X.AnonymousClass001.A1E(r0, r1, r2)
            r9.A0J(r5, r0)
            return
        L_0x0122:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0125:
            X.C32861hs.A02(r3, r2, r8)
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x015e
            r3.A06(r2, r8, r7, r6)
            X.73e r1 = r2.A0O
            monitor-enter(r1)
            boolean r0 = r1.A0I     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0140
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015b }
            r1.A0B = r0     // Catch:{ all -> 0x015b }
            goto L_0x0151
        L_0x0140:
            boolean r0 = r1.A0H     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x014b
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ all -> 0x015b }
            r1.A0B = r0     // Catch:{ all -> 0x015b }
            goto L_0x0151
        L_0x014b:
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x015b }
            r1.A0B = r0     // Catch:{ all -> 0x015b }
        L_0x0151:
            monitor-exit(r1)
            r1.A09()
            X.1T6 r0 = r3.A09
            r0.A0H(r2)
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x015e:
            r3.A06(r2, r8, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CY.run():void");
    }

    public /* synthetic */ AnonymousClass3CY(C32861hs r1, AnonymousClass34B r2, C62022qf r3, C63642tS r4, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = r3;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A09 = bArr;
    }
}
