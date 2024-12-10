package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatlock.ChatLockPrivacySettingsActivity;
import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.4jU  reason: invalid class name and case insensitive filesystem */
public class C93754jU implements C34241kA {
    public final int A00;
    public final Object A01;

    public C93754jU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C3e(AnonymousClass4YL r9) {
        String str;
        int i;
        switch (this.A00) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                Integer num = r9.A02;
                if (num == AnonymousClass00R.A00) {
                    callLogActivity.A08.A03 = true;
                    callLogActivity.A0e = true;
                    AnonymousClass3MX.A0a(callLogActivity.A0T).A01(4, 0);
                    CallLogActivity.A03(callLogActivity);
                    return;
                } else if (num == AnonymousClass00R.A0C) {
                    callLogActivity.A08.A06();
                    callLogActivity.A08.A0D(callLogActivity, r9, new C93804jZ(callLogActivity), callLogActivity.A0L.A0J);
                    return;
                } else {
                    return;
                }
            case 1:
                C18070vi.A0d(r9, 0);
                Integer num2 = r9.A02;
                int intValue = num2.intValue();
                AnonymousClass4XY r5 = (AnonymousClass4XY) this.A01;
                if (intValue != 0) {
                    AnonymousClass4XY.A00(r5, num2);
                } else {
                    C31191fA A0Y = AnonymousClass3MW.A0Y(r5.A0A);
                    AnonymousClass1BI r4 = r5.A09;
                    A0Y.A0F(r4, false);
                    AnonymousClass4VV r3 = r5.A07;
                    r3.A04(r4, 0, (Integer) null, 6);
                    AnonymousClass1TK.A00(r3.A00, "new_remove_chat_count");
                }
                r5.A01();
                return;
            case 2:
                C18070vi.A0d(r9, 0);
                Integer num3 = r9.A02;
                Integer num4 = AnonymousClass00R.A00;
                AnonymousClass4XY r7 = (AnonymousClass4XY) this.A01;
                if (num3 == num4) {
                    boolean z = !C17880vN.A1X(r7.A08.A01);
                    AnonymousClass00H r52 = r7.A0A;
                    AnonymousClass3MW.A0Y(r52).A03 = true;
                    C31191fA A0Y2 = AnonymousClass3MW.A0Y(r52);
                    AnonymousClass1BI r42 = r7.A09;
                    A0Y2.A0F(r42, true);
                    AnonymousClass4VV r32 = r7.A07;
                    r32.A04(r42, 0, (Integer) null, 5);
                    if (z) {
                        AnonymousClass3MW.A0Y(r52).A08(r7.A03);
                    }
                    AnonymousClass1TK.A00(r32.A00, "new_add_chat_count");
                } else {
                    AnonymousClass4XY.A00(r7, num3);
                }
                r7.A01();
                return;
            case 3:
                ChatLockPrivacySettingsActivity chatLockPrivacySettingsActivity = (ChatLockPrivacySettingsActivity) this.A01;
                C18070vi.A0d(r9, 1);
                int intValue2 = r9.A02.intValue();
                if (intValue2 == 0 || intValue2 == 2) {
                    C31191fA r0 = chatLockPrivacySettingsActivity.A01;
                    if (r0 != null) {
                        r0.A07();
                        if (chatLockPrivacySettingsActivity.A01 != null) {
                            View view = chatLockPrivacySettingsActivity.A00;
                            C31191fA.A01(C72463Mc.A0H(chatLockPrivacySettingsActivity, view), view, true);
                            i = 8;
                        }
                    }
                    str = "chatLockManager";
                    break;
                } else {
                    if (chatLockPrivacySettingsActivity.A01 != null) {
                        View view2 = chatLockPrivacySettingsActivity.A00;
                        C31191fA.A01(C72463Mc.A0H(chatLockPrivacySettingsActivity, view2), view2, false);
                        i = 9;
                    }
                    str = "chatLockManager";
                }
                AnonymousClass00H r02 = chatLockPrivacySettingsActivity.A02;
                if (r02 == null) {
                    str = "chatLockLogger";
                    break;
                } else {
                    AnonymousClass3MX.A0a(r02).A04((AnonymousClass1BI) null, C17880vN.A0l(), 1, i);
                    return;
                }
                break;
            case 4:
                C18070vi.A0d(r9, 0);
                int intValue3 = r9.A02.intValue();
                if (intValue3 == 0) {
                    ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity = (ChatLockRequestAuthInterstitialActivity) this.A01;
                    AnonymousClass00H r03 = chatLockRequestAuthInterstitialActivity.A00;
                    if (r03 != null) {
                        AnonymousClass3MW.A0Y(r03).A02 = false;
                        C72453Mb.A14(chatLockRequestAuthInterstitialActivity);
                        return;
                    }
                } else if (intValue3 != 2) {
                    ChatLockRequestAuthInterstitialActivity.A0Q((ChatLockRequestAuthInterstitialActivity) this.A01);
                    return;
                } else {
                    ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity2 = (ChatLockRequestAuthInterstitialActivity) this.A01;
                    AnonymousClass1BI A0m = AnonymousClass3MX.A0m(chatLockRequestAuthInterstitialActivity2.A02);
                    AnonymousClass00H r04 = chatLockRequestAuthInterstitialActivity2.A00;
                    if (r04 != null) {
                        AnonymousClass3MW.A0Y(r04).A0D(chatLockRequestAuthInterstitialActivity2, r9, new C93814ja(chatLockRequestAuthInterstitialActivity2, A0m, 1), A0m);
                        return;
                    }
                }
                str = "chatLockManagerLazy";
                break;
            case 5:
                C37731q2 r53 = (C37731q2) this.A01;
                AnonymousClass1FY r43 = (AnonymousClass1FY) C18050vg.A01((Context) r53.A0A.get(), AnonymousClass1FY.class);
                if (r43 != null) {
                    Integer num5 = r9.A02;
                    if (num5 == AnonymousClass00R.A00 && r53.A02 != null) {
                        AnonymousClass3MW.A0Y(r53.A09).A0F(r53.A02, false);
                    } else if (num5 == AnonymousClass00R.A0C) {
                        AnonymousClass3MW.A0Y(r53.A09).A0E(r43, r53.A02);
                    }
                    if (num5 != AnonymousClass00R.A0Y) {
                        AnonymousClass3MW.A0Y(r53.A09).A00 = false;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                C37731q2 r54 = (C37731q2) this.A01;
                Context context = (Context) r54.A0A.get();
                AnonymousClass1FY r2 = (AnonymousClass1FY) C18050vg.A01(context, AnonymousClass1FY.class);
                if (r2 != null) {
                    Integer num6 = r9.A02;
                    if (num6 == AnonymousClass00R.A00 && r54.A02 != null) {
                        boolean z2 = !C17880vN.A1X(r54.A07.A01);
                        AnonymousClass00H r22 = r54.A09;
                        AnonymousClass3MW.A0Y(r22).A0F(r54.A02, true);
                        if (z2) {
                            AnonymousClass3MW.A0Y(r22).A08(context);
                        }
                    } else if (num6 == AnonymousClass00R.A0C) {
                        AnonymousClass3MW.A0Y(r54.A09).A0E(r2, r54.A02);
                    }
                    if (num6 != AnonymousClass00R.A0Y) {
                        AnonymousClass3MW.A0Y(r54.A09).A00 = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A01;
                if (r9.A02 == AnonymousClass00R.A00) {
                    groupChatInfoActivity.A2D = true;
                    groupChatInfoActivity.A0C.A03 = true;
                    AnonymousClass3MX.A0a(groupChatInfoActivity.A0R).A01(4, 0);
                    C91604fx.A00(groupChatInfoActivity, groupChatInfoActivity.A0J.A03(groupChatInfoActivity.A0v.A0J, groupChatInfoActivity.A1K), 25);
                    return;
                }
                return;
        }
        C18070vi.A11(str);
        throw null;
    }
}
