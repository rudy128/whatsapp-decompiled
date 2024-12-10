package X;

/* renamed from: X.9n2  reason: invalid class name and case insensitive filesystem */
public final class C191699n2 {
    public final C26031Qo A00;
    public final C18030ve A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass1PT A04;
    public final C192499oV A05;
    public final A16 A06;
    public final AnonymousClass00H A07;

    public C191699n2(AnonymousClass11S r1, C26031Qo r2, C18030ve r3, AnonymousClass18K r4, AnonymousClass1PT r5, C192499oV r6, A16 a16, AnonymousClass00H r8) {
        C18070vi.A0w(r3, r1, r4, r2, r5);
        C18070vi.A0q(r6, a16, r8);
        this.A01 = r3;
        this.A02 = r1;
        this.A03 = r4;
        this.A00 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = a16;
        this.A07 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if (r18.intValue() > X.C18020vd.A00(r10, r3.A01, 8860)) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a3 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c6 A[Catch:{ all -> 0x01dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7PS A00(X.AnonymousClass1BI r27, com.whatsapp.jid.Jid r28, X.AnonymousClass206 r29, X.AnonymousClass205 r30, java.lang.Integer r31, byte[] r32, byte[] r33, byte[] r34, int r35, int r36, long r37, boolean r39) {
        /*
            r26 = this;
            r2 = 0
            r12 = r26
            X.0ve r11 = r12.A01     // Catch:{ all -> 0x01e3 }
            r0 = 5718(0x1656, float:8.013E-42)
            X.0vf r10 = X.C18040vf.A02     // Catch:{ all -> 0x01e3 }
            boolean r0 = X.C18020vd.A05(r10, r11, r0)     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x0015
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x01e3 }
            r0.<init>(r2, r2, r2)     // Catch:{ all -> 0x01e3 }
            return r0
        L_0x0015:
            r3 = r30
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x01e3 }
            r25 = r0
            X.C18070vi.A0X(r25)     // Catch:{ all -> 0x01e3 }
            X.Ac2 r9 = new X.Ac2     // Catch:{ all -> 0x01e3 }
            r21 = r2
            r22 = r2
            r17 = r2
            r19 = r32
            r23 = r37
            r20 = r2
            r16 = r9
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01e3 }
            r13 = r33
            if (r33 == 0) goto L_0x01d6
            int r0 = r13.length     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x01d6
            X.9oV r5 = r12.A05     // Catch:{ all -> 0x01d3 }
            X.1BI r1 = r3.A00     // Catch:{ all -> 0x01d3 }
            boolean r0 = X.C22971Dz.A0d(r1)     // Catch:{ all -> 0x01d3 }
            r4 = r27
            if (r0 == 0) goto L_0x004b
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A00(r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x004f
        L_0x004b:
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A00(r4)     // Catch:{ all -> 0x01d3 }
        L_0x004f:
            if (r8 != 0) goto L_0x0061
            X.1Qo r1 = r12.A00     // Catch:{ all -> 0x005e }
            X.8oI r0 = X.AnonymousClass8oI.A03     // Catch:{ all -> 0x005e }
            r1.A00(r0, r2)     // Catch:{ all -> 0x005e }
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x01d0 }
            r0.<init>(r9, r2, r2)     // Catch:{ all -> 0x01d0 }
            return r0
        L_0x005e:
            r4 = move-exception
            goto L_0x01d1
        L_0x0061:
            X.1BI r17 = r5.A00(r4, r3)     // Catch:{ all -> 0x01d0 }
            if (r17 != 0) goto L_0x0074
            X.1Qo r1 = r12.A00     // Catch:{ all -> 0x01d0 }
            X.8oI r0 = X.AnonymousClass8oI.A02     // Catch:{ all -> 0x01d0 }
            r1.A00(r0, r2)     // Catch:{ all -> 0x01d0 }
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x01d0 }
            r0.<init>(r9, r2, r8)     // Catch:{ all -> 0x01d0 }
            return r0
        L_0x0074:
            X.A16 r3 = r12.A06     // Catch:{ all -> 0x01d0 }
            r18 = r31
            r1 = r34
            r0 = r18
            byte[] r7 = r3.A02(r0, r1)     // Catch:{ all -> 0x01d0 }
            r14 = r29
            byte[] r4 = r14.A1D     // Catch:{ all -> 0x01d0 }
            r1 = r17
            r0 = r25
            byte[] r6 = r5.A01(r1, r8, r0, r4)     // Catch:{ all -> 0x01d0 }
            if (r6 == 0) goto L_0x0094
            int r0 = r6.length     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r0 = r2
            goto L_0x00aa
        L_0x0096:
            int r0 = r7.length     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x0094
            byte[] r1 = X.AnonymousClass9QC.A00(r7, r6)     // Catch:{ all -> 0x01d0 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x01d0 }
            r0 = 16
            java.util.List r0 = X.C200410p.A0M(r1, r0)     // Catch:{ all -> 0x01d0 }
            byte[] r0 = X.C29431cG.A1A(r0)     // Catch:{ all -> 0x01d0 }
        L_0x00aa:
            boolean r16 = java.util.Arrays.equals(r13, r0)     // Catch:{ all -> 0x01d0 }
            if (r16 != 0) goto L_0x019a
            r0 = 8858(0x229a, float:1.2413E-41)
            boolean r0 = X.C18020vd.A05(r10, r11, r0)     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x019a
            if (r6 != 0) goto L_0x00bc
            r1 = 0
            goto L_0x00d5
        L_0x00bc:
            if (r7 == 0) goto L_0x00d4
            int r0 = r7.length     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x00d4
            if (r31 == 0) goto L_0x00d2
            int r2 = r18.intValue()     // Catch:{ all -> 0x01e6 }
            X.0ve r1 = r3.A01     // Catch:{ all -> 0x01e6 }
            r0 = 8860(0x229c, float:1.2416E-41)
            int r0 = X.C18020vd.A00(r10, r1, r0)     // Catch:{ all -> 0x01e6 }
            r1 = 2
            if (r2 <= r0) goto L_0x00d5
        L_0x00d2:
            r1 = 3
            goto L_0x00d5
        L_0x00d4:
            r1 = 1
        L_0x00d5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e6 }
            X.8rH r4 = new X.8rH     // Catch:{ all -> 0x01e6 }
            r4.<init>()     // Catch:{ all -> 0x01e6 }
            r4.A05 = r5     // Catch:{ all -> 0x01e6 }
            X.1PT r0 = r12.A04     // Catch:{ all -> 0x01e6 }
            r1 = r35
            int r0 = r0.A06(r1)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r4.A02 = r15     // Catch:{ all -> 0x01e6 }
            boolean r0 = r8 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x01e6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r4.A00 = r3     // Catch:{ all -> 0x01e6 }
            boolean r0 = X.AnonymousClass000.A1R(r36)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r4.A01 = r0     // Catch:{ all -> 0x01e6 }
            X.00H r2 = r12.A07     // Catch:{ all -> 0x01e6 }
            int r0 = X.C62242r5.A00(r14, r2)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r4.A03 = r0     // Catch:{ all -> 0x01e6 }
            int r0 = X.C64002u3.A04(r17)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r4.A04 = r0     // Catch:{ all -> 0x01e6 }
            X.18K r1 = r12.A03     // Catch:{ all -> 0x01e6 }
            r1.CC7(r4)     // Catch:{ all -> 0x01e6 }
            X.8rs r0 = new X.8rs     // Catch:{ all -> 0x01e6 }
            r0.<init>()     // Catch:{ all -> 0x01e6 }
            r0.A08 = r5     // Catch:{ all -> 0x01e6 }
            r0.A05 = r15     // Catch:{ all -> 0x01e6 }
            r0.A00 = r3     // Catch:{ all -> 0x01e6 }
            boolean r3 = X.AnonymousClass000.A1R(r36)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01e6 }
            r0.A01 = r3     // Catch:{ all -> 0x01e6 }
            int r2 = X.C62242r5.A00(r14, r2)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01e6 }
            r0.A06 = r2     // Catch:{ all -> 0x01e6 }
            int r2 = X.C64002u3.A04(r17)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01e6 }
            r0.A07 = r2     // Catch:{ all -> 0x01e6 }
            X.11S r3 = r12.A02     // Catch:{ all -> 0x01e6 }
            com.whatsapp.jid.DeviceJid r2 = X.AnonymousClass1E0.A00(r28)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r2 = X.A8F.A05(r3, r2)     // Catch:{ all -> 0x01e6 }
            r0.A04 = r2     // Catch:{ all -> 0x01e6 }
            boolean r2 = r3.A0N()     // Catch:{ all -> 0x01e6 }
            int r2 = X.C72453Mb.A03(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01e6 }
            r0.A03 = r2     // Catch:{ all -> 0x01e6 }
            java.lang.String r2 = r8.getRawString()     // Catch:{ all -> 0x01e6 }
            r0.A0A = r2     // Catch:{ all -> 0x01e6 }
            r2 = r25
            r0.A09 = r2     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r2 = r14.A0R     // Catch:{ all -> 0x01e6 }
            boolean r2 = X.AnonymousClass000.A1W(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01e6 }
            r0.A02 = r2     // Catch:{ all -> 0x01e6 }
            r1.CC7(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "ReportingToken/WamReportingTokenValidationFailure: failureReason : "
            r2.append(r0)     // Catch:{ all -> 0x01e6 }
            r2.append(r5)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = ", messageType: "
            X.AnonymousClass206.A07(r14, r0, r2)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = ", messageMediaType: "
            r2.append(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.Integer r0 = r4.A03     // Catch:{ all -> 0x01e6 }
            r2.append(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r1 = ", version: "
            r0 = r18
            X.C17900vP.A0Z(r0, r1, r2)     // Catch:{ all -> 0x01e6 }
            goto L_0x019b
        L_0x019a:
            r5 = 0
        L_0x019b:
            r0 = 8859(0x229b, float:1.2414E-41)
            boolean r0 = X.C18020vd.A05(r10, r11, r0)     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01c6
            r0 = 7
            if (r16 == 0) goto L_0x01a7
            r0 = 6
        L_0x01a7:
            java.util.List r0 = X.C200410p.A0M(r13, r0)     // Catch:{ all -> 0x01df }
            byte[] r17 = X.C29431cG.A1A(r0)     // Catch:{ all -> 0x01df }
            if (r39 != 0) goto L_0x01b2
            r6 = 0
        L_0x01b2:
            r3 = 0
            X.Ac2 r2 = new X.Ac2     // Catch:{ all -> 0x01dd }
            r13 = r2
            r14 = r18
            r15 = r25
            r16 = r19
            r18 = r7
            r19 = r6
            r20 = r23
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01dd }
            goto L_0x01c8
        L_0x01c6:
            r3 = 0
            r2 = r9
        L_0x01c8:
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x01ce }
            r0.<init>(r2, r5, r8)     // Catch:{ all -> 0x01ce }
            return r0
        L_0x01ce:
            r4 = move-exception
            goto L_0x01e9
        L_0x01d0:
            r4 = move-exception
        L_0x01d1:
            r3 = r2
            goto L_0x01e1
        L_0x01d3:
            r4 = move-exception
            r3 = r2
            goto L_0x01e1
        L_0x01d6:
            r3 = r2
            X.7PS r0 = new X.7PS     // Catch:{ all -> 0x01dd }
            r0.<init>(r9, r2, r2)     // Catch:{ all -> 0x01dd }
            return r0
        L_0x01dd:
            r4 = move-exception
            goto L_0x01e1
        L_0x01df:
            r4 = move-exception
            r3 = 0
        L_0x01e1:
            r2 = r9
            goto L_0x01e9
        L_0x01e3:
            r4 = move-exception
            r3 = r2
            goto L_0x01e9
        L_0x01e6:
            r4 = move-exception
            r2 = r9
            r3 = 0
        L_0x01e9:
            X.1Qo r1 = r12.A00
            X.8oI r0 = X.AnonymousClass8oI.A05
            r1.A01(r0, r3, r4)
            X.7PS r0 = new X.7PS
            r0.<init>(r2, r3, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191699n2.A00(X.1BI, com.whatsapp.jid.Jid, X.206, X.205, java.lang.Integer, byte[], byte[], byte[], int, int, long, boolean):X.7PS");
    }
}
