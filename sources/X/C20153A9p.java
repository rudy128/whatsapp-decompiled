package X;

import android.content.DialogInterface;

/* renamed from: X.A9p  reason: case insensitive filesystem */
public class C20153A9p implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20153A9p(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(C73203Rj r1, Object obj, Object obj2, int i, int i2) {
        r1.A0Z(new C20153A9p(obj, obj2, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02eb, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ef, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032d, code lost:
        X.AnonymousClass1D6.A03(r1, r0, r2, r5);
        X.AnonymousClass1D6.A03("dialog_tag", r6.A04, r2, r4);
        r3.A0w("message_dialog_action", X.AnonymousClass9O6.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0340, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r2.A00(r0);
        r1.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0296, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0299, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r18, int r19) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0318;
                case 1: goto L_0x0302;
                case 2: goto L_0x02f0;
                case 3: goto L_0x02c4;
                case 4: goto L_0x010f;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0103;
                case 8: goto L_0x00f7;
                case 9: goto L_0x0007;
                case 10: goto L_0x006a;
                case 11: goto L_0x02b1;
                case 12: goto L_0x029a;
                case 13: goto L_0x025c;
                case 14: goto L_0x023a;
                case 15: goto L_0x0222;
                case 16: goto L_0x0211;
                case 17: goto L_0x01e2;
                case 18: goto L_0x002b;
                case 19: goto L_0x01a1;
                case 20: goto L_0x019b;
                case 21: goto L_0x018f;
                case 22: goto L_0x0136;
                case 23: goto L_0x0018;
                case 24: goto L_0x012a;
                case 25: goto L_0x011e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r5.A01
            X.9sN r2 = (X.C194839sN) r2
            java.lang.Object r1 = r5.A02
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r0 = "on_press_positive"
        L_0x0011:
            r2.A00(r0)
            r1.dismiss()
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r2 = r5.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r5.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 124(0x7c, float:1.74E-43)
            X.AnonymousClass4Yv.A00(r2, r0)
            if (r1 == 0) goto L_0x0017
            r1.run()
            return
        L_0x002b:
            java.lang.Object r6 = r5.A01
            com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity r6 = (com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity) r6
            java.lang.Object r4 = r5.A02
            X.AW0 r4 = (X.AW0) r4
            r1 = 2131887916(0x7f12072c, float:1.9410453E38)
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.A3i(r1, r0)
            X.9gl r2 = r6.A00
            X.9YK r3 = new X.9YK
            r3.<init>(r6)
            X.11P r1 = r6.A05
            X.1ex r0 = r2.A04
            java.lang.String r7 = r0.A06()
            X.11S r0 = r2.A01
            java.lang.String r8 = X.AnonymousClass8BS.A0e(r0, r1)
            X.1BI r0 = r4.A0C
            X.1EC r5 = X.AnonymousClass3MW.A0i(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r4.A0K
            if (r0 == 0) goto L_0x0017
            X.10I r0 = r2.A05
            r9 = 1
            X.AjN r1 = new X.AjN
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.CGN(r1)
            return
        L_0x006a:
            java.lang.Object r4 = r5.A01
            X.8nW r4 = (X.AnonymousClass8nW) r4
            java.lang.Object r8 = r5.A02
            X.206 r8 = (X.AnonymousClass206) r8
            java.lang.String r0 = "scheduled-call/sendCancellationMessage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r2 = r4.A0F
            r1 = 4164(0x1044, float:5.835E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ae
            X.205 r3 = r8.A0v
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            X.A51 r7 = new X.A51
            r7.<init>(r0, r3)
            long r10 = r8.A0x
            X.1BI r2 = r3.A00
            X.C17960vV.A07(r2)
            X.1PP r1 = r4.A06
            boolean r0 = r3.A02
            X.205 r6 = r1.A01(r2, r0)
            X.11P r0 = r4.A0u
            long r8 = X.AnonymousClass11P.A01(r0)
            X.23q r5 = new X.23q
            r5.<init>(r6, r7, r8, r10)
            X.1iU r0 = r4.A05
            r0.A01(r5)
            return
        L_0x00ae:
            X.00H r0 = r4.A07
            java.lang.Object r1 = r0.get()
            X.1hD r1 = (X.C32451hD) r1
            X.11S r3 = r1.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r3)
            if (r0 == 0) goto L_0x0017
            X.1PP r2 = r1.A01
            X.205 r7 = r8.A0v
            X.1BI r1 = r7.A00
            boolean r0 = r7.A02
            X.205 r6 = r2.A01(r1, r0)
            com.whatsapp.jid.PhoneUserJid r5 = X.AnonymousClass11S.A00(r3)
            r3 = 1
            long r0 = r8.A0I
            X.23o r2 = new X.23o
            r2.<init>(r6, r0)
            boolean r1 = r6.A02
            r0 = 8
            if (r1 == 0) goto L_0x00dd
            r0 = 7
        L_0x00dd:
            r2.A01 = r0
            r2.A0d(r5)
            r2.A00 = r3
            java.lang.String r0 = r7.A01
            r2.A02 = r0
            if (r1 != 0) goto L_0x00ee
            X.1BI r5 = r8.A0H()
        L_0x00ee:
            r2.A01 = r5
            X.1hG r1 = r4.A02
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x00f7:
            java.lang.Object r2 = r5.A01
            X.9sN r2 = (X.C194839sN) r2
            java.lang.Object r1 = r5.A02
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r0 = "on_press_neutral"
            goto L_0x0011
        L_0x0103:
            java.lang.Object r2 = r5.A01
            X.9sN r2 = (X.C194839sN) r2
            java.lang.Object r1 = r5.A02
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r0 = "on_press_negative"
            goto L_0x0011
        L_0x010f:
            java.lang.Object r0 = r5.A02
            X.B7S r0 = (X.B7S) r0
            if (r18 == 0) goto L_0x0118
            r18.dismiss()
        L_0x0118:
            if (r0 == 0) goto L_0x0017
            r0.BrW()
            return
        L_0x011e:
            java.lang.Object r1 = r5.A01
            X.9Bh r1 = (X.C177969Bh) r1
            java.lang.Object r0 = r5.A02
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A0K(r0)
            return
        L_0x012a:
            java.lang.Object r1 = r5.A01
            X.9Bh r1 = (X.C177969Bh) r1
            java.lang.Object r0 = r5.A02
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A0J(r0)
            return
        L_0x0136:
            java.lang.Object r2 = r5.A01
            com.whatsapp.phonematching.ConnectionUnavailableDialogFragment r2 = (com.whatsapp.phonematching.ConnectionUnavailableDialogFragment) r2
            java.lang.Object r4 = r5.A02
            X.1FU r4 = (X.AnonymousClass1FU) r4
            r0 = 0
            r2.A28()
            X.10I r1 = r2.A07
            X.1LU r11 = r2.A05
            if (r11 == 0) goto L_0x018b
            X.6mP r5 = r2.A00
            if (r5 == 0) goto L_0x0187
            X.11C r7 = r2.A02
            if (r7 == 0) goto L_0x0183
            X.1MB r10 = r2.A04
            if (r10 == 0) goto L_0x017f
            X.17x r8 = r2.A03
            if (r8 == 0) goto L_0x017b
            X.A98 r12 = r2.A06
            if (r12 == 0) goto L_0x0177
            X.11E r6 = r2.A01
            if (r6 == 0) goto L_0x0173
            r3 = 0
            r14 = 1
            java.lang.String r13 = ""
            X.9BP r2 = new X.9BP
            r9 = r3
            r15 = r14
            r16 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.CGD(r2, r0)
            return
        L_0x0173:
            java.lang.String r0 = "connectivityStateProvider"
            goto L_0x02eb
        L_0x0177:
            java.lang.String r0 = "registrationHttpManager"
            goto L_0x02eb
        L_0x017b:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x02eb
        L_0x017f:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x02eb
        L_0x0183:
            java.lang.String r0 = "systemServices"
            goto L_0x02eb
        L_0x0187:
            java.lang.String r0 = "sendFeedback"
            goto L_0x02eb
        L_0x018b:
            java.lang.String r0 = "waIntents"
            goto L_0x02eb
        L_0x018f:
            java.lang.Object r1 = r5.A01
            X.AZk r1 = (X.C20807AZk) r1
            java.lang.Object r0 = r5.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0
            r1.C0G(r0)
            return
        L_0x019b:
            java.lang.Object r0 = r5.A02
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0296
        L_0x01a1:
            java.lang.Object r0 = r5.A01
            com.whatsapp.payments.ui.BusinessHubActivity r0 = (com.whatsapp.payments.ui.BusinessHubActivity) r0
            java.lang.Object r3 = r5.A02
            X.8pD r3 = (X.AnonymousClass8pD) r3
            X.0vl r0 = r0.A0E
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r4 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r4
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x01c9
            X.10I r2 = r4.A04
            r0 = 5
            X.Ak0 r1 = new X.Ak0
            r1.<init>(r3, r4, r0)
        L_0x01c5:
            r2.CGF(r1)
            return
        L_0x01c9:
            X.0vl r0 = r4.A08
            X.1DS r3 = X.C108945cZ.A0Q(r0)
            r2 = 0
            r1 = 2
            X.9xu r0 = new X.9xu
            r0.<init>(r2, r2, r1)
            r3.A0F(r0)
            X.10I r2 = r4.A04
            r0 = 4
            X.AkF r1 = new X.AkF
            r1.<init>(r4, r0)
            goto L_0x01c5
        L_0x01e2:
            java.lang.Object r1 = r5.A01
            X.AYY r1 = (X.AYY) r1
            java.lang.Object r0 = r5.A02
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            X.AZZ r0 = r1.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r1 = r0.A05
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentDPOActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentDPOActivity.class
            X.AnonymousClass8BT.A16(r1, r0)
            X.BD4 r3 = r1.A0L
            r0 = 120(0x78, float:1.68E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r6 = 0
            X.A7u r2 = X.C20112A7u.A02()
            java.lang.String r1 = "product_flow"
            java.lang.String r0 = "p2m"
            r2.A07(r1, r0)
            r7 = 1
            java.lang.String r5 = "payment_disabled_alert"
            X.C20087A6p.A02(r2, r3, r4, r5, r6, r7)
            return
        L_0x0211:
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r5.A02
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentSettingsActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentSettingsActivity.class
            X.AnonymousClass8BT.A16(r1, r0)
            return
        L_0x0222:
            java.lang.Object r3 = r5.A01
            X.9uQ r3 = (X.C196079uQ) r3
            java.lang.Object r2 = r5.A02
            android.content.Context r2 = (android.content.Context) r2
            X.1vD r0 = r3.A02
            android.net.Uri r0 = r0.A03()
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r0 = r3.A01
            r0.A08(r2, r1)
            return
        L_0x023a:
            java.lang.Object r0 = r5.A01
            X.AXg r0 = (X.C20751AXg) r0
            java.lang.Object r3 = r5.A02
            android.content.Context r3 = (android.content.Context) r3
            X.1QO r0 = r0.A01
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0259
            java.lang.String r2 = "https://faq.whatsapp.com/payments/26000350"
        L_0x024c:
            X.C17960vV.A07(r2)
            r1 = 0
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1g(r3, r2, r1, r0, r0)
            r3.startActivity(r0)
            return
        L_0x0259:
            java.lang.String r2 = "https://faq.whatsapp.com/payments/26000351"
            goto L_0x024c
        L_0x025c:
            java.lang.Object r0 = r5.A01
            X.9kQ r0 = (X.C190129kQ) r0
            java.lang.Object r3 = r5.A02
            android.content.Context r3 = (android.content.Context) r3
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            X.1vD r1 = r0.A00
            X.00H r0 = r0.A01
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1o3 r0 = (X.C36531o3) r0
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r0 = r1.A03()
            X.C18070vi.A0X(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r2.queryIntentActivities(r1, r0)
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x0292
            r3.startActivity(r1)
        L_0x0292:
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r3)
        L_0x0296:
            r0.finish()
            return
        L_0x029a:
            java.lang.Object r2 = r5.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r5.A02
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            java.lang.String r0 = "disable wifi radio"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x02ad
            r0 = 0
            r1.setWifiEnabled(r0)
        L_0x02ad:
            r2.finish()
            return
        L_0x02b1:
            java.lang.Object r4 = r5.A01
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r4 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r4
            java.lang.Object r3 = r5.A02
            X.10I r2 = r4.A07
            r1 = 44
            X.4rl r0 = new X.4rl
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x02c4:
            java.lang.Object r3 = r5.A01
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r3 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r3
            java.lang.Object r2 = r5.A02
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x02e9
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r2)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.A0I(r3, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A00(r3, r0)
            return
        L_0x02e9:
            java.lang.String r0 = "blockListManager"
        L_0x02eb:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02f0:
            java.lang.Object r2 = r5.A01
            X.1cN r2 = (X.C29491cN) r2
            java.lang.Object r1 = r5.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            X.C29491cN.A02(r1, r0, r2)
            return
        L_0x0302:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.Object r6 = r5.A02
            X.AEg r6 = (X.C20273AEg) r6
            r5 = 0
            r4 = 1
            X.1GP r3 = r0.A1F()
            r0 = 2
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "negative_button_clicked"
            goto L_0x032d
        L_0x0318:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.Object r6 = r5.A02
            X.AEg r6 = (X.C20273AEg) r6
            r5 = 0
            r4 = 1
            X.1GP r3 = r0.A1F()
            r0 = 2
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "positive_button_clicked"
        L_0x032d:
            X.AnonymousClass1D6.A03(r1, r0, r2, r5)
            java.lang.String r1 = "dialog_tag"
            java.lang.String r0 = r6.A04
            X.AnonymousClass1D6.A03(r1, r0, r2, r4)
            android.os.Bundle r1 = X.AnonymousClass9O6.A00(r2)
            java.lang.String r0 = "message_dialog_action"
            r3.A0w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20153A9p.onClick(android.content.DialogInterface, int):void");
    }
}
