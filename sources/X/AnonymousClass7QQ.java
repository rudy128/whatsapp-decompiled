package X;

/* renamed from: X.7QQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C32861hs A03;
    public final /* synthetic */ AnonymousClass34B A04;
    public final /* synthetic */ C63642tS A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0191, code lost:
        if (r0.A0Q != false) goto L_0x0193;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r79 = this;
            r2 = r79
            X.1hs r4 = r2.A03
            long r0 = r2.A02
            X.34B r14 = r2.A04
            boolean r3 = r2.A07
            java.lang.Integer r12 = r2.A06
            int r10 = r2.A00
            X.2tS r9 = r2.A05
            int r2 = r2.A01
            r18 = r2
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x007c
            X.2ta r2 = r14.A0P
            X.2qf r2 = r2.A03
            boolean r2 = r2.A03
            if (r2 == 0) goto L_0x0031
            r23 = 3
        L_0x0024:
            X.1hP r6 = r4.A0B
            double r7 = (double) r0
            int r0 = r12.intValue()
            boolean r13 = X.AnonymousClass000.A1P(r0)
            monitor-enter(r6)
            goto L_0x0036
        L_0x0031:
            int r23 = X.C72453Mb.A03(r3)
            goto L_0x0024
        L_0x0036:
            X.0ve r2 = r6.A00     // Catch:{ all -> 0x0078 }
            r1 = 12670(0x317e, float:1.7754E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0078 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007b
            long r24 = X.C32571hP.A01(r6)     // Catch:{ all -> 0x0078 }
            int r22 = X.C32571hP.A00(r6)     // Catch:{ all -> 0x0078 }
            X.1hO r11 = r6.A02     // Catch:{ all -> 0x0078 }
            r26 = 0
            r27 = r11
            r28 = r10
            r29 = r22
            r30 = r23
            r31 = r24
            r33 = r26
            X.2sZ r5 = r27.A01(r28, r29, r30, r31, r33)     // Catch:{ all -> 0x0078 }
            long r0 = r5.A01     // Catch:{ all -> 0x0078 }
            double r2 = (double) r0     // Catch:{ all -> 0x0078 }
            double r2 = r2 + r7
            long r0 = (long) r2     // Catch:{ all -> 0x0078 }
            r5.A01 = r0     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x006e
            long r0 = r5.A07     // Catch:{ all -> 0x0078 }
            r2 = 1
            long r0 = r0 + r2
            r5.A07 = r0     // Catch:{ all -> 0x0078 }
        L_0x006e:
            r19 = r11
            r20 = r5
            r21 = r10
            r19.A02(r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0078 }
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x007b:
            monitor-exit(r6)
        L_0x007c:
            int r1 = r12.intValue()
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.A03
            java.util.Iterator r17 = X.C29431cG.A0o(r0)
            if (r1 != 0) goto L_0x00a8
        L_0x0088:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01a9
            X.206 r3 = X.C17880vN.A0Y(r17)
            X.1hP r2 = r4.A0B
            int r1 = X.A8F.A02(r3)
            X.00H r0 = r4.A0P
            java.lang.Object r0 = r0.get()
            X.6mb r0 = (X.C132326mb) r0
            X.6tu r0 = r0.A00(r3)
            r2.A03(r0, r1, r10)
            goto L_0x0088
        L_0x00a8:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01cd
            X.21V r16 = X.C17880vN.A0b(r17)
            X.1hP r13 = r4.A0B
            monitor-enter(r13)
            X.00H r0 = r13.A03     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01a6 }
            X.6m1 r0 = (X.C132006m1) r0     // Catch:{ all -> 0x01a6 }
            X.00H r1 = r0.A01     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x01a6 }
            X.Cmh r0 = (X.C25830Cmh) r0     // Catch:{ all -> 0x01a6 }
            X.CmW r12 = r0.A02()     // Catch:{ all -> 0x01a6 }
            java.lang.Object r11 = r1.get()     // Catch:{ all -> 0x01a6 }
            X.Cmh r11 = (X.C25830Cmh) r11     // Catch:{ all -> 0x01a6 }
            long r7 = r12.A0D     // Catch:{ all -> 0x01a6 }
            r0 = 1
            long r7 = r7 + r0
            long r0 = r12.A0F     // Catch:{ all -> 0x01a6 }
            r77 = r0
            long r0 = r12.A0I     // Catch:{ all -> 0x01a6 }
            r75 = r0
            long r0 = r12.A0E     // Catch:{ all -> 0x01a6 }
            r27 = r0
            long r0 = r12.A0G     // Catch:{ all -> 0x01a6 }
            r29 = r0
            long r0 = r12.A0H     // Catch:{ all -> 0x01a6 }
            r31 = r0
            long r0 = r12.A0N     // Catch:{ all -> 0x01a6 }
            r33 = r0
            long r0 = r12.A0Q     // Catch:{ all -> 0x01a6 }
            r35 = r0
            long r0 = r12.A0M     // Catch:{ all -> 0x01a6 }
            r37 = r0
            long r0 = r12.A0O     // Catch:{ all -> 0x01a6 }
            r39 = r0
            long r0 = r12.A0P     // Catch:{ all -> 0x01a6 }
            r41 = r0
            long r0 = r12.A01     // Catch:{ all -> 0x01a6 }
            r43 = r0
            long r0 = r12.A02     // Catch:{ all -> 0x01a6 }
            r45 = r0
            long r0 = r12.A03     // Catch:{ all -> 0x01a6 }
            r47 = r0
            long r0 = r12.A07     // Catch:{ all -> 0x01a6 }
            r49 = r0
            long r0 = r12.A06     // Catch:{ all -> 0x01a6 }
            r51 = r0
            long r0 = r12.A08     // Catch:{ all -> 0x01a6 }
            r53 = r0
            long r0 = r12.A00     // Catch:{ all -> 0x01a6 }
            r55 = r0
            long r0 = r12.A0J     // Catch:{ all -> 0x01a6 }
            r57 = r0
            long r0 = r12.A0K     // Catch:{ all -> 0x01a6 }
            r59 = r0
            long r0 = r12.A0L     // Catch:{ all -> 0x01a6 }
            r23 = r0
            long r0 = r12.A05     // Catch:{ all -> 0x01a6 }
            r21 = r0
            long r0 = r12.A04     // Catch:{ all -> 0x01a6 }
            r19 = r0
            long r9 = r12.A09     // Catch:{ all -> 0x01a6 }
            long r5 = r12.A0B     // Catch:{ all -> 0x01a6 }
            long r2 = r12.A0A     // Catch:{ all -> 0x01a6 }
            long r0 = r12.A0C     // Catch:{ all -> 0x01a6 }
            java.lang.Boolean r15 = r12.A0R     // Catch:{ all -> 0x01a6 }
            X.CmW r12 = new X.CmW     // Catch:{ all -> 0x01a6 }
            r25 = r27
            r27 = r29
            r29 = r31
            r31 = r33
            r33 = r35
            r35 = r37
            r37 = r39
            r39 = r41
            r41 = r43
            r43 = r45
            r45 = r47
            r47 = r49
            r49 = r51
            r51 = r53
            r53 = r55
            r55 = r57
            r57 = r59
            r59 = r23
            r61 = r21
            r63 = r19
            r65 = r9
            r67 = r5
            r69 = r2
            r71 = r0
            r73 = r7
            r19 = r12
            r20 = r15
            r21 = r77
            r23 = r75
            r19.<init>(r20, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73)     // Catch:{ all -> 0x01a6 }
            r11.A04(r12)     // Catch:{ all -> 0x01a6 }
            monitor-exit(r13)
            if (r18 != 0) goto L_0x00a8
            X.0ve r2 = r4.A07
            int r1 = r14.A00
            r0 = 0
            int r0 = X.C1409973w.A03(r2, r1, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = r16
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0193
            boolean r0 = r0.A0Q
            r9 = 1
            if (r0 == 0) goto L_0x0194
        L_0x0193:
            r9 = 0
        L_0x0194:
            r7 = 16
            X.10I r1 = r4.A0M
            r8 = 6
            X.3Cs r0 = new X.3Cs
            r3 = r0
            r5 = r16
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7, (int) r8, (boolean) r9)
            r1.CGF(r0)
            goto L_0x00a8
        L_0x01a6:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x01a9:
            X.0ve r2 = r4.A07
            r1 = 475(0x1db, float:6.66E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01cd
            X.73e r0 = r14.A0O
            int r1 = r0.A04()
            r0 = 3
            if (r1 != r0) goto L_0x01cd
            X.1hn r3 = r4.A0C
            X.2h4 r2 = r14.A0N
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            X.1SS r0 = r3.A00
            r0.A04(r2)
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QQ.run():void");
    }

    public /* synthetic */ AnonymousClass7QQ(C32861hs r1, AnonymousClass34B r2, C63642tS r3, Integer num, int i, int i2, long j, boolean z) {
        this.A03 = r1;
        this.A02 = j;
        this.A04 = r2;
        this.A07 = z;
        this.A06 = num;
        this.A00 = i;
        this.A05 = r3;
        this.A01 = i2;
    }
}
