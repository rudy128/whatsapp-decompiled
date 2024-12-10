package X;

import android.widget.FrameLayout;
import com.whatsapp.banner.SettingsBannerViewModelImpl;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.4hq  reason: invalid class name and case insensitive filesystem */
public class C92744hq implements C72063Km {
    public final int A00;
    public final Object A01;

    public C92744hq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bqj(C195759tr r6) {
        C66532yK r0;
        C22654BId bId;
        FrameLayout frameLayout;
        int i;
        switch (this.A00) {
            case 0:
                SettingsBannerViewModelImpl settingsBannerViewModelImpl = (SettingsBannerViewModelImpl) this.A01;
                if (settingsBannerViewModelImpl.A02.A06() && r6.A0A != null) {
                    settingsBannerViewModelImpl.A00.A0E(r6);
                    return;
                }
                return;
            case 1:
                CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = (CallsHistoryFragmentViewModel) this.A01;
                if (!callsHistoryFragmentViewModel.A0Q.A06() || r6.A02 == null) {
                    r0 = null;
                } else {
                    r0 = new C66532yK(r6);
                }
                callsHistoryFragmentViewModel.A05 = r0;
                CallsHistoryFragmentViewModel.A06(callsHistoryFragmentViewModel);
                return;
            case 2:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                AnonymousClass1FL A1B = conversationsFragment.A1B();
                if (A1B != null && !A1B.isFinishing()) {
                    conversationsFragment.A0p.A0f(r6);
                    bId = conversationsFragment.A0p;
                    break;
                } else {
                    return;
                }
            case 3:
                ConversationsFragment conversationsFragment2 = (ConversationsFragment) this.A01;
                AnonymousClass1FL A1B2 = conversationsFragment2.A1B();
                if (A1B2 != null && !A1B2.isFinishing()) {
                    if (conversationsFragment2.A0q.A0g(r6)) {
                        conversationsFragment2.A0q.A0f(r6);
                        conversationsFragment2.A0G.setVisibility(0);
                        conversationsFragment2.A2H(true);
                        bId = conversationsFragment2.A0q;
                        break;
                    } else {
                        conversationsFragment2.A0G.setVisibility(8);
                        conversationsFragment2.A2H(false);
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 4:
                ConversationsFragment conversationsFragment3 = (ConversationsFragment) this.A01;
                AnonymousClass1FL A1B3 = conversationsFragment3.A1B();
                if (A1B3 != null && !A1B3.isFinishing()) {
                    if (conversationsFragment3.A0p == null) {
                        conversationsFragment3.A0p = new C22654BId(conversationsFragment3.A1B(), conversationsFragment3.A1F());
                    }
                    if (conversationsFragment3.A1V == null || ConversationsFragment.A02(conversationsFragment3) != 0 || conversationsFragment3.A1K.A02() != 0 || conversationsFragment3.A3t) {
                        if (conversationsFragment3.A0G.getChildCount() != 0) {
                            conversationsFragment3.A0G.removeView(conversationsFragment3.A0p);
                        }
                        if (conversationsFragment3.A0H.getChildCount() == 0) {
                            conversationsFragment3.A0H.addView(conversationsFragment3.A0p);
                        }
                        boolean z = r6.A03;
                        C22654BId bId2 = conversationsFragment3.A0p;
                        if (z) {
                            bId2.A0f(r6);
                            return;
                        } else if (bId2 != null) {
                            bId2.A0c();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        if (conversationsFragment3.A0H.getChildCount() != 0) {
                            conversationsFragment3.A0H.removeView(conversationsFragment3.A0p);
                        }
                        if (conversationsFragment3.A0G.getChildCount() == 0) {
                            conversationsFragment3.A0G.addView(conversationsFragment3.A0p);
                        }
                        if (r6.A03) {
                            conversationsFragment3.A0p.A0f(r6);
                            conversationsFragment3.A0G.setVisibility(0);
                            conversationsFragment3.A2H(true);
                            return;
                        }
                        conversationsFragment3.A0G.setVisibility(8);
                        conversationsFragment3.A2H(false);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                if (groupChatInfoActivity.isFinishing()) {
                    return;
                }
                if (((C36651oF) groupChatInfoActivity.A1l.get()).A06()) {
                    if (groupChatInfoActivity.A0M == null) {
                        AnonymousClass3PY r1 = new AnonymousClass3PY(groupChatInfoActivity);
                        groupChatInfoActivity.A0M = r1;
                        groupChatInfoActivity.A08.addView(r1);
                    }
                    groupChatInfoActivity.A0M.A06.A01(r6);
                    groupChatInfoActivity.A1f.A04(8);
                    groupChatInfoActivity.A09.setVisibility(0);
                    return;
                }
                groupChatInfoActivity.A1f.A04(0);
                groupChatInfoActivity.A09.setVisibility(8);
                return;
            default:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A01;
                if (!profileInfoActivity.isFinishing() && profileInfoActivity.A05 != null) {
                    if (((C36661oG) profileInfoActivity.A0W.get()).A06()) {
                        if (profileInfoActivity.A0B == null) {
                            AnonymousClass3PZ r12 = new AnonymousClass3PZ(profileInfoActivity);
                            profileInfoActivity.A0B = r12;
                            profileInfoActivity.A05.addView(r12);
                        }
                        profileInfoActivity.A0B.A06.A01(r6);
                        frameLayout = profileInfoActivity.A05;
                        i = 0;
                    } else {
                        frameLayout = profileInfoActivity.A05;
                        i = 8;
                    }
                    frameLayout.setVisibility(i);
                    return;
                }
                return;
        }
        bId.A0d();
    }
}
