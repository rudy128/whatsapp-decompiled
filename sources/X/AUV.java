package X;

public abstract class AUV implements C22511BAs {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0158 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1A(X.C195629te r35, X.AnonymousClass8X1 r36, X.AnonymousClass206 r37) {
        /*
            r34 = this;
            r1 = r37
            r7 = 0
            r13 = r36
            boolean r23 = X.C18070vi.A17(r1, r13)
            r6 = 2
            r8 = r35
            X.C18070vi.A0d(r8, r6)
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x0266
            int r2 = r1.A0u
            r5 = r34
            boolean r4 = r5 instanceof X.C167008fD
            if (r4 == 0) goto L_0x0248
            r0 = 92
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)
        L_0x0021:
            if (r0 == 0) goto L_0x0266
            if (r4 == 0) goto L_0x0254
            r0 = 32
        L_0x0027:
            boolean r0 = r1.A10(r0)
            if (r0 == 0) goto L_0x0266
            boolean r3 = r5 instanceof X.C167028fF
            if (r3 == 0) goto L_0x0240
            r0 = r5
            X.8fF r0 = (X.C167028fF) r0
            boolean r0 = r0.A00(r8, r1)
            r0 = r0 ^ 1
        L_0x003a:
            if (r0 == 0) goto L_0x0266
        L_0x003c:
            if (r4 == 0) goto L_0x0213
            X.23z r1 = (X.C445823z) r1
            java.util.List r0 = r1.A18()
        L_0x0044:
            if (r0 == 0) goto L_0x0266
            java.util.Iterator r15 = r0.iterator()
        L_0x004a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.Object r2 = r15.next()
            X.212 r2 = (X.AnonymousClass212) r2
            X.8c2 r0 = X.C165938c2.DEFAULT_INSTANCE
            X.Bmt r14 = r0.A0N()
            X.8X7 r0 = X.A3J.A00(r2)
            X.Bm6 r1 = X.C17880vN.A0G(r14)
            X.8c2 r1 = (X.C165938c2) r1
            X.8cq r0 = X.AnonymousClass8BU.A0Y(r0)
            r1.messageAddOnKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            if (r4 == 0) goto L_0x0201
            X.9KP r0 = X.AnonymousClass9KP.EVENT_RESPONSE
        L_0x0076:
            X.Bm6 r1 = X.C17880vN.A0G(r14)
            X.8c2 r1 = (X.C165938c2) r1
            int r0 = r0.value
            r1.messageAddOnType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            long r0 = r2.A03
            r11 = 0
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x009c
            X.Bm6 r10 = X.C17880vN.A0G(r14)
            X.8c2 r10 = (X.C165938c2) r10
            int r9 = r10.bitField0_
            r9 = r9 | 8
            r10.bitField0_ = r9
            r10.serverTimestampMs_ = r0
        L_0x009c:
            long r0 = r2.A0I
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x00b0
            X.Bm6 r10 = X.C17880vN.A0G(r14)
            X.8c2 r10 = (X.C165938c2) r10
            int r9 = r10.bitField0_
            r9 = r9 | 4
            r10.bitField0_ = r9
            r10.senderTimestampMs_ = r0
        L_0x00b0:
            int r1 = r2.A0D()
            r0 = 17
            if (r1 != r0) goto L_0x01fd
            X.9KS r0 = X.AnonymousClass9KS.READ
        L_0x00ba:
            X.Bm6 r1 = X.C17880vN.A0G(r14)
            X.8c2 r1 = (X.C165938c2) r1
            int r0 = r0.value
            r1.status_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            X.8WA r0 = X.A3J.A01(r2)
            if (r0 == 0) goto L_0x00e7
            X.Bm6 r1 = X.C17880vN.A0G(r14)
            X.8c2 r1 = (X.C165938c2) r1
            X.Bm6 r0 = r0.A0C()
            X.8Zj r0 = (X.C164578Zj) r0
            r0.getClass()
            r1.addOnContextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
        L_0x00e7:
            if (r4 == 0) goto L_0x015d
            X.8cg r0 = X.C166308cg.DEFAULT_INSTANCE
            X.Bmt r9 = r0.A0N()
            X.8Wq r9 = (X.C163868Wq) r9
            r1 = r2
            X.24H r1 = (X.AnonymousClass24H) r1
            X.2Qx r0 = r1.A02
            if (r0 == 0) goto L_0x019c
            X.9K9 r0 = X.C196689vT.A00(r0)
            r9.A0H(r0)
            long r0 = r1.A01
            r9.A0G(r0)
            X.8Zi r0 = X.C164568Zi.DEFAULT_INSTANCE
            X.Bmt r10 = r0.A0N()
            X.8W7 r10 = (X.AnonymousClass8W7) r10
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8Zi r1 = (X.C164568Zi) r1
            X.Bm6 r0 = r9.A0C()
            X.8cg r0 = (X.C166308cg) r0
            r0.getClass()
            r1.eventResponseMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
        L_0x0121:
            r1.bitField0_ = r0
            if (r10 == 0) goto L_0x019c
            X.Bm6 r1 = X.C17880vN.A0G(r14)
            X.8c2 r1 = (X.C165938c2) r1
            X.Bm6 r0 = r10.A0C()
            X.8Zi r0 = (X.C164568Zi) r0
            r0.getClass()
            r1.legacyMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x013a:
            r1.bitField0_ = r0
            X.8co r9 = X.AnonymousClass8BS.A0P(r13)
            X.Bm6 r2 = r14.A0C()
            int r0 = X.C166388co.AGENT_ID_FIELD_NUMBER
            r2.getClass()
            X.EE9 r1 = r9.messageAddOns_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0158
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r9.messageAddOns_ = r1
        L_0x0158:
            r1.add(r2)
            goto L_0x004a
        L_0x015d:
            boolean r0 = r5 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x019c
            r0 = r2
            X.22E r0 = (X.AnonymousClass22E) r0
            java.util.List r1 = r0.A01
            if (r1 == 0) goto L_0x019c
            X.8XH r0 = X.AnonymousClass8XH.DEFAULT_INSTANCE
            X.Bmt r9 = r0.A0N()
            X.8X4 r9 = (X.AnonymousClass8X4) r9
            java.util.Iterator r1 = r1.iterator()
        L_0x0174:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017e
            X.AnonymousClass8X4.A00(r9, r1)
            goto L_0x0174
        L_0x017e:
            X.8Zi r0 = X.C164568Zi.DEFAULT_INSTANCE
            X.Bmt r10 = r0.A0N()
            X.8W7 r10 = (X.AnonymousClass8W7) r10
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8Zi r1 = (X.C164568Zi) r1
            X.Bm6 r0 = r9.A0C()
            X.8XH r0 = (X.AnonymousClass8XH) r0
            r0.getClass()
            r1.pollVote_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            goto L_0x0121
        L_0x019c:
            X.8X8 r12 = X.C166418cr.A00()
            X.C18070vi.A0b(r12)
            X.C18070vi.A0d(r12, r7)
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
            X.Bmt r11 = r0.A0N()
            X.8Wx r11 = (X.C163938Wx) r11
            X.C18070vi.A0b(r11)
            r20 = 0
            X.C18070vi.A0d(r11, r6)
            boolean r10 = r8.A03
            boolean r9 = r8.A05
            X.1cl r19 = r2.A0J()
            boolean r1 = r8.A08
            X.A2m r0 = new X.A2m
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r29 = r7
            r30 = r7
            r21 = r20
            r22 = r7
            r24 = r23
            r31 = r10
            r32 = r9
            r33 = r1
            r16 = r0
            r17 = r12
            r18 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.00H r1 = r5.A02
            X.AnonymousClass8BV.A1B(r0, r2, r1)
            X.Bm6 r1 = X.C17880vN.A0G(r14)
            X.8c2 r1 = (X.C165938c2) r1
            X.8cr r0 = X.AnonymousClass8BR.A0e(r12)
            r0.getClass()
            r1.messageAddOn_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            goto L_0x013a
        L_0x01fd:
            X.9KS r0 = X.AnonymousClass9KS.PENDING
            goto L_0x00ba
        L_0x0201:
            if (r3 == 0) goto L_0x0207
            X.9KP r0 = X.AnonymousClass9KP.REACTION
            goto L_0x0076
        L_0x0207:
            boolean r0 = r5 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x020f
            X.9KP r0 = X.AnonymousClass9KP.POLL_UPDATE
            goto L_0x0076
        L_0x020f:
            X.9KP r0 = X.AnonymousClass9KP.PIN_IN_CHAT
            goto L_0x0076
        L_0x0213:
            if (r3 == 0) goto L_0x0225
            X.8BG r0 = X.C63892tr.A01(r1)
            if (r0 == 0) goto L_0x0266
            java.util.Collection r0 = r0.BMv()
            java.util.List r0 = X.C29431cG.A0t(r0)
            goto L_0x0044
        L_0x0225:
            boolean r0 = r5 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x0231
            X.22H r1 = (X.AnonymousClass22H) r1
            java.util.List r0 = r1.A17()
            goto L_0x0044
        L_0x0231:
            X.22C r1 = X.C63892tr.A03(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.FMessageAddOn"
            X.C18070vi.A0z(r1, r0)
            java.util.List r0 = X.C18070vi.A0M(r1)
            goto L_0x0044
        L_0x0240:
            boolean r0 = r5 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x003c
            boolean r0 = r8.A07
            goto L_0x003a
        L_0x0248:
            boolean r0 = r5 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x0254
            r0 = 66
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)
            goto L_0x0021
        L_0x0254:
            boolean r0 = r5 instanceof X.C167028fF
            if (r0 == 0) goto L_0x025b
            r0 = 1
            goto L_0x0027
        L_0x025b:
            boolean r0 = r5 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x0262
            r0 = 2
            goto L_0x0027
        L_0x0262:
            r0 = 8
            goto L_0x0027
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AUV.C1A(X.9te, X.8X1, X.206):void");
    }

    public AUV(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1B(X.C193069pU r11, X.C166388co r12, X.AnonymousClass206 r13) {
        /*
            r10 = this;
            boolean r5 = X.C18070vi.A16(r12, r13)
            X.EE9 r0 = r12.messageAddOns_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x020c
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.EE9 r0 = r12.messageAddOns_
            java.util.Iterator r9 = X.AnonymousClass8BS.A0r(r0)
        L_0x0016:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r4 = r9.next()
            X.8c2 r4 = (X.C165938c2) r4
            int r0 = r4.messageAddOnType_
            X.9KP r1 = X.AnonymousClass9KP.A00(r0)
            if (r1 != 0) goto L_0x002c
            X.9KP r1 = X.AnonymousClass9KP.UNDEFINED
        L_0x002c:
            boolean r6 = r10 instanceof X.C167008fD
            if (r6 == 0) goto L_0x0197
            X.9KP r0 = X.AnonymousClass9KP.EVENT_RESPONSE
        L_0x0032:
            if (r1 != r0) goto L_0x0016
            X.00H r1 = r10.A01
            r1.get()
            X.8cq r0 = r4.messageAddOnKey_
            if (r0 != 0) goto L_0x003f
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x003f:
            X.C18070vi.A0X(r0)
            X.205 r8 = X.C20106A7k.A01(r0)
            r1.get()
            long r0 = X.C20106A7k.A00(r12)
            int r7 = r4.bitField0_
            r2 = r7 & 2
            if (r2 == 0) goto L_0x0096
            X.8cr r2 = r4.messageAddOn_
            if (r2 != 0) goto L_0x0059
            X.8cr r2 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0059:
            X.C18070vi.A0b(r2)
            X.9p8 r1 = X.C196699vU.A00(r2, r8, r0)
            r1.A0A = r5
            r1.A0B = r5
            boolean r0 = r10 instanceof X.C167018fE
            if (r0 == 0) goto L_0x006b
            r0 = 2
            r1.A00 = r0
        L_0x006b:
            X.A6d r1 = r1.A00()
            X.00H r0 = r10.A02
            X.206 r2 = X.AnonymousClass8BV.A0K(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.FMessageAddOn"
            X.C18070vi.A0z(r2, r0)
            X.212 r2 = (X.AnonymousClass212) r2
            int r1 = r2.A0u
            if (r6 == 0) goto L_0x0085
            r0 = 93
        L_0x0082:
            if (r1 == r0) goto L_0x00c2
            goto L_0x0016
        L_0x0085:
            boolean r0 = r10 instanceof X.C167028fF
            if (r0 == 0) goto L_0x008c
            r0 = 56
            goto L_0x0082
        L_0x008c:
            boolean r0 = r10 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x0093
            r0 = 67
            goto L_0x0082
        L_0x0093:
            r0 = 79
            goto L_0x0082
        L_0x0096:
            r2 = r7 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0016
            if (r6 == 0) goto L_0x014c
            X.8Zi r2 = r4.legacyMessage_
            r7 = r2
            if (r2 != 0) goto L_0x00a3
            X.8Zi r2 = X.C164568Zi.DEFAULT_INSTANCE
        L_0x00a3:
            int r2 = r2.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0016
            if (r7 != 0) goto L_0x00ad
            X.8Zi r7 = X.C164568Zi.DEFAULT_INSTANCE
        L_0x00ad:
            X.8cg r7 = r7.eventResponseMessage_
            if (r7 != 0) goto L_0x00b3
            X.8cg r7 = X.C166308cg.DEFAULT_INSTANCE
        L_0x00b3:
            X.24H r2 = new X.24H
            r2.<init>(r8, r0)
            X.9K9 r0 = r7.A0R()
            X.2Qx r0 = X.C196689vT.A01(r0)
            r2.A02 = r0
        L_0x00c2:
            int r1 = r2.A0u
            if (r6 == 0) goto L_0x013a
            r0 = 93
        L_0x00c8:
            if (r1 != r0) goto L_0x0016
            long r0 = r2.A0I
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00dc
            int r0 = r4.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00dc
            long r0 = r4.senderTimestampMs_
            r2.A0I = r0
        L_0x00dc:
            long r0 = r2.A03
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00ed
            int r0 = r4.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00ed
            long r0 = r4.serverTimestampMs_
            r2.A1A(r0)
        L_0x00ed:
            X.1Dv r1 = X.AnonymousClass1BI.A00
            X.8cq r0 = r4.messageAddOnKey_
            if (r0 != 0) goto L_0x00f5
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x00f5:
            java.lang.String r0 = r0.participant_
            X.1BI r0 = r1.A02(r0)
            r2.A0d(r0)
            int r0 = r4.status_
            X.9KS r1 = X.AnonymousClass9KS.A00(r0)
            if (r1 != 0) goto L_0x0108
            X.9KS r1 = X.AnonymousClass9KS.PENDING
        L_0x0108:
            X.9KS r0 = X.AnonymousClass9KS.READ
            if (r1 != r0) goto L_0x0111
            r0 = 17
            r2.A0a(r0)
        L_0x0111:
            int r0 = r4.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x012b
            X.00H r0 = r10.A00
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.0ve r1 = (X.C18030ve) r1
            X.8Zj r0 = r4.addOnContextInfo_
            if (r0 != 0) goto L_0x0125
            X.8Zj r0 = X.C164578Zj.DEFAULT_INSTANCE
        L_0x0125:
            X.C18070vi.A0X(r0)
            X.A3J.A02(r1, r0, r2)
        L_0x012b:
            X.A51 r0 = X.A51.A00(r13)
            r2.A05 = r0
            long r0 = r13.A0x
            r2.A02 = r0
            r3.add(r2)
            goto L_0x0016
        L_0x013a:
            boolean r0 = r10 instanceof X.C167028fF
            if (r0 == 0) goto L_0x0141
            r0 = 56
            goto L_0x00c8
        L_0x0141:
            boolean r0 = r10 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x0148
            r0 = 67
            goto L_0x00c8
        L_0x0148:
            r0 = 79
            goto L_0x00c8
        L_0x014c:
            boolean r2 = r10 instanceof X.AnonymousClass8fC
            if (r2 == 0) goto L_0x0016
            r7 = 2
            X.8Zi r2 = r4.legacyMessage_
            if (r2 != 0) goto L_0x0157
            X.8Zi r2 = X.C164568Zi.DEFAULT_INSTANCE
        L_0x0157:
            int r2 = r2.bitField0_
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0016
            X.22E r2 = new X.22E
            r2.<init>(r8, r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.8Zi r0 = r4.legacyMessage_
            if (r0 != 0) goto L_0x016c
            X.8Zi r0 = X.C164568Zi.DEFAULT_INSTANCE
        L_0x016c:
            X.8XH r0 = r0.pollVote_
            if (r0 != 0) goto L_0x0172
            X.8XH r0 = X.AnonymousClass8XH.DEFAULT_INSTANCE
        L_0x0172:
            X.EE9 r0 = r0.selectedOptions_
            java.util.Iterator r1 = X.AnonymousClass8BS.A0r(r0)
        L_0x0178:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0193
            java.lang.Object r0 = r1.next()
            X.DSQ r0 = (X.DSQ) r0
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)
            X.C18070vi.A0X(r0)
            r8.add(r0)
            goto L_0x0178
        L_0x0193:
            r2.A01 = r8
            goto L_0x00c2
        L_0x0197:
            boolean r0 = r10 instanceof X.C167028fF
            if (r0 == 0) goto L_0x019f
            X.9KP r0 = X.AnonymousClass9KP.REACTION
            goto L_0x0032
        L_0x019f:
            boolean r0 = r10 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x01a7
            X.9KP r0 = X.AnonymousClass9KP.POLL_UPDATE
            goto L_0x0032
        L_0x01a7:
            X.9KP r0 = X.AnonymousClass9KP.PIN_IN_CHAT
            goto L_0x0032
        L_0x01ab:
            boolean r0 = X.C17880vN.A1X(r3)
            if (r0 == 0) goto L_0x020c
            r4 = r10
            boolean r0 = r10 instanceof X.C167008fD
            if (r0 == 0) goto L_0x01d5
            X.8fD r4 = (X.C167008fD) r4
            r2 = r13
            X.23z r2 = (X.C445823z) r2
            java.util.List r1 = X.C29431cG.A0t(r3)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.protocol.message.FMessageEventResponse>"
            X.C18070vi.A0z(r1, r0)
            X.00H r0 = r4.A00
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.11S r0 = (X.AnonymousClass11S) r0
            r2.A1A(r0, r1)
            r0 = 32
        L_0x01d1:
            r13.A0W(r0)
            return
        L_0x01d5:
            boolean r2 = r10 instanceof X.C167028fF
            if (r2 == 0) goto L_0x01e9
            X.8fF r4 = (X.C167028fF) r4
            X.11S r1 = r4.A00
            X.7CA r0 = new X.7CA
            r0.<init>(r1, r3)
            X.C63892tr.A07(r0, r13)
        L_0x01e5:
            if (r2 == 0) goto L_0x0203
            r0 = 1
            goto L_0x01d1
        L_0x01e9:
            boolean r0 = r10 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x01f4
            r0 = r13
            X.22H r0 = (X.AnonymousClass22H) r0
            r0.A18(r3)
            goto L_0x01e5
        L_0x01f4:
            java.lang.Object r1 = X.C108955ca.A0p(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePinInChat"
            X.C18070vi.A0z(r1, r0)
            X.22C r1 = (X.AnonymousClass22C) r1
            X.C63892tr.A06(r13, r1)
            goto L_0x01e5
        L_0x0203:
            boolean r0 = r10 instanceof X.AnonymousClass8fC
            if (r0 == 0) goto L_0x0209
            r0 = 2
            goto L_0x01d1
        L_0x0209:
            r0 = 8
            goto L_0x01d1
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AUV.C1B(X.9pU, X.8co, X.206):void");
    }
}
