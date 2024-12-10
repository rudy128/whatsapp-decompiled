package X;

/* renamed from: X.ASa  reason: case insensitive filesystem */
public abstract class C20616ASa implements B83, B85, C436820m {
    public final C18030ve A00;

    public C20616ASa(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C179689Jj r0;
        int i;
        C18070vi.A0d(a6d, 0);
        AnonymousClass206 A01 = A01(a6d);
        if (A01 == null) {
            return null;
        }
        if (A01 instanceof AnonymousClass212) {
            C166418cr r5 = a6d.A08;
            if (AnonymousClass000.A1O(r5.bitField0_ & 67108864)) {
                C166048cG r02 = r5.messageContextInfo_;
                C166048cG r4 = r02;
                C166048cG r2 = r02;
                if (r02 == null) {
                    r02 = C166048cG.DEFAULT_INSTANCE;
                }
                if ((r02.bitField0_ & 16) != 0) {
                    AnonymousClass212 r1 = (AnonymousClass212) A01;
                    if (r4 == null) {
                        r2 = C166048cG.DEFAULT_INSTANCE;
                    }
                    r1.A19(r2.messageAddOnDurationInSecs_);
                }
                if (r4 == null) {
                    r4 = C166048cG.DEFAULT_INSTANCE;
                }
                if ((r4.bitField0_ & 256) != 0) {
                    if (C18020vd.A05(C18040vf.A02, this.A00, 9108)) {
                        AnonymousClass212 r42 = (AnonymousClass212) A01;
                        C166048cG r03 = r5.messageContextInfo_;
                        if (r03 == null) {
                            r03 = C166048cG.DEFAULT_INSTANCE;
                        }
                        int i2 = r03.messageAddOnExpiryType_;
                        if (i2 == 1 || i2 != 2) {
                            r0 = C179689Jj.STATIC;
                        } else {
                            r0 = C179689Jj.DEPENDENT_ON_PARENT;
                        }
                        int i3 = r0.value;
                        if (i3 == C179689Jj.STATIC.value) {
                            i = 1;
                        } else {
                            i = 0;
                            if (i3 == C179689Jj.DEPENDENT_ON_PARENT.value) {
                                i = 2;
                            }
                        }
                        r42.A00 = i;
                    }
                }
            }
            ((AnonymousClass212) A01).A1A(A01.A0I);
        }
        return A01;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.212, X.22A, X.206] */
    /* JADX WARNING: type inference failed for: r8v20, types: [X.212, X.23q] */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x021a, code lost:
        if (r8.encIv_ == null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0145, code lost:
        if (r1 != 2) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A01(X.C20077A6d r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C167048fJ
            r2 = r18
            if (r0 == 0) goto L_0x00bf
            X.8fJ r3 = (X.C167048fJ) r3
            X.8cr r6 = r2.A08
            int r1 = r6.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r8 = 0
            if (r0 == 0) goto L_0x00a4
            X.0ve r4 = r3.A01
            r1 = 4164(0x1044, float:5.835E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x00a4
            X.8ZG r5 = r6.scheduledCallEditMessage_
            if (r5 != 0) goto L_0x002a
            X.8ZG r5 = X.AnonymousClass8ZG.DEFAULT_INSTANCE
        L_0x002a:
            int r4 = r5.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r4)
            r1 = 11
            if (r0 == 0) goto L_0x00b8
            r0 = r4 & 2
            if (r0 == 0) goto L_0x00b1
            X.8cq r0 = r5.key_
            if (r0 != 0) goto L_0x003e
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x003e:
            boolean r0 = X.AnonymousClass9P4.A00(r0)
            if (r0 == 0) goto L_0x00aa
            X.8ZG r6 = r6.scheduledCallEditMessage_
            if (r6 != 0) goto L_0x004a
            X.8ZG r6 = X.AnonymousClass8ZG.DEFAULT_INSTANCE
        L_0x004a:
            X.205 r5 = r2.A0A
            long r0 = r2.A03
            r4 = 86
            X.23q r8 = new X.23q
            r8.<init>(r5, r4, r0)
            r0 = 0
            r8.A00 = r0
            X.8cq r7 = r6.key_
            if (r7 != 0) goto L_0x005e
            X.8cq r7 = X.C166408cq.DEFAULT_INSTANCE
        L_0x005e:
            java.lang.String r0 = r7.remoteJid_
            X.1BI r4 = X.AnonymousClass3MX.A0l(r0)
            X.C17960vV.A07(r4)
            boolean r1 = r7.fromMe_
            java.lang.String r0 = r7.id_
            X.205 r4 = X.AnonymousClass205.A01(r4, r0, r1)
            java.lang.String r0 = r7.participant_
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A02(r0)
            X.A51 r0 = new X.A51
            r0.<init>(r1, r4)
            r8.A05 = r0
            int r1 = r6.editType_
            if (r1 == 0) goto L_0x00a7
            r0 = 1
            if (r1 != r0) goto L_0x00a7
            X.9Jh r1 = X.AnonymousClass9Jh.CANCEL
        L_0x0085:
            X.9Jh r0 = X.AnonymousClass9Jh.CANCEL
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            r8.A00 = r0
            X.1BI r4 = r2.A05
            X.11S r2 = r3.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00a5
        L_0x0097:
            X.8cq r1 = r6.key_
            if (r1 != 0) goto L_0x009d
            X.8cq r1 = X.C166408cq.DEFAULT_INSTANCE
        L_0x009d:
            r0 = 0
            X.A51 r0 = X.AnonymousClass9AT.A00(r2, r4, r1, r5, r0)
            r8.A05 = r0
        L_0x00a4:
            return r8
        L_0x00a5:
            r4 = 0
            goto L_0x0097
        L_0x00a7:
            X.9Jh r1 = X.AnonymousClass9Jh.UNKNOWN
            goto L_0x0085
        L_0x00aa:
            java.lang.String r0 = "scheduled_call_edit_add_on_invalid_parent_key"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x00b1:
            java.lang.String r0 = "scheduled_call_edit_add_on_missing_edit_type"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x00b8:
            java.lang.String r0 = "scheduled_call_edit_add_on_missing_creation_message_key"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x00bf:
            boolean r0 = r3 instanceof X.AnonymousClass8fH
            if (r0 == 0) goto L_0x01cd
            X.8fH r3 = (X.AnonymousClass8fH) r3
            r6 = 0
            X.8cr r7 = r2.A08
            int r1 = r7.bitField1_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x01cb
            int r8 = r2.A00
            r5 = 2
            r4 = 11
            if (r8 != r5) goto L_0x01bc
            X.8aE r10 = r7.pinInChatMessage_
            if (r10 != 0) goto L_0x00dc
            X.8aE r10 = X.C164888aE.DEFAULT_INSTANCE
        L_0x00dc:
            int r0 = r10.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01b5
            int r1 = r10.type_
            if (r1 == 0) goto L_0x0105
            r0 = 1
            if (r1 == r0) goto L_0x0102
            if (r1 != r5) goto L_0x0105
            X.9Jw r5 = X.C179779Jw.UNPIN_FOR_ALL
        L_0x00ed:
            X.9Jw r8 = X.C179779Jw.UNPIN_FOR_ALL
            if (r5 != r8) goto L_0x0108
            X.8cG r0 = r7.messageContextInfo_
            if (r0 != 0) goto L_0x00f7
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
        L_0x00f7:
            int r0 = r0.messageAddOnDurationInSecs_
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "Unpin request had expiration."
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x0102:
            X.9Jw r5 = X.C179779Jw.PIN_FOR_ALL
            goto L_0x00ed
        L_0x0105:
            X.9Jw r5 = X.C179779Jw.UNKNOWN_TYPE
            goto L_0x00ed
        L_0x0108:
            X.9Jw r9 = X.C179779Jw.PIN_FOR_ALL
            if (r5 == r9) goto L_0x011d
            if (r5 == r8) goto L_0x011d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported pin type: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x011d:
            X.8cq r0 = r10.key_
            if (r0 != 0) goto L_0x0123
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0123:
            boolean r0 = X.AnonymousClass9P4.A00(r0)
            if (r0 == 0) goto L_0x01ae
            X.8aE r7 = r7.pinInChatMessage_
            if (r7 != 0) goto L_0x012f
            X.8aE r7 = X.C164888aE.DEFAULT_INSTANCE
        L_0x012f:
            X.205 r5 = r2.A0A
            X.1BI r4 = r2.A05
            long r0 = r2.A03
            X.C18070vi.A0b(r7)
            X.22C r2 = new X.22C
            r2.<init>(r5, r0)
            int r1 = r7.type_
            if (r1 == 0) goto L_0x0147
            r0 = 1
            if (r1 == r0) goto L_0x01ac
            r0 = 2
            if (r1 == r0) goto L_0x0149
        L_0x0147:
            X.9Jw r8 = X.C179779Jw.UNKNOWN_TYPE
        L_0x0149:
            int r1 = r8.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0161
            r0 = 2
            if (r1 == r0) goto L_0x0160
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessagePinInChatProtobuf Unhandled pin type "
            java.lang.String r0 = X.AnonymousClass001.A1E(r8, r0, r1)
            X.C17960vV.A0F(r6, r0)
        L_0x0160:
            r0 = 0
        L_0x0161:
            r2.A00 = r0
            long r0 = r7.senderTimestampMs_
            r2.A01 = r0
            X.8cq r9 = r7.key_
            if (r9 != 0) goto L_0x016d
            X.8cq r9 = X.C166408cq.DEFAULT_INSTANCE
        L_0x016d:
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = r9.remoteJid_
            X.1BI r8 = r1.A02(r0)
            X.C17960vV.A07(r8)
            boolean r1 = r9.fromMe_
            java.lang.String r0 = r9.id_
            X.205 r8 = X.AnonymousClass205.A01(r8, r0, r1)
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            X.8cq r0 = r7.key_
            if (r0 != 0) goto L_0x0188
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0188:
            java.lang.String r0 = r0.participant_
            com.whatsapp.jid.UserJid r1 = r1.A04(r0)
            X.A51 r0 = new X.A51
            r0.<init>(r1, r8)
            r2.A05 = r0
            X.11S r1 = r3.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01aa
            if (r4 == 0) goto L_0x01aa
        L_0x019d:
            X.8cq r0 = r7.key_
            if (r0 != 0) goto L_0x01a3
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x01a3:
            X.A51 r0 = X.AnonymousClass9AT.A00(r1, r4, r0, r5, r6)
            r2.A05 = r0
            return r2
        L_0x01aa:
            r4 = 0
            goto L_0x019d
        L_0x01ac:
            r8 = r9
            goto L_0x0149
        L_0x01ae:
            java.lang.String r0 = "Invalid parent message key."
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x01b5:
            java.lang.String r0 = "Missing pin-in-chat type."
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x01bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid edited version: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r8)
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x01cb:
            r2 = 0
            return r2
        L_0x01cd:
            boolean r0 = r3 instanceof X.C167058fK
            if (r0 == 0) goto L_0x0344
            X.8fK r3 = (X.C167058fK) r3
            X.8cr r9 = X.C20077A6d.A01(r2)
            int r1 = r9.bitField1_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0342
            X.0ve r4 = r3.A03
            r1 = 5563(0x15bb, float:7.795E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x01f1
            r0 = 85
            X.23U r8 = r2.A04(r0)
            return r8
        L_0x01f1:
            X.8a3 r8 = r9.encEventResponseMessage_
            if (r8 != 0) goto L_0x01f7
            X.8a3 r8 = X.C164778a3.DEFAULT_INSTANCE
        L_0x01f7:
            X.C18070vi.A0b(r8)
            int r0 = r8.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r4 = 1
            if (r0 == 0) goto L_0x028b
            X.8cq r0 = r8.eventCreationMessageKey_
            if (r0 != 0) goto L_0x020b
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x028b
        L_0x020b:
            r1 = 1
        L_0x020c:
            X.AxD r0 = X.C22073AxD.A00
            X.C181339Qc.A00(r0, r1)
            int r0 = r8.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x021c
            X.DSQ r0 = r8.encIv_
            r1 = 1
            if (r0 != 0) goto L_0x021d
        L_0x021c:
            r1 = 0
        L_0x021d:
            X.AxE r0 = X.C22074AxE.A00
            X.C181339Qc.A00(r0, r1)
            X.DSQ r0 = r8.encIv_
            int r1 = r0.A02()
            r0 = 12
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            X.AxF r0 = X.C22075AxF.A00
            X.C181339Qc.A00(r0, r1)
            int r0 = r8.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0289
            X.DSQ r0 = r8.encPayload_
            if (r0 == 0) goto L_0x0289
        L_0x023d:
            X.AxG r0 = X.C22076AxG.A00
            X.C181339Qc.A00(r0, r4)
            X.00H r1 = r3.A05
            java.lang.Object r4 = r1.get()
            X.A2I r4 = (X.A2I) r4
            X.205 r14 = r2.A0A
            X.8cq r0 = r8.eventCreationMessageKey_
            if (r0 != 0) goto L_0x0252
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0252:
            X.1BI r7 = r14.A00
            X.A51 r5 = r4.A01(r7, r0, r14)
            X.00H r0 = r3.A06
            java.lang.Object r4 = r0.get()
            X.2mE r4 = (X.C59392mE) r4
            X.205 r0 = r5.A01
            X.205 r4 = r4.A01(r0)
            X.00H r0 = r3.A04
            X.206 r6 = X.AnonymousClass1W2.A01(r4, r0)
            if (r6 == 0) goto L_0x0333
            boolean r0 = X.C20133A8t.A0B(r6)
            if (r0 != 0) goto L_0x0333
            boolean r0 = r6 instanceof X.C445823z
            r4 = 0
            if (r0 != 0) goto L_0x028d
            boolean r0 = r6 instanceof X.AnonymousClass23Q
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = "FMessageEventResponseProtobuf/parseFMessageResponse - parent message is not an event message nor sender revoke"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "parent message is not event message nor sender revoke"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x0289:
            r4 = 0
            goto L_0x023d
        L_0x028b:
            r1 = 0
            goto L_0x020c
        L_0x028d:
            X.1BI r11 = r2.A05
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x02ea
            X.1MZ r0 = r3.A02
            boolean r9 = r0.A0I(r7)
            X.1CJ r6 = r3.A01
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r7)
            int r6 = r6.A06(r0)
            r0 = 3
            if (r6 == r0) goto L_0x02e3
            if (r9 != 0) goto L_0x02e3
            boolean r6 = X.C22971Dz.A0T(r7)
            X.11S r0 = r3.A00
            if (r6 == 0) goto L_0x02de
            X.1E2 r12 = r0.A09()
        L_0x02b6:
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
        L_0x02b8:
            X.DSQ r9 = r8.encIv_
            X.DSQ r10 = r8.encPayload_
            X.8cq r13 = r8.eventCreationMessageKey_
            if (r13 != 0) goto L_0x02c2
            X.8cq r13 = X.C166408cq.DEFAULT_INSTANCE
        L_0x02c2:
            X.1MZ r0 = r3.A02
            boolean r16 = r0.A0I(r7)
            java.lang.String r15 = "Event Response"
            X.9tZ r8 = new X.9tZ
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.get()
            X.A2I r0 = (X.A2I) r0
            byte[] r3 = r0.A03(r8)
            r1 = 11
            if (r3 == 0) goto L_0x032c
            goto L_0x02fe
        L_0x02de:
            com.whatsapp.jid.PhoneUserJid r12 = X.AnonymousClass11S.A00(r0)
            goto L_0x02b6
        L_0x02e3:
            X.11S r0 = r3.A00
            X.1E2 r12 = r0.A09()
            goto L_0x02b8
        L_0x02ea:
            boolean r0 = X.C22971Dz.A0d(r7)
            if (r0 == 0) goto L_0x02f9
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r7, r0)
            r12 = r7
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            goto L_0x02b8
        L_0x02f9:
            com.whatsapp.jid.UserJid r12 = X.C22941Dw.A00(r11)
            goto L_0x02b8
        L_0x02fe:
            X.8cg r0 = X.C166308cg.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0325 }
            X.Bm6 r7 = X.C23577Bm6.A07(r0, r3)     // Catch:{ 1PN -> 0x0325 }
            X.8cg r7 = (X.C166308cg) r7     // Catch:{ 1PN -> 0x0325 }
            X.C18070vi.A0X(r7)     // Catch:{ 1PN -> 0x0325 }
            X.9K9 r6 = r7.A0R()
            long r2 = r2.A03
            long r0 = r7.timestampMs_
            X.2Qx r10 = X.C196689vT.A01(r6)
            int r6 = r7.extraGuestCount_
            r12 = 0
            if (r4 >= r6) goto L_0x031b
            r12 = r6
        L_0x031b:
            X.24H r8 = new X.24H
            r9 = r14
            r11 = r5
            r13 = r2
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r15)
            return r8
        L_0x0325:
            java.lang.String r0 = "EventResponseMessageManager/decryptEventResponseMessage: failed to parse payload into protobuf"
            X.1hd r0 = X.AnonymousClass8BU.A0a(r0, r1)
            throw r0
        L_0x032c:
            java.lang.String r0 = "EventResponseMessageManager/decryptEventMessageResponsePayload eventResponseMessageBytes is null"
            X.1hd r0 = X.AnonymousClass8BU.A0a(r0, r1)
            throw r0
        L_0x0333:
            long r0 = r2.A03
            byte[] r11 = r9.A0M()
            X.24H r8 = new X.24H
            r9 = r14
            r10 = r5
            r12 = r0
            r8.<init>((X.AnonymousClass205) r9, (X.A51) r10, (byte[]) r11, (long) r12)
            return r8
        L_0x0342:
            r8 = 0
            return r8
        L_0x0344:
            X.8fG r3 = (X.C167038fG) r3
            r6 = 0
            X.8cr r7 = r2.A08
            int r0 = r7.bitField1_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03fd
            int r0 = r2.A00
            X.8aA r5 = r7.keepInChatMessage_
            if (r5 != 0) goto L_0x0357
            X.8aA r5 = X.C164848aA.DEFAULT_INSTANCE
        L_0x0357:
            r4 = 11
            if (r0 == 0) goto L_0x037b
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x037b
            int r0 = r5.keepType_
            X.9KJ r1 = X.AnonymousClass9KJ.A00(r0)
            if (r1 != 0) goto L_0x036b
            X.9KJ r1 = X.AnonymousClass9KJ.UNKNOWN
        L_0x036b:
            X.9KJ r0 = X.AnonymousClass9KJ.KEEP_FOR_ALL
            if (r1 != r0) goto L_0x037b
            java.lang.String r0 = "MessageUtils/hasValidKeepInChatMessage edit version and keeptype as kept are both set"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "edit version and keeptype as kept are both set"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x037b:
            X.8cq r0 = r5.key_
            if (r0 != 0) goto L_0x0381
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0381:
            boolean r0 = X.AnonymousClass9P4.A00(r0)
            if (r0 == 0) goto L_0x03f6
            X.8aA r7 = r7.keepInChatMessage_
            if (r7 != 0) goto L_0x038d
            X.8aA r7 = X.C164848aA.DEFAULT_INSTANCE
        L_0x038d:
            X.205 r5 = r2.A0A
            long r0 = r2.A03
            X.C18070vi.A0b(r7)
            r8 = 68
            X.22A r4 = new X.22A
            r4.<init>(r5, r8, r0)
            X.8cq r9 = r7.key_
            if (r9 != 0) goto L_0x03a1
            X.8cq r9 = X.C166408cq.DEFAULT_INSTANCE
        L_0x03a1:
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = r9.remoteJid_
            X.1BI r8 = r1.A02(r0)
            if (r8 == 0) goto L_0x03f1
            boolean r1 = r9.fromMe_
            java.lang.String r0 = r9.id_
            X.205 r8 = X.AnonymousClass205.A01(r8, r0, r1)
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r9.participant_
            com.whatsapp.jid.UserJid r1 = r1.A04(r0)
            X.A51 r0 = new X.A51
            r0.<init>(r1, r8)
            r4.A05 = r0
            int r0 = r7.keepType_
            X.9KJ r1 = X.AnonymousClass9KJ.A00(r0)
            if (r1 != 0) goto L_0x03cc
            X.9KJ r1 = X.AnonymousClass9KJ.UNKNOWN
        L_0x03cc:
            X.9KJ r0 = X.AnonymousClass9KJ.KEEP_FOR_ALL
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            r4.A01 = r0
            long r0 = r7.timestampMs_
            r4.A02 = r0
            X.1BI r2 = r2.A05
            X.11S r1 = r3.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x03ef
            if (r2 == 0) goto L_0x03ef
        L_0x03e2:
            X.8cq r0 = r7.key_
            if (r0 != 0) goto L_0x03e8
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x03e8:
            X.A51 r0 = X.AnonymousClass9AT.A00(r1, r2, r0, r5, r6)
            r4.A05 = r0
            return r4
        L_0x03ef:
            r2 = 0
            goto L_0x03e2
        L_0x03f1:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x03f6:
            java.lang.String r0 = "Invalid parent key."
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r4)
            throw r0
        L_0x03fd:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20616ASa.A01(X.A6d):X.206");
    }
}
