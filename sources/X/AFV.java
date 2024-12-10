package X;

import android.view.View;
import com.whatsapp.businessupsell.BusinessProfileEducation;

public class AFV implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AFV(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0364, code lost:
        r5.CGF(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0367, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0396, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x039a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02e6, code lost:
        X.AnonymousClass8BT.A14(r3, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x035f, code lost:
        r4 = new X.C21452AkJ(r0, r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r3 = r16
            switch(r0) {
                case 0: goto L_0x0368;
                case 1: goto L_0x0355;
                case 2: goto L_0x034a;
                case 3: goto L_0x0335;
                case 4: goto L_0x032b;
                case 5: goto L_0x0319;
                case 6: goto L_0x02ea;
                case 7: goto L_0x0073;
                case 8: goto L_0x02d7;
                case 9: goto L_0x02bf;
                case 10: goto L_0x002f;
                case 11: goto L_0x02b5;
                case 12: goto L_0x02a3;
                case 13: goto L_0x0272;
                case 14: goto L_0x0242;
                case 15: goto L_0x0227;
                case 16: goto L_0x01f4;
                case 17: goto L_0x01b9;
                case 18: goto L_0x0180;
                case 19: goto L_0x0148;
                case 20: goto L_0x0118;
                case 21: goto L_0x038a;
                case 22: goto L_0x0101;
                case 23: goto L_0x00e2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r15.A01
            X.6yQ r1 = (X.C139216yQ) r1
            java.lang.String r6 = "status_fragment"
            X.00H r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.7FM r0 = (X.AnonymousClass7FM) r0
            java.util.ArrayList r7 = r0.A01()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = "CrosspostShareViewController/generateXFamilyOnClickListener recent statuses empty"
        L_0x0021:
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x0025:
            return
        L_0x0026:
            boolean r0 = X.C1402870s.A02(r7)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = "CrosspostShareViewController/generateXFamilyOnClickListener some sent messages are not delivered"
            goto L_0x0021
        L_0x002f:
            java.lang.Object r4 = r15.A01
            X.3ry r4 = (X.C78013ry) r4
            java.lang.String r2 = r15.A02
            X.11S r0 = r4.A05
            boolean r0 = r0.A0N()
            com.whatsapp.jid.UserJid r1 = r4.A09
            if (r0 != 0) goto L_0x0055
            X.C17960vV.A07(r1)
            com.whatsapp.jid.UserJid r0 = r4.A02
            X.C17960vV.A07(r0)
            com.whatsapp.conversation.ChangeNumberNotificationDialogFragment r1 = com.whatsapp.conversation.ChangeNumberNotificationDialogFragment.A00(r1, r0, r2)
            X.5cS r0 = r4.A01
            X.1FY r0 = r0.CFa()
            r0.CMl(r1)
            return
        L_0x0055:
            com.whatsapp.jid.UserJid r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0025
            X.1LU r3 = r4.A08
            X.5cS r2 = r4.A01
            X.1FY r1 = r2.CFa()
            com.whatsapp.jid.UserJid r0 = r4.A02
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r1, r3, r0)
            X.1FY r0 = r2.CFa()
            r0.startActivity(r1)
            return
        L_0x0073:
            java.lang.Object r5 = r15.A01
            com.whatsapp.businessupsell.BusinessProfileEducation r5 = (com.whatsapp.businessupsell.BusinessProfileEducation) r5
            java.lang.String r1 = "smb_cs_profile"
            X.9jn r0 = r5.A04
            if (r0 == 0) goto L_0x0387
            android.content.Intent r0 = r0.A00(r1)
            r5.startActivity(r0)
            r0 = 2
            com.whatsapp.businessupsell.BusinessProfileEducation.A03(r5, r0)
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = "key_extra_verified_level"
            r0 = -1
            int r0 = r2.getIntExtra(r1, r0)
            r4 = 3
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            if (r0 == 0) goto L_0x0025
            X.00H r0 = r5.A07
            if (r0 == 0) goto L_0x0384
            java.lang.Object r3 = r0.get()
            X.Cgm r3 = (X.C25491Cgm) r3
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "key_extra_business_jid"
            java.lang.String r2 = r1.getStringExtra(r0)
            if (r2 != 0) goto L_0x00b2
            java.lang.String r2 = ""
        L_0x00b2:
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 6
            X.C25491Cgm.A00(r3, r1, r2, r4, r0)
            return
        L_0x00bb:
            X.00H r0 = r1.A04
            java.lang.Object r2 = r0.get()
            X.1x7 r2 = (X.C41821x7) r2
            android.content.Context r3 = X.AnonymousClass3MY.A04(r3)
            java.lang.Integer r5 = X.C17880vN.A0j()
            X.3BD r1 = new X.3BD
            r1.<init>(r3, r2, r5, r6)
            r0 = 1
            X.3BC r4 = new X.3BC
            r4.<init>(r2, r1, r0)
            X.00H r0 = r2.A02
            java.lang.Object r2 = r0.get()
            X.6yI r2 = (X.C139146yI) r2
            r2.A00(r3, r4, r5, r6, r7)
            return
        L_0x00e2:
            java.lang.Object r3 = r15.A01
            com.whatsapp.spamwarning.SpamWarningActivity r3 = (com.whatsapp.spamwarning.SpamWarningActivity) r3
            java.lang.String r1 = r15.A02
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f8
            android.net.Uri r0 = android.net.Uri.parse(r1)
            goto L_0x02e6
        L_0x00f8:
            X.129 r1 = r3.A03
            r0 = 0
            android.net.Uri r0 = r1.A04(r0)
            goto L_0x02e6
        L_0x0101:
            java.lang.Object r2 = r15.A01
            X.8Bb r2 = (X.C161028Bb) r2
            java.lang.String r1 = r15.A02
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            android.content.Intent r1 = X.C72473Md.A0D(r1)
            android.app.Activity r0 = r2.A00
            r0.startActivity(r1)
            r0.finish()
            return
        L_0x0118:
            java.lang.Object r4 = r15.A01
            com.whatsapp.product.newsletterenforcements.disputesettlement.DisputeSettlementBodyCopyFragment r4 = (com.whatsapp.product.newsletterenforcements.disputesettlement.DisputeSettlementBodyCopyFragment) r4
            java.lang.String r3 = r15.A02
            boolean r2 = X.C18070vi.A15(r4, r3)
            X.11C r0 = r4.A01
            if (r0 == 0) goto L_0x0144
            android.content.ClipboardManager r1 = r0.A09()
            java.lang.String r0 = "reference-number"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r3)
            if (r1 == 0) goto L_0x0135
            r1.setPrimaryClip(r0)
        L_0x0135:
            X.1KB r1 = r4.A00
            if (r1 == 0) goto L_0x0140
            r0 = 2131892571(0x7f12195b, float:1.9419894E38)
            r1.A08(r0, r2)
            return
        L_0x0140:
            java.lang.String r0 = "globalUI"
            goto L_0x0396
        L_0x0144:
            java.lang.String r0 = "systemServices"
            goto L_0x0396
        L_0x0148:
            java.lang.Object r1 = r15.A01
            com.whatsapp.payments.ui.IndiaUpiSendPayContactPickerFragment r1 = (com.whatsapp.payments.ui.IndiaUpiSendPayContactPickerFragment) r1
            java.lang.String r3 = r15.A02
            r10 = 0
            X.1FL r5 = r1.A1D()
            X.1FL r6 = r1.A1D()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.C18070vi.A0z(r6, r0)
            X.1FR r6 = (X.AnonymousClass1FR) r6
            X.9mR r8 = r1.A02
            if (r8 == 0) goto L_0x017c
            X.ALX r7 = r1.A02
            java.lang.String r9 = "payment_contact_picker"
            X.9n8 r4 = new X.9n8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = 0
            r4.A00(r0)
            X.AZ6 r2 = r1.A02
            r0 = 132(0x84, float:1.85E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2.BiL(r1, r9, r3, r0)
            return
        L_0x017c:
            java.lang.String r0 = "paymentUnblockHelper"
            goto L_0x0396
        L_0x0180:
            java.lang.Object r5 = r15.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r5 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r5
            java.lang.String r6 = r15.A02
            X.AZ6 r3 = r5.A0Q
            r0 = 129(0x81, float:1.81E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 1
            java.lang.String r4 = "payment_home"
            r3.BiL(r2, r4, r1, r0)
            X.1FL r3 = r5.A1D()
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "accountHolderName"
            X.77e r2 = X.AnonymousClass8BR.A0Y(r2, r1, r6, r0)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r3, r0)
            java.lang.String r0 = "extra_payment_name"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_referral_screen"
            r1.putExtra(r0, r4)
            r5.A1k(r1)
            return
        L_0x01b9:
            java.lang.Object r2 = r15.A01
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r2
            java.lang.String r14 = r15.A02
            r0 = 2131893634(0x7f121d82, float:1.942205E38)
            r2.CNA(r0)
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A0V(r2, r14)
            X.11P r5 = r2.A05
            X.1KB r3 = r2.A00
            X.11S r4 = r2.A02
            X.00H r0 = r2.A0E
            X.1OZ r7 = X.C17880vN.A0U(r0)
            X.1ek r13 = r2.A0A
            X.1QS r11 = r2.A0A
            X.1ex r10 = r2.A03
            X.9mW r12 = r2.A07
            X.1KI r6 = r2.A00
            X.A6a r8 = r2.A04
            X.00H r0 = r2.A0B
            X.1jG r9 = X.AnonymousClass8BR.A0a(r0)
            X.9nO r1 = new X.9nO
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.AY4 r0 = new X.AY4
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x01f4:
            java.lang.Object r3 = r15.A01
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r3 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r3
            java.lang.String r8 = r15.A02
            r0 = 2131893634(0x7f121d82, float:1.942205E38)
            r3.CNA(r0)
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A0V(r3, r8)
            X.9oR r4 = r3.A0D
            r0 = 2
            X.AbO r7 = new X.AbO
            r7.<init>(r3, r0)
            X.Aak r5 = new X.Aak
            r5.<init>(r3, r0)
            r0 = 4
            X.AbG r6 = new X.AbG
            r6.<init>(r3, r0)
            java.lang.String r9 = "payment_method_details"
            X.Af0 r2 = r4.A01(r5, r6, r7, r8, r9)
            r1 = 13
            X.Aef r0 = new X.Aef
            r0.<init>(r3, r1)
            r2.A09(r0)
            return
        L_0x0227:
            java.lang.Object r1 = r15.A01
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r1 = (com.whatsapp.payments.ui.AddPaymentMethodBottomSheet) r1
            java.lang.String r4 = r15.A02
            X.B95 r0 = r1.A04
            if (r0 == 0) goto L_0x0234
            r0.C1m(r1)
        L_0x0234:
            X.BD4 r0 = r1.A02
            java.lang.Integer r2 = X.C17880vN.A0l()
            java.lang.String r3 = "get_started"
            r1 = 0
            r5 = 1
            r0.BiM(r1, r2, r3, r4, r5)
            return
        L_0x0242:
            java.lang.Object r3 = r15.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.String r2 = r15.A02
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L_0x0260
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "http://"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            android.net.Uri r1 = android.net.Uri.parse(r0)
        L_0x0260:
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r1)
            r3.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0268 }
            return
        L_0x0268:
            X.1KB r2 = r3.A05
            r1 = 2131886448(0x7f120170, float:1.9407475E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x0272:
            java.lang.Object r1 = r15.A01
            X.6Aq r1 = (X.C119966Aq) r1
            java.lang.String r7 = r15.A02
            java.util.List r0 = X.C42011xT.A0I
            X.C18070vi.A0b(r3)
            X.00H r0 = r1.A02
            java.lang.Object r2 = r0.get()
            X.73N r2 = (X.AnonymousClass73N) r2
            android.content.Context r4 = X.AnonymousClass3MY.A04(r3)
            X.77c r0 = r1.A00
            if (r0 == 0) goto L_0x02a1
            int r8 = r0.A01()
        L_0x0291:
            java.lang.ref.WeakReference r5 = X.AnonymousClass3MW.A0z(r1)
            r3 = 0
            r9 = 1
            X.7R6 r1 = new X.7R6
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass73N.A03(r2, r1)
            return
        L_0x02a1:
            r8 = 0
            goto L_0x0291
        L_0x02a3:
            java.lang.Object r4 = r15.A01
            X.1FY r4 = (X.AnonymousClass1FY) r4
            java.lang.String r3 = r15.A02
            X.1L9 r2 = r4.A01
            r1 = 6
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1U(r4, r3, r0, r1)
            r2.A08(r4, r0)
            return
        L_0x02b5:
            java.lang.Object r1 = r15.A01
            X.3R7 r1 = (X.AnonymousClass3R7) r1
            java.lang.String r0 = r15.A02
            X.AnonymousClass3R7.setUpCallLink$lambda$6$lambda$5(r1, r0, r3)
            return
        L_0x02bf:
            java.lang.Object r2 = r15.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r15.A02
            android.view.View r0 = r2.A17()
            android.content.Context r0 = r0.getContext()
            android.content.Intent r1 = X.AnonymousClass1LU.A1J(r0, r1)
            r0 = 106(0x6a, float:1.49E-43)
            r2.startActivityForResult(r1, r0)
            return
        L_0x02d7:
            java.lang.Object r3 = r15.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = r15.A02
            r3.finish()
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x02e6:
            X.AnonymousClass8BT.A14(r3, r0, r2)
            return
        L_0x02ea:
            java.lang.Object r4 = r15.A01
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r4 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r4
            java.lang.String r3 = r15.A02
            int r2 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A00(r4, r3)
            r0 = 0
            r4.A02 = r0
            X.AM7 r5 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A03(r4)
            java.lang.Integer r6 = X.A5L.A00(r4)
            r0 = 0
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "from_keyboard"
            java.lang.Integer r7 = X.C108975cc.A0S(r0, r1, r8)
            r9 = 1
            r10 = 15
            r11 = r9
            r5.A08(r6, r7, r8, r9, r10, r11)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0H(r4, r3, r2)
            return
        L_0x0319:
            java.lang.Object r2 = r15.A01
            X.8wU r2 = (X.C174258wU) r2
            java.lang.String r1 = r15.A02
            java.util.List r0 = X.C42011xT.A0I
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1Di r0 = r2.A01
            r0.invoke(r1)
            return
        L_0x032b:
            java.lang.Object r1 = r15.A01
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r1 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r1
            java.lang.String r0 = r15.A02
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment.A01(r1, r0)
            return
        L_0x0335:
            java.lang.Object r3 = r15.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            java.lang.String r2 = r15.A02
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r1 = new com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment
            r1.<init>()
            X.10I r5 = r3.A05
            r0 = 21
            X.AkQ r4 = new X.AkQ
            r4.<init>(r3, r1, r2, r0)
            goto L_0x0364
        L_0x034a:
            java.lang.Object r2 = r15.A01
            X.1FP r2 = (X.AnonymousClass1FP) r2
            java.lang.String r1 = r15.A02
            X.10I r5 = r2.A05
            r0 = 23
            goto L_0x035f
        L_0x0355:
            java.lang.Object r2 = r15.A01
            X.1FP r2 = (X.AnonymousClass1FP) r2
            java.lang.String r1 = r15.A02
            X.10I r5 = r2.A05
            r0 = 22
        L_0x035f:
            X.AkJ r4 = new X.AkJ
            r4.<init>(r0, r1, r2)
        L_0x0364:
            r5.CGF(r4)
            return
        L_0x0368:
            java.lang.Object r3 = r15.A01
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment r3 = (com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment) r3
            java.lang.String r2 = r15.A02
            X.0z4 r0 = r3.A08
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "account_switching_logged_out_phone_number"
            X.C17880vN.A1E(r1, r0, r2)
            X.1FL r0 = r3.A1D()
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment.A00(r0, r3)
            r0.finishAffinity()
            return
        L_0x0384:
            java.lang.String r0 = "metaVerifiedInteractionLogger"
            goto L_0x0396
        L_0x0387:
            java.lang.String r0 = "playStoreIntentUtils"
            goto L_0x0396
        L_0x038a:
            java.lang.Object r0 = r15.A01
            com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment r0 = (com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment) r0
            java.lang.String r5 = r15.A02
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r4 = r0.A00
            if (r4 != 0) goto L_0x039b
            java.lang.String r0 = "viewModel"
        L_0x0396:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x039b:
            X.0vl r0 = r0.A01
            java.lang.String r3 = X.AnonymousClass3MW.A0y(r0)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1OX r2 = X.C41561wd.A00(r4)
            r1 = 0
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$submitAppeal$1 r0 = new com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$submitAppeal$1
            r0.<init>(r4, r3, r5, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFV.onClick(android.view.View):void");
    }

    public AFV(C139216yQ r2) {
        this.A00 = 24;
        this.A01 = r2;
        this.A02 = "status_fragment";
    }

    public AFV(BusinessProfileEducation businessProfileEducation) {
        this.A00 = 7;
        this.A01 = businessProfileEducation;
        this.A02 = "smb_cs_profile";
    }
}
