package com.whatsapp.inappbugreporting;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XN;
import X.AnonymousClass41V;
import X.AnonymousClass4CB;
import X.AnonymousClass4NP;
import X.BEB;
import X.BM4;
import X.C003401n;
import X.C105575Sn;
import X.C108955ca;
import X.C109005cf;
import X.C109015cg;
import X.C18070vi;
import X.C217517g;
import X.C22709BLu;
import X.C23874BrW;
import X.C23875BrX;
import X.C23876BrY;
import X.C23877BrZ;
import X.C23878Bra;
import X.C23879Brb;
import X.C23880Brc;
import X.C23881Brd;
import X.C23882Bre;
import X.C23883Brf;
import X.C23884Brg;
import X.C23885Brh;
import X.C23886Bri;
import X.C23887Brj;
import X.C23888Brk;
import X.C23889Brl;
import X.C23890Brm;
import X.C23891Brn;
import X.C23892Bro;
import X.C23893Brp;
import X.C23894Brq;
import X.C23895Brr;
import X.C27831Xu;
import X.C28931bI;
import X.C91044f3;
import X.C98454rB;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.search.WDSSearchBar;

public final class BugReportingCategoriesActivity extends AnonymousClass1FY {
    public RecyclerView A00;
    public AnonymousClass3XN A01;
    public WDSSearchBar A02;
    public boolean A03;
    public final AnonymousClass00H A04;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem add = menu.add(0, 2131432620, 0, getString(2131899369));
        C18070vi.A0X(add);
        add.setIcon(2131232271);
        add.setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        if (menuItem.getItemId() == 2131432620) {
            WDSSearchBar wDSSearchBar = this.A02;
            if (wDSSearchBar == null) {
                C18070vi.A11("wdsSearchBar");
                throw null;
            }
            WDSSearchBar.A01(wDSSearchBar, true, true);
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            BEB.A10(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            BEB.A0x(A0A, r1, this);
            C109015cg.A03(A0A, r1, this, r1.A5A);
        }
    }

    public BugReportingCategoriesActivity(int i) {
        this.A03 = false;
        C91044f3.A00(this, 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624022);
        View findViewById = findViewById(2131434853);
        C18070vi.A0X(findViewById);
        WDSSearchBar wDSSearchBar = (WDSSearchBar) findViewById;
        this.A02 = wDSSearchBar;
        if (wDSSearchBar != null) {
            wDSSearchBar.A08.setTrailingButtonIcon(AnonymousClass4CB.A00);
            WDSSearchBar wDSSearchBar2 = this.A02;
            if (wDSSearchBar2 != null) {
                setSupportActionBar(wDSSearchBar2.A07);
                C003401n supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.A0W(true);
                    supportActionBar.A0S(getString(2131887468));
                }
                RecyclerView recyclerView = (RecyclerView) AnonymousClass3MY.A0C(this, 2131428927);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.A0R = true;
                BM4 bm4 = new BM4(recyclerView.getContext());
                int A002 = AnonymousClass3Ma.A00(this, 2130969386, 2131100378);
                bm4.A00 = A002;
                Drawable A022 = C27831Xu.A02(bm4.A05);
                bm4.A05 = A022;
                C27831Xu.A0C(A022, A002);
                bm4.A04 = 1;
                bm4.A06 = false;
                recyclerView.A0r(bm4);
                this.A00 = recyclerView;
                this.A04.get();
                AnonymousClass4NP[] r2 = new AnonymousClass4NP[23];
                r2[0] = C23874BrW.A00;
                r2[1] = C23876BrY.A00;
                r2[2] = C23875BrX.A00;
                r2[3] = C23884Brg.A00;
                r2[4] = C23877BrZ.A00;
                r2[5] = C23890Brm.A00;
                r2[6] = C23879Brb.A00;
                r2[7] = AnonymousClass41V.A00;
                r2[8] = C23891Brn.A00;
                r2[9] = C23885Brh.A00;
                r2[10] = C23888Brk.A00;
                r2[11] = C23881Brd.A00;
                r2[12] = C23883Brf.A00;
                r2[13] = C23878Bra.A00;
                r2[14] = C23893Brp.A00;
                r2[15] = C23895Brr.A00;
                r2[16] = C23894Brq.A00;
                r2[17] = C23882Bre.A00;
                r2[18] = C23892Bro.A00;
                r2[19] = C23887Brj.A00;
                r2[20] = C23889Brl.A00;
                r2[21] = C23880Brc.A00;
                AnonymousClass3XN r1 = new AnonymousClass3XN(C18070vi.A0O(C23886Bri.A00, r2, 22), new C105575Sn(this));
                this.A01 = r1;
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 == null) {
                    C18070vi.A11("categoryRecyclerView");
                } else {
                    recyclerView2.setAdapter(r1);
                    WaTextView waTextView = (WaTextView) findViewById(2131429104);
                    C28931bI r22 = new C28931bI(findViewById(2131433165));
                    AnonymousClass3XN r12 = this.A01;
                    if (r12 == null) {
                        C18070vi.A11("bugCategoryListAdapter");
                    } else {
                        r12.CDq(new C22709BLu(waTextView, this, r22));
                        WDSSearchBar wDSSearchBar3 = this.A02;
                        if (wDSSearchBar3 != null) {
                            wDSSearchBar3.A08.setOnQueryTextChangeListener(new C98454rB(this, 2));
                            return;
                        }
                    }
                }
                throw null;
            }
        }
        C18070vi.A11("wdsSearchBar");
        throw null;
    }

    public BugReportingCategoriesActivity() {
        this(0);
        this.A04 = C217517g.A00(65543);
    }
}
