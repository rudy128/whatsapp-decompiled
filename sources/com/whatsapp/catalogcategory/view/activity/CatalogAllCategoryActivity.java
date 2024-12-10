package com.whatsapp.catalogcategory.view.activity;

import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BY;
import X.AnonymousClass8lW;
import X.C003401n;
import X.C137116uw;
import X.C179299Hk;
import X.C17960vV;
import X.C18070vi;
import X.C34001jj;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.view.Menu;

public final class CatalogAllCategoryActivity extends AnonymousClass8lW {
    public boolean A00;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820547, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass8lW.A03(A002, r2, r1, this);
        }
    }

    public CatalogAllCategoryActivity(int i) {
        this.A00 = false;
        AGB.A00(this, 35);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624026);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0S(getString(2131887969));
        }
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("category_parent_id");
            C17960vV.A07(stringExtra);
            C18070vi.A0X(stringExtra);
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A09(AnonymousClass8BY.A0I(A4b(), C179299Hk.CATALOG_CATEGORY_FLOW, stringExtra), 2131429504);
            A0H.A00(false);
        }
    }

    public CatalogAllCategoryActivity() {
        this(0);
    }
}
