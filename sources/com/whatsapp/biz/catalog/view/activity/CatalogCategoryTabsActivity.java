package com.whatsapp.biz.catalog.view.activity;

import X.AGB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass7RL;
import X.AnonymousClass823;
import X.AnonymousClass8BU;
import X.AnonymousClass8lW;
import X.B7J;
import X.C000200d;
import X.C003401n;
import X.C137116uw;
import X.C161538Fq;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C190429kv;
import X.C194889sS;
import X.C201811d;
import X.C20339AGv;
import X.C20504ANp;
import X.C21853Atf;
import X.C22437B7t;
import X.C63662tU;
import X.C63932tv;
import X.C92044gf;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import java.util.Iterator;
import java.util.List;

public final class CatalogCategoryTabsActivity extends AnonymousClass8lW implements B7J, C22437B7t {
    public ViewPager A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820548, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        CatalogSearchFragment catalogSearchFragment;
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("selected_category_parent_id");
        if (stringExtra != null) {
            C18100vl r1 = this.A04;
            List A10 = AnonymousClass3MW.A10(((CatalogCategoryTabsViewModel) r1.getValue()).A00);
            if (A10 != null) {
                r1.getValue();
                Iterator it = A10.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (C18070vi.A18(((C194889sS) it.next()).A01, stringExtra)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                ViewPager viewPager = this.A00;
                if (viewPager == null) {
                    C18070vi.A11("viewPager");
                    throw null;
                }
                viewPager.setCurrentItem(i);
            }
            Fragment A0Q = getSupportFragmentManager().A0Q("CategoryTabsSearchFragmentTag");
            if (A0Q != null && (A0Q instanceof CatalogSearchFragment) && (catalogSearchFragment = (CatalogSearchFragment) A0Q) != null) {
                catalogSearchFragment.A26(true);
            }
        }
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass8lW.A03(A002, r2, r1, this);
            this.A01 = C000200d.A00(A002.A0Y);
        }
    }

    public void Bo1() {
        ((C161538Fq) this.A09.getValue()).A02.A00();
    }

    public void Bu9(int i) {
        if (i == 404) {
            A3t(new C92044gf(0), 0, 2131888366, 2131899286);
        }
    }

    public CatalogCategoryTabsActivity(int i) {
        this.A02 = false;
        AGB.A00(this, 15);
    }

    public void onBackPressed() {
        CatalogSearchFragment catalogSearchFragment;
        Fragment A0Q = getSupportFragmentManager().A0Q("CategoryTabsSearchFragmentTag");
        if (A0Q == null || !(A0Q instanceof CatalogSearchFragment) || (catalogSearchFragment = (CatalogSearchFragment) A0Q) == null || !catalogSearchFragment.A27()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624027);
        AnonymousClass8BU.A18(this, 2131435851);
        C003401n A0K = AnonymousClass3MY.A0K(this, (Toolbar) AnonymousClass3MY.A0H(this, 2131436270));
        if (A0K != null) {
            A0K.A0W(true);
            A0K.A0M(2131887970);
        }
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((C190429kv) r0.get()).A00(new C20504ANp(this, 0), A4b());
            String stringExtra = getIntent().getStringExtra("selected_category_parent_id");
            C17960vV.A07(stringExtra);
            C18070vi.A0X(stringExtra);
            C18100vl r3 = this.A04;
            C20339AGv.A00(this, ((CatalogCategoryTabsViewModel) r3.getValue()).A00, new AnonymousClass823(this, stringExtra), 4);
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = (CatalogCategoryTabsViewModel) r3.getValue();
            catalogCategoryTabsViewModel.A02.CGF(new AnonymousClass7RL(catalogCategoryTabsViewModel, A4b(), 22));
            return;
        }
        C18070vi.A11("catalogSearchManager");
        throw null;
    }

    public CatalogCategoryTabsActivity() {
        this(0);
        this.A04 = AnonymousClass1DF.A01(new C21853Atf(this));
        this.A03 = C201811d.A00(49516);
    }
}
