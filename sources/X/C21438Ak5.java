package X;

/* renamed from: X.Ak5  reason: case insensitive filesystem */
public class C21438Ak5 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C21438Ak5(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A05 = str2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01e1;
                case 2: goto L_0x00aa;
                case 3: goto L_0x010c;
                case 4: goto L_0x0171;
                case 5: goto L_0x01f5;
                case 6: goto L_0x0209;
                case 7: goto L_0x021d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A01
            X.A0Q r3 = (X.A0Q) r3
            java.lang.Object r9 = r0.A02
            X.A5D r9 = (X.A5D) r9
            java.lang.Object r12 = r0.A03
            X.1BI r12 = (X.AnonymousClass1BI) r12
            java.lang.String r13 = r0.A04
            X.1QD r0 = r3.A02
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "pix_prominence_used"
            X.C17880vN.A1F(r1, r0, r2)
            X.1ey r0 = r3.A04
            java.lang.String r2 = "pix_key"
            java.util.ArrayList r5 = r0.A00(r2)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01c0
            android.content.Context r4 = r3.A01
            r3 = 0
            java.lang.Object r0 = r5.get(r3)
            X.AEs r0 = (X.C20284AEs) r0
            X.8pb r1 = r0.A08
            java.lang.Object r0 = r5.get(r3)
            X.AEs r0 = (X.C20284AEs) r0
            java.lang.String r7 = r0.A0A
            java.lang.String r8 = "chat"
            if (r1 == 0) goto L_0x01ba
            if (r7 == 0) goto L_0x01ba
            X.8pV r1 = (X.AnonymousClass8pV) r1
            java.util.HashMap r1 = r1.A03
            java.lang.String r0 = "pix_key_type"
            java.lang.Object r0 = r1.get(r0)
            X.C17960vV.A07(r0)
            X.ADJ r0 = (X.ADJ) r0
            java.lang.String r6 = r0.A00
            java.lang.String r0 = "pix_display_name"
            java.lang.Object r0 = r1.get(r0)
            X.C17960vV.A07(r0)
            X.ADJ r0 = (X.ADJ) r0
            java.lang.String r5 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            X.C17960vV.A07(r0)
            X.ADJ r0 = (X.ADJ) r0
            java.lang.String r3 = r0.A00
            X.00H r0 = r9.A0B
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.BrazilPaymentPixSendKeyActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_receiver_jid"
            X.AnonymousClass3MY.A13(r2, r12, r0)
            java.lang.String r0 = "previous_screen"
            r2.putExtra(r0, r8)
            X.AnonymousClass8BR.A1D(r2, r13)
            java.lang.String r0 = "extra_pix_info_key_credential_id"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "pix_info_key_type"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "pix_info_key_value"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "pix_info_display_name"
            r2.putExtra(r0, r5)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            r4.startActivity(r2)
        L_0x00a9:
            return
        L_0x00aa:
            java.lang.Object r1 = r0.A01
            X.48j r1 = (X.AnonymousClass48j) r1
            java.lang.Object r3 = r0.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r4 = r0.A03
            X.210 r4 = (X.AnonymousClass210) r4
            java.lang.String r10 = r0.A04
            java.lang.String r12 = r0.A05
            java.lang.Object r5 = r1.A01
            X.4aH r5 = (X.C88644aH) r5
            X.11S r0 = r5.A02
            if (r0 == 0) goto L_0x00a9
            boolean r0 = X.AnonymousClass25A.A0P(r0, r3)
            if (r0 != 0) goto L_0x00a9
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass3Ma.A0o(r3)
            X.AR0 r0 = r5.A04
            if (r0 == 0) goto L_0x010a
            if (r6 == 0) goto L_0x010a
            X.0ve r2 = r5.A0G
            r1 = 12571(0x311b, float:1.7616E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x010a
            X.AR0 r0 = r5.A04
            java.lang.Object r0 = r0.A02(r6)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x00ec:
            X.A2e r6 = r5.A05
            if (r6 == 0) goto L_0x00a9
            X.2r5 r0 = r5.A0I
            int r13 = r0.A01(r3)
            X.9z6 r2 = X.C198899z6.A00
            X.0ve r1 = r5.A0G
            java.lang.String r0 = r4.A07
            java.lang.String r9 = r2.A00(r1, r0)
            com.whatsapp.jid.UserJid r7 = r3.A0I()
            java.lang.String r11 = "link_preview"
            r6.A03(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x010a:
            r8 = 0
            goto L_0x00ec
        L_0x010c:
            java.lang.String r3 = r0.A04
            java.lang.String r1 = r0.A05
            java.lang.Object r4 = r0.A02
            X.121 r4 = (X.AnonymousClass121) r4
            java.lang.Object r2 = r0.A03
            X.1W6 r2 = (X.AnonymousClass1W6) r2
            X.1BI r1 = X.AnonymousClass3MX.A0l(r1)
            r0 = 0
            X.205 r0 = X.AnonymousClass205.A01(r1, r3, r0)
            X.206 r5 = X.C108945cZ.A0s(r0, r2)
            r3 = 1
            if (r5 == 0) goto L_0x0149
            X.9rz r0 = X.AnonymousClass8BR.A0i(r5)
            if (r0 == 0) goto L_0x0149
            X.9rz r0 = X.AnonymousClass8BR.A0i(r5)
            if (r0 == 0) goto L_0x00a9
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x013a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r0 = r1.next()
            X.9t8 r0 = (X.C195309t8) r0
            r0.A00 = r3
            goto L_0x013a
        L_0x0149:
            boolean r0 = r5 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x00a9
            X.AEt r2 = X.AnonymousClass8BR.A0g(r5)
            if (r2 == 0) goto L_0x00a9
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x00a9
            X.AEk r0 = r2.A06
            if (r0 == 0) goto L_0x00a9
            java.util.List r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0162:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r0 = r1.next()
            X.ADl r0 = (X.C20253ADl) r0
            r0.A00 = r3
            goto L_0x0162
        L_0x0171:
            java.lang.Object r1 = r0.A01
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r7 = r0.A02
            X.1MK r7 = (X.AnonymousClass1MK) r7
            java.lang.Object r5 = r0.A03
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r6 = r0.A04
            java.lang.String r4 = r0.A05
            boolean r2 = X.AnonymousClass8BU.A1X(r5)
            if (r1 == 0) goto L_0x00a9
            X.1MI r0 = r7.A01
            X.1M9 r0 = r0.A00
            X.1E7 r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.A10
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = com.whatsapp.util.Log.getStackTraceInfo(r5)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "calling"
            boolean r3 = X.AnonymousClass1YF.A0Y(r1, r0, r2)
            X.190 r2 = r7.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C108975cc.A14(r1, r6)
            r1.append(r4)
            java.lang.String r0 = ":isCallingStack="
            java.lang.String r1 = X.C17900vP.A0D(r0, r1, r3)
            java.lang.String r0 = "AxolotlLidJidMigrationUtils/logMissingLid"
            r2.A0E(r0, r1, r5)
            return
        L_0x01ba:
            java.lang.String r0 = "triggerSendPaymentFlow / Missing additional payment method data or credential id"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01c0:
            android.content.Context r10 = r3.A01
            r16 = 0
            r11 = 0
            java.lang.String r14 = "chat"
            r15 = r11
            r9.A00(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x01cc:
            java.lang.Object r5 = r0.A01
            X.DNk r5 = (X.C26962DNk) r5
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A02
            java.lang.String r2 = r0.A05
            java.lang.Object r1 = r0.A03
            X.Bnp r0 = new X.Bnp
            r0.<init>(r3, r1, r4, r2)
            r5.A09(r0)
            return
        L_0x01e1:
            java.lang.Object r4 = r0.A01
            com.whatsapp.calling.service.OutgoingSignalingHandler r4 = (com.whatsapp.calling.service.OutgoingSignalingHandler) r4
            java.lang.Object r3 = r0.A02
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.String r2 = r0.A04
            java.lang.String r1 = r0.A05
            java.lang.Object r0 = r0.A03
            com.whatsapp.protocol.VoipStanzaChildNode r0 = (com.whatsapp.protocol.VoipStanzaChildNode) r0
            r4.m36lambda$sendCallStanza$0$comwhatsappcallingserviceOutgoingSignalingHandler(r3, r2, r1, r0)
            return
        L_0x01f5:
            java.lang.String r4 = r0.A04
            java.lang.Object r3 = r0.A01
            com.whatsapp.media.download.service.MediaDownloadJobService r3 = (com.whatsapp.media.download.service.MediaDownloadJobService) r3
            java.lang.Object r2 = r0.A02
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
            java.lang.Object r1 = r0.A03
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r0 = r0.A05
            com.whatsapp.media.download.service.MediaDownloadJobService.A03(r2, r3, r4, r0, r1)
            return
        L_0x0209:
            java.lang.Object r4 = r0.A01
            com.whatsapp.notification.DirectReplyService r4 = (com.whatsapp.notification.DirectReplyService) r4
            java.lang.Object r3 = r0.A02
            X.30h r3 = (X.C676430h) r3
            java.lang.Object r2 = r0.A03
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
            r4.A0B(r2, r3, r1, r0)
            return
        L_0x021d:
            java.lang.Object r7 = r0.A01
            X.8z9 r7 = (X.C175708z9) r7
            java.lang.Object r6 = r0.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.String r4 = r0.A04
            java.lang.String r15 = r0.A05
            java.lang.Object r8 = r0.A03
            X.9YQ r8 = (X.AnonymousClass9YQ) r8
            r0 = 4
            X.C18070vi.A0d(r8, r0)
            X.00H r1 = r7.A08
            java.lang.String r14 = X.C17890vO.A0T(r1)
            X.0ve r5 = r7.A04
            X.1Ln r3 = r7.A03
            X.190 r0 = r7.A00
            java.lang.String r2 = "get-order-transaction"
            com.whatsapp.jid.UserJid r6 = X.C60432o1.A01(r0, r3, r5, r6, r2)
            X.C18070vi.A0X(r6)
            X.1cX r5 = X.C108955ca.A0Y()
            java.lang.String r3 = "xmlns"
            java.lang.String r0 = "w:pay"
            X.AnonymousClass8BY.A19(r5, r3, r0)
            java.lang.String r3 = "type"
            java.lang.String r0 = "get"
            X.C29591cX.A01(r5, r3, r0)
            boolean r10 = X.AnonymousClass8BY.A1X(r5, r14)
            X.1cX r3 = X.AnonymousClass8BS.A0R()
            java.lang.String r0 = "action"
            X.C29591cX.A01(r3, r0, r2)
            java.lang.String r0 = "receiver"
            X.AnonymousClass8BT.A1E(r6, r3, r0)
            r16 = 1
            r18 = 100
            r20 = r10
            boolean r0 = X.C29601cY.A04(r15, r16, r18, r20)
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = "order_id"
            X.C29591cX.A01(r3, r0, r15)
        L_0x027b:
            r20 = r4
            r21 = r16
            r23 = r18
            r25 = r10
            boolean r0 = X.C29601cY.A04(r20, r21, r23, r25)
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = "payment_config_id"
            X.C29591cX.A01(r3, r0, r4)
        L_0x028e:
            X.1ca r13 = X.C29591cX.A00(r3, r5)
            X.9ui r6 = X.C197889xR.A04(r7, r2)
            X.00H r0 = r7.A0A
            X.9r1 r0 = X.AnonymousClass8BR.A0b(r0)
            java.lang.Integer r9 = r0.A00(r2)
            X.1OZ r11 = X.C17880vN.A0U(r1)
            X.118 r0 = r7.A02
            android.content.Context r3 = r0.A00
            X.1KB r4 = r7.A01
            X.00H r0 = r7.A09
            X.1jG r5 = X.AnonymousClass8BR.A0a(r0)
            X.8zZ r2 = new X.8zZ
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r16 = 0
            r15 = 204(0xcc, float:2.86E-43)
            r12 = r2
            r11.A0N(r12, r13, r14, r15, r16)
            return
        L_0x02be:
            r4.CQw(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21438Ak5.run():void");
    }

    public C21438Ak5(AnonymousClass1BI r2, A5D a5d, A0Q a0q, String str) {
        this.A00 = 8;
        this.A01 = a0q;
        this.A02 = a5d;
        this.A03 = r2;
        this.A04 = str;
        this.A05 = "p2p_context";
    }
}
