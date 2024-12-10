package X;

/* renamed from: X.1m7  reason: invalid class name and case insensitive filesystem */
public final class C35361m7 {
    public final AnonymousClass1GV A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass122 A03;
    public final C18030ve A04;
    public final C31441fZ A05;
    public final AnonymousClass1PT A06;
    public final C31661fv A07;
    public final C35341m5 A08;
    public final C31621fr A09;
    public final C31631fs A0A;

    public C35361m7(AnonymousClass1GV r2, AnonymousClass11P r3, AnonymousClass122 r4, C18030ve r5, AnonymousClass18K r6, C31441fZ r7, AnonymousClass1PT r8, C31661fv r9, C35341m5 r10, C31621fr r11, C31631fs r12) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r11, 7);
        C18070vi.A0d(r12, 8);
        C18070vi.A0d(r9, 9);
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r6;
        this.A06 = r8;
        this.A03 = r4;
        this.A05 = r7;
        this.A09 = r11;
        this.A0A = r12;
        this.A07 = r9;
        this.A00 = r2;
        this.A08 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (r0.A08 == null) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C29621ca r28, java.lang.Integer r29, java.util.Map r30) {
        /*
            r27 = this;
            r1 = r27
            X.11P r3 = r1.A02
            long r22 = android.os.SystemClock.uptimeMillis()
            X.1fr r2 = r1.A09
            X.1fs r0 = r1.A0A
            long r6 = android.os.SystemClock.uptimeMillis()
            long r8 = X.AnonymousClass11P.A01(r3)
            r4 = r28
            r3 = r2
            r5 = r0
            android.util.Pair r2 = r3.A01(r4, r5, r6, r8)
            if (r2 == 0) goto L_0x0159
            java.lang.Object r0 = r2.first
            X.2sw r0 = (X.C63362sw) r0
            java.lang.Object r8 = r2.second
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r2 = r0.A0S
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            if (r2 == 0) goto L_0x00f6
            java.lang.String r2 = "participant"
            com.whatsapp.jid.Jid r9 = r4.A0F(r3, r2)
            X.C17960vV.A07(r9)
        L_0x0035:
            X.C18070vi.A0b(r9)
            X.0ve r5 = r1.A04
            r3 = 12608(0x3140, float:1.7668E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r5, r3)
            if (r2 != 0) goto L_0x0057
            X.2rY r7 = r0.A06
            if (r7 == 0) goto L_0x0057
            X.1fv r6 = r1.A07
            X.205 r2 = r0.A0B
            boolean r5 = r2.A02
            com.whatsapp.jid.UserJid r3 = r0.A05()
            com.whatsapp.jid.UserJid r2 = r0.A0f
            r6.A00(r3, r2, r7, r5)
        L_0x0057:
            r0.A0C = r4
            X.C18070vi.A0b(r8)
            boolean r3 = r8.booleanValue()
            r2 = 0
            if (r3 == 0) goto L_0x0102
            X.1fZ r3 = r1.A05
            java.util.concurrent.atomic.AtomicLong r5 = r3.A06
            long r5 = r5.getAndIncrement()
            java.lang.Class<X.34t> r7 = X.C688034t.class
            X.B5K r7 = r0.A06(r7)
            r24 = 0
            if (r7 == 0) goto L_0x0077
            r24 = 1
        L_0x0077:
            X.11P r10 = r3.A01
            X.0ve r12 = r3.A02
            X.190 r9 = r3.A00
            X.18K r13 = r3.A03
            X.1N7 r14 = r3.A04
            X.00H r3 = r3.A05
            java.lang.Object r11 = r3.get()
            X.1CP r11 = (X.AnonymousClass1CP) r11
            java.lang.String r7 = r0.A0h
            java.lang.Integer r15 = r0.A0G
            java.lang.Integer r17 = X.C64002u3.A09(r0)
            int r3 = r0.A01
            r25 = 0
            if (r3 <= 0) goto L_0x0099
            r25 = 1
        L_0x0099:
            X.9r6 r3 = r0.A09
            if (r3 == 0) goto L_0x00a3
            X.9r6 r3 = r0.A08
            r26 = 1
            if (r3 != 0) goto L_0x00a5
        L_0x00a3:
            r26 = 0
        L_0x00a5:
            boolean r3 = r0.A0S
            if (r3 == 0) goto L_0x00ef
            r19 = 3
        L_0x00ab:
            X.8vJ r8 = new X.8vJ
            r3 = r29
            r20 = r5
            r18 = r7
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26)
            r0.A04 = r5
            r14.A04(r8)
            r0.A0I = r3
            X.1m5 r6 = r1.A08
            if (r30 != 0) goto L_0x00fe
            X.1MD[] r1 = r4.A0S()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r1 == 0) goto L_0x00fe
            X.4s7 r5 = new X.4s7
            r5.<init>(r1)
        L_0x00d3:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r4 = r5.next()
            X.1MD r4 = (X.AnonymousClass1MD) r4
            java.lang.String r1 = "offline"
            java.lang.String r3 = r4.A02
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = r4.A03
            r2.put(r3, r1)
            goto L_0x00d3
        L_0x00ef:
            com.whatsapp.jid.Jid r3 = r0.A0Z
            int r19 = X.C64002u3.A04(r3)
            goto L_0x00ab
        L_0x00f6:
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r9 = r4.A0G(r3, r2)
            goto L_0x0035
        L_0x00fe:
            r6.ByO(r0, r2)
            return
        L_0x0102:
            X.1PT r4 = r1.A06
            r3 = 4
            r4.A0I(r0, r2, r3)
            java.lang.String r8 = r0.A0h
            com.whatsapp.jid.Jid r6 = r0.A0Y
            java.lang.String r7 = r0.A0R
            boolean r3 = r0.A0S
            r10 = 487(0x1e7, float:6.82E-43)
            X.2lD r5 = new X.2lD
            r5.<init>()
            r2 = r9
            if (r3 == 0) goto L_0x011b
            r2 = r6
        L_0x011b:
            r5.A02 = r2
            java.lang.String r4 = "message"
            r5.A06 = r4
            r5.A08 = r8
            r5.A09 = r7
            if (r3 != 0) goto L_0x0128
            r9 = r6
        L_0x0128:
            r5.A01 = r9
            java.lang.String r2 = java.lang.String.valueOf(r10)
            r5.A01(r2)
            r2 = -1
            r5.A00 = r2
            X.2nR r3 = r5.A00()
            X.1GV r2 = r1.A00
            r2.accept(r3)
            X.2FH r3 = new X.2FH
            r3.<init>()
            r3.A00 = r4
            r3.A01 = r7
            X.18K r2 = r1.A01
            r2.CC7(r3)
            X.122 r7 = r1.A03
            X.205 r9 = r0.A0B
            X.1BI r8 = X.C22971Dz.A00(r6)
            long r11 = r0.A0X
            r7.BBO(r8, r9, r10, r11)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35361m7.A00(X.1ca, java.lang.Integer, java.util.Map):void");
    }
}
