package X;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog$Builder;

/* renamed from: X.4bB  reason: invalid class name */
public class AnonymousClass4bB implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass4bB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AlertDialog$Builder alertDialog$Builder, Object obj, int i, int i2) {
        alertDialog$Builder.setPositiveButton(i2, new AnonymousClass4bB(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x031f, code lost:
        X.AnonymousClass3MX.A1Q(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0322, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x036d, code lost:
        com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0370, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0454, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0457, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0463, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0467, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04a3, code lost:
        r15.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r15, int r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0498;
                case 1: goto L_0x0490;
                case 2: goto L_0x0458;
                case 3: goto L_0x0458;
                case 4: goto L_0x0458;
                case 5: goto L_0x044f;
                case 6: goto L_0x03aa;
                case 7: goto L_0x03a3;
                case 8: goto L_0x0005;
                case 9: goto L_0x039a;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0394;
                case 13: goto L_0x0371;
                case 14: goto L_0x00fe;
                case 15: goto L_0x0368;
                case 16: goto L_0x0362;
                case 17: goto L_0x01ae;
                case 18: goto L_0x00f1;
                case 19: goto L_0x0323;
                case 20: goto L_0x0306;
                case 21: goto L_0x00df;
                case 22: goto L_0x00cd;
                case 23: goto L_0x02e5;
                case 24: goto L_0x02dd;
                case 25: goto L_0x02cf;
                case 26: goto L_0x02b4;
                case 27: goto L_0x02ac;
                case 28: goto L_0x00a9;
                case 29: goto L_0x0093;
                case 30: goto L_0x02a4;
                case 31: goto L_0x006f;
                case 32: goto L_0x0268;
                case 33: goto L_0x0260;
                case 34: goto L_0x0212;
                case 35: goto L_0x020a;
                case 36: goto L_0x01ee;
                case 37: goto L_0x020a;
                case 38: goto L_0x01ee;
                case 39: goto L_0x01d2;
                case 40: goto L_0x01b6;
                case 41: goto L_0x01ae;
                case 42: goto L_0x0198;
                case 43: goto L_0x02dd;
                case 44: goto L_0x017c;
                case 45: goto L_0x0156;
                case 46: goto L_0x0115;
                case 47: goto L_0x002d;
                case 48: goto L_0x010e;
                case 49: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.8GM r0 = (X.AnonymousClass8GM) r0
            X.1wy r1 = r0.A01
            r0 = 0
            X.AnonymousClass3MX.A1K(r1, r0)
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r4 = r14.A01
            com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity r4 = (com.whatsapp.registration.email.ConfirmEmailSetupRegUpsellActivity) r4
            X.00H r0 = r4.A04
            if (r0 == 0) goto L_0x045e
            java.lang.Object r3 = r0.get()
            X.9uY r3 = (X.C196159uY) r3
            r2 = 1
            X.4ms r1 = new X.4ms
            r1.<init>(r4, r2)
            java.lang.String r0 = ""
            r3.A03(r1, r0, r2)
            if (r15 == 0) goto L_0x000f
            goto L_0x04a3
        L_0x002d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r0 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment) r0
            X.9Ys r0 = r0.A00
            if (r0 == 0) goto L_0x000f
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r3 = r0.A00
            boolean r0 = X.AnonymousClass3MW.A1Y(r3)
            r4 = 1
            if (r0 != 0) goto L_0x0468
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/checksystemstatus/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            r6[r0] = r1
            r5 = 0
            com.whatsapp.LegacyMessageDialogFragment r4 = new com.whatsapp.LegacyMessageDialogFragment
            r4.<init>()
            r1 = 2131894981(0x7f1222c5, float:1.9424782E38)
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "message_res"
            r2.putInt(r0, r1)
            java.lang.String r1 = "message_params_values"
            java.lang.String r0 = "message_params_types"
            X.AnonymousClass4FX.A00(r2, r1, r0, r6)
            r4.A1R(r2)
            X.AnonymousClass3MY.A1H(r4, r3, r5)
            return
        L_0x006f:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment r0 = (com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment) r0
            X.1FL r2 = r0.A1B()
            if (r2 == 0) goto L_0x000f
            X.6mP r1 = r0.A00
            X.1MB r0 = r0.A01
            boolean r11 = r0.A00()
            r4 = 0
            java.lang.String r7 = "payments-blocked"
            X.6np r3 = r1.A00
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r5 = r4
            android.content.Intent r0 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.startActivity(r0)
            return
        L_0x0093:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            boolean r0 = r1 instanceof X.AnonymousClass5Y8
            if (r0 == 0) goto L_0x000f
            X.5Y8 r1 = (X.AnonymousClass5Y8) r1
            if (r1 == 0) goto L_0x000f
            X.43w r1 = (X.C822343w) r1
            X.C822343w.A0V(r1)
            return
        L_0x00a9:
            java.lang.Object r0 = r14.A01
            com.whatsapp.mute.ui.MuteDialogFragment r0 = (com.whatsapp.mute.ui.MuteDialogFragment) r0
            X.0vl r0 = r0.A05
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r2 = (com.whatsapp.mute.ui.MuteDialogViewModel) r2
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = X.C29431cG.A0c(r0)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            if (r1 == 0) goto L_0x000f
            X.1NN r0 = r2.A08
            if (r0 == 0) goto L_0x000f
            r0.A02(r1)
            return
        L_0x00cd:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            boolean r0 = r1 instanceof X.C108085b6
            if (r0 == 0) goto L_0x000f
            X.5b6 r1 = (X.C108085b6) r1
            r1.BEW()
            return
        L_0x00df:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1B()
            boolean r0 = r1 instanceof X.C108085b6
            if (r0 == 0) goto L_0x000f
            X.5b6 r1 = (X.C108085b6) r1
            r1.BFp()
            return
        L_0x00f1:
            java.lang.Object r0 = r14.A01
            X.5a3 r0 = (X.AnonymousClass5a3) r0
            r15.dismiss()
            if (r0 == 0) goto L_0x000f
            r0.BzT()
            return
        L_0x00fe:
            java.lang.Object r1 = r14.A01
            com.whatsapp.group.ReportGroupPrivacyTipDialogFragment r1 = (com.whatsapp.group.ReportGroupPrivacyTipDialogFragment) r1
            r0 = -1
            r2 = r16
            if (r2 != r0) goto L_0x000f
            r0 = 3
            r1.A00 = r0
            r1.A28()
            return
        L_0x010e:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            goto L_0x0454
        L_0x0115:
            r3 = 0
            X.4h1 r1 = new X.4h1
            r1.<init>(r14, r3)
            java.lang.Object r4 = r14.A01
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment r4 = (com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment) r4
            X.4Jq r0 = r4.A03
            java.lang.ref.WeakReference r2 = X.AnonymousClass3MW.A0z(r1)
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.00S r0 = r0.A6N
            java.lang.Object r0 = r0.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            X.4pi r1 = new X.4pi
            r1.<init>(r0, r2)
            X.2lz r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A08
            java.lang.String r0 = r0.A02
            r1.A00(r3, r0)
            android.content.Context r3 = r4.A14()
            android.content.Context r0 = r4.A14()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0156:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r4 = r0.A14()
            android.content.Context r1 = r0.A14()
            X.2lz r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A08
            java.lang.String r3 = r0.A02
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "server_token"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x017c:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.SelectPhoneNumberDialog r2 = (com.whatsapp.registration.SelectPhoneNumberDialog) r2
            java.lang.String r0 = "SelectPhoneNumberDialog/no-phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5YK r0 = r2.A01
            if (r0 == 0) goto L_0x0194
            X.99S r0 = (X.AnonymousClass99S) r0
            X.1L4 r1 = r0.A09
            X.9gv r0 = r0.A0L
            android.widget.EditText r0 = r0.A03
            r1.A02(r0)
        L_0x0194:
            r2.A28()
            return
        L_0x0198:
            java.lang.Object r2 = r14.A01
            com.whatsapp.qrcode.contactqr.WebCodeDialogFragment r2 = (com.whatsapp.qrcode.contactqr.WebCodeDialogFragment) r2
            android.content.Context r1 = r2.A14()
            X.00H r0 = r2.A01
            r0.get()
            r0 = 2
            android.content.Intent r0 = X.C87404Vl.A01(r1, r0)
            r2.A1k(r0)
            return
        L_0x01ae:
            java.lang.Object r0 = r14.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x01b6:
            java.lang.Object r2 = r14.A01
            com.whatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r2
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            X.1vD r0 = r2.A03
            android.net.Uri r0 = r0.A03()
            android.content.Intent r0 = r1.setData(r0)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x01d2:
            java.lang.Object r1 = r14.A01
            com.whatsapp.profile.SetAboutInfo r1 = (com.whatsapp.profile.SetAboutInfo) r1
            r0 = 3
            X.AnonymousClass4Yv.A00(r1, r0)
            java.util.ArrayList r0 = com.whatsapp.profile.SetAboutInfo.A0A
            r0.clear()
            com.whatsapp.profile.SetAboutInfo.A03(r1)
            X.3Od r0 = r1.A03
            r0.notifyDataSetChanged()
            X.4YE r1 = r1.A04
            r0 = 5
            r1.A01(r0)
            return
        L_0x01ee:
            java.lang.Object r4 = r14.A01
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.1FL r3 = r4.A1B()
            if (r3 == 0) goto L_0x0206
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "is_reset"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = -1
            r3.setResult(r0, r2)
        L_0x0206:
            r4.A29()
            return
        L_0x020a:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0212:
            java.lang.Object r4 = r14.A01
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment r4 = (com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment) r4
            r0 = 1
            r4.A06 = r0
            X.206 r0 = r4.A02
            java.lang.String r3 = "selectedMessage"
            r2 = 0
            if (r0 == 0) goto L_0x025c
            X.36c r0 = X.C60492o7.A00(r0)
            if (r0 == 0) goto L_0x022c
            X.205 r0 = r0.A02
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x0234
        L_0x022c:
            X.206 r0 = r4.A02
            if (r0 == 0) goto L_0x025c
            X.205 r0 = r0.A0v
            java.lang.String r1 = r0.A01
        L_0x0234:
            X.C18070vi.A0b(r1)
            X.206 r0 = r4.A02
            if (r0 == 0) goto L_0x025c
            com.whatsapp.jid.UserJid r0 = r0.A0I()
            if (r0 != 0) goto L_0x0251
            X.1Qo r1 = r4.A01
            if (r1 == 0) goto L_0x024b
            X.3xJ r0 = X.C80523xJ.A03
            r1.A00(r0, r2)
            return
        L_0x024b:
            java.lang.String r0 = "crashLogsWrapper"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0251:
            X.1OY r3 = X.AnonymousClass1OW.A01()
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1 r0 = new com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1
            r0.<init>(r4, r1, r2)
            goto L_0x031f
        L_0x025c:
            X.C18070vi.A11(r3)
            throw r2
        L_0x0260:
            java.lang.Object r0 = r14.A01
            com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment r0 = (com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment) r0
            com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment.A00(r0)
            return
        L_0x0268:
            java.lang.Object r5 = r14.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            r4 = 1
            r5.A04 = r4
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L_0x02a0
            r0 = 2131891864(0x7f121698, float:1.941846E38)
            r1.setText(r0)
            X.AZ6 r3 = r5.A4b()
            java.lang.Integer r2 = X.C17880vN.A0l()
            android.content.Intent r1 = r5.getIntent()
            if (r1 == 0) goto L_0x029a
            java.lang.String r0 = "extra_referral_screen"
            java.lang.String r1 = r1.getStringExtra(r0)
        L_0x028d:
            java.lang.String r0 = "alias_switch_confirm_dialog"
            r3.BiL(r2, r0, r1, r4)
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel r0 = r5.A03
            if (r0 == 0) goto L_0x029c
            r0.A0T(r4)
            return
        L_0x029a:
            r1 = 0
            goto L_0x028d
        L_0x029c:
            java.lang.String r0 = "indiaUpiMapperLinkViewModel"
            goto L_0x0463
        L_0x02a0:
            java.lang.String r0 = "titleTextView"
            goto L_0x0463
        L_0x02a4:
            java.lang.Object r0 = r14.A01
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment r0 = (com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment) r0
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.A01(r0)
            return
        L_0x02ac:
            java.lang.Object r0 = r14.A01
            com.whatsapp.mute.ui.MuteDialogFragment r0 = (com.whatsapp.mute.ui.MuteDialogFragment) r0
            com.whatsapp.mute.ui.MuteDialogFragment.A00(r0)
            return
        L_0x02b4:
            java.lang.Object r3 = r14.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            X.10I r2 = r3.A05
            r1 = 46
            X.3Bs r0 = new X.3Bs
            r0.<init>(r3, r1)
            r2.CGF(r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r3)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x02cf:
            java.lang.Object r2 = r14.A01
            X.4oN r2 = (X.C96764oN) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r1 = r2.A02
            X.1x1 r0 = r2.A00
            r1.invoke(r0)
            return
        L_0x02dd:
            java.lang.Object r0 = r14.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x02e5:
            java.lang.Object r5 = r14.A01
            com.whatsapp.lists.ListsConversationManagementActivity r5 = (com.whatsapp.lists.ListsConversationManagementActivity) r5
            X.0vl r0 = r5.A02
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.lists.ListsConversationsManagementViewModel r4 = (com.whatsapp.lists.ListsConversationsManagementViewModel) r4
            X.1x1 r3 = r5.A00
            if (r3 == 0) goto L_0x0302
            X.1OX r2 = X.C41561wd.A00(r4)
            r1 = 0
            com.whatsapp.lists.ListsConversationsManagementViewModel$deleteLabels$1 r0 = new com.whatsapp.lists.ListsConversationsManagementViewModel$deleteLabels$1
            r0.<init>(r3, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
        L_0x0302:
            r5.finish()
            return
        L_0x0306:
            java.lang.Object r0 = r14.A01
            com.whatsapp.interopui.optout.InteropOptOutDialogFragment r0 = (com.whatsapp.interopui.optout.InteropOptOutDialogFragment) r0
            r15.dismiss()
            X.0vl r0 = r0.A00
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.interopui.setting.InteropSettingsViewModel r2 = (com.whatsapp.interopui.setting.InteropSettingsViewModel) r2
            X.1OX r3 = X.C41561wd.A00(r2)
            r1 = 0
            com.whatsapp.interopui.setting.InteropSettingsViewModel$onTurnOffClicked$1 r0 = new com.whatsapp.interopui.setting.InteropSettingsViewModel$onTurnOffClicked$1
            r0.<init>(r2, r1)
        L_0x031f:
            X.AnonymousClass3MX.A1Q(r0, r3)
            return
        L_0x0323:
            java.lang.Object r1 = r14.A01
            X.4Lr r1 = (X.C84994Lr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity r3 = r1.A00
            X.0vl r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r0 = (com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel) r0
            X.00H r0 = r0.A05
            X.1jg r2 = X.AnonymousClass3MX.A0k(r0)
            android.content.SharedPreferences r0 = X.C33971jg.A00(r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "unified_inbox_option"
            X.C17880vN.A1B(r1, r0)
            java.util.List r0 = r2.A01
            r0.clear()
            X.1LU r0 = r3.A00
            if (r0 == 0) goto L_0x0461
            android.content.Intent r1 = X.AnonymousClass1LU.A09(r3)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r1.addFlags(r0)
            X.C18070vi.A0X(r0)
            r3.startActivity(r0)
            return
        L_0x0362:
            java.lang.Object r1 = r14.A01
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment r1 = (com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment) r1
            r0 = 0
            goto L_0x036d
        L_0x0368:
            java.lang.Object r1 = r14.A01
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment r1 = (com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment) r1
            r0 = 1
        L_0x036d:
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment.A00(r1, r0)
            return
        L_0x0371:
            java.lang.Object r3 = r14.A01
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "GroupChatInfoActivity/onclick_setDescription"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r2 = r3.A1B()
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            android.os.Bundle r1 = r3.A15()
            java.lang.String r0 = "description"
            java.lang.String r0 = r1.getString(r0)
            X.C17960vV.A07(r0)
            com.whatsapp.group.GroupChatInfoActivity.A1J(r2, r0)
            r3.A28()
            return
        L_0x0394:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x039a:
            java.lang.Object r1 = r14.A01
            X.8GM r1 = (X.AnonymousClass8GM) r1
            r0 = 0
            r1.A0U(r0)
            return
        L_0x03a3:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            goto L_0x0454
        L_0x03aa:
            java.lang.Object r10 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r10 = (com.whatsapp.group.GroupChatInfoActivity) r10
            r0 = 6
            X.AnonymousClass4Yv.A00(r10, r0)
            X.1E7 r0 = r10.A0v
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r0)
            X.3VF r0 = r10.A18
            boolean r0 = r0.A0U(r4)
            if (r0 == 0) goto L_0x03cb
            X.126 r1 = r10.A1A
            X.1EC r0 = r10.A1K
            r1.A0a(r0, r4)
        L_0x03c7:
            com.whatsapp.group.GroupChatInfoActivity.A1A(r10)
            return
        L_0x03cb:
            X.1MZ r1 = r10.A0J
            X.1EC r0 = r10.A1K
            X.2sr r0 = r1.A05(r0, r4)
            if (r0 == 0) goto L_0x03f4
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x03f4
            r0 = 2131890012(0x7f120f5c, float:1.9414704E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            X.1Me r1 = r10.A0d
            X.1M9 r0 = r10.A0E
            java.lang.String r1 = X.AnonymousClass3MY.A0p(r0, r1, r4)
            r0 = 0
            r2[r0] = r1
            r0 = 0
            r10.A40(r0, r3, r0, r2)
            return
        L_0x03f4:
            boolean r0 = X.AnonymousClass3MW.A1Y(r10)
            if (r0 != 0) goto L_0x0408
            X.1KB r1 = r10.A05
            android.content.Context r0 = r10.getApplicationContext()
            int r0 = X.C72473Md.A03(r0)
            r1.A05(r0)
            goto L_0x03c7
        L_0x0408:
            r1 = 2131893532(0x7f121d1c, float:1.9421843E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r10.CNB(r1, r0)
            X.126 r11 = r10.A1A
            X.1NN r9 = r10.A0I
            X.1EC r12 = r10.A1K
            java.util.List r13 = java.util.Collections.singletonList(r4)
            r7 = 30
            X.40g r8 = new X.40g
            r8.<init>(r9, r10, r11, r12, r13)
            X.12M r2 = r10.A1C
            X.1EC r3 = r8.A03
            java.util.List r6 = r8.A05
            X.C17960vV.A07(r6)
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0448
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupIqResponseUtil/remove-participants/timeout; groupId="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; participants="
            X.C17900vP.A0X(r6, r0, r1)
            r4 = 0
        L_0x0441:
            r8 = 0
            java.lang.String r5 = "remove"
            X.AnonymousClass12M.A04(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0448:
            r0 = 2
            X.4pf r4 = new X.4pf
            r4.<init>(r8, r2, r0)
            goto L_0x0441
        L_0x044f:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
        L_0x0454:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0458:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x045e:
            java.lang.String r0 = "emailVerificationXmppMethods"
            goto L_0x0463
        L_0x0461:
            java.lang.String r0 = "waIntents"
        L_0x0463:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0468:
            r0 = 2131891826(0x7f121672, float:1.9418383E38)
            r3.CNA(r0)
            X.4h1 r1 = new X.4h1
            r1.<init>(r3, r4)
            X.4Jq r0 = r3.A00
            java.lang.ref.WeakReference r2 = X.AnonymousClass3MW.A0z(r1)
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.00S r0 = r0.A6N
            java.lang.Object r0 = r0.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            X.4pi r1 = new X.4pi
            r1.<init>(r0, r2)
            java.lang.String r0 = r3.A0A
            r1.A00(r4, r0)
            return
        L_0x0490:
            java.lang.Object r0 = r14.A01
            com.whatsapp.events.EventInfoBottomSheet r0 = (com.whatsapp.events.EventInfoBottomSheet) r0
            com.whatsapp.events.EventInfoBottomSheet.A01(r0)
            goto L_0x04a3
        L_0x0498:
            java.lang.Object r1 = r14.A01
            X.5ZY r1 = (X.AnonymousClass5ZY) r1
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            r1.BEw()
        L_0x04a3:
            r15.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4bB.onClick(android.content.DialogInterface, int):void");
    }
}
