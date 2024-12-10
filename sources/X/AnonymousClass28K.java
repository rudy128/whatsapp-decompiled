package X;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.commands.BotCommandsPickerView;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.community.CommunityFragment;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.28K  reason: invalid class name */
public class AnonymousClass28K extends C37911qO {
    public final int A00;
    public final Object A01;

    public AnonymousClass28K(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01() {
        Boolean bool;
        switch (this.A00) {
            case 0:
                BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) this.A01;
                if (botCommandsPickerView.A00 != null) {
                    botCommandsPickerView.A06();
                    return;
                }
                return;
            case 1:
                A07();
                return;
            case 3:
                AnonymousClass4P5 r2 = (AnonymousClass4P5) this.A01;
                r2.A01.A0g(0);
                r2.A05.A01.unregisterObserver(this);
                return;
            case 4:
                AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
                r3.A05.A0J(new C98764rg((Object) r3, 27));
                return;
            case 6:
                C38241qx r4 = (C38241qx) this.A01;
                C38361rA BMX = r4.BMX();
                if (BMX != null) {
                    bool = Boolean.valueOf(BMX.isEmpty());
                } else {
                    bool = null;
                }
                boolean A18 = C18070vi.A18(bool, AnonymousClass000.A0i());
                View view = r4.A00;
                if (A18) {
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    r4.A02.setVisibility(8);
                    return;
                }
                if (view != null) {
                    view.setVisibility(8);
                }
                r4.A02.setVisibility(0);
                return;
            case 7:
                A08();
                return;
            case 8:
                MentionPickerView mentionPickerView = (MentionPickerView) this.A01;
                mentionPickerView.A06();
                mentionPickerView.A01.postDelayed(new C70583Br(mentionPickerView, 28), 250);
                return;
            default:
                return;
        }
    }

    public void A02(int i, int i2) {
        if (1 - this.A00 == 0) {
            A07();
        }
    }

    public void A03(int i, int i2) {
        C24001Il r2;
        int i3;
        Object obj;
        int i4;
        switch (this.A00) {
            case 1:
                A07();
                CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A01;
                if (!callsHistoryFragment.isEmpty()) {
                    r2 = (C24001Il) callsHistoryFragment.A0o.get();
                    i3 = 400;
                    break;
                } else {
                    return;
                }
            case 2:
                CommunityFragment communityFragment = (CommunityFragment) this.A01;
                if (!communityFragment.isEmpty()) {
                    AnonymousClass00H r0 = communityFragment.A0L;
                    if (r0 != null) {
                        r2 = (C24001Il) r0.get();
                        i3 = 600;
                        break;
                    } else {
                        C18070vi.A11("splitWindowManager");
                        throw null;
                    }
                } else {
                    return;
                }
            case 5:
                AnonymousClass3WO r4 = (AnonymousClass3WO) this.A01;
                RecyclerView recyclerView = r4.A00;
                LinearLayoutManager linearLayoutManager = null;
                if (recyclerView != null) {
                    obj = recyclerView.getLayoutManager();
                } else {
                    obj = null;
                }
                if (obj instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) obj;
                }
                if (recyclerView != null) {
                    i4 = recyclerView.getScrollState();
                } else {
                    i4 = 0;
                }
                if (linearLayoutManager != null && i2 >= 0 && i == 0 && i4 == 0) {
                    int max = Math.max(linearLayoutManager.A1N(), 0);
                    if (max == 0 || max == 1) {
                        RecyclerView recyclerView2 = r4.A00;
                        if (recyclerView2 != null) {
                            recyclerView2.A0f(0);
                        }
                        RecyclerView recyclerView3 = r4.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.postOnAnimationDelayed(new C98774rh(r4, 35), 128);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView4 = r4.A00;
                    if (recyclerView4 != null) {
                        recyclerView4.A0l(0, 10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                A08();
                return;
            case 9:
                if (i == 0) {
                    ((RecyclerView) this.A01).A0f(0);
                    return;
                }
                return;
            default:
                return;
        }
        r2.A02(i3, false);
    }

    public void A04(int i, int i2) {
        C24001Il r2;
        int i3;
        switch (this.A00) {
            case 1:
                CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A01;
                if (callsHistoryFragment.isEmpty()) {
                    r2 = (C24001Il) callsHistoryFragment.A0o.get();
                    i3 = 400;
                    break;
                } else {
                    return;
                }
            case 2:
                CommunityFragment communityFragment = (CommunityFragment) this.A01;
                if (communityFragment.isEmpty()) {
                    AnonymousClass00H r0 = communityFragment.A0L;
                    if (r0 != null) {
                        r2 = (C24001Il) r0.get();
                        i3 = 600;
                        break;
                    } else {
                        C18070vi.A11("splitWindowManager");
                        throw null;
                    }
                } else {
                    return;
                }
            case 7:
                A08();
                return;
            default:
                return;
        }
        r2.A02(i3, true);
    }

    public void A05(int i, int i2, int i3) {
        if (1 - this.A00 == 0) {
            A07();
        }
    }

    public void A07() {
        RecyclerView recyclerView;
        CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A01;
        if (((C18020vd.A00(C18040vf.A02, callsHistoryFragment.A0T, 4708) >= 3 && callsHistoryFragment.A0C.A00 == 1) || (!TextUtils.isEmpty(callsHistoryFragment.A0C.A0Y.A01))) && ((C38391rD) callsHistoryFragment.A0m.get()).A0Q() > 0 && (recyclerView = callsHistoryFragment.A03) != null) {
            recyclerView.A0f(0);
            callsHistoryFragment.A0C.A00 = 2;
        }
    }

    public final void A08() {
        String str;
        InteropComposeSelectIntegratorActivity interopComposeSelectIntegratorActivity = (InteropComposeSelectIntegratorActivity) this.A01;
        C28931bI r2 = interopComposeSelectIntegratorActivity.A02;
        if (r2 == null) {
            str = "emptyViewStub";
        } else {
            C73503Wf r0 = interopComposeSelectIntegratorActivity.A00;
            if (r0 == null) {
                str = "integratorsAdapter";
            } else {
                int size = r0.A00.size();
                int i = 8;
                if (size == 0) {
                    i = 0;
                }
                r2.A04(i);
                interopComposeSelectIntegratorActivity.invalidateOptionsMenu();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
