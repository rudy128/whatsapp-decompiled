package com.whatsapp.community.communitymedia;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CM;
import X.AnonymousClass4J5;
import X.AnonymousClass4S0;
import X.AnonymousClass5F9;
import X.AnonymousClass5FA;
import X.AnonymousClass5FB;
import X.AnonymousClass5FC;
import X.AnonymousClass5XF;
import X.AnonymousClass727;
import X.C104095Mv;
import X.C104105Mw;
import X.C104115Mx;
import X.C104905Py;
import X.C139956zi;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C27201Vd;
import X.C30391dr;
import X.C30451dy;
import X.C32211gp;
import X.C33251iW;
import X.C34511kb;
import X.C34531kd;
import X.C37581pm;
import X.C37961qT;
import X.C38391rD;
import X.C72473Md;
import X.C72483Me;
import X.C73373Vg;
import X.C79623vl;
import X.C84004Hm;
import X.C89894dC;
import X.C91004ez;
import X.C99274sY;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaImageView;
import com.whatsapp.search.views.TokenizedSearchInput;

public final class CommunityMediaActivity extends AnonymousClass1FY {
    public View A00;
    public LinearLayout A01;
    public AnonymousClass02B A02;
    public Toolbar A03;
    public RecyclerView A04;
    public AnonymousClass4J5 A05;
    public C34531kd A06;
    public C33251iW A07;
    public WaImageView A08;
    public C34511kb A09;
    public AnonymousClass5XF A0A;
    public C79623vl A0B;
    public C27201Vd A0C;
    public C32211gp A0D;
    public AnonymousClass1LU A0E;
    public TokenizedSearchInput A0F;
    public AnonymousClass727 A0G;
    public C139956zi A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public boolean A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;

    public CommunityMediaActivity() {
        this(0);
        Integer num = AnonymousClass00R.A01;
        this.A0O = AnonymousClass1DF.A00(num, new C104095Mv(this));
        this.A0P = AnonymousClass1DF.A00(num, new C104105Mw(this));
        this.A0Q = C99274sY.A00(new AnonymousClass5FB(this), new AnonymousClass5FC(this), new C104115Mx(this), AnonymousClass3MW.A15(C73373Vg.class));
        this.A0M = AnonymousClass1DF.A01(new AnonymousClass5FA(this));
        this.A0N = AnonymousClass1DF.A01(C104905Py.A00);
        this.A0L = AnonymousClass1DF.A01(new AnonymousClass5F9(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem icon = menu.add(0, 2131432620, 0, getResources().getString(2131899369)).setIcon(2131232271);
        C18070vi.A0X(icon);
        icon.setShowAsAction(10);
        icon.setShowAsAction(2);
        icon.setActionView(2131627506);
        View actionView = icon.getActionView();
        C18070vi.A0z(actionView, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        ImageView imageView = (ImageView) actionView;
        imageView.setEnabled(true);
        C89894dC.A00(imageView, this, 27);
        imageView.setImageResource(2131232271);
        AnonymousClass3MY.A0w(this, imageView, 2131899369);
        imageView.setImageTintList(ColorStateList.valueOf(AnonymousClass3Ma.A00(this, 2130970056, 2131101194)));
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A0K) {
            this.A0K = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A09 = AnonymousClass3MZ.A0b(r1);
            this.A0A = (AnonymousClass5XF) A0K2.A1z.get();
            this.A0C = AnonymousClass3MZ.A0i(r1);
            this.A0I = AnonymousClass3MX.A12(r1);
            this.A05 = (AnonymousClass4J5) A0K2.A20.get();
            this.A0B = (C79623vl) r2.A0w.get();
            this.A0H = (C139956zi) r1.AYQ.get();
            this.A0J = AnonymousClass3MX.A11(r1);
            this.A06 = AnonymousClass3MZ.A0R(r1);
            this.A0D = (C32211gp) r1.A9r.get();
            this.A0G = (AnonymousClass727) r2.A4e.get();
            this.A07 = AnonymousClass3MZ.A0U(r1);
            this.A0E = AnonymousClass3MY.A0Z(r1);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(AnonymousClass3MX.A0m(this.A0O), 105);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624586);
        this.A01 = (LinearLayout) AnonymousClass3MY.A0H(this, 2131429246);
        this.A03 = (Toolbar) AnonymousClass3MY.A0H(this, 2131429251);
        this.A04 = (RecyclerView) AnonymousClass3MY.A0H(this, 2131429250);
        this.A0F = (TokenizedSearchInput) AnonymousClass3MY.A0H(this, 2131432429);
        this.A08 = (WaImageView) AnonymousClass3MY.A0H(this, 2131432428);
        TokenizedSearchInput tokenizedSearchInput = this.A0F;
        if (tokenizedSearchInput == null) {
            C18070vi.A11("tokenizedSearchInput");
            throw null;
        }
        C18100vl r5 = this.A0Q;
        tokenizedSearchInput.A0F = (C73373Vg) r5.getValue();
        AnonymousClass1DS r3 = ((C73373Vg) r5.getValue()).A01;
        TokenizedSearchInput tokenizedSearchInput2 = this.A0F;
        if (tokenizedSearchInput2 == null) {
            C18070vi.A11("tokenizedSearchInput");
            throw null;
        }
        AnonymousClass3MY.A1K(this, r3, AnonymousClass3MW.A16(tokenizedSearchInput2, 21), 47);
        AnonymousClass1DS r32 = ((C73373Vg) r5.getValue()).A02;
        TokenizedSearchInput tokenizedSearchInput3 = this.A0F;
        if (tokenizedSearchInput3 == null) {
            C18070vi.A11("tokenizedSearchInput");
            throw null;
        }
        AnonymousClass3MY.A1K(this, r32, AnonymousClass3MW.A16(tokenizedSearchInput3, 22), 47);
        TokenizedSearchInput tokenizedSearchInput4 = this.A0F;
        if (tokenizedSearchInput4 == null) {
            C18070vi.A11("tokenizedSearchInput");
            throw null;
        }
        tokenizedSearchInput4.A0L();
        this.A00 = AnonymousClass3MY.A0H(this, 2131432427);
        AnonymousClass4S0 r0 = new AnonymousClass4S0(this, AnonymousClass4CM.NORMAL);
        View view = this.A00;
        if (view == null) {
            C18070vi.A11("searchContainer");
            throw null;
        }
        view.setBackground(r0.A01());
        RecyclerView recyclerView = this.A04;
        if (recyclerView == null) {
            C18070vi.A11("recyclerView");
            throw null;
        }
        recyclerView.setAdapter((C38391rD) this.A0M.getValue());
        RecyclerView recyclerView2 = this.A04;
        if (recyclerView2 == null) {
            C18070vi.A11("recyclerView");
            throw null;
        }
        AnonymousClass3Ma.A15(this, recyclerView2);
        RecyclerView recyclerView3 = this.A04;
        if (recyclerView3 == null) {
            C18070vi.A11("recyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator((C37961qT) null);
        Toolbar toolbar = this.A03;
        if (toolbar == null) {
            C18070vi.A11("mediaToolbar");
            throw null;
        }
        C18000vb r33 = this.A00;
        C18070vi.A0W(r33);
        C84004Hm.A00(this, toolbar, r33, AnonymousClass3MY.A0m(getResources(), 2131888623));
        C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
        CommunityMediaActivity$setupToolbarVisibility$1 communityMediaActivity$setupToolbarVisibility$1 = new CommunityMediaActivity$setupToolbarVisibility$1(this, (C30391dr) null);
        AnonymousClass1OR r4 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r4, communityMediaActivity$setupToolbarVisibility$1, A0H2);
        C30451dy.A02(A0w, r4, new CommunityMediaActivity$setupToolbarVisibility$2(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(A0w, r4, new CommunityMediaActivity$onCreate$3(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(A0w, r4, new CommunityMediaActivity$onCreate$4(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C30451dy.A02(A0w, r4, new CommunityMediaActivity$onCreate$5(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$6(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A00(new CommunityMediaActivity$onCreate$7(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$8(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$9(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$10(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$11(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$12(this, (C30391dr) null));
        AnonymousClass3MZ.A0H(this).A01(new CommunityMediaActivity$onCreate$13(this, (C30391dr) null));
    }

    public CommunityMediaActivity(int i) {
        this.A0K = false;
        C91004ez.A00(this, 10);
    }
}
