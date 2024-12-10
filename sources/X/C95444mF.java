package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.inappsupport.ui.SupportAiViewModel;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4mF  reason: invalid class name and case insensitive filesystem */
public class C95444mF implements C25231Nk {
    public final int A00;
    public final Object A01;

    public static final synchronized void A00(C95444mF r4, AnonymousClass1BI r5) {
        synchronized (r4) {
            AnonymousClass3Vh r3 = (AnonymousClass3Vh) r4.A01;
            AnonymousClass1DT r2 = r3.A00;
            if ((r2.A06() instanceof C77013oz) && C18070vi.A18(r5, r3.A02.A04(r3.A08))) {
                r2.A0E(C77023p0.A00);
            }
        }
    }

    public C95444mF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void BqF(AnonymousClass1BI r5) {
        switch (this.A00) {
            case 10:
                C17900vP.A0Y(r5, "joinSubgroup/onConversationAdded/", AnonymousClass000.A10());
                if (r5 instanceof AnonymousClass1EC) {
                    C41111vp r2 = ((AnonymousClass3VM) this.A01).A0d;
                    int A0A = C72463Mc.A0A(r2);
                    if (A0A == 2 || A0A == 6) {
                        AnonymousClass3MX.A1K(r2, 4);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                Log.i("newgroup/onConversationAdded");
                NewGroup newGroup = (NewGroup) this.A01;
                C19760yx r0 = newGroup.A05;
                if (r0 != null && r0.A00.equals(r5)) {
                    Log.i("newgroup/onConversationAdded/processing runAfterTempConversationAddedToDb");
                    ((Runnable) newGroup.A05.A01).run();
                    newGroup.A05 = null;
                    return;
                }
                return;
            case 16:
                C18070vi.A0d(r5, 0);
                SupportAiViewModel supportAiViewModel = (SupportAiViewModel) this.A01;
                if (r5.equals(supportAiViewModel.A00)) {
                    supportAiViewModel.A04.A0J(new C146507Pj(supportAiViewModel, this, 20));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r3 = new X.C146507Pj(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r1 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        r3 = new X.AnonymousClass7R9((java.lang.Object) r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012f, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0132, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BqG(X.AnonymousClass1BI r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x010b;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00d8;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x00bb;
                case 13: goto L_0x00a5;
                case 14: goto L_0x008c;
                case 15: goto L_0x0066;
                case 16: goto L_0x0005;
                case 17: goto L_0x0046;
                case 18: goto L_0x002d;
                case 19: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.Object r1 = r5.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r1
            X.1BI r0 = r1.A05
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.preference.WaMuteSettingPreference r0 = r1.A07
            if (r0 == 0) goto L_0x0021
            X.4RZ r0 = r0.A04
            if (r0 == 0) goto L_0x0021
            r0.A00()
        L_0x0021:
            com.whatsapp.preference.WaMuteSettingPreference r0 = r1.A06
            if (r0 == 0) goto L_0x0005
            X.4RZ r0 = r0.A04
            if (r0 == 0) goto L_0x0005
            r0.A00()
            return
        L_0x002d:
            java.lang.Object r1 = r5.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.1ch r0 = r1.A4m()
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r1.A05
            r0 = 15
            X.Ail r3 = new X.Ail
            r3.<init>(r1, r0)
            goto L_0x012f
        L_0x0046:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationChanged/"
            X.C17900vP.A0Y(r6, r0, r1)
            java.lang.Object r1 = r5.A01
            com.whatsapp.invites.ViewGroupInviteActivity r1 = (com.whatsapp.invites.ViewGroupInviteActivity) r1
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0S
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x0005
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r1.A05
            r0 = 28
            goto L_0x0085
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "newgroup/onConversationChanged/"
            X.C17900vP.A0Y(r6, r0, r1)
            java.lang.Object r1 = r5.A01
            com.whatsapp.group.newgroup.NewGroup r1 = (com.whatsapp.group.newgroup.NewGroup) r1
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0y
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x0005
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r1.A05
            r0 = 10
        L_0x0085:
            X.7Pj r3 = new X.7Pj
            r3.<init>(r5, r2, r0)
            goto L_0x012f
        L_0x008c:
            if (r6 == 0) goto L_0x0005
            java.lang.Object r1 = r5.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.1EC r0 = r1.A1K
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r1.A05
            r0 = 19
            X.Aik r3 = new X.Aik
            r3.<init>(r5, r0)
            goto L_0x012f
        L_0x00a5:
            if (r6 == 0) goto L_0x0005
            java.lang.Object r1 = r5.A01
            com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel r1 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r1
            X.1EC r0 = r1.A01
            if (r0 == 0) goto L_0x0005
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1Dg r0 = r1.A02
            X.C72463Mc.A1B(r0)
            return
        L_0x00bb:
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.Object r1 = r5.A01
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            X.1EC r0 = r1.A03
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "cagJid"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00ce:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.community.communityInfo.CAGInfoViewModel.A03(r1)
            return
        L_0x00d8:
            java.lang.Object r1 = r5.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.1E7 r0 = r1.A0z
            if (r0 == 0) goto L_0x0005
            if (r6 == 0) goto L_0x0005
            com.whatsapp.jid.UserJid r0 = r1.A4l()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r1.A05
            r0 = 39
            goto L_0x0105
        L_0x00f1:
            if (r6 == 0) goto L_0x0005
            java.lang.Object r1 = r5.A01
            X.3o2 r1 = (X.C76733o2) r1
            X.1BI r0 = r1.A4c()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r1.A05
            r0 = 35
        L_0x0105:
            X.7R9 r3 = new X.7R9
            r3.<init>((java.lang.Object) r5, (int) r0)
            goto L_0x012f
        L_0x010b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "acceptlink/onConversationChanged/"
            X.C17900vP.A0Y(r6, r0, r1)
            java.lang.Object r2 = r5.A01
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0O
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x0005
            X.1KB r4 = r2.A05
            r0 = 30
            X.3C0 r3 = new X.3C0
            r3.<init>(r5, r1, r0)
        L_0x012f:
            r4.A0J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95444mF.BqG(X.1BI):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BqJ(X.AnonymousClass1BI r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 2: goto L_0x00c9;
                case 3: goto L_0x00f6;
                case 4: goto L_0x00b2;
                case 5: goto L_0x009b;
                case 6: goto L_0x0005;
                case 7: goto L_0x0069;
                case 8: goto L_0x0005;
                case 9: goto L_0x00e5;
                case 10: goto L_0x0053;
                case 11: goto L_0x0005;
                case 12: goto L_0x0034;
                case 13: goto L_0x0005;
                case 14: goto L_0x002c;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r4.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.1ch r0 = r1.A4m()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A0H
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0005
            X.AnonymousClass3MY.A1Q(r1)
            android.content.Intent r0 = X.C72473Md.A09(r1)
            X.C18070vi.A0X(r0)
            r1.startActivity(r0)
            return
        L_0x002c:
            java.lang.Object r1 = r4.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.1EC r0 = r1.A1K
            goto L_0x00d1
        L_0x0034:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r4.A01
            com.whatsapp.community.communityInfo.CAGInfoViewModel r1 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r1
            X.1EC r0 = r1.A03
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "cagJid"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0047:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.1wy r0 = r1.A0K
            X.C72463Mc.A1B(r0)
            return
        L_0x0053:
            boolean r0 = r5 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r4.A01
            X.3VM r0 = (X.AnonymousClass3VM) r0
            X.1vp r2 = r0.A0d
            int r1 = X.C72463Mc.A0A(r2)
            r0 = 4
            if (r1 != r0) goto L_0x0005
            r0 = 2
            X.AnonymousClass3MX.A1K(r2, r0)
            return
        L_0x0069:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r4.A01
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r1 = (com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet) r1
            X.0vl r0 = r1.A0O
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 2131888541(0x7f12099d, float:1.941172E38)
            java.lang.String r2 = X.AnonymousClass3MY.A0n(r1, r0)
            r1.A28()
            X.1FL r1 = r1.A1B()
            boolean r0 = r1 instanceof X.AnonymousClass5X8
            if (r0 == 0) goto L_0x0005
            X.5X8 r1 = (X.AnonymousClass5X8) r1
            if (r1 == 0) goto L_0x0005
            com.whatsapp.Conversation r1 = (com.whatsapp.Conversation) r1
            X.4aY r0 = r1.A03
            r0.A3D(r2)
            return
        L_0x009b:
            java.lang.Object r1 = r4.A01
            com.whatsapp.community.CommunityNavigationActivity r1 = (com.whatsapp.community.CommunityNavigationActivity) r1
            X.1EC r0 = r1.A0X
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 2131888541(0x7f12099d, float:1.941172E38)
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.community.CommunityNavigationActivity.A03(r1, r0)
            return
        L_0x00b2:
            java.lang.Object r1 = r4.A01
            com.whatsapp.community.CommunityHomeActivity r1 = (com.whatsapp.community.CommunityHomeActivity) r1
            X.1EC r0 = r1.A0j
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 2131888541(0x7f12099d, float:1.941172E38)
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.community.CommunityHomeActivity.A0Q(r1, r0)
            return
        L_0x00c9:
            java.lang.Object r1 = r4.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            com.whatsapp.jid.UserJid r0 = r1.A4l()
        L_0x00d1:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A0H
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0005
            android.content.Intent r0 = X.C72473Md.A09(r1)
            r1.startActivity(r0)
            return
        L_0x00e5:
            java.lang.Object r0 = r4.A01
            X.3VJ r0 = (X.AnonymousClass3VJ) r0
            X.1KB r2 = r0.A01
            r1 = 17
            X.4rk r0 = new X.4rk
            r0.<init>(r4, r5, r1)
            r2.CGP(r0)
            return
        L_0x00f6:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r3 = r4.A01
            X.4Xp r3 = (X.AnonymousClass4Xp) r3
            X.1OX r2 = r3.A0K
            r1 = 0
            com.whatsapp.community.AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1 r0 = new com.whatsapp.community.AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1
            r0.<init>(r3, r5, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95444mF.BqJ(X.1BI):void");
    }

    public /* synthetic */ void BqK(AnonymousClass1BI r2) {
        if (6 - this.A00 == 0) {
            C18070vi.A0d(r2, 0);
            A00(this, r2);
        }
    }

    public /* synthetic */ void BqN(int i) {
        if (8 - this.A00 == 0) {
            AnonymousClass4ZH.A00((AnonymousClass4ZH) this.A01);
        }
    }

    public void BqO() {
        AnonymousClass1KB r4;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A01;
                Object obj = acceptInviteLinkActivity.A0O.get();
                C17900vP.A0Y(obj, "acceptlink/onConversationsListChanged ", AnonymousClass000.A10());
                if (obj != null) {
                    r4 = acceptInviteLinkActivity.A05;
                    runnable = new AnonymousClass3C0(this, obj, 31);
                    break;
                } else {
                    return;
                }
            case 11:
                Log.i("NewCommunityActivity/onConversationsListChanged/");
                NewCommunityActivity newCommunityActivity = (NewCommunityActivity) this.A01;
                Object obj2 = newCommunityActivity.A0T.get();
                if (obj2 != null) {
                    r4 = newCommunityActivity.A05;
                    runnable = new C98804rk(this, obj2, 23);
                    break;
                } else {
                    return;
                }
            case 15:
                Log.i("newgroup/onConversationsListChanged");
                NewGroup newGroup = (NewGroup) this.A01;
                Object obj3 = newGroup.A0y.get();
                if (obj3 != null) {
                    r4 = newGroup.A05;
                    runnable = new C146507Pj(newGroup, obj3, 9);
                    break;
                } else {
                    return;
                }
            case 17:
                Log.i("ViewGroupInviteActivity/onConversationsListChanged");
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A01;
                Object obj4 = viewGroupInviteActivity.A0S.get();
                if (obj4 != null) {
                    r4 = viewGroupInviteActivity.A05;
                    runnable = new C146507Pj(this, obj4, 29);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r4.A0J(runnable);
    }

    public /* synthetic */ void BqI(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqH(AnonymousClass1BI r1, boolean z) {
    }
}
