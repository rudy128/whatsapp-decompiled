package X;

/* renamed from: X.2Mt  reason: invalid class name and case insensitive filesystem */
public class C48512Mt extends C59662mg {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.2nR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.1ya} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C29621ca r25) {
        /*
            r24 = this;
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            r4 = r25
            com.whatsapp.jid.Jid r0 = r4.A0F(r1, r0)
            X.2lD r2 = new X.2lD
            r2.<init>()
            r2.A02 = r0
            java.lang.String r22 = "participant"
            r0 = r22
            com.whatsapp.jid.Jid r0 = r4.A0F(r1, r0)
            r2.A01 = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r0 = r4.A0F(r1, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r2.A03 = r0
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.A0P(r0)
            r2.A08 = r0
            java.lang.String r0 = "class"
            java.lang.String r0 = X.C29621ca.A02(r4, r0)
            r2.A06 = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = X.C29621ca.A02(r4, r0)
            r2.A09 = r0
            java.lang.String r21 = "edit"
            r0 = r21
            java.lang.String r0 = X.C29621ca.A02(r4, r0)
            r2.A07 = r0
            X.2nR r0 = r2.A00()
            java.lang.String r9 = "error"
            r7 = 0
            int r3 = r4.A0A(r9, r7)
            r2 = 459(0x1cb, float:6.43E-43)
            r1 = r24
            if (r3 != r2) goto L_0x0073
            X.37L r3 = r1.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "ConnectionThreadRequestsImpl/onAuthChallengeReceived; stanzaKey="
            X.C17900vP.A0Y(r0, r1, r2)
            X.3LB r2 = r3.A00
            android.os.Handler r2 = (android.os.Handler) r2
            r1 = 6
        L_0x006b:
            android.os.Message r0 = r2.obtainMessage(r1, r0)
            r0.sendToTarget()
            return
        L_0x0073:
            java.lang.String r2 = "message"
            java.lang.String r3 = r0.A06
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0238
            com.whatsapp.jid.UserJid r6 = r0.A03
            if (r6 != 0) goto L_0x0087
            com.whatsapp.jid.Jid r2 = r0.A02
            X.1BI r6 = X.C22971Dz.A00(r2)
        L_0x0087:
            boolean r2 = X.C22971Dz.A0M(r6)
            if (r2 == 0) goto L_0x00ad
            X.0ve r5 = r1.A02
            r3 = 11965(0x2ebd, float:1.6767E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r5, r3)
            if (r2 == 0) goto L_0x00ad
            boolean r2 = X.C22971Dz.A0M(r6)
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r6, r2)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            com.whatsapp.jid.UserJid r6 = X.C22971Dz.A03(r6)
        L_0x00aa:
            X.C17960vV.A07(r6)
        L_0x00ad:
            java.lang.String r3 = r0.A08
            X.C17960vV.A07(r3)
            r2 = 1
            X.205 r8 = X.AnonymousClass205.A01(r6, r3, r2)
            r10 = 0
            java.lang.String r11 = r4.A0Q(r9, r10)
            java.lang.String r20 = "phash"
            r2 = r20
            java.lang.String r9 = r4.A0Q(r2, r10)
            java.lang.String r19 = "count"
            r2 = r19
            java.lang.String r2 = r4.A0Q(r2, r10)
            int r18 = X.C20099A7c.A01(r2, r7)
            java.lang.String r2 = "t"
            java.lang.String r5 = r4.A0Q(r2, r10)
            r2 = 0
            long r2 = X.C20099A7c.A04(r5, r2)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            java.lang.String r2 = "server_id"
            java.lang.String r12 = r4.A0Q(r2, r10)
            r2 = -1
            long r2 = X.C20099A7c.A04(r12, r2)
            java.lang.String r17 = "addressing_mode"
            r12 = r17
            java.lang.String r13 = r4.A0Q(r12, r10)
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 == 0) goto L_0x0232
            r16 = r10
        L_0x00fd:
            java.lang.String r12 = "rcat"
            X.1ca r4 = r4.A0K(r12)
            if (r4 == 0) goto L_0x010d
            byte[] r10 = r4.A01
            r4 = 10
            java.lang.String r10 = android.util.Base64.encodeToString(r10, r4)
        L_0x010d:
            if (r11 != 0) goto L_0x01ef
            X.37L r15 = r1.A04
            com.whatsapp.jid.Jid r4 = r0.A01
            X.1E0 r11 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r14 = r11.A02(r4)
            com.whatsapp.jid.Jid r4 = r0.A02
            com.whatsapp.jid.DeviceJid r13 = r11.A02(r4)
            java.lang.String r12 = r0.A07
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r4 = "ConnectionThreadRequestsImpl/message-received-by-server; key="
            X.C17900vP.A0W(r8, r4, r11)
            r11.append(r14)
            java.lang.String r4 = "; remoteJid="
            r11.append(r4)
            r11.append(r13)
            java.lang.String r4 = "; serverParticipantHash="
            r11.append(r4)
            r11.append(r9)
            java.lang.String r4 = "; recipientCount="
            r11.append(r4)
            r4 = r18
            r11.append(r4)
            java.lang.String r4 = "; edit="
            r11.append(r4)
            r11.append(r12)
            java.lang.String r4 = "; timestamp="
            r11.append(r4)
            r11.append(r5)
            java.lang.String r4 = "; smId="
            X.C17900vP.A0m(r4, r11, r2)
            X.3LB r4 = r15.A00
            r23 = r4
            r11 = 19
            r4 = 0
            android.os.Message r11 = android.os.Message.obtain(r4, r7, r11, r7)
            android.os.Bundle r15 = r11.getData()
            java.lang.String r7 = "msgid"
            java.lang.String r4 = r8.A01
            r15.putString(r7, r4)
            android.os.Bundle r15 = r11.getData()
            X.1BI r4 = r8.A00
            java.lang.String r7 = X.C22971Dz.A06(r4)
            java.lang.String r4 = "remote_chat_jid"
            r15.putString(r4, r7)
            android.os.Bundle r7 = r11.getData()
            r4 = r22
            X.AnonymousClass2U5.A00(r7, r14, r4)
            android.os.Bundle r7 = r11.getData()
            java.lang.String r4 = "remoteJid"
            X.AnonymousClass2U5.A00(r7, r13, r4)
            android.os.Bundle r7 = r11.getData()
            r4 = r20
            r7.putString(r4, r9)
            android.os.Bundle r8 = r11.getData()
            r7 = r19
            r4 = r18
            r8.putInt(r7, r4)
            android.os.Bundle r7 = r11.getData()
            java.lang.String r4 = "timestamp"
            r7.putLong(r4, r5)
            android.os.Bundle r5 = r11.getData()
            java.lang.String r4 = "smid"
            r5.putLong(r4, r2)
            android.os.Bundle r3 = r11.getData()
            r2 = r21
            r3.putString(r2, r12)
            android.os.Bundle r3 = r11.getData()
            java.lang.String r2 = "counter_abuse_token"
            r3.putString(r2, r10)
            android.os.Bundle r4 = r11.getData()
            r3 = r16
            r2 = r17
            r4.putString(r2, r3)
            r2 = r23
            r2.CAe(r11)
        L_0x01dd:
            X.37L r3 = r1.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "ConnectionThreadRequestsImpl/onAckReceived; stanzaKey="
            X.C17900vP.A0Y(r0, r1, r2)
            X.3LB r2 = r3.A00
            android.os.Handler r2 = (android.os.Handler) r2
            r1 = 5
            goto L_0x006b
        L_0x01ef:
            int r4 = X.C20099A7c.A01(r11, r7)
            X.37L r5 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A01
            X.1E0 r3 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r6 = r3.A02(r2)
            com.whatsapp.jid.Jid r2 = r0.A02
            com.whatsapp.jid.DeviceJid r7 = r3.A02(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/message-error; key="
            X.C17900vP.A0W(r8, r2, r3)
            r3.append(r6)
            java.lang.String r2 = "; remoteJid="
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = "; code="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "; phash="
            X.C17900vP.A0f(r2, r9, r3)
            X.3LB r3 = r5.A00
            X.2fg r5 = new X.2fg
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r2 = 16
            X.C17890vO.A0p(r3, r5, r2)
            goto L_0x01dd
        L_0x0232:
            java.lang.String r16 = X.C42671yY.A00(r13)
            goto L_0x00fd
        L_0x0238:
            java.lang.String r2 = "receipt"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0350
            java.lang.String r9 = r0.A09
            java.lang.String r2 = "played"
            boolean r12 = r2.equals(r9)
            java.lang.String r11 = "played-self"
            java.lang.String r6 = "read"
            java.lang.String r10 = "server-error"
            if (r12 != 0) goto L_0x026b
            boolean r2 = r10.equals(r9)
            if (r2 != 0) goto L_0x026b
            boolean r2 = r6.equals(r9)
            if (r2 != 0) goto L_0x026b
            boolean r2 = r11.equals(r9)
            if (r2 != 0) goto L_0x026b
            java.lang.String r2 = "read-self"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x01dd
        L_0x026b:
            com.whatsapp.jid.Jid r3 = r0.A02
            X.1BI r2 = X.C22971Dz.A00(r3)
            boolean r2 = X.C22971Dz.A0O(r2)
            if (r2 == 0) goto L_0x0324
            com.whatsapp.jid.Jid r2 = r0.A01
            X.1BI r2 = X.C22971Dz.A00(r2)
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A00(r2)
        L_0x0281:
            java.lang.String r2 = r0.A08
            X.C17960vV.A07(r2)
            X.205 r8 = X.AnonymousClass205.A01(r8, r2, r7)
            if (r12 != 0) goto L_0x030c
            boolean r2 = r11.equals(r9)
            if (r2 != 0) goto L_0x030c
            boolean r2 = r10.equals(r9)
            if (r2 == 0) goto L_0x02cf
            X.37L r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/server-error-received-by-server "
            X.C17900vP.A0Y(r8, r2, r3)
            X.3LB r3 = r5.A00
            r2 = 1
            X.205[] r10 = new X.AnonymousClass205[r2]
            r10[r7] = r8
            X.1BI r7 = r8.A00
            r6 = 0
            r11 = 12
        L_0x02af:
            r12 = 0
            X.AVb r5 = new X.AVb
            r9 = r6
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2 = 262(0x106, float:3.67E-43)
            X.C17890vO.A0p(r3, r5, r2)
        L_0x02bd:
            java.lang.String r2 = "readreceipts"
            r5 = 0
            java.lang.String r2 = r4.A0Q(r2, r5)
            if (r2 == 0) goto L_0x01dd
            X.37L r3 = r1.A04
            r2 = 227(0xe3, float:3.18E-43)
            r3.A01(r4, r5, r2)
            goto L_0x01dd
        L_0x02cf:
            boolean r2 = r6.equals(r9)
            if (r2 == 0) goto L_0x02bd
            X.37L r6 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r5 = X.AnonymousClass1E0.A00(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/read-receipt-received-by-server "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " "
            X.C17900vP.A0Y(r5, r2, r3)
            X.3LB r6 = r6.A00
            android.os.Bundle r5 = X.C17880vN.A0D()
            java.lang.String r3 = "msgid"
            java.lang.String r2 = r8.A01
            r5.putString(r3, r2)
            X.1BI r2 = r8.A00
            java.lang.String r3 = X.C22971Dz.A06(r2)
            java.lang.String r2 = "remote_jid"
            r5.putString(r2, r3)
            r2 = 86
            X.C17890vO.A0o(r6, r5, r2)
            goto L_0x02bd
        L_0x030c:
            X.37L r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/playback-received-by-server "
            X.C17900vP.A0Y(r8, r2, r3)
            X.3LB r3 = r5.A00
            r2 = 1
            X.205[] r10 = new X.AnonymousClass205[r2]
            r10[r7] = r8
            X.1BI r7 = r8.A00
            r6 = 0
            r11 = 10
            goto L_0x02af
        L_0x0324:
            X.1BI r8 = X.C22971Dz.A00(r3)
            boolean r2 = X.C22971Dz.A0M(r8)
            if (r2 == 0) goto L_0x0281
            X.0ve r5 = r1.A02
            r3 = 11965(0x2ebd, float:1.6767E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r5, r3)
            if (r2 == 0) goto L_0x0281
            boolean r2 = X.C22971Dz.A0M(r8)
            if (r2 == 0) goto L_0x034b
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r8, r2)
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            com.whatsapp.jid.UserJid r8 = X.C22971Dz.A03(r8)
        L_0x034b:
            X.C17960vV.A07(r8)
            goto L_0x0281
        L_0x0350:
            java.lang.String r2 = "call"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01dd
            com.whatsapp.jid.Jid r8 = r0.A02
            X.C17960vV.A07(r8)
            X.1ca[] r6 = r4.A02
            if (r6 == 0) goto L_0x0372
            int r5 = r6.length
            com.whatsapp.protocol.VoipStanzaChildNode[] r11 = new com.whatsapp.protocol.VoipStanzaChildNode[r5]
            r3 = 0
        L_0x0365:
            if (r3 >= r5) goto L_0x0373
            r2 = r6[r3]
            com.whatsapp.protocol.VoipStanzaChildNode r2 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r2)
            r11[r3] = r2
            int r3 = r3 + 1
            goto L_0x0365
        L_0x0372:
            r11 = 0
        L_0x0373:
            java.lang.String r10 = r0.A09
            int r12 = r4.A0A(r9, r7)
            java.lang.String r9 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03c3 }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            if (r2 != 0) goto L_0x03bc
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            if (r2 != 0) goto L_0x03b5
            X.37L r4 = r1.A04     // Catch:{ IllegalArgumentException -> 0x03c3 }
            X.C17960vV.A07(r9)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            X.C17960vV.A07(r10)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            X.9fr r7 = new X.9fr     // Catch:{ IllegalArgumentException -> 0x03c3 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x03c3 }
            java.lang.String r2 = "ConnectionThreadRequestsImpl/on-call-incoming-ack type="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            java.lang.String r2 = r7.A03     // Catch:{ IllegalArgumentException -> 0x03c3 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            java.lang.String r2 = " from="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            com.whatsapp.jid.Jid r2 = r7.A01     // Catch:{ IllegalArgumentException -> 0x03c3 }
            X.C17900vP.A0b(r2, r3)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            X.3LB r3 = r4.A00     // Catch:{ IllegalArgumentException -> 0x03c3 }
            r2 = 193(0xc1, float:2.7E-43)
            X.C17890vO.A0o(r3, r7, r2)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            goto L_0x01dd
        L_0x03b5:
            java.lang.String r0 = "bad call incoming ack, missing type"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)     // Catch:{ IllegalArgumentException -> 0x03c3 }
            goto L_0x03c2
        L_0x03bc:
            java.lang.String r0 = "bad call incoming ack, missing id"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)     // Catch:{ IllegalArgumentException -> 0x03c3 }
        L_0x03c2:
            throw r0     // Catch:{ IllegalArgumentException -> 0x03c3 }
        L_0x03c3:
            r1 = move-exception
            java.lang.String r0 = "bad call incoming ack"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            r0.initCause(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48512Mt.A01(X.1ca):void");
    }
}
