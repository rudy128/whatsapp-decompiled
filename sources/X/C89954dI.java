package X;

import android.view.View;

/* renamed from: X.4dI  reason: invalid class name and case insensitive filesystem */
public class C89954dI implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89954dI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89954dI(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0207, code lost:
        r2 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0209, code lost:
        if (r2 == null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        r1 = "online";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        r2 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0215, code lost:
        if (r2 == null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0217, code lost:
        r1 = "last";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0219, code lost:
        r2.A02(r1, X.C63682tW.A02(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0220, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0221, code lost:
        r0 = "privacySettingManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x059a, code lost:
        r0 = "supportLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x059d, code lost:
        r0 = "connectivityStateProvider";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05af, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05b5, code lost:
        r0 = "linkLauncher";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05b8, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05c9, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05cd, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r3.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ac, code lost:
        X.C72453Mb.A18(r0, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cd, code lost:
        X.AnonymousClass3MX.A1Q(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x04e8;
                case 1: goto L_0x04cc;
                case 2: goto L_0x0188;
                case 3: goto L_0x04c4;
                case 4: goto L_0x04bc;
                case 5: goto L_0x0149;
                case 6: goto L_0x000d;
                case 7: goto L_0x04a5;
                case 8: goto L_0x00b6;
                case 9: goto L_0x049d;
                case 10: goto L_0x0494;
                case 11: goto L_0x0468;
                case 12: goto L_0x0462;
                case 13: goto L_0x044c;
                case 14: goto L_0x0462;
                case 15: goto L_0x040c;
                case 16: goto L_0x03f4;
                case 17: goto L_0x0094;
                case 18: goto L_0x0061;
                case 19: goto L_0x0007;
                case 20: goto L_0x03dd;
                case 21: goto L_0x05bb;
                case 22: goto L_0x03cc;
                case 23: goto L_0x038f;
                case 24: goto L_0x02ef;
                case 25: goto L_0x001d;
                case 26: goto L_0x0007;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02a5;
                case 29: goto L_0x0288;
                case 30: goto L_0x026b;
                case 31: goto L_0x0256;
                case 32: goto L_0x024b;
                case 33: goto L_0x0462;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x023f;
                case 38: goto L_0x0225;
                case 39: goto L_0x020e;
                case 40: goto L_0x0202;
                case 41: goto L_0x01fc;
                case 42: goto L_0x01dd;
                case 43: goto L_0x01d7;
                case 44: goto L_0x01d1;
                case 45: goto L_0x0462;
                case 46: goto L_0x01bf;
                case 47: goto L_0x0462;
                case 48: goto L_0x01b0;
                case 49: goto L_0x0462;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1U(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r0 = (com.whatsapp.inappsupport.ui.SupportBkScreenFragment) r0
            X.1nl r1 = r0.A02
            if (r1 == 0) goto L_0x05b5
            android.content.Context r0 = r0.A14()
            java.lang.String r2 = "https://faq.whatsapp.com/"
            goto L_0x01ac
        L_0x001d:
            java.lang.Object r3 = r1.A01
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity r3 = (com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity) r3
            X.0vl r4 = r3.A05
            java.lang.Object r0 = r4.getValue()
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = (com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel) r0
            X.1DS r2 = r0.A02
            r0 = 37
            X.4sV r1 = X.C99244sV.A00(r3, r0)
            r0 = 41
            X.C91644g1.A00(r3, r2, r1, r0)
            java.lang.Object r4 = r4.getValue()
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r4 = (com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel) r4
            X.1DT r0 = r4.A03
            java.util.List r0 = X.AnonymousClass3MW.A10(r0)
            if (r0 == 0) goto L_0x000c
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x004c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04f0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4Tl r0 = (X.C86884Tl) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x004c
            r5.add(r1)
            goto L_0x004c
        L_0x0061:
            java.lang.Object r0 = r1.A01
            com.whatsapp.instrumentation.ui.PermissionsFragment r0 = (com.whatsapp.instrumentation.ui.PermissionsFragment) r0
            X.3KR r2 = r0.A04
            if (r2 == 0) goto L_0x000c
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r2 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r2
            X.18O r1 = r2.A06
            X.18R r0 = X.AnonymousClass18O.A0L
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0083
            X.3xb r0 = r2.A05
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0083
            X.3xb r0 = r2.A05
            r0.A06()
            return
        L_0x0083:
            X.1jj r3 = X.AnonymousClass3Ma.A0H(r2)
            r1 = 2131430999(0x7f0b0e57, float:1.8483715E38)
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = r2.A08
            r3.A09(r0, r1)
            r0 = 0
            r3.A0H(r0)
            goto L_0x00b2
        L_0x0094:
            java.lang.Object r0 = r1.A01
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = (com.whatsapp.instrumentation.ui.ConfirmFragment) r0
            X.3KQ r2 = r0.A03
            if (r2 == 0) goto L_0x000c
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r2 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r2
            java.lang.Boolean r0 = r2.A0G
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x056a
            X.1jj r3 = X.AnonymousClass3Ma.A0H(r2)
            r1 = 2131430999(0x7f0b0e57, float:1.8483715E38)
            com.whatsapp.instrumentation.ui.VerificationCodeFragment r0 = r2.A0A
            r3.A09(r0, r1)
        L_0x00b2:
            r3.A01()
            return
        L_0x00b6:
            java.lang.Object r6 = r1.A01
            com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet r6 = (com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet) r6
            X.11E r0 = r6.A06
            if (r0 == 0) goto L_0x059d
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "SupportNegativeFeedbackBottomSheet/sendNegativeFeedback/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FL r1 = r6.A1B()
            if (r1 == 0) goto L_0x000c
            X.00H r0 = r6.A09
            if (r0 == 0) goto L_0x0597
            r0.get()
            X.AnonymousClass4ZI.A00(r1)
            return
        L_0x00da:
            X.00H r0 = r6.A08
            if (r0 == 0) goto L_0x059a
            java.lang.Object r1 = r0.get()
            X.1mP r1 = (X.C35541mP) r1
            r0 = 12
            r1.A01(r0)
            android.os.Bundle r1 = r6.A06
            if (r1 == 0) goto L_0x000c
            java.lang.String r0 = "message_id"
            java.lang.String r7 = r1.getString(r0)
            if (r7 == 0) goto L_0x000c
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r8 = 5
            X.1D6[] r3 = new X.AnonymousClass1D6[r8]
            android.widget.CheckBox r0 = r6.A02
            r5 = 1
            X.1D6 r1 = X.AnonymousClass1D6.A00(r0, r5)
            r0 = 0
            r3[r0] = r1
            android.widget.CheckBox r0 = r6.A01
            r1 = 2
            X.C72463Mc.A1N(r3, r1, r5, r0)
            android.widget.CheckBox r0 = r6.A04
            r2 = 3
            X.C72463Mc.A1N(r3, r2, r1, r0)
            android.widget.CheckBox r0 = r6.A00
            r1 = 4
            X.C72463Mc.A1N(r3, r1, r2, r0)
            android.widget.CheckBox r0 = r6.A03
            X.C72463Mc.A1N(r3, r8, r1, r0)
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A0B(r3)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)
        L_0x0125:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0570
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)
            java.lang.Object r2 = r0.getKey()
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass000.A0M(r0)
            if (r2 == 0) goto L_0x0125
            boolean r0 = r2.isChecked()
            if (r0 != r5) goto L_0x0125
            X.C17890vO.A1D(r4, r1)
            goto L_0x0125
        L_0x0149:
            java.lang.Object r0 = r1.A01
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r0 = (com.whatsapp.inappsupport.ui.SupportBkScreenFragment) r0
            X.1FL r4 = r0.A1B()
            if (r4 == 0) goto L_0x000c
            X.10I r1 = r0.A0D
            if (r1 == 0) goto L_0x05b2
            X.1LU r11 = r0.A09
            if (r11 == 0) goto L_0x05af
            X.1FU r4 = (X.AnonymousClass1FU) r4
            X.6mP r5 = r0.A03
            if (r5 == 0) goto L_0x05ac
            X.11C r7 = r0.A06
            if (r7 == 0) goto L_0x05a9
            X.1MB r10 = r0.A08
            if (r10 == 0) goto L_0x05a6
            X.17x r8 = r0.A07
            if (r8 == 0) goto L_0x05a3
            X.A98 r12 = r0.A0B
            if (r12 == 0) goto L_0x05a0
            X.11E r6 = r0.A05
            if (r6 == 0) goto L_0x059d
            r3 = 0
            r14 = 0
            r15 = 1
            java.lang.String r13 = "csf/Bloks_fails_to_load"
            X.9BP r2 = new X.9BP
            r9 = r3
            r16 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String[] r0 = new java.lang.String[r14]
            r1.CGD(r2, r0)
            return
        L_0x0188:
            java.lang.Object r3 = r1.A01
            com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment r3 = (com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment) r3
            java.lang.String r1 = com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment.A00(r3)
            if (r1 == 0) goto L_0x000c
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x000c
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x05b8
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r2 = r0.A00(r1)
            X.1nl r1 = r3.A02
            if (r1 == 0) goto L_0x05b5
            android.content.Context r0 = r3.A14()
        L_0x01ac:
            X.C72453Mb.A18(r0, r1, r2)
            return
        L_0x01b0:
            java.lang.Object r1 = r1.A01
            com.whatsapp.lists.home.ListsHomeBottomSheet r1 = (com.whatsapp.lists.home.ListsHomeBottomSheet) r1
            X.1pm r3 = X.AnonymousClass2SS.A00(r1)
            r0 = 0
            com.whatsapp.lists.home.ListsHomeBottomSheet$onViewCreated$1$1 r2 = new com.whatsapp.lists.home.ListsHomeBottomSheet$onViewCreated$1$1
            r2.<init>(r1, r0)
            goto L_0x01cd
        L_0x01bf:
            java.lang.Object r1 = r1.A01
            com.whatsapp.lists.ListsManagerBottomSheetFragment r1 = (com.whatsapp.lists.ListsManagerBottomSheetFragment) r1
            X.1pm r3 = X.AnonymousClass2SS.A00(r1)
            r0 = 0
            com.whatsapp.lists.ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1 r2 = new com.whatsapp.lists.ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1
            r2.<init>(r1, r0)
        L_0x01cd:
            X.AnonymousClass3MX.A1Q(r2, r3)
            return
        L_0x01d1:
            java.lang.Object r0 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 0
            goto L_0x0213
        L_0x01d7:
            java.lang.Object r0 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 1
            goto L_0x0213
        L_0x01dd:
            java.lang.Object r2 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r2 = (com.whatsapp.lastseen.PresencePrivacyActivity) r2
            X.00H r0 = r2.A04
            if (r0 == 0) goto L_0x05af
            r0.get()
            X.129 r1 = r2.A02
            if (r1 == 0) goto L_0x01f8
            java.lang.String r0 = "515115256843064"
            android.content.Intent r1 = X.C72473Md.A0C(r1, r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x01f8:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x05c9
        L_0x01fc:
            java.lang.Object r0 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 4
            goto L_0x0207
        L_0x0202:
            java.lang.Object r0 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 0
        L_0x0207:
            X.1Rl r2 = r0.A00
            if (r2 == 0) goto L_0x0221
            java.lang.String r1 = "online"
            goto L_0x0219
        L_0x020e:
            java.lang.Object r0 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 2
        L_0x0213:
            X.1Rl r2 = r0.A00
            if (r2 == 0) goto L_0x0221
            java.lang.String r1 = "last"
        L_0x0219:
            java.lang.String r0 = X.C63682tW.A02(r1, r3)
            r2.A02(r1, r0)
            return
        L_0x0221:
            java.lang.String r0 = "privacySettingManager"
            goto L_0x05c9
        L_0x0225:
            java.lang.Object r2 = r1.A01
            com.whatsapp.lastseen.PresencePrivacyActivity r2 = (com.whatsapp.lastseen.PresencePrivacyActivity) r2
            X.00H r0 = r2.A04
            if (r0 == 0) goto L_0x05af
            android.content.Intent r1 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r0 = "com.whatsapp.lastseen.LastSeenBlockListPickerActivity"
            android.content.Intent r1 = r1.setClassName(r2, r0)
            X.C18070vi.A0X(r1)
            r0 = 1
            r2.startActivityForResult(r1, r0)
            return
        L_0x023f:
            java.lang.Object r0 = r1.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r0 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r0
            com.whatsapp.labelitem.view.AddToListViewModel r0 = X.AnonymousClass3MY.A0c(r0)
            r0.A0T()
            return
        L_0x024b:
            java.lang.Object r1 = r1.A01
            X.3Wp r1 = (X.C73603Wp) r1
            r0 = 1
            r1.A01 = r0
            r1.notifyDataSetChanged()
            return
        L_0x0256:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1D()
            X.1GP r1 = r0.getSupportFragmentManager()
            com.whatsapp.interopui.optout.InteropOptOutDialogFragment r0 = new com.whatsapp.interopui.optout.InteropOptOutDialogFragment
            r0.<init>()
            X.C20098A7b.A01(r0, r1)
            return
        L_0x026b:
            java.lang.Object r3 = r1.A01
            com.whatsapp.interopui.setting.InteropSettingsConfigFragment r3 = (com.whatsapp.interopui.setting.InteropSettingsConfigFragment) r3
            X.1LU r0 = r3.A00
            if (r0 == 0) goto L_0x05af
            X.1FL r0 = r3.A1D()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity"
            r2.setClassName(r1, r0)
            r3.A1k(r2)
            return
        L_0x0288:
            java.lang.Object r1 = r1.A01
            com.whatsapp.interopui.setting.InteropSettingsConfigFragment r1 = (com.whatsapp.interopui.setting.InteropSettingsConfigFragment) r1
            X.0vl r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.interopui.setting.InteropSettingsViewModel r0 = (com.whatsapp.interopui.setting.InteropSettingsViewModel) r0
            X.1FL r2 = r1.A1D()
            X.00H r0 = r0.A04
            java.lang.Object r1 = r0.get()
            X.4Qx r1 = (X.C86254Qx) r1
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x02a5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity r0 = (com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity) r0
            X.4Lr r3 = new X.4Lr
            r3.<init>(r0)
            X.3Rj r2 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131895810(0x7f122602, float:1.9426464E38)
            r2.A0E(r0)
            r0 = 2131895809(0x7f122601, float:1.9426461E38)
            r2.A0D(r0)
            r1 = 2131898783(0x7f12319f, float:1.9432493E38)
            r0 = 0
            r2.A0X(r0, r1)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 19
            X.C73203Rj.A0A(r2, r3, r0, r1)
            r2.A0C()
            return
        L_0x02d1:
            java.lang.Object r2 = r1.A01
            com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity r2 = (com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity) r2
            X.0vl r0 = r2.A05
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r1 = (com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel) r1
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.4Qx r0 = (X.C86254Qx) r0
            r0.A00(r2, r1)
            r0 = 2131895379(0x7f122453, float:1.942559E38)
            r2.CNA(r0)
            return
        L_0x02ef:
            java.lang.Object r3 = r1.A01
            com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity r3 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity) r3
            X.0vl r0 = r3.A0H
            java.lang.Object r6 = r0.getValue()
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r6 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel) r6
            X.4ca r7 = r3.A09
            java.lang.String r0 = "integratorInfo"
            if (r7 == 0) goto L_0x05c9
            java.lang.Integer r0 = r7.A01
            int r1 = r0.intValue()
            r0 = 0
            java.lang.String r2 = ""
            if (r1 == r0) goto L_0x0385
            r0 = 1
            if (r1 == r0) goto L_0x033f
            r0 = 2
            if (r1 != r0) goto L_0x0388
            com.whatsapp.WaEditText r0 = r3.A06
        L_0x0314:
            if (r0 == 0) goto L_0x0323
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0323
            r2 = r0
        L_0x0323:
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            int r0 = r7.A00
            X.1D6 r4 = X.AnonymousClass1D6.A00(r2, r0)
            java.util.List r3 = X.C18070vi.A0M(r4)
            X.1OX r2 = X.C41561wd.A00(r6)
            r1 = 0
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1 r0 = new com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1
            r0.<init>(r6, r3, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x033f:
            com.whatsapp.WaEditText r0 = r3.A05
            if (r0 == 0) goto L_0x034f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x034f
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0350
        L_0x034f:
            r1 = r2
        L_0x0350:
            com.whatsapp.WaEditText r0 = r3.A08
            if (r0 == 0) goto L_0x0361
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0361
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0361
            r2 = r0
        L_0x0361:
            java.lang.String r5 = X.C17900vP.A0A(r1, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            int r3 = r5.length()
            r2 = 0
        L_0x036e:
            if (r2 >= r3) goto L_0x0380
            char r1 = r5.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L_0x037d
            r4.append(r1)
        L_0x037d:
            int r2 = r2 + 1
            goto L_0x036e
        L_0x0380:
            java.lang.String r2 = X.C18070vi.A0H(r4)
            goto L_0x0323
        L_0x0385:
            com.whatsapp.WaEditText r0 = r3.A07
            goto L_0x0314
        L_0x0388:
            java.lang.String r0 = "None of the available identifier types was present."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x038f:
            java.lang.Object r5 = r1.A01
            com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity r5 = (com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity) r5
            X.0z4 r1 = r5.A0A
            java.lang.String r0 = "insufficient_storage_prompt_timestamp"
            r1.A1i(r0)
            X.3zC r4 = new X.3zC
            r4.<init>()
            long r0 = r5.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4.A02 = r3
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A00 = r0
            java.lang.Integer r0 = X.C17880vN.A0i()
            r4.A01 = r0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r3, r1)
            java.lang.String r0 = "insufficient-storage-activity/skipped space-required: %,d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18K r0 = r5.A01
            r0.CC7(r4)
            r5.finish()
            return
        L_0x03cc:
            java.lang.Object r3 = r1.A01
            X.1FY r3 = (X.AnonymousClass1FY) r3
            X.1L9 r2 = r3.A01
            java.lang.String r1 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r2.A08(r3, r0)
            return
        L_0x03dd:
            java.lang.Object r3 = r1.A01
            com.whatsapp.instrumentation.ui.SendLogsAsEmailActivity r3 = (com.whatsapp.instrumentation.ui.SendLogsAsEmailActivity) r3
            r0 = 0
            r1 = r18
            r1.setEnabled(r0)
            X.10I r2 = r3.A04
            r1 = 27
            X.7Pd r0 = new X.7Pd
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x03f4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r0 = (com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet) r0
            r0.A28()
            X.00H r0 = r0.A06
            if (r0 == 0) goto L_0x059a
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.1mP r2 = (X.C35541mP) r2
            r1 = 0
            r0 = 21
            r2.A02(r0, r1)
            return
        L_0x040c:
            java.lang.Object r4 = r1.A01
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r4 = (com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet) r4
            X.1aA r1 = r4.A03
            if (r1 == 0) goto L_0x0448
            java.lang.String r0 = "support_ai"
            r3 = 0
            r1.A00(r0, r3)
            X.11E r0 = r4.A02
            if (r0 == 0) goto L_0x0442
            boolean r0 = r0.A09()
            r2 = 1
            if (r0 != 0) goto L_0x042b
            r4.A08 = r2
        L_0x0427:
            r4.A28()
            return
        L_0x042b:
            X.00H r0 = r4.A06
            if (r0 == 0) goto L_0x043c
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1mP r1 = (X.C35541mP) r1
            r0 = 2
            r1.A02(r0, r3)
            r4.A07 = r2
            goto L_0x0427
        L_0x043c:
            java.lang.String r0 = "supportLogger"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0442:
            java.lang.String r0 = "connectivityStateProvider"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0448:
            java.lang.String r0 = "nuxManager"
            goto L_0x05c9
        L_0x044c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.inappsupport.ui.nux.SupportAIEmbodimentBottomSheet r1 = (com.whatsapp.inappsupport.ui.nux.SupportAIEmbodimentBottomSheet) r1
            X.00H r0 = r1.A01
            if (r0 == 0) goto L_0x05b8
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "saga-help-article"
            r2.A01(r1, r0)
            return
        L_0x0462:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0468:
            java.lang.Object r4 = r1.A01
            com.whatsapp.inappsupport.ui.SupportVideoActivity r4 = (com.whatsapp.inappsupport.ui.SupportVideoActivity) r4
            X.6Mj r0 = r4.A05
            java.lang.String r3 = "videoPlayerControllerView"
            r2 = 0
            if (r0 == 0) goto L_0x0490
            boolean r1 = r0.A0B()
            X.6Mj r0 = r4.A05
            if (r1 == 0) goto L_0x0481
            if (r0 == 0) goto L_0x0490
            r0.A04()
            return
        L_0x0481:
            if (r0 == 0) goto L_0x0490
            r0.A05()
            X.6Mj r1 = r4.A05
            if (r1 == 0) goto L_0x0490
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A0A(r0)
            return
        L_0x0490:
            X.C18070vi.A11(r3)
            throw r2
        L_0x0494:
            java.lang.Object r1 = r1.A01
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r1 = (com.whatsapp.inappsupport.ui.SupportTopicsActivity) r1
            r0 = 0
            com.whatsapp.inappsupport.ui.SupportTopicsActivity.A03(r0, r1)
            return
        L_0x049d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r0 = (com.whatsapp.inappsupport.ui.SupportTopicsActivity) r0
            r0.onBackPressed()
            return
        L_0x04a5:
            java.lang.Object r2 = r1.A01
            com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet r2 = (com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet) r2
            X.00H r0 = r2.A08
            if (r0 == 0) goto L_0x059a
            java.lang.Object r1 = r0.get()
            X.1mP r1 = (X.C35541mP) r1
            r0 = 15
            r1.A01(r0)
            r2.A28()
            return
        L_0x04bc:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C72453Mb.A14(r0)
            return
        L_0x04c4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.inappsupport.ui.FaqItemActivityV2 r0 = (com.whatsapp.inappsupport.ui.FaqItemActivityV2) r0
            r0.onBackPressed()
            return
        L_0x04cc:
            java.lang.Object r1 = r1.A01
            com.whatsapp.inappsupport.ui.ContactUsActivity r1 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r1
            boolean r0 = X.AnonymousClass3MW.A1Y(r1)
            if (r0 != 0) goto L_0x04da
            com.whatsapp.inappsupport.ui.ContactUsActivity.A0Q(r1)
            return
        L_0x04da:
            X.6uc r1 = r1.A0F
            boolean r0 = r1.A03()
            int r0 = X.C72453Mb.A03(r0)
            r1.A01(r0)
            return
        L_0x04e8:
            java.lang.Object r0 = r1.A01
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r0
            r0.onBackPressed()
            return
        L_0x04f0:
            X.00H r0 = r4.A0C
            boolean r0 = X.C72463Mc.A1X(r0)
            if (r0 == 0) goto L_0x0502
            r0 = 2131895379(0x7f122453, float:1.942559E38)
            r3.CNA(r0)
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel.A00(r4, r5)
            return
        L_0x0502:
            java.util.ArrayList r2 = X.C29351c6.A0D(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x050a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x051c
            java.lang.Object r0 = r1.next()
            X.4Tl r0 = (X.C86884Tl) r0
            X.4ca r0 = r0.A01
            r2.add(r0)
            goto L_0x050a
        L_0x051c:
            X.00H r0 = r4.A0D
            X.1jg r0 = X.AnonymousClass3MX.A0k(r0)
            java.util.List r0 = r0.A01
            r0.clear()
            r0.addAll(r2)
            X.00H r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            X.1tF r0 = (X.C39541tF) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0558
            X.00H r0 = r4.A0E
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.optin.InteropUnifiedInboxOptionActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            X.1DT r3 = r4.A07
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            r1 = 0
            X.4Ze r0 = new X.4Ze
            r0.<init>(r2, r1, r1)
            r3.A0E(r0)
            return
        L_0x0558:
            X.00H r0 = r4.A0A
            java.lang.Object r0 = r0.get()
            X.4Qx r0 = (X.C86254Qx) r0
            r0.A00(r3, r4)
            r0 = 2131895379(0x7f122453, float:1.942559E38)
            r3.CNA(r0)
            return
        L_0x056a:
            java.lang.String r0 = r2.A0H
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity.A0Q(r2, r0)
            return
        L_0x0570:
            X.9qm r5 = new X.9qm
            r5.<init>(r7, r4)
            X.00H r0 = r6.A09
            if (r0 == 0) goto L_0x0597
            java.lang.Object r4 = r0.get()
            X.4ZI r4 = (X.AnonymousClass4ZI) r4
            X.1FL r3 = r6.A1B()
            X.AnonymousClass3MW.A1W(r3)
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.1OX r2 = r4.A05
            r1 = 0
            com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1 r0 = new com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1
            r0.<init>(r3, r4, r5, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            r6.A28()
            return
        L_0x0597:
            java.lang.String r0 = "supportMessageFeedbackUtils"
            goto L_0x05c9
        L_0x059a:
            java.lang.String r0 = "supportLogger"
            goto L_0x05c9
        L_0x059d:
            java.lang.String r0 = "connectivityStateProvider"
            goto L_0x05c9
        L_0x05a0:
            java.lang.String r0 = "registrationHttpManager"
            goto L_0x05c9
        L_0x05a3:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x05c9
        L_0x05a6:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x05c9
        L_0x05a9:
            java.lang.String r0 = "systemServices"
            goto L_0x05c9
        L_0x05ac:
            java.lang.String r0 = "sendFeedback"
            goto L_0x05c9
        L_0x05af:
            java.lang.String r0 = "waIntents"
            goto L_0x05c9
        L_0x05b2:
            java.lang.String r0 = "waWorkers"
            goto L_0x05c9
        L_0x05b5:
            java.lang.String r0 = "linkLauncher"
            goto L_0x05c9
        L_0x05b8:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x05c9
        L_0x05bb:
            java.lang.Object r5 = r1.A01
            com.whatsapp.instrumentation.ui.VerificationCodeFragment r5 = (com.whatsapp.instrumentation.ui.VerificationCodeFragment) r5
            X.420 r0 = X.AnonymousClass420.A00
            r5.A00 = r0
            X.5Y0 r0 = r5.A01
            if (r0 != 0) goto L_0x05ce
            java.lang.String r0 = "listener"
        L_0x05c9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05ce:
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r0 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r0
            X.4pp r0 = r0.A07
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r4 = r0.A00
            X.1OX r3 = r4.A06
            X.0wl r2 = r4.A05
            r1 = 0
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1 r0 = new com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            com.whatsapp.instrumentation.ui.VerificationCodeFragment.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89954dI.onClick(android.view.View):void");
    }
}
