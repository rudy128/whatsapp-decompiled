package X;

/* renamed from: X.AVi  reason: case insensitive filesystem */
public class C20702AVi implements C25471Oi {
    public final AnonymousClass11S A00;
    public final AnonymousClass1U5 A01;
    public final AnonymousClass10I A02;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r3 != r9) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r10.A0A(r13, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (r3 != r9) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5I Bvs(X.C166418cr r24, X.C63362sw r25, boolean r26) {
        /*
            r23 = this;
            r5 = r24
            X.8cG r1 = r5.messageContextInfo_
            if (r1 != 0) goto L_0x0008
            X.8cG r1 = X.C166048cG.DEFAULT_INSTANCE
        L_0x0008:
            r2 = r25
            com.whatsapp.jid.Jid r3 = r2.A04()
            com.whatsapp.jid.DeviceJid r4 = X.AnonymousClass1E0.A00(r3)
            if (r4 != 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AdvIncomingMessageListener/processIcdcData sender is not a userJid jid="
            X.C17900vP.A0X(r3, r0, r1)
        L_0x001d:
            X.AVd r0 = X.C20697AVd.A00
            return r0
        L_0x0020:
            if (r1 == 0) goto L_0x00e4
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00e4
            X.8c6 r8 = r1.deviceListMetadata_
        L_0x002a:
            if (r8 != 0) goto L_0x002e
            X.8c6 r8 = X.C165958c6.DEFAULT_INSTANCE
        L_0x002e:
            r5 = r23
            X.11S r1 = r5.A00
            com.whatsapp.jid.UserJid r0 = r4.userJid
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00de
            com.whatsapp.jid.UserJid r6 = r2.A0f
        L_0x003c:
            int r1 = r8.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r1)
            r15 = 0
            if (r0 == 0) goto L_0x00db
            X.DSQ r14 = r8.senderKeyHash_
        L_0x0047:
            long r2 = r8.senderTimestamp_
            int r0 = r8.senderAccountType_
            X.2RD r16 = X.AnonymousClass2RD.A00(r0)
            if (r16 != 0) goto L_0x0053
            X.2RD r16 = X.AnonymousClass2RD.E2EE
        L_0x0053:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0059
            X.DSQ r15 = r8.recipientKeyHash_
        L_0x0059:
            long r0 = r8.recipientTimestamp_
            X.EDj r7 = r8.recipientKeyIndexes_
            java.util.HashSet r18 = X.AnonymousClass8BR.A12(r7)
            int r7 = r8.receiverAccountType_
            X.2RD r17 = X.AnonymousClass2RD.A00(r7)
            if (r17 != 0) goto L_0x006b
            X.2RD r17 = X.AnonymousClass2RD.E2EE
        L_0x006b:
            X.9ge r13 = new X.9ge
            r19 = r2
            r21 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)
            X.1U5 r10 = r5.A01
            com.whatsapp.jid.UserJid r11 = r4.userJid
            X.2RD r9 = r13.A04
            X.2RD r12 = X.AnonymousClass2RD.HOSTED
            if (r9 == r12) goto L_0x0099
            X.2RD r0 = r13.A05
            if (r0 == r12) goto L_0x0099
        L_0x0082:
            X.10I r2 = r5.A02
            r12 = 29
            X.3Cr r7 = new X.3Cr
            r8 = r5
            r9 = r13
            r10 = r4
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (int) r12)
            java.lang.String r1 = "AdvIncomingMessageListener/processIcdcData"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.CGF(r7)
            goto L_0x001d
        L_0x0099:
            if (r6 == 0) goto L_0x00bc
            X.11S r0 = r10.A02
            boolean r0 = r0.A0O(r6)
            if (r0 != 0) goto L_0x00bc
            if (r9 != r12) goto L_0x00bc
            X.1MR r0 = r10.A09
            X.2RD r3 = r0.A06(r6)
            long r7 = r0.A01(r6)
            long r0 = r13.A00
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bc
            if (r3 == r9) goto L_0x00bc
        L_0x00b7:
            r10.A0A(r13, r4, r6)
            goto L_0x001d
        L_0x00bc:
            X.11S r0 = r10.A02
            boolean r0 = r0.A0O(r11)
            if (r0 != 0) goto L_0x0082
            X.2RD r9 = r13.A05
            if (r9 != r12) goto L_0x0082
            X.1MR r0 = r10.A09
            X.2RD r3 = r0.A06(r11)
            long r7 = r0.A01(r11)
            long r1 = r13.A01
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            if (r3 == r9) goto L_0x0082
            goto L_0x00b7
        L_0x00db:
            r14 = r15
            goto L_0x0047
        L_0x00de:
            com.whatsapp.jid.PhoneUserJid r6 = X.AnonymousClass11S.A00(r1)
            goto L_0x003c
        L_0x00e4:
            int r1 = r5.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x0138
            X.8a1 r0 = r5.deviceSentMessage_
            r3 = r0
            if (r0 != 0) goto L_0x00f6
            X.8a1 r0 = X.C164758a1.DEFAULT_INSTANCE
        L_0x00f6:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x00fc
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x00fc:
            int r1 = r0.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x0138
            if (r3 != 0) goto L_0x010b
            X.8a1 r3 = X.C164758a1.DEFAULT_INSTANCE
        L_0x010b:
            X.8cr r0 = r3.message_
            if (r0 != 0) goto L_0x0111
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0111:
            X.8cG r0 = r0.messageContextInfo_
            if (r0 != 0) goto L_0x0117
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
        L_0x0117:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "AdvIncomingMessageListener/processIcdcData in deviceSentMessage!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8a1 r0 = r5.deviceSentMessage_
            if (r0 != 0) goto L_0x0128
            X.8a1 r0 = X.C164758a1.DEFAULT_INSTANCE
        L_0x0128:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x012e
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x012e:
            X.8cG r0 = r0.messageContextInfo_
            if (r0 != 0) goto L_0x0134
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
        L_0x0134:
            X.8c6 r8 = r0.deviceListMetadata_
            goto L_0x002a
        L_0x0138:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AdvIncomingMessageListener/processIcdcData no icdc data, sender="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; chatJid="
            r1.append(r0)
            X.1BI r0 = r2.A03()
            X.AnonymousClass8BW.A1N(r0, r1)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20702AVi.Bvs(X.8cr, X.2sw, boolean):X.B5I");
    }

    public C20702AVi(AnonymousClass11S r1, AnonymousClass1U5 r2, AnonymousClass10I r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BSr() {
        return "AdvIncomingMessageListener";
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }
}
