package X;

import java.util.Map;

/* renamed from: X.2Mp  reason: invalid class name and case insensitive filesystem */
public class C48472Mp extends C48532Mv {
    public final AnonymousClass11P A00;
    public final C31441fZ A01;

    public C48472Mp(AnonymousClass190 r11, AnonymousClass11P r12, C18030ve r13, AnonymousClass18K r14, AnonymousClass37L r15, C31641ft r16, AnonymousClass1OZ r17, C31441fZ r18, C31411fW r19, Map map) {
        super(r11, r13, r14, r15, r16, r17, r19, map);
        this.A00 = r12;
        this.A01 = r18;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C29621ca r44, java.lang.Integer r45, java.util.Map r46) {
        /*
            r43 = this;
            long r41 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "offline"
            r3 = 0
            r4 = r44
            java.lang.String r0 = r4.A0Q(r0, r3)
            r1 = 0
            r9 = 0
            if (r0 == 0) goto L_0x0027
            r9 = 1
            java.lang.Integer r35 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0017 }
            goto L_0x0029
        L_0x0017:
            r5 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "connection/handleNotification: got bad offline="
            r2.append(r0)
            r2.append(r9)
            X.C17880vN.A1M(r2, r5)
        L_0x0027:
            r35 = 0
        L_0x0029:
            java.lang.String r0 = "e"
            java.lang.String r0 = r4.A0Q(r0, r3)
            if (r0 == 0) goto L_0x009d
            int r16 = java.lang.Integer.parseInt(r0)
        L_0x0035:
            java.lang.String r0 = "t"
            java.lang.String r0 = r4.A0Q(r0, r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x009a
            long r26 = java.lang.Long.parseLong(r0)
            long r26 = r26 * r5
        L_0x0046:
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r2 = r4.A0G(r2, r0)
            boolean r0 = X.C22971Dz.A0P(r2)
            if (r0 == 0) goto L_0x01c8
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x0060
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            com.whatsapp.jid.DeviceJid r2 = r2.getPrimaryDevice()
        L_0x0060:
            java.lang.String r0 = "id"
            java.lang.String r15 = r4.A0P(r0)
            java.lang.String r0 = "platform"
            java.lang.String r23 = r4.A0Q(r0, r3)
            java.lang.String r0 = "version"
            java.lang.String r24 = r4.A0Q(r0, r3)
            X.1ca r3 = r4.A0J(r1)
            if (r3 == 0) goto L_0x01c1
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "reminder"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "bcall_"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "call-id"
            java.lang.String r22 = X.C29621ca.A02(r3, r0)
            if (r22 != 0) goto L_0x00a2
            java.lang.String r0 = "no call-id in the payload of incoming <call> node"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x009a:
            r26 = 0
            goto L_0x0046
        L_0x009d:
            r16 = 0
            goto L_0x0035
        L_0x00a0:
            java.lang.String r22 = ""
        L_0x00a2:
            java.lang.String r0 = "notify"
            java.lang.String r25 = X.C29621ca.A02(r4, r0)
            r10 = r43
            X.1fZ r0 = r10.A01
            java.util.concurrent.atomic.AtomicLong r5 = r0.A06
            long r39 = r5.getAndIncrement()
            X.11P r12 = r0.A01
            X.0ve r11 = r0.A02
            X.190 r8 = r0.A00
            X.18K r7 = r0.A03
            X.1N7 r6 = r0.A04
            X.00H r0 = r0.A05
            java.lang.Object r5 = r0.get()
            X.1CP r5 = (X.AnonymousClass1CP) r5
            X.8vL r0 = new X.8vL
            r36 = r45
            r28 = r0
            r29 = r8
            r30 = r12
            r31 = r5
            r32 = r11
            r33 = r7
            r34 = r6
            r37 = r15
            r38 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41)
            r6.A04(r0)
            long r11 = r0.A03
            X.2lD r6 = new X.2lD
            r6.<init>()
            r6.A02 = r2
            java.lang.String r5 = "call"
            r6.A06 = r5
            r6.A08 = r15
            r6.A09 = r1
            r6.A00 = r11
            X.2nR r14 = r6.A00()
            com.whatsapp.protocol.VoipStanzaChildNode r13 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r3)
            java.lang.Class<com.whatsapp.jid.DeviceJid> r7 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r5 = "call-creator"
            com.whatsapp.jid.Jid r5 = r3.A0F(r7, r5)
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            boolean r6 = X.C22971Dz.A0X(r2)
            if (r6 == 0) goto L_0x01be
            java.lang.Class<X.1E2> r8 = X.AnonymousClass1E2.class
            java.lang.String r6 = "sender_lid"
            com.whatsapp.jid.Jid r4 = r4.A0F(r8, r6)
            X.1E2 r4 = (X.AnonymousClass1E2) r4
        L_0x0116:
            java.lang.String r8 = r13.tag
            java.lang.String r6 = "offer"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01bb
            boolean r6 = X.C22971Dz.A0T(r5)
            if (r6 == 0) goto L_0x01bb
            java.lang.String r6 = "caller_pn"
            com.whatsapp.jid.Jid r6 = r3.A0F(r7, r6)
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
        L_0x012e:
            long r28 = X.C17890vO.A03(r16)
            X.97K r3 = new X.97K
            r30 = r11
            r32 = r9
            r19 = r4
            r20 = r13
            r21 = r15
            r17 = r6
            r18 = r2
            r16 = r5
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32)
            r2 = 2
            r0.A05(r2)
            X.37L r5 = r10.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-incoming-stanza tag="
            r2.append(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r4 = r3.A01
            java.lang.String r0 = r4.tag
            r2.append(r0)
            java.lang.String r0 = " from="
            r2.append(r0)
            com.whatsapp.jid.Jid r0 = r3.A00
            r2.append(r0)
            java.lang.String r0 = " callId="
            r2.append(r0)
            java.lang.String r0 = r3.A02
            X.C17890vO.A1A(r2, r0)
            X.3LB r2 = r5.A00
            r0 = 192(0xc0, float:2.69E-43)
            X.C17890vO.A0o(r2, r3, r0)
            boolean r0 = X.AnonymousClass97K.A00(r1)
            if (r0 != 0) goto L_0x01b8
            java.util.Map r2 = X.C173598vL.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r2.get(r1)
            X.C17960vV.A07(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
        L_0x0192:
            java.lang.Integer r37 = java.lang.Integer.valueOf(r0)
        L_0x0196:
            java.lang.Integer r36 = X.C17880vN.A0j()
            r38 = 0
            r40 = r38
            r41 = r38
            r34 = r10
            r39 = r38
            r34.A02(r35, r36, r37, r38, r39, r40, r41)
            java.lang.String r0 = r4.tag
            boolean r0 = X.AnonymousClass97K.A00(r0)
            if (r0 == 0) goto L_0x01b4
            X.1OZ r0 = r10.A01
            r0.A0K(r14)
        L_0x01b4:
            return
        L_0x01b5:
            r0 = 18
            goto L_0x0192
        L_0x01b8:
            r37 = 0
            goto L_0x0196
        L_0x01bb:
            r6 = 0
            goto L_0x012e
        L_0x01be:
            r4 = 0
            goto L_0x0116
        L_0x01c1:
            java.lang.String r0 = "no payload of incoming <call> node"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x01c8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallStanza from invalid jid "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48472Mp.A04(X.1ca, java.lang.Integer, java.util.Map):void");
    }
}
