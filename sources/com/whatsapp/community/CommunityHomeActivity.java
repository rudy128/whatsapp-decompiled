package com.whatsapp.community;

import X.A2B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass11E;
import X.AnonymousClass126;
import X.AnonymousClass129;
import X.AnonymousClass12M;
import X.AnonymousClass18O;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1PU;
import X.AnonymousClass1Y5;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3TH;
import X.AnonymousClass3VF;
import X.AnonymousClass40f;
import X.AnonymousClass411;
import X.AnonymousClass48l;
import X.AnonymousClass4G7;
import X.AnonymousClass4G9;
import X.AnonymousClass4PT;
import X.AnonymousClass4QE;
import X.AnonymousClass4RP;
import X.AnonymousClass4VI;
import X.AnonymousClass4a6;
import X.AnonymousClass5X7;
import X.AnonymousClass5Z1;
import X.AnonymousClass8GM;
import X.Bq9;
import X.C003401n;
import X.C106935Xt;
import X.C110885hR;
import X.C134026pt;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C222219b;
import X.C22801Dg;
import X.C23520Bik;
import X.C24921Me;
import X.C25011Mn;
import X.C25231Nk;
import X.C27201Vd;
import X.C28281Zt;
import X.C28931bI;
import X.C32111gf;
import X.C34201k6;
import X.C36331ni;
import X.C36401np;
import X.C37451pZ;
import X.C51082Wx;
import X.C56552he;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C73323Un;
import X.C74443Zz;
import X.C75203eA;
import X.C77033p1;
import X.C82974Cw;
import X.C84274Iv;
import X.C84284Iw;
import X.C88114Yj;
import X.C89894dC;
import X.C91184fH;
import X.C91374fa;
import X.C91494fm;
import X.C91544fr;
import X.C91574fu;
import X.C91584fv;
import X.C91774gE;
import X.C91784gF;
import X.C91894gQ;
import X.C93924jl;
import X.C95444mF;
import X.C96194nS;
import X.C96294nc;
import X.C98754rf;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.communityInfo.CAGInfoFragment;
import com.whatsapp.community.communityInfo.CommunityHomeFragment;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.util.List;

public class CommunityHomeActivity extends C75203eA {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public Space A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public SearchView A0D;
    public ViewPager2 A0E;
    public AppBarLayout A0F;
    public C84274Iv A0G;
    public C51082Wx A0H;
    public AnonymousClass4PT A0I;
    public C84284Iw A0J;
    public C56552he A0K;
    public TextEmojiLabel A0L;
    public TextEmojiLabel A0M;
    public Bq9 A0N;
    public AnonymousClass5Z1 A0O;
    public AnonymousClass5X7 A0P;
    public CommunityMembersViewModel A0Q;
    public C77033p1 A0R;
    public AnonymousClass4RP A0S;
    public AnonymousClass1M9 A0T;
    public C24921Me A0U;
    public C37451pZ A0V;
    public C27201Vd A0W;
    public C73323Un A0X;
    public AnonymousClass1CJ A0Y;
    public AnonymousClass1NN A0Z;
    public AnonymousClass1MZ A0a;
    public AnonymousClass1E7 A0b;
    public C106935Xt A0c;
    public AnonymousClass3VF A0d;
    public AnonymousClass4VI A0e;
    public AnonymousClass126 A0f;
    public AnonymousClass12M A0g;
    public AnonymousClass1LU A0h;
    public AnonymousClass1EC A0i;
    public AnonymousClass1EC A0j;
    public C25011Mn A0k;
    public AnonymousClass129 A0l;
    public C36331ni A0m;
    public AnonymousClass1PU A0n;
    public C36401np A0o;
    public C28931bI A0p;
    public C28931bI A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public long A0x;
    public AnonymousClass8GM A0y;
    public boolean A0z;
    public boolean A10;
    public final C25231Nk A11 = new C95444mF(this, 4);
    public final AnonymousClass3L6 A12 = new C96294nc(this, 1);
    public final C34201k6 A13 = new AnonymousClass411(this, 1);

    public int A31() {
        return 579544921;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onStop() {
        this.A0z = true;
        C77033p1 r2 = this.A0R;
        if (r2 != null) {
            C17900vP.A0Y(r2, "CommunitySubgroupsViewModel/updateActivitySeen: ", AnonymousClass000.A10());
            C98754rf.A00(r2.A10, r2, 19);
        }
        super.onStop();
    }

    public static void A03(CommunityHomeActivity communityHomeActivity, C82974Cw r8, int i) {
        int i2;
        communityHomeActivity.A00 = i;
        C82974Cw r0 = C82974Cw.DEACTIVATED;
        TextView textView = communityHomeActivity.A0B;
        if (r8 == r0) {
            i2 = 2131888532;
        } else if (i > 0) {
            Resources resources = communityHomeActivity.getResources();
            Integer valueOf = Integer.valueOf(i);
            AnonymousClass3MX.A1E(resources, textView, new Object[]{valueOf}, 2131755310, i);
            TextView textView2 = communityHomeActivity.A0A;
            AnonymousClass3MX.A1E(communityHomeActivity.getResources(), textView2, new Object[]{valueOf}, 2131755310, i);
            return;
        } else {
            i2 = 2131893527;
        }
        textView.setText(i2);
        communityHomeActivity.A0A.setText(i2);
    }

    public static void A0Q(CommunityHomeActivity communityHomeActivity, String str) {
        if (!(!communityHomeActivity.A0H) && !communityHomeActivity.A10) {
            Intent A022 = AnonymousClass1LU.A02(communityHomeActivity);
            A022.putExtra("snackbar_message", str);
            A022.setFlags(67108864);
            communityHomeActivity.startActivity(A022);
            communityHomeActivity.A10 = true;
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 3858)) {
            AnonymousClass3MX.A0u(this.A0v).A02(this.A0j, 2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i == 16) {
                C72463Mc.A1B(((AnonymousClass3TH) AnonymousClass3MW.A0N(this).A00(AnonymousClass3TH.class)).A00);
            } else if (i == 123) {
                if (intent != null && i2 == -1 && this.A0e.A02(true) && this.A0b != null) {
                    String stringExtra = intent.getStringExtra("extra_community_name");
                    if (stringExtra != null && this.A0e.A01(stringExtra)) {
                        C77033p1 r2 = this.A0R;
                        AnonymousClass1EC r5 = this.A0j;
                        r2.A07 = stringExtra;
                        C72463Mc.A1B(r2.A0y);
                        r2.A0l.A0E(new AnonymousClass40f(r2, r2.A0a, r2.A0k, r5, r2.A07));
                    }
                    String stringExtra2 = intent.getStringExtra("extra_community_description");
                    if (stringExtra2 != null) {
                        this.A0R.A0V(this.A0b, stringExtra2);
                        return;
                    }
                    return;
                }
                return;
            }
            super.onActivityResult(i, i2, intent);
        } else if (intent != null && i2 == -1) {
            if (intent.getBooleanExtra("transfer_ownership_successful", false)) {
                C72453Mb.A1B(findViewById(2131429814));
                String A0R2 = C17890vO.A0R(this, intent.getStringExtra("transfer_ownership_admin_short_name"), 1, 0, 2131888555);
                if (!isFinishing() && !isDestroyed()) {
                    C23520Bik.A02(this.A00, A0R2, -1).A08();
                    return;
                }
                return;
            }
            String stringExtra3 = intent.getStringExtra("transfer_ownership_admin_short_name");
            if (stringExtra3 != null) {
                C73203Rj A002 = AnonymousClass4a6.A00(this);
                A002.A0S(stringExtra3);
                C73203Rj.A06(A002);
                A002.A0C();
            }
        }
    }

    public void onBackPressed() {
        if (C72463Mc.A1O(this.A0R.A00.A03)) {
            C93924jl r2 = this.A0R.A00;
            AnonymousClass3MY.A1L(r2.A03, false);
            r2.A01.accept(Integer.valueOf(r2.A00));
            r2.A04.run();
        } else if (this.A0z) {
            C32111gf A0b2 = AnonymousClass3MX.A0b(this.A0s);
            if (A0b2.A00.A07()) {
                A0b2.A0A.get();
            }
            AnonymousClass1L9 r22 = A0b2.A01;
            A0b2.A0C.get();
            Intent A022 = AnonymousClass1LU.A02(this);
            A022.setFlags(67108864);
            r22.A08(this, A022);
        } else {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        C37451pZ r0 = this.A0V;
        if (r0 != null) {
            r0.A02();
        }
        if (this.A0t.get() != null) {
            AnonymousClass3MW.A0e(this.A0t).A01(this.A12);
        }
        if (this.A0w.get() != null) {
            C17880vN.A0V(this.A0w).unregisterObserver(this.A13);
        }
        AnonymousClass1NN r1 = this.A0Z;
        if (r1 != null) {
            r1.unregisterObserver(this.A11);
        }
        super.onDestroy();
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        A33.A04 = true;
        A33.A00((String) null, 9);
        return A33;
    }

    public void onCreate(Bundle bundle) {
        Drawable navigationIcon;
        this.A0x = SystemClock.uptimeMillis();
        super.onCreate(bundle);
        A3D("render_community_home");
        this.A0j = C72473Md.A0Y(getIntent(), "parent_group_jid");
        A2B A012 = AnonymousClass3MW.A0Z(this.A0r).A01(this.A0j);
        if (A012 != null) {
            this.A0i = (AnonymousClass1EC) A012.A02;
        }
        this.A0V = this.A0W.A06(this, "community-home");
        setContentView(2131624035);
        TabLayout tabLayout = (TabLayout) findViewById(2131436000);
        this.A0E = (ViewPager2) findViewById(2131433401);
        C74443Zz r6 = new C74443Zz(this);
        AnonymousClass1EC r4 = this.A0j;
        C18070vi.A0d(r4, 0);
        CommunityHomeFragment communityHomeFragment = new CommunityHomeFragment();
        C72463Mc.A11(C17880vN.A0D(), communityHomeFragment, r4, "parentJid");
        String string = getString(2131888532);
        List list = r6.A00;
        list.add(communityHomeFragment);
        List list2 = r6.A01;
        list2.add(string);
        AnonymousClass1EC r42 = this.A0i;
        if (r42 != null) {
            CAGInfoFragment cAGInfoFragment = new CAGInfoFragment();
            C72463Mc.A11(C17880vN.A0D(), cAGInfoFragment, r42, "cagJid");
            String string2 = getString(2131888507);
            list.add(cAGInfoFragment);
            list2.add(string2);
        }
        int intExtra = getIntent().getIntExtra("tab_start_position", 0);
        this.A0E.setAdapter(r6);
        this.A0E.A03(intExtra, true);
        this.A0E.setUserInputEnabled(false);
        new C134026pt(this.A0E, tabLayout, new C91894gQ(r6, this)).A00();
        C98754rf.A01(this.A05, this, 9);
        AnonymousClass1E7 A0E2 = this.A0T.A0E(this.A0j);
        this.A0b = A0E2;
        if (A0E2 == null || this.A0Y.A0T(this.A0j)) {
            A0Q(this, getString(2131888541));
            return;
        }
        C17880vN.A0V(this.A0w).registerObserver(this.A13);
        this.A0X = (C73323Un) C91774gE.A00(this, this.A0b, this.A0G, 8).A00(C73323Un.class);
        C88114Yj r5 = new C88114Yj();
        r5.A00 = 10;
        r5.A0H = true;
        r5.A09 = true;
        r5.A0C = true;
        r5.A0G = true;
        r5.A0B = false;
        r5.A0D = false;
        this.A0R = C77033p1.A00(this, this.A0J, r5, this.A0j, 1);
        AnonymousClass8GM A002 = AnonymousClass8GM.A00(this, this.A0H, this.A0j);
        this.A0y = A002;
        C22801Dg r7 = A002.A00;
        C96194nS r62 = new C96194nS(this, 0);
        r7.A0A(this, new C91544fr(this, this.A0r.get(), this.A0y, r62, 0));
        this.A08 = (ImageView) C110885hR.A0A(this, 2131429220);
        this.A0M = (TextEmojiLabel) C110885hR.A0A(this, 2131429219);
        this.A0L = (TextEmojiLabel) C110885hR.A0A(this, 2131429176);
        this.A0A = AnonymousClass3MW.A0I(this, 2131429177);
        this.A0B = AnonymousClass3MW.A0I(this, 2131429221);
        this.A06 = C110885hR.A0A(this, 2131429011);
        this.A05 = C110885hR.A0A(this, 2131431359);
        Toolbar A0F2 = AnonymousClass3Ma.A0F(this);
        C003401n A0S2 = C72463Mc.A0S(this, A0F2);
        A0S2.A0W(true);
        A0S2.A0Y(false);
        if (!C28281Zt.A0B(this) && (navigationIcon = A0F2.getNavigationIcon()) != null) {
            navigationIcon.setColorFilter(AnonymousClass3Ma.A01(this, getResources(), 2130969324, 2131100309), PorterDuff.Mode.SRC_ATOP);
            A0F2.setNavigationIcon(navigationIcon);
        }
        if (AnonymousClass112.A00()) {
            AnonymousClass4G7.A00(A0F2, 2131429220);
            this.A0L.setAccessibilityTraversalAfter(2131429220);
            this.A0A.setAccessibilityTraversalAfter(2131429220);
        }
        AnonymousClass1Y5.A0A(this.A0M, true);
        AnonymousClass1Y5.A0A(this.A0L, true);
        this.A0F = (AppBarLayout) C110885hR.A0A(this, 2131427813);
        C72483Me.A0e(this, A0S2);
        A0S2.A0G();
        C17960vV.A05(A0S2.A0B());
        SearchView searchView = (SearchView) C110885hR.A0A(this, 2131434976);
        this.A0D = searchView;
        TextView A0J2 = AnonymousClass3MW.A0J(searchView, 2131434969);
        this.A0C = A0J2;
        C72463Mc.A0y(this, A0J2, 2130971105, 2131102431);
        View findViewById = findViewById(2131434880);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.setMarginStart(0);
                findViewById.setLayoutParams(marginLayoutParams);
            } else {
                C17960vV.A0F(false, "Unexpected LayoutParams for search edit frame. Margins not updated.");
            }
        }
        this.A0D.setQueryHint(getString(2131895489));
        this.A0D.setIconifiedByDefault(false);
        C91184fH.A00(this.A0D, this, 2);
        this.A0p = C72453Mb.A0r(this, 2131429239);
        this.A0q = C72453Mb.A0r(this, 2131429240);
        this.A03 = AnonymousClass3MX.A0G(this, 2131429238).inflate();
        this.A09 = (Space) C110885hR.A0A(this, 2131429241);
        View A062 = AnonymousClass1HF.A06(this.A03, 2131427525);
        this.A07 = A062;
        AnonymousClass48l.A00(A062, this, 45);
        View A063 = AnonymousClass1HF.A06(this.A03, 2131427469);
        this.A01 = A063;
        AnonymousClass48l.A00(A063, this, 46);
        C91584fv.A00(this, this.A0R.A0v, 2);
        this.A02 = AnonymousClass1HF.A06(this.A03, 2131427470);
        this.A0S = this.A0K.A00(this.A0j);
        ((WDSActionTile) this.A02).setText(2131888533);
        AnonymousClass48l.A00(this.A02, this, 47);
        C91584fv.A00(this, this.A0R.A0v, 1);
        C91574fu.A00(this, this.A0R.A0w, 44);
        C91574fu.A00(this, this.A0R.A0F, 45);
        C91584fv.A00(this, this.A0R.A0D, 0);
        getSupportFragmentManager().A0t(new C91374fa(this, 9), this, "NewCommunityAdminBottomSheetFragment");
        C91574fu.A00(this, this.A0X.A02, 46);
        AnonymousClass3MW.A0e(this.A0t).A00(this.A12);
        this.A0Z.registerObserver(this.A11);
        C91574fu.A00(this, this.A0R.A14, 47);
        C91574fu.A00(this, this.A0R.A13, 48);
        C91574fu.A00(this, this.A0R.A12, 49);
        C91584fv.A00(this, this.A0R.A0O.A03, 3);
        C91584fv.A00(this, this.A0R.A0E, 4);
        C91584fv.A00(this, this.A0R.A0C, 5);
        C91584fv.A00(this, this.A0R.A00.A03, 6);
        this.A0Q = AnonymousClass4G9.A00(this, this.A0P, this.A0j);
        C89894dC.A00(this.A08, this, 8);
        AnonymousClass3MW.A1Q(this.A08);
        AnonymousClass1EC r17 = this.A0j;
        AnonymousClass1KB r15 = this.A05;
        C25011Mn r11 = this.A0k;
        AnonymousClass18O r10 = this.A06;
        C18000vb r9 = this.A00;
        C24921Me r8 = this.A0U;
        AnonymousClass1M9 r72 = this.A0T;
        AnonymousClass126 r63 = this.A0f;
        AnonymousClass12M r52 = this.A0g;
        AnonymousClass11E r43 = this.A07;
        C24921Me r22 = r8;
        C18000vb r23 = r9;
        AnonymousClass11E r20 = r43;
        AnonymousClass1M9 r21 = r72;
        AnonymousClass1KB r18 = r15;
        AnonymousClass18O r19 = r10;
        this.A0e = new AnonymousClass4VI((View) null, this, r18, r19, r20, r21, r22, r23, this.A0Z, this.A0a, r63, (AnonymousClass4QE) this.A0u.get(), r52, r17, r11);
        AnonymousClass1EC r2 = this.A0i;
        if (r2 != null) {
            this.A0d = (AnonymousClass3VF) C91784gF.A00(this, r2, this.A0c, this.A00, 4).A00(AnonymousClass3VF.class);
        }
        this.A0Q.A03.A0A(this, new C91494fm(this.A0I.A00(this, this.A0Q), this, 5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432511) {
            startActivity(AnonymousClass1LU.A0l(this, this.A0j));
            return true;
        } else if (menuItem.getItemId() == 2131432500) {
            AnonymousClass1EC r3 = this.A0j;
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(getPackageName(), "com.whatsapp.community.EditCommunityActivity");
            AnonymousClass3MY.A13(A0A2, r3, "extra_community_jid");
            startActivityForResult(A0A2, 123);
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == 2131432522) {
            this.A01.A0B(this, AnonymousClass1LU.A0r(this, this.A0j, false), "communityHome");
            return true;
        } else {
            super.onOptionsItemSelected(menuItem);
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0Y.A0T(this.A0j)) {
            A0Q(this, getString(2131888541));
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0x > 0) {
            A3C("render_community_home");
            Biu(2);
            this.A0m.A00(9, SystemClock.uptimeMillis() - this.A0x);
            this.A0x = 0;
        }
    }
}
