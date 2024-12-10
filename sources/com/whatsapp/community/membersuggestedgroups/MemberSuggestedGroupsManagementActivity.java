package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4J6;
import X.AnonymousClass5FG;
import X.AnonymousClass5FH;
import X.AnonymousClass5FI;
import X.AnonymousClass5FJ;
import X.AnonymousClass5FK;
import X.AnonymousClass5FL;
import X.AnonymousClass5FM;
import X.AnonymousClass5FN;
import X.AnonymousClass5FO;
import X.AnonymousClass5FP;
import X.AnonymousClass5N0;
import X.C000200d;
import X.C010105w;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C23520Bik;
import X.C30391dr;
import X.C30451dy;
import X.C36401np;
import X.C37581pm;
import X.C37961qT;
import X.C38391rD;
import X.C41561wd;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C84004Hm;
import X.C89894dC;
import X.C91004ez;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;

public final class MemberSuggestedGroupsManagementActivity extends AnonymousClass1FY {
    public C010105w A00;
    public C23520Bik A01;
    public AnonymousClass4J6 A02;
    public C36401np A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;

    public MemberSuggestedGroupsManagementActivity() {
        this(0);
        this.A0F = AnonymousClass1DF.A01(new AnonymousClass5FO(this));
        this.A06 = AnonymousClass1DF.A01(new AnonymousClass5FG(this));
        this.A07 = AnonymousClass1DF.A01(new AnonymousClass5FH(this));
        this.A0A = AnonymousClass1DF.A01(new AnonymousClass5FK(this));
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5FJ(this));
        this.A08 = AnonymousClass1DF.A01(new AnonymousClass5FI(this));
        this.A0D = AnonymousClass1DF.A01(new AnonymousClass5FN(this));
        this.A0C = AnonymousClass1DF.A01(new AnonymousClass5FM(this));
        this.A0B = AnonymousClass1DF.A01(new AnonymousClass5FL(this));
        this.A0G = AnonymousClass1DF.A01(new AnonymousClass5FP(this));
        this.A0E = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5N0(this));
    }

    public static final void A03(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, int i) {
        AnonymousClass3MX.A0v(memberSuggestedGroupsManagementActivity.A0A).A04(i);
        C72453Mb.A0T(memberSuggestedGroupsManagementActivity.A08).setVisibility(i);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A04 = C000200d.A00(r2.A2M);
            this.A03 = AnonymousClass3MY.A0e(r1);
            this.A02 = (AnonymousClass4J6) A0K.A21.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625996);
        C37581pm A0H = AnonymousClass3MZ.A0H(this);
        MemberSuggestedGroupsManagementActivity$setupLoading$1$1 memberSuggestedGroupsManagementActivity$setupLoading$1$1 = new MemberSuggestedGroupsManagementActivity$setupLoading$1$1((FrameLayout) this.A00.findViewById(2131433358), this, (C30391dr) null);
        AnonymousClass1OR r2 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r2, memberSuggestedGroupsManagementActivity$setupLoading$1$1, A0H);
        Toolbar toolbar = (Toolbar) this.A00.findViewById(2131432473);
        C18070vi.A0b(toolbar);
        C18000vb r1 = this.A00;
        C18070vi.A0W(r1);
        C84004Hm.A00(this, toolbar, r1, "");
        C30451dy.A02(A0w, r2, new MemberSuggestedGroupsManagementActivity$setupToolbar$1$1(toolbar, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        WaTextView A0U = AnonymousClass3MW.A0U(this.A00, 2131432468);
        C30451dy.A02(A0w, r2, new MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1(A0U, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        RecyclerView recyclerView = (RecyclerView) this.A0F.getValue();
        recyclerView.setAdapter((C38391rD) this.A07.getValue());
        AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
        recyclerView.setItemAnimator((C37961qT) null);
        C30451dy.A02(A0w, r2, new MemberSuggestedGroupsManagementActivity$setupRecyclerView$1$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(A0w, r2, new MemberSuggestedGroupsManagementActivity$setupButtons$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C89894dC.A00(this.A00.findViewById(2131432472), this, 29);
        C89894dC.A00(this.A00.findViewById(2131432466), this, 30);
        C30451dy.A02(A0w, r2, new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        AnonymousClass3MZ.A0H(this).A01(new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this, (C30391dr) null));
        MemberSuggestedGroupsManagementViewModel A0Q = AnonymousClass3Ma.A0Q(this);
        C30451dy.A02(A0w, A0Q.A07, new MemberSuggestedGroupsManagementViewModel$initialize$1(A0Q, (C30391dr) null), C41561wd.A00(A0Q));
    }

    public MemberSuggestedGroupsManagementActivity(int i) {
        this.A05 = false;
        C91004ez.A00(this, 12);
    }
}
