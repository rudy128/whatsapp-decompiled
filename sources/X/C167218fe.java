package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.CallOfferInfo;

/* renamed from: X.8fe  reason: invalid class name and case insensitive filesystem */
public class C167218fe extends C167258fi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C19994A2h A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ CallOfferInfo A03;
    public final /* synthetic */ String A04;

    public C167218fe(C19994A2h a2h, DeviceJid deviceJid, CallOfferInfo callOfferInfo, String str, int i) {
        this.A01 = a2h;
        this.A04 = str;
        this.A03 = callOfferInfo;
        this.A02 = deviceJid;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022f, code lost:
        if (r2 == 8) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r1.A09 == 8) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        if (r9 == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0058, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r6.A07, 3362) < 1) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0E() {
        /*
            r38 = this;
            r1 = r38
            X.A2h r6 = r1.A01
            java.lang.String r5 = r1.A04
            com.whatsapp.voipcalling.CallOfferInfo r4 = r1.A03
            com.whatsapp.jid.DeviceJid r0 = r1.A02
            r19 = r0
            int r10 = r1.A00
            X.A99 r3 = r6.A03
            X.1TA r1 = r3.A2l
            java.lang.String r0 = X.C40811vJ.A0A(r5)
            X.2Q4 r0 = r1.A04(r0)
            boolean r2 = X.AnonymousClass000.A1W(r0)
            X.9hv r0 = r3.A0Q(r5)
            r0.A0G = r2
            boolean r0 = r4.isAudioChat
            if (r0 == 0) goto L_0x002f
            if (r2 == 0) goto L_0x002f
            X.1Vn r0 = r3.A2d
            r0.BES(r5)
        L_0x002f:
            X.A7S r11 = r3.A0T
            com.whatsapp.jid.UserJid r9 = r4.fromJid
            java.lang.String r8 = r4.callId
            long r0 = r4.epochTimeMillis
            boolean r7 = r4.isVideoCall
            r12 = r19
            r13 = r9
            r14 = r8
            r15 = r10
            r16 = r0
            r18 = r7
            X.9Bw r1 = r11.A04(r12, r13, r14, r15, r16, r18)
            com.whatsapp.jid.GroupJid r11 = r4.groupJid
            boolean r0 = r4.isAudioChat
            if (r0 == 0) goto L_0x005a
            X.0ve r8 = r6.A07
            r7 = 3362(0xd22, float:4.711E-42)
            X.0vf r0 = X.C18040vf.A02
            int r7 = X.C18020vd.A00(r0, r8, r7)
            r0 = 1
            r9 = 2
            if (r7 >= r0) goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            int r7 = r1.A07
            r0 = 3
            boolean r7 = X.AnonymousClass000.A1T(r7, r0)
            if (r7 == 0) goto L_0x0065
            r9 = 3
        L_0x0065:
            X.A7S r8 = r3.A0T
            java.lang.String r7 = r4.scheduledId
            r8.A08(r11, r1, r7, r9)
            X.A7S r8 = r3.A0T
            java.lang.String r12 = r4.callLinkToken
            X.2m4 r7 = r1.A0B
            if (r7 != 0) goto L_0x008d
            if (r12 == 0) goto L_0x008d
            X.A99 r7 = r8.A05
            r10 = 0
            X.1T9 r7 = r7.A2E
            X.2m4 r9 = r7.A02(r12)
            if (r9 != 0) goto L_0x008a
            long r7 = r7.A00(r10, r12)
            X.2m4 r9 = new X.2m4
            r9.<init>(r10, r12, r7)
        L_0x008a:
            r1.A0H(r9)
        L_0x008d:
            X.C178119Bw.A00(r1)
            int r8 = r1.A09
            r7 = 8
            if (r8 != r7) goto L_0x00ed
            X.C178119Bw.A00(r1)
            int r9 = r1.A09
        L_0x009b:
            r8 = 6
            if (r9 == r8) goto L_0x00a3
            r8 = 7
            if (r9 == r8) goto L_0x00a3
            if (r9 != r7) goto L_0x00a6
        L_0x00a3:
            r1.A0F(r0)
        L_0x00a6:
            r1.A0G(r9)
            int r8 = r1.A07
            boolean r8 = X.AnonymousClass000.A1T(r8, r0)
            if (r8 == 0) goto L_0x00c1
            int r10 = r1.A07
            if (r9 == r7) goto L_0x00bd
            X.C178119Bw.A00(r1)
            int r9 = r1.A09
            r8 = 2
            if (r9 != r7) goto L_0x00be
        L_0x00bd:
            r8 = 1
        L_0x00be:
            r3.A14(r5, r10, r8)
        L_0x00c1:
            X.2it r9 = r3.A2v
            X.4cT r8 = r1.A04
            com.whatsapp.jid.UserJid r8 = r8.A01
            java.lang.Integer r10 = X.AnonymousClass00R.A01
            boolean r8 = r9.A00(r8)
            if (r8 != 0) goto L_0x0108
            X.00H r8 = r3.A3F
            java.lang.Object r12 = r8.get()
            X.9XP r12 = (X.AnonymousClass9XP) r12
            android.content.ContentValues r13 = X.C17880vN.A08()
            long r8 = r1.A00
            java.lang.Long r9 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "call_log_row_id"
            r13.put(r8, r9)
            X.1Cd r8 = r12.A00
            X.1au r12 = r8.A05()
            goto L_0x00f0
        L_0x00ed:
            int r9 = r4.silenceReason
            goto L_0x009b
        L_0x00f0:
            r8 = r12
            X.1av r8 = (X.C28801av) r8     // Catch:{ all -> 0x00fe }
            X.1Ev r15 = r8.A02     // Catch:{ all -> 0x00fe }
            java.lang.String r14 = "call_unknown_caller"
            java.lang.String r9 = "CallUnknownCallerStore.markUnknown"
            r8 = 5
            r15.A09(r14, r9, r13, r8)     // Catch:{ all -> 0x00fe }
            goto L_0x0105
        L_0x00fe:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            X.CDX.A00(r12, r1)
            throw r0
        L_0x0105:
            r12.close()
        L_0x0108:
            X.A7S r9 = r3.A0T
            java.lang.String r8 = r4.scheduledId
            r9.A07(r11, r1, r8)
            boolean r8 = r4.isJoinableGroupCall()
            if (r8 == 0) goto L_0x014c
            com.whatsapp.voipcalling.CallGroupInfo r8 = r4.callGroupInfo
            X.C17960vV.A07(r8)
            com.whatsapp.voipcalling.CallParticipant[] r15 = r8.participants
            int r14 = r15.length
            r13 = 0
        L_0x011e:
            if (r13 >= r14) goto L_0x014c
            r8 = r15[r13]
            X.11S r12 = r3.A23
            com.whatsapp.jid.UserJid r9 = r8.jid
            boolean r9 = r12.A0O(r9)
            if (r9 == 0) goto L_0x0132
            boolean r9 = r3.A1F(r1)
            if (r9 == 0) goto L_0x0149
        L_0x0132:
            com.whatsapp.jid.UserJid r12 = r8.jid
            boolean r9 = r3.A1F(r1)
            if (r9 == 0) goto L_0x0145
            java.lang.String r9 = "connected"
            java.lang.String r8 = r8.state
            boolean r9 = r9.equals(r8)
            r8 = 5
            if (r9 != 0) goto L_0x0146
        L_0x0145:
            r8 = 2
        L_0x0146:
            r1.A0J(r12, r8)
        L_0x0149:
            int r13 = r13 + 1
            goto L_0x011e
        L_0x014c:
            if (r11 != 0) goto L_0x0163
            if (r2 != 0) goto L_0x0163
            r8 = r19
            com.whatsapp.jid.UserJid r9 = r8.userJid
            com.whatsapp.jid.UserJid r8 = r4.fromJid
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0163
            X.1VE r9 = r3.A2A
            com.whatsapp.jid.UserJid r8 = r4.fromJid
            r9.A06(r8, r5)
        L_0x0163:
            boolean r8 = r4.isJoinableGroupCall()
            r9 = 7
            if (r8 == 0) goto L_0x0218
            X.1RW r8 = r3.A2Y
            X.1RX r11 = r8.A00()
            com.whatsapp.jid.GroupJid r8 = r4.groupJid
            boolean r8 = r11.A01(r8)
            if (r8 != 0) goto L_0x0218
            X.0ve r12 = r6.A07
            r8 = 3362(0xd22, float:4.711E-42)
            X.0vf r11 = X.C18040vf.A02
            int r13 = X.C18020vd.A00(r11, r12, r8)
            r8 = 1
            if (r13 < r8) goto L_0x0218
            int r8 = r4.silenceReason
            if (r8 == r0) goto L_0x018d
            if (r8 == r7) goto L_0x018d
            if (r8 != r9) goto L_0x0218
        L_0x018d:
            com.whatsapp.jid.GroupJid r8 = r4.groupJid
            if (r8 == 0) goto L_0x01a7
            r8 = 7481(0x1d39, float:1.0483E-41)
            boolean r8 = X.C18020vd.A05(r11, r12, r8)
            if (r8 == 0) goto L_0x01a7
            X.1Nb r11 = r3.A2y
            com.whatsapp.jid.GroupJid r8 = r4.groupJid
            X.1yM r8 = r11.A0a(r8)
            boolean r8 = r8.A09()
            if (r8 != 0) goto L_0x0218
        L_0x01a7:
            X.1Vn r8 = r3.A2d
            X.73y r11 = r3.A2H
            r37 = r11
            android.content.Context r11 = r3.A1r
            r36 = r11
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            com.whatsapp.voipcalling.CallGroupInfo r11 = r4.callGroupInfo
            if (r11 == 0) goto L_0x01c9
            com.whatsapp.voipcalling.CallParticipant[] r15 = r11.participants
            int r14 = r15.length
            r13 = 0
        L_0x01bd:
            if (r13 >= r14) goto L_0x01c9
            r11 = r15[r13]
            com.whatsapp.jid.UserJid r11 = r11.jid
            r12.add(r11)
            int r13 = r13 + 1
            goto L_0x01bd
        L_0x01c9:
            java.lang.String r11 = r4.callId
            r20 = r11
            boolean r11 = r4.isAudioChat
            if (r11 == 0) goto L_0x0247
            com.whatsapp.voipcalling.CallState r19 = com.whatsapp.voipcalling.CallState.NONE
        L_0x01d3:
            com.whatsapp.jid.UserJid r15 = r4.fromJid
            com.whatsapp.jid.GroupJid r14 = r4.groupJid
            boolean r32 = r4.isJoinableGroupCall()
            int r13 = r4.silenceReason
            r26 = 0
            r27 = 1
            r24 = 0
            r22 = -1
            X.6xW r16 = new X.6xW
            r29 = r26
            r30 = r26
            r31 = r26
            r33 = r26
            r35 = r26
            r17 = r14
            r18 = r15
            r21 = r12
            r23 = r13
            r28 = r26
            r34 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.1V7 r11 = r3.A2J
            r12 = r37
            r13 = r36
            r14 = r16
            r15 = r11
            r16 = r27
            r17 = r26
            android.app.Notification r12 = r12.A06(r13, r14, r15, r16, r17)
            X.1Vo r8 = (X.AnonymousClass1Vo) r8
            r11 = 27
            r8.BkS(r5, r11, r12)
        L_0x0218:
            boolean r8 = r3.A47
            if (r8 != 0) goto L_0x0228
            boolean r8 = X.AnonymousClass8BT.A1Y(r5)
            if (r8 == 0) goto L_0x0228
            X.1Md r11 = r3.A2I
            r8 = 4
            r11.A04(r5, r8)
        L_0x0228:
            if (r2 == 0) goto L_0x0231
            int r2 = r4.silenceReason
            if (r2 == r9) goto L_0x0231
            r5 = 1
            if (r2 != r7) goto L_0x0232
        L_0x0231:
            r5 = 0
        L_0x0232:
            X.1TD r2 = r3.A2j
            r2.A0B(r1)
            int r2 = r1.A07
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)
            if (r0 == 0) goto L_0x024a
            X.C178119Bw.A00(r1)
            int r0 = r1.A09
            if (r0 == r7) goto L_0x024a
            return r1
        L_0x0247:
            com.whatsapp.voipcalling.CallState r19 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            goto L_0x01d3
        L_0x024a:
            boolean r0 = r1.A0W()
            if (r0 == 0) goto L_0x025b
            if (r5 == 0) goto L_0x025b
            X.0ve r0 = r6.A07
            boolean r0 = X.C40811vJ.A0P(r0)
            if (r0 == 0) goto L_0x025b
            return r1
        L_0x025b:
            X.0ve r4 = r6.A07
            X.0vf r2 = X.C18040vf.A01
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0279
            X.00H r0 = r3.A3H
            java.lang.Object r3 = r0.get()
            X.1yO r3 = (X.C42571yO) r3
            java.util.HashSet r2 = r1.A0C()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r3.A0G(r1, r0, r2)
            return r1
        L_0x0279:
            if (r5 != 0) goto L_0x027d
            java.lang.Integer r10 = X.AnonymousClass00R.A00
        L_0x027d:
            X.00H r0 = r3.A3H
            java.lang.Object r2 = r0.get()
            X.1yO r2 = (X.C42571yO) r2
            java.util.HashSet r0 = r1.A0C()
            r2.A0G(r1, r10, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167218fe.A0E():java.lang.Object");
    }
}
