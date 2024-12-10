package X;

import android.widget.CompoundButton;

/* renamed from: X.4em  reason: invalid class name and case insensitive filesystem */
public class C90874em implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C90874em(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new C90874em(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: X.3Zu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: X.47Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v112, resolved type: X.3Zu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: X.3Zu} */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0226, code lost:
        X.C17880vN.A1F(r1, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0229, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0230, code lost:
        r1.A05(!r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0235, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0244, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0248, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x028b, code lost:
        r2.A2C(r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x028f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x029b, code lost:
        r5.CGF(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x029e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r1 = r3.A1E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        r4 = new X.C98844ro((java.lang.Object) r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d9, code lost:
        r0 = "waWorkers";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x005a;
                case 2: goto L_0x029f;
                case 3: goto L_0x0274;
                case 4: goto L_0x0236;
                case 5: goto L_0x022a;
                case 6: goto L_0x021a;
                case 7: goto L_0x0046;
                case 8: goto L_0x0208;
                case 9: goto L_0x01f9;
                case 10: goto L_0x01ab;
                case 11: goto L_0x0183;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0174;
                case 18: goto L_0x0166;
                case 19: goto L_0x0121;
                case 20: goto L_0x0119;
                case 21: goto L_0x010b;
                case 22: goto L_0x00fc;
                case 23: goto L_0x00ee;
                case 24: goto L_0x00e4;
                case 25: goto L_0x00dd;
                case 26: goto L_0x008f;
                case 27: goto L_0x0066;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r7.A01
            com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet r2 = (com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet) r2
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A07
            if (r1 == 0) goto L_0x0043
            android.widget.CheckBox r0 = r2.A02
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x003f
        L_0x0017:
            android.widget.CheckBox r0 = r2.A01
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x003f
        L_0x0021:
            android.widget.CheckBox r0 = r2.A04
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x003f
        L_0x002b:
            android.widget.CheckBox r0 = r2.A00
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x003f
        L_0x0035:
            android.widget.CheckBox r0 = r2.A03
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0044
        L_0x003f:
            r0 = 1
        L_0x0040:
            r1.setEnabled(r0)
        L_0x0043:
            return
        L_0x0044:
            r0 = 0
            goto L_0x0040
        L_0x0046:
            java.lang.Object r0 = r7.A01
            X.3Z8 r0 = (X.AnonymousClass3Z8) r0
            X.4NK r1 = r0.A00
            boolean r0 = r1.A00
            if (r0 == r9) goto L_0x0043
            r1.A00 = r9
            if (r9 == 0) goto L_0x0043
            X.1DT r0 = r1.A01
            r0.A0E(r1)
            return
        L_0x005a:
            if (r9 == 0) goto L_0x0043
            java.lang.Object r0 = r7.A01
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r0 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r0
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A00(r8, r0)
            return
        L_0x0066:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r3 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r3
            if (r9 == 0) goto L_0x0079
            X.1BI r0 = r3.A05
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass4Z1.A00(r0)
            goto L_0x00b7
        L_0x0079:
            X.0vl r0 = r3.A0H
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r2 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r2
            java.lang.String r1 = "jid_call_mute"
            java.lang.String r0 = ""
            r2.A0T(r1, r0)
            X.10I r5 = r3.A09
            if (r5 == 0) goto L_0x00d9
            r0 = 38
            goto L_0x00d2
        L_0x008f:
            java.lang.Object r3 = r7.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r3 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "message_mute_clicked"
            r0 = 1
            r2.putExtra(r1, r0)
            X.1FL r1 = r3.A1B()
            if (r1 == 0) goto L_0x00a7
            r0 = -1
            r1.setResult(r0, r2)
        L_0x00a7:
            if (r9 == 0) goto L_0x00bd
            X.1BI r1 = r3.A05
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.1i2 r0 = X.C32961i2.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass4Z1.A01(r1, r0)
        L_0x00b7:
            X.1GP r1 = r3.A1E()
            goto L_0x028b
        L_0x00bd:
            X.0vl r0 = r3.A0H
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r2 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r2
            java.lang.String r1 = "jid_message_mute"
            java.lang.String r0 = ""
            r2.A0T(r1, r0)
            X.10I r5 = r3.A09
            if (r5 == 0) goto L_0x00d9
            r0 = 39
        L_0x00d2:
            X.4ro r4 = new X.4ro
            r4.<init>((java.lang.Object) r3, (int) r0)
            goto L_0x029b
        L_0x00d9:
            java.lang.String r0 = "waWorkers"
            goto L_0x0244
        L_0x00dd:
            java.lang.Object r0 = r7.A01
            X.47Y r0 = (X.AnonymousClass47Y) r0
            r0.A00 = r9
            goto L_0x00ea
        L_0x00e4:
            java.lang.Object r0 = r7.A01
            X.3Zu r0 = (X.C74393Zu) r0
            r0.A06 = r9
        L_0x00ea:
            r0.A04()
            return
        L_0x00ee:
            java.lang.Object r1 = r7.A01
            X.477 r1 = (X.AnonymousClass477) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A00 = r9
            r1.A04()
            return
        L_0x00fc:
            java.lang.Object r1 = r7.A01
            X.1FP r1 = (X.AnonymousClass1FP) r1
            X.10I r5 = r1.A05
            r0 = 35
            X.3Cp r4 = new X.3Cp
            r4.<init>((int) r0, (java.lang.Object) r1, (boolean) r9)
            goto L_0x029b
        L_0x010b:
            java.lang.Object r0 = r7.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.0z4 r0 = r0.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "security_notifications"
            goto L_0x0226
        L_0x0119:
            java.lang.Object r0 = r7.A01
            com.whatsapp.settings.SettingsChat r0 = (com.whatsapp.settings.SettingsChat) r0
            X.1Q0 r1 = r0.A07
            goto L_0x0230
        L_0x0121:
            java.lang.Object r2 = r7.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r2 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r2
            if (r9 == 0) goto L_0x0147
            X.0ve r0 = r2.A0E
            boolean r0 = X.AnonymousClass3MX.A1W(r0)
            if (r0 != 0) goto L_0x015f
            X.00H r0 = r2.A09
            if (r0 == 0) goto L_0x0143
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 != 0) goto L_0x015f
            r1 = 2131894321(0x7f122031, float:1.9423443E38)
            r0 = 2131894320(0x7f122030, float:1.9423441E38)
            X.C72453Mb.A15(r2, r1, r0)
            return
        L_0x0143:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x0244
        L_0x0147:
            r0 = 0
            r2.A00 = r0
            android.view.View r1 = r2.A01
            if (r1 != 0) goto L_0x0152
            java.lang.String r0 = "changeNumberRadioButtonsContainer"
            goto L_0x0244
        L_0x0152:
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r2.A0A
            if (r0 == 0) goto L_0x0162
            r0.clear()
            goto L_0x0162
        L_0x015f:
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.A0Q(r2)
        L_0x0162:
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.A0V(r2)
            return
        L_0x0166:
            java.lang.Object r0 = r7.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            if (r9 == 0) goto L_0x0170
            com.whatsapp.newsletter.NewsletterInfoActivity.A17(r0)
            return
        L_0x0170:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1C(r0)
            return
        L_0x0174:
            java.lang.Object r0 = r7.A01
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r0 = (com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment) r0
            com.whatsapp.messagetranslation.onboarding.TranslationViewModel r0 = r0.A01
            if (r0 != 0) goto L_0x0180
            java.lang.String r0 = "viewModel"
            goto L_0x0244
        L_0x0180:
            r0.A03 = r9
            return
        L_0x0183:
            java.lang.Object r2 = r7.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.3zh r1 = r2.A10
            if (r1 == 0) goto L_0x0191
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A07 = r0
        L_0x0191:
            if (r9 == 0) goto L_0x01a0
            X.1EC r1 = r2.A1K
            X.1i2 r0 = X.C32961i2.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r1 = X.AnonymousClass4Z1.A01(r1, r0)
            r0 = 0
            r2.CMk(r1, r0)
            return
        L_0x01a0:
            X.10I r5 = r2.A05
            r0 = 20
            X.Aik r4 = new X.Aik
            r4.<init>(r7, r0)
            goto L_0x029b
        L_0x01ab:
            java.lang.Object r5 = r7.A01
            com.whatsapp.events.EventCreateOrEditFragment r5 = (com.whatsapp.events.EventCreateOrEditFragment) r5
            r6 = 0
            java.lang.String r4 = "eventCreateOrEditViewModel"
            if (r9 == 0) goto L_0x01d3
            X.1bI r0 = r5.A0T
            if (r0 == 0) goto L_0x01bb
            r0.A04(r6)
        L_0x01bb:
            X.3VY r0 = r5.A0M
            if (r0 == 0) goto L_0x01f5
            X.1G1 r0 = r0.A0M
            X.4Zf r0 = X.AnonymousClass3MX.A0f(r0)
            X.4CW r0 = r0.A01
            com.whatsapp.events.EventCreateOrEditFragment.A08(r5, r0)
            X.3VY r1 = r5.A0M
            if (r1 == 0) goto L_0x01f5
            r0 = 1
            r1.A0W(r0)
            return
        L_0x01d3:
            X.3VY r0 = r5.A0M
            if (r0 == 0) goto L_0x01f5
            X.1G4 r3 = r0.A0K
        L_0x01d9:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.4Zf r1 = (X.C88324Zf) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r0 = X.AnonymousClass3VY.A07(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x01d9
            X.1bI r0 = r5.A0T
            X.C72453Mb.A1M(r0)
            X.3VY r0 = r5.A0M
            if (r0 == 0) goto L_0x01f5
            r0.A0W(r6)
            return
        L_0x01f5:
            X.C18070vi.A11(r4)
            goto L_0x0247
        L_0x01f9:
            java.lang.Object r0 = r7.A01
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity) r0
            com.whatsapp.wds.components.button.WDSButton r0 = r0.A06
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "submitButton"
            goto L_0x0244
        L_0x0204:
            r0.setEnabled(r9)
            return
        L_0x0208:
            java.lang.Object r1 = r7.A01
            X.4Uf r1 = (X.C87084Uf) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1Di r1 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.invoke(r0)
            return
        L_0x021a:
            java.lang.Object r0 = r7.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.0z4 r0 = r0.A0A
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "auto_archive_inactive_chats"
        L_0x0226:
            X.C17880vN.A1F(r1, r0, r9)
            return
        L_0x022a:
            java.lang.Object r0 = r7.A01
            com.whatsapp.conversationslist.ArchiveNotificationSettingActivity r0 = (com.whatsapp.conversationslist.ArchiveNotificationSettingActivity) r0
            X.1Q0 r1 = r0.A00
        L_0x0230:
            r0 = r9 ^ 1
            r1.A05(r0)
            return
        L_0x0236:
            java.lang.Object r2 = r7.A01
            X.3dG r2 = (X.C75003dG) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.3zh r1 = r2.A05
            if (r1 != 0) goto L_0x0249
            java.lang.String r0 = "wamGroupInfo"
        L_0x0244:
            X.C18070vi.A11(r0)
        L_0x0247:
            r0 = 0
            throw r0
        L_0x0249:
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A07 = r0
            if (r9 == 0) goto L_0x0268
            X.1FU r3 = r2.A0B
            X.1EC r2 = r2.A06
            r1 = 0
            if (r2 != 0) goto L_0x025e
            java.lang.String r0 = "cagJid"
            X.C18070vi.A11(r0)
            throw r1
        L_0x025e:
            X.1i2 r0 = X.C32961i2.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r0 = X.AnonymousClass4Z1.A01(r2, r0)
            r3.CMk(r0, r1)
            return
        L_0x0268:
            X.10I r5 = r2.getWaWorkers$app_product_community_community()
            r0 = 8
            X.4rg r4 = new X.4rg
            r4.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x029b
        L_0x0274:
            java.lang.Object r3 = r7.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            if (r9 == 0) goto L_0x0290
            com.whatsapp.jid.UserJid r1 = r3.A4l()
            X.C17960vV.A07(r1)
            X.1i2 r0 = X.C32961i2.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass4Z1.A01(r1, r0)
            X.1GP r1 = r3.getSupportFragmentManager()
        L_0x028b:
            r0 = 0
            r2.A2C(r1, r0)
            return
        L_0x0290:
            X.3oT r1 = r3.A0k
            X.10I r5 = r1.A0H
            r0 = 48
            X.7R9 r4 = new X.7R9
            r4.<init>((java.lang.Object) r1, (int) r0)
        L_0x029b:
            r5.CGF(r4)
            return
        L_0x029f:
            java.lang.Object r0 = r7.A01
            X.3o2 r0 = (X.C76733o2) r0
            if (r9 == 0) goto L_0x02b7
            X.1GP r3 = r0.getSupportFragmentManager()
            X.1BI r2 = r0.A4c()
            r1 = 0
            r0 = 0
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r0 = X.AnonymousClass4H4.A00(r2, r1, r0)
            X.C20098A7b.A01(r0, r3)
            return
        L_0x02b7:
            X.3Ua r0 = r0.A0B
            X.4RU r5 = r0.A0G
            X.1BI r4 = r0.A0F
            X.1OX r3 = r5.A06
            X.0wl r2 = r5.A04
            r1 = 0
            com.whatsapp.messagetranslation.TranslationManager$disableMessageTranslationForConversation$1 r0 = new com.whatsapp.messagetranslation.TranslationManager$disableMessageTranslationForConversation$1
            r0.<init>(r4, r5, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x02cb:
            java.lang.Object r2 = r7.A01
            com.whatsapp.TriStateCheckBox r2 = (com.whatsapp.TriStateCheckBox) r2
            int r1 = r2.A00
            r0 = 1
            if (r1 == 0) goto L_0x02de
            if (r1 == r0) goto L_0x02dd
            r0 = 2
            if (r1 == r0) goto L_0x02dd
        L_0x02d9:
            com.whatsapp.TriStateCheckBox.A01(r2)
            return
        L_0x02dd:
            r0 = 0
        L_0x02de:
            r2.A00 = r0
            goto L_0x02d9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90874em.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
