package com.whatsapp.payments.ui;

import com.whatsapp.wds.components.button.WDSButton;

public abstract class SimpleCustomPaymentBottomSheet extends Hilt_SimpleCustomPaymentBottomSheet {
    public WDSButton A00;

    /* JADX WARNING: Removed duplicated region for block: B:112:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r24, android.view.LayoutInflater r25, android.view.ViewGroup r26) {
        /*
            r23 = this;
            r0 = 2131626960(0x7f0e0bd0, float:1.888117E38)
            r12 = 0
            r2 = r25
            r1 = r26
            android.view.View r21 = r2.inflate(r0, r1, r12)
            r11 = r23
            boolean r3 = r11 instanceof com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet
            if (r3 == 0) goto L_0x0311
            r10 = 0
            r9 = 0
            r8 = 0
        L_0x0015:
            r7 = 0
            if (r3 == 0) goto L_0x0148
            r14 = r11
            com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet r14 = (com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet) r14
            android.content.Context r0 = r14.A14()
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r0)
            android.content.Context r0 = r14.A14()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626369(0x7f0e0981, float:1.8879972E38)
            android.view.View r6 = r1.inflate(r0, r2)
            r0 = 2131429132(0x7f0b070c, float:1.8479928E38)
            android.view.View r20 = r6.findViewById(r0)
            r0 = 2131433553(0x7f0b1851, float:1.8488895E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r6, r0)
            r0 = 2131433554(0x7f0b1852, float:1.8488897E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r6, r0)
            r0 = 2131433552(0x7f0b1850, float:1.8488893E38)
            com.whatsapp.TextEmojiLabel r15 = X.AnonymousClass3MX.A0W(r6, r0)
            X.1R2 r13 = r14.A07
            if (r13 == 0) goto L_0x0144
            X.11S r0 = r14.A00
            if (r0 == 0) goto L_0x0140
            com.whatsapp.jid.PhoneUserJid r5 = X.AnonymousClass11S.A00(r0)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1BI r0 = r14.A04
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r0)
            X.2tK r0 = X.C63572tK.A0E
            java.lang.String r1 = "55"
            X.1Ln r0 = r14.A02
            if (r0 == 0) goto L_0x013c
            boolean r1 = r13.A0i(r0, r5, r3, r1)
            r0 = 8
            r3 = 1
            if (r1 == 0) goto L_0x0131
            r2 = 2131889176(0x7f120c18, float:1.9413008E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r14.A08
            r1[r12] = r0
            X.AnonymousClass8BT.A18(r4, r14, r1, r2)
        L_0x0080:
            java.lang.String r0 = r14.A09
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "paymentInstructionTxt"
        L_0x0086:
            X.C18070vi.A11(r0)
            throw r7
        L_0x008a:
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3MW.A09(r0)
            android.text.util.Linkify.addLinks(r2, r3)
            int r1 = r2.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r13 = r2.getSpans(r12, r1, r0)
            android.text.style.URLSpan[] r13 = (android.text.style.URLSpan[]) r13
            android.text.SpannableStringBuilder r5 = X.AnonymousClass3MW.A09(r2)
            X.C18070vi.A0b(r13)
            int r0 = r13.length
            r22 = r0
            r4 = 0
        L_0x00a8:
            r0 = r22
            if (r4 >= r0) goto L_0x00e2
            r2 = r13[r4]
            int r19 = r5.getSpanStart(r2)
            int r18 = r5.getSpanEnd(r2)
            int r17 = r5.getSpanFlags(r2)
            r5.removeSpan(r2)
            android.content.Context r16 = r14.A14()
            android.content.Context r3 = r14.A1n()
            r1 = 2130968627(0x7f040033, float:1.7545913E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r1 = X.AnonymousClass1YL.A00(r3, r1, r0)
            X.8dB r3 = new X.8dB
            r0 = r16
            r3.<init>((android.content.Context) r0, (android.text.style.URLSpan) r2, (com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet) r14, (int) r1)
            r2 = r19
            r1 = r18
            r0 = r17
            r5.setSpan(r3, r2, r1, r0)
            int r4 = r4 + 1
            goto L_0x00a8
        L_0x00e2:
            X.0ve r0 = r14.A03
            if (r0 == 0) goto L_0x030d
            X.AnonymousClass3Ma.A1L(r0, r15)
            r15.setText(r5)
            r1 = 39
            r0 = r20
            X.AnonymousClass3Ma.A1D(r0, r14, r1)
            boolean r0 = r14.A2L()
            if (r0 == 0) goto L_0x0103
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getChildAt(r12)
            r0.setBackground(r7)
        L_0x0103:
            r0 = 2131431441(0x7f0b1011, float:1.8484611E38)
            X.1bI r2 = X.C72453Mb.A0s(r6, r0)
            boolean r0 = r14.A0B
            if (r0 != 0) goto L_0x0115
            r0 = 8
        L_0x0110:
            r2.A04(r0)
            goto L_0x02bc
        L_0x0115:
            java.lang.String r0 = r14.A0A
            if (r0 == 0) goto L_0x02bc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02bc
            android.view.View r1 = r2.A02()
            r0 = 2131436317(0x7f0b231d, float:1.84945E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r1, r0)
            java.lang.String r0 = r14.A0A
            r1.setText(r0)
            r0 = 0
            goto L_0x0110
        L_0x0131:
            r4.setVisibility(r0)
            r0 = 2131889175(0x7f120c17, float:1.9413006E38)
            r2.setText(r0)
            goto L_0x0080
        L_0x013c:
            java.lang.String r0 = "jidMapRepository"
            goto L_0x0086
        L_0x0140:
            java.lang.String r0 = "meManager"
            goto L_0x0086
        L_0x0144:
            java.lang.String r0 = "paymentsUtil"
            goto L_0x0086
        L_0x0148:
            r2 = r11
            com.whatsapp.payments.ui.BrazilPixBottomSheet r2 = (com.whatsapp.payments.ui.BrazilPixBottomSheet) r2
            android.content.Context r0 = r2.A14()
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r0)
            android.content.Context r0 = r2.A14()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626388(0x7f0e0994, float:1.888001E38)
            android.view.View r6 = r1.inflate(r0, r3)
            r0 = 2131433863(0x7f0b1987, float:1.8489524E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.A00 = r0
            r0 = 2131433869(0x7f0b198d, float:1.8489536E38)
            android.view.View r0 = r6.findViewById(r0)
            com.whatsapp.payments.ui.components.PixPaymentInfoView r0 = (com.whatsapp.payments.ui.components.PixPaymentInfoView) r0
            r2.A08 = r0
            r0 = 2131429132(0x7f0b070c, float:1.8479928E38)
            android.view.View r16 = r6.findViewById(r0)
            com.whatsapp.payments.ui.components.PixPaymentInfoView r0 = r2.A08
            if (r0 == 0) goto L_0x018d
            com.whatsapp.TextEmojiLabel r1 = r0.A04
            if (r1 == 0) goto L_0x018d
            java.lang.String r0 = r2.A0B
            r1.setText(r0)
        L_0x018d:
            com.whatsapp.payments.ui.components.PixPaymentInfoView r0 = r2.A08
            if (r0 == 0) goto L_0x019a
            com.whatsapp.TextEmojiLabel r1 = r0.A05
            if (r1 == 0) goto L_0x019a
            java.lang.String r0 = r2.A0D
            r1.setText(r0)
        L_0x019a:
            r0 = 2131436317(0x7f0b231d, float:1.84945E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r6, r0)
            java.lang.String r0 = r2.A0F
            r1.setText(r0)
            r0 = 2131427794(0x7f0b01d2, float:1.8477214E38)
            android.view.View r3 = r6.findViewById(r0)
            boolean r1 = r2.A0G
            r0 = 8
            if (r1 != 0) goto L_0x01b4
            r0 = 0
        L_0x01b4:
            r3.setVisibility(r0)
            r0 = 2131431714(0x7f0b1122, float:1.8485165E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r6, r0)
            boolean r0 = com.whatsapp.payments.ui.BrazilPixBottomSheet.A03(r2)
            if (r0 == 0) goto L_0x02ff
            X.0ve r4 = r2.A03
            if (r4 == 0) goto L_0x030d
            r1 = 7569(0x1d91, float:1.0606E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            boolean r1 = r2.A0G
            if (r0 == 0) goto L_0x02f6
            r0 = 2131894610(0x7f122152, float:1.942403E38)
            if (r1 != 0) goto L_0x01dc
            r0 = 2131894597(0x7f122145, float:1.9424003E38)
        L_0x01dc:
            r3.setText(r0)
            android.content.Context r3 = r2.A1n()
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Context"
            X.C18070vi.A0z(r3, r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r2)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r14 = 1
            r13 = 1098907648(0x41800000, float:16.0)
            float r5 = android.util.TypedValue.applyDimension(r14, r13, r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r2)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = android.util.TypedValue.applyDimension(r14, r0, r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout"
            X.C18070vi.A0z(r4, r0)
            int r15 = (int) r1
            float r0 = r5 + r1
            int r0 = (int) r0
            r4.setPadding(r15, r0, r15, r12)
            r0 = 2131431714(0x7f0b1122, float:1.8485165E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r6, r0)
            r0 = 17
            r4.setGravity(r0)
            r4.setPadding(r12, r12, r12, r12)
            X.1sv r0 = new X.1sv
            r0.<init>(r12, r15, r12, r15)
            X.C43531zx.A03(r4, r0)
            r0 = 2131429132(0x7f0b070c, float:1.8479928E38)
            android.view.View r0 = r6.findViewById(r0)
            r4 = 8
            r0.setVisibility(r4)
            r0 = 2131432198(0x7f0b1306, float:1.8486147E38)
            X.AnonymousClass3MY.A1B(r6, r0, r4)
            r0 = 2131433682(0x7f0b18d2, float:1.8489157E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r6, r0)
            r15 = 2131894617(0x7f122159, float:1.9424044E38)
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x024d
            r15 = 2131894607(0x7f12214f, float:1.9424024E38)
        L_0x024d:
            android.content.Context r0 = r2.A1n()
            if (r0 == 0) goto L_0x02f3
            java.lang.CharSequence r0 = r0.getText(r15)
        L_0x0257:
            r4.setText(r0)
            r0 = 1103101952(0x41c00000, float:24.0)
            r4.setTextSize(r0)
            com.whatsapp.payments.ui.components.PixPaymentInfoView r0 = r2.A08
            if (r0 == 0) goto L_0x0268
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.A01
            r0.setPadding(r12, r12, r12, r12)
        L_0x0268:
            com.whatsapp.payments.ui.components.PixPaymentInfoView r0 = r2.A08
            if (r0 == 0) goto L_0x0271
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.A01
            r0.setBackground(r7)
        L_0x0271:
            r0 = 2131103233(0x7f060e01, float:1.7818926E38)
            int r4 = X.C19740yt.A00(r3, r0)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r2)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r14, r13, r0)
            r3.setCornerRadius(r0)
            r3.setColor(r4)
            com.whatsapp.payments.ui.components.PixPaymentInfoView r0 = r2.A08
            if (r0 == 0) goto L_0x0298
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.A02
            r0.setBackground(r3)
        L_0x0298:
            com.whatsapp.payments.ui.components.PixPaymentInfoView r4 = r2.A08
            if (r4 == 0) goto L_0x02a8
            int r3 = (int) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r0
            float r0 = r0 + r1
            int r1 = (int) r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.A02
            r0.setPadding(r3, r1, r3, r1)
        L_0x02a8:
            com.whatsapp.payments.ui.components.PixPaymentInfoView r3 = r2.A08
            if (r3 == 0) goto L_0x02b5
            int r1 = (int) r5
            X.1sv r0 = new X.1sv
            r0.<init>(r1, r1, r1, r1)
            X.C43531zx.A03(r3, r0)
        L_0x02b5:
            r1 = 28
            r0 = r16
            X.AnonymousClass3Ma.A1D(r0, r2, r1)
        L_0x02bc:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x02e3
            if (r8 == 0) goto L_0x02e3
            r1 = 2131434059(0x7f0b1a4b, float:1.8489921E38)
            r0 = r21
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0r(r0, r1)
            r11.A00 = r0
            r0.setText(r10)
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A00
            r0.setOnClickListener(r8)
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A00
            r0.setVisibility(r12)
            if (r9 == 0) goto L_0x02e3
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A00
            r0.setIcon((int) r9)
        L_0x02e3:
            android.text.TextUtils.isEmpty(r7)
            r1 = 2131436493(0x7f0b23cd, float:1.8494858E38)
            r0 = r21
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0D(r0, r1)
            r0.addView(r6)
            return r21
        L_0x02f3:
            r0 = r7
            goto L_0x0257
        L_0x02f6:
            r0 = 2131894609(0x7f122151, float:1.9424028E38)
            if (r1 != 0) goto L_0x0309
            r0 = 2131894598(0x7f122146, float:1.9424005E38)
            goto L_0x0309
        L_0x02ff:
            boolean r1 = r2.A0G
            r0 = 2131894608(0x7f122150, float:1.9424026E38)
            if (r1 != 0) goto L_0x0309
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
        L_0x0309:
            r3.setText(r0)
            goto L_0x02b5
        L_0x030d:
            java.lang.String r0 = "abProps"
            goto L_0x0086
        L_0x0311:
            r4 = r11
            com.whatsapp.payments.ui.BrazilPixBottomSheet r4 = (com.whatsapp.payments.ui.BrazilPixBottomSheet) r4
            boolean r0 = com.whatsapp.payments.ui.BrazilPixBottomSheet.A03(r4)
            if (r0 == 0) goto L_0x034b
            X.0ve r2 = r4.A03
            if (r2 == 0) goto L_0x035e
            r1 = 7569(0x1d91, float:1.0606E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0348
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            java.lang.String r10 = r1.getString(r0)
        L_0x0333:
            X.C18070vi.A0X(r10)
        L_0x0336:
            boolean r0 = com.whatsapp.payments.ui.BrazilPixBottomSheet.A03(r4)
            r9 = 2131231835(0x7f08045b, float:1.8079762E38)
            if (r0 == 0) goto L_0x0340
            r9 = 0
        L_0x0340:
            r0 = 1
            X.AFO r8 = new X.AFO
            r8.<init>(r11, r0)
            goto L_0x0015
        L_0x0348:
            java.lang.String r10 = ""
            goto L_0x0336
        L_0x034b:
            r1 = 2131894619(0x7f12215b, float:1.9424048E38)
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0355
            r1 = 2131889051(0x7f120b9b, float:1.9412755E38)
        L_0x0355:
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r4)
            java.lang.String r10 = r0.getString(r1)
            goto L_0x0333
        L_0x035e:
            java.lang.String r0 = "abProps"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.SimpleCustomPaymentBottomSheet.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }
}
