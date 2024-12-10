package X;

/* renamed from: X.1gJ  reason: invalid class name and case insensitive filesystem */
public class C31901gJ implements AnonymousClass1RJ {
    public final AnonymousClass1V7 A00;
    public final C31891gI A01;
    public final C18030ve A02;
    public final C219017v A03;

    public int[] BSG() {
        return new int[]{150, 192, 193, 197};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        if (r1 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BcT(android.os.Message r20, int r21) {
        /*
            r19 = this;
            r0 = 150(0x96, float:2.1E-43)
            r3 = 1
            r2 = r19
            r4 = r20
            r1 = r21
            if (r1 == r0) goto L_0x008a
            r0 = 197(0xc5, float:2.76E-43)
            if (r1 == r0) goto L_0x008a
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 == r0) goto L_0x0019
            r0 = 193(0xc1, float:2.7E-43)
            if (r1 == r0) goto L_0x008a
            r0 = 0
            return r0
        L_0x0019:
            java.lang.Object r7 = r4.obj
            X.97K r7 = (X.AnonymousClass97K) r7
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r7.A01
            java.lang.String r1 = r0.tag
            java.lang.String r0 = "terminate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0032
            X.17v r0 = r2.A03
            X.1cu r1 = r0.A0e
            r0 = 4
            X.C29811cu.A01(r1, r0)
        L_0x0032:
            com.whatsapp.protocol.VoipStanzaChildNode r11 = r7.A01
            java.lang.String r0 = r11.tag
            java.lang.String r8 = "offer"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008a
            X.0ve r1 = r2.A02
            X.0vf r6 = X.C18040vf.A01
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x008a
            X.1gI r5 = r2.A01
            java.lang.String r0 = r11.tag
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 == 0) goto L_0x008a
            com.whatsapp.jid.Jid r1 = r7.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x0158
            r10 = r1
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
            if (r10 == 0) goto L_0x0158
            com.whatsapp.voipcalling.CallOfferInfo[] r9 = new com.whatsapp.voipcalling.CallOfferInfo[r3]
            java.lang.String r12 = r7.A08
            java.lang.String r13 = r7.A06
            long r14 = r7.A01
            long r0 = r7.A00
            boolean r7 = r7.A09
            r18 = r7
            r16 = r0
            int r1 = com.whatsapp.voipcalling.Voip.nativeParseXmppOffer(r9, r10, r11, r12, r13, r14, r16, r18)
            if (r1 == 0) goto L_0x009f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "voip/service/parseIncomingOfferStanza: Voip.nativeParseXmppOffer failed: "
            r5.append(r0)
            r5.append(r1)
        L_0x0083:
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008a:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            android.os.Message r4 = android.os.Message.obtain(r4)
            X.1V7 r2 = r2.A00
            java.lang.String r1 = "receive_message"
            X.A69 r0 = new X.A69
            r0.<init>((android.os.Message) r4, (java.lang.String) r1)
            r2.A00(r0)
            return r3
        L_0x009f:
            r0 = 0
            r10 = r9[r0]
            X.C17960vV.A07(r10)
            if (r10 == 0) goto L_0x008a
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            boolean r0 = r10.isJoinableGroupCall()
            if (r0 == 0) goto L_0x00d5
            com.whatsapp.voipcalling.CallGroupInfo r0 = r10.callGroupInfo
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.voipcalling.CallParticipant[] r9 = r0.participants
            X.C18070vi.A0W(r9)
            int r8 = r9.length
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            r1 = 0
        L_0x00c6:
            if (r1 >= r8) goto L_0x00d2
            r0 = r9[r1]
            com.whatsapp.jid.UserJid r0 = r0.jid
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x00c6
        L_0x00d2:
            r13.addAll(r7)
        L_0x00d5:
            X.00H r7 = r5.A00
            java.lang.Object r12 = r7.get()
            X.1yO r12 = (X.C42571yO) r12
            java.lang.String r11 = r10.callId
            X.C18070vi.A0W(r11)
            com.whatsapp.jid.UserJid r8 = r10.fromJid
            com.whatsapp.jid.GroupJid r1 = r10.groupJid
            r9 = 0
            int r0 = r13.size()
            int r0 = r0 - r3
            if (r0 > r3) goto L_0x0140
            if (r1 != 0) goto L_0x0152
        L_0x00f0:
            X.1NG r0 = r12.A06
            X.1BI r0 = r0.A01(r8)
            X.205 r8 = new X.205
            r8.<init>(r0, r11, r9)
        L_0x00fb:
            java.util.HashSet r9 = r5.A01
            boolean r0 = r9.contains(r8)
            if (r0 != 0) goto L_0x008a
            java.lang.Object r7 = r7.get()
            X.1yO r7 = (X.C42571yO) r7
            com.whatsapp.jid.UserJid r5 = r10.fromJid
            X.0ve r1 = r7.A07
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x013b
            X.00H r0 = r7.A0B
            java.lang.Object r7 = r0.get()
            X.9fd r7 = (X.C187329fd) r7
            r0 = 98
            X.23x r6 = new X.23x
            r6.<init>(r8, r0, r14)
            r6.A0d(r5)
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0S = r0
            X.1ks r5 = r7.A01
            r1 = 36
            X.7R0 r0 = new X.7R0
            r0.<init>(r7, r6, r8, r1)
            r5.A00(r0)
        L_0x013b:
            r9.add(r8)
            goto L_0x008a
        L_0x0140:
            if (r1 != 0) goto L_0x0152
            X.1VE r1 = r12.A01
            com.whatsapp.jid.UserJid r0 = r1.A02(r11)
            if (r0 != 0) goto L_0x0150
            if (r8 == 0) goto L_0x00f0
            r1.A06(r8, r11)
            goto L_0x00f0
        L_0x0150:
            r8 = r0
            goto L_0x00f0
        L_0x0152:
            X.205 r8 = new X.205
            r8.<init>(r1, r11, r9)
            goto L_0x00fb
        L_0x0158:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "voip/receive_message/call-offer dropping stanza: invalid fromJid: "
            r5.append(r0)
            r5.append(r1)
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31901gJ.BcT(android.os.Message, int):boolean");
    }

    public C31901gJ(C31891gI r1, AnonymousClass1V7 r2, C18030ve r3, C219017v r4) {
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
