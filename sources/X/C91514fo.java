package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.dialogs.DeleteOrArchiveChatDialog;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.invites.Hilt_PromptSendGroupInviteDialogFragment;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4fo  reason: invalid class name and case insensitive filesystem */
public class C91514fo implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C91514fo(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void Bo9(Object obj) {
        A34 r5;
        AnonymousClass10I r0;
        switch (this.A00) {
            case 0:
                AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
                AnonymousClass4SG r2 = (AnonymousClass4SG) this.A02;
                AnonymousClass1EC r1 = (AnonymousClass1EC) this.A03;
                AnonymousClass4EK r13 = (AnonymousClass4EK) obj;
                r3.CEx();
                if (r13 instanceof C77103pN) {
                    r2.A01((C77103pN) r13, r1);
                    return;
                } else if (r13 instanceof C77123pP) {
                    r3.CNB(2131893532, 2131895077);
                    return;
                } else if (r13 instanceof C77083pL) {
                    C77083pL r132 = (C77083pL) r13;
                    AnonymousClass1KB r22 = r3.A05;
                    int i = 2131892439;
                    if (AnonymousClass11E.A02(r3)) {
                        i = 2131892440;
                    }
                    r22.A08(i, 0);
                    r132.A00.invoke();
                    return;
                } else if (r13 instanceof C77093pM) {
                    r2.A00((C77093pM) r13);
                    return;
                } else {
                    return;
                }
            case 1:
                AnonymousClass3uP r52 = (AnonymousClass3uP) this.A01;
                AnonymousClass1FU r4 = (AnonymousClass1FU) this.A02;
                View view = (View) this.A03;
                AnonymousClass1A3 r133 = (AnonymousClass1A3) obj;
                if (r133.A00 == null || !(r133.A00() instanceof UserJid)) {
                    Log.e("ConverstationRow: chatJid is not instance of UserJid");
                    return;
                }
                UserJid A002 = C22941Dw.A00((Jid) r133.A00());
                if (A002 == null) {
                    return;
                }
                if (C36301nf.A01(r52.A0F, 11564)) {
                    r52.getContext().startActivity(C72463Mc.A0F(r52.getContext(), A002, 28), (Bundle) null);
                    return;
                }
                AnonymousClass3uP.A0V(view, r4, r52, A002);
                return;
            case 2:
                AnonymousClass3uP r53 = (AnonymousClass3uP) this.A01;
                AnonymousClass1FU r42 = (AnonymousClass1FU) this.A02;
                AnonymousClass1BI r23 = (AnonymousClass1BI) this.A03;
                AnonymousClass1BI r134 = (AnonymousClass1BI) obj;
                if (r134 != null) {
                    String A0p = AnonymousClass3MY.A0p(r53.A0j, r53.A0l, r134);
                    String A0F = r53.A0E.A0F(r23);
                    if (A0p != null) {
                        Object[] A1b = AnonymousClass3MW.A1b();
                        AnonymousClass001.A1Q(A0p, A0F, A1b);
                        String string = r42.getString(2131886745, A1b);
                        View findViewById = r42.A00.findViewById(16908290);
                        if (findViewById == null) {
                            findViewById = r42.A00;
                        }
                        C23520Bik A022 = C23520Bik.A02(findViewById, string, -1);
                        A022.A0E(AnonymousClass3Ma.A00(r42, 2130971311, 2131102579));
                        A022.A08();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AnonymousClass1FU r54 = (AnonymousClass1FU) this.A02;
                GroupJid groupJid = (GroupJid) this.A03;
                Map map = (Map) obj;
                if (map != null && !map.isEmpty()) {
                    ArrayList A13 = AnonymousClass000.A13();
                    ArrayList A132 = AnonymousClass000.A13();
                    Iterator A15 = AnonymousClass000.A15(map);
                    Long l = null;
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        C85114Md r24 = (C85114Md) A16.getValue();
                        if (r24 != null) {
                            if (l == null) {
                                l = Long.valueOf(r24.A00);
                            }
                            A13.add(((Jid) A16.getKey()).getRawString());
                            A132.add(r24.A01);
                        }
                    }
                    Bundle A003 = PromptSendGroupInviteDialogFragment.A00(AnonymousClass1LU.A0p(r54, groupJid, l, A13, A132, AnonymousClass000.A13(), 3), map.keySet(), false);
                    Hilt_PromptSendGroupInviteDialogFragment hilt_PromptSendGroupInviteDialogFragment = new Hilt_PromptSendGroupInviteDialogFragment();
                    A003.putInt("invite_intent_code", -1);
                    hilt_PromptSendGroupInviteDialogFragment.A1R(A003);
                    r54.CMl(hilt_PromptSendGroupInviteDialogFragment);
                    return;
                }
                return;
            case 4:
                AnonymousClass3uP r55 = (AnonymousClass3uP) this.A01;
                Object obj2 = this.A02;
                AnonymousClass1BI r43 = (AnonymousClass1BI) this.A03;
                Map map2 = (Map) obj;
                if (map2 != null && !map2.isEmpty()) {
                    Map.Entry A162 = AnonymousClass000.A16(AnonymousClass000.A15(map2));
                    String A0p2 = AnonymousClass3MY.A0p(r55.A0j, r55.A0l, (AnonymousClass1BI) A162.getKey());
                    String A0F2 = r55.A0E.A0F(r43);
                    if (AnonymousClass000.A0M(A162.getValue()) == 409) {
                        r55.A0S.A0J(new C146597Pw(r55, obj2, A0p2, A0F2, 3));
                        return;
                    }
                    AnonymousClass126 r12 = r55.A19;
                    if (map2.size() > 0) {
                        r12.A0O(3001, map2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C79873wA r56 = (C79873wA) this.A01;
                AnonymousClass206 r44 = (AnonymousClass206) this.A02;
                ((DialogInterface) obj).dismiss();
                r56.A02.A01(r44, (Long) null, 2);
                C79873wA.A00((AnonymousClass1FU) this.A03, r56, r44);
                return;
            case 6:
                AnonymousClass4aY r6 = (AnonymousClass4aY) this.A01;
                View view2 = (View) this.A02;
                View view3 = (View) this.A03;
                C83014Da r135 = (C83014Da) obj;
                if (r135.equals(C83014Da.A03)) {
                    if (!C28281Zt.A0B(AnonymousClass3MW.A0Q(r6)) && !C22891Dp.A02) {
                        C28281Zt.A0A(r6.A2Q.getWindow(), true);
                    }
                    AnonymousClass4aY.A1N(r6, r6.A00);
                    AnonymousClass4aY.A0n(r6);
                    Toolbar toolbar = r6.A0f;
                    if (toolbar != null) {
                        toolbar.setBackgroundResource(2131102739);
                        Toolbar toolbar2 = r6.A0f;
                        if (toolbar2 instanceof WDSToolbar) {
                            ((WDSToolbar) toolbar2).setDividerVisibility(C27871Xy.GONE);
                        }
                        AnonymousClass4aY.A0T(r6.A0f, r6);
                        AnonymousClass4aY.A1o(r6, true);
                    }
                } else {
                    if (!C28281Zt.A0B(AnonymousClass3MW.A0P(r6)) && !C22891Dp.A02) {
                        C28281Zt.A0A(r6.A2Q.getWindow(), false);
                    }
                    AnonymousClass4aY.A1N(r6, r6.A00);
                    AnonymousClass4aY.A0n(r6);
                    Toolbar toolbar3 = r6.A0f;
                    if (toolbar3 != null) {
                        toolbar3.setBackgroundResource(AnonymousClass4Z9.A01(AnonymousClass3MW.A0Q(r6), true));
                        Toolbar toolbar4 = r6.A0f;
                        if (toolbar4 instanceof WDSToolbar) {
                            ((WDSToolbar) toolbar4).setDividerVisibility(C27871Xy.VISIBLE);
                        }
                        AnonymousClass4aY.A0T(r6.A0f, r6);
                        AnonymousClass4aY.A1o(r6, false);
                    }
                }
                view2.setVisibility(r135.ftuxVisibility);
                view3.setVisibility(r135.chatVisibility);
                r6.A2Q.invalidateOptionsMenu();
                return;
            case 7:
                DeleteOrArchiveChatDialog deleteOrArchiveChatDialog = (DeleteOrArchiveChatDialog) this.A01;
                AnonymousClass1BI r32 = (AnonymousClass1BI) this.A02;
                CompoundButton compoundButton = (CompoundButton) this.A03;
                C18070vi.A0d(compoundButton, 2);
                boolean isChecked = compoundButton.isChecked();
                deleteOrArchiveChatDialog.A28();
                AnonymousClass1FU r14 = (AnonymousClass1FU) C72453Mb.A0Z(deleteOrArchiveChatDialog);
                C33251iW r02 = deleteOrArchiveChatDialog.A01;
                if (r02 != null) {
                    r5 = new AnonymousClass49Y(r14, r02, r32, isChecked);
                    r0 = deleteOrArchiveChatDialog.A04;
                    break;
                } else {
                    C18070vi.A11("userActions");
                    throw null;
                }
            case 8:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                View view4 = (View) this.A02;
                TextView textView = (TextView) this.A03;
                Number number = (Number) obj;
                int intValue = number.intValue();
                if (intValue > 0) {
                    view4.setVisibility(0);
                    textView.setText(groupChatInfoActivity.A0m.A0L().format(number));
                    Resources resources = groupChatInfoActivity.getResources();
                    Object[] A1a = AnonymousClass3MW.A1a();
                    A1a[0] = number;
                    textView.setContentDescription(resources.getQuantityString(2131755184, intValue, A1a));
                    return;
                }
                view4.setVisibility(8);
                return;
            case 9:
                Context context = (Context) this.A02;
                ((AnonymousClass4SV) this.A01).A01.get();
                context.startActivity(AnonymousClass1LU.A0Z(context, (AnonymousClass1BI) this.A03));
                return;
            case 10:
                GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this.A02;
                List list = (List) obj;
                C18070vi.A0d(list, 3);
                ((View) this.A01).setVisibility(8);
                groupMembershipApprovalRequestsFragment.A1Z(true);
                ((View) this.A03).setVisibility(0);
                groupMembershipApprovalRequestsFragment.A25().A01 = list;
                groupMembershipApprovalRequestsFragment.A25().notifyDataSetChanged();
                return;
            default:
                AnonymousClass1FP r15 = (AnonymousClass1FP) this.A01;
                r5 = (A34) this.A03;
                ((AnonymousClass1DS) this.A02).A09(r15);
                r0 = r15.A05;
                break;
        }
        C17890vO.A0u(r5, r0);
    }
}
