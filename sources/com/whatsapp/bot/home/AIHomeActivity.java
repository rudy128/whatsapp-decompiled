package com.whatsapp.bot.home;

import X.AFB;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CB;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.AnonymousClass7PB;
import X.AnonymousClass83U;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C109005cf;
import X.C1420377x;
import X.C148377hL;
import X.C148387hM;
import X.C155157sI;
import X.C157617xn;
import X.C157627xo;
import X.C157637xp;
import X.C157647xq;
import X.C157657xr;
import X.C157667xs;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C27621Wu;
import X.C33251iW;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.search.WDSSearchBar;

public final class AIHomeActivity extends AnonymousClass1FY {
    public C33251iW A00;
    public AnonymousClass118 A01;
    public AnonymousClass1CJ A02;
    public WDSSearchBar A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public final C18100vl A07;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem icon = menu.add(0, 2131432620, 0, 2131899369).setIcon(2131232271);
        icon.setShowAsAction(1);
        View actionView = icon.getActionView();
        if (actionView != null) {
            AnonymousClass3MY.A0w(this, actionView, 2131899369);
        }
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A01, AnonymousClass3MW.A0X(r0).A00, 12393)) {
                MenuItem icon2 = menu.add(0, 2131432585, 0, 2131886599).setIcon(2131231662);
                icon2.setShowAsAction(1);
                View actionView2 = icon2.getActionView();
                if (actionView2 != null) {
                    AnonymousClass3MY.A0w(this, actionView2, 2131886599);
                }
            }
            return super.onCreateOptionsMenu(menu);
        }
        C18070vi.A11("botGating");
        throw null;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem findItem = menu.findItem(2131432620);
        if (findItem != null) {
            findItem.setVisible(C72463Mc.A1Y(C108945cZ.A0b(this.A07).A00.A06()));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A04 = C000200d.A00(A0A.A14);
            this.A02 = AnonymousClass3Ma.A0d(A0A);
            this.A00 = AnonymousClass3MZ.A0U(A0A);
            this.A01 = AnonymousClass3MZ.A0l(A0A);
            this.A05 = AnonymousClass3MW.A0s(A0A);
        }
    }

    public boolean onSearchRequested() {
        WDSSearchBar wDSSearchBar = this.A03;
        if (wDSSearchBar == null) {
            C18070vi.A11("wdsSearchBar");
            throw null;
        }
        if (!AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility()) && getSupportFragmentManager().A0Q("ai_home_search_fragment") == null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0G = true;
            A0H.A0H("ai_home_search_fragment");
            A0H.A0C(new AiHomeSearchFragment(), "ai_home_search_fragment", 2131431000);
            A0H.A01();
        }
        return false;
    }

    public AIHomeActivity(int i) {
        this.A06 = false;
        AnonymousClass79Z.A00(this, 21);
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        setContentView(2131624160);
        WDSSearchBar wDSSearchBar = (WDSSearchBar) AnonymousClass3MY.A0C(this, 2131437029);
        this.A03 = wDSSearchBar;
        if (wDSSearchBar != null) {
            AnonymousClass3MZ.A1I(wDSSearchBar.A08.A07, this, 44);
            WDSSearchBar wDSSearchBar2 = this.A03;
            if (wDSSearchBar2 != null) {
                wDSSearchBar2.A08.setTrailingButtonIcon(AnonymousClass4CB.A00);
                WDSSearchBar wDSSearchBar3 = this.A03;
                if (wDSSearchBar3 != null) {
                    wDSSearchBar3.A08.setOnQueryTextChangeListener(new AnonymousClass7PB(this, 0));
                    WDSSearchBar wDSSearchBar4 = this.A03;
                    if (wDSSearchBar4 != null) {
                        wDSSearchBar4.A08.setOnQueryTextSubmitListener(AnonymousClass83U.A00);
                        WDSSearchBar wDSSearchBar5 = this.A03;
                        if (wDSSearchBar5 != null) {
                            wDSSearchBar5.A08.addOnAttachStateChangeListener(new C1420377x(this, 0));
                            Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
                            setSupportActionBar(toolbar);
                            C72473Md.A18(this);
                            toolbar.setNavigationOnClickListener(new AFB(this, 43));
                            C18100vl r6 = this.A07;
                            AnonymousClass7AT.A01(this, ((AiHomeViewModel) AnonymousClass7AT.A00(this, ((AiHomeViewModel) AnonymousClass7AT.A00(this, ((AiHomeViewModel) AnonymousClass7AT.A00(this, ((AiHomeViewModel) AnonymousClass7AT.A00(this, ((AiHomeViewModel) AnonymousClass7AT.A00(this, C108945cZ.A0b(r6).A0B, r6, new C157617xn(this), 5)).A06, r6, new C157627xo(this), 5)).A02, r6, new C157637xp(this), 5)).A07, r6, new C157647xq(this), 5)).A00, r6, new C157657xr(this), 5)).A04, new C157667xs(this), 5);
                            if (bundle == null) {
                                C34001jj r5 = new C34001jj(AnonymousClass3MX.A0O(this));
                                r5.A0G = true;
                                Class<AiHomeFragment> cls = AiHomeFragment.class;
                                AnonymousClass1GY r1 = r5.A0J;
                                if (r1 == null) {
                                    throw AnonymousClass000.A0n("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                } else if (r5.A0L != null) {
                                    r5.A0C(r1.A00(cls.getName()), (String) null, 2131431000);
                                    r5.A01();
                                } else {
                                    throw AnonymousClass000.A0n("The FragmentManager must be attached to itshost to create a Fragment");
                                }
                            }
                            AiHomeViewModel A0b = C108945cZ.A0b(r6);
                            int intExtra = getIntent().getIntExtra("bonsaiDiscoveryEntryPoint", -1);
                            if (intExtra == -1) {
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(intExtra);
                            }
                            if (A0b.A01.A06() == null) {
                                A0b.A0F.CPw(C27621Wu.A00);
                            }
                            A0b.A0A.A00 = valueOf;
                            return;
                        }
                    }
                }
            }
        }
        C18070vi.A11("wdsSearchBar");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A0B = C72453Mb.A0B(menuItem);
        if (A0B == 2131432620) {
            onSearchRequested();
        } else if (A0B == 2131432585) {
            AnonymousClass00H r0 = this.A05;
            if (r0 != null) {
                C108955ca.A1S(r0);
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(getPackageName(), "com.whatsapp.bot.creation.AiCreationActivity");
                startActivity(A0A);
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public AIHomeActivity() {
        this(0);
        this.A07 = C99274sY.A00(new C148387hM(this), new C148377hL(this), new C155157sI(this), AnonymousClass3MW.A15(AiHomeViewModel.class));
    }
}
