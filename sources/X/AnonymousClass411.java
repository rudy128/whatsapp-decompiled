package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$parentGroupObserver$1$onSuggestedGroupsChanged$1;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.GroupJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.411  reason: invalid class name */
public class AnonymousClass411 extends C34201k6 {
    public final int A00;
    public final Object A01;

    public AnonymousClass411(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        if (3 - this.A00 != 0) {
            super.A00();
        } else {
            C98754rf.A00(((AnonymousClass3VJ) this.A01).A0P, this, 37);
        }
    }

    public void A01() {
        if (this.A00 != 0) {
            super.A01();
            return;
        }
        Iterator A002 = AnonymousClass4Xp.A00((AnonymousClass4Xp) this.A01);
        while (A002.hasNext()) {
            C93884jh A0M = AnonymousClass3MY.A0M(A002);
            if (A0M.A00 == 0) {
                C98754rf.A00(((AnonymousClass3Uc) A0M.A01).A10, A0M, 25);
            }
        }
    }

    public void A02() {
        if (3 - this.A00 != 0) {
            super.A02();
        } else {
            C98754rf.A00(((AnonymousClass3VJ) this.A01).A0P, this, 38);
        }
    }

    public void A03(GroupJid groupJid) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(groupJid, 0);
                AnonymousClass4Xp r1 = (AnonymousClass4Xp) this.A01;
                if (C18070vi.A18(r1.A0I, groupJid)) {
                    Iterator A002 = AnonymousClass4Xp.A00(r1);
                    while (A002.hasNext()) {
                        C93884jh A0M = AnonymousClass3MY.A0M(A002);
                        int i = A0M.A00;
                        Object obj = A0M.A01;
                        if (i != 0) {
                            C73373Vg.A03((C73373Vg) obj);
                        } else {
                            C98754rf.A00(((AnonymousClass3Uc) obj).A10, A0M, 29);
                        }
                    }
                    return;
                }
                return;
            case 3:
                ((AnonymousClass3VJ) this.A01).A0P.execute(new C98804rk(this, groupJid, 14));
                return;
            case 4:
                C18070vi.A0d(groupJid, 0);
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
                if (groupJid.equals(memberSuggestedGroupsManagementViewModel.A06)) {
                    MemberSuggestedGroupsManagementViewModel.A06(memberSuggestedGroupsManagementViewModel);
                    return;
                }
                return;
            case 5:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                if (groupJid.equals(groupChatInfoActivity.A1L)) {
                    GroupChatInfoActivity.A1B(groupChatInfoActivity);
                    GroupChatInfoActivity.A1C(groupChatInfoActivity);
                    return;
                }
                return;
            default:
                super.A03(groupJid);
                return;
        }
    }

    public void A04(GroupJid groupJid) {
        switch (this.A00) {
            case 0:
                AnonymousClass4Xp r1 = (AnonymousClass4Xp) this.A01;
                if (C18070vi.A18(r1.A0I, groupJid)) {
                    Iterator A002 = AnonymousClass4Xp.A00(r1);
                    while (A002.hasNext()) {
                        C93884jh A0M = AnonymousClass3MY.A0M(A002);
                        if (A0M.A00 == 0) {
                            AnonymousClass3Uc r2 = (AnonymousClass3Uc) A0M.A01;
                            C98754rf.A00(r2.A10, r2, 18);
                        }
                    }
                    return;
                }
                return;
            case 4:
                MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
                AnonymousClass3MW.A1X(memberSuggestedGroupsManagementViewModel.A07, new MemberSuggestedGroupsManagementViewModel$parentGroupObserver$1$onSuggestedGroupsChanged$1(memberSuggestedGroupsManagementViewModel, (C30391dr) null), C41561wd.A00(memberSuggestedGroupsManagementViewModel));
                return;
            default:
                super.A04(groupJid);
                return;
        }
    }

    public void A05(GroupJid groupJid, GroupJid groupJid2) {
        switch (this.A00) {
            case 0:
                AnonymousClass4Xp r1 = (AnonymousClass4Xp) this.A01;
                if (C18070vi.A18(r1.A0I, groupJid)) {
                    Iterator A002 = AnonymousClass4Xp.A00(r1);
                    while (A002.hasNext()) {
                        C93884jh A0M = AnonymousClass3MY.A0M(A002);
                        if (A0M.A00 == 0) {
                            AnonymousClass3Uc r3 = (AnonymousClass3Uc) A0M.A01;
                            r3.A10.execute(new C98804rk(r3, groupJid2, 11));
                        }
                    }
                    return;
                }
                return;
            case 5:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                if (groupJid.equals(groupChatInfoActivity.A1L) && groupJid2.equals(groupChatInfoActivity.A1K)) {
                    C110885hR.A0A(groupChatInfoActivity, 2131432025).setVisibility(8);
                    groupChatInfoActivity.A1g.A04(8);
                    return;
                }
                return;
            default:
                super.A05(groupJid, groupJid2);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.whatsapp.community.CommunityNavigationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.whatsapp.community.CommunityHomeActivity} */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.whatsapp.LegacyMessageDialogFragment, com.whatsapp.Hilt_LegacyMessageDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(com.whatsapp.jid.GroupJid r10, java.util.List r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 1: goto L_0x0018;
                case 2: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A06(r10, r11)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r6 = r9.A01
            com.whatsapp.community.CommunityNavigationActivity r6 = (com.whatsapp.community.CommunityNavigationActivity) r6
            X.1EC r0 = r6.A0X
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.1EC r4 = r6.A0X
            goto L_0x0026
        L_0x0018:
            java.lang.Object r6 = r9.A01
            com.whatsapp.community.CommunityHomeActivity r6 = (com.whatsapp.community.CommunityHomeActivity) r6
            X.1EC r0 = r6.A0j
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.1EC r4 = r6.A0j
        L_0x0026:
            r3 = 0
            r1 = 1
            X.C18070vi.A0d(r4, r1)
            r5 = 2
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0008
            int r0 = r11.size()
            if (r0 == r1) goto L_0x0094
            android.content.res.Resources r3 = r6.getResources()
            if (r0 == r5) goto L_0x008b
            r2 = 2131893498(0x7f121cfa, float:1.9421774E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.C72473Md.A1O(r11, r1)
            int r0 = X.AnonymousClass3MX.A02(r11, r5)
            X.C17880vN.A1T(r1, r0, r5)
        L_0x004e:
            java.lang.String r8 = r3.getString(r2, r1)
        L_0x0052:
            X.C18070vi.A0X(r8)
            r0 = 7
            X.4bC r7 = new X.4bC
            r7.<init>((java.lang.Object) r6, (java.lang.Object) r4, (int) r0)
            r0 = 14
            X.74q r5 = new X.74q
            r5.<init>(r0)
            r4 = 2131893495(0x7f121cf7, float:1.9421768E38)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            com.whatsapp.LegacyMessageDialogFragment r2 = new com.whatsapp.LegacyMessageDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "primary_action_text_id_res"
            r1.putInt(r0, r4)
            java.lang.String r0 = "secondary_action_text_res"
            r1.putInt(r0, r3)
            java.lang.String r0 = "message"
            r1.putCharSequence(r0, r8)
            r2.A00 = r7
            r2.A01 = r5
            r2.A1R(r1)
            r6.CMl(r2)
            return
        L_0x008b:
            r2 = 2131893497(0x7f121cf9, float:1.9421772E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.C72473Md.A1O(r11, r1)
            goto L_0x004e
        L_0x0094:
            r2 = 2131893496(0x7f121cf8, float:1.942177E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r11.get(r3)
            java.lang.String r8 = X.C17880vN.A0q(r6, r0, r1, r3, r2)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass411.A06(com.whatsapp.jid.GroupJid, java.util.List):void");
    }

    public void A07(GroupJid groupJid, List list) {
        if (4 - this.A00 != 0) {
            super.A07(groupJid, list);
            return;
        }
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
        if (C18070vi.A18(groupJid, memberSuggestedGroupsManagementViewModel.A06)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (Object A1P : list) {
                C17880vN.A1P(A1P, linkedHashMap, 2);
            }
            MemberSuggestedGroupsManagementViewModel.A07(memberSuggestedGroupsManagementViewModel, linkedHashMap);
        }
    }

    public void A08(GroupJid groupJid, List list) {
        if (4 - this.A00 != 0) {
            super.A08(groupJid, list);
            return;
        }
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
        if (C18070vi.A18(groupJid, memberSuggestedGroupsManagementViewModel.A06)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (Object A1P : list) {
                C17880vN.A1P(A1P, linkedHashMap, 4);
            }
            MemberSuggestedGroupsManagementViewModel.A07(memberSuggestedGroupsManagementViewModel, linkedHashMap);
        }
    }

    public void A09(GroupJid groupJid, List list) {
        if (4 - this.A00 != 0) {
            super.A09(groupJid, list);
            return;
        }
        MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel = (MemberSuggestedGroupsManagementViewModel) this.A01;
        if (C18070vi.A18(groupJid, memberSuggestedGroupsManagementViewModel.A06)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (Object A1P : list) {
                C17880vN.A1P(A1P, linkedHashMap, 3);
            }
            MemberSuggestedGroupsManagementViewModel.A07(memberSuggestedGroupsManagementViewModel, linkedHashMap);
        }
    }
}
