package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8fI  reason: invalid class name */
public final class AnonymousClass8fI extends C20616ASa {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass190 A08;
    public final C18030ve A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public final void A02(C165258aq r5) {
        C18070vi.A0d(r5, 0);
        String str = r5.text_;
        if (str == null || new AnonymousClass737(str).A00.length > 30) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FMessageReactionProtobuf/validateReactionMessageText/reaction text failed validation key=");
            C166408cq r0 = r5.key_;
            if (r0 == null) {
                r0 = C166408cq.DEFAULT_INSTANCE;
            }
            A10.append(r0);
            C17890vO.A0w(A10);
            this.A08.A0G("reaction text failed validation", (String) null, false);
            throw AnonymousClass8BR.A0o(68);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.212, X.227] */
    public static final AnonymousClass227 A00(C165258aq r4, C166408cq r5, AnonymousClass205 r6, long j) {
        ? r3 = new AnonymousClass212(r6, 56, j);
        C22931Dv r0 = AnonymousClass1BI.A00;
        AnonymousClass205 A012 = AnonymousClass205.A01(C22931Dv.A01(r5.remoteJid_), r5.id_, r5.fromMe_);
        C22941Dw r1 = UserJid.Companion;
        C166408cq r02 = r4.key_;
        if (r02 == null) {
            r02 = C166408cq.DEFAULT_INSTANCE;
        }
        r3.A05 = new A51(r1.A04(r02.participant_), A012);
        r3.A1E(r4.text_);
        r3.A00 = r4.senderTimestampMs_;
        return r3;
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [X.212, X.227, X.206] */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.212, X.227] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        if (r8 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028a A[Catch:{ 98W -> 0x02c1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A01(X.C20077A6d r23) {
        /*
            r22 = this;
            r1 = r23
            X.8cr r5 = X.C20077A6d.A01(r1)
            int r4 = r1.A00
            int r0 = r5.bitField1_
            r2 = r0 & 16
            r0 = r22
            if (r2 == 0) goto L_0x0030
            X.8aq r3 = r5.reactionMessage_
            if (r3 != 0) goto L_0x0016
            X.8aq r3 = X.C165258aq.DEFAULT_INSTANCE
        L_0x0016:
            X.C18070vi.A0X(r3)
            if (r4 == 0) goto L_0x01ad
            int r2 = r3.bitField0_
            r2 = r2 & 2
            if (r2 == 0) goto L_0x01ad
            java.lang.String r2 = r3.text_
            if (r2 == 0) goto L_0x01ad
            int r2 = r2.length()
            if (r2 == 0) goto L_0x01ad
            java.lang.String r2 = "MessageUtils/hasValidReactionMessage edit version and text message are both set"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0030:
            int r2 = r5.bitField1_
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x02d3
            X.8a4 r4 = r5.encReactionMessage_
            if (r4 != 0) goto L_0x003c
            X.8a4 r4 = X.C164788a4.DEFAULT_INSTANCE
        L_0x003c:
            int r3 = r4.bitField0_
            r2 = r3 & 2
            if (r2 == 0) goto L_0x02d3
            r2 = r3 & 4
            if (r2 == 0) goto L_0x02d3
            X.8cq r2 = r4.targetMessageKey_
            if (r2 != 0) goto L_0x004c
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE
        L_0x004c:
            boolean r2 = X.AnonymousClass9P4.A00(r2)
            if (r2 == 0) goto L_0x02d3
            X.0ve r4 = r0.A09
            r3 = 6771(0x1a73, float:9.488E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x00da
            X.8a4 r4 = r5.encReactionMessage_
            if (r4 != 0) goto L_0x0064
            X.8a4 r4 = X.C164788a4.DEFAULT_INSTANCE
        L_0x0064:
            X.C18070vi.A0X(r4)
            X.1BI r10 = r1.A05
            X.205 r13 = r1.A0A
            X.00H r6 = r0.A05
            java.lang.Object r3 = r6.get()
            X.A2I r3 = (X.A2I) r3
            X.8cq r2 = r4.targetMessageKey_
            if (r2 != 0) goto L_0x0079
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0079:
            X.A51 r3 = r3.A01(r10, r2, r13)
            X.00H r2 = r0.A03
            X.1W6 r8 = X.C17880vN.A0c(r2)
            X.00H r2 = r0.A07
            java.lang.Object r7 = r2.get()
            X.2mE r7 = (X.C59392mE) r7
            X.205 r2 = r3.A01
            X.205 r2 = r7.A01(r2)
            X.206 r7 = X.C108945cZ.A0s(r2, r8)
            if (r7 == 0) goto L_0x0226
            boolean r2 = X.C20133A8t.A0B(r7)
            if (r2 != 0) goto L_0x0226
            boolean r2 = r13.A02
            if (r2 == 0) goto L_0x00d0
            X.11S r2 = r0.A00
            X.1E2 r11 = r2.A0A()
        L_0x00a7:
            X.DSQ r8 = r4.encIv_
            X.DSQ r9 = r4.encPayload_
            X.8cq r12 = r4.targetMessageKey_
            if (r12 != 0) goto L_0x00b1
            X.8cq r12 = X.C166408cq.DEFAULT_INSTANCE
        L_0x00b1:
            X.00H r2 = r0.A02
            java.lang.Object r2 = r2.get()
            X.2jB r2 = (X.C57502jB) r2
            boolean r15 = r2.A00(r7)
            java.lang.String r14 = "Enc Reaction"
            X.9tZ r7 = new X.9tZ
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r6.get()
            X.A2I r2 = (X.A2I) r2
            byte[] r5 = r2.A03(r7)
            goto L_0x0200
        L_0x00d0:
            boolean r2 = r10 instanceof X.AnonymousClass1E2
            if (r2 == 0) goto L_0x00d8
            r11 = r10
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            goto L_0x00a7
        L_0x00d8:
            r11 = 0
            goto L_0x00a7
        L_0x00da:
            r6 = 0
            X.8a4 r4 = r5.encReactionMessage_
            if (r4 != 0) goto L_0x00e1
            X.8a4 r4 = X.C164788a4.DEFAULT_INSTANCE
        L_0x00e1:
            X.C18070vi.A0X(r4)
            X.205 r3 = r1.A0A
            X.1BI r8 = r1.A05
            X.11S r12 = r0.A00
            boolean r9 = r3.A02
            r14 = 0
            if (r9 != 0) goto L_0x00f2
            r7 = r8
            if (r8 != 0) goto L_0x00f3
        L_0x00f2:
            r7 = r14
        L_0x00f3:
            X.8cq r2 = r4.targetMessageKey_
            if (r2 != 0) goto L_0x00f9
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE
        L_0x00f9:
            X.A51 r2 = X.AnonymousClass9AT.A00(r12, r7, r2, r3, r6)
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A00(r8)
            if (r9 == 0) goto L_0x0104
            goto L_0x010a
        L_0x0104:
            boolean r7 = r8 instanceof X.AnonymousClass1E2     // Catch:{ 98W -> 0x02c1 }
            if (r7 == 0) goto L_0x010e
            r14 = r8
            goto L_0x010e
        L_0x010a:
            X.1E2 r14 = r12.A0A()     // Catch:{ 98W -> 0x02c1 }
        L_0x010e:
            X.00H r13 = r0.A03     // Catch:{ 98W -> 0x02c1 }
            java.lang.Object r7 = r13.get()     // Catch:{ 98W -> 0x02c1 }
            r8 = 1
            if (r7 == 0) goto L_0x0297
            X.00H r10 = r0.A06     // Catch:{ 98W -> 0x02c1 }
            X.00H r9 = r0.A04     // Catch:{ 98W -> 0x02c1 }
            X.00H r7 = r0.A07     // Catch:{ 98W -> 0x02c1 }
            java.lang.Object r11 = r7.get()     // Catch:{ 98W -> 0x02c1 }
            X.2mE r11 = (X.C59392mE) r11     // Catch:{ 98W -> 0x02c1 }
            X.205 r7 = r2.A01     // Catch:{ 98W -> 0x02c1 }
            X.205 r7 = r11.A01(r7)     // Catch:{ 98W -> 0x02c1 }
            X.206 r11 = X.AnonymousClass1W2.A01(r7, r13)     // Catch:{ 98W -> 0x02c1 }
            if (r11 == 0) goto L_0x028c
            X.205 r7 = r11.A0v     // Catch:{ 98W -> 0x02c1 }
            X.C17960vV.A07(r7)     // Catch:{ 98W -> 0x02c1 }
            boolean r7 = r7.A02     // Catch:{ 98W -> 0x02c1 }
            if (r7 == 0) goto L_0x0141
            com.whatsapp.jid.PhoneUserJid r13 = X.AnonymousClass11S.A00(r12)     // Catch:{ 98W -> 0x02c1 }
        L_0x013c:
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ 98W -> 0x02c1 }
            if (r13 == 0) goto L_0x0273
            goto L_0x014b
        L_0x0141:
            X.1BI r13 = r11.A0H()     // Catch:{ 98W -> 0x02c1 }
            boolean r7 = r13 instanceof com.whatsapp.jid.UserJid     // Catch:{ 98W -> 0x02c1 }
            if (r7 != 0) goto L_0x013c
            goto L_0x0272
        L_0x014b:
            if (r14 == 0) goto L_0x0273
            java.lang.Object r10 = r10.get()     // Catch:{ 98W -> 0x02c1 }
            X.1W7 r10 = (X.AnonymousClass1W7) r10     // Catch:{ 98W -> 0x02c1 }
            long r7 = r11.A0x     // Catch:{ 98W -> 0x02c1 }
            byte[] r21 = r10.A01(r7)     // Catch:{ 98W -> 0x02c1 }
            X.DSQ r7 = r4.encIv_     // Catch:{ 98W -> 0x02c1 }
            byte[] r18 = r7.A06()     // Catch:{ 98W -> 0x02c1 }
            X.DSQ r7 = r4.encPayload_     // Catch:{ 98W -> 0x02c1 }
            byte[] r19 = r7.A06()     // Catch:{ 98W -> 0x02c1 }
            java.lang.Object r15 = X.C18070vi.A0E(r9)     // Catch:{ 98W -> 0x02c1 }
            com.whatsapp.wamsys.JniBridge r15 = (com.whatsapp.wamsys.JniBridge) r15     // Catch:{ 98W -> 0x02c1 }
            X.8cq r7 = r4.targetMessageKey_     // Catch:{ 98W -> 0x02c1 }
            if (r7 != 0) goto L_0x0171
            X.8cq r7 = X.C166408cq.DEFAULT_INSTANCE     // Catch:{ 98W -> 0x02c1 }
        L_0x0171:
            java.lang.String r7 = r7.id_     // Catch:{ 98W -> 0x02c1 }
            r8 = 2
            X.C18070vi.A0d(r15, r8)     // Catch:{ 98W -> 0x02c1 }
            r20 = 0
            if (r7 == 0) goto L_0x023e
            if (r21 == 0) goto L_0x023e
            java.lang.String r17 = "Enc Reaction"
            r16 = r7
            byte[] r8 = X.AnonymousClass9RZ.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 98W -> 0x02c1 }
            if (r8 != 0) goto L_0x018e
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: unable to decrypt payload"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 98W -> 0x02c1 }
            goto L_0x026d
        L_0x018e:
            X.8aq r7 = X.C165258aq.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0238 }
            X.Bm6 r7 = X.C23577Bm6.A07(r7, r8)     // Catch:{ 1PN -> 0x0238 }
            X.8aq r7 = (X.C165258aq) r7     // Catch:{ 1PN -> 0x0238 }
            X.C18070vi.A0b(r7)     // Catch:{ 1PN -> 0x0238 }
            if (r7 == 0) goto L_0x026d
            long r5 = r1.A03
            X.8cq r1 = r4.targetMessageKey_
            if (r1 != 0) goto L_0x01a3
            X.8cq r1 = X.C166408cq.DEFAULT_INSTANCE
        L_0x01a3:
            X.C18070vi.A0X(r1)
            X.227 r5 = A00(r7, r1, r3, r5)
            r5.A05 = r2
            goto L_0x01fa
        L_0x01ad:
            X.8cq r2 = r3.key_
            if (r2 != 0) goto L_0x01b3
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE
        L_0x01b3:
            boolean r2 = X.AnonymousClass9P4.A00(r2)
            if (r2 == 0) goto L_0x0030
            X.8aq r7 = r5.reactionMessage_
            if (r7 != 0) goto L_0x01bf
            X.8aq r7 = X.C165258aq.DEFAULT_INSTANCE
        L_0x01bf:
            X.C18070vi.A0X(r7)
            X.1BI r8 = r1.A05
            X.205 r6 = r1.A0A
            long r1 = r1.A03
            X.8cq r3 = r7.key_
            if (r3 != 0) goto L_0x01ce
            X.8cq r3 = X.C166408cq.DEFAULT_INSTANCE
        L_0x01ce:
            X.C18070vi.A0X(r3)
            X.227 r5 = A00(r7, r3, r6, r1)
            X.11S r4 = r0.A00
            boolean r1 = r6.A02
            if (r1 != 0) goto L_0x01fe
            if (r8 == 0) goto L_0x01fe
        L_0x01dd:
            X.8cq r3 = r7.key_
            r1 = r3
            if (r3 != 0) goto L_0x01e4
            X.8cq r3 = X.C166408cq.DEFAULT_INSTANCE
        L_0x01e4:
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            if (r1 != 0) goto L_0x01ea
            X.8cq r1 = X.C166408cq.DEFAULT_INSTANCE
        L_0x01ea:
            java.lang.String r1 = r1.participant_
            com.whatsapp.jid.UserJid r1 = r2.A04(r1)
            boolean r1 = X.C42701yb.A01(r1)
            X.A51 r1 = X.AnonymousClass9AT.A00(r4, r8, r3, r6, r1)
            r5.A05 = r1
        L_0x01fa:
            r0.A02(r7)
            return r5
        L_0x01fe:
            r8 = 0
            goto L_0x01dd
        L_0x0200:
            X.8aq r2 = X.C165258aq.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x021b }
            X.Bm6 r5 = X.C23577Bm6.A07(r2, r5)     // Catch:{ 1PN -> 0x021b }
            X.8aq r5 = (X.C165258aq) r5     // Catch:{ 1PN -> 0x021b }
            r0.A02(r5)
            long r1 = r1.A03
            X.8cq r0 = r4.targetMessageKey_
            if (r0 != 0) goto L_0x0213
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0213:
            X.C18070vi.A0X(r0)
            X.227 r5 = A00(r5, r0, r13, r1)
            goto L_0x0235
        L_0x021b:
            r1 = move-exception
            java.lang.String r0 = "FMessageReactionProtobuf/parseEncReaction: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e(r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0b()
            throw r0
        L_0x0226:
            long r1 = r1.A03
            byte[] r4 = r5.A0M()
            r0 = 56
            X.227 r5 = new X.227
            r5.<init>(r13, r0, r1)
            r5.A02 = r4
        L_0x0235:
            r5.A05 = r3
            return r5
        L_0x0238:
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 98W -> 0x02c1 }
            goto L_0x026d
        L_0x023e:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: one of the params is null, encIv is null = "
            r8.append(r0)     // Catch:{ 98W -> 0x02c1 }
            r4 = 1
            r8.append(r6)     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = " encPayload is null = "
            r8.append(r0)     // Catch:{ 98W -> 0x02c1 }
            r8.append(r6)     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = " targetMessageId is null = "
            r8.append(r0)     // Catch:{ 98W -> 0x02c1 }
            boolean r0 = X.AnonymousClass000.A1X(r7)
            r8.append(r0)     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = " messageSecret is null = "
            r8.append(r0)     // Catch:{ 98W -> 0x02c1 }
            if (r21 == 0) goto L_0x0267
            r4 = 0
        L_0x0267:
            r8.append(r4)     // Catch:{ 98W -> 0x02c1 }
            X.C17890vO.A0w(r8)     // Catch:{ 98W -> 0x02c1 }
        L_0x026d:
            X.1hd r0 = X.AnonymousClass8BR.A0o(r6)
            throw r0
        L_0x0272:
            r13 = 0
        L_0x0273:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: one of the params is null, targetSenderUserJid is null = "
            r4.append(r0)     // Catch:{ 98W -> 0x02c1 }
            boolean r0 = X.AnonymousClass000.A1X(r13)
            r4.append(r0)     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = ", senderLid is null = "
            r4.append(r0)     // Catch:{ 98W -> 0x02c1 }
            if (r14 == 0) goto L_0x02b6
            r8 = 0
            goto L_0x02b6
        L_0x028c:
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: targetMessage is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 98W -> 0x02c1 }
            X.98W r0 = new X.98W     // Catch:{ 98W -> 0x02c1 }
            r0.<init>()     // Catch:{ 98W -> 0x02c1 }
            goto L_0x02c0
        L_0x0297:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: one of the params is null, fMessageDatabase is null = "
            r4.append(r0)     // Catch:{ 98W -> 0x02c1 }
            r4.append(r6)     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = ", messageSecretStore is null = "
            r4.append(r0)     // Catch:{ 98W -> 0x02c1 }
            r4.append(r6)     // Catch:{ 98W -> 0x02c1 }
            java.lang.String r0 = ", jniBridge is null = "
            java.lang.String r0 = X.C17900vP.A0D(r0, r4, r6)     // Catch:{ 98W -> 0x02c1 }
            X.1hd r0 = X.AnonymousClass8BU.A0a(r0, r6)     // Catch:{ 98W -> 0x02c1 }
            goto L_0x02c0
        L_0x02b6:
            r4.append(r8)     // Catch:{ 98W -> 0x02c1 }
            X.C17890vO.A0w(r4)     // Catch:{ 98W -> 0x02c1 }
            X.1hd r0 = X.AnonymousClass8BR.A0o(r6)     // Catch:{ 98W -> 0x02c1 }
        L_0x02c0:
            throw r0     // Catch:{ 98W -> 0x02c1 }
        L_0x02c1:
            long r6 = r1.A03
            byte[] r1 = r5.A0M()
            r0 = 56
            X.227 r5 = new X.227
            r5.<init>(r3, r0, r6)
            r5.A02 = r1
            r5.A05 = r2
            return r5
        L_0x02d3:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8fI.A01(X.A6d):X.206");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0203  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDb(X.C19998A2m r20, X.AnonymousClass206 r21) {
        /*
            r19 = this;
            r2 = r20
            r3 = r21
            X.C18070vi.A0h(r3, r2)
            boolean r0 = r3 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x02b9
            X.227 r3 = (X.AnonymousClass227) r3
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x02a0
            X.737 r0 = new X.737
            r0.<init>((java.lang.String) r1)
            int[] r0 = r0.A00
            int r1 = r0.length
            r0 = 30
            if (r1 > r0) goto L_0x02a0
        L_0x001d:
            X.8X8 r4 = r2.A00
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8aq r0 = r0.reactionMessage_
            if (r0 != 0) goto L_0x0029
            X.8aq r0 = X.C165258aq.DEFAULT_INSTANCE
        L_0x0029:
            X.Bmt r1 = r0.A0O()
            X.Bm6 r0 = r1.A00
            X.8aq r0 = (X.C165258aq) r0
            X.8cq r0 = r0.key_
            if (r0 != 0) goto L_0x0037
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0037:
            X.8X7 r11 = X.AnonymousClass8BR.A0f(r0)
            X.205 r8 = r3.A18()
            X.A51 r0 = r3.A05
            if (r0 != 0) goto L_0x029c
            r6 = 0
        L_0x0044:
            X.A51 r5 = r3.A04
            if (r5 == 0) goto L_0x004f
            X.205 r0 = r5.A01
            if (r0 == 0) goto L_0x004f
            r8 = r0
            X.1BI r6 = r5.A00
        L_0x004f:
            r7 = r19
            X.00H r0 = r7.A0A
            java.lang.Object r5 = r0.get()
            X.9lu r5 = (X.C191029lu) r5
            X.C17960vV.A07(r8)
            X.C18070vi.A0X(r8)
            boolean r0 = X.C42701yb.A01(r6)
            r5.A00(r6, r11, r8, r0)
            X.Bm6 r5 = X.C17880vN.A0G(r1)
            X.8aq r5 = (X.C165258aq) r5
            X.8cq r0 = X.AnonymousClass8BU.A0Y(r11)
            r5.key_ = r0
            int r0 = r5.bitField0_
            r0 = r0 | 1
            r5.bitField0_ = r0
            java.lang.String r6 = r3.A01
            if (r6 == 0) goto L_0x0082
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0084
        L_0x0082:
            java.lang.String r6 = ""
        L_0x0084:
            X.Bm6 r5 = X.C17880vN.A0G(r1)
            X.8aq r5 = (X.C165258aq) r5
            int r0 = r5.bitField0_
            r0 = r0 | 2
            r5.bitField0_ = r0
            r5.text_ = r6
            long r5 = r3.A00
            X.Bm6 r8 = X.C17880vN.A0G(r1)
            X.8aq r8 = (X.C165258aq) r8
            int r0 = r8.bitField0_
            r0 = r0 | 8
            r8.bitField0_ = r0
            r8.senderTimestampMs_ = r5
            X.205 r0 = r3.A0v
            X.1BI r5 = r0.A00
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0287
            X.1CJ r0 = r7.A01
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            int r5 = r0.A06(r5)
            r0 = 3
            if (r5 != r0) goto L_0x0287
            X.0ve r6 = r7.A09
            r5 = 6771(0x1a73, float:9.488E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r5)
            if (r0 == 0) goto L_0x014f
            X.Bm6 r2 = X.C17880vN.A0G(r1)
            X.8aq r2 = (X.C165258aq) r2
            r0 = 0
            r2.key_ = r0
            int r0 = r2.bitField0_
            r0 = r0 & -2
            r2.bitField0_ = r0
            X.11S r0 = r7.A00
            X.1E2 r6 = r0.A0A()
            X.C18070vi.A0X(r6)
            byte[] r5 = X.AnonymousClass8BT.A1Z(r1)
            X.205 r2 = r3.A18()
            java.lang.String r0 = "Enc Reaction"
            X.9sZ r1 = new X.9sZ
            r1.<init>(r6, r2, r0, r5)
            X.00H r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.A2I r0 = (X.A2I) r0
            X.7PS r3 = r0.A02(r1)
            X.8a4 r0 = X.C164788a4.DEFAULT_INSTANCE
            X.Bmt r12 = r0.A0N()
            X.C18070vi.A0X(r12)
            java.lang.Object r2 = r3.first
            X.DSQ r2 = (X.DSQ) r2
            X.Bm6 r1 = X.C17880vN.A0G(r12)
            X.8a4 r1 = (X.C164788a4) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.encIv_ = r2
            java.lang.Object r2 = r3.second
            X.DSQ r2 = (X.DSQ) r2
            X.Bm6 r1 = X.C17880vN.A0G(r12)
            X.8a4 r1 = (X.C164788a4) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.encPayload_ = r2
            java.lang.Object r0 = r3.third
            X.8cq r0 = (X.C166408cq) r0
            X.Bm6 r1 = X.C17880vN.A0G(r12)
            X.8a4 r1 = (X.C164788a4) r1
            r0.getClass()
            r1.targetMessageKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x013c:
            X.Bm6 r0 = r12.A0C()
            X.8a4 r0 = (X.C164788a4) r0
            X.8cr r2 = X.AnonymousClass8BV.A0J(r4, r0)
            r2.encReactionMessage_ = r0
            int r0 = r2.bitField1_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L_0x014c:
            r2.bitField1_ = r0
            return
        L_0x014f:
            X.00H r0 = r7.A0B
            java.lang.Object r8 = r0.get()
            X.9fs r8 = (X.C187479fs) r8
            r9 = 1
            X.205 r0 = r3.A18()
            X.C17960vV.A07(r0)
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8a4 r0 = r0.encReactionMessage_
            if (r0 != 0) goto L_0x0169
            X.8a4 r0 = X.C164788a4.DEFAULT_INSTANCE
        L_0x0169:
            X.Bmt r12 = r0.A0O()
            X.1W7 r0 = r8.A01
            long r5 = r3.A02
            byte[] r7 = r0.A01(r5)
            X.205 r6 = r3.A18()
            X.00H r0 = r8.A03
            X.206 r5 = X.AnonymousClass1W2.A01(r6, r0)
            if (r6 == 0) goto L_0x0278
            boolean r0 = r6.A02
            if (r0 != r9) goto L_0x0278
            if (r5 == 0) goto L_0x0270
            boolean r0 = X.AnonymousClass206.A08(r5)
            if (r0 != r9) goto L_0x0270
            X.11S r0 = r8.A00
            X.1E2 r9 = r0.A09()
        L_0x0193:
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 == 0) goto L_0x02b2
            X.11S r0 = r8.A00
            X.1E2 r10 = r0.A09()
            if (r10 == 0) goto L_0x02ab
            X.Bm6 r6 = X.C17880vN.A0G(r12)
            X.8a4 r6 = (X.C164788a4) r6
            X.Bm6 r5 = r11.A0C()
            X.8cq r5 = (X.C166408cq) r5
            int r0 = X.C164788a4.ENC_IV_FIELD_NUMBER
            r5.getClass()
            r6.targetMessageKey_ = r5
            int r0 = r6.bitField0_
            r0 = r0 | 1
            r6.bitField0_ = r0
            X.Bm6 r5 = X.C17880vN.A0G(r1)
            X.8aq r5 = (X.C165258aq) r5
            r0 = 0
            r5.key_ = r0
            int r0 = r5.bitField0_
            r0 = r0 & -2
            r5.bitField0_ = r0
            com.whatsapp.wamsys.JniBridge r13 = r8.A02
            X.205 r0 = r3.A18()
            if (r0 == 0) goto L_0x026d
            java.lang.String r8 = r0.A01
        L_0x01d1:
            X.Bm6 r3 = r1.A0C()
            r6 = 0
            r0 = 5
            X.C18070vi.A0d(r3, r0)
            r1 = 1
            if (r8 == 0) goto L_0x0251
            if (r7 == 0) goto L_0x0251
            byte[] r16 = r3.A0M()
            java.lang.String r5 = "Enc Reaction"
            r17 = 0
            int r1 = r7.length
            r0 = 32
            if (r1 == r0) goto L_0x020a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageEncUtils/encryptEncMessage: invalid message_secret secretSize="
            r3.append(r0)
            r3.append(r1)
        L_0x01f8:
            java.lang.String r0 = r3.toString()
        L_0x01fc:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x013c
            r0 = 67
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x020a:
            r3 = 12
            byte[] r15 = X.AnonymousClass8BV.A1a(r3)
            byte[] r14 = X.C60612oK.A01(r9, r10, r5, r8, r7)
            X.C18070vi.A0X(r14)
            r18 = 16
            byte[] r1 = r13.WCIAPIGcmAesCreateEncryptedCiphertext(r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x024e
            int r0 = r1.length
            if (r0 == 0) goto L_0x024e
            X.BmB r3 = X.DSQ.A01(r15, r6, r3)
            X.BmB r2 = X.DSQ.A01(r1, r6, r0)
            X.Bm6 r1 = X.C17880vN.A0G(r12)
            X.8a4 r1 = (X.C164788a4) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.encIv_ = r3
            X.Bm6 r1 = X.C17880vN.A0G(r12)
            X.8a4 r1 = (X.C164788a4) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.encPayload_ = r2
            goto L_0x013c
        L_0x024e:
            java.lang.String r0 = "MessageEncUtils/encryptEncMessage encryption values are invalid"
            goto L_0x01fc
        L_0x0251:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageAddOnEncReactionUtils/encryptEncReactionMessage: one of the params is null, targetMessageId is null = "
            r3.append(r0)
            boolean r0 = X.AnonymousClass000.A1X(r8)
            r3.append(r0)
            java.lang.String r0 = "messageSecret is null = "
            r3.append(r0)
            if (r7 == 0) goto L_0x0269
            r1 = 0
        L_0x0269:
            r3.append(r1)
            goto L_0x01f8
        L_0x026d:
            r8 = 0
            goto L_0x01d1
        L_0x0270:
            X.11S r0 = r8.A00
            com.whatsapp.jid.PhoneUserJid r9 = X.AnonymousClass11S.A00(r0)
            goto L_0x0193
        L_0x0278:
            X.A51 r0 = r3.A05
            if (r0 != 0) goto L_0x0284
            r9 = 0
        L_0x027d:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r9, r0)
            goto L_0x0193
        L_0x0284:
            X.1BI r9 = r0.A00
            goto L_0x027d
        L_0x0287:
            X.8cr r2 = X.AnonymousClass8BS.A0M(r4)
            X.Bm6 r0 = r1.A0C()
            X.8aq r0 = (X.C165258aq) r0
            r0.getClass()
            r2.reactionMessage_ = r0
            int r0 = r2.bitField1_
            r0 = r0 | 16
            goto L_0x014c
        L_0x029c:
            X.1BI r6 = r0.A00
            goto L_0x0044
        L_0x02a0:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x001d
            r0 = 68
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x02ab:
            java.lang.String r0 = "reactionSenderUserLid is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02b2:
            java.lang.String r0 = "targetSenderUserJid is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02b9:
            java.lang.String r0 = "FMessageReactionProtobuf/not supported message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8fI.BDb(X.A2m, X.206):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fI(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass1CJ r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        super(r4);
        C18070vi.A0w(r4, r1, r2, r3, r5);
        C18070vi.A0x(r6, r7, r8, r9, r10);
        C72473Md.A1L(r11, r12);
        this.A09 = r4;
        this.A08 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r5;
        this.A07 = r6;
        this.A03 = r7;
        this.A06 = r8;
        this.A02 = r9;
        this.A05 = r10;
        this.A0B = r11;
        this.A0A = r12;
    }
}
