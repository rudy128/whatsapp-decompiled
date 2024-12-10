package X;

import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onDisplayNameChanged$1;
import com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onProfilePhotoChanged$1;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.events.EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsPrivacy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4kA  reason: invalid class name and case insensitive filesystem */
public class C94174kA implements C23581Gv, C23971Ii {
    public final int A00;
    public final Object A01;

    public static Object A00(C94174kA r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return r1.A01;
    }

    public C94174kA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bkk(UserJid userJid) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(userJid, 0);
                C87774Wx r2 = (C87774Wx) this.A01;
                if (C87774Wx.A00(r2, userJid, false)) {
                    C18090vk r0 = r2.A00;
                    if (r0 == null) {
                        C18070vi.A11("updateContact");
                        throw null;
                    } else {
                        r0.invoke();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) A00(this, userJid);
                AnonymousClass3MW.A1X(communityMembersViewModel.A0J, new CommunityMembersViewModel$contactObserver$1$onAboutMessageChanged$1(communityMembersViewModel, userJid, (C30391dr) null), C41561wd.A00(communityMembersViewModel));
                return;
            case 4:
                C73293Ub r1 = (C73293Ub) this.A01;
                if (C42171xk.A00(userJid, r1.A05)) {
                    r1.A0U();
                    return;
                }
                return;
            case 6:
                ConversationsSuggestedContactsViewModel.A00((ConversationsSuggestedContactsViewModel) A00(this, userJid), userJid);
                return;
            case 8:
                AnonymousClass3VF r22 = (AnonymousClass3VF) this.A01;
                AnonymousClass3VF.A00(new C133356oc(r22.A01.A0H(userJid)), r22);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bm3() {
    }

    public /* synthetic */ void Bmh(Collection collection) {
        switch (this.A00) {
            case 4:
                for (Object next : collection) {
                    C73293Ub r1 = (C73293Ub) this.A01;
                    if (C42171xk.A00(next, r1.A05)) {
                        C72463Mc.A1B(r1.A07);
                        return;
                    }
                }
                return;
            case 6:
                ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = (ConversationsSuggestedContactsViewModel) A00(this, collection);
                if (conversationsSuggestedContactsViewModel.A01 == AnonymousClass00R.A0N) {
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next2 : collection) {
                        if (C72463Mc.A1U((UserJid) next2, conversationsSuggestedContactsViewModel.A0H)) {
                            A13.add(next2);
                        }
                    }
                    ArrayList A0D = C29351c6.A0D(A13);
                    Iterator it = A13.iterator();
                    while (it.hasNext()) {
                        A0D.add(C17880vN.A0S(it).getRawString());
                    }
                    ConversationsSuggestedContactsViewModel.A03(conversationsSuggestedContactsViewModel, C29431cG.A12(A0D));
                    return;
                }
                return;
            case 9:
                SettingsPrivacy settingsPrivacy = (SettingsPrivacy) this.A01;
                settingsPrivacy.A17 = true;
                Set set = settingsPrivacy.A15;
                set.clear();
                set.addAll(AnonymousClass3MW.A0V(settingsPrivacy.A0m).A0B());
                settingsPrivacy.A17 = false;
                C98844ro.A00(settingsPrivacy.A05, settingsPrivacy, 11);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bpv() {
    }

    public void Bq0(Collection collection) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(collection, 0);
                C87774Wx r4 = (C87774Wx) this.A01;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1BI A0l = C72453Mb.A0l(it);
                        if (A0l != null && C87774Wx.A00(r4, A0l, false)) {
                            C18090vk r0 = r4.A00;
                            if (r0 == null) {
                                C18070vi.A11("updateContact");
                                throw null;
                            } else {
                                r0.invoke();
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            case 3:
                Iterator it2 = collection.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    GroupJid A0a = AnonymousClass3MY.A0a(C17880vN.A0O(it2));
                    if (A0a != null) {
                        AnonymousClass3VJ r42 = (AnonymousClass3VJ) this.A01;
                        AnonymousClass1CJ r2 = r42.A0B;
                        if (r2.A06(A0a) == 1) {
                            C29691ci A002 = AnonymousClass1CJ.A00(r2, A0a);
                            C42211xo r22 = r42.A0M;
                            if (A002 != null) {
                                int i = A002.A03;
                                if ((i == 1 || i == 3) && r22.A00(r22.A00.A0H(A002.A08()))) {
                                    r42.A04.A01.add(A0a);
                                    Map map = r42.A0V;
                                    if (map.get(A002) == null) {
                                        map.put(A002, Collections.emptyList());
                                    }
                                    z = true;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                AnonymousClass3VJ.A04((AnonymousClass3VJ) this.A01, z);
                return;
            case 5:
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    AnonymousClass1BI A0l2 = C72453Mb.A0l(it3);
                    if (A0l2 != null) {
                        C73323Un r3 = (C73323Un) this.A01;
                        if (A0l2.equals(r3.A00.A0J)) {
                            C25181Nf r23 = r3.A01;
                            AnonymousClass1BI r1 = r3.A00.A0J;
                            C22931Dv r02 = AnonymousClass1BI.A00;
                            r3.A00 = r23.A01(C22931Dv.A00(r1));
                            C73323Un.A00(r3);
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public void Bq1(Collection collection) {
        switch (this.A00) {
            case 0:
                if (collection != null) {
                    C87774Wx r4 = (C87774Wx) this.A01;
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            if (C87774Wx.A00(r4, C17880vN.A0Q(it), false)) {
                                C18090vk r0 = r4.A00;
                                if (r0 == null) {
                                    C18070vi.A11("updateContact");
                                    throw null;
                                } else {
                                    r0.invoke();
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C73293Ub r02 = (C73293Ub) this.A01;
                r02.A0U();
                C72463Mc.A1B(r02.A08);
                return;
            case 8:
                AnonymousClass3VF.A03((AnonymousClass3VF) this.A01);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bq4(Collection collection) {
        if (2 - this.A00 == 0) {
            CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) A00(this, collection);
            AnonymousClass3MW.A1X(communityMembersViewModel.A0J, new CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(communityMembersViewModel, collection, (C30391dr) null), C41561wd.A00(communityMembersViewModel));
        }
    }

    public void Brx(UserJid userJid) {
        AnonymousClass1OX r5;
        C18600wl r4;
        AnonymousClass1OS r3;
        C42741yf A012;
        String str;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(userJid, 0);
                C87774Wx r2 = (C87774Wx) this.A01;
                if (C87774Wx.A00(r2, userJid, false)) {
                    C18090vk r0 = r2.A00;
                    if (r0 == null) {
                        C18070vi.A11("updateContact");
                        throw null;
                    } else {
                        r0.invoke();
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = (VoiceChatBottomSheetViewModel) this.A01;
                VoiceChatBottomSheetViewModel.A05(voiceChatBottomSheetViewModel.A0D.A07(), voiceChatBottomSheetViewModel);
                return;
            case 2:
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) A00(this, userJid);
                r5 = C41561wd.A00(communityMembersViewModel);
                r4 = communityMembersViewModel.A0J;
                r3 = new CommunityMembersViewModel$contactObserver$1$onDisplayNameChanged$1(communityMembersViewModel, userJid, (C30391dr) null);
                break;
            case 4:
                C73293Ub r1 = (C73293Ub) this.A01;
                if (C42171xk.A00(userJid, r1.A05)) {
                    r1.A0U();
                }
                AnonymousClass3TA r22 = r1.A03;
                C143887Fe r12 = r22.A00;
                if ((r12 instanceof C75353hJ) && userJid != null && userJid.equals(((C75353hJ) r12).A00) && (A012 = r22.A0X.A01(userJid)) != null && (str = A012.A08) != null) {
                    C143887Fe r13 = r22.A00;
                    r13.A0B = str;
                    AnonymousClass3TA.A03(r13, r22, AnonymousClass4DX.PAGE_UPDATED);
                    return;
                }
                return;
            case 7:
                C73353Va r23 = (C73353Va) A00(this, userJid);
                C445823z r14 = ((AnonymousClass4YZ) r23.A0F.getValue()).A00;
                if (r14 != null) {
                    r5 = C41561wd.A00(r23);
                    r4 = r23.A0D;
                    r3 = new EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1(r14, r23, userJid, (C30391dr) null);
                    break;
                } else {
                    return;
                }
            case 8:
                AnonymousClass3VF r24 = (AnonymousClass3VF) this.A01;
                AnonymousClass3VF.A00(new C133356oc(r24.A01.A0H(userJid)), r24);
                return;
            default:
                return;
        }
        AnonymousClass3MW.A1X(r4, r3, r5);
    }

    public /* synthetic */ void BtU(UserJid userJid) {
        switch (this.A00) {
            case 4:
            case 8:
                Bkk(userJid);
                return;
            case 6:
                ConversationsSuggestedContactsViewModel.A00((ConversationsSuggestedContactsViewModel) A00(this, userJid), userJid);
                return;
            default:
                return;
        }
    }

    public void C1w(AnonymousClass1BI r6) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r6, 0);
                C87774Wx r2 = (C87774Wx) this.A01;
                if (C87774Wx.A00(r2, r6, false)) {
                    C18090vk r0 = r2.A00;
                    if (r0 == null) {
                        C18070vi.A11("updateContact");
                        throw null;
                    } else {
                        r0.invoke();
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = (VoiceChatBottomSheetViewModel) this.A01;
                VoiceChatBottomSheetViewModel.A05(voiceChatBottomSheetViewModel.A0D.A07(), voiceChatBottomSheetViewModel);
                return;
            case 2:
                CommunityMembersViewModel communityMembersViewModel = (CommunityMembersViewModel) A00(this, r6);
                AnonymousClass3MW.A1X(communityMembersViewModel.A0J, new CommunityMembersViewModel$contactObserver$1$onProfilePhotoChanged$1(communityMembersViewModel, r6, (C30391dr) null), C41561wd.A00(communityMembersViewModel));
                return;
            case 4:
                C73293Ub r22 = (C73293Ub) this.A01;
                boolean A002 = C42171xk.A00(r6, r22.A05);
                Boolean A0i = AnonymousClass000.A0i();
                if (A002) {
                    r22.A0U();
                }
                r22.A0A.A0E(A0i);
                return;
            case 6:
                ConversationsSuggestedContactsViewModel.A00((ConversationsSuggestedContactsViewModel) A00(this, r6), r6);
                return;
            case 8:
                boolean A0e = C22971Dz.A0e(r6);
                AnonymousClass3VF r23 = (AnonymousClass3VF) this.A01;
                if (!A0e) {
                    AnonymousClass3VF.A00(new C133356oc(r23.A01.A0H(r6)), r23);
                    return;
                } else if (r6.equals(r23.A06)) {
                    AnonymousClass3MX.A1K(r23.A0A, 1);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r3) {
        if (8 - this.A00 == 0 && C22971Dz.A0e(r3)) {
            AnonymousClass3VF r1 = (AnonymousClass3VF) this.A01;
            if (r3.equals(r1.A06)) {
                AnonymousClass3MX.A1K(r1.A0A, 0);
            }
        }
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void Bq3(Collection collection) {
    }
}
