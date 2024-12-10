package X;

public final class A77 {
    public static final A77 A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C166128cO A02(X.AnonymousClass11S r9, X.C178119Bw r10) {
        /*
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            r5 = 1
            X.8cO r0 = X.C166128cO.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            int r0 = r10.A06
            X.9Kb r0 = A01(r0)
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.9Il r1 = r10.A0A()
            X.9Il r0 = X.C179559Il.A05
            boolean r2 = X.AnonymousClass000.A1Z(r1, r0)
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.isDndMode_ = r2
            X.C178119Bw.A00(r10)
            int r1 = r10.A09
            if (r1 == 0) goto L_0x027f
            if (r1 == r5) goto L_0x027b
            r0 = 2
            if (r1 == r0) goto L_0x0277
            r0 = 3
            if (r1 != r0) goto L_0x027f
            X.9KD r0 = X.AnonymousClass9KD.Lightweight
        L_0x004a:
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r0.value
            r1.silenceReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            int r0 = r10.A08
            long r1 = (long) r0
            X.Bm6 r3 = X.C17880vN.A0G(r4)
            X.8cO r3 = (X.C166128cO) r3
            int r0 = r3.bitField0_
            r0 = r0 | 8
            r3.bitField0_ = r0
            r3.duration_ = r1
            long r0 = r10.A01
            long r1 = X.C17880vN.A04(r0)
            X.Bm6 r3 = X.C17880vN.A0G(r4)
            X.8cO r3 = (X.C166128cO) r3
            int r0 = r3.bitField0_
            r0 = r0 | 16
            r3.bitField0_ = r0
            r3.startTime_ = r1
            X.4cT r6 = r10.A04
            boolean r0 = r6.A03
            r2 = r0 ^ 1
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.isIncoming_ = r2
            boolean r2 = r10.A0J
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.isVideo_ = r2
            java.lang.String r0 = r6.A02
            java.lang.String r2 = X.C40811vJ.A09(r0)
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.callId_ = r2
            com.whatsapp.jid.DeviceJid r0 = r10.A02
            if (r0 == 0) goto L_0x00d3
            com.whatsapp.jid.UserJid r0 = r0.userJid
            java.lang.String r2 = X.AnonymousClass8BS.A0d(r4, r0)
            X.Bm6 r1 = r4.A00
            X.8cO r1 = (X.C166128cO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.callCreatorJid_ = r2
        L_0x00d3:
            com.whatsapp.jid.GroupJid r0 = r10.A0C
            if (r0 == 0) goto L_0x00ea
            java.lang.String r2 = X.AnonymousClass8BS.A0d(r4, r0)
            X.Bm6 r1 = r4.A00
            X.8cO r1 = (X.C166128cO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.groupJid_ = r2
        L_0x00ea:
            java.util.ArrayList r0 = r10.A0B()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0192
            X.8ZT r0 = X.AnonymousClass8ZT.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            com.whatsapp.jid.UserJid r0 = r6.A01
            java.lang.String r2 = X.AnonymousClass8BS.A0d(r3, r0)
            X.Bm6 r1 = r3.A00
            X.8ZT r1 = (X.AnonymousClass8ZT) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.userJid_ = r2
            int r0 = r10.A06
            X.9Kb r0 = A01(r0)
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8ZT r1 = (X.AnonymousClass8ZT) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.Bm6 r3 = X.AnonymousClass8BS.A09(r3, r4)
            X.Bm6 r2 = r4.A00
            X.8cO r2 = (X.C166128cO) r2
            r3.getClass()
            X.EE9 r1 = r2.participants_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x013f
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.participants_ = r1
        L_0x013f:
            r1.add(r3)
        L_0x0142:
            X.2m4 r2 = r10.A0B
            if (r2 == 0) goto L_0x0167
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.isCallLink_ = r5
            java.lang.String r2 = r2.A02
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.callLinkToken_ = r2
        L_0x0167:
            int r1 = r10.A07
            if (r1 == 0) goto L_0x0173
            if (r1 == r5) goto L_0x018f
            r0 = 2
            if (r1 == r0) goto L_0x018c
            r0 = 3
            if (r1 == r0) goto L_0x018c
        L_0x0173:
            X.9K3 r0 = X.AnonymousClass9K3.REGULAR
        L_0x0175:
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cO r1 = (X.C166128cO) r1
            int r0 = r0.value
            r1.callType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            X.Bm6 r0 = r4.A0C()
            X.8cO r0 = (X.C166128cO) r0
            return r0
        L_0x018c:
            X.9K3 r0 = X.AnonymousClass9K3.VOICE_CHAT
            goto L_0x0175
        L_0x018f:
            X.9K3 r0 = X.AnonymousClass9K3.SCHEDULED_CALL
            goto L_0x0175
        L_0x0192:
            java.util.ArrayList r8 = r10.A0B()
            com.whatsapp.jid.UserJid r7 = r6.A01
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r8.iterator()
        L_0x01a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            X.C108975cc.A13(r0, r7, r1, r6)
            goto L_0x01a0
        L_0x01b3:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = "CallLogSyncMutation/getSortedParticipants peer jid not found in the participant list"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01be:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r8.iterator()
        L_0x01c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r0, r7)
            X.AnonymousClass3MZ.A1V(r1, r3, r0)
            goto L_0x01c6
        L_0x01dd:
            java.util.ArrayList r0 = X.C29431cG.A0k(r3, r6)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x01e9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0210
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r9)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x01e9
            X.1E2 r0 = r9.A09()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x01e9
            r6.add(r2)
            goto L_0x01e9
        L_0x0210:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r6.iterator()
        L_0x0218:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x025d
            java.lang.Object r7 = r8.next()
            X.9Bv r7 = (X.C178109Bv) r7
            X.8ZT r0 = X.AnonymousClass8ZT.DEFAULT_INSTANCE
            X.Bmt r6 = r0.A0N()
            com.whatsapp.jid.UserJid r0 = r7.A00
            java.lang.String r2 = X.AnonymousClass8BS.A0d(r6, r0)
            X.Bm6 r1 = r6.A00
            X.8ZT r1 = (X.AnonymousClass8ZT) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.userJid_ = r2
            int r0 = r7.A01
            X.9Kb r0 = A01(r0)
            X.Bm6 r1 = X.C17880vN.A0G(r6)
            X.8ZT r1 = (X.AnonymousClass8ZT) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.Bm6 r0 = r6.A0C()
            r3.add(r0)
            goto L_0x0218
        L_0x025d:
            X.Bm6 r2 = X.C17880vN.A0G(r4)
            X.8cO r2 = (X.C166128cO) r2
            X.EE9 r1 = r2.participants_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0272
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.participants_ = r1
        L_0x0272:
            X.DND.A09(r3, r1)
            goto L_0x0142
        L_0x0277:
            X.9KD r0 = X.AnonymousClass9KD.Privacy
            goto L_0x004a
        L_0x027b:
            X.9KD r0 = X.AnonymousClass9KD.Scheduled
            goto L_0x004a
        L_0x027f:
            X.9KD r0 = X.AnonymousClass9KD.None
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A77.A02(X.11S, X.9Bw):X.8cO");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C178119Bw A03(X.C166128cO r39) {
        /*
            r38 = this;
            r2 = 0
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            r8 = r39
            java.lang.String r0 = r8.callCreatorJid_
            com.whatsapp.jid.UserJid r9 = r1.A04(r0)
            r15 = 0
            if (r9 == 0) goto L_0x0129
            boolean r0 = r8.isIncoming_
            r4 = r0 ^ 1
            java.lang.String r0 = r8.callId_
            java.lang.String r3 = X.C40811vJ.A0A(r0)
            if (r3 == 0) goto L_0x0129
            boolean r0 = r8.isCallLink_
            if (r0 == 0) goto L_0x002f
            java.lang.String r5 = r8.callLinkToken_
            if (r5 == 0) goto L_0x002f
            int r0 = r5.length()
            if (r0 == 0) goto L_0x002f
            r0 = -1
            X.2m4 r15 = new X.2m4
            r15.<init>(r9, r5, r0)
        L_0x002f:
            r5 = r9
            X.EE9 r0 = r8.participants_
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a2
            r0 = r9
        L_0x0039:
            r5 = r0
        L_0x003a:
            r0 = -1
            X.4cT r6 = new X.4cT
            r6.<init>(r0, r5, r3, r4)
            long r3 = r8.startTime_
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            boolean r13 = r8.isVideo_
            long r0 = r8.duration_
            int r12 = (int) r0
            int r0 = r8.callResult_
            X.9Kb r0 = X.C179829Kb.A00(r0)
            if (r0 != 0) goto L_0x0054
            X.9Kb r0 = X.C179829Kb.Connected
        L_0x0054:
            int r26 = A00(r0)
            boolean r0 = r8.isDndMode_
            if (r0 == 0) goto L_0x009f
            X.9Il r20 = X.C179559Il.A05
        L_0x005e:
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion
            java.lang.String r0 = r8.groupJid_
            com.whatsapp.jid.GroupJid r17 = r1.A03(r0)
            X.EE9 r0 = r8.participants_
            java.util.ArrayList r5 = X.C108965cb.A0t(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0070:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r14.next()
            X.8ZT r1 = (X.AnonymousClass8ZT) r1
            X.1Dw r7 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r1.userJid_
            com.whatsapp.jid.UserJid r11 = r7.A04(r0)
            if (r11 == 0) goto L_0x0070
            int r0 = r1.callResult_
            X.9Kb r0 = X.C179829Kb.A00(r0)
            if (r0 != 0) goto L_0x0090
            X.9Kb r0 = X.C179829Kb.Connected
        L_0x0090:
            int r10 = A00(r0)
            r0 = -1
            X.9Bv r7 = new X.9Bv
            r7.<init>(r11, r10, r0)
            r5.add(r7)
            goto L_0x0070
        L_0x009f:
            X.9Il r20 = X.C179559Il.NONE
            goto L_0x005e
        L_0x00a2:
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            X.EE9 r0 = r8.participants_
            java.lang.Object r0 = r0.get(r2)
            X.8ZT r0 = (X.AnonymousClass8ZT) r0
            java.lang.String r0 = r0.userJid_
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x003a
        L_0x00b5:
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r16 = r0.A03(r9, r2)
            int r1 = r8.silenceReason_
            if (r1 == 0) goto L_0x0126
            r0 = 1
            if (r1 == r0) goto L_0x0123
            r0 = 2
            if (r1 == r0) goto L_0x0120
            r0 = 3
            if (r1 != r0) goto L_0x0126
            X.9KD r0 = X.AnonymousClass9KD.Lightweight
        L_0x00ca:
            int r1 = r0.ordinal()
            r27 = 0
            if (r1 == r2) goto L_0x00dc
            r0 = 1
            if (r1 == r0) goto L_0x011d
            r0 = 2
            r27 = 2
            if (r1 == r0) goto L_0x00dc
            r27 = 3
        L_0x00dc:
            int r1 = r8.callType_
            if (r1 == 0) goto L_0x011a
            r0 = 1
            if (r1 == r0) goto L_0x0117
            r0 = 2
            if (r1 != r0) goto L_0x011a
            X.9K3 r0 = X.AnonymousClass9K3.VOICE_CHAT
        L_0x00e8:
            int r1 = r0.ordinal()
            r28 = 0
            if (r1 == r2) goto L_0x00f7
            r0 = 1
            r28 = 1
            if (r1 == r0) goto L_0x00f7
            r28 = 2
        L_0x00f7:
            r18 = 0
            r29 = -1
            r33 = 0
            X.9Bw r14 = new X.9Bw
            r22 = r18
            r23 = r18
            r37 = r2
            r21 = r18
            r24 = r5
            r25 = r12
            r31 = r3
            r35 = r13
            r36 = r2
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37)
            return r14
        L_0x0117:
            X.9K3 r0 = X.AnonymousClass9K3.SCHEDULED_CALL
            goto L_0x00e8
        L_0x011a:
            X.9K3 r0 = X.AnonymousClass9K3.REGULAR
            goto L_0x00e8
        L_0x011d:
            r27 = 1
            goto L_0x00dc
        L_0x0120:
            X.9KD r0 = X.AnonymousClass9KD.Privacy
            goto L_0x00ca
        L_0x0123:
            X.9KD r0 = X.AnonymousClass9KD.Scheduled
            goto L_0x00ca
        L_0x0126:
            X.9KD r0 = X.AnonymousClass9KD.None
            goto L_0x00ca
        L_0x0129:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A77.A03(X.8cO):X.9Bw");
    }

    public static final int A00(C179829Kb r1) {
        switch (r1.ordinal()) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 6;
            case 4:
                return 2;
            case 6:
                return 3;
            default:
                return 0;
        }
    }

    public static final C179829Kb A01(int i) {
        switch (i) {
            case 1:
                return C179829Kb.Cancelled;
            case 2:
                return C179829Kb.Missed;
            case 3:
                return C179829Kb.Unavailable;
            case 4:
                return C179829Kb.Rejected;
            case 5:
                return C179829Kb.Connected;
            case 6:
                return C179829Kb.AcceptedElsewhere;
            default:
                return C179829Kb.Invalid;
        }
    }
}
