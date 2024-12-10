package X;

/* renamed from: X.4nc  reason: invalid class name and case insensitive filesystem */
public class C96294nc implements AnonymousClass3L6 {
    public final int A00;
    public final Object A01;

    public C96294nc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.3UH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.3UI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.3UH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.3UH} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f4, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f6, code lost:
        r1.invalidateOptionsMenu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0247, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0254, code lost:
        X.AnonymousClass3MX.A1Q(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0257, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        X.C98834rn.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BvL(X.AnonymousClass1BI r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x01fa;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01c0;
                case 3: goto L_0x01b3;
                case 4: goto L_0x0106;
                case 5: goto L_0x016a;
                case 6: goto L_0x0158;
                case 7: goto L_0x0124;
                case 8: goto L_0x00f1;
                case 9: goto L_0x00d3;
                case 10: goto L_0x00bf;
                case 11: goto L_0x00a8;
                case 12: goto L_0x0094;
                case 13: goto L_0x007c;
                case 14: goto L_0x0064;
                case 15: goto L_0x0054;
                case 16: goto L_0x0035;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r6.A01
            X.3Vb r3 = (X.C73363Vb) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            if (r7 == 0) goto L_0x0034
            X.1EC r2 = r3.A07
            if (r2 == 0) goto L_0x0034
            X.1kb r0 = r3.A05
            X.1EC r1 = r0.A04(r2)
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x0034
        L_0x0025:
            X.3TB r1 = r3.A06
            X.1DT r0 = r3.A03
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.C72463Mc.A1Y(r0)
            r1.A0G(r2, r0)
        L_0x0034:
            return
        L_0x0035:
            java.lang.Object r2 = r6.A01
            com.whatsapp.group.HistorySettingViewModel r2 = (com.whatsapp.group.HistorySettingViewModel) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            if (r7 == 0) goto L_0x0034
            X.1EC r0 = r2.A01
            boolean r1 = r7.equals(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0034
            X.1OX r3 = X.C41561wd.A00(r2)
            r0 = 0
            com.whatsapp.group.HistorySettingViewModel$updateChecked$1 r1 = new com.whatsapp.group.HistorySettingViewModel$updateChecked$1
            r1.<init>(r2, r0)
            goto L_0x0254
        L_0x0054:
            java.lang.Object r1 = r6.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.1EC r0 = r1.A1K
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0034
            com.whatsapp.group.GroupChatInfoActivity.A1A(r1)
            return
        L_0x0064:
            java.lang.Object r1 = r6.A01
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            X.1EC r0 = r1.A0E
            X.C17960vV.A07(r0)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0034
            com.whatsapp.group.GroupAdminPickerActivity.A0V(r1)
            java.lang.String r0 = r1.A0I
            com.whatsapp.group.GroupAdminPickerActivity.A0c(r1, r0)
            return
        L_0x007c:
            java.lang.Object r3 = r6.A01
            X.3Ub r3 = (X.C73293Ub) r3
            X.1BI r0 = r3.A05
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0034
            X.10s r2 = r3.A06
            r1 = 7
            X.4rL r0 = new X.4rL
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x0094:
            java.lang.Object r2 = r6.A01
            X.3UI r2 = (X.AnonymousClass3UI) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1EC r0 = r2.A03
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0034
            X.10I r1 = r2.A04
            r0 = 3
            goto L_0x00bb
        L_0x00a8:
            java.lang.Object r2 = r6.A01
            X.3UH r2 = (X.AnonymousClass3UH) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1EC r0 = r2.A03
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0034
            X.10I r1 = r2.A04
            r0 = 1
        L_0x00bb:
            X.C98834rn.A00(r1, r2, r0)
            return
        L_0x00bf:
            java.lang.Object r1 = r6.A01
            X.3Ut r1 = (X.AnonymousClass3Ut) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1EC r0 = r1.A08
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0034
            X.AnonymousClass3Ut.A00(r1)
            return
        L_0x00d3:
            java.lang.Object r1 = r6.A01
            X.3ty r1 = (X.C78943ty) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.23z r0 = r1.getFMessage()
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0034
            X.23z r0 = r1.getFMessage()
            X.C78943ty.A02(r1, r0)
            return
        L_0x00f1:
            java.lang.Object r1 = r6.A01
            X.3rV r1 = (X.C77803rV) r1
            X.1BI r0 = r1.A0f
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0034
            X.4SY r0 = r1.A0G
            r0.A01()
            r1.A0I()
            return
        L_0x0106:
            java.lang.Object r1 = r6.A01
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1EC r0 = r1.A03
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "cagJid"
            goto L_0x0247
        L_0x0116:
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0034
            X.3VF r0 = r1.A01
            if (r0 != 0) goto L_0x023e
            java.lang.String r0 = "groupParticipantsViewModel"
            goto L_0x0247
        L_0x0124:
            java.lang.Object r4 = r6.A01
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            X.0vl r1 = r4.A0Q
            X.1EC r3 = X.AnonymousClass3MX.A0p(r1)
            if (r3 == 0) goto L_0x0034
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L_0x0034
            r0 = 2131430029(0x7f0b0a8d, float:1.8481747E38)
            android.view.View r2 = r4.findViewById(r0)
            com.whatsapp.TextEmojiLabel r2 = (com.whatsapp.TextEmojiLabel) r2
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r1.getValue()
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x0034
            X.1MZ r0 = r4.A07
            if (r0 == 0) goto L_0x0245
            boolean r1 = r0.A0K(r1)
            r0 = 1
            if (r1 != r0) goto L_0x0034
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0y(r2, r4, r3)
            return
        L_0x0158:
            java.lang.Object r1 = r6.A01
            X.3Pi r1 = (X.C73123Pi) r1
            if (r7 == 0) goto L_0x0034
            com.whatsapp.jid.GroupJid r0 = r1.A06
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.C73123Pi.A00(r1)
            return
        L_0x016a:
            java.lang.Object r3 = r6.A01
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r3 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1EC r4 = r3.A03
            if (r4 == 0) goto L_0x019e
            boolean r0 = X.C18070vi.A18(r7, r4)
            if (r0 == 0) goto L_0x019e
            X.1vp r2 = r3.A07
            java.lang.Object r0 = r2.A06()
            X.4Za r0 = (X.C88274Za) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x019e
            X.1M9 r0 = r3.A05
            X.1E7 r0 = r0.A0E(r4)
            if (r0 == 0) goto L_0x01b0
            boolean r1 = r0.A0e
            r0 = 1
            if (r1 != r0) goto L_0x01b0
            X.4CR r1 = X.AnonymousClass4CR.EVERYONE
        L_0x0199:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C88274Za.A01(r2, r1, r0)
        L_0x019e:
            X.1EC r2 = r3.A02
            if (r2 == 0) goto L_0x0034
            boolean r0 = X.C18070vi.A18(r7, r2)
            if (r0 == 0) goto L_0x0034
            X.10I r1 = r3.A09
            r0 = 27
            X.C98804rk.A01(r1, r3, r2, r0)
            return
        L_0x01b0:
            X.4CR r1 = X.AnonymousClass4CR.ADMINS
            goto L_0x0199
        L_0x01b3:
            java.lang.Object r1 = r6.A01
            com.whatsapp.community.CommunityNavigationActivity r1 = (com.whatsapp.community.CommunityNavigationActivity) r1
            if (r7 == 0) goto L_0x0034
            X.1EC r0 = r1.A0X
            boolean r0 = r7.equals(r0)
            goto L_0x01f4
        L_0x01c0:
            java.lang.Object r4 = r6.A01
            com.whatsapp.community.CommunityMembersViewModel r4 = (com.whatsapp.community.CommunityMembersViewModel) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1gd r1 = r4.A08
            X.1EC r0 = r4.A0I
            java.util.Set r1 = r1.BP3(r0)
            X.1EC r0 = X.AnonymousClass3MW.A0i(r7)
            boolean r0 = X.C29431cG.A18(r1, r0)
            if (r0 == 0) goto L_0x0034
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A0J
            r1 = 0
            com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1 r0 = new com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x01ea:
            java.lang.Object r1 = r6.A01
            com.whatsapp.community.CommunityHomeActivity r1 = (com.whatsapp.community.CommunityHomeActivity) r1
            X.1EC r0 = r1.A0j
            boolean r0 = r0.equals(r7)
        L_0x01f4:
            if (r0 == 0) goto L_0x0034
            r1.invalidateOptionsMenu()
            return
        L_0x01fa:
            java.lang.Object r2 = r6.A01
            X.4Xp r2 = (X.AnonymousClass4Xp) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            if (r7 == 0) goto L_0x0034
            X.1EC r0 = r2.A0I
            boolean r0 = X.C18070vi.A18(r0, r7)
            if (r0 == 0) goto L_0x024c
            java.util.Iterator r5 = X.AnonymousClass4Xp.A00(r2)
        L_0x0210:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0034
            X.4jh r2 = X.AnonymousClass3MY.A0M(r5)
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0232
            java.lang.Object r4 = r2.A01
            X.3Vg r4 = (X.C73373Vg) r4
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A0U
            r1 = 0
            com.whatsapp.communitymedia.CommunityMediaViewModel$refreshName$1 r0 = new com.whatsapp.communitymedia.CommunityMediaViewModel$refreshName$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            goto L_0x0210
        L_0x0232:
            java.lang.Object r0 = r2.A01
            X.3Uc r0 = (X.AnonymousClass3Uc) r0
            X.10s r1 = r0.A10
            r0 = 31
            X.C98754rf.A00(r1, r2, r0)
            goto L_0x0210
        L_0x023e:
            r0.A0T()
            com.whatsapp.community.communityInfo.CAGInfoViewModel.A03(r1)
            return
        L_0x0245:
            java.lang.String r0 = "groupParticipantsManager"
        L_0x0247:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x024c:
            X.1OX r3 = r2.A0K
            r0 = 0
            com.whatsapp.community.AggregateCommunityObserver$groupDataObserver$1$1$2 r1 = new com.whatsapp.community.AggregateCommunityObserver$groupDataObserver$1$1$2
            r1.<init>(r2, r7, r7, r0)
        L_0x0254:
            X.AnonymousClass3MX.A1Q(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96294nc.BvL(X.1BI):void");
    }
}
