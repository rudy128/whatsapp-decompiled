package X;

/* renamed from: X.3AY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AY implements AnonymousClass1TI {
    public final /* synthetic */ C32861hs A00;
    public final /* synthetic */ AnonymousClass34B A01;
    public final /* synthetic */ C63642tS A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0394: MOVE  (r0v176 int) = (r20v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void accept(java.lang.Object r32) {
        /*
            r31 = this;
            r19 = r32
            r1 = r31
            X.1hs r4 = r1.A00
            X.2tS r14 = r1.A02
            X.34B r3 = r1.A01
            boolean r0 = r1.A03
            r23 = r0
            boolean r0 = r1.A04
            r22 = r0
            r0 = r19
            java.lang.Integer r0 = (java.lang.Integer) r0
            r19 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r14.A03
            r29 = r0
            r29.size()
            X.73e r6 = r3.A0O
            int r20 = r6.A04()
            X.2g5 r10 = r3.A03()
            X.1Sa r5 = r4.A0F
            java.lang.String r1 = r3.A04()
            java.lang.Integer r0 = X.AnonymousClass00R.A0E
            r5.A02(r1, r0)
            X.0ve r8 = r5.A00
            r1 = 9144(0x23b8, float:1.2813E-41)
            X.0vf r21 = X.C18040vf.A02
            r0 = r21
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0051
            r1 = 9142(0x23b6, float:1.281E-41)
            r0 = r21
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0051
        L_0x004c:
            if (r10 == 0) goto L_0x02aa
            monitor-enter(r6)
            goto L_0x0245
        L_0x0051:
            X.9i7 r11 = r6.A07
            java.lang.String r0 = r3.A04()
            int r13 = r0.hashCode()
            int r7 = r3.A00
            java.util.HashMap r1 = r5.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto L_0x0071
            X.2gb r2 = new X.2gb
            r2.<init>()
            r1.put(r0, r2)
        L_0x0071:
            X.2gb r2 = (X.C55932gb) r2
            X.2h4 r0 = r3.A0N
            java.lang.String r0 = r0.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r0 = r0.getMostSignificantBits()
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r15
            r2.A04 = r0
            r9 = 0
            if (r11 == 0) goto L_0x0188
            java.lang.Long r0 = r11.A0H
            if (r0 == 0) goto L_0x0188
            long r0 = r0.longValue()
            int r12 = (int) r0
        L_0x0093:
            r2.A00 = r12
            if (r11 == 0) goto L_0x00a4
            X.9eo r0 = r11.A01
            if (r0 == 0) goto L_0x00a4
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto L_0x00a4
            long r0 = r0.longValue()
            int r9 = (int) r0
        L_0x00a4:
            r2.A01 = r9
            int r1 = r6.A02
            X.2h4 r11 = r6.A0K
            int r12 = r11.A0B
            r9 = 2
            boolean r0 = X.AnonymousClass000.A1T(r12, r9)
            int r0 = X.C1408173e.A00(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
            r6.A06(r7)
            java.lang.Integer r0 = r6.A07(r8, r7)
            r2.A07 = r0
            int r1 = r2.A02
            int r0 = r11.A03
            int r1 = r1 + r0
            r2.A02 = r1
            r1 = 9144(0x23b8, float:1.2813E-41)
            r0 = r21
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x00e7
            boolean r0 = X.C22781De.A03()
            if (r0 == 0) goto L_0x0183
            X.10s r15 = r5.A02
            r1 = 16
            X.3Cu r0 = new X.3Cu
            r0.<init>(r5, r13, r1, r2)
            r15.execute(r0)
        L_0x00e7:
            int r0 = r2.A03
            r16 = r0
            r1 = 9142(0x23b6, float:1.281E-41)
            r0 = r21
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x004c
            X.18K r15 = r5.A01
            X.2HM r5 = new X.2HM
            r5.<init>()
            java.lang.Integer r2 = r6.A07(r8, r7)
            java.lang.Integer r13 = r6.A06(r7)
            long r7 = r6.A03
            long r0 = r6.A0J
            long r7 = r7 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            boolean r0 = r6.A0G
            java.lang.Long r0 = X.C1409973w.A06(r1, r0)
            r5.A0D = r0
            int r0 = r11.A03
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r5.A0A = r0
            int r0 = r6.A02
            r1 = 1
            boolean r7 = X.AnonymousClass000.A1T(r12, r9)
            int r0 = X.C1408173e.A00(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A05 = r0
            java.lang.Integer r0 = r6.A09
            r5.A06 = r0
            boolean r0 = r6.A0E
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r5.A07 = r0
            X.9i7 r11 = r6.A07
            if (r11 == 0) goto L_0x0200
            java.lang.Long r0 = r11.A0D
            r7 = 0
            if (r0 == 0) goto L_0x0181
            double r16 = r0.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r16)
        L_0x0151:
            r5.A03 = r0
            java.lang.Long r0 = r11.A0H
            r5.A0C = r0
            java.lang.Long r0 = r11.A0B
            r5.A0F = r0
            java.lang.String r0 = r11.A0O
            java.lang.Integer r0 = X.C1408173e.A02(r0)
            r5.A04 = r0
            X.9i7 r8 = r6.A07
            java.lang.Long r0 = r8.A09
            if (r0 == 0) goto L_0x0171
            double r11 = r0.doubleValue()
            java.lang.Double r7 = java.lang.Double.valueOf(r11)
        L_0x0171:
            r5.A01 = r7
            java.lang.String r0 = r8.A0P
            r5.A0I = r0
            java.lang.String r0 = r8.A0N
            r5.A0H = r0
            java.lang.String r7 = r8.A0R
            r8 = 0
            if (r7 == 0) goto L_0x019b
            goto L_0x018b
        L_0x0181:
            r0 = r7
            goto L_0x0151
        L_0x0183:
            X.C26411Sa.A00(r2, r5, r13)
            goto L_0x00e7
        L_0x0188:
            r12 = 0
            goto L_0x0093
        L_0x018b:
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0195 }
            r0.<init>(r7)     // Catch:{ URISyntaxException -> 0x0195 }
            java.lang.String r8 = r0.getHost()     // Catch:{ URISyntaxException -> 0x0195 }
            goto L_0x019b
        L_0x0195:
            r7 = move-exception
            java.lang.String r0 = "MediaJobEventBuilder/getDomainName syntax exception"
            com.whatsapp.util.Log.e(r0, r7)
        L_0x019b:
            r5.A0K = r8
            r8 = 3
            if (r2 == 0) goto L_0x01a8
            int r0 = r2.intValue()
            if (r0 == r1) goto L_0x01ae
            if (r0 == r8) goto L_0x01ae
        L_0x01a8:
            X.9i7 r0 = r6.A07
            java.lang.String r0 = r0.A0R
            r5.A0J = r0
        L_0x01ae:
            X.9i7 r0 = r6.A07
            X.9eo r7 = r0.A01
            if (r7 == 0) goto L_0x01e3
            java.lang.Long r0 = r7.A03
            r5.A0G = r0
            if (r2 == 0) goto L_0x01d7
            int r0 = r2.intValue()
            if (r0 != r1) goto L_0x01d7
            java.lang.Integer r0 = r7.A01
            if (r0 != 0) goto L_0x01cd
            java.lang.String r0 = "ResumeCheckStat result is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
        L_0x01cd:
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x01d7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
        L_0x01d7:
            X.6iI r0 = r7.A00
            if (r0 == 0) goto L_0x01e3
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A09 = r0
        L_0x01e3:
            X.9i7 r11 = r6.A07
            java.lang.Float r1 = r11.A05
            if (r1 == 0) goto L_0x0200
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1.floatValue()
            float r0 = r0 - r1
            float r7 = java.lang.Math.abs(r0)
            r0 = 1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0200
            double r0 = (double) r1
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A02 = r0
        L_0x0200:
            X.70S r7 = r6.A06
            if (r7 == 0) goto L_0x0210
            X.64V r0 = r7.A01
            java.lang.Long r1 = r0.A0d
            boolean r0 = r6.A0G
            java.lang.Long r0 = X.C1409973w.A06(r1, r0)
            r5.A0E = r0
        L_0x0210:
            r0 = 0
            if (r7 == 0) goto L_0x0242
            X.64V r7 = r7.A01
            java.lang.Long r7 = r7.A0Q
            if (r7 == 0) goto L_0x0242
            long r7 = r7.longValue()
        L_0x021e:
            if (r11 == 0) goto L_0x0231
            java.lang.Long r12 = r11.A0K
            if (r12 == 0) goto L_0x0231
            java.lang.Long r9 = r11.A0J
            if (r9 == 0) goto L_0x0231
            long r0 = r12.longValue()
            long r11 = r9.longValue()
            long r0 = r0 - r11
        L_0x0231:
            java.lang.Long r0 = X.C17880vN.A0o(r7, r0)
            r5.A0B = r0
            java.lang.Integer r0 = X.C1408173e.A01(r13, r2)
            r5.A08 = r0
            r15.CC7(r5)
            goto L_0x004c
        L_0x0242:
            r7 = 0
            goto L_0x021e
        L_0x0245:
            X.9i7 r0 = r6.A07     // Catch:{ all -> 0x0295 }
            if (r0 == 0) goto L_0x024e
            java.lang.Long r0 = r0.A0H     // Catch:{ all -> 0x0295 }
            if (r0 != 0) goto L_0x0252
            goto L_0x0262
        L_0x024e:
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ all -> 0x0295 }
        L_0x0252:
            long r7 = r0.longValue()     // Catch:{ all -> 0x0295 }
            int r5 = (int) r7     // Catch:{ all -> 0x0295 }
            long r0 = (long) r5     // Catch:{ all -> 0x0295 }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0263
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch:{ all -> 0x0295 }
            r0.<init>()     // Catch:{ all -> 0x0295 }
            throw r0     // Catch:{ all -> 0x0295 }
        L_0x0262:
            r5 = 0
        L_0x0263:
            monitor-exit(r6)
            int r1 = r10.A00
            r0 = -3
            X.C32861hs.A03(r4, r14, r0, r5, r1)
            X.1ho r5 = r4.A0A
            java.util.Iterator r2 = X.C29431cG.A0o(r29)
        L_0x0270:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0298
            X.21V r1 = X.C17880vN.A0b(r2)
            boolean r0 = X.C18020vd.A07(r5)
            if (r0 == 0) goto L_0x0288
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            X.C32821ho.A02(r0, r5, r10, r1)
            goto L_0x0270
        L_0x0288:
            monitor-enter(r1)
            X.2rc r0 = X.AnonymousClass206.A00(r1)     // Catch:{ all -> 0x0292 }
            X.C32821ho.A02(r0, r5, r10, r1)     // Catch:{ all -> 0x0292 }
            monitor-exit(r1)     // Catch:{ all -> 0x0292 }
            goto L_0x0270
        L_0x0292:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0292 }
            throw r0
        L_0x0295:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0298:
            boolean r0 = X.C22781De.A03()
            if (r0 == 0) goto L_0x02de
            X.10I r2 = r4.A0M
            r1 = 21
            X.7Qr r0 = new X.7Qr
            r0.<init>(r4, r14, r1)
            r2.CGF(r0)
        L_0x02aa:
            X.1TJ r0 = r3.A0I
            java.lang.Object r7 = r0.A00()
            X.2g5 r7 = (X.C55612g5) r7
            if (r7 == 0) goto L_0x02e7
            X.1ho r5 = r4.A0A
            java.util.Iterator r2 = X.C29431cG.A0o(r29)
        L_0x02ba:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02e7
            X.21V r1 = X.C17880vN.A0b(r2)
            boolean r0 = X.C18020vd.A07(r5)
            if (r0 == 0) goto L_0x02d3
            X.2rc r0 = r1.A02
            X.C17960vV.A07(r0)
            X.C32821ho.A04(r5, r7, r1)
            goto L_0x02ba
        L_0x02d3:
            monitor-enter(r1)
            X.2rc r0 = r1.A02     // Catch:{ all -> 0x02e4 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x02e4 }
            X.C32821ho.A04(r5, r7, r1)     // Catch:{ all -> 0x02e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x02e4 }
            goto L_0x02ba
        L_0x02de:
            X.1hq r0 = r4.A0G
            r0.A00(r14)
            goto L_0x02aa
        L_0x02e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02e4 }
            throw r0
        L_0x02e7:
            X.1TJ r0 = r3.A07
            java.lang.Object r8 = r0.A00()
            X.2eu r8 = (X.C54912eu) r8
            if (r8 == 0) goto L_0x031e
            X.1ho r5 = r4.A0A
            java.util.Iterator r2 = X.C29431cG.A0o(r29)
        L_0x02f7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x031e
            X.21V r1 = X.C17880vN.A0b(r2)
            boolean r0 = X.C18020vd.A07(r5)
            if (r0 == 0) goto L_0x0310
            X.2rc r0 = r1.A02
            X.C17960vV.A07(r0)
            X.C32821ho.A03(r5, r8, r1)
            goto L_0x02f7
        L_0x0310:
            monitor-enter(r1)
            X.2rc r0 = r1.A02     // Catch:{ all -> 0x031b }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x031b }
            X.C32821ho.A03(r5, r8, r1)     // Catch:{ all -> 0x031b }
            monitor-exit(r1)     // Catch:{ all -> 0x031b }
            goto L_0x02f7
        L_0x031b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x031b }
            throw r0
        L_0x031e:
            X.1ho r5 = r4.A0A
            int r11 = r19.intValue()
            java.util.Iterator r12 = X.C29431cG.A0o(r29)
        L_0x0328:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x035f
            X.21V r9 = X.C17880vN.A0b(r12)
            X.0ve r8 = r5.A01
            r2 = 0
            X.C18070vi.A0d(r8, r2)
            r1 = 11380(0x2c74, float:1.5947E-41)
            r0 = r21
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x034e
            X.2rc r1 = X.AnonymousClass206.A00(r9)
            r1.A0f = r2
            r0 = 1
            if (r11 != 0) goto L_0x0328
            r1.A0V = r0
            goto L_0x0328
        L_0x034e:
            monitor-enter(r9)
            X.2rc r1 = X.AnonymousClass206.A00(r9)     // Catch:{ all -> 0x035c }
            r1.A0f = r2     // Catch:{ all -> 0x035c }
            r0 = 1
            if (r11 != 0) goto L_0x035a
            r1.A0V = r0     // Catch:{ all -> 0x035c }
        L_0x035a:
            monitor-exit(r9)     // Catch:{ all -> 0x035c }
            goto L_0x0328
        L_0x035c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x035c }
            throw r0
        L_0x035f:
            r0 = r29
            boolean r0 = r0 instanceof java.util.Collection
            r30 = 0
            if (r0 == 0) goto L_0x0377
            boolean r0 = r29.isEmpty()
            if (r0 == 0) goto L_0x0377
        L_0x036d:
            X.1hr r8 = r4.A0J
            X.2ta r0 = r3.A0P
            X.2qf r0 = r0.A03
            boolean r1 = r0.A04
            monitor-enter(r6)
            goto L_0x038e
        L_0x0377:
            java.util.Iterator r1 = r29.iterator()
        L_0x037b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x036d
            X.206 r0 = X.C17880vN.A0Y(r1)
            boolean r0 = X.C22971Dz.A0f(r0)
            if (r0 == 0) goto L_0x037b
            r30 = 1
            goto L_0x036d
        L_0x038e:
            boolean r15 = r6.A0N     // Catch:{ all -> 0x06dc }
            monitor-exit(r6)
            if (r20 == 0) goto L_0x047f
            r2 = 2
            r0 = r20
            if (r0 == r2) goto L_0x047f
            r2 = 4
            if (r0 == r2) goto L_0x047f
            if (r10 != 0) goto L_0x0433
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediauploadresponseprocessor/processUploadResponse/not regular upload, but upload response is null: uploadType="
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = "; result="
            X.C17900vP.A0i(r0, r1, r11)
        L_0x03b0:
            r0 = 0
            X.C32861hs.A01(r4, r0, r14)
            int r9 = X.AnonymousClass1SR.A00(r14)
            X.1SU r1 = r4.A0E
            X.1T6 r8 = r4.A09
            int r0 = r3.A00
            X.2ln r0 = r8.A0F(r3, r0, r9)
            r1.A01(r0)
            X.34A r0 = r3.A02
            if (r0 == 0) goto L_0x03ec
            if (r7 == 0) goto L_0x03ec
            X.18K r5 = r4.A08
            X.2h4 r2 = r0.A00
            X.73e r1 = r0.A01
            int r0 = r7.A00
            int r27 = r1.A04()
            r22 = r2
            r23 = r1
            r24 = r7
            r25 = r0
            r26 = r9
            r21 = r8
            X.2ln r0 = r21.A0E(r22, r23, r24, r25, r26, r27)
            X.64X r0 = r0.A00
            r5.CC7(r0)
        L_0x03ec:
            X.00H r0 = r4.A0Q
            java.lang.Object r1 = r0.get()
            X.2r5 r1 = (X.C62242r5) r1
            X.21V r0 = r14.A01()
            int r26 = r1.A01(r0)
            X.9i7 r1 = r6.A07
            if (r1 == 0) goto L_0x0430
            java.lang.Long r0 = r1.A09
            if (r0 == 0) goto L_0x0430
            long r28 = r0.longValue()
            X.9eo r0 = r1.A01
            if (r0 == 0) goto L_0x0416
            java.lang.Long r0 = r0.A03
            if (r0 == 0) goto L_0x0416
            long r0 = r0.longValue()
            long r28 = r28 - r0
        L_0x0416:
            X.10I r1 = r4.A0M
            X.7QQ r0 = new X.7QQ
            r21 = r0
            r22 = r4
            r23 = r3
            r24 = r14
            r25 = r19
            r27 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r30)
            r1.CGF(r0)
            r3.A05()
            return
        L_0x0430:
            r28 = 0
            goto L_0x0416
        L_0x0433:
            r1 = 3
            if (r0 != r1) goto L_0x03b0
            X.21V r9 = r14.A01()
            X.2rU r0 = r10.A01
            X.2KK r0 = (X.AnonymousClass2KK) r0
            X.00H r1 = r8.A07
            java.lang.Object r5 = r1.get()
            X.2qc r5 = (X.C61992qc) r5
            if (r11 == 0) goto L_0x047c
            r1 = 7
            r28 = 2
            if (r11 == r1) goto L_0x044f
            r28 = 0
        L_0x044f:
            com.whatsapp.jid.Jid r13 = r0.A01
            X.205 r1 = r9.A0v
            java.lang.String r12 = r1.A01
            X.1BI r2 = r0.A00
            boolean r1 = r0.A03
            com.whatsapp.jid.UserJid r0 = r0.A02
            X.9un r10 = r10.A02
            java.lang.String r27 = r10.A03()
            r21 = r5
            r22 = r2
            r23 = r13
            r24 = r0
            r25 = r9
            r26 = r12
            r29 = r1
            r21.A01(r22, r23, r24, r25, r26, r27, r28, r29)
            if (r11 != 0) goto L_0x03b0
            X.121 r1 = r8.A02
            r0 = -1
            r1.CQx(r9, r0)
            goto L_0x03b0
        L_0x047c:
            r28 = 1
            goto L_0x044f
        L_0x047f:
            r9 = 2
            r13 = 0
            if (r11 != 0) goto L_0x04ab
            if (r10 == 0) goto L_0x048f
            X.2rU r0 = r10.A01
            X.2h8 r0 = r0.A02
            boolean r0 = r0.A0F
            r5 = 13
            if (r0 == 0) goto L_0x0490
        L_0x048f:
            r5 = 2
        L_0x0490:
            java.util.Iterator r2 = r29.iterator()
            X.C18070vi.A0X(r2)
        L_0x0497:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04ad
            X.206 r0 = X.C17880vN.A0Y(r2)
            if (r5 != 0) goto L_0x04a7
            r0.A0U()
            goto L_0x0497
        L_0x04a7:
            r0.A0a(r5)
            goto L_0x0497
        L_0x04ab:
            r5 = 0
            goto L_0x0490
        L_0x04ad:
            r2 = 1
            switch(r11) {
                case 0: goto L_0x0508;
                case 1: goto L_0x0508;
                case 2: goto L_0x04df;
                case 3: goto L_0x04d6;
                case 4: goto L_0x04d0;
                case 5: goto L_0x04e5;
                case 6: goto L_0x04ca;
                case 7: goto L_0x04bb;
                case 8: goto L_0x0508;
                case 9: goto L_0x0508;
                case 10: goto L_0x0508;
                case 11: goto L_0x0508;
                case 12: goto L_0x0508;
                case 13: goto L_0x0508;
                case 14: goto L_0x04b1;
                case 15: goto L_0x0508;
                case 16: goto L_0x0508;
                case 17: goto L_0x0508;
                case 18: goto L_0x0508;
                case 19: goto L_0x0508;
                case 20: goto L_0x04b1;
                case 21: goto L_0x04b3;
                case 22: goto L_0x0508;
                case 23: goto L_0x04b1;
                case 24: goto L_0x0508;
                case 25: goto L_0x04b1;
                case 26: goto L_0x04b1;
                case 27: goto L_0x04b1;
                case 28: goto L_0x04b1;
                case 29: goto L_0x04b1;
                case 30: goto L_0x0508;
                case 31: goto L_0x0508;
                case 32: goto L_0x0508;
                case 33: goto L_0x0508;
                case 34: goto L_0x04e5;
                case 35: goto L_0x04e5;
                case 36: goto L_0x04e5;
                case 37: goto L_0x04d6;
                default: goto L_0x04b1;
            }
        L_0x04b1:
            monitor-enter(r14)
            goto L_0x0519
        L_0x04b3:
            if (r1 == 0) goto L_0x04b1
            X.1KB r1 = r8.A01
            r0 = 2131896087(0x7f122717, float:1.9427025E38)
            goto L_0x04db
        L_0x04bb:
            X.1KB r1 = r8.A01
            X.00H r0 = r8.A05
            java.lang.Object r0 = r0.get()
            X.6zi r0 = (X.C139956zi) r0
            int r0 = r0.A01()
            goto L_0x04f5
        L_0x04ca:
            X.1KB r1 = r8.A01
            r0 = 2131892909(0x7f121aad, float:1.942058E38)
            goto L_0x04f5
        L_0x04d0:
            X.1KB r1 = r8.A01
            r0 = 2131889999(0x7f120f4f, float:1.9414677E38)
            goto L_0x04f5
        L_0x04d6:
            X.1KB r1 = r8.A01
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
        L_0x04db:
            r1.A09(r0, r13)
            goto L_0x04b1
        L_0x04df:
            X.1KB r1 = r8.A01
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            goto L_0x04f5
        L_0x04e5:
            X.21V r0 = r14.A01()
            int r12 = r0.A0u
            X.1KB r1 = r8.A01
            r0 = 2131889958(0x7f120f26, float:1.9414594E38)
            if (r12 != r2) goto L_0x04f5
            r0 = 2131889970(0x7f120f32, float:1.9414619E38)
        L_0x04f5:
            boolean r12 = X.C22781De.A03()
            if (r12 == 0) goto L_0x04ff
            r1.A06(r0, r13)
            goto L_0x04b1
        L_0x04ff:
            X.7RP r12 = new X.7RP
            r12.<init>(r1, r0)
            r1.A0J(r12)
            goto L_0x04b1
        L_0x0508:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediaUploadResponseProcessor/result = "
            r1.append(r0)
            java.lang.String r0 = X.C137266vB.A00(r11)
            X.C17890vO.A1A(r1, r0)
            goto L_0x04b1
        L_0x0519:
            java.util.Iterator r12 = r29.iterator()     // Catch:{ all -> 0x06d9 }
        L_0x051d:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x06d9 }
            if (r0 == 0) goto L_0x0533
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x06d9 }
            r1 = r0
            X.21V r1 = (X.AnonymousClass21V) r1     // Catch:{ all -> 0x06d9 }
            boolean r1 = X.C22971Dz.A0g(r1)     // Catch:{ all -> 0x06d9 }
            if (r1 == 0) goto L_0x051d
        L_0x0530:
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x06d9 }
            goto L_0x0535
        L_0x0533:
            r0 = 0
            goto L_0x0530
        L_0x0535:
            monitor-exit(r14)
            r17 = 0
            if (r0 == 0) goto L_0x056e
            r12 = 0
            if (r10 == 0) goto L_0x0543
            X.2rU r1 = r10.A01
            X.9i7 r1 = r1.A04
            java.lang.Long r12 = r1.A0H
        L_0x0543:
            X.1hg r1 = r8.A04
            r10 = r23
            r1.A04 = r10
            r10 = r22
            r1.A05 = r10
            if (r11 == 0) goto L_0x056e
            if (r11 != r2) goto L_0x0662
            if (r15 != 0) goto L_0x056e
        L_0x0553:
            java.lang.String r27 = "cancelled"
        L_0x0555:
            long r10 = X.C17900vP.A01(r12)
            java.lang.Long r26 = java.lang.Long.valueOf(r10)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r23)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r22)
            r22 = r1
            r23 = r0
            r28 = r2
            r22.A0D(r23, r24, r25, r26, r27, r28)
        L_0x056e:
            java.util.Iterator r16 = X.C29431cG.A0o(r29)
        L_0x0572:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03b0
            X.21V r10 = X.C17880vN.A0b(r16)
            if (r5 != r9) goto L_0x064d
            X.00H r0 = r8.A06
            java.lang.Object r12 = r0.get()
            X.1RU r12 = (X.AnonymousClass1RU) r12
            X.6RT r15 = X.AnonymousClass6RT.MEDIA_ALBUM
            X.1RV r12 = (X.AnonymousClass1RV) r12
            r11 = 0
            X.C18070vi.A0d(r10, r11)
            X.00H r0 = r12.A00
            X.0vd r13 = X.C17880vN.A0P(r0)
            r1 = 8783(0x224f, float:1.2308E-41)
            r0 = r21
            boolean r0 = X.C18020vd.A05(r0, r13, r1)
            if (r0 == 0) goto L_0x05e8
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r0 = r10.A11(r0)
            if (r0 == 0) goto L_0x05e8
            X.00H r0 = r12.A03
            java.lang.Object r13 = r0.get()
            X.1Qe r13 = (X.C25931Qe) r13
            X.25F[] r1 = new X.AnonymousClass25F[r2]
            java.lang.Class<X.36t> r0 = X.C693236t.class
            X.25F r0 = X.C18070vi.A09(r10, r0)
            r1[r11] = r0
            r13.A0A(r1)
            X.36t r1 = X.C60512o9.A00(r10)
            if (r1 == 0) goto L_0x05e8
            X.6RT r0 = r1.A01
            if (r0 != r15) goto L_0x05e8
            X.00H r0 = r12.A02
            X.1W6 r11 = X.C17880vN.A0c(r0)
            long r0 = r1.A00
            X.1W2 r11 = r11.A01
            X.206 r1 = r11.A03(r0)
            if (r1 == 0) goto L_0x05e8
            int r0 = r1.A0D()
            boolean r0 = X.C446824j.A03(r0, r9)
            if (r0 == 0) goto L_0x05e8
            r1.A0a(r5)
            X.121 r0 = r8.A02
            r0.CQx(r1, r2)
        L_0x05e8:
            X.2rc r12 = X.AnonymousClass206.A00(r10)
            java.lang.String r0 = r10.A07
            if (r0 != 0) goto L_0x0600
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediauploadresponseprocessor/uploaded, but url is null for "
            r1.append(r0)
            X.205 r0 = r10.A0v
            java.lang.String r0 = r0.A01
            X.C17890vO.A19(r1, r0)
        L_0x0600:
            long r0 = r10.A01
            int r11 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r11 > 0) goto L_0x064d
            java.io.File r0 = r12.A0G
            if (r0 == 0) goto L_0x065f
            java.lang.StringBuilder r11 = X.C17890vO.A0f(r0)
            java.lang.String r0 = "; exists="
            r11.append(r0)
            java.io.File r0 = r12.A0G
            boolean r0 = r0.exists()
            r11.append(r0)
            java.lang.String r0 = "; size="
            r11.append(r0)
            java.io.File r0 = r12.A0G
            long r0 = r0.length()
            java.lang.String r12 = X.C17880vN.A0u(r11, r0)
        L_0x062b:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediauploadresponseprocessor/uploaded, but mediaSize="
            r11.append(r0)
            long r0 = r10.A01
            r11.append(r0)
            java.lang.String r0 = "; file="
            r11.append(r0)
            r11.append(r12)
            java.lang.String r0 = "; msg="
            r11.append(r0)
            X.205 r0 = r10.A0v
            java.lang.String r0 = r0.A01
            X.C17890vO.A19(r11, r0)
        L_0x064d:
            X.121 r1 = r8.A02
            r0 = -1
            if (r5 != r9) goto L_0x0653
            r0 = 1
        L_0x0653:
            r1.CQx(r10, r0)
            if (r5 == r9) goto L_0x0572
            X.1hk r0 = r8.A03
            r0.A02(r10)
            goto L_0x0572
        L_0x065f:
            java.lang.String r12 = "null"
            goto L_0x062b
        L_0x0662:
            switch(r11) {
                case 2: goto L_0x06d5;
                case 3: goto L_0x06d1;
                case 4: goto L_0x06cd;
                case 5: goto L_0x06c9;
                case 6: goto L_0x06c5;
                case 7: goto L_0x06c1;
                case 8: goto L_0x06bd;
                case 9: goto L_0x06b9;
                case 10: goto L_0x06b5;
                case 11: goto L_0x06b1;
                case 12: goto L_0x06ad;
                case 13: goto L_0x06a9;
                case 14: goto L_0x06a5;
                case 15: goto L_0x06a1;
                case 16: goto L_0x069d;
                case 17: goto L_0x0699;
                case 18: goto L_0x0695;
                case 19: goto L_0x0691;
                case 20: goto L_0x068d;
                case 21: goto L_0x0689;
                case 22: goto L_0x0685;
                case 23: goto L_0x0681;
                case 24: goto L_0x067d;
                case 25: goto L_0x0699;
                case 26: goto L_0x0679;
                case 27: goto L_0x0675;
                case 28: goto L_0x0671;
                case 29: goto L_0x066d;
                case 30: goto L_0x0665;
                case 31: goto L_0x0665;
                case 32: goto L_0x0553;
                case 33: goto L_0x06a9;
                case 34: goto L_0x06c9;
                case 35: goto L_0x06c9;
                case 36: goto L_0x06c9;
                case 37: goto L_0x06d1;
                case 38: goto L_0x0669;
                default: goto L_0x0665;
            }
        L_0x0665:
            java.lang.String r27 = "error_unknown"
            goto L_0x0555
        L_0x0669:
            java.lang.String r27 = "media_error_streaming_metadata_too_large"
            goto L_0x0555
        L_0x066d:
            java.lang.String r27 = "media_error_no_direct_path"
            goto L_0x0555
        L_0x0671:
            java.lang.String r27 = "media_error_cronet"
            goto L_0x0555
        L_0x0675:
            java.lang.String r27 = "media_skipped_ep_no_primary_host"
            goto L_0x0555
        L_0x0679:
            java.lang.String r27 = "media_switch_required"
            goto L_0x0555
        L_0x067d:
            java.lang.String r27 = "media_error_too_large"
            goto L_0x0555
        L_0x0681:
            java.lang.String r27 = "media_error_wamsys"
            goto L_0x0555
        L_0x0685:
            java.lang.String r27 = "media_error_dns"
            goto L_0x0555
        L_0x0689:
            java.lang.String r27 = "media_error_file_format_unsupported"
            goto L_0x0555
        L_0x068d:
            java.lang.String r27 = "media_error_transcoding_unknown"
            goto L_0x0555
        L_0x0691:
            java.lang.String r27 = "media_error_url"
            goto L_0x0555
        L_0x0695:
            java.lang.String r27 = "media_error_ssl"
            goto L_0x0555
        L_0x0699:
            java.lang.String r27 = "media_error_no_client_network"
            goto L_0x0555
        L_0x069d:
            java.lang.String r27 = "media_error_no_such_algorithm"
            goto L_0x0555
        L_0x06a1:
            java.lang.String r27 = "media_error_throttle"
            goto L_0x0555
        L_0x06a5:
            java.lang.String r27 = "media_error_optimistic_network_unsafe"
            goto L_0x0555
        L_0x06a9:
            java.lang.String r27 = "media_error_conn"
            goto L_0x0555
        L_0x06ad:
            java.lang.String r27 = "media_error_optimistic_hash"
            goto L_0x0555
        L_0x06b1:
            java.lang.String r27 = "media_error_not_finalized"
            goto L_0x0555
        L_0x06b5:
            java.lang.String r27 = "media_error_request_timeout"
            goto L_0x0555
        L_0x06b9:
            java.lang.String r27 = "media_error_request"
            goto L_0x0555
        L_0x06bd:
            java.lang.String r27 = "media_error_server"
            goto L_0x0555
        L_0x06c1:
            java.lang.String r27 = "media_error_fnf"
            goto L_0x0555
        L_0x06c5:
            java.lang.String r27 = "media_error_no_permissions"
            goto L_0x0555
        L_0x06c9:
            java.lang.String r27 = "media_error_bad_media"
            goto L_0x0555
        L_0x06cd:
            java.lang.String r27 = "media_error_oom"
            goto L_0x0555
        L_0x06d1:
            java.lang.String r27 = "media_error_io"
            goto L_0x0555
        L_0x06d5:
            java.lang.String r27 = "failed_insufficient_space"
            goto L_0x0555
        L_0x06d9:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x06dc:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AY.accept(java.lang.Object):void");
    }

    public /* synthetic */ AnonymousClass3AY(C32861hs r1, AnonymousClass34B r2, C63642tS r3, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = z;
        this.A04 = z2;
    }
}
