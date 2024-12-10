package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.Aes  reason: case insensitive filesystem */
public final /* synthetic */ class C21124Aes implements AnonymousClass1TI {
    public final /* synthetic */ AnonymousClass1KN A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ ADQ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r4 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r29) {
        /*
            r28 = this;
            r4 = r29
            r0 = r28
            com.whatsapp.payments.ui.BrazilPaymentActivity r11 = r0.A01
            boolean r1 = r0.A05
            X.1KN r9 = r0.A00
            java.lang.String r15 = r0.A03
            X.ADQ r2 = r0.A02
            java.lang.String r14 = r0.A04
            java.util.List r4 = (java.util.List) r4
            X.1QO r0 = r11.A0P
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0020
            X.AEo r0 = r11.A4m()
            if (r0 != 0) goto L_0x002a
        L_0x0020:
            X.1QO r0 = r11.A0P
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x003d
            X.AEs r0 = X.AnonymousClass8BR.A0Q(r4, r3)
            int r1 = r0.A03
            r0 = 2
            if (r1 == r0) goto L_0x0045
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003d:
            r3 = 0
            goto L_0x0045
        L_0x003f:
            int r3 = X.A8e.A01(r4)
            if (r4 == 0) goto L_0x0156
        L_0x0045:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0156
            X.AEs r18 = X.AnonymousClass8BR.A0Q(r4, r3)
            X.C17960vV.A07(r18)
            com.whatsapp.payments.ui.widget.PaymentView r0 = r11.A0W
            if (r0 == 0) goto L_0x0152
            X.77d r24 = r0.getStickerIfSelected()
        L_0x005a:
            r26 = 0
            if (r0 == 0) goto L_0x014e
            X.AEX r20 = r0.getPaymentBackground()
        L_0x0062:
            if (r24 != 0) goto L_0x011d
            if (r20 != 0) goto L_0x011d
            r8 = r26
        L_0x0068:
            X.1KI r1 = r11.A08
            java.lang.String r0 = "BRL"
            X.1KJ r16 = r1.A01(r0)
            com.whatsapp.payments.ui.PaymentBottomSheet r13 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r13.<init>()
            com.whatsapp.jid.UserJid r0 = r11.A0J
            if (r0 == 0) goto L_0x0119
            X.1QS r0 = r11.A0Q
            X.1KH r3 = X.AnonymousClass8BR.A0R(r0)
            com.whatsapp.jid.UserJid r1 = r11.A0J
            X.1Ln r0 = r11.A09
            X.8pI r1 = X.C62862s7.A00(r0, r3, r1)
        L_0x0087:
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r11.A0X
            if (r0 == 0) goto L_0x0116
            X.1DT r0 = r0.A02
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0116
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r11.A0X
            X.1DT r0 = r0.A02
            java.lang.Object r0 = r0.A06()
            X.9xu r0 = (X.C198179xu) r0
            java.lang.Object r10 = r0.A01
            X.A0v r10 = (X.C19962A0v) r10
        L_0x00a1:
            X.1QO r0 = r11.A0P
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x00af
            X.AEo r0 = r11.A4m()
            if (r0 != 0) goto L_0x00bb
        L_0x00af:
            X.1QO r0 = r11.A0P
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0102
            boolean r0 = r11.A0m
            if (r0 == 0) goto L_0x0102
        L_0x00bb:
            r27 = 0
        L_0x00bd:
            com.whatsapp.jid.UserJid r1 = r11.A0J
            X.C17960vV.A07(r1)
            java.lang.String r0 = r11.A0t
            r22 = r18
            r23 = r1
            r24 = r2
            r25 = r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r12 = com.whatsapp.payments.ui.ConfirmPaymentFragment.A00(r22, r23, r24, r25, r26, r27)
            r13.A02 = r12
            X.A9t r0 = r13.A03
            r0.A00 = r11
            X.AZm r7 = new X.AZm
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r12.A0H = r7
            X.AZg r15 = new X.AZg
            r17 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r12.A0G = r15
            r11.A0T = r12
            X.90Y r2 = r11.A0O
            java.lang.String r1 = "confirm_payment"
            int r0 = r11.A00
            r2.Bix(r1, r0)
            r11.CMl(r13)
        L_0x00fc:
            X.Af0 r0 = r11.A04
            r0.A0D()
            return
        L_0x0102:
            if (r1 == 0) goto L_0x0113
            com.whatsapp.jid.UserJid r0 = r1.A03
            if (r0 == 0) goto L_0x0113
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x0113
            int r27 = r1.A08()
            goto L_0x00bd
        L_0x0113:
            r27 = 1
            goto L_0x00bd
        L_0x0116:
            r10 = r26
            goto L_0x00a1
        L_0x0119:
            r1 = r26
            goto L_0x0087
        L_0x011d:
            X.2rZ r5 = r11.A0S
            X.1BI r4 = r11.A0G
            X.C17960vV.A07(r4)
            com.whatsapp.jid.UserJid r3 = r11.A0J
            long r0 = r11.A02
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x014b
            X.00H r6 = r11.A0d
            X.206 r23 = X.AnonymousClass1W2.A02(r6, r0)
        L_0x0134:
            com.whatsapp.payments.ui.widget.PaymentView r0 = r11.A0W
            if (r0 == 0) goto L_0x0148
            java.lang.Integer r25 = r0.getStickerSendOrigin()
        L_0x013c:
            r21 = r4
            r22 = r3
            r19 = r5
            X.Af0 r8 = r19.A01(r20, r21, r22, r23, r24, r25)
            goto L_0x0068
        L_0x0148:
            r25 = 0
            goto L_0x013c
        L_0x014b:
            r23 = r26
            goto L_0x0134
        L_0x014e:
            r20 = r26
            goto L_0x0062
        L_0x0152:
            r24 = 0
            goto L_0x005a
        L_0x0156:
            java.lang.String r1 = "brpay_p_add_card"
            r0 = 0
            com.whatsapp.payments.ui.BrazilPaymentActivity.A10(r11, r1, r15, r14, r0)
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21124Aes.accept(java.lang.Object):void");
    }

    public /* synthetic */ C21124Aes(AnonymousClass1KN r1, BrazilPaymentActivity brazilPaymentActivity, ADQ adq, String str, String str2, boolean z) {
        this.A01 = brazilPaymentActivity;
        this.A05 = z;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = adq;
        this.A04 = str2;
    }
}
