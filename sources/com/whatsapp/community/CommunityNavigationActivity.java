package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1Nb;
import X.AnonymousClass1Q1;
import X.AnonymousClass1YL;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Vh;
import X.AnonymousClass411;
import X.AnonymousClass4G7;
import X.AnonymousClass4J0;
import X.AnonymousClass4PV;
import X.AnonymousClass4aX;
import X.AnonymousClass8GM;
import X.Bq8;
import X.C000200d;
import X.C003401n;
import X.C110885hR;
import X.C143677Ei;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C203411t;
import X.C22621Co;
import X.C23520Bik;
import X.C24671Lf;
import X.C24921Me;
import X.C25161Nd;
import X.C25191Ng;
import X.C25231Nk;
import X.C27201Vd;
import X.C28281Zt;
import X.C28931bI;
import X.C32291gx;
import X.C32791hl;
import X.C34201k6;
import X.C34511kb;
import X.C35751mk;
import X.C36981om;
import X.C37451pZ;
import X.C37681px;
import X.C37691py;
import X.C37961qT;
import X.C39511tC;
import X.C40261uQ;
import X.C40401ue;
import X.C40631v1;
import X.C43421zm;
import X.C51082Wx;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74743cP;
import X.C77033p1;
import X.C77043p2;
import X.C84284Iw;
import X.C88114Yj;
import X.C90994ey;
import X.C91544fr;
import X.C91584fv;
import X.C91774gE;
import X.C95444mF;
import X.C96194nS;
import X.C96294nc;
import X.C98754rf;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.util.Log;

public class CommunityNavigationActivity extends AnonymousClass1FY {
    public TextView A00;
    public C19880zA A01;
    public C51082Wx A02;
    public C84284Iw A03;
    public C40261uQ A04;
    public AnonymousClass4PV A05;
    public C36981om A06;
    public AnonymousClass4J0 A07;
    public TextEmojiLabel A08;
    public WaImageView A09;
    public C34511kb A0A;
    public AnonymousClass8GM A0B;
    public AnonymousClass3Vh A0C;
    public C77033p1 A0D;
    public C40401ue A0E;
    public AnonymousClass1M9 A0F;
    public C24671Lf A0G;
    public C24921Me A0H;
    public C37451pZ A0I;
    public C37451pZ A0J;
    public C27201Vd A0K;
    public C32791hl A0L;
    public C25161Nd A0M;
    public C40631v1 A0N;
    public C37691py A0O;
    public C37681px A0P;
    public C22621Co A0Q;
    public AnonymousClass1CJ A0R;
    public AnonymousClass1NN A0S;
    public AnonymousClass1MZ A0T;
    public AnonymousClass1E7 A0U;
    public AnonymousClass1LU A0V;
    public AnonymousClass1BI A0W;
    public AnonymousClass1EC A0X;
    public C32291gx A0Y;
    public AnonymousClass1Nb A0Z;
    public C28931bI A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public boolean A0n;
    public boolean A0o;
    public final C25231Nk A0p;
    public final AnonymousClass3L6 A0q;
    public final C34201k6 A0r;

    public CommunityNavigationActivity() {
        this(0);
        this.A0r = new AnonymousClass411(this, 2);
        this.A0p = new C95444mF(this, 5);
        this.A0q = new C96294nc(this, 3);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.4Yj, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0I = this.A0K.A06(this, "community-navigation");
        this.A0J = this.A0K.A08("community-navigation-multi-contact", 0.0f, getResources().getDimensionPixelSize(2131166074));
        setContentView(2131624036);
        AnonymousClass1EC A0Y2 = C72473Md.A0Y(getIntent(), "parent_group_jid");
        this.A0X = A0Y2;
        AnonymousClass1E7 A0E2 = this.A0F.A0E(A0Y2);
        this.A0U = A0E2;
        if (A0E2 == null || this.A0R.A0T(this.A0X)) {
            A03(this, getString(2131888541));
            return;
        }
        C17880vN.A0V(this.A0l).registerObserver(this.A0r);
        this.A09 = (WaImageView) C110885hR.A0A(this, 2131429259);
        this.A00 = AnonymousClass3MW.A0I(this, 2131429260);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C110885hR.A0A(this, 2131429258);
        this.A08 = textEmojiLabel;
        C43421zm.A04(textEmojiLabel);
        AnonymousClass1HF.A0q(this.A08, true);
        AnonymousClass3MZ.A1K(this.A08, this, 2);
        Toolbar toolbar = (Toolbar) C110885hR.A0A(this, 2131429273);
        C003401n A0S2 = C72463Mc.A0S(this, toolbar);
        A0S2.A0W(true);
        A0S2.A0Y(false);
        toolbar.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A03(this, 2130971950, 2131103050, 2131231675), this.A00));
        if (AnonymousClass112.A00()) {
            AnonymousClass4G7.A00(toolbar, 2131429258);
        }
        AppBarLayout appBarLayout = (AppBarLayout) C110885hR.A0A(this, 2131429257);
        C003401n supportActionBar = getSupportActionBar();
        C18000vb r12 = this.A00;
        WaImageView waImageView = this.A09;
        TextEmojiLabel textEmojiLabel2 = this.A08;
        TextView textView = this.A00;
        C72483Me.A0e(this, supportActionBar);
        supportActionBar.A0G();
        View A0B2 = supportActionBar.A0B();
        C17960vV.A05(A0B2);
        Bq8 bq8 = new Bq8(A0B2, waImageView, textView, textEmojiLabel2, r12);
        appBarLayout.setExpanded(true);
        appBarLayout.A03(bq8);
        textView.setVisibility(0);
        if (AnonymousClass112.A01()) {
            C28281Zt.A05(this, AnonymousClass1YL.A00(this, 2130969367, 2131103205));
        }
        RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131429272);
        AnonymousClass3Ma.A15(this, recyclerView);
        recyclerView.setItemAnimator((C37961qT) null);
        C40401ue A002 = this.A04.A00(this.A0I, this.A0J, new C77043p2(this, this.A01, this, (C203411t) this.A0g.get()), 6);
        this.A0E = A002;
        recyclerView.setAdapter(A002);
        C40401ue r10 = this.A0E;
        C24671Lf r11 = this.A0G;
        C35751mk r9 = (C35751mk) this.A0f.get();
        AnonymousClass1NN r13 = this.A0S;
        C40631v1 r7 = new C40631v1((C39511tC) this.A0c.get(), r9, r10, r11, (AnonymousClass1Q1) this.A0e.get(), r13, (C25191Ng) this.A0i.get());
        this.A0N = r7;
        r7.A00();
        ? obj = new Object();
        C88114Yj.A00(obj);
        obj.A08 = false;
        obj.A04 = false;
        obj.A02 = true;
        obj.A03 = true;
        obj.A0I = true;
        obj.A07 = false;
        obj.A05 = false;
        obj.A09 = false;
        obj.A0G = false;
        obj.A0B = true;
        obj.A0A = true;
        obj.A0C = false;
        obj.A01 = true;
        obj.A0D = false;
        this.A0D = C77033p1.A00(this, this.A03, obj, this.A0X, 0);
        AnonymousClass8GM A003 = AnonymousClass8GM.A00(this, this.A02, this.A0X);
        this.A0B = A003;
        C91584fv.A00(this, A003.A03, 9);
        C91584fv.A00(this, this.A0B.A02, 13);
        AnonymousClass8GM r8 = this.A0B;
        r8.A00.A0A(this, new C91544fr(this, this.A0A, r8, new C96194nS(this, 1), 0));
        AnonymousClass4J0 r2 = this.A07;
        AnonymousClass1EC r1 = this.A0X;
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r1, 1);
        AnonymousClass3Vh r0 = (AnonymousClass3Vh) C91774gE.A00(this, r2, r1, 4).A00(AnonymousClass3Vh.class);
        this.A0C = r0;
        C91584fv.A00(this, r0.A00, 15);
        C91584fv.A00(this, this.A0D.A0F, 16);
        C91584fv.A00(this, this.A0D.A0D, 17);
        C91584fv.A00(this, this.A0D.A0w, 18);
        C91584fv.A00(this, this.A0D.A0z, 19);
        this.A0S.registerObserver(this.A0p);
        AnonymousClass3MW.A0e(this.A0h).A00(this.A0q);
        C91584fv.A00(this, this.A0D.A12, 10);
        C91584fv.A00(this, this.A0D.A11, 11);
        C37681px A004 = this.A06.A00(this, new C143677Ei(this, 0));
        this.A0P = A004;
        AnonymousClass11P r102 = this.A05;
        AnonymousClass1KB r72 = this.A05;
        AnonymousClass10I r132 = this.A05;
        this.A0O = new C37691py(this, r72, this.A0M, A004, r102, this.A0Q, this.A0Z, r132);
    }

    public static void A03(CommunityNavigationActivity communityNavigationActivity, String str) {
        if (!(!communityNavigationActivity.A0H) && !communityNavigationActivity.A0o) {
            Intent A022 = AnonymousClass1LU.A02(communityNavigationActivity);
            A022.putExtra("snackbar_message", str);
            A022.setFlags(67108864);
            communityNavigationActivity.startActivity(A022);
            communityNavigationActivity.A0o = true;
        }
    }

    public void A2y() {
        if (!this.A0n) {
            this.A0n = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A0V = AnonymousClass3MY.A0Z(r2);
            this.A0R = AnonymousClass3Ma.A0d(r2);
            this.A0Q = (C22621Co) r2.A27.get();
            this.A0K = AnonymousClass3MZ.A0i(r2);
            this.A0F = AnonymousClass10E.A4z(r2);
            this.A0M = (C25161Nd) r2.A2v.get();
            this.A0H = AnonymousClass3MZ.A0g(r2);
            this.A0m = C000200d.A00(r3.A55);
            this.A0G = AnonymousClass3Ma.A0S(r2);
            this.A01 = C19890zB.A00;
            this.A0j = AnonymousClass3MX.A0z(r2);
            this.A0b = C000200d.A00(r3.A00);
            this.A0Z = AnonymousClass3MZ.A11(r2);
            this.A0e = C000200d.A00(r2.A2A);
            this.A0f = C000200d.A00(r2.A2F);
            this.A0g = C000200d.A00(r2.A2M);
            this.A0Y = (C32291gx) r2.A6X.get();
            this.A0A = AnonymousClass3MZ.A0b(r2);
            this.A0d = C000200d.A00(r2.A25);
            this.A0l = C000200d.A00(r2.A7s);
            this.A0S = AnonymousClass3Ma.A0e(r2);
            this.A0L = (C32791hl) r2.A2t.get();
            this.A04 = (C40261uQ) A0K2.A1n.get();
            this.A0c = C000200d.A00(r2.A1K);
            this.A0T = AnonymousClass3MY.A0V(r2);
            this.A0h = C000200d.A00(r2.A4m);
            this.A0i = C000200d.A00(r2.A4u);
            this.A02 = (C51082Wx) A0K2.A1V.get();
            this.A0k = AnonymousClass3MX.A11(r2);
            this.A03 = (C84284Iw) A0K2.A1Z.get();
            this.A05 = (AnonymousClass4PV) A0K2.A1o.get();
            this.A06 = (C36981om) A0K2.A1p.get();
            this.A07 = (AnonymousClass4J0) A0K2.A1q.get();
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 3858)) {
            AnonymousClass3MX.A0u(this.A0k).A02((AnonymousClass1BI) null, 7);
        }
    }

    public void onDestroy() {
        C37451pZ r0 = this.A0I;
        if (r0 != null) {
            r0.A02();
        }
        C37451pZ r02 = this.A0J;
        if (r02 != null) {
            r02.A02();
        }
        if (this.A0l.get() != null) {
            C17880vN.A0V(this.A0l).unregisterObserver(this.A0r);
        }
        AnonymousClass1NN r1 = this.A0S;
        if (r1 != null) {
            r1.unregisterObserver(this.A0p);
        }
        C40631v1 r03 = this.A0N;
        if (r03 != null) {
            r03.A01();
        }
        if (this.A0h.get() != null) {
            AnonymousClass3MW.A0e(this.A0h).A01(this.A0q);
        }
        super.onDestroy();
    }

    public void onStop() {
        C77033p1 r2 = this.A0D;
        if (r2 != null) {
            C17900vP.A0Y(r2, "CommunitySubgroupsViewModel/updateActivitySeen: ", AnonymousClass000.A10());
            C98754rf.A00(r2.A10, r2, 19);
        }
        super.onStop();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131820554, menu);
        if (this.A0T.A0K(this.A0X)) {
            menu.add(0, 2131429270, 0, getString(2131886447));
            if (C18020vd.A05(C18040vf.A02, this.A0E, 3829)) {
                menu.add(0, 2131429268, 0, getString(2131886445));
            }
            menu.findItem(2131429271).setVisible(false);
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0E, 12671) || this.A0T.A0P(this.A0X)) {
            return true;
        }
        menu.add(0, 2131429269, 0, getString(2131890178));
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("snackbar_message");
            if (!TextUtils.isEmpty(stringExtra)) {
                C23520Bik.A02(findViewById(16908290), stringExtra, 0).A08();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131429271) {
            this.A01.A0B(this, AnonymousClass1LU.A0r(this, this.A0X, false), "communityNavigation");
            return true;
        } else if (menuItem.getItemId() == 2131429267) {
            AnonymousClass3MX.A0b(this.A0g).CAo(this, this.A00, this.A0X);
            return true;
        } else if (menuItem.getItemId() == 2131429268) {
            this.A01.A08(this, AnonymousClass1LU.A19(this, this.A0X));
            return true;
        } else if (menuItem.getItemId() == 2131429270) {
            AnonymousClass1EC r1 = this.A0X;
            C18070vi.A0d(r1, 0);
            Log.i("CommunityAddMembersBottomSheet/newInstance");
            CommunityAddMembersBottomSheet communityAddMembersBottomSheet = new CommunityAddMembersBottomSheet();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("parent_jid", r1.getRawString());
            communityAddMembersBottomSheet.A1R(A0D2);
            CMk(communityAddMembersBottomSheet, "CommunityAddMembersBottomSheet/");
            return true;
        } else if (menuItem.getItemId() != 2131429269) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0B.A0T();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0R.A0T(this.A0X)) {
            A03(this, getString(2131888541));
        }
    }

    public CommunityNavigationActivity(int i) {
        this.A0n = false;
        C90994ey.A00(this, 49);
    }
}
