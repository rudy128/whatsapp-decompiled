package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Cc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70683Cc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AnonymousClass206 A03;
    public final /* synthetic */ AnonymousClass205 A04;
    public final /* synthetic */ C60132nR A05;
    public final /* synthetic */ C35591mU A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ byte[] A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cf, code lost:
        if (r2.A0E.A0A(r0.userJid).contains(r0) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0186, code lost:
        if (r15 != false) goto L_0x0188;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r51 = this;
            r8 = r51
            X.1mU r2 = r8.A06
            X.2nR r10 = r8.A05
            X.205 r1 = r8.A04
            X.206 r7 = r8.A03
            boolean r9 = r8.A09
            int r6 = r8.A00
            java.lang.Integer r0 = r8.A07
            r20 = r0
            boolean r13 = r8.A0A
            long r4 = r8.A01
            byte[] r0 = r8.A0B
            r19 = r0
            com.whatsapp.jid.UserJid r3 = r8.A02
            boolean r0 = r8.A08
            r18 = r0
            com.whatsapp.jid.Jid r0 = r10.A02
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r0)
            X.C17960vV.A07(r0)
            java.lang.String r17 = "RetryReceiptHandler/axolotl unable to resend "
            r11 = 0
            if (r7 != 0) goto L_0x004f
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r17)
            r4.append(r1)
            java.lang.String r3 = "; message gone"
            X.C17890vO.A1B(r4, r3)
            X.1PT r4 = r2.A0I
            java.lang.String r2 = r10.A07
            int r14 = X.C20099A7c.A01(r2, r11)
        L_0x0042:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
        L_0x0046:
            r8 = r4
            r9 = r0
            r10 = r7
            r11 = r1
            r13 = r6
            r8.A0A(r9, r10, r11, r12, r13, r14)
            return
        L_0x004f:
            boolean r8 = r7 instanceof X.AnonymousClass213
            if (r8 == 0) goto L_0x00d2
            X.1hb r12 = r2.A09
            r8 = r7
            X.213 r8 = (X.AnonymousClass213) r8
            X.206 r8 = r12.A01(r8)
            X.1Qe r12 = r2.A0G
            r12.A05(r8)
        L_0x0061:
            X.1Qw r12 = r2.A0B
            java.util.Set r14 = r12.A03(r1)
            boolean r15 = r14.contains(r0)
            r12 = 1
            r16 = r15 ^ 1
            com.whatsapp.jid.UserJid r15 = r0.userJid
            boolean r15 = X.C42701yb.A01(r15)
            if (r16 == 0) goto L_0x00d4
            if (r15 != 0) goto L_0x00d4
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "RetryReceiptHandler/MessagingXmppHandler/onMessageDecryptionFailureRetry/Not processing retry for "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = " since isn't an originally intended recipient"
            X.C17890vO.A1B(r4, r3)
            int r3 = r0.getDevice()
            r8 = 0
            if (r3 != 0) goto L_0x00c3
            r8 = 1
        L_0x0091:
            X.1PT r5 = r2.A0I
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r18)
            X.2F8 r4 = new X.2F8
            r4.<init>()
            r4.A00 = r3
            r3 = 2
            if (r8 == 0) goto L_0x00a2
            r3 = 1
        L_0x00a2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.A01 = r3
            X.18K r3 = r5.A0C
            r3.CC7(r4)
        L_0x00ad:
            com.whatsapp.jid.UserJid r3 = r0.userJid
            com.whatsapp.jid.DeviceJid r3 = r3.getPrimaryDevice()
            boolean r3 = r14.contains(r3)
            X.1PT r4 = r2.A0I
            java.lang.String r2 = r10.A07
            int r14 = X.C20099A7c.A01(r2, r11)
            if (r3 != 0) goto L_0x0042
            r11 = 2
            goto L_0x0042
        L_0x00c3:
            X.1MR r4 = r2.A0E
            com.whatsapp.jid.UserJid r3 = r0.userJid
            java.util.HashSet r3 = r4.A0A(r3)
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L_0x00ad
            goto L_0x0091
        L_0x00d2:
            r8 = r7
            goto L_0x0061
        L_0x00d4:
            if (r9 == 0) goto L_0x00fe
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "RetryReceiptHandler/axolotl original message already marked delivered; message.key="
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = ", remoteJid="
            X.C17900vP.A0Z(r0, r3, r4)
            X.1PT r4 = r2.A0I
            java.lang.String r2 = "7"
            java.lang.String r3 = r10.A07
            boolean r2 = r2.equalsIgnoreCase(r3)
            r4.A0B(r0, r1, r6, r2)
            int r14 = X.C20099A7c.A01(r3, r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0046
        L_0x00fe:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r10 = "RetryReceiptHandler/axolotl resending "
            r11.append(r10)
            r11.append(r1)
            java.lang.String r9 = " Recipient="
            X.C17900vP.A0Y(r3, r9, r11)
            r8.A0B = r6
            if (r13 != 0) goto L_0x0146
            if (r15 != 0) goto L_0x0146
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r10)
            r6.append(r1)
            java.lang.String r1 = " immediately"
            X.C17890vO.A1A(r6, r1)
            X.00H r1 = r2.A0U
            java.lang.Object r6 = r1.get()
            X.11y r6 = (X.C203911y) r6
            X.11P r1 = r6.A08
            X.6k3 r2 = new X.6k3
            r2.<init>(r1, r8)
            r2.A01 = r4
            r2.A03 = r0
            r2.A04 = r3
            long r0 = X.AnonymousClass11P.A01(r1)
            r2.A00 = r0
            X.6tv r1 = new X.6tv
            r1.<init>(r2)
            r0 = 0
            X.C203911y.A00(r6, r1, r0, r0)
            return
        L_0x0146:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r9 = "axolotl reinjecting send e2e job; originalMessageKey="
            X.C17900vP.A0Y(r1, r9, r10)
            X.8X8 r14 = X.C166418cr.A00()
            X.205 r7 = r7.A0v     // Catch:{ 1T8 -> 0x0224 }
            X.1BI r9 = r7.A00     // Catch:{ 1T8 -> 0x0224 }
            X.1M9 r7 = r2.A04     // Catch:{ 1T8 -> 0x0224 }
            java.lang.Integer r11 = X.AnonymousClass9AU.A01(r7, r9)     // Catch:{ 1T8 -> 0x0224 }
            X.00H r7 = r2.A0P     // Catch:{ 1T8 -> 0x0224 }
            java.lang.Object r10 = r7.get()     // Catch:{ 1T8 -> 0x0224 }
            X.12N r10 = (X.AnonymousClass12N) r10     // Catch:{ 1T8 -> 0x0224 }
            X.9n5 r9 = X.C181349Qd.A00(r14)     // Catch:{ 1T8 -> 0x0224 }
            X.1cl r7 = r8.A0J()     // Catch:{ 1T8 -> 0x0224 }
            r9.A00 = r7     // Catch:{ 1T8 -> 0x0224 }
            r9.A02 = r12     // Catch:{ 1T8 -> 0x0224 }
            r9.A01 = r11     // Catch:{ 1T8 -> 0x0224 }
            X.A2m r7 = r9.A00()     // Catch:{ 1T8 -> 0x0224 }
            r10.A01(r7, r8)     // Catch:{ 1T8 -> 0x0224 }
            X.11P r7 = r2.A05
            long r34 = X.AnonymousClass11P.A01(r7)
            boolean r9 = r0.isProtocolCompliant()
            if (r9 == 0) goto L_0x0215
            if (r15 == 0) goto L_0x0212
        L_0x0188:
            X.0zA r10 = r2.A00
            boolean r9 = r10.A07()
            if (r9 == 0) goto L_0x0212
            java.lang.Object r10 = r10.A03()
            X.1PW r10 = (X.AnonymousClass1PW) r10
            java.util.List r9 = r8.A0h
            com.whatsapp.jid.UserJid r18 = r10.A03(r9)
        L_0x019c:
            java.lang.String r13 = r1.A01
            X.Bm6 r1 = r14.A0C()
            X.8cr r1 = (X.C166418cr) r1
            java.util.Set r26 = java.util.Collections.emptySet()
            X.0zA r12 = r2.A01
            r15 = 0
            X.C17960vV.A07(r13)
            X.C17960vV.A07(r0)
            X.C17960vV.A07(r1)
            X.C17960vV.A07(r26)
            X.C17960vV.A07(r12)
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r34 = r34 + r9
            int r11 = r8.A0u
            long r40 = r8.A0G()
            int r10 = r8.A01
            long r32 = android.os.SystemClock.uptimeMillis()
            long r36 = X.AnonymousClass11P.A01(r7)
            X.0ve r9 = r2.A0F
            r8 = 11303(0x2c27, float:1.5839E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r50 = X.C18020vd.A05(r7, r9, r8)
            r42 = 0
            com.whatsapp.jobqueue.job.SendE2EMessageJob r7 = new com.whatsapp.jobqueue.job.SendE2EMessageJob
            r23 = r15
            r24 = r15
            r25 = r15
            r28 = r15
            r44 = r42
            r45 = r42
            r46 = r42
            r47 = r42
            r48 = r42
            r49 = r42
            r21 = r13
            r22 = r15
            r27 = r19
            r29 = r11
            r30 = r6
            r31 = r10
            r38 = r4
            r43 = r42
            r13 = r7
            r14 = r12
            r16 = r0
            r17 = r3
            r19 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            X.1Mm r0 = r2.A03
            r0.A01(r7)
            return
        L_0x0212:
            r18 = 0
            goto L_0x019c
        L_0x0215:
            if (r15 != 0) goto L_0x0188
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r17)
            r2.append(r1)
            java.lang.String r1 = "; jid is invalid: "
            X.C17900vP.A0Y(r0, r1, r2)
            return
        L_0x0224:
            r1 = move-exception
            java.lang.String r0 = "RetryReceiptHandler/axolotl invalid message"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70683Cc.run():void");
    }

    public /* synthetic */ C70683Cc(UserJid userJid, AnonymousClass206 r2, AnonymousClass205 r3, C60132nR r4, C35591mU r5, Integer num, byte[] bArr, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A09 = z;
        this.A00 = i;
        this.A07 = num;
        this.A0A = z2;
        this.A01 = j;
        this.A0B = bArr;
        this.A02 = userJid;
        this.A08 = z3;
    }
}
