package com.whatsapp.businesscollection.view.activity;

import X.AGB;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass2UJ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.B7A;
import X.B7J;
import X.B7P;
import X.C000200d;
import X.C137116uw;
import X.C169018kE;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C190429kv;
import X.C20005A2v;
import X.C201811d;
import X.C20504ANp;
import X.C22417B6z;
import X.C56482hX;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

public final class CollectionProductListActivity extends C169018kE implements B7J, B7P {
    public C56482hX A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final AnonymousClass00H A04;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820551, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r3 = r1.A00;
            C63932tv.A01(r1, r3, this);
            C63662tU.A00(r1, r3, this, r3.A5A);
            this.A0G = AnonymousClass8BT.A0W(r1);
            this.A04 = AnonymousClass8BT.A0D(r1);
            this.A0I = C000200d.A00(r1.A1o);
            this.A0J = C000200d.A00(A002.A0V);
            this.A0K = C000200d.A00(A002.A0W);
            this.A05 = (B7A) A002.A2T.get();
            this.A0L = C000200d.A00(r1.AGs);
            this.A07 = AnonymousClass8BU.A0D(r1);
            this.A0M = C000200d.A00(r1.A1q);
            this.A03 = (C22417B6z) A002.A2N.get();
            this.A0N = C000200d.A00(r1.A1s);
            this.A0O = C000200d.A00(r3.A0r);
            this.A0B = AnonymousClass10E.A4z(r1);
            this.A0U = AnonymousClass3MZ.A1B(r1);
            this.A08 = (C20005A2v) A002.A0X.get();
            this.A0F = (AnonymousClass2UJ) r3.A3d.get();
            this.A0P = C000200d.A00(r1.A8o);
            this.A0C = AnonymousClass3MZ.A0f(r1);
            this.A0D = AnonymousClass3MZ.A0g(r1);
            this.A01 = C000200d.A00(A002.A0Y);
            this.A00 = (C56482hX) A002.A3f.get();
            this.A02 = AnonymousClass8BT.A0h(r1);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6715)) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                AnonymousClass3MX.A0u(r0).A02(A4c(), 60);
            } else {
                C18070vi.A11("navigationTimeSpentManager");
                throw null;
            }
        }
    }

    public CollectionProductListActivity(int i) {
        this.A03 = false;
        AGB.A00(this, 28);
    }

    public void Bo1() {
        A4b().A02.A00();
    }

    public void C1s() {
        A4b().A02.A00();
    }

    public void onBackPressed() {
        Fragment A0Q = getSupportFragmentManager().A0Q("CatalogSearchFragmentTag");
        if (!(A0Q instanceof CatalogSearchFragment) || !((CatalogSearchFragment) A0Q).A27()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass8BU.A18(this, 2131435851);
        setSupportActionBar(AnonymousClass3Ma.A0G(this));
        String str2 = this.A0T;
        if (str2 != null) {
            AnonymousClass8BX.A11(this, str2);
            AnonymousClass00H r0 = this.A01;
            if (r0 != null) {
                ((C190429kv) r0.get()).A00(new C20504ANp(this, 2), A4c());
                return;
            }
            str = "catalogSearchManager";
        } else {
            str = "collectionName";
        }
        C18070vi.A11(str);
        throw null;
    }

    public CollectionProductListActivity() {
        this(0);
        this.A04 = C201811d.A00(49516);
    }
}
