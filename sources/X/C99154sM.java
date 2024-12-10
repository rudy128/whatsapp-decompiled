package X;

import com.whatsapp.labelitem.view.AddToListViewModel;

/* renamed from: X.4sM  reason: invalid class name and case insensitive filesystem */
public class C99154sM implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C99154sM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AddToListViewModel A00(C99154sM r1) {
        AddToListViewModel addToListViewModel = (AddToListViewModel) r1.A01;
        C18070vi.A0d(addToListViewModel, 0);
        return addToListViewModel;
    }

    public static C18110vm A01(Object obj, int i) {
        return AnonymousClass1DF.A01(new C99154sM(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x037b, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x038a, code lost:
        return r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e2, code lost:
        X.C18070vi.A11(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0087;
                case 2: goto L_0x009d;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00cd;
                case 5: goto L_0x0013;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00f3;
                case 8: goto L_0x010d;
                case 9: goto L_0x011e;
                case 10: goto L_0x012f;
                case 11: goto L_0x013f;
                case 12: goto L_0x014f;
                case 13: goto L_0x015f;
                case 14: goto L_0x016d;
                case 15: goto L_0x0178;
                case 16: goto L_0x0197;
                case 17: goto L_0x01af;
                case 18: goto L_0x01bf;
                case 19: goto L_0x01d7;
                case 20: goto L_0x01e4;
                case 21: goto L_0x0202;
                case 22: goto L_0x0217;
                case 23: goto L_0x0187;
                case 24: goto L_0x0232;
                case 25: goto L_0x023b;
                case 26: goto L_0x027c;
                case 27: goto L_0x02ac;
                case 28: goto L_0x02b8;
                case 29: goto L_0x02c4;
                case 30: goto L_0x02d0;
                case 31: goto L_0x02dc;
                case 32: goto L_0x02e8;
                case 33: goto L_0x02f4;
                case 34: goto L_0x0300;
                case 35: goto L_0x030b;
                case 36: goto L_0x0312;
                case 37: goto L_0x0319;
                case 38: goto L_0x0320;
                case 39: goto L_0x0327;
                case 40: goto L_0x032e;
                case 41: goto L_0x0335;
                case 42: goto L_0x033c;
                case 43: goto L_0x034e;
                case 44: goto L_0x00b5;
                case 45: goto L_0x037c;
                case 46: goto L_0x038b;
                case 47: goto L_0x0397;
                case 48: goto L_0x03a3;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131433170(0x7f0b16d2, float:1.8488118E38)
            android.view.View r8 = r1.findViewById(r0)
        L_0x0012:
            return r8
        L_0x0013:
            java.lang.Object r7 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r7 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r7
            X.0vl r1 = r7.A07
            java.lang.Object r0 = r1.getValue()
            X.4X2 r0 = (X.AnonymousClass4X2) r0
            int r0 = r0.A05
            java.lang.String r8 = X.AnonymousClass3MY.A0n(r7, r0)
            java.lang.Object r0 = r1.getValue()
            X.4X2 r0 = (X.AnonymousClass4X2) r0
            java.lang.Integer r0 = r0.A09
            if (r0 == 0) goto L_0x0012
            int r6 = r0.intValue()
            android.view.View r1 = r7.A03
            if (r1 == 0) goto L_0x0012
            r0 = 2131429927(0x7f0b0a27, float:1.848154E38)
            android.widget.TextView r5 = X.C17880vN.A0E(r1, r0)
            if (r5 == 0) goto L_0x0012
            r5.setText(r8)
            android.content.Context r4 = r5.getContext()
            r3 = 2131233259(0x7f0809eb, float:1.808265E38)
            android.content.Context r2 = r7.A1n()
            r1 = 16842808(0x1010038, float:2.3693715E-38)
            r0 = 2131102704(0x7f060bf0, float:1.7817853E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A04(r2, r4, r1, r0, r3)
            X.C18070vi.A0X(r2)
            android.text.TextPaint r1 = r5.getPaint()
            java.lang.String r0 = r7.A1H(r6)
            android.text.SpannableStringBuilder r1 = X.C72813Np.A02(r1, r2, r8, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.text.SpannableStringBuilder r8 = r0.append(r1)
            X.C18070vi.A0X(r8)
            return r8
        L_0x0074:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.1KB r2 = r3.A0r
            r1 = 28
            X.4rL r0 = new X.4rL
            r0.<init>(r3, r1)
            r2.A0J(r0)
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x0087:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.00H r0 = r2.A3I
            java.lang.Object r1 = r0.get()
            X.1rO r1 = (X.C38501rO) r1
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A04(r2, r0)
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x009d:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel> r0 = com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel.class
            goto L_0x0386
        L_0x00a9:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel> r0 = com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel.class
            goto L_0x0386
        L_0x00b5:
            java.lang.Object r0 = r1.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r0 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r0
            com.whatsapp.labelitem.view.AddToListViewModel r2 = X.AnonymousClass3MY.A0c(r0)
            X.3X4 r0 = r0.A04
            java.lang.String r1 = "adapter"
            if (r0 == 0) goto L_0x00e2
            java.util.ArrayList r1 = r0.A01
            java.util.ArrayList r0 = r0.A00
            r2.A0U(r1, r0)
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x00cd:
            java.lang.Object r0 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r0
            X.00H r0 = r0.A02
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r0.get()
            X.4Ri r0 = (X.C86364Ri) r0
            X.4X2 r8 = r0.A00()
            return r8
        L_0x00e0:
            java.lang.String r1 = "consumerMarketingDisclosurePresentationHelper"
        L_0x00e2:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x00e7:
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131889484(0x7f120d4c, float:1.9413633E38)
            java.lang.String r8 = r1.A1H(r0)
            return r8
        L_0x00f3:
            java.lang.Object r3 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r3 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r3
            androidx.core.widget.NestedScrollView r2 = r3.A05
            if (r2 == 0) goto L_0x0379
            r2.requestLayout()
            r2.invalidate()
            r1 = 13
            X.4rM r0 = new X.4rM
            r0.<init>(r3, r1)
            r2.post(r0)
            goto L_0x0379
        L_0x010d:
            java.lang.Object r0 = r1.A01
            X.3xb r0 = (X.C80633xb) r0
            X.1FL r1 = r0.A04
            X.0SN r0 = new X.0SN
            r0.<init>(r1)
            X.0PO r8 = new X.0PO
            r8.<init>(r0)
            return r8
        L_0x011e:
            java.lang.Object r0 = r1.A01
            X.3xc r0 = (X.C80643xc) r0
            X.1FL r1 = r0.A03
            X.0SN r0 = new X.0SN
            r0.<init>(r1)
            X.0PO r8 = new X.0PO
            r8.<init>(r0)
            return r8
        L_0x012f:
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        L_0x013f:
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 2131435885(0x7f0b216d, float:1.8493625E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        L_0x014f:
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 2131429078(0x7f0b06d6, float:1.8479819E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        L_0x015f:
            java.lang.Object r0 = r1.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            android.view.View r1 = r0.A00
            r0 = 2131430119(0x7f0b0ae7, float:1.848193E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        L_0x016d:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            X.AnonymousClass4Yv.A00(r1, r0)
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x0178:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0195
            java.lang.String r0 = ""
            X.205 r8 = X.AnonymousClass4aU.A03(r1, r0)
            return r8
        L_0x0187:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            X.3zh r1 = r0.A10
            if (r1 == 0) goto L_0x0195
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A07 = r0
        L_0x0195:
            r8 = 0
            return r8
        L_0x0197:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x01a8
            java.lang.String r0 = ""
            X.205 r8 = X.AnonymousClass4aU.A03(r1, r0)
            if (r8 == 0) goto L_0x01a8
            return r8
        L_0x01a8:
            java.lang.String r0 = "Could not retrieve message key from arguments bundle."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x01af:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r0 = r0.A19()
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<X.3Va> r0 = X.C73353Va.class
            goto L_0x0386
        L_0x01bf:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x01d0
            java.lang.String r0 = ""
            X.205 r8 = X.AnonymousClass4aU.A03(r1, r0)
            if (r8 == 0) goto L_0x01d0
            return r8
        L_0x01d0:
            java.lang.String r0 = "Could not retrieve message key from arguments bundle."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x01d7:
            java.lang.Object r0 = r1.A01
            com.whatsapp.events.EventResponseBottomSheet r0 = (com.whatsapp.events.EventResponseBottomSheet) r0
            boolean r0 = com.whatsapp.events.EventResponseBottomSheet.A00(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L_0x01e4:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x01ff
            java.lang.String r0 = "EXISTING_RESPONSE_EXTRA"
            int r1 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x01ff
            X.2Qx[] r0 = X.C49552Qx.values()
            r8 = r0[r1]
            return r8
        L_0x01ff:
            X.2Qx r8 = X.C49552Qx.UNKNOWN
            return r8
        L_0x0202:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0215
            java.lang.String r0 = "EXISTING_RESPONSE_GUEST_COUNT_EXTRA"
            int r0 = r1.getInt(r0)
        L_0x0210:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            return r8
        L_0x0215:
            r0 = 0
            goto L_0x0210
        L_0x0217:
            java.lang.Object r1 = r1.A01
            X.4Xm r1 = (X.C87894Xm) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2 = 0
            r0 = 1000(0x3e8, float:1.401E-42)
            X.DXn r8 = new X.DXn
            r8.<init>(r0)
            X.1OX r1 = r1.A08
            com.whatsapp.fieldstats.helper.sharecontentjourney.ShareContentUserJourneyLogger$jobQueue$2$1 r0 = new com.whatsapp.fieldstats.helper.sharecontentjourney.ShareContentUserJourneyLogger$jobQueue$2$1
            r0.<init>(r2, r8)
            X.AnonymousClass3MX.A1Q(r0, r1)
            return r8
        L_0x0232:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A1A(r0)
            r8 = 0
            return r8
        L_0x023b:
            java.lang.Object r5 = r1.A01
            com.whatsapp.group.newgroup.NewGroup r5 = (com.whatsapp.group.newgroup.NewGroup) r5
            java.util.List r0 = r5.A0j
            java.util.ArrayList r4 = X.AnonymousClass1E7.A02(r0)
            X.00H r0 = r5.A0g
            r0.get()
            X.1EC r3 = r5.A0S
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupMembersSelector"
            r2.setClassName(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0268
            java.lang.String r1 = "selected"
            java.util.ArrayList r0 = X.C22971Dz.A0B(r4)
            r2.putExtra(r1, r0)
        L_0x0268:
            if (r3 == 0) goto L_0x026f
            java.lang.String r0 = "parent_group_jid_to_link"
            X.AnonymousClass3MY.A12(r2, r3, r0)
        L_0x026f:
            java.lang.String r1 = "return_result"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = 14
            r5.startActivityForResult(r2, r0)
            r8 = 0
            return r8
        L_0x027c:
            java.lang.Object r2 = r1.A01
            X.4SJ r2 = (X.AnonymousClass4SJ) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.10I r13 = r2.A05
            X.1KB r9 = r2.A00
            X.181 r10 = r2.A01
            X.1D9 r12 = r2.A04
            X.118 r0 = r2.A02
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getCacheDir()
            java.lang.String r0 = "interop_image_cache"
            java.io.File r14 = X.C17880vN.A0e(r1, r0)
            X.1VU r0 = r2.A03
            X.4ht r11 = new X.4ht
            r11.<init>(r0)
            java.lang.String r15 = "interop_image_loader"
            r16 = 8388608(0x800000, double:4.144523E-317)
            X.5vB r8 = new X.5vB
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x02ac:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel> r0 = com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel.class
            goto L_0x0386
        L_0x02b8:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel> r0 = com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel.class
            goto L_0x0386
        L_0x02c4:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel> r0 = com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel.class
            goto L_0x0386
        L_0x02d0:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel> r0 = com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel.class
            goto L_0x0386
        L_0x02dc:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1It r1 = X.AnonymousClass3Ma.A0I(r0)
            java.lang.Class<com.whatsapp.interopui.setting.InteropSettingsViewModel> r0 = com.whatsapp.interopui.setting.InteropSettingsViewModel.class
            goto L_0x0386
        L_0x02e8:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.interopui.notification.InteropNotifOptInViewModel> r0 = com.whatsapp.interopui.notification.InteropNotifOptInViewModel.class
            goto L_0x0386
        L_0x02f4:
            java.lang.Object r0 = r1.A01
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.interopui.setting.InteropSettingsViewModel> r0 = com.whatsapp.interopui.setting.InteropSettingsViewModel.class
            goto L_0x0386
        L_0x0300:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1It r1 = X.AnonymousClass3Ma.A0I(r0)
            java.lang.Class<com.whatsapp.interopui.setting.InteropSettingsViewModel> r0 = com.whatsapp.interopui.setting.InteropSettingsViewModel.class
            goto L_0x0386
        L_0x030b:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1DT r8 = r0.A02
            return r8
        L_0x0312:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1wy r8 = r0.A09
            return r8
        L_0x0319:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1wy r8 = r0.A0B
            return r8
        L_0x0320:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1wy r8 = r0.A0C
            return r8
        L_0x0327:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1wy r8 = r0.A0A
            return r8
        L_0x032e:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1wy r8 = r0.A08
            return r8
        L_0x0335:
            com.whatsapp.labelitem.view.AddToListViewModel r0 = A00(r1)
            X.1wy r8 = r0.A07
            return r8
        L_0x033c:
            com.whatsapp.labelitem.view.AddToListViewModel r2 = A00(r1)
            X.00H r0 = r2.A0H
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1q4 r0 = r2.A05
            r1.registerObserver(r0)
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x034e:
            java.lang.Object r3 = r1.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r3 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r3
            com.whatsapp.labelitem.view.bottomsheet.NewLabelView r2 = r3.A06
            if (r2 == 0) goto L_0x036a
            r0 = 8
            r2.setVisibility(r0)
            com.whatsapp.WaEditText r1 = r2.A0C
            X.48A r0 = r2.A0G
            r1.removeTextChangedListener(r0)
            X.4cf r0 = r2.A0H
            r1.removeTextChangedListener(r0)
            r1.A0H()
        L_0x036a:
            com.whatsapp.labelitem.view.bottomsheet.AddLabelView r0 = r3.A05
            if (r0 == 0) goto L_0x0371
            r0.A00()
        L_0x0371:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A01
            if (r1 == 0) goto L_0x0379
            r0 = 1
            X.C43531zx.A05(r1, r0)
        L_0x0379:
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x037c:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.labelitem.view.AddToListViewModel> r0 = com.whatsapp.labelitem.view.AddToListViewModel.class
        L_0x0386:
            X.1J2 r8 = r1.A00(r0)
            return r8
        L_0x038b:
            java.lang.Object r1 = r1.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131430642(0x7f0b0cf2, float:1.848299E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        L_0x0397:
            java.lang.Object r1 = r1.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131432891(0x7f0b15bb, float:1.8487552E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        L_0x03a3:
            java.lang.Object r1 = r1.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131432892(0x7f0b15bc, float:1.8487554E38)
            android.view.View r8 = r1.findViewById(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99154sM.invoke():java.lang.Object");
    }
}
