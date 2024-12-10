package X;

/* renamed from: X.4fa  reason: invalid class name and case insensitive filesystem */
public class C91374fa implements AnonymousClass1XI {
    public final int A00;
    public final Object A01;

    public C91374fa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021a, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x021e, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0249, code lost:
        X.C72453Mb.A1O(r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024c, code lost:
        r0 = r3.getSupportFragmentManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0250, code lost:
        r0.A0u(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0253, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0139, code lost:
        r1.A01(X.AnonymousClass11S.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bv0(java.lang.String r12, android.os.Bundle r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x01ea;
                case 1: goto L_0x01e2;
                case 2: goto L_0x01da;
                case 3: goto L_0x01d2;
                case 4: goto L_0x01ca;
                case 5: goto L_0x014e;
                case 6: goto L_0x0141;
                case 7: goto L_0x01c2;
                case 8: goto L_0x0234;
                case 9: goto L_0x0107;
                case 10: goto L_0x01ba;
                case 11: goto L_0x00cd;
                case 12: goto L_0x00ac;
                case 13: goto L_0x01a1;
                case 14: goto L_0x004f;
                case 15: goto L_0x0021;
                case 16: goto L_0x019b;
                case 17: goto L_0x0193;
                case 18: goto L_0x018b;
                case 19: goto L_0x000d;
                case 20: goto L_0x021f;
                case 21: goto L_0x0183;
                case 22: goto L_0x017b;
                case 23: goto L_0x0173;
                case 24: goto L_0x016b;
                case 25: goto L_0x0163;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r0 = (com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment) r0
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment.A00(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r11.A01
            X.1Di r1 = (X.C22821Di) r1
            r0 = 2
            X.C18070vi.A0d(r13, r0)
            java.lang.String r0 = "AddMembersSuccessJidList"
            java.util.ArrayList r0 = r13.getParcelableArrayList(r0)
            if (r0 == 0) goto L_0x000c
            r1.invoke(r0)
            return
        L_0x0021:
            java.lang.Object r3 = r11.A01
            com.whatsapp.events.EventCreateOrEditFragment r3 = (com.whatsapp.events.EventCreateOrEditFragment) r3
            X.C18070vi.A0j(r12, r13)
            int r1 = r12.hashCode()
            r0 = -85477603(0xfffffffffae7b71d, float:-6.0156728E35)
            if (r1 != r0) goto L_0x000c
            java.lang.String r0 = "RESULT_KEY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "SELECTED_CALL_TYPE"
            java.lang.String r0 = r13.getString(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "WA_VIDEO_CALL"
        L_0x0043:
            X.4CW r5 = X.AnonymousClass4CW.valueOf(r0)
            X.3VY r1 = r3.A0M
            if (r1 != 0) goto L_0x01f2
            java.lang.String r0 = "eventCreateOrEditViewModel"
            goto L_0x021a
        L_0x004f:
            java.lang.Object r3 = r11.A01
            com.whatsapp.email.EmailVerificationActivity r3 = (com.whatsapp.email.EmailVerificationActivity) r3
            r4 = 0
            r0 = 2
            X.C18070vi.A0d(r13, r0)
            java.lang.String r0 = "RECONFIRM_EMAIL_RESULT"
            java.lang.String r1 = r13.getString(r0)
            java.lang.String r0 = "RECONFIRM_SUCCESS"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x008f
            X.0z4 r0 = r3.A0A
            r10 = 1
            r0.A28(r10)
            X.00H r0 = r3.A05
            if (r0 == 0) goto L_0x0218
            java.lang.Object r4 = r0.get()
            X.9kJ r4 = (X.C190059kJ) r4
            java.lang.String r5 = r3.A0B
            int r7 = r3.A00
            r6 = 0
            r8 = 11
            r9 = 13
            r4.A00(r5, r6, r7, r8, r9, r10)
            X.1KB r2 = r3.A05
            r1 = 29
            X.4rM r0 = new X.4rM
            r0.<init>(r3, r1)
            r2.CGP(r0)
            return
        L_0x008f:
            java.lang.String r0 = "REMOVE_EMAIL"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x000c
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x0215
            java.lang.Object r2 = r0.get()
            X.9uY r2 = (X.C196159uY) r2
            X.4ms r1 = new X.4ms
            r1.<init>(r3, r4)
            java.lang.String r0 = ""
            r2.A03(r1, r0, r4)
            return
        L_0x00ac:
            java.lang.Object r1 = r11.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            java.lang.String r2 = "request_bottom_sheet_fragment"
            boolean r0 = r2.equals(r12)
            if (r0 == 0) goto L_0x00bb
            X.AnonymousClass4aY.A0r(r1)
        L_0x00bb:
            X.1FY r1 = X.AnonymousClass3MW.A0P(r1)
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x000c
            X.1GP r0 = r1.getSupportFragmentManager()
            goto L_0x0250
        L_0x00cd:
            java.lang.Object r4 = r11.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            java.lang.String r0 = "dialogAction"
            int r2 = r13.getInt(r0)
            if (r2 < 0) goto L_0x000c
            X.0z2 r1 = X.C82894Co.A00
            int r0 = r1.size()
            r3 = 1
            int r0 = r0 - r3
            if (r2 > r0) goto L_0x000c
            java.lang.Object r1 = r1.get(r2)
            X.4Co r0 = X.C82894Co.SELF_DEMOTE
            if (r1 != r0) goto L_0x000c
            java.lang.String r0 = "parentGroupJid"
            android.os.Parcelable r2 = r13.getParcelable(r0)
            X.1EC r2 = (X.AnonymousClass1EC) r2
            X.C17960vV.A07(r2)
            X.5Z1 r1 = r4.A1o
            X.1FY r0 = X.AnonymousClass3MW.A0P(r4)
            X.4XS r1 = r1.BGK(r0, r2, r3)
            X.5cQ r0 = r4.A2Q
            X.11S r0 = r0.getMeManager()
            goto L_0x0139
        L_0x0107:
            java.lang.Object r3 = r11.A01
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            java.lang.String r0 = "dialogAction"
            int r1 = r13.getInt(r0)
            if (r1 < 0) goto L_0x000c
            X.4Co[] r0 = X.C82894Co.values()
            int r0 = r0.length
            r2 = 1
            int r0 = r0 - r2
            if (r1 > r0) goto L_0x000c
            X.4Co[] r0 = X.C82894Co.values()
            r1 = r0[r1]
            X.4Co r0 = X.C82894Co.SELF_DEMOTE
            if (r1 != r0) goto L_0x000c
            java.lang.String r0 = "parentGroupJid"
            android.os.Parcelable r1 = r13.getParcelable(r0)
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.C17960vV.A07(r1)
            X.5Z1 r0 = r3.A0O
            X.4XS r1 = r0.BGK(r3, r1, r2)
            X.11S r0 = r3.A02
        L_0x0139:
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            r1.A01(r0)
            return
        L_0x0141:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A02
            if (r1 == 0) goto L_0x000c
            r0 = 3
            r1.A0W(r0)
            return
        L_0x014e:
            java.lang.Object r1 = r11.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r1
            com.whatsapp.components.MaxHeightLinearLayout r3 = r1.A08
            if (r3 == 0) goto L_0x000c
            r0 = 20
            X.7Pb r2 = new X.7Pb
            r2.<init>(r1, r0)
            r0 = 150(0x96, double:7.4E-322)
            r3.postDelayed(r2, r0)
            return
        L_0x0163:
            java.lang.Object r0 = r11.A01
            com.whatsapp.inappsupport.ui.SupportAiActivity r0 = (com.whatsapp.inappsupport.ui.SupportAiActivity) r0
            com.whatsapp.inappsupport.ui.SupportAiActivity.A0Q(r13, r0)
            return
        L_0x016b:
            java.lang.Object r0 = r11.A01
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            r0.A4b(r13)
            return
        L_0x0173:
            java.lang.Object r0 = r11.A01
            com.whatsapp.group.GroupPermissionsActivity r0 = (com.whatsapp.group.GroupPermissionsActivity) r0
            com.whatsapp.group.GroupPermissionsActivity.A0V(r13, r0)
            return
        L_0x017b:
            java.lang.Object r0 = r11.A01
            com.whatsapp.group.GroupPermissionsActivity r0 = (com.whatsapp.group.GroupPermissionsActivity) r0
            com.whatsapp.group.GroupPermissionsActivity.A0Q(r13, r0)
            return
        L_0x0183:
            java.lang.Object r0 = r11.A01
            com.whatsapp.group.GroupPermissionsActivity r0 = (com.whatsapp.group.GroupPermissionsActivity) r0
            com.whatsapp.group.GroupPermissionsActivity.A03(r13, r0)
            return
        L_0x018b:
            java.lang.Object r0 = r11.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x0193:
            java.lang.Object r0 = r11.A01
            com.whatsapp.events.EventInfoBottomSheet r0 = (com.whatsapp.events.EventInfoBottomSheet) r0
            com.whatsapp.events.EventInfoBottomSheet.A00(r13, r0)
            return
        L_0x019b:
            java.lang.Object r0 = r11.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x01a1:
            java.lang.Object r2 = r11.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            java.lang.String r1 = "request_bottom_sheet_fragment"
            boolean r0 = r1.equals(r12)
            if (r0 == 0) goto L_0x01b2
            X.1q2 r0 = r2.A1a
            r0.A01()
        L_0x01b2:
            X.1GP r0 = r2.A1F()
            r0.A0u(r1)
            return
        L_0x01ba:
            java.lang.Object r0 = r11.A01
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity r0 = (com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity) r0
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity.A03(r13, r0)
            return
        L_0x01c2:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r0 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r0
            com.whatsapp.calling.schedulecall.ScheduleCallFragment.A01(r13, r0, r12)
            return
        L_0x01ca:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.dialer.DialerActivity r0 = (com.whatsapp.calling.dialer.DialerActivity) r0
            X.AnonymousClass5W4.A00(r13, r0, r12)
            return
        L_0x01d2:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.dialer.DialerActivity r0 = (com.whatsapp.calling.dialer.DialerActivity) r0
            com.whatsapp.calling.dialer.DialerActivity.A0Q(r13, r0, r12)
            return
        L_0x01da:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.callhistory.calllog.CallLogActivityV2 r0 = (com.whatsapp.calling.callhistory.calllog.CallLogActivityV2) r0
            com.whatsapp.calling.callhistory.calllog.CallLogActivityV2.A03(r13, r0, r12)
            return
        L_0x01e2:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            r0.A4b(r12, r13)
            return
        L_0x01ea:
            java.lang.Object r0 = r11.A01
            X.1OS r0 = (X.AnonymousClass1OS) r0
            r0.invoke(r12, r13)
            return
        L_0x01f2:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1G4 r2 = r1.A0K
        L_0x01f8:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.4Zf r0 = (X.C88324Zf) r0
            java.lang.String r7 = r0.A03
            long r8 = r0.A00
            java.lang.Integer r6 = r0.A02
            r10 = 1
            X.4Zf r4 = new X.4Zf
            r4.<init>(r5, r6, r7, r8, r10)
            boolean r0 = r2.BFK(r1, r4)
            if (r0 == 0) goto L_0x01f8
            com.whatsapp.events.EventCreateOrEditFragment.A08(r3, r5)
            return
        L_0x0215:
            java.lang.String r0 = "emailVerificationXmppMethods"
            goto L_0x021a
        L_0x0218:
            java.lang.String r0 = "emailVerificationLogger"
        L_0x021a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x021f:
            java.lang.Object r3 = r11.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            java.lang.String r2 = "request_bottom_sheet_fragment"
            boolean r0 = r2.equals(r12)
            if (r0 == 0) goto L_0x024c
            X.12E r1 = r3.A0j
            r0 = 0
            r1.A0D(r0)
            X.00H r0 = r3.A1k
            goto L_0x0249
        L_0x0234:
            java.lang.Object r3 = r11.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            java.lang.String r2 = "request_bottom_sheet_fragment"
            boolean r0 = r12.equals(r2)
            if (r0 == 0) goto L_0x024c
            X.12E r1 = r3.A0r
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r1.A0D(r0)
            X.00H r0 = r3.A1e
        L_0x0249:
            X.C72453Mb.A1O(r0)
        L_0x024c:
            X.1GP r0 = r3.getSupportFragmentManager()
        L_0x0250:
            r0.A0u(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91374fa.Bv0(java.lang.String, android.os.Bundle):void");
    }
}
