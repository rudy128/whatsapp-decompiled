package X;

import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.community.AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1;
import com.whatsapp.community.AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.group.HistorySettingViewModel$updateEnabled$1;

/* renamed from: X.4ne  reason: invalid class name and case insensitive filesystem */
public class C96314ne implements C25221Nj {
    public final int A00;
    public final Object A01;

    public C96314ne(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0137, code lost:
        r3.CGF(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BvO(java.util.Set r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x011d;
                case 1: goto L_0x0115;
                case 2: goto L_0x007f;
                case 3: goto L_0x0005;
                case 4: goto L_0x0108;
                case 5: goto L_0x0129;
                case 6: goto L_0x0005;
                case 7: goto L_0x0051;
                case 8: goto L_0x0005;
                case 9: goto L_0x0100;
                case 10: goto L_0x0005;
                case 11: goto L_0x0100;
                case 12: goto L_0x00f8;
                case 13: goto L_0x00f0;
                case 14: goto L_0x00e6;
                case 15: goto L_0x00df;
                case 16: goto L_0x00d5;
                case 17: goto L_0x0031;
                case 18: goto L_0x00c4;
                case 19: goto L_0x00ba;
                case 20: goto L_0x0021;
                case 21: goto L_0x0005;
                case 22: goto L_0x00b2;
                case 23: goto L_0x0006;
                case 24: goto L_0x0100;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r1 = r6.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            X.1BI r0 = r1.A00
            boolean r0 = X.C29431cG.A18(r7, r0)
            if (r0 == 0) goto L_0x0005
            X.10I r3 = r1.A08
            r0 = 40
            X.4ro r2 = new X.4ro
            r2.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x0137
        L_0x0021:
            java.lang.Object r1 = r6.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.1EC r0 = r1.A1K
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.group.GroupChatInfoActivity.A19(r1)
            return
        L_0x0031:
            java.lang.Object r5 = r6.A01
            X.3VA r5 = (X.AnonymousClass3VA) r5
            X.1G1 r0 = r5.A0R
            java.lang.Object r0 = r0.getValue()
            X.4Yc r0 = (X.C88044Yc) r0
            X.1E7 r4 = r0.A02
            if (r4 == 0) goto L_0x0005
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0G
            r1 = 0
            com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1 r0 = new com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1
            r0.<init>(r5, r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0051:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r7)
            java.lang.Object r4 = r6.A01
            com.whatsapp.community.CommunityMembersViewModel r4 = (com.whatsapp.community.CommunityMembersViewModel) r4
            X.1gd r1 = r4.A08
            X.1EC r0 = r4.A0I
            java.util.Set r0 = r1.BP3(r0)
            r2.retainAll(r0)
            boolean r0 = X.C17880vN.A1X(r2)
            if (r0 == 0) goto L_0x0005
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A0J
            r1 = 0
            com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1 r0 = new com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x007f:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r3 = r6.A01
            X.4Wx r3 = (X.C87774Wx) r3
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0092
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0092
            return
        L_0x0092:
            java.util.Iterator r2 = r7.iterator()
        L_0x0096:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.1BI r1 = X.C17880vN.A0Q(r2)
            r0 = 1
            boolean r0 = X.C87774Wx.A00(r3, r1, r0)
            if (r0 == 0) goto L_0x0096
            X.0vk r0 = r3.A00
            if (r0 != 0) goto L_0x0125
            java.lang.String r0 = "updateContact"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00b2:
            java.lang.Object r0 = r6.A01
            com.whatsapp.profile.ViewProfilePhoto r0 = (com.whatsapp.profile.ViewProfilePhoto) r0
            com.whatsapp.profile.ViewProfilePhoto.A03(r0)
            return
        L_0x00ba:
            java.lang.Object r1 = r6.A01
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            java.lang.String r0 = r1.A0I
            com.whatsapp.group.GroupAdminPickerActivity.A0c(r1, r0)
            return
        L_0x00c4:
            java.lang.Object r0 = r6.A01
            X.3Ub r0 = (X.C73293Ub) r0
            X.10s r2 = r0.A06
            r1 = 9
            X.4rL r0 = new X.4rL
            r0.<init>(r6, r1)
            r2.execute(r0)
            return
        L_0x00d5:
            java.lang.Object r0 = r6.A01
            X.3vF r0 = (X.C79333vF) r0
            X.5cH r0 = r0.A04
            r0.notifyDataSetChanged()
            return
        L_0x00df:
            java.lang.Object r0 = r6.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r0
            android.widget.BaseAdapter r0 = r0.A01
            goto L_0x00ec
        L_0x00e6:
            java.lang.Object r0 = r6.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r0 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r0
            X.3Ot r0 = r0.A0A
        L_0x00ec:
            r0.notifyDataSetChanged()
            return
        L_0x00f0:
            java.lang.Object r0 = r6.A01
            X.3hT r0 = (X.C75423hT) r0
            X.C75423hT.A00(r0)
            return
        L_0x00f8:
            java.lang.Object r0 = r6.A01
            X.3hU r0 = (X.C75433hU) r0
            r0.A0I()
            return
        L_0x0100:
            java.lang.Object r0 = r6.A01
            X.3gf r0 = (X.AnonymousClass3gf) r0
            r0.A4r()
            return
        L_0x0108:
            java.lang.Object r1 = r6.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.3oT r0 = r1.A0k
            r0.A0V()
            r1.A2X()
            return
        L_0x0115:
            java.lang.Object r0 = r6.A01
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            com.whatsapp.calling.callhistory.CallLogActivity.A0Q(r0)
            return
        L_0x011d:
            java.lang.Object r0 = r6.A01
            com.whatsapp.biz.BusinessProfileExtraFieldsActivity r0 = (com.whatsapp.biz.BusinessProfileExtraFieldsActivity) r0
            r0.A4b()
            return
        L_0x0125:
            r0.invoke()
            return
        L_0x0129:
            java.lang.Object r0 = r6.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            X.3oR r1 = r0.A08
            X.10I r3 = r1.A0H
            r0 = 0
            X.4rf r2 = new X.4rf
            r2.<init>(r1, r0)
        L_0x0137:
            r3.CGF(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96314ne.BvO(java.util.Set):void");
    }

    public /* synthetic */ void Bxe(AnonymousClass1EC r5) {
        switch (this.A00) {
            case 9:
            case 24:
                ((AnonymousClass3gf) this.A01).A4r();
                return;
            case 10:
                C18070vi.A0d(r5, 0);
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
                if (r5.equals(memberSuggestedGroupsManagementViewModel.A06)) {
                    AnonymousClass3MX.A1Q(new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(memberSuggestedGroupsManagementViewModel, (C30391dr) null), C41561wd.A00(memberSuggestedGroupsManagementViewModel));
                    return;
                }
                return;
            case 21:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A01;
                AnonymousClass3MX.A1Q(new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C30391dr) null), C41561wd.A00(historySettingViewModel));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bxf(AnonymousClass1EC r5) {
        switch (this.A00) {
            case 3:
                ((UpcomingActivityViewModel) this.A01).A04.CGN(new C146427Pb(this, 27));
                return;
            case 6:
                C18070vi.A0d(r5, 0);
                AnonymousClass4Xp r3 = (AnonymousClass4Xp) this.A01;
                AnonymousClass3MX.A1Q(new AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1(r3, r5, (C30391dr) null), r3.A0K);
                return;
            case 8:
                ((AnonymousClass3VJ) this.A01).A0P.execute(new C98804rk(this, r5, 15));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bxg(AnonymousClass1EC r5) {
        switch (this.A00) {
            case 9:
            case 24:
                ((AnonymousClass3gf) this.A01).A4r();
                return;
            case 10:
                C18070vi.A0d(r5, 0);
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
                if (r5.equals(memberSuggestedGroupsManagementViewModel.A06)) {
                    AnonymousClass3MX.A1Q(new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(memberSuggestedGroupsManagementViewModel, (C30391dr) null), C41561wd.A00(memberSuggestedGroupsManagementViewModel));
                    return;
                }
                return;
            case 21:
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A01;
                AnonymousClass3MX.A1Q(new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C30391dr) null), C41561wd.A00(historySettingViewModel));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bxh(AnonymousClass1EC r5) {
        switch (this.A00) {
            case 3:
                ((UpcomingActivityViewModel) this.A01).A04.CGN(new C146427Pb(this, 26));
                return;
            case 6:
                C18070vi.A0d(r5, 0);
                AnonymousClass4Xp r3 = (AnonymousClass4Xp) this.A01;
                AnonymousClass3MX.A1Q(new AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1(r3, r5, (C30391dr) null), r3.A0K);
                return;
            case 8:
                AnonymousClass3VJ r2 = (AnonymousClass3VJ) this.A01;
                if (r2.A0W.get(r5) != null) {
                    C34511kb r1 = r2.A03;
                    C18070vi.A0d(r5, 0);
                    if (r1.A08(r5).size() <= 0 && AnonymousClass3VJ.A05(r2, r5)) {
                        C98754rf.A00(r2.A0P, this, 39);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BvN(AnonymousClass1E9 r1) {
    }

    public /* synthetic */ void Bxd(AnonymousClass1EC r1) {
    }
}
