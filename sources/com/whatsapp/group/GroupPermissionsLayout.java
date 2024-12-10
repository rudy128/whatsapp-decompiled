package com.whatsapp.group;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C106945Xu;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C203411t;
import X.C21355Aik;
import X.C36401np;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C74793cj;
import X.C825148g;
import X.C90044dR;
import X.C90824eh;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class GroupPermissionsLayout extends LinearLayout implements AnonymousClass009 {
    public static final int[][] A0N = {new int[]{2131896590, 2131896591}, new int[]{2131896592, 2131896593}};
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public SwitchCompat A03;
    public SwitchCompat A04;
    public AnonymousClass1L9 A05;
    public ListItemWithLeftIcon A06;
    public ListItemWithLeftIcon A07;
    public ListItemWithLeftIcon A08;
    public ListItemWithLeftIcon A09;
    public ListItemWithLeftIcon A0A;
    public ListItemWithLeftIcon A0B;
    public ListItemWithLeftIcon A0C;
    public AnonymousClass1LC A0D;
    public WaTextView A0E;
    public C203411t A0F;
    public C18000vb A0G;
    public C18030ve A0H;
    public C36401np A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass031 A0L;
    public boolean A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00();
    }

    public static final void setClickEventListener$lambda$0(GroupPermissionsLayout groupPermissionsLayout, View view) {
        C18070vi.A0d(groupPermissionsLayout, 0);
        SwitchCompat switchCompat = groupPermissionsLayout.A00;
        if (switchCompat == null) {
            C18070vi.A11("editGroupInfoSwitch");
            throw null;
        } else {
            switchCompat.toggle();
        }
    }

    public static final void setClickEventListener$lambda$1(GroupPermissionsLayout groupPermissionsLayout, View view) {
        C18070vi.A0d(groupPermissionsLayout, 0);
        SwitchCompat switchCompat = groupPermissionsLayout.A04;
        if (switchCompat == null) {
            C18070vi.A11("sendMessagesSwitch");
            throw null;
        } else {
            switchCompat.toggle();
        }
    }

    public static final void setClickEventListener$lambda$2(GroupPermissionsLayout groupPermissionsLayout, View view) {
        C18070vi.A0d(groupPermissionsLayout, 0);
        SwitchCompat switchCompat = groupPermissionsLayout.A01;
        if (switchCompat == null) {
            C18070vi.A11("memberAddModeSwitch");
            throw null;
        } else {
            switchCompat.toggle();
        }
    }

    public static final void setClickEventListener$lambda$3(GroupPermissionsLayout groupPermissionsLayout, View view) {
        C18070vi.A0d(groupPermissionsLayout, 0);
        SwitchCompat switchCompat = groupPermissionsLayout.A02;
        if (switchCompat == null) {
            C18070vi.A11("membershipApprovalRequiredSwitch");
            throw null;
        } else {
            switchCompat.toggle();
        }
    }

    public static final void setClickEventListener$lambda$4(GroupPermissionsLayout groupPermissionsLayout, View view) {
        C18070vi.A0d(groupPermissionsLayout, 0);
        SwitchCompat switchCompat = groupPermissionsLayout.A03;
        if (switchCompat == null) {
            C18070vi.A11("reportToAdminSwitch");
            throw null;
        } else {
            switchCompat.toggle();
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setActivityUtils(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setClickEventListener(C106945Xu r4) {
        String str;
        C18070vi.A0d(r4, 0);
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            str = "editGroupInfoSwitch";
        } else {
            switchCompat.setOnCheckedChangeListener(new C90824eh(r4, 1));
            SwitchCompat switchCompat2 = this.A04;
            if (switchCompat2 == null) {
                str = "sendMessagesSwitch";
            } else {
                switchCompat2.setOnCheckedChangeListener(new C90824eh(r4, 2));
                SwitchCompat switchCompat3 = this.A01;
                if (switchCompat3 == null) {
                    str = "memberAddModeSwitch";
                } else {
                    switchCompat3.setOnCheckedChangeListener(new C90824eh(r4, 4));
                    SwitchCompat switchCompat4 = this.A02;
                    if (switchCompat4 == null) {
                        str = "membershipApprovalRequiredSwitch";
                    } else {
                        switchCompat4.setOnCheckedChangeListener(new C90824eh(r4, 3));
                        SwitchCompat switchCompat5 = this.A03;
                        if (switchCompat5 == null) {
                            str = "reportToAdminSwitch";
                        } else {
                            switchCompat5.setOnCheckedChangeListener(new C90824eh(r4, 5));
                            ListItemWithLeftIcon listItemWithLeftIcon = this.A08;
                            if (listItemWithLeftIcon == null) {
                                str = "manageHistoryView";
                            } else {
                                C825148g.A00(listItemWithLeftIcon, r4, 32);
                                ListItemWithLeftIcon listItemWithLeftIcon2 = this.A0C;
                                if (listItemWithLeftIcon2 == null) {
                                    str = "restrictGroupPermissions";
                                } else {
                                    C90044dR.A00(listItemWithLeftIcon2, this, 8);
                                    ListItemWithLeftIcon listItemWithLeftIcon3 = this.A06;
                                    if (listItemWithLeftIcon3 == null) {
                                        str = "announcementGroupSetting";
                                    } else {
                                        C90044dR.A00(listItemWithLeftIcon3, this, 9);
                                        ListItemWithLeftIcon listItemWithLeftIcon4 = this.A09;
                                        if (listItemWithLeftIcon4 == null) {
                                            str = "memberAddModeSetting";
                                        } else {
                                            C90044dR.A00(listItemWithLeftIcon4, this, 10);
                                            ListItemWithLeftIcon listItemWithLeftIcon5 = this.A0A;
                                            if (listItemWithLeftIcon5 == null) {
                                                str = "membershipApprovalRequiredSetting";
                                            } else {
                                                C90044dR.A00(listItemWithLeftIcon5, this, 11);
                                                ListItemWithLeftIcon listItemWithLeftIcon6 = this.A0B;
                                                if (listItemWithLeftIcon6 == null) {
                                                    str = "reportToAdminSetting";
                                                } else {
                                                    C90044dR.A00(listItemWithLeftIcon6, this, 12);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void setCommunityChatManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0J = r2;
    }

    public final void setCommunityNavigatorBridge(C203411t r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A0I = r2;
    }

    public final void setPinInChatExperimentUtils(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0K = r2;
    }

    public final void setWaLinkFactory(AnonymousClass1LC r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setWaLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public void A00() {
        if (!this.A0M) {
            this.A0M = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A0H = AnonymousClass10E.A8r(A0O);
            this.A05 = AnonymousClass3MZ.A0N(A0O);
            this.A0J = C000200d.A00(A0O.A2L);
            this.A0F = AnonymousClass10E.A48(A0O);
            AnonymousClass10G r1 = A0O.A00;
            this.A0I = AnonymousClass3MY.A0e(r1);
            this.A0K = C000200d.A00(A0O.AdN);
            this.A0D = C72463Mc.A0Y(r1);
            this.A0G = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0L;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0L = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1L9 getActivityUtils() {
        AnonymousClass1L9 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass00H getCommunityChatManager() {
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityChatManager");
        throw null;
    }

    public final C203411t getCommunityNavigatorBridge() {
        C203411t r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityNavigatorBridge");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public final AnonymousClass00H getPinInChatExperimentUtils() {
        AnonymousClass00H r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pinInChatExperimentUtils");
        throw null;
    }

    public final AnonymousClass1LC getWaLinkFactory() {
        AnonymousClass1LC r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLinkFactory");
        throw null;
    }

    public final C18000vb getWaLocale() {
        C18000vb r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLocale");
        throw null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A0C = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131434657);
        Property property = SwitchCompat.A0f;
        WDSSwitch wDSSwitch = new WDSSwitch(AnonymousClass3MY.A04(this), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
        this.A00 = wDSSwitch;
        wDSSwitch.setId(2131430253);
        ListItemWithLeftIcon listItemWithLeftIcon = this.A0C;
        if (listItemWithLeftIcon == null) {
            C18070vi.A11("restrictGroupPermissions");
            throw null;
        }
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            C18070vi.A11("editGroupInfoSwitch");
            throw null;
        }
        listItemWithLeftIcon.A08(switchCompat);
        this.A06 = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131427805);
        WDSSwitch wDSSwitch2 = new WDSSwitch(AnonymousClass3MY.A04(this), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
        this.A04 = wDSSwitch2;
        wDSSwitch2.setId(2131435173);
        ListItemWithLeftIcon listItemWithLeftIcon2 = this.A06;
        if (listItemWithLeftIcon2 == null) {
            C18070vi.A11("announcementGroupSetting");
            throw null;
        }
        SwitchCompat switchCompat2 = this.A04;
        if (switchCompat2 == null) {
            C18070vi.A11("sendMessagesSwitch");
            throw null;
        }
        listItemWithLeftIcon2.A08(switchCompat2);
        this.A09 = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131432458);
        WDSSwitch wDSSwitch3 = new WDSSwitch(AnonymousClass3MY.A04(this), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
        this.A01 = wDSSwitch3;
        wDSSwitch3.setId(2131432459);
        ListItemWithLeftIcon listItemWithLeftIcon3 = this.A09;
        if (listItemWithLeftIcon3 == null) {
            C18070vi.A11("memberAddModeSetting");
            throw null;
        }
        SwitchCompat switchCompat3 = this.A01;
        if (switchCompat3 == null) {
            C18070vi.A11("memberAddModeSwitch");
            throw null;
        }
        listItemWithLeftIcon3.A08(switchCompat3);
        this.A0A = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131434623);
        WDSSwitch wDSSwitch4 = new WDSSwitch(AnonymousClass3MY.A04(this), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
        this.A02 = wDSSwitch4;
        wDSSwitch4.setId(2131431294);
        ListItemWithLeftIcon listItemWithLeftIcon4 = this.A0A;
        if (listItemWithLeftIcon4 == null) {
            C18070vi.A11("membershipApprovalRequiredSetting");
            throw null;
        }
        SwitchCompat switchCompat4 = this.A02;
        if (switchCompat4 == null) {
            C18070vi.A11("membershipApprovalRequiredSwitch");
            throw null;
        }
        listItemWithLeftIcon4.A08(switchCompat4);
        ListItemWithLeftIcon listItemWithLeftIcon5 = this.A0A;
        if (listItemWithLeftIcon5 == null) {
            C18070vi.A11("membershipApprovalRequiredSetting");
            throw null;
        }
        C36401np linkifier = getLinkifier();
        ListItemWithLeftIcon listItemWithLeftIcon6 = this.A0A;
        if (listItemWithLeftIcon6 == null) {
            C18070vi.A11("membershipApprovalRequiredSetting");
            throw null;
        }
        Context context = listItemWithLeftIcon6.getContext();
        String string = getContext().getString(2131891151);
        ListItemWithLeftIcon listItemWithLeftIcon7 = this.A0A;
        if (listItemWithLeftIcon7 == null) {
            C18070vi.A11("membershipApprovalRequiredSetting");
            throw null;
        }
        listItemWithLeftIcon5.A07(linkifier.A06(context, new C21355Aik(this, 28), string, "", C72473Md.A05(listItemWithLeftIcon7)), true);
        this.A0B = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131434572);
        WDSSwitch wDSSwitch5 = new WDSSwitch(AnonymousClass3MY.A04(this), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
        this.A03 = wDSSwitch5;
        wDSSwitch5.setId(2131431293);
        ListItemWithLeftIcon listItemWithLeftIcon8 = this.A0B;
        if (listItemWithLeftIcon8 == null) {
            C18070vi.A11("reportToAdminSetting");
            throw null;
        }
        SwitchCompat switchCompat5 = this.A03;
        if (switchCompat5 == null) {
            C18070vi.A11("reportToAdminSwitch");
            throw null;
        }
        listItemWithLeftIcon8.A08(switchCompat5);
        View findViewById = findViewById(2131427690);
        C18070vi.A0z(findViewById, "null cannot be cast to non-null type android.view.View");
        findViewById.setVisibility(0);
        this.A07 = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131432256);
        this.A0E = C72453Mb.A0g(this, 2131431100);
        this.A08 = (ListItemWithLeftIcon) AnonymousClass3MX.A0C(this, 2131432260);
        ListItemWithLeftIcon listItemWithLeftIcon9 = this.A0C;
        if (listItemWithLeftIcon9 == null) {
            C18070vi.A11("restrictGroupPermissions");
            throw null;
        } else {
            C74793cj.A02(getContext(), listItemWithLeftIcon9, 2131889623);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00();
    }

    public GroupPermissionsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A00();
    }
}
