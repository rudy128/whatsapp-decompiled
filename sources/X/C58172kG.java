package X;

/* renamed from: X.2kG  reason: invalid class name and case insensitive filesystem */
public final class C58172kG {
    public final C35241lt A00;
    public final C63362sw A01;
    public final int A02;
    public final AnonymousClass120 A03;
    public final C25001Mm A04;
    public final C31931gM A05;
    public final AnonymousClass1MR A06;
    public final C18030ve A07;
    public final C61592pw A08;
    public final AnonymousClass1PT A09;
    public final C54492eE A0A;
    public final C54492eE A0B;
    public final boolean A0C;
    public final byte[] A0D;
    public final byte[] A0E;

    public C58172kG(AnonymousClass120 r2, C25001Mm r3, AnonymousClass1P3 r4, C31931gM r5, AnonymousClass1MR r6, C18030ve r7, C35241lt r8, C61592pw r9, AnonymousClass1PT r10, C63362sw r11, C54492eE r12, C54492eE r13, byte[] bArr, byte[] bArr2, boolean z) {
        this.A07 = r7;
        this.A09 = r10;
        this.A08 = r9;
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r5;
        this.A00 = r8;
        this.A01 = r11;
        this.A02 = r4.A06.A02();
        this.A06 = r6;
        this.A0E = bArr;
        this.A0B = r12;
        this.A0A = r13;
        this.A0D = bArr2;
        this.A0C = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(int r33) {
        /*
            r32 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RetryRequest/send retry receipt; message.key="
            r1.append(r0)
            r7 = r32
            X.2sw r6 = r7.A01
            X.205 r0 = r6.A0B
            r1.append(r0)
            java.lang.String r0 = " participant="
            r1.append(r0)
            com.whatsapp.jid.Jid r4 = r6.A0Y
            r1.append(r4)
            java.lang.String r0 = " retryErrorCode="
            r5 = r33
            X.C17900vP.A0j(r0, r1, r5)
            r1 = 1
            r6.A0U = r1
            int r8 = r7.A02
            byte[] r20 = X.A8G.A03(r8)
            int r0 = r6.A02()
            if (r0 <= r1) goto L_0x0037
            X.120 r0 = r7.A03
            r0.A06()
        L_0x0037:
            X.1MR r1 = r7.A06
            com.whatsapp.jid.UserJid r0 = r6.A05()
            X.2rW r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0056
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0143
            X.2RD r1 = X.AnonymousClass2RD.HOSTED
        L_0x004a:
            X.2RD r0 = X.AnonymousClass2RD.HOSTED
            if (r1 != r0) goto L_0x0056
            r2 = 134217728(0x8000000, double:6.63123685E-316)
            long r0 = r6.A05
            long r2 = r2 | r0
            r6.A05 = r2
        L_0x0056:
            int r1 = r6.A01
            r3 = 50
            if (r1 != 0) goto L_0x013a
            int r0 = r6.A00
            if (r0 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RetryRequest/recording local placeholder for retry receipt; message.key="
            r1.append(r0)
            X.205 r0 = r6.A0B
            X.C17900vP.A0b(r0, r1)
            X.1gM r2 = r7.A05
            r1 = 18
        L_0x0072:
            X.3Bs r0 = new X.3Bs
            r0.<init>(r7, r1)
            r2.A01(r0, r3)
        L_0x007a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RetryRequest/sending retry receipt; message.key="
            X.C63362sw.A01(r6, r0, r1)
            java.lang.String r0 = "; localRegistrationId="
            X.C17900vP.A0j(r0, r1, r8)
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0147
            X.1PT r3 = r7.A09
            java.lang.String r0 = r6.A0h
            r18 = r0
            int r26 = r6.A02()
            com.whatsapp.jid.UserJid r0 = r6.A0f
            r31 = r0
            com.whatsapp.jid.Jid r15 = r6.A0Z
            long r0 = r6.A04
            X.2mp r2 = new X.2mp
            r21 = r2
            r22 = r15
            r23 = r4
            r24 = r31
            r25 = r18
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r3.A0E(r2)
            X.2pw r2 = r7.A08
            long r8 = r6.A0X
            int r0 = r6.A02()
            int r25 = r0 + 1
            byte[] r14 = r7.A0E
            X.2eE r11 = r7.A0B
            X.2eE r10 = r7.A0A
            byte[] r3 = r7.A0D
            long r0 = r6.A04
            java.lang.String r6 = r6.A0N
            if (r10 == 0) goto L_0x0138
            X.0ve r13 = r7.A07
            r7 = 8312(0x2078, float:1.1648E-41)
            X.0vf r12 = X.C18040vf.A02
            boolean r7 = X.C18020vd.A05(r12, r13, r7)
            if (r7 != 0) goto L_0x00e0
            if (r4 != 0) goto L_0x0138
            r7 = 9208(0x23f8, float:1.2903E-41)
            boolean r7 = X.C18020vd.A05(r12, r13, r7)
            if (r7 == 0) goto L_0x0138
        L_0x00e0:
            r7 = 1635(0x663, float:2.291E-42)
            byte[] r7 = new byte[r7]
            java.util.Random r12 = new java.util.Random
            r12.<init>()
            r12.nextBytes(r7)
        L_0x00ec:
            r24 = 5
            X.1Hc r12 = r2.A01
            boolean r12 = r12.A07
            if (r12 == 0) goto L_0x0137
            X.2h7 r12 = new X.2h7
            r23 = r7
            r26 = r5
            r27 = r8
            r29 = r0
            r19 = r6
            r21 = r14
            r22 = r3
            r16 = r11
            r17 = r10
            r13 = r15
            r14 = r4
            r15 = r31
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
            X.0ve r4 = r2.A02
            X.190 r3 = r2.A00
            if (r4 == 0) goto L_0x0123
            if (r3 == 0) goto L_0x0123
            long r8 = r12.A03
            java.lang.String r6 = "retry-receipt"
            java.lang.String r7 = r12.A0B
            r10 = 1
            java.lang.String r5 = "message"
            X.C63902ts.A07(r3, r4, r5, r6, r7, r8, r10)
        L_0x0123:
            r3 = 0
            r1 = 11
            r0 = 0
            android.os.Message r1 = android.os.Message.obtain(r3, r0, r1, r0, r12)
            X.C61592pw.A00(r12)
            X.00H r0 = r2.A03
            X.1OZ r0 = X.C17880vN.A0U(r0)
            r0.A0M(r1)
        L_0x0137:
            return
        L_0x0138:
            r7 = 0
            goto L_0x00ec
        L_0x013a:
            r0 = 2
            if (r1 != r0) goto L_0x007a
            X.1gM r2 = r7.A05
            r1 = 19
            goto L_0x0072
        L_0x0143:
            X.2RD r1 = X.AnonymousClass2RD.E2EE
            goto L_0x004a
        L_0x0147:
            X.1Mm r1 = r7.A04
            com.whatsapp.jobqueue.job.SendRetryReceiptJob r0 = new com.whatsapp.jobqueue.job.SendRetryReceiptJob
            r0.<init>(r6, r8, r5)
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58172kG.A00(int):void");
    }
}
