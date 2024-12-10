package X;

import android.view.View;

public class AFP implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AFP(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v121, types: [X.9NO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v58, types: [X.9NO, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0409, code lost:
        r1 = java.lang.Integer.valueOf(r0);
        r0 = "two_factor_nudge_prompt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0453, code lost:
        com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment.A02(r3, (java.lang.String) null, 1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0458, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0538, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x053b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x063b, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x063e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x065e, code lost:
        X.AZ6.A04(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0661, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0666, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0669, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f4, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0649;
                case 1: goto L_0x063f;
                case 2: goto L_0x0625;
                case 3: goto L_0x03ad;
                case 4: goto L_0x060f;
                case 5: goto L_0x05d9;
                case 6: goto L_0x0585;
                case 7: goto L_0x0570;
                case 8: goto L_0x0548;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x053c;
                case 12: goto L_0x0135;
                case 13: goto L_0x0534;
                case 14: goto L_0x0528;
                case 15: goto L_0x04e9;
                case 16: goto L_0x04d8;
                case 17: goto L_0x04d0;
                case 18: goto L_0x00f8;
                case 19: goto L_0x047c;
                case 20: goto L_0x0473;
                case 21: goto L_0x0459;
                case 22: goto L_0x0442;
                case 23: goto L_0x0429;
                case 24: goto L_0x0411;
                case 25: goto L_0x03e9;
                case 26: goto L_0x03de;
                case 27: goto L_0x03d2;
                case 28: goto L_0x0662;
                case 29: goto L_0x03b5;
                case 30: goto L_0x03ad;
                case 31: goto L_0x00ec;
                case 32: goto L_0x03ad;
                case 33: goto L_0x0398;
                case 34: goto L_0x0383;
                case 35: goto L_0x032b;
                case 36: goto L_0x0317;
                case 37: goto L_0x00ca;
                case 38: goto L_0x0098;
                case 39: goto L_0x0059;
                case 40: goto L_0x02fd;
                case 41: goto L_0x0295;
                case 42: goto L_0x004f;
                case 43: goto L_0x0295;
                case 44: goto L_0x025b;
                case 45: goto L_0x019e;
                case 46: goto L_0x0029;
                case 47: goto L_0x000f;
                case 48: goto L_0x016c;
                case 49: goto L_0x015a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r0
            r0.onBackPressed()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r2 = (com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r2
            com.whatsapp.qrcode.WaQrScannerView r0 = r2.A08
            boolean r0 = r0.COq()
            if (r0 == 0) goto L_0x000e
            android.widget.ImageView r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.10I r1 = r2.A0A
            r0 = 2
            X.C21427Aju.A00(r1, r2, r0)
            return
        L_0x0029:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r1 = (com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r1
            X.1FL r2 = r1.A1B()
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiQrTabActivity
            if (r0 == 0) goto L_0x000e
            X.00H r0 = r1.A0B
            java.lang.Object r1 = r0.get()
            X.9oU r1 = (X.C192489oU) r1
            r0 = 4
            r1.A01(r0)
            X.1FP r2 = (X.AnonymousClass1FP) r2
            r0 = 22
            android.content.Intent r1 = X.AnonymousClass1LU.A0E(r2, r0)
            r0 = 203(0xcb, float:2.84E-43)
            r2.startActivityForResult(r1, r0)
            return
        L_0x004f:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            goto L_0x00f4
        L_0x0059:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.AZ6 r4 = r5.A0S
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r5.A08
            r0 = 1
            java.lang.String r3 = "payments_profile"
            r4.BiL(r2, r3, r1, r0)
            r0 = 12
            boolean r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.A0c(r5, r0)
            if (r0 == 0) goto L_0x000e
            X.A2y r0 = r5.A05
            boolean r0 = r0.A07()
            java.lang.String r2 = "extra_payment_name"
            if (r0 == 0) goto L_0x0095
            java.lang.String r3 = r5.A08
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.class
        L_0x0083:
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r5, r0)
            java.lang.String r0 = "extra_referral_screen"
            r1.putExtra(r0, r3)
            X.77e r0 = r5.A03
            r1.putExtra(r2, r0)
            r5.startActivity(r1)
            return
        L_0x0095:
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            goto L_0x0083
        L_0x0098:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.AZ6 r4 = r5.A0S
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r5.A08
            r0 = 1
            java.lang.String r1 = "payments_profile"
            r4.BiL(r3, r1, r2, r0)
            r0 = 12
            boolean r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.A0c(r5, r0)
            if (r0 == 0) goto L_0x000e
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r5, r0)
            java.lang.String r0 = "extra_referral_screen"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_payment_name"
            X.77e r0 = r5.A03
            r2.putExtra(r1, r0)
            r5.startActivity(r2)
            return
        L_0x00ca:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.AZ6 r4 = r5.A0S
            r0 = 130(0x82, float:1.82E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "payments_profile"
            java.lang.String r1 = r5.A08
            r0 = 1
            r4.BiL(r3, r2, r1, r0)
            r0 = 13
            boolean r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.A0c(r5, r0)
            if (r0 == 0) goto L_0x000e
            r0 = 38
            X.AnonymousClass4Yv.A01(r5, r0)
            return
        L_0x00ec:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity$BottomSheetValuePropsFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.BottomSheetValuePropsFragment) r0
            com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.BottomSheetValuePropsFragment.A00(r0)
        L_0x00f4:
            if (r0 == 0) goto L_0x000e
            goto L_0x0666
        L_0x00f8:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r2
            android.content.Context r1 = r2.A14()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity.class
            android.content.Intent r0 = X.AnonymousClass8BR.A07(r1, r0)
            r2.A1k(r0)
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r1 = r2.A0Y
            X.A0v r7 = r2.A0d
            X.BD4 r6 = r1.A09
            boolean r0 = r6 instanceof X.AZ6
            if (r0 == 0) goto L_0x000e
            X.AZ6 r6 = (X.AZ6) r6
            java.lang.Integer r5 = X.C17880vN.A0h()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r3 = r1.A0d()
            X.11P r1 = r1.A05
            r2 = 0
            r0 = 0
            X.A7u r1 = X.C20087A6p.A00(r1, r2, r7, r2, r0)
            java.lang.String r0 = "payment_home"
            X.8sO r0 = r6.A07(r5, r4, r0, r2)
            X.AZ6.A01(r0, r1, r6, r3)
            return
        L_0x0135:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity.A0Q(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r1.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            com.google.android.material.textfield.TextInputLayout r0 = r1.A02
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            X.AEs r0 = r1.A03
            r1.A59(r0)
            return
        L_0x015a:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r1 = r2.A1n()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity> r0 = com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity.class
            android.content.Intent r0 = X.AnonymousClass8BR.A07(r1, r0)
            r2.A1k(r0)
            return
        L_0x016c:
            java.lang.Object r6 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r6 = (com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r6
            android.os.Bundle r0 = r6.A15()
            java.lang.String r5 = "referral_screen"
            java.lang.String r4 = r0.getString(r5)
            X.AZ6 r3 = r6.A07
            r0 = 201(0xc9, float:2.82E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "scan_qr_code"
            r2 = 1
            r3.BiL(r1, r0, r4, r2)
            android.content.Context r0 = r6.A14()
            android.content.Intent r1 = X.AnonymousClass1LU.A08(r0)
            java.lang.String r0 = "for_payment_to_number"
            r1.putExtra(r0, r2)
            r1.putExtra(r5, r4)
            r0 = 501(0x1f5, float:7.02E-43)
            r6.startActivityForResult(r1, r0)
            return
        L_0x019e:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity r0 = (com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity) r0
            r10 = 0
            r1 = 2131894190(0x7f121fae, float:1.9423178E38)
            r0.CNA(r1)
            X.8F3 r5 = r0.A06
            if (r5 != 0) goto L_0x01b4
            java.lang.String r3 = "savingsOfferViewModel"
        L_0x01af:
            X.C18070vi.A11(r3)
        L_0x01b2:
            r0 = 0
            throw r0
        L_0x01b4:
            X.205 r2 = r0.A07
            X.0vl r1 = r0.A0B
            if (r1 != 0) goto L_0x01bd
            java.lang.String r3 = "checkoutInfoContent"
            goto L_0x01af
        L_0x01bd:
            java.lang.Object r4 = r1.getValue()
            X.AEn r4 = (X.C20279AEn) r4
            X.ADv r1 = r0.A04
            java.lang.String r3 = "savingsOfferToBeApplied"
            if (r1 == 0) goto L_0x01af
            java.lang.String r8 = r1.A02
            java.lang.String r7 = r1.A00
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            r1 = 0
            if (r2 == 0) goto L_0x01d4
            X.1BI r1 = r2.A00
        L_0x01d4:
            com.whatsapp.jid.UserJid r13 = X.C22941Dw.A01(r1)
            X.11S r1 = r5.A00
            com.whatsapp.jid.PhoneUserJid r15 = X.AnonymousClass11S.A00(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r15, r1)
            if (r4 == 0) goto L_0x0219
            X.AE0 r6 = r4.A0C
            if (r6 == 0) goto L_0x0219
            if (r13 == 0) goto L_0x0219
            java.lang.String r3 = r6.A01
            if (r3 == 0) goto L_0x0219
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x0219
            java.lang.Integer r17 = X.AnonymousClass00R.A01
            r14 = 0
            r16 = r4
            r18 = r8
            r19 = r7
            org.json.JSONObject r18 = X.C196819vh.A01(r14, r15, r16, r17, r18, r19)
            X.9mh r11 = r5.A03
            X.0vb r1 = r5.A01
            java.lang.String r14 = r1.A06()
            X.C18070vi.A0X(r14)
            java.lang.String r15 = r6.A00
            X.AS8 r12 = new X.AS8
            r12.<init>(r5, r4, r10)
            r16 = r2
            r17 = r3
            r11.A00(r12, r13, r14, r15, r16, r17, r18)
        L_0x0219:
            r2 = 0
            X.A7u r3 = X.C20112A7u.A01()
            com.google.android.material.textfield.TextInputLayout r1 = r0.A01
            if (r1 != 0) goto L_0x0225
            java.lang.String r3 = "savingsOfferCodeInput"
            goto L_0x01af
        L_0x0225:
            android.widget.EditText r1 = r1.A0B
            if (r1 == 0) goto L_0x0236
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0236
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0236
            r2 = 1
        L_0x0236:
            java.lang.String r1 = "is_entered"
            r3.A08(r1, r2)
            X.AZ6 r2 = r0.A03
            if (r2 == 0) goto L_0x0254
            r1 = 207(0xcf, float:2.9E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = r0.A0A
            java.lang.String r7 = r0.A09
            java.lang.String r8 = r0.A08
            r9 = 1
            java.lang.String r5 = "order_coupon_selection"
            r11 = r9
            r12 = r10
            r2.BiJ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0254:
            java.lang.String r0 = "indiaUpiFieldStatsLogger"
            X.C18070vi.A11(r0)
            goto L_0x01b2
        L_0x025b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r0
            X.8Ft r2 = r0.A0O
            X.1QL r0 = r2.A0C
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0287
            r0 = 1
            X.9NO r1 = new X.9NO
            r1.<init>()
            r1.A00 = r0
            X.1DT r0 = r2.A06
            java.lang.Object r0 = X.AnonymousClass8BS.A0W(r0)
            X.A8b r0 = (X.C20118A8b) r0
            java.lang.String r0 = r0.A08
            r1.A01 = r0
            java.lang.String r0 = r2.A0B
            r1.A02 = r0
            X.1wy r0 = r2.A0A
            r0.A0F(r1)
            return
        L_0x0287:
            X.1wy r2 = r2.A0A
            r1 = 0
            X.9NO r0 = new X.9NO
            r0.<init>()
            r0.A00 = r1
            r2.A0F(r0)
            return
        L_0x0295:
            java.lang.Object r5 = r1.A01
            X.91L r5 = (X.AnonymousClass91L) r5
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r5.CNA(r0)
            X.AZ6 r4 = r5.A0S
            java.lang.Integer r3 = X.C17880vN.A0l()
            boolean r0 = r5 instanceof com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity
            if (r0 == 0) goto L_0x02fa
            java.lang.String r2 = "notify_verification_prompt"
        L_0x02ab:
            java.lang.String r1 = r5.A0f
            r0 = 1
            r4.BiL(r3, r2, r1, r0)
            X.8z6 r5 = r5.A02
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup sendGetPspRoutingAndListKeys called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1OZ r6 = r5.A04
            java.lang.String r9 = r6.A0B()
            java.lang.String r2 = "id"
            X.1cX r3 = X.C108955ca.A0Y()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass8BY.A19(r3, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:pay"
            X.C29591cX.A01(r3, r1, r0)
            r11 = 0
            X.AnonymousClass8BY.A18(r3, r9, r2)
            X.1cX r2 = X.AnonymousClass8BS.A0R()
            java.lang.String r1 = "action"
            java.lang.String r0 = "upi-get-psp-routing-and-list-keys"
            X.C29591cX.A01(r2, r1, r0)
            X.1ca r8 = X.C29591cX.A00(r2, r3)
            android.content.Context r1 = r5.A01
            X.1KB r2 = r5.A02
            X.1jG r3 = r5.A06
            X.9ui r4 = r5.A00
            X.8zY r0 = new X.8zY
            r0.<init>((android.content.Context) r1, (X.AnonymousClass1KB) r2, (X.C33711jG) r3, (X.C196259ui) r4, (X.C175678z6) r5)
            r10 = 204(0xcc, float:2.86E-43)
            r7 = r0
            r6.A0I(r7, r8, r9, r10, r11)
            return
        L_0x02fa:
            java.lang.String r2 = "notify_verification_screen"
            goto L_0x02ab
        L_0x02fd:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.AZ6 r4 = r5.A0S
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.AnonymousClass8BV.A0p(r5)
            r1 = 1
            java.lang.String r0 = "payments_profile"
            r4.BiL(r3, r0, r2, r1)
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.A0Q(r5)
            return
        L_0x0317:
            java.lang.Object r3 = r1.A01
            X.91T r3 = (X.AnonymousClass91T) r3
            X.AZ6 r2 = r3.A0S
            java.lang.Integer r1 = X.C17880vN.A0l()
            java.lang.String r0 = "pin_created"
            X.AZ6.A04(r2, r1, r0)
            r3.A4o()
            goto L_0x063b
        L_0x032b:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r3
            X.A6g r1 = r3.A0O
            X.8pN r0 = r3.A02
            boolean r0 = r1.A08(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0380
            int r0 = r3.A00
            if (r0 != r4) goto L_0x0380
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity.class
        L_0x0340:
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r3, r0)
            java.lang.String r1 = "extra_bank_account"
            X.8pN r0 = r3.A02
            r2.putExtra(r1, r0)
            r3.A4v(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r3.A05
            r2.putExtra(r1, r0)
            r0 = 1012(0x3f4, float:1.418E-42)
            r3.startActivityForResult(r2, r0)
            X.A7u r6 = X.C20112A7u.A02()
            int r0 = r3.A00
            if (r0 != r4) goto L_0x037d
            java.lang.String r1 = "aadhaar_number"
        L_0x0364:
            java.lang.String r0 = "selected_option"
            r6.A07(r0, r1)
            X.AZ6 r5 = r3.A0S
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r8 = X.C17880vN.A0l()
            java.lang.String r9 = r3.A0c
            java.lang.String r10 = r3.A05
            java.lang.String r11 = r3.A0f
            r5.A0B(r6, r7, r8, r9, r10, r11)
            return
        L_0x037d:
            java.lang.String r1 = "debit_card"
            goto L_0x0364
        L_0x0380:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.class
            goto L_0x0340
        L_0x0383:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment) r1
            X.BBQ r0 = r1.A06
            if (r0 == 0) goto L_0x038e
            r0.BpA()
        L_0x038e:
            X.AZ6 r2 = r1.A05
            java.lang.Integer r1 = X.C17880vN.A0j()
            java.lang.String r0 = "setup_pin_prompt"
            goto L_0x065e
        L_0x0398:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment) r1
            X.BBQ r0 = r1.A06
            if (r0 == 0) goto L_0x03a3
            r0.BqB()
        L_0x03a3:
            X.AZ6 r2 = r1.A05
            java.lang.Integer r1 = X.C17880vN.A0l()
            java.lang.String r0 = "setup_pin_prompt"
            goto L_0x065e
        L_0x03ad:
            java.lang.Object r0 = r1.A01
            X.91K r0 = (X.AnonymousClass91K) r0
            r0.A51()
            return
        L_0x03b5:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r2
            X.1L9 r1 = r2.A01
            java.lang.String r0 = "https://faq.whatsapp.com/payments/security-and-privacy/about-payments-data/"
            X.AnonymousClass8BV.A13(r2, r1, r0)
            X.8sO r1 = r2.A09
            java.lang.Integer r0 = X.C108955ca.A0f()
            r1.A07 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A08 = r0
            X.AZ6.A02(r1, r2)
            return
        L_0x03d2:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A28()
            X.AZ6 r2 = r0.A01
            r0 = 96
            goto L_0x0409
        L_0x03de:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A28()
            X.AZ6 r2 = r0.A01
            r0 = 3
            goto L_0x0409
        L_0x03e9:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r4 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r4
            r4.A28()
            X.B5a r3 = r4.A02
            if (r3 == 0) goto L_0x0406
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {1, 2} // fill-array
            java.lang.String r1 = "CONTINUE"
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1h(r3, r1, r2, r0)
            r3.startActivity(r0)
        L_0x0406:
            X.AZ6 r2 = r4.A01
            r0 = 5
        L_0x0409:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "two_factor_nudge_prompt"
            goto L_0x065e
        L_0x0411:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.9m1 r2 = r3.A0C
            if (r2 == 0) goto L_0x0427
            X.1FU r1 = r2.A00
            java.lang.String r0 = "IndiaUpiPaymentTransactionConfirmationFragment"
            r1.A41(r0)
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0427
            r1.finish()
        L_0x0427:
            r2 = 3
            goto L_0x0453
        L_0x0429:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.9m1 r2 = r3.A0C
            if (r2 == 0) goto L_0x043f
            X.1FU r1 = r2.A00
            java.lang.String r0 = "IndiaUpiPaymentTransactionConfirmationFragment"
            r1.A41(r0)
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x043f
            r1.finish()
        L_0x043f:
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0453
        L_0x0442:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.9m1 r1 = r3.A0C
            if (r1 == 0) goto L_0x0451
            java.lang.String r0 = r3.A0H
            if (r0 == 0) goto L_0x0451
            r1.A00(r0)
        L_0x0451:
            r2 = 44
        L_0x0453:
            r1 = 0
            r0 = 1
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment.A02(r3, r1, r0, r2)
            return
        L_0x0459:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r4 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r4
            X.8GH r1 = r4.A0h
            if (r1 == 0) goto L_0x046f
            r0 = 97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 0
            X.BD4 r1 = r1.A09
            java.lang.String r0 = "payment_home"
            X.AnonymousClass8BU.A1C(r1, r3, r0, r2)
        L_0x046f:
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A07(r4)
            return
        L_0x0473:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 0
            r1.A2N(r0)
            return
        L_0x047c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r1
            android.content.Context r2 = r1.A14()
            java.util.List r0 = r1.A0w
            int r6 = r0.size()
            X.9YU r5 = new X.9YU
            r5.<init>(r1)
            r4 = 2131893729(0x7f121de1, float:1.9422243E38)
            r0 = 2131893728(0x7f121de0, float:1.942224E38)
            r3 = 0
            r1 = 1
            X.3Rj r2 = X.AnonymousClass4a6.A00(r2)
            if (r6 <= 0) goto L_0x04b8
            r0 = 2131893732(0x7f121de4, float:1.9422249E38)
            r2.A0E(r0)
            r0 = 2131893731(0x7f121de3, float:1.9422247E38)
            r2.A0D(r0)
            r2.A0T(r1)
            r0 = 2131893730(0x7f121de2, float:1.9422245E38)
            r2.A0Z(r3, r0)
        L_0x04b2:
            X.05w r0 = X.AnonymousClass3MY.A0L(r2)
            goto L_0x0538
        L_0x04b8:
            r2.A0E(r4)
            r2.A0D(r0)
            r2.A0T(r1)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r2.A0X(r3, r0)
            r1 = 2131893727(0x7f121ddf, float:1.9422239E38)
            r0 = 41
            X.C20155A9r.A01(r2, r5, r0, r1)
            goto L_0x04b2
        L_0x04d0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r0
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A09(r0)
            return
        L_0x04d8:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r0
            r0.A28()
            X.AZ6 r2 = r0.A00
            java.lang.Integer r1 = X.C17880vN.A0j()
            java.lang.String r0 = "raise_complaint_prompt"
            goto L_0x065e
        L_0x04e9:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r1
            r1.A28()
            X.B5Z r0 = r1.A01
            if (r0 == 0) goto L_0x051e
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.96K r3 = r0.A08
            boolean r0 = r3.A10()
            if (r0 == 0) goto L_0x051e
            X.9NU r0 = r3.A06
            X.AW0 r4 = r0.A01
            X.8pG r5 = r4.A0A
            X.1QS r0 = r3.A0c
            X.AZ9 r0 = X.AnonymousClass8BU.A0U(r0)
            X.BD4 r6 = r0.BRb()
            r0 = 1
            r3.A0q(r0)
            X.10I r0 = r3.A0l
            r7 = 11
            X.7Py r2 = new X.7Py
            r2.<init>(r3, r4, r5, r6, r7)
            r0.CGF(r2)
        L_0x051e:
            X.AZ6 r2 = r1.A00
            java.lang.Integer r1 = X.C17880vN.A0l()
            java.lang.String r0 = "raise_complaint_prompt"
            goto L_0x065e
        L_0x0528:
            java.lang.Object r0 = r1.A01
            X.AZh r0 = (X.C20804AZh) r0
            X.91R r1 = r0.A06
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity> r0 = com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity.class
            X.AnonymousClass8BT.A16(r1, r0)
            return
        L_0x0534:
            java.lang.Object r0 = r1.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
        L_0x0538:
            r0.show()
            return
        L_0x053c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r1 = (com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r1
            r0 = 5
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.A0Q(r1, r0)
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.A03(r1)
            return
        L_0x0548:
            java.lang.Object r3 = r1.A01
            X.91T r3 = (X.AnonymousClass91T) r3
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "extra_selected_bank"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x0569
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r3, r0)
            r3.A4v(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = "error"
            X.AnonymousClass8BU.A13(r2, r3, r1, r0)
            return
        L_0x0569:
            java.lang.String r0 = "User Selected bank object not found in intent bundle extras"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x063b
        L_0x0570:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 0
            r1.A0b = r0
            android.content.Intent r0 = X.AnonymousClass1LU.A07(r1)
            r1.A4v(r0)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x0585:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r1 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r1
            X.AEC r0 = r1.A0B
            java.lang.String r2 = r0.A02
            java.lang.String r8 = "active"
            boolean r0 = r2.equals(r8)
            java.lang.String r9 = "inactive"
            if (r0 != 0) goto L_0x05be
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L_0x05a3
            java.lang.String r0 = "Unexpected status"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x05a3:
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.A03(r1, r8)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r2 = r1.A0F
            X.8z3 r6 = r1.A0D
            X.AEC r5 = r1.A0B
            X.AXS r0 = r1.A0N
            X.77e r3 = r0.A0D()
            X.AXS r0 = r1.A0N
            java.lang.String r7 = r0.A0J()
            X.77e r4 = r1.A0A
            r2.A0T(r3, r4, r5, r6, r7, r8)
            return
        L_0x05be:
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.A03(r1, r9)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r3 = r1.A0F
            X.8z3 r7 = r1.A0D
            X.AEC r6 = r1.A0B
            X.AXS r0 = r1.A0N
            X.77e r4 = r0.A0D()
            X.AXS r0 = r1.A0N
            java.lang.String r8 = r0.A0J()
            X.77e r5 = r1.A0A
            r3.A0T(r4, r5, r6, r7, r8, r9)
            return
        L_0x05d9:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r2
            X.AEC r0 = r2.A0B
            if (r0 == 0) goto L_0x0609
            X.A7u r4 = X.C20112A7u.A02()
            X.AEC r0 = r2.A0B
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "alias_status"
            r4.A07(r0, r1)
            X.AEC r0 = r2.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "alias_type"
            r4.A07(r0, r1)
            X.AZ6 r3 = r2.A0S
            r0 = 130(0x82, float:1.82E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = X.AnonymousClass8BV.A0p(r2)
            r8 = 1
            java.lang.String r6 = "alias_info"
            r3.BiM(r4, r5, r6, r7, r8)
        L_0x0609:
            r0 = 38
            X.AnonymousClass4Yv.A01(r2, r0)
            return
        L_0x060f:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity r2 = (com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity) r2
            X.9mR r5 = r2.A01
            X.ALX r4 = r2.A00
            r7 = 0
            java.lang.String r6 = "chat"
            X.9n8 r1 = new X.9n8
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 0
            r1.A00(r0)
            return
        L_0x0625:
            java.lang.Object r3 = r1.A01
            X.91K r3 = (X.AnonymousClass91K) r3
            r0 = 0
            r3.A55(r0)
            android.content.Intent r2 = X.AnonymousClass1LU.A08(r3)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "incentive_value_prop"
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
        L_0x063b:
            r3.finish()
            return
        L_0x063f:
            java.lang.Object r0 = r1.A01
            X.9dk r0 = (X.C186159dk) r0
            X.92u r0 = r0.A00
            r0.A5J()
            return
        L_0x0649:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.BCD r0 = r1.A07
            if (r0 == 0) goto L_0x0654
            r0.Buv()
        L_0x0654:
            X.AZ6 r2 = r1.A06
            r0 = 89
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "forgot_pin_prompt"
        L_0x065e:
            X.AZ6.A04(r2, r1, r0)
            return
        L_0x0662:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0666:
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFP.onClick(android.view.View):void");
    }
}
