package X;

public final class ASL implements B83, C436820m, C22575BDq {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void BDb(C19998A2m a2m, AnonymousClass206 r4) {
        C17960vV.A0F(false, "FMessageEdit.buildProtobufMessage() must never be called directly.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0277, code lost:
        r0 = r0.A04(r11, r15);
        r1 = X.AnonymousClass8BS.A0L(r14);
        r0.getClass();
        r1.contextInfo_ = r0;
        r1.bitField0_ |= 16384;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.B5C r37, X.C19998A2m r38, X.AnonymousClass206 r39) {
        /*
            r36 = this;
            r11 = r38
            r14 = r37
            boolean r18 = X.C72453Mb.A1Z(r11)
            r1 = r36
            X.0ve r9 = r1.A00
            r2 = 8784(0x2250, float:1.2309E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r17 = X.C18020vd.A05(r0, r9, r2)
            X.8X8 r8 = r11.A00
            X.Bm6 r0 = r8.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8Xc r0 = r0.editedMessage_
            if (r0 != 0) goto L_0x0020
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0020:
            X.Bmt r7 = r0.A0O()
            X.8X6 r7 = (X.AnonymousClass8X6) r7
            X.8X8 r6 = X.AnonymousClass8X6.A00(r7)
            if (r17 == 0) goto L_0x0314
            X.Bm6 r0 = r8.A00
        L_0x002e:
            X.8cr r0 = (X.C166418cr) r0
            X.8cm r0 = r0.protocolMessage_
            if (r0 != 0) goto L_0x0036
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0036:
            X.Bmt r5 = r0.A0O()
            X.8Wt r5 = (X.C163898Wt) r5
            X.Bm6 r0 = r5.A00
            X.8cm r0 = (X.C166368cm) r0
            X.8cr r0 = r0.editedMessage_
            if (r0 != 0) goto L_0x0046
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0046:
            X.Bmt r4 = r0.A0O()
            X.8X8 r4 = (X.AnonymousClass8X8) r4
            r10 = r39
            X.36c r3 = X.C60492o7.A00(r10)
            if (r3 == 0) goto L_0x0342
            X.Bm6 r0 = r5.A00
            X.8cm r0 = (X.C166368cm) r0
            X.8cq r0 = r0.key_
            if (r0 != 0) goto L_0x005e
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x005e:
            X.8X7 r2 = X.AnonymousClass8BR.A0f(r0)
            X.00H r0 = r1.A01
            java.lang.Object r13 = r0.get()
            X.9lu r13 = (X.C191029lu) r13
            X.205 r12 = r3.A02
            com.whatsapp.jid.UserJid r1 = r10.A0I()
            r0 = r18
            r13.A00(r1, r2, r12, r0)
            X.ARw r14 = (X.C20612ARw) r14
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0103;
                case 1: goto L_0x0156;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01dd;
                case 4: goto L_0x0255;
                case 5: goto L_0x02a2;
                default: goto L_0x007c;
            }
        L_0x007c:
            X.C20133A8t.A09(r9, r4)
            r0 = r18
            X.C18070vi.A0d(r4, r0)
            X.8Wx r0 = r11.A01
            r20 = r0
            boolean r0 = r11.A0B
            r24 = r0
            boolean r0 = r11.A06
            r25 = r0
            boolean r0 = r11.A05
            r26 = r0
            X.1cl r0 = r11.A02
            r21 = r0
            byte[] r0 = r11.A0G
            r23 = r0
            boolean r0 = r11.A0D
            r27 = r0
            boolean r0 = r11.A04
            r28 = r0
            boolean r0 = r11.A0C
            r29 = r0
            boolean r0 = r11.A0A
            r16 = r0
            boolean r15 = r11.A0E
            boolean r14 = r11.A0F
            boolean r13 = r11.A08
            boolean r12 = r11.A09
            java.lang.Integer r1 = r11.A03
            boolean r11 = r11.A07
            X.A2m r0 = new X.A2m
            r18 = r0
            r19 = r4
            r22 = r1
            r30 = r16
            r31 = r15
            r32 = r14
            r33 = r13
            r34 = r12
            r35 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.C50122Tf.A00(r9, r0, r4, r10)
            X.8X8 r0 = r0.A00
            X.8cm r1 = X.AnonymousClass8BS.A0H(r5)
            X.8cr r0 = X.AnonymousClass8BR.A0e(r0)
            r0.getClass()
            r1.editedMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r5.A0H(r2)
            X.9Kc r0 = X.C179839Kc.MESSAGE_EDIT
            r5.A0G(r0)
            long r1 = r3.A01
            X.8cm r3 = X.AnonymousClass8BS.A0H(r5)
            int r0 = r3.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r3.bitField0_ = r0
            r3.timestampMs_ = r1
            if (r17 == 0) goto L_0x0318
            r8.A0N(r5)
            return
        L_0x0103:
            java.lang.Object r12 = r14.A01
            X.ATG r12 = (X.ATG) r12
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            java.lang.Class<X.23z> r1 = X.C445823z.class
            boolean r0 = r10 instanceof X.C445823z
            if (r0 != 0) goto L_0x0128
            java.lang.String r3 = X.C17890vO.A0U(r10)
            java.lang.String r2 = r1.getName()
            java.lang.String r0 = ""
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = X.C17890vO.A0W(r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass206.A02(r10, r2, r3, r0, r1)
            throw r0
        L_0x0128:
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8c4 r0 = r0.eventMessage_
            if (r0 != 0) goto L_0x0132
            X.8c4 r0 = X.AnonymousClass8c4.DEFAULT_INSTANCE
        L_0x0132:
            X.Bmt r1 = r0.A0O()
            X.8Sm r1 = (X.C162788Sm) r1
            X.C18070vi.A0b(r1)
            r0 = r10
            X.23z r0 = (X.C445823z) r0
            X.ATG.A00(r0, r12, r11, r1)
            X.Bm6 r0 = r1.A0C()
            X.8c4 r0 = (X.AnonymousClass8c4) r0
            X.8cr r12 = X.AnonymousClass8BV.A0J(r4, r0)
            r12.eventMessage_ = r0
            int r1 = r12.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r0
            r12.bitField1_ = r1
            goto L_0x007c
        L_0x0156:
            java.lang.Object r15 = r14.A01
            X.AT7 r15 = (X.AT7) r15
            r14 = r10
            X.21i r14 = (X.C438921i) r14
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cW r0 = r0.documentMessage_
            if (r0 != 0) goto L_0x0167
            X.8cW r0 = X.C166208cW.DEFAULT_INSTANCE
        L_0x0167:
            X.Bmt r13 = r0.A0O()
            X.8Si r13 = (X.C162748Si) r13
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0198
            X.8Si r13 = X.AT7.A00(r11, r15, r14)
        L_0x0177:
            boolean r0 = X.C19998A2m.A00(r11, r14)
            if (r0 == 0) goto L_0x0193
            X.A79 r0 = r15.A00
            X.8cd r0 = r0.A04(r11, r14)
            X.8cW r12 = X.AnonymousClass8BT.A0X(r13)
            r0.getClass()
            r12.contextInfo_ = r0
            int r1 = r12.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r12.bitField0_ = r1
        L_0x0193:
            r4.A0J(r13)
            goto L_0x007c
        L_0x0198:
            java.lang.String r12 = r14.A01
            if (r12 == 0) goto L_0x0177
            X.8cW r1 = X.AnonymousClass8BT.A0X(r13)
            int r0 = r1.bitField0_
            r16 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r16
            r1.bitField0_ = r0
            r1.caption_ = r12
            goto L_0x0177
        L_0x01ab:
            java.lang.Object r13 = r14.A01
            X.AT6 r13 = (X.AT6) r13
            r15 = r10
            X.21t r15 = (X.C440021t) r15
            X.8Ww r14 = X.AnonymousClass8X8.A03(r4)
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x01ca
            X.8Ww r14 = X.AT6.A00(r11, r13, r15)
        L_0x01c0:
            boolean r0 = X.C19998A2m.A00(r11, r15)
            if (r0 == 0) goto L_0x028a
            X.A79 r0 = r13.A00
            goto L_0x0277
        L_0x01ca:
            java.lang.String r12 = r15.A18()
            if (r12 == 0) goto L_0x01c0
            X.8ca r1 = X.AnonymousClass8BS.A0L(r14)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r12
            goto L_0x01c0
        L_0x01dd:
            java.lang.Object r15 = r14.A01
            X.ASy r15 = (X.C20640ASy) r15
            r14 = r10
            X.21c r14 = (X.C438321c) r14
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cc r0 = r0.imageMessage_
            if (r0 != 0) goto L_0x01ee
            X.8cc r0 = X.C166268cc.DEFAULT_INSTANCE
        L_0x01ee:
            X.Bmt r13 = r0.A0O()
            X.8We r13 = (X.C163748We) r13
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0242
            X.9pi r1 = r15.A01
            X.Bm6 r0 = r8.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cc r0 = r0.imageMessage_
            if (r0 != 0) goto L_0x0206
            X.8cc r0 = X.C166268cc.DEFAULT_INSTANCE
        L_0x0206:
            X.Bmt r0 = r0.A0O()
            X.8We r0 = (X.C163748We) r0
            X.8We r13 = r1.A01(r11, r0, r14)
        L_0x0210:
            boolean r0 = X.C19998A2m.A00(r11, r14)
            if (r0 == 0) goto L_0x022b
            X.A79 r0 = r15.A00
            X.8cd r0 = r0.A04(r11, r14)
            X.8cc r1 = X.AnonymousClass8BS.A0G(r13)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
        L_0x022b:
            X.8cr r1 = X.AnonymousClass8BS.A0M(r4)
            X.Bm6 r0 = r13.A0C()
            X.8cc r0 = (X.C166268cc) r0
            r0.getClass()
            r1.imageMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            goto L_0x007c
        L_0x0242:
            java.lang.String r12 = r14.A18()
            if (r12 == 0) goto L_0x0210
            X.8cc r1 = X.AnonymousClass8BS.A0G(r13)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.caption_ = r12
            goto L_0x0210
        L_0x0255:
            java.lang.Object r13 = r14.A01
            X.ASz r13 = (X.C20641ASz) r13
            r15 = r10
            X.21W r15 = (X.AnonymousClass21W) r15
            X.8Ww r14 = X.AnonymousClass8X8.A03(r4)
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x028f
            X.8Ww r14 = X.AnonymousClass8X8.A03(r8)
            X.A1e r0 = r13.A01
            r0.A02(r11, r14, r15)
        L_0x026f:
            boolean r0 = X.C19998A2m.A00(r11, r15)
            if (r0 == 0) goto L_0x028a
            X.A79 r0 = r13.A00
        L_0x0277:
            X.8cd r0 = r0.A04(r11, r15)
            X.8ca r1 = X.AnonymousClass8BS.A0L(r14)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x028a:
            r4.A0S(r14)
            goto L_0x007c
        L_0x028f:
            java.lang.String r12 = r15.A18()
            if (r12 == 0) goto L_0x026f
            X.8ca r1 = X.AnonymousClass8BS.A0L(r14)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r12
            goto L_0x026f
        L_0x02a2:
            java.lang.Object r13 = r14.A01
            X.ATC r13 = (X.ATC) r13
            boolean r0 = r10 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x033b
            r12 = r10
            X.210 r12 = (X.AnonymousClass210) r12
            X.AW0 r0 = X.AnonymousClass25B.A00(r12)
            if (r0 != 0) goto L_0x0334
            boolean r0 = X.C20097A7a.A05(r12)
            if (r0 != 0) goto L_0x0334
            java.lang.String r0 = r12.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02ed
            java.lang.String r0 = r12.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02ed
            com.whatsapp.TextData r0 = r12.A02
            if (r0 != 0) goto L_0x02ed
            r0 = 1024(0x400, double:5.06E-321)
            boolean r0 = r12.A11(r0)
            if (r0 != 0) goto L_0x02ed
            boolean r0 = X.C19998A2m.A00(r11, r12)
            if (r0 != 0) goto L_0x02ed
            java.lang.String r12 = r12.A0P()
            X.8cr r1 = X.AnonymousClass8X8.A04(r4, r12)
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.conversation_ = r12
            goto L_0x007c
        L_0x02ed:
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cb r0 = r0.extendedTextMessage_
            if (r0 != 0) goto L_0x02f7
            X.8cb r0 = X.C166258cb.DEFAULT_INSTANCE
        L_0x02f7:
            X.Bmt r1 = r0.A0O()
            X.8Wd r1 = (X.C163738Wd) r1
            X.ATC.A03(r13, r1, r12)
            boolean r0 = X.C19998A2m.A00(r11, r12)
            if (r0 == 0) goto L_0x030f
            X.A79 r0 = r13.A01
            X.8cd r0 = r0.A04(r11, r12)
            r1.A0G(r0)
        L_0x030f:
            r4.A0K(r1)
            goto L_0x007c
        L_0x0314:
            X.Bm6 r0 = r6.A00
            goto L_0x002e
        L_0x0318:
            r6.A0N(r5)
            r7.A0H(r6)
            X.8cr r1 = X.AnonymousClass8BS.A0M(r8)
            X.Bm6 r0 = r7.A0C()
            X.8Xc r0 = (X.C163988Xc) r0
            r0.getClass()
            r1.editedMessage_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField1_ = r0
            return
        L_0x0334:
            java.lang.String r0 = "FMessageTextSerializer/buildUpdatedMessage/Payment or Button text message are not editable"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x033b:
            java.lang.String r0 = "FMessageTextSerializer/buildUpdatedMessage/updated message must be FMessageText"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0342:
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASL.A00(X.B5C, X.A2m, X.206):void");
    }

    public ASL(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r10.A00, 7358) == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r11) {
        /*
            r10 = this;
            X.8cr r3 = X.C20077A6d.A01(r11)
            X.9Kc r1 = X.C181609Rd.A00(r11)
            X.9Kc r0 = X.C179839Kc.MESSAGE_EDIT
            if (r1 != r0) goto L_0x009a
            X.8cm r4 = X.AnonymousClass8BS.A0I(r3)
            X.C18070vi.A0X(r4)
            X.8cr r2 = r4.editedMessage_
            if (r2 != 0) goto L_0x0019
            X.8cr r2 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0019:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 != 0) goto L_0x003a
            X.Bmt r1 = r2.A0O()
            X.8X8 r1 = (X.AnonymousClass8X8) r1
            X.8cG r0 = r3.messageContextInfo_
            if (r0 != 0) goto L_0x0033
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
        L_0x0033:
            r1.A0V(r0)
            X.8cr r2 = X.AnonymousClass8BR.A0e(r1)
        L_0x003a:
            X.A6d r5 = r11.A03(r2)
            r0 = 1
            r5.A00 = r0
            X.00H r0 = r10.A03
            X.206 r3 = X.AnonymousClass8BV.A0K(r5, r0)
            int r1 = r3.A0u
            r0 = 92
            if (r1 != r0) goto L_0x005a
            X.0ve r2 = r10.A00
            r1 = 7358(0x1cbe, float:1.0311E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 1
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            boolean r0 = r3 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x006a
            boolean r0 = r3 instanceof X.AnonymousClass21V
            if (r0 != 0) goto L_0x006a
            if (r1 != 0) goto L_0x006a
            r0 = 0
            X.23U r3 = r11.A04(r0)
        L_0x006a:
            X.00H r0 = r10.A02
            java.lang.Object r0 = r0.get()
            X.124 r0 = (X.AnonymousClass124) r0
            r0.A00(r5, r3)
            r0 = 131072(0x20000, double:6.47582E-319)
            r3.A0b(r0)
            X.205 r0 = r3.A0v
            X.1BI r2 = r0.A00
            boolean r1 = r0.A02
            X.8cq r0 = r4.key_
            if (r0 != 0) goto L_0x0087
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0087:
            java.lang.String r0 = r0.id_
            X.205 r5 = X.AnonymousClass205.A01(r2, r0, r1)
            long r6 = r3.A0I
            long r8 = r4.timestampMs_
            X.36c r4 = new X.36c
            r4.<init>(r5, r6, r8)
            X.C60492o7.A01(r3, r4)
            return r3
        L_0x009a:
            int r0 = r3.bitField1_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x00c8
            X.0ve r2 = r10.A00
            r1 = 2189(0x88d, float:3.067E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00c8
            X.8Xc r0 = r3.editedMessage_
            if (r0 != 0) goto L_0x00b6
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x00b6:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x00bc
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x00bc:
            X.C18070vi.A0X(r0)
            X.A6d r0 = r11.A03(r0)
            X.206 r3 = r10.CBG(r0)
            return r3
        L_0x00c8:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASL.CBG(X.A6d):X.206");
    }
}
