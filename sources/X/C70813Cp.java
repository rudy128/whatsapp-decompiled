package X;

import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

/* renamed from: X.3Cp  reason: invalid class name and case insensitive filesystem */
public class C70813Cp implements Runnable {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C70813Cp(AnonymousClass8Gd r2, boolean z) {
        this.A00 = 25;
        this.A01 = r2;
        this.A02 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: com.whatsapp.qrcode.contactqr.QrScanCodeFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v120, resolved type: com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v121, resolved type: com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0408, code lost:
        if (r5.A03 != null) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0608, code lost:
        if (r6.A08() != false) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x077c, code lost:
        r3.CHI(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x077f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0a09, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a0a, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a0d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0ac2, code lost:
        r1 = new X.C146777Qo((java.lang.Object) r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b25, code lost:
        r0 = 2131890432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0b28, code lost:
        if (r3 != false) goto L_0x0b2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0b2a, code lost:
        r0 = 2131890434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0b2d, code lost:
        r1.setContentDescription(r2.A1H(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0b34, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b35, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0b3a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0d9c, code lost:
        r2.BEJ(r1, "MessageNotification1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0da1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0ec9, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0ecc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0fdf, code lost:
        r1.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0fe2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ff, code lost:
        if (r11.A0A.A2N() == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0215, code lost:
        if (r11.A0A.A2N() != false) goto L_0x0217;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r3 = r24
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0f11;
                case 1: goto L_0x0766;
                case 2: goto L_0x074f;
                case 3: goto L_0x0717;
                case 4: goto L_0x0ef8;
                case 5: goto L_0x0eed;
                case 6: goto L_0x0ee3;
                case 7: goto L_0x0ecd;
                case 8: goto L_0x0eba;
                case 9: goto L_0x0ea5;
                case 10: goto L_0x0e20;
                case 11: goto L_0x0e16;
                case 12: goto L_0x0e04;
                case 13: goto L_0x0dfa;
                case 14: goto L_0x06d2;
                case 15: goto L_0x0660;
                case 16: goto L_0x0dac;
                case 17: goto L_0x0da2;
                case 18: goto L_0x0d79;
                case 19: goto L_0x0d52;
                case 20: goto L_0x060b;
                case 21: goto L_0x0d01;
                case 22: goto L_0x0c37;
                case 23: goto L_0x0b3b;
                case 24: goto L_0x0b00;
                case 25: goto L_0x04f1;
                case 26: goto L_0x04a8;
                case 27: goto L_0x0442;
                case 28: goto L_0x03e8;
                case 29: goto L_0x0aef;
                case 30: goto L_0x0ac9;
                case 31: goto L_0x0d0d;
                case 32: goto L_0x038b;
                case 33: goto L_0x0a25;
                case 34: goto L_0x089e;
                case 35: goto L_0x0821;
                case 36: goto L_0x0365;
                case 37: goto L_0x029d;
                case 38: goto L_0x0813;
                case 39: goto L_0x0809;
                case 40: goto L_0x07ae;
                case 41: goto L_0x07a4;
                case 42: goto L_0x00a2;
                case 43: goto L_0x0048;
                case 44: goto L_0x0796;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x0780;
                case 48: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r1 = r3.A02
            java.lang.Object r0 = r3.A01
            X.6pB r0 = (X.AnonymousClass6pB) r0
            if (r1 != 0) goto L_0x0018
            X.1KB r2 = r0.A00
            r1 = 0
            r0 = 2131898558(0x7f1230be, float:1.9432037E38)
            r2.A08(r0, r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r4 = r3.A01
            X.2QL r4 = (X.AnonymousClass2QL) r4
            boolean r1 = r3.A02
            r3 = 0
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.1dS r0 = (X.C30141dS) r0
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0f35
            X.00H r2 = r4.A00
            java.lang.Object r0 = r2.get()
            X.1mM r0 = (X.C35511mM) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A07
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.get()
            X.1mM r0 = (X.C35511mM) r0
            r0.A04(r1, r3)
            return
        L_0x0048:
            java.lang.Object r5 = r3.A01
            com.whatsapp.updates.ui.UpdatesFragment r5 = (com.whatsapp.updates.ui.UpdatesFragment) r5
            boolean r6 = r3.A02
            boolean r0 = r5.A1E
            if (r0 == 0) goto L_0x0018
            com.whatsapp.collections.ObservableRecyclerView r4 = r5.A0C
            if (r4 == 0) goto L_0x009b
            X.5lM r0 = r5.A0N
            r4.setAdapter(r0)
            X.00H r0 = r5.A28()
            java.lang.Object r0 = r0.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0079
            com.whatsapp.collections.ObservableRecyclerView r1 = r5.A0C
            if (r1 == 0) goto L_0x0079
            r0 = 0
            r1.setItemAnimator(r0)
        L_0x0079:
            android.content.Context r0 = r5.A14()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r2, r3, r1, r0)
            r0 = 0
            com.whatsapp.updates.ui.UpdatesFragment.A03(r4, r5, r0, r6)
        L_0x009b:
            X.5lM r0 = r5.A0N
            if (r0 == 0) goto L_0x0018
            r0.A04 = r5
            return
        L_0x00a2:
            java.lang.Object r11 = r3.A01
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r11 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r11
            boolean r6 = r3.A02
            boolean r0 = r11.Bed()
            if (r0 != 0) goto L_0x0018
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r10 = r11.findViewById(r0)
            r0 = 2131430400(0x7f0b0c00, float:1.84825E38)
            android.view.View r9 = r11.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2131431962(0x7f0b121a, float:1.8485668E38)
            android.view.View r4 = r11.findViewById(r0)
            r0 = 2131436467(0x7f0b23b3, float:1.8494805E38)
            android.view.View r2 = r11.findViewById(r0)
            r0 = 2131430281(0x7f0b0b89, float:1.8482259E38)
            android.view.View r7 = r11.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBanner r7 = (com.whatsapp.wds.components.banners.WDSBanner) r7
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            r3 = 1
            r5 = 8
            r8 = 0
            if (r6 != 0) goto L_0x01b9
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x01b9
            r10.setVisibility(r8)
            r4.setVisibility(r8)
            r2.setVisibility(r8)
            r0 = 2131896040(0x7f1226e8, float:1.942693E38)
            r9.setText(r0)
            r0 = -1
            r1.width = r0
            r1 = 7
            X.784 r0 = new X.784
            r0.<init>(r11, r1)
            r4.setOnClickListener(r0)
        L_0x00fe:
            r1 = 2131232954(0x7f0808ba, float:1.8082032E38)
            android.widget.ImageView r4 = r11.A04
            if (r6 == 0) goto L_0x0114
            X.0ve r2 = r11.A0E
            r1 = 10205(0x27dd, float:1.43E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01a7
            r1 = 2131232956(0x7f0808bc, float:1.8082036E38)
        L_0x0114:
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r11, r1)
            r4.setImageDrawable(r0)
            android.view.View r1 = r11.A03
            r0 = 0
            if (r6 == 0) goto L_0x0122
            r0 = 8
        L_0x0122:
            r1.setVisibility(r0)
            android.view.View r1 = r11.A02
            r0 = 8
            if (r6 == 0) goto L_0x012c
            r0 = 0
        L_0x012c:
            r1.setVisibility(r0)
            android.view.View r0 = r11.A01
            if (r6 == 0) goto L_0x0134
            r5 = 0
        L_0x0134:
            r0.setVisibility(r5)
            boolean r0 = r11.A0I
            if (r0 == 0) goto L_0x018c
            boolean r0 = r11.A0H
            if (r0 != 0) goto L_0x018c
            X.0ve r4 = r11.A0E
            X.1np r2 = r11.A0C
            r0 = 2131896043(0x7f1226eb, float:1.9426936E38)
            if (r6 == 0) goto L_0x014b
            r0 = 2131896046(0x7f1226ee, float:1.9426942E38)
        L_0x014b:
            java.lang.String r20 = r11.getString(r0)
            X.11C r15 = r11.A08
            com.whatsapp.WaTextView r13 = r11.A09
            X.00H r0 = r11.A0D
            java.lang.Object r14 = r0.get()
            X.1o3 r14 = (X.C36531o3) r14
            r1 = 18
            X.Ajq r0 = new X.Ajq
            r0.<init>(r1)
            java.lang.String r19 = "two-step-verification"
            r12 = r11
            r16 = r4
            r17 = r2
            r18 = r0
            r21 = r19
            X.A9B.A0N(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0171:
            android.widget.TextView r2 = r11.A07
            X.1eh r0 = r11.A0B
            android.content.SharedPreferences r1 = X.C30901eh.A00(r0)
            java.lang.String r0 = "two_factor_auth_email_set"
            int r1 = X.C17890vO.A00(r1, r0)
            r0 = 2131896032(0x7f1226e0, float:1.9426914E38)
            if (r1 != r3) goto L_0x0188
            r0 = 2131896036(0x7f1226e4, float:1.9426922E38)
        L_0x0188:
            r2.setText(r0)
            return
        L_0x018c:
            com.whatsapp.WaTextView r1 = r11.A09
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x019e
            r0 = 2131896042(0x7f1226ea, float:1.9426934E38)
            if (r6 == 0) goto L_0x019a
            r0 = 2131896045(0x7f1226ed, float:1.942694E38)
        L_0x019a:
            r1.setText(r0)
            goto L_0x0171
        L_0x019e:
            r0 = 2131896041(0x7f1226e9, float:1.9426932E38)
            if (r6 == 0) goto L_0x019a
            r0 = 2131896044(0x7f1226ec, float:1.9426938E38)
            goto L_0x019a
        L_0x01a7:
            X.0vb r0 = r11.A00
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A06
            r1 = 2131232955(0x7f0808bb, float:1.8082034E38)
            if (r0 == 0) goto L_0x0114
            r1 = 2131232957(0x7f0808bd, float:1.8082038E38)
            goto L_0x0114
        L_0x01b9:
            r10.setVisibility(r5)
            r4.setVisibility(r5)
            r2.setVisibility(r5)
            r0 = 2131896039(0x7f1226e7, float:1.9426928E38)
            r9.setText(r0)
            r0 = -2
            r1.width = r0
            r1 = 2131168623(0x7f070d6f, float:1.7951553E38)
            if (r6 == 0) goto L_0x01d3
            r1 = 2131168625(0x7f070d71, float:1.7951557E38)
        L_0x01d3:
            android.widget.ImageView r0 = r11.A04
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r4 = r9.leftMargin
            android.content.res.Resources r0 = r11.getResources()
            int r2 = r0.getDimensionPixelSize(r1)
            int r1 = r9.rightMargin
            int r0 = r9.bottomMargin
            r9.setMargins(r4, r2, r1, r0)
            X.0z4 r0 = r11.A0A
            java.lang.String r0 = r0.A0o()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0201
            X.0z4 r0 = r11.A0A
            boolean r0 = r0.A2N()
            r1 = 1
            if (r0 != 0) goto L_0x0202
        L_0x0201:
            r1 = 0
        L_0x0202:
            X.0z4 r0 = r11.A0A
            java.lang.String r0 = r0.A0o()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0217
            X.0z4 r0 = r11.A0A
            boolean r0 = r0.A2N()
            r4 = 1
            if (r0 == 0) goto L_0x0218
        L_0x0217:
            r4 = 0
        L_0x0218:
            X.00H r0 = r11.A0E
            java.lang.Object r0 = r0.get()
            X.9uM r0 = (X.C196039uM) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0298
            if (r1 != 0) goto L_0x0298
            X.1eh r0 = r11.A0B
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0298
            X.0ve r2 = r11.A0E
            r1 = 10205(0x27dd, float:1.43E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0298
            r7.setVisibility(r8)
            com.whatsapp.TextEmojiLabel r1 = r7.A01
            if (r4 == 0) goto L_0x0276
            r0 = 2131896054(0x7f1226f6, float:1.9426958E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r4 = r7.A00
            r0 = 2131896055(0x7f1226f7, float:1.942696E38)
            java.lang.String r2 = r11.getString(r0)
            r0 = 20
            X.Ajq r1 = new X.Ajq
            r1.<init>(r0)
            java.lang.String r0 = "verify-email"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r11, r1, r2, r0)
            r4.setText(r0)
            r1 = 12
        L_0x0263:
            X.784 r0 = new X.784
            r0.<init>(r11, r1)
            r7.setOnClickListener(r0)
            r1 = 5
            X.78M r0 = new X.78M
            r0.<init>(r11, r7, r1)
            r7.setOnDismissListener((android.view.View.OnClickListener) r0)
            goto L_0x00fe
        L_0x0276:
            r0 = 2131896033(0x7f1226e1, float:1.9426916E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r4 = r7.A00
            r0 = 2131896034(0x7f1226e2, float:1.9426918E38)
            java.lang.String r2 = r11.getString(r0)
            r0 = 19
            X.Ajq r1 = new X.Ajq
            r1.<init>(r0)
            java.lang.String r0 = "add-email"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r11, r1, r2, r0)
            r4.setText(r0)
            r1 = 13
            goto L_0x0263
        L_0x0298:
            r7.setVisibility(r5)
            goto L_0x00fe
        L_0x029d:
            java.lang.Object r6 = r3.A01
            X.6Gp r6 = (X.AnonymousClass6Gp) r6
            boolean r4 = r3.A02
            r2 = 0
            X.70R r8 = r6.A0L()
            X.1bI r1 = r8.A0E
            r3 = 8
            if (r1 == 0) goto L_0x02b6
            r0 = 8
            if (r4 == 0) goto L_0x02b3
            r0 = 0
        L_0x02b3:
            r1.A04(r0)
        L_0x02b6:
            android.view.View r1 = r8.A01
            r9 = 1
            if (r1 == 0) goto L_0x02c9
            boolean r0 = r6.A0V
            if (r0 != 0) goto L_0x02c6
            boolean r0 = r8.A09()
            if (r0 == 0) goto L_0x02c6
            r3 = 0
        L_0x02c6:
            r1.setVisibility(r3)
        L_0x02c9:
            if (r4 == 0) goto L_0x0018
            X.11S r0 = r6.A0G
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0302
            X.1bI r0 = r8.A0E
            if (r0 == 0) goto L_0x0018
            android.view.View r1 = r0.A02()
            if (r1 == 0) goto L_0x0018
            r0 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            android.widget.TextView r7 = X.C17880vN.A0E(r1, r0)
            if (r7 == 0) goto L_0x0018
            android.content.Context r5 = r6.A0J()
            r4 = 2131890570(0x7f12118a, float:1.9415836E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            android.content.Context r1 = r6.A0J()
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = X.C17880vN.A0q(r5, r0, r3, r2, r4)
            r7.setText(r0)
            return
        L_0x0302:
            X.1vD r1 = r6.A0H
            X.1o3 r0 = r6.A0I
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r5 = r1.A03()
            X.C18070vi.A0X(r5)
            android.content.Context r1 = r6.A0J()
            r0 = 2131897377(0x7f122c21, float:1.9429642E38)
            java.lang.String r7 = X.C18070vi.A0F(r1, r0)
            android.content.Context r1 = r6.A0J()
            r0 = 2131890569(0x7f121189, float:1.9415834E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r7, r9, r2, r0)
            X.C18070vi.A0X(r0)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            int r3 = X.AnonymousClass1YF.A0F(r0, r7, r2, r2)
            r0 = -1
            if (r3 <= r0) goto L_0x0344
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r9)
            int r1 = r7.length()
            int r1 = r1 + r3
            r0 = 17
            r4.setSpan(r2, r3, r1, r0)
        L_0x0344:
            X.1bI r0 = r8.A0E
            if (r0 == 0) goto L_0x0018
            android.view.View r2 = r0.A02()
            if (r2 == 0) goto L_0x0018
            r0 = 2131431051(0x7f0b0e8b, float:1.848382E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r2, r0)
            if (r0 == 0) goto L_0x035a
            r0.setText(r4)
        L_0x035a:
            r1 = 31
            X.48j r0 = new X.48j
            r0.<init>(r5, r6, r2, r1)
            r2.setOnClickListener(r0)
            return
        L_0x0365:
            java.lang.Object r0 = r3.A01
            X.5dm r0 = (X.C109645dm) r0
            boolean r1 = r3.A02
            r3 = 0
            X.C18070vi.A0d(r0, r3)
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r2 = r0.get()
            X.6GX r2 = (X.AnonymousClass6GX) r2
            if (r2 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0f9f
            r0 = 1
            r2.A03 = r0
            X.6oj r0 = r2.A05
            r0.A01()
            X.73q r0 = r2.A0A
            boolean r0 = r0.A04
            X.AnonymousClass6GX.A00(r2, r0)
            return
        L_0x038b:
            java.lang.Object r5 = r3.A01
            X.6iz r5 = (X.C130166iz) r5
            boolean r2 = r3.A02
            X.1Si r0 = r5.A04
            boolean r1 = r0.A00()
            boolean r0 = r5.A01
            if (r1 != 0) goto L_0x03a8
            if (r0 == 0) goto L_0x03a4
            X.10s r1 = r5.A00
            java.lang.Runnable r0 = r5.A05
            r1.A04(r0)
        L_0x03a4:
            r0 = 0
        L_0x03a5:
            r5.A01 = r0
            return
        L_0x03a8:
            if (r0 == 0) goto L_0x03b6
            if (r2 == 0) goto L_0x0018
            X.10s r1 = r5.A00
            java.lang.Runnable r0 = r5.A05
            r1.A04(r0)
            r0 = 0
            r5.A01 = r0
        L_0x03b6:
            X.6wj r3 = r5.A03
            X.0ve r2 = r3.A01
            r1 = 9961(0x26e9, float:1.3958E-41)
            X.0vf r0 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r0, r2, r1)
            r1 = 200(0xc8, float:2.8E-43)
            if (r4 < r1) goto L_0x0018
            r6 = 4641240890982006784(0x4069000000000000, double:200.0)
            java.util.Random r0 = r3.A00
            double r2 = r0.nextDouble()
            int r4 = r4 - r1
            double r0 = (double) r4
            double r2 = r2 * r0
            double r6 = r6 + r2
            long r3 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0018
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0018
            X.10s r1 = r5.A00
            java.lang.Runnable r0 = r5.A05
            r1.A05(r0, r3)
            r0 = 1
            goto L_0x03a5
        L_0x03e8:
            java.lang.Object r5 = r3.A01
            X.73O r5 = (X.AnonymousClass73O) r5
            boolean r6 = r3.A02
            X.1BI r4 = r5.A0F
            X.1M9 r0 = r5.A07
            X.1E7 r1 = r0.A0H(r4)
            X.1Tv r0 = r5.A0A
            r0.A00(r1)
            X.1Lf r0 = r5.A08
            r0.A00(r4)
            byte[] r0 = r5.A02
            r3 = 0
            if (r0 != 0) goto L_0x040a
            byte[] r0 = r5.A03
            r2 = 1
            if (r0 == 0) goto L_0x040b
        L_0x040a:
            r2 = 0
        L_0x040b:
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x041f
            X.1KB r1 = r5.A05
            r0 = 2131891000(0x7f121338, float:1.9416708E38)
            if (r2 == 0) goto L_0x041b
            r0 = 2131890999(0x7f121337, float:1.9416706E38)
        L_0x041b:
            r1.A08(r0, r3)
            return
        L_0x041f:
            X.11S r1 = r5.A06
            r1.A0I()
            X.1E8 r0 = r1.A0D
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.A0O(r4)
            if (r0 == 0) goto L_0x0018
            if (r6 == 0) goto L_0x0439
            r1 = 2131891814(0x7f121666, float:1.9418359E38)
        L_0x0433:
            X.1KB r0 = r5.A05
            r0.A08(r1, r3)
            return
        L_0x0439:
            r1 = 2131894803(0x7f122213, float:1.9424421E38)
            if (r2 == 0) goto L_0x0433
            r1 = 2131894802(0x7f122212, float:1.942442E38)
            goto L_0x0433
        L_0x0442:
            java.lang.Object r1 = r3.A01
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r1
            boolean r3 = r3.A02
            X.0vl r0 = r1.A06
            java.lang.Object r2 = r0.getValue()
            X.1DS r2 = (X.AnonymousClass1DS) r2
            X.1ey r5 = r1.A03
            X.1QS r0 = r5.A07
            X.AnonymousClass1QS.A00(r0)
            X.1KH r0 = r0.A05
            java.util.ArrayList r1 = r0.A09()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04a6
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            X.AEs r0 = (X.C20284AEs) r0
            if (r0 == 0) goto L_0x04a6
            X.8pD r1 = new X.8pD
            r1.<init>(r0)
        L_0x0471:
            r2.A0E(r1)
            if (r3 == 0) goto L_0x0018
            r4 = 0
            X.1ew r0 = r5.A03
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0018
            X.1QD r1 = r5.A04
            X.11P r0 = r1.A01
            long r6 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r3 = r1.A03()
            java.lang.String r2 = "payments_methods_last_sync_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r6 = r6 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            X.1ex r0 = r5.A05
            r0.A0A(r4)
            return
        L_0x04a6:
            r1 = 0
            goto L_0x0471
        L_0x04a8:
            java.lang.Object r6 = r3.A01
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r6
            boolean r7 = r3.A02
            r8 = 0
            X.1QS r0 = r6.A05
            X.BD1 r0 = r0.A06()
            X.9uQ r5 = r0.BWi()
            if (r5 == 0) goto L_0x0018
            X.0ve r2 = r5.A07
            r1 = 842(0x34a, float:1.18E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0018
            X.1ig r4 = r6.A06
            X.A0v r3 = r4.A01()
            if (r7 == 0) goto L_0x04da
            X.1DT r2 = r6.A01
            r1 = 2
            X.9xu r0 = new X.9xu
            r0.<init>(r3, r8, r1)
            r2.A0E(r0)
        L_0x04da:
            X.9ys r1 = r3.A01
            X.A03 r0 = r3.A02
            boolean r2 = r5.A03(r1, r0)
            X.AXj r0 = new X.AXj
            r0.<init>(r6, r7)
            X.9lP r1 = new X.9lP
            r1.<init>(r0, r4, r2)
            r0 = 0
            r4.A07(r1, r0)
            return
        L_0x04f1:
            java.lang.Object r5 = r3.A01
            X.8Gd r5 = (X.AnonymousClass8Gd) r5
            r15 = 0
            boolean r7 = r3.A02
            r2 = 0
            X.21K r1 = r5.A0V()
            r8 = 0
            if (r1 == 0) goto L_0x0018
            X.AEt r0 = r1.BPK()
            if (r0 == 0) goto L_0x0018
            X.AEn r6 = r0.A02
            if (r6 == 0) goto L_0x0018
            java.lang.String r9 = r6.A08
            if (r9 == 0) goto L_0x051b
            X.BCp r0 = r5.A08
            X.AW0 r8 = r0.BL7(r9)
            if (r8 != 0) goto L_0x051b
            java.lang.String r0 = "Pay: PaymentCheckoutOrderViewModel/loadData the paymentTransactionInfo fetched from PaymentTransactionStore is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x051b:
            r14 = 0
            r5.A0Y(r8, r1, r2)
            X.AE1 r0 = r6.A0F
            X.C18070vi.A0b(r0)
            X.ARR r4 = r6.A02(r0)
            X.1KN r0 = r4.A02
            java.math.BigDecimal r10 = r0.A00
            X.0ve r3 = r5.A06
            r0 = 1826(0x722, float:2.559E-42)
            X.0vf r2 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r2, r3, r0)
            long r0 = (long) r0
            X.1KJ r12 = r6.A0A
            X.C17960vV.A07(r12)
            X.C18070vi.A0X(r12)
            r11 = 1000(0x3e8, float:1.401E-42)
            X.ARR r13 = X.C196669vR.A00(r12, r11, r0)
            r0 = 1712(0x6b0, float:2.399E-42)
            int r0 = X.C18020vd.A00(r2, r3, r0)
            long r0 = (long) r0
            X.C17960vV.A07(r12)
            X.ARR r11 = X.C196669vR.A00(r12, r11, r0)
            float r1 = r10.floatValue()
            X.1KN r0 = r13.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0fb2
            float r1 = r10.floatValue()
            X.1KN r0 = r11.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0fb2
            java.lang.String r10 = r6.A06
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0590
            if (r10 == 0) goto L_0x0590
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0590
            java.lang.String r1 = "pending_buyer_confirmation"
            java.lang.String r0 = r6.A07
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0590
            r14 = 1
        L_0x0590:
            boolean r1 = r5.A0c(r8, r6)
            if (r9 == 0) goto L_0x059c
            int r0 = r9.length()
            if (r0 != 0) goto L_0x05dd
        L_0x059c:
            if (r10 == 0) goto L_0x05a6
            int r0 = r10.length()
            if (r0 == 0) goto L_0x05a6
            if (r14 == 0) goto L_0x05dd
        L_0x05a6:
            boolean r0 = r6.A08()
            if (r0 == 0) goto L_0x05dd
        L_0x05ac:
            X.ADZ r8 = r6.A0E
            java.lang.String r6 = r6.A04()
            boolean r0 = r5.A0b()
            if (r0 == 0) goto L_0x05db
            if (r6 == 0) goto L_0x05c0
            int r0 = r6.length()
            if (r0 != 0) goto L_0x05db
        L_0x05c0:
            r1 = 1
        L_0x05c1:
            r0 = 10895(0x2a8f, float:1.5267E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r7 == 0) goto L_0x0fb2
            if (r1 != 0) goto L_0x0fb2
            if (r0 != 0) goto L_0x0fb2
            if (r8 == 0) goto L_0x05d9
            int r0 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x05d5:
            r5.A0X(r4, r0, r6)
            return
        L_0x05d9:
            r0 = 0
            goto L_0x05d5
        L_0x05db:
            r1 = 0
            goto L_0x05c1
        L_0x05dd:
            if (r1 != 0) goto L_0x05ac
            if (r10 == 0) goto L_0x05e7
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0fb2
        L_0x05e7:
            if (r8 == 0) goto L_0x0faf
            X.1QS r1 = r5.A07
            X.BD1 r0 = r1.A06()
            X.BDG r10 = r0.BPY()
            X.BD1 r0 = r1.A06()
            X.A5D r9 = r0.BUf()
            X.1R2 r1 = r5.A0A
            r0 = 1
            boolean r0 = r1.A0l(r8, r9, r10, r0)
            if (r0 == 0) goto L_0x0faf
            boolean r0 = r6.A08()
            if (r0 == 0) goto L_0x0faf
            goto L_0x05ac
        L_0x060b:
            java.lang.Object r4 = r3.A01
            X.3Ao r4 = (X.C70313Ao) r4
            boolean r3 = r3.A02
            X.1Cd r0 = r4.A07
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0018
            X.2qZ r7 = r4.A01
            if (r7 == 0) goto L_0x0637
            X.0z4 r5 = r4.A04
            X.1TD r6 = r4.A05
            X.2cp r8 = new X.2cp
            r8.<init>(r4, r3)
            X.C18070vi.A0h(r5, r6)
            X.10s r0 = r7.A00
            r9 = 44
            X.Aix r4 = new X.Aix
            r4.<init>(r5, r6, r7, r8, r9)
            r0.execute(r4)
            return
        L_0x0637:
            X.C70313Ao.A02(r4)
            monitor-enter(r4)
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x0fe3 }
            java.util.ArrayList r2 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x0fe3 }
            monitor-exit(r4)     // Catch:{ all -> 0x0fe3 }
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0655
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "missedcallnotification/update cancel "
            X.C17900vP.A0n(r0, r1, r3)
            r4.A05()
            return
        L_0x0655:
            r1 = 0
            android.app.Notification r0 = r4.A03(r2, r1, r3)
            if (r0 == 0) goto L_0x0018
            X.C70313Ao.A01(r0, r4, r1, r3)
            return
        L_0x0660:
            java.lang.Object r2 = r3.A01
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r2 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r2
            boolean r1 = r3.A02
            android.os.CancellationSignal r0 = r2.A09
            r0.cancel()
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0687
            X.AMY r1 = r2.A0F
            r1.A01()
            X.00H r0 = r1.A0I
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            X.11y r1 = r1.A09
            r0 = 1
            r1.A03(r0)
            java.lang.String r0 = "p2p/fpm/ExportHelper/reconnectToServer()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0687:
            X.BAx r0 = r2.A02
            if (r0 == 0) goto L_0x0018
            X.9yq r2 = r2.A0G
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0018
            X.9pW r0 = r2.A09
            r0.A02()
            r0 = 0
            r2.A00 = r0
            X.00H r0 = r2.A0D
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            if (r1 == 0) goto L_0x0018
            X.1WZ r0 = r2.A06
            r0.A01()
            X.1Cn r0 = r2.A05
            r0.A02()
            X.17r r0 = r2.A03
            java.io.File r1 = r0.A0J()
            X.C18070vi.A0X(r1)
            r0 = 0
            X.C64062u9.A0K(r1, r0)
            java.lang.String[] r0 = r1.list()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length
            r3 = 0
            if (r0 == 0) goto L_0x0018
            X.190 r2 = r2.A02
            java.lang.String r1 = "p2p/fpm/ImportHelper/"
            java.lang.String r0 = "cancelImport/could not delete media folder"
            r2.A0G(r1, r0, r3)
            java.lang.String r0 = "p2p/fpm/ImportHelper/cleanUpAfterCancellation()/could not delete media folder"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06d2:
            java.lang.Object r5 = r3.A01
            X.2si r5 = (X.C63222si) r5
            boolean r3 = r3.A02
            X.00H r2 = r5.A0a
            java.lang.Object r0 = r2.get()
            X.1ef r0 = (X.C30881ef) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x06f1
            X.00H r0 = r5.A0Z
            java.lang.Object r0 = r0.get()
            X.2rE r0 = (X.C62332rE) r0
            r0.A01()
            return
        L_0x06f1:
            java.lang.Object r0 = r2.get()
            X.1ef r0 = (X.C30881ef) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0018
            if (r3 == 0) goto L_0x0018
            X.00H r0 = r5.A0T
            java.lang.Object r0 = r0.get()
            X.17v r0 = (X.C219017v) r0
            long r3 = r0.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0fe6
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0fe6
            return
        L_0x0717:
            java.lang.Object r2 = r3.A01
            X.31p r2 = (X.C679831p) r2
            boolean r4 = r3.A02
            if (r4 == 0) goto L_0x072b
            X.00H r0 = r2.A0P
            java.lang.Object r1 = r0.get()
            X.18H r1 = (X.AnonymousClass18H) r1
            r0 = 1
            r1.A00(r0)
        L_0x072b:
            boolean r0 = X.C679831p.A0E(r2)
            if (r0 == 0) goto L_0x073e
            X.00H r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.88z r1 = (X.C1605688z) r1
            X.Cn3 r0 = r2.A04
            r1.CHI(r0, r4)
        L_0x073e:
            boolean r0 = X.C679831p.A0B(r2)
            if (r0 == 0) goto L_0x0018
            X.00H r0 = r2.A0A
            java.lang.Object r3 = r0.get()
            X.88z r3 = (X.C1605688z) r3
            X.Cn3 r0 = r2.A01
            goto L_0x077c
        L_0x074f:
            java.lang.Object r1 = r3.A01
            X.31p r1 = (X.C679831p) r1
            boolean r4 = r3.A02
            boolean r0 = X.C679831p.A0D(r1)
            if (r0 == 0) goto L_0x0018
            X.00H r0 = r1.A09
            java.lang.Object r3 = r0.get()
            X.88z r3 = (X.C1605688z) r3
            X.Cn3 r0 = r1.A03
            goto L_0x077c
        L_0x0766:
            java.lang.Object r1 = r3.A01
            X.31p r1 = (X.C679831p) r1
            boolean r4 = r3.A02
            boolean r0 = X.C679831p.A0C(r1)
            if (r0 == 0) goto L_0x0018
            X.00H r0 = r1.A09
            java.lang.Object r3 = r0.get()
            X.88z r3 = (X.C1605688z) r3
            X.Cn3 r0 = r1.A02
        L_0x077c:
            r3.CHI(r0, r4)
            return
        L_0x0780:
            java.lang.Object r0 = r3.A01
            X.1mM r0 = (X.C35511mM) r0
            boolean r3 = r3.A02
            X.00H r0 = r0.A01
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 4
            X.7KP r0 = new X.7KP
            r0.<init>(r3, r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0796:
            java.lang.Object r2 = r3.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            boolean r1 = r3.A02
            r0 = 3
            if (r1 == 0) goto L_0x07a0
            r0 = 6
        L_0x07a0:
            r2.A0W(r0)
            return
        L_0x07a4:
            java.lang.Object r1 = r3.A01
            X.5dl r1 = (X.C109635dl) r1
            boolean r0 = r3.A02
            X.C109635dl.A00(r1, r0)
            return
        L_0x07ae:
            java.lang.Object r4 = r3.A01
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r4 = (com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment) r4
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x07c5
            X.00H r0 = r4.A03
            java.lang.Object r5 = r0.get()
            X.67t r5 = (X.C1193467t) r5
            X.77d r3 = r4.A01
            r2 = 0
        L_0x07c1:
            r5.A0J(r2, r3)
            return
        L_0x07c5:
            X.00H r0 = r4.A04
            java.lang.Object r2 = r0.get()
            X.67t r2 = (X.C1193467t) r2
            X.77d r0 = r4.A01
            java.lang.String r1 = r0.A0F
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.util.Pair r0 = r2.A0D(r1)
            if (r0 == 0) goto L_0x0806
            java.lang.Object r0 = r0.second
            X.C18070vi.A0W(r0)
            long r2 = X.C17880vN.A05(r0)
        L_0x07e4:
            X.77d r0 = r4.A01
            java.lang.String r1 = r0.A0F
            if (r1 == 0) goto L_0x0801
            X.1To r0 = r4.A00
            java.util.Set r1 = r0.A0C(r1, r2)
        L_0x07f0:
            X.00H r0 = r4.A04
            java.lang.Object r5 = r0.get()
            X.67t r5 = (X.C1193467t) r5
            X.77d r3 = r4.A01
            r0 = 2
            X.38g r2 = new X.38g
            r2.<init>(r4, r1, r0)
            goto L_0x07c1
        L_0x0801:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x07f0
        L_0x0806:
            r2 = 0
            goto L_0x07e4
        L_0x0809:
            java.lang.Object r1 = r3.A01
            X.73q r1 = (X.C1409373q) r1
            boolean r0 = r3.A02
            X.C1409373q.A03(r1, r0)
            return
        L_0x0813:
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r3.A02
            r1.setSelected(r0)
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x0821:
            java.lang.Object r0 = r3.A01
            com.whatsapp.settings.SettingsUserProxyActivity r0 = (com.whatsapp.settings.SettingsUserProxyActivity) r0
            boolean r4 = r3.A02
            com.whatsapp.settings.SettingsUserProxyViewModel r3 = r0.A0A
            monitor-enter(r3)
            X.00H r5 = r3.A0F     // Catch:{ all -> 0x089b }
            java.lang.Object r0 = r5.get()     // Catch:{ all -> 0x089b }
            X.4Yt r0 = (X.C88214Yt) r0     // Catch:{ all -> 0x089b }
            r0.A05(r4)     // Catch:{ all -> 0x089b }
            r2 = 0
            if (r4 == 0) goto L_0x0839
            goto L_0x0866
        L_0x0839:
            boolean r0 = r3.A03     // Catch:{ all -> 0x089b }
            if (r0 != 0) goto L_0x088e
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x089b }
            if (r0 != 0) goto L_0x0843
            r1 = 0
            goto L_0x084d
        L_0x0843:
            X.11E r0 = r3.A09     // Catch:{ all -> 0x089b }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x089b }
            r1 = 5
            if (r0 == 0) goto L_0x084d
            r1 = 4
        L_0x084d:
            r3.A0W(r1, r2)     // Catch:{ all -> 0x089b }
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x089b }
            X.4Yt r1 = (X.C88214Yt) r1     // Catch:{ all -> 0x089b }
            r0 = 0
            r1.A04(r0)     // Catch:{ all -> 0x089b }
            X.00H r0 = r3.A0G     // Catch:{ all -> 0x089b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x089b }
            X.4Pq r0 = (X.C85974Pq) r0     // Catch:{ all -> 0x089b }
            r0.A00(r2)     // Catch:{ all -> 0x089b }
            goto L_0x088b
        L_0x0866:
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x089b }
            if (r0 == 0) goto L_0x088e
            X.00H r0 = r3.A0H     // Catch:{ all -> 0x089b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x089b }
            X.1fM r0 = (X.C31311fM) r0     // Catch:{ all -> 0x089b }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x089b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x089b }
            X.4Yt r0 = (X.C88214Yt) r0     // Catch:{ all -> 0x089b }
            java.lang.String r0 = r0.A01()     // Catch:{ all -> 0x089b }
            if (r0 != 0) goto L_0x0887
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x089b }
            if (r0 == 0) goto L_0x0887
            r3.A0Z(r0)     // Catch:{ all -> 0x089b }
        L_0x0887:
            r0 = 1
            r3.A0W(r0, r2)     // Catch:{ all -> 0x089b }
        L_0x088b:
            r3.A0U()     // Catch:{ all -> 0x089b }
        L_0x088e:
            X.1DT r1 = r3.A07     // Catch:{ all -> 0x089b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x089b }
            r1.A0E(r0)     // Catch:{ all -> 0x089b }
            r3.A03 = r2     // Catch:{ all -> 0x089b }
            monitor-exit(r3)
            return
        L_0x089b:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x089e:
            java.lang.Object r0 = r3.A01
            X.Ae9 r0 = (X.C21079Ae9) r0
            boolean r7 = r3.A02
            com.whatsapp.settings.SettingsChatHistoryFragment r4 = r0.A00
            X.1iW r3 = r4.A03
            X.1Nd r0 = r3.A0H
            java.util.ArrayList r0 = r0.A06()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.HashSet r5 = X.C17880vN.A12()
            java.util.Iterator r9 = r0.iterator()
        L_0x08ba:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0904
            X.1BI r8 = X.C17880vN.A0Q(r9)
            X.1CJ r0 = r3.A0R
            int r0 = r0.A03(r8)
            if (r0 <= 0) goto L_0x08de
            X.1gx r1 = r3.A0t
            r0 = 0
            r1.A0A(r8, r0)
            X.1KB r6 = r3.A03
            r1 = 10
            X.3C0 r0 = new X.3C0
            r0.<init>(r3, r8, r1)
            r6.A0J(r0)
        L_0x08de:
            X.1Nf r0 = r3.A0S
            X.1E7 r1 = r0.A01(r8)
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x08f1
            X.2lf r0 = r1.A0H
            if (r0 != 0) goto L_0x08f1
            r2.add(r1)
        L_0x08f1:
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x08fa
            X.C33251iW.A09(r3, r8)
        L_0x08fa:
            X.1To r0 = r3.A0C
            java.util.Set r0 = r0.A07(r8, r7)
            r5.addAll(r0)
            goto L_0x08ba
        L_0x0904:
            X.1M9 r1 = r3.A0D
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            X.AnonymousClass1M9.A00(r1, r0, r2)
            X.122 r6 = r3.A0U
            java.lang.String r0 = "CoreMessageStore/deleteallmsgs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "msgstore/deleteallmsgs"
            X.1Ez r8 = new X.1Ez
            r8.<init>((java.lang.String) r0)
            java.util.Map r0 = r6.A1M
            r0.clear()
            X.1Cd r0 = r6.A0V
            X.1au r11 = r0.A05()
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x0a1b }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0a11 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0a11 }
            java.lang.String r1 = "DELETE FROM chat WHERE _id IN  (SELECT c._id FROM chat AS c LEFT JOIN jid AS j ON c.jid_row_id=j._id WHERE j.type != 1)"
            java.lang.String r0 = "DELETE_CHAT_SQL"
            r2.A0E(r1, r0)     // Catch:{ all -> 0x0a11 }
            X.AnonymousClass122.A08(r6, r8)     // Catch:{ all -> 0x0a11 }
            X.1CJ r1 = r6.A0D     // Catch:{ all -> 0x0a11 }
            monitor-enter(r1)     // Catch:{ all -> 0x0a11 }
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r1)     // Catch:{ all -> 0x0a0e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0a0e }
            monitor-exit(r1)     // Catch:{ all -> 0x0a11 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0a11 }
        L_0x0949:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0a11 }
            if (r0 == 0) goto L_0x0972
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0a11 }
            X.1BI r2 = (X.AnonymousClass1BI) r2     // Catch:{ all -> 0x0a11 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0a11 }
            X.1ci r1 = (X.C29691ci) r1     // Catch:{ all -> 0x0a11 }
            r1.A0C()     // Catch:{ all -> 0x0a11 }
            boolean r0 = X.C22971Dz.A0W(r2)     // Catch:{ all -> 0x0a11 }
            if (r0 == 0) goto L_0x0949
            int r1 = r1.A01     // Catch:{ all -> 0x0a11 }
            r0 = 1
            if (r1 != r0) goto L_0x0949
            r0 = 0
            r6.A0Y(r2, r0)     // Catch:{ all -> 0x0a11 }
            goto L_0x0949
        L_0x0972:
            r10.A00()     // Catch:{ all -> 0x0a11 }
            r10.close()     // Catch:{ all -> 0x0a1b }
            r11.close()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/deleteallmsgs time spent:"
            r2.append(r0)
            long r0 = r8.A02()
            X.C17890vO.A16(r2, r0)
            X.17r r1 = r6.A05
            X.2hC r0 = r1.A08()
            java.io.File r0 = r0.A0R
            X.C64062u9.A0R(r0)
            X.2hC r0 = r1.A08()
            java.io.File r0 = r0.A0J
            X.C64062u9.A0R(r0)
            if (r7 == 0) goto L_0x09a4
            X.AnonymousClass122.A02(r6)
        L_0x09a4:
            X.1Q2 r0 = r6.A0O
            android.os.Handler r1 = r0.A01
            r0 = 9
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.sendToTarget()
            X.1Mx r6 = r3.A0E
            X.1My r0 = r6.A01
            X.1Lt r0 = r0.A00
            X.1au r2 = r0.A06()
            java.lang.String r0 = "wa_trusted_contacts"
            r1 = 0
            X.C24861Ly.A02(r2, r0, r1, r1)     // Catch:{ all -> 0x0a07 }
            java.lang.String r0 = "wa_trusted_contacts_send"
            X.C24861Ly.A02(r2, r0, r1, r1)     // Catch:{ all -> 0x0a07 }
            r2.close()
            X.0vl r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            X.C18070vi.A0X(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            X.0vl r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            X.C18070vi.A0X(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            X.1Mz r0 = r6.A00
            X.1N0 r1 = r0.A02
            r0 = -1
            r1.A07(r0)
            X.1To r0 = r3.A0C
            r0.A0R(r5)
            X.1Uv r0 = r3.A0i
            r0.A0O()
            X.AnonymousClass1KB.A02(r3)
            X.1an r0 = r3.A09
            r0.A01()
            X.1KB r2 = r4.A00
            r0 = 43
            goto L_0x0ac2
        L_0x0a07:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0a09 }
        L_0x0a09:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0a0e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0a11 }
            throw r0     // Catch:{ all -> 0x0a11 }
        L_0x0a11:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0a16 }
            goto L_0x0a1a
        L_0x0a16:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0a1b }
        L_0x0a1a:
            throw r1     // Catch:{ all -> 0x0a1b }
        L_0x0a1b:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0a20 }
            throw r1
        L_0x0a20:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0a25:
            java.lang.Object r4 = r3.A01
            com.whatsapp.settings.SettingsChatHistoryFragment r4 = (com.whatsapp.settings.SettingsChatHistoryFragment) r4
            boolean r7 = r3.A02
            X.1iW r5 = r4.A03
            X.1Co r6 = r5.A0Q
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/archiveall "
            X.C17900vP.A0n(r0, r1, r7)
            X.C22621Co.A01(r6, r7)
            X.1CJ r0 = r6.A00
            java.util.Collection r1 = r0.A0H()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0a7a
            java.lang.String r0 = "msgstore/archiveall none"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0a4c:
            X.AnonymousClass1KB.A02(r5)
            X.1Nb r7 = r5.A14
            r0 = 1
            java.util.Map r0 = X.AnonymousClass1Nb.A05(r7, r0)
            java.util.Set r0 = r0.keySet()
            java.util.HashSet r6 = X.C17880vN.A12()
            java.util.Iterator r3 = r0.iterator()
        L_0x0a62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0ab4
            X.1BI r2 = X.C17880vN.A0Q(r3)
            X.1To r1 = r5.A0C
            r0 = 0
            java.util.Set r0 = r1.A06(r2, r0)
            r6.addAll(r0)
            r7.A0b(r2)
            goto L_0x0a62
        L_0x0a7a:
            java.util.ArrayList r3 = X.C220618l.newArrayList()
            java.util.Iterator r2 = r1.iterator()
        L_0x0a82:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a9c
            java.lang.Object r1 = r2.next()
            X.1ci r1 = (X.C29691ci) r1
            boolean r0 = r1.A0m
            if (r0 != 0) goto L_0x0a82
            boolean r0 = r1.A0l
            if (r0 == r7) goto L_0x0a82
            r1.A0l = r7
            r3.add(r1)
            goto L_0x0a82
        L_0x0a9c:
            X.00H r0 = r6.A01
            X.1as r0 = X.C17880vN.A0M(r0)
            X.00H r0 = r0.A0L
            X.1gM r2 = X.C17880vN.A0L(r0)
            r0 = 40
            X.7RF r1 = new X.7RF
            r1.<init>(r6, r3, r0, r7)
            r0 = 4
            r2.A01(r1, r0)
            goto L_0x0a4c
        L_0x0ab4:
            X.1To r0 = r5.A0C
            r0.A0R(r6)
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            X.1KB r2 = r4.A00
            r0 = 42
        L_0x0ac2:
            X.7Qo r1 = new X.7Qo
            r1.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x0ec9
        L_0x0ac9:
            java.lang.Object r2 = r3.A01
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r2 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r2
            boolean r3 = r3.A02
            com.whatsapp.qrcode.WaQrScannerView r0 = r2.A04
            X.8An r0 = r0.A01
            boolean r0 = r0.COq()
            android.widget.ImageView r1 = r2.A00
            if (r0 == 0) goto L_0x0b35
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A00
            r0 = 2131231500(0x7f08030c, float:1.8079083E38)
            if (r3 == 0) goto L_0x0ae9
            r0 = 2131231501(0x7f08030d, float:1.8079085E38)
        L_0x0ae9:
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r2.A00
            goto L_0x0b25
        L_0x0aef:
            java.lang.Object r0 = r3.A01
            X.7DT r0 = (X.AnonymousClass7DT) r0
            boolean r2 = r3.A02
            java.lang.Object r0 = r0.A01
            X.74G r0 = (X.AnonymousClass74G) r0
            X.6pV r1 = r0.A05
            r0 = 0
            r1.A01(r2, r0)
            return
        L_0x0b00:
            java.lang.Object r2 = r3.A01
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r2 = (com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r2
            boolean r3 = r3.A02
            com.whatsapp.qrcode.WaQrScannerView r0 = r2.A08
            X.8An r0 = r0.A01
            boolean r0 = r0.COq()
            android.widget.ImageView r1 = r2.A00
            if (r0 == 0) goto L_0x0b35
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A00
            r0 = 2131231500(0x7f08030c, float:1.8079083E38)
            if (r3 == 0) goto L_0x0b20
            r0 = 2131231501(0x7f08030d, float:1.8079085E38)
        L_0x0b20:
            r1.setImageResource(r0)
            android.widget.ImageView r1 = r2.A00
        L_0x0b25:
            r0 = 2131890432(0x7f121100, float:1.9415556E38)
            if (r3 != 0) goto L_0x0b2d
            r0 = 2131890434(0x7f121102, float:1.941556E38)
        L_0x0b2d:
            java.lang.String r0 = r2.A1H(r0)
            r1.setContentDescription(r0)
            return
        L_0x0b35:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0b3b:
            java.lang.Object r0 = r3.A01
            X.91R r0 = (X.AnonymousClass91R) r0
            boolean r1 = r3.A02
            X.11S r2 = r0.A02
            r2.A0I()
            X.1E8 r2 = r2.A0D
            X.C17960vV.A07(r2)
            if (r1 == 0) goto L_0x0c09
            X.1BI r6 = r2.A0J
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.1KJ r2 = r0.A06
            X.1KL r2 = (X.AnonymousClass1KL) r2
            java.lang.String r7 = r2.A06
            X.C18070vi.A0W(r7)
            X.1KN r4 = r0.A09
            X.1KJ r3 = r0.A06
            X.2tK r2 = X.C63572tK.A0E
            java.lang.String r9 = "IN"
            r13 = 1
            r5 = 0
            r15 = -1
            X.A8n r2 = X.C20128A8n.$redex_init_class
            int r12 = X.C196679vS.A00(r9)
            r14 = 0
            r10 = 10
            r11 = 11
            r8 = r5
            X.AW0 r4 = X.C20128A8n.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0b76:
            java.lang.String r2 = r0.A0T
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0b85
            X.8pf r3 = r0.A0P
            java.lang.String r2 = r0.A0T
            r3.A0T(r2)
        L_0x0b85:
            X.11P r2 = r0.A05
            long r2 = X.AnonymousClass11P.A01(r2)
            r4.A05 = r2
            java.lang.String r2 = "UNSET"
            r4.A0F = r2
            X.8pf r3 = r0.A0P
            r4.A0A = r3
            r4.A0P = r13
            X.77e r2 = r0.A0J
            java.lang.Object r2 = r2.A00
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L_0x0bfd
            r3.A0V(r2)
            X.8pG r2 = r4.A0A
            X.77e r1 = r0.A0H
            java.lang.Object r1 = r1.A00
            java.lang.String r1 = (java.lang.String) r1
            r2.A0W(r1)
        L_0x0bad:
            X.8pf r1 = r0.A0P
            java.lang.String r6 = r1.A0M
            X.C17960vV.A06(r6)
            X.1QR r5 = r0.A07
            r3 = 0
            r1 = -1
            X.AW0 r5 = r5.A0N(r6, r3, r1)
            X.1QE r3 = r0.A0i
            if (r5 != 0) goto L_0x0bea
            java.lang.String r1 = "IN- HANDLE_SEND_AGAIN Old txn is null"
        L_0x0bc3:
            r3.A06(r1)
            X.1QR r1 = r0.A07
            r1.A0e(r4, r5, r6)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "getPayNonWaVpaCallback added new transaction with trans id: "
            r2.append(r1)
            java.lang.String r1 = r4.A0K
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)
            r3.A06(r1)
            X.1KB r3 = r0.A05
            r2 = 19
            X.Ajz r1 = new X.Ajz
            r1.<init>(r0, r4, r2)
            r3.A0J(r1)
            return
        L_0x0bea:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "IN- HANDLE_SEND_AGAIN Old txn is not null, interop is "
            r2.append(r1)
            boolean r1 = r5.A0P
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0bc3
        L_0x0bfd:
            r3.A0R = r2
            X.77e r1 = r0.A0H
            java.lang.Object r1 = r1.A00
            java.lang.String r1 = (java.lang.String) r1
            r3.A0Y(r1)
            goto L_0x0bad
        L_0x0c09:
            X.1BI r4 = r2.A0J
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.1KJ r2 = r0.A06
            X.1KL r2 = (X.AnonymousClass1KL) r2
            java.lang.String r3 = r2.A06
            X.C18070vi.A0W(r3)
            X.1KN r7 = r0.A09
            X.1KJ r6 = r0.A06
            X.2tK r2 = X.C63572tK.A0E
            java.lang.String r12 = "IN"
            r9 = 0
            r17 = 0
            X.A8n r2 = X.C20128A8n.$redex_init_class
            r18 = -1
            int r15 = X.C196679vS.A00(r12)
            r14 = 401(0x191, float:5.62E-43)
            r13 = 1
            r8 = r4
            r10 = r3
            r11 = r9
            r16 = r13
            X.AW0 r4 = X.C20128A8n.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0b76
        L_0x0c37:
            java.lang.Object r0 = r3.A01
            X.91E r0 = (X.AnonymousClass91E) r0
            boolean r1 = r3.A02
            X.96M r7 = r0.A0K
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0c4c
            if (r1 == 0) goto L_0x0c4c
            X.A5B r1 = r7.A06
            java.lang.String r0 = r7.A08
            r1.A04(r0)
        L_0x0c4c:
            X.A5B r6 = r7.A06
            java.lang.String r5 = r7.A08
            monitor-enter(r6)
            int r2 = r6.A02(r5)     // Catch:{ all -> 0x0cfe }
            if (r2 < 0) goto L_0x0ce6
            r0 = 4
            if (r2 > r0) goto L_0x0ce6
            r8 = 2
            if (r2 != r0) goto L_0x0c79
            X.17r r0 = r6.A02     // Catch:{ all -> 0x0cfe }
            java.io.File r0 = r0.A0S(r5)     // Catch:{ all -> 0x0cfe }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0cfe }
            if (r0 != 0) goto L_0x0c86
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = "dyiReportManager/validate-state/report-media-file-missing for account type = "
            X.C17900vP.A0e(r0, r5, r1)     // Catch:{ all -> 0x0cfe }
            X.1QD r0 = r6.A07     // Catch:{ all -> 0x0cfe }
            r0.A0F(r8, r5)     // Catch:{ all -> 0x0cfe }
            goto L_0x0fcb
        L_0x0c79:
            if (r2 != r8) goto L_0x0c7c
            goto L_0x0c80
        L_0x0c7c:
            r0 = 3
            if (r2 != r0) goto L_0x0c86
            goto L_0x0c9e
        L_0x0c80:
            X.9de r0 = r6.A03(r5)     // Catch:{ all -> 0x0cfe }
            if (r0 == 0) goto L_0x0ca4
        L_0x0c86:
            X.1QD r0 = r6.A07     // Catch:{ all -> 0x0cfe }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = "personal"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0cfe }
            if (r0 == 0) goto L_0x0c9b
            java.lang.String r0 = "payment_dyi_report_expiration_timestamp"
        L_0x0c96:
            long r3 = X.C17890vO.A04(r1, r0)     // Catch:{ all -> 0x0cfe }
            goto L_0x0cb4
        L_0x0c9b:
            java.lang.String r0 = "business_payment_dyi_report_expiration_timestamp"
            goto L_0x0c96
        L_0x0c9e:
            X.9de r0 = r6.A03(r5)     // Catch:{ all -> 0x0cfe }
            if (r0 != 0) goto L_0x0c86
        L_0x0ca4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = "dyiReportManager/validate-state/report-message-missing for account type = "
            X.C17900vP.A0e(r0, r5, r1)     // Catch:{ all -> 0x0cfe }
            X.1QD r0 = r6.A07     // Catch:{ all -> 0x0cfe }
            r0.A0J(r5)     // Catch:{ all -> 0x0cfe }
            goto L_0x0fcb
        L_0x0cb4:
            if (r2 != r8) goto L_0x0fcb
            X.11P r8 = r6.A04     // Catch:{ all -> 0x0cfe }
            long r1 = X.AnonymousClass11P.A01(r8)     // Catch:{ all -> 0x0cfe }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0fcb
            long r1 = X.AnonymousClass11P.A01(r8)     // Catch:{ all -> 0x0cfe }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0fcb
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = "dyiReportManager/validate-state/report-too-old for account type = "
            r8.append(r0)     // Catch:{ all -> 0x0cfe }
            r8.append(r5)     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = ", current:"
            r8.append(r0)     // Catch:{ all -> 0x0cfe }
            r8.append(r1)     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = " expired:"
            X.C17900vP.A0m(r0, r8, r3)     // Catch:{ all -> 0x0cfe }
            r6.A04(r5)     // Catch:{ all -> 0x0cfe }
            goto L_0x0fcb
        L_0x0ce6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = "dyiReportManager/validate-state/wrong-state for account type = "
            r1.append(r0)     // Catch:{ all -> 0x0cfe }
            r1.append(r5)     // Catch:{ all -> 0x0cfe }
            java.lang.String r0 = ", state = "
            X.C17900vP.A0i(r0, r1, r2)     // Catch:{ all -> 0x0cfe }
            X.1QD r0 = r6.A07     // Catch:{ all -> 0x0cfe }
            r0.A0J(r5)     // Catch:{ all -> 0x0cfe }
            goto L_0x0fcb
        L_0x0cfe:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        L_0x0d01:
            java.lang.Object r0 = r3.A01
            X.8yp r0 = (X.C175508yp) r0
            boolean r1 = r3.A02
            X.1ig r0 = r0.A03
            r0.A09(r1)
            return
        L_0x0d0d:
            java.lang.Object r4 = r3.A01
            com.whatsapp.registration.ChangeNumberOverview r4 = (com.whatsapp.registration.ChangeNumberOverview) r4
            boolean r3 = r3.A02
            X.1QS r0 = r4.A04
            if (r0 == 0) goto L_0x0d4b
            X.AnonymousClass1QS.A00(r0)
            X.1QR r0 = r0.A04
            r2 = 1
            java.util.List r0 = r0.A0V(r2)
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0d28
            r2 = 0
        L_0x0d28:
            X.0zA r1 = r4.A01
            if (r1 == 0) goto L_0x0d47
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0d3c
            r1.A03()
            java.lang.String r0 = "isMetaVerifiedSubscriptionActive"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x0d3c:
            X.1KB r1 = r4.A05
            X.7Qv r0 = new X.7Qv
            r0.<init>(r4, r3, r2)
            r1.CGP(r0)
            return
        L_0x0d47:
            java.lang.String r0 = "subscriptionManager"
            goto L_0x0d4d
        L_0x0d4b:
            java.lang.String r0 = "paymentsManager"
        L_0x0d4d:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0d52:
            java.lang.Object r4 = r3.A01
            X.1gx r4 = (X.C32291gx) r4
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0d75
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r3 = r4.A0A
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r3)
            java.lang.String r0 = "last_notification_hash"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "notification_hash"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x0d75:
            X.1Vn r2 = r4.A09
            r1 = 1
            goto L_0x0d9c
        L_0x0d79:
            java.lang.Object r4 = r3.A01
            X.1gx r4 = (X.C32291gx) r4
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r3 = r4.A0A
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r3)
            java.lang.String r0 = "locked_chat_last_notification_hash"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "locked_chat_notification_hash"
            X.C17880vN.A1E(r1, r0, r2)
            X.1Vn r2 = r4.A09
            r1 = 57
        L_0x0d9c:
            java.lang.String r0 = "MessageNotification1"
            r2.BEJ(r1, r0)
            return
        L_0x0da2:
            java.lang.Object r0 = r3.A01
            X.1md r0 = (X.C35681md) r0
            X.00H r0 = r0.A0c
            r0.get()
            return
        L_0x0dac:
            java.lang.Object r6 = r3.A01
            X.1md r6 = (X.C35681md) r6
            boolean r5 = r3.A02
            X.00H r0 = r6.A0L
            java.lang.Object r1 = r0.get()
            X.6cK r1 = (X.C126186cK) r1
            X.00H r3 = r6.A0K
            java.lang.Object r2 = X.C18070vi.A0E(r3)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.put(r2, r0)
            java.lang.Object r0 = r3.get()
            X.36W r0 = (X.AnonymousClass36W) r0
            X.2tN[] r4 = r0.CEA()
            int r3 = r4.length
            java.util.ArrayList r2 = X.C17880vN.A0z(r3)
            r1 = 0
        L_0x0ddd:
            if (r1 >= r3) goto L_0x0de9
            r0 = r4[r1]
            int r0 = r0.A01
            X.C17890vO.A1D(r2, r0)
            int r1 = r1 + 1
            goto L_0x0ddd
        L_0x0de9:
            X.00H r0 = r6.A0X
            java.lang.Object r0 = r0.get()
            X.1pH r0 = (X.C37291pH) r0
            r0.A04(r4)
            X.1iv r0 = r6.A0H
            r0.A04(r2, r5)
            return
        L_0x0dfa:
            java.lang.Object r1 = r3.A01
            com.whatsapp.mentions.MentionPickerView r1 = (com.whatsapp.mentions.MentionPickerView) r1
            boolean r0 = r3.A02
            r1.A0A(r0)
            return
        L_0x0e04:
            java.lang.Object r0 = r3.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            boolean r2 = r3.A02
            X.5iA r0 = r0.A0C
            X.1vp r1 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0F(r0)
            return
        L_0x0e16:
            java.lang.Object r1 = r3.A01
            com.whatsapp.identity.IdentityVerificationActivity r1 = (com.whatsapp.identity.IdentityVerificationActivity) r1
            boolean r0 = r3.A02
            com.whatsapp.identity.IdentityVerificationActivity.A0x(r1, r0)
            return
        L_0x0e20:
            java.lang.Object r4 = r3.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            boolean r0 = r3.A02
            X.1bI r1 = r4.A1g
            if (r0 == 0) goto L_0x0e9f
            r0 = 0
            r1.A04(r0)
            X.1bI r1 = r4.A1g
            X.00H r0 = r4.A2V
            java.lang.Object r0 = r0.get()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r1.A05(r0)
            X.1CJ r1 = r4.A0H
            X.1EC r0 = r4.A1K
            int r1 = r1.A06(r0)
            r0 = 6
            if (r1 != r0) goto L_0x0e77
            X.0ve r2 = r4.A0E
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0e77
            X.1bI r0 = r4.A1g
            android.view.View r1 = r0.A02()
            X.3cj r1 = (X.C74793cj) r1
            r0 = 2131233266(0x7f0809f2, float:1.8082665E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r4, r0)
            r1.setIcon((android.graphics.drawable.Drawable) r0)
            X.1bI r0 = r4.A1g
            android.view.View r1 = r0.A02()
            X.3cj r1 = (X.C74793cj) r1
            r0 = 2131886432(0x7f120160, float:1.9407443E38)
        L_0x0e6f:
            java.lang.String r0 = r4.getString(r0)
            r1.setTitle((java.lang.CharSequence) r0)
            return
        L_0x0e77:
            X.1bI r0 = r4.A1g
            android.view.View r3 = r0.A02()
            X.3cj r3 = (X.C74793cj) r3
            r2 = 2131233278(0x7f0809fe, float:1.8082689E38)
            r1 = 2130970925(0x7f04092d, float:1.7550574E38)
            r0 = 2131102369(0x7f060aa1, float:1.7817174E38)
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r4, r2, r0)
            r3.setIcon((android.graphics.drawable.Drawable) r0)
            X.1bI r0 = r4.A1g
            android.view.View r1 = r0.A02()
            X.3cj r1 = (X.C74793cj) r1
            r0 = 2131886433(0x7f120161, float:1.9407445E38)
            goto L_0x0e6f
        L_0x0e9f:
            r0 = 8
            r1.A04(r0)
            return
        L_0x0ea5:
            java.lang.Object r4 = r3.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            boolean r3 = r3.A02
            X.1EC r2 = r4.A1K
            X.1iW r0 = r4.A04
            X.49Y r1 = new X.49Y
            r1.<init>(r4, r0, r2, r3)
            X.10I r0 = r4.A05
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0eba:
            java.lang.Object r4 = r3.A01
            X.1FU r4 = (X.AnonymousClass1FU) r4
            boolean r3 = r3.A02
            X.1KB r2 = r4.A05
            r0 = 9
            X.3Cp r1 = new X.3Cp
            r1.<init>((int) r0, (java.lang.Object) r4, (boolean) r3)
        L_0x0ec9:
            r2.A0J(r1)
            return
        L_0x0ecd:
            boolean r0 = r3.A02
            java.lang.Object r2 = r3.A01
            X.1KB r2 = (X.AnonymousClass1KB) r2
            if (r0 == 0) goto L_0x0edf
            r1 = 2131893532(0x7f121d1c, float:1.9421843E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.A07(r1, r0)
            return
        L_0x0edf:
            r2.A04()
            return
        L_0x0ee3:
            java.lang.Object r1 = r3.A01
            X.DOr r1 = (X.C26995DOr) r1
            boolean r0 = r3.A02
            X.C26995DOr.A04(r1, r0)
            return
        L_0x0eed:
            java.lang.Object r2 = r3.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r2 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r2
            boolean r1 = r3.A02
            r0 = 0
            com.whatsapp.gallerypicker.GalleryPickerFragment.A03(r2, r0, r1)
            return
        L_0x0ef8:
            java.lang.Object r5 = r3.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r5 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r5
            boolean r4 = r3.A02
            X.87B r3 = r5.A28()
            X.1KB r2 = r5.A26()
            r1 = 49
            X.7RF r0 = new X.7RF
            r0.<init>(r3, r5, r1, r4)
            r2.CGP(r0)
            return
        L_0x0f11:
            java.lang.Object r1 = r3.A01
            com.whatsapp.deeplink.DeepLinkActivity r1 = (com.whatsapp.deeplink.DeepLinkActivity) r1
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0f22
            java.lang.String r0 = "deep_link_call_phone_number/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.deeplink.DeepLinkActivity.A0w(r1)
            return
        L_0x0f22:
            r0 = 2131887807(0x7f1206bf, float:1.9410232E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 0
            java.lang.String r7 = "call_phone_number_deep_error_dialog_tag"
            r5 = r2
            r6 = r2
            r8 = r2
            r9 = r2
            r4 = r2
            r1.CMx(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0f35:
            if (r1 != 0) goto L_0x0f6e
            X.00H r0 = r4.A00
            java.lang.Object r2 = r0.get()
            X.1mM r2 = (X.C35511mM) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FbAccountManager/hasUserConsented called by "
            r1.append(r0)
            java.lang.String r0 = "CROSSPOST_STATE_DAILY_STATS_CRON"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C18070vi.A0d(r0, r3)
            X.00H r0 = r2.A00
            java.lang.Object r0 = r0.get()
            X.6hu r0 = (X.C129506hu) r0
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.2pf r0 = (X.C61422pf) r0
            android.content.SharedPreferences r1 = X.C61422pf.A00(r0)
            java.lang.String r0 = "pref_xfamily_fb_account_user_consented"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0f6e
            return
        L_0x0f6e:
            X.2FI r3 = new X.2FI
            r3.<init>()
            X.00H r2 = r4.A00
            java.lang.Object r0 = r2.get()
            X.1mM r0 = (X.C35511mM) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A07
            boolean r0 = r0.A06(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            java.lang.Object r0 = r2.get()
            X.1mM r0 = (X.C35511mM) r0
            java.lang.Boolean r0 = r0.A01(r1)
            r3.A01 = r0
            X.00H r0 = r4.A01
            java.lang.Object r0 = r0.get()
            X.18K r0 = (X.AnonymousClass18K) r0
            r0.CC7(r3)
            return
        L_0x0f9f:
            X.1KB r1 = r2.A01
            r0 = 2131890601(0x7f1211a9, float:1.9415898E38)
            r1.A08(r0, r3)
            X.73q r0 = r2.A0A
            r0.A06(r2)
            r2.A02 = r3
            return
        L_0x0faf:
            X.9I2 r18 = X.AnonymousClass9I2.ACTIVE
            goto L_0x0fb4
        L_0x0fb2:
            X.9I2 r18 = X.AnonymousClass9I2.INACTIVE
        L_0x0fb4:
            X.1DT r1 = r5.A04
            X.9jZ r14 = r5.A09
            r23 = 0
            r17 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r16 = r15
            X.9xu r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0fdf
        L_0x0fcb:
            monitor-exit(r6)
            X.1DT r1 = r7.A02
            int r0 = r6.A02(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0E(r0)
            X.1DT r1 = r7.A01
            X.9de r0 = r6.A03(r5)
        L_0x0fdf:
            r1.A0E(r0)
            return
        L_0x0fe3:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0fe3 }
            throw r1
        L_0x0fe6:
            X.00H r0 = r5.A0g
            java.lang.Object r3 = r0.get()
            X.9gs r3 = (X.C188099gs) r3
            X.10s r2 = r3.A05
            r1 = 31
            X.AkF r0 = new X.AkF
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70813Cp.run():void");
    }

    public C70813Cp(C32291gx r2, int i, boolean z) {
        this.A00 = i;
        if (18 - i != 0) {
            this.A01 = r2;
            this.A02 = z;
            return;
        }
        this.A01 = r2;
        this.A02 = true;
    }

    public C70813Cp(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public C70813Cp(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z) {
        this.A00 = 26;
        this.A01 = paymentIncentiveViewModel;
        this.A02 = z;
    }
}
