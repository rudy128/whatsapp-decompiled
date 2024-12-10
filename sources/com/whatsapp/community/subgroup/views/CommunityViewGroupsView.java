package com.whatsapp.community.subgroup.views;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1EC;
import X.AnonymousClass1GP;
import X.AnonymousClass1L9;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C106085Um;
import X.C17880vN;
import X.C18070vi;
import X.C27132DVt;
import X.C27691Xc;
import X.C32111gf;
import X.C72463Mc;
import X.C77033p1;
import X.C90004dN;
import X.C91644g1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;

public final class CommunityViewGroupsView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1L9 A00;
    public AnonymousClass1EC A01;
    public AnonymousClass00H A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final ListItemWithLeftIcon A05;
    public final View A06;
    public final C77033p1 A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityViewGroupsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A04) {
            this.A04 = true;
            C27691Xc.A0p((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        AnonymousClass01E r2 = (AnonymousClass01E) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        View inflate = View.inflate(context, 2131624605, this);
        C18070vi.A0X(inflate);
        this.A06 = inflate;
        this.A05 = (ListItemWithLeftIcon) C18070vi.A05(inflate, 2131429297);
        this.A07 = (C77033p1) AnonymousClass3MW.A0N(r2).A00(C77033p1.class);
        setViewGroupsCount(r2);
        setViewClickListener(r2);
    }

    public final void setActivityUtils$app_product_community_community(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityNavigator$app_product_community_community(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final void setViewClickListener(AnonymousClass01E r3) {
        C90004dN.A00(this.A05, this, r3, 19);
    }

    private final void setViewGroupsCount(AnonymousClass01E r4) {
        C91644g1.A00(r4, this.A07.A0w, new C106085Um(r4, this), 1);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1L9 getActivityUtils$app_product_community_community() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass00H getCommunityNavigator$app_product_community_community() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("communityNavigator");
        throw null;
    }

    public static final void setViewClickListener$lambda$0(CommunityViewGroupsView communityViewGroupsView, AnonymousClass01E r8, View view) {
        C18070vi.A0h(communityViewGroupsView, r8);
        C32111gf A0b = AnonymousClass3MX.A0b(communityViewGroupsView.getCommunityNavigator$app_product_community_community());
        AnonymousClass1EC r5 = communityViewGroupsView.A01;
        if (r5 != null) {
            AnonymousClass1GP A0O = AnonymousClass3MX.A0O(r8);
            AnonymousClass1EC r3 = communityViewGroupsView.A01;
            if (r3 != null) {
                CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = new CommunityNewSubgroupSwitcherBottomSheet();
                C72463Mc.A11(C17880vN.A0D(), communityNewSubgroupSwitcherBottomSheet, r3, "community_jid");
                A0b.CNK(A0O, r5, new C27132DVt((Object) communityNewSubgroupSwitcherBottomSheet, 30));
                return;
            }
        }
        C18070vi.A11("parentJid");
        throw null;
    }

    public CommunityViewGroupsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            C27691Xc.A0p((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public /* synthetic */ CommunityViewGroupsView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityViewGroupsView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
