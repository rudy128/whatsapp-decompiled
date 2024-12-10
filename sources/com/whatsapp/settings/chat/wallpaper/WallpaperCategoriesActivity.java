package com.whatsapp.settings.chat.wallpaper;

import X.A34;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1ZO;
import X.AnonymousClass28M;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X6;
import X.AnonymousClass4GR;
import X.AnonymousClass4VU;
import X.AnonymousClass4aW;
import X.C000200d;
import X.C108245bN;
import X.C108255bO;
import X.C110885hR;
import X.C127736eq;
import X.C139176yM;
import X.C17890vO;
import X.C17960vV;
import X.C18030ve;
import X.C219217x;
import X.C24771Lp;
import X.C28281Zt;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C84314Ja;
import X.C85344Na;
import X.C88594aB;
import X.C91034f2;
import X.C91264fP;
import X.C91614fy;
import X.C92284h3;
import X.C95224lt;
import X.C98844ro;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class WallpaperCategoriesActivity extends AnonymousClass1FY implements C108255bO {
    public C84314Ja A00;
    public C24771Lp A01;
    public C108245bN A02;
    public AnonymousClass118 A03;
    public C219217x A04;
    public AnonymousClass1LU A05;
    public AnonymousClass1BI A06;
    public AnonymousClass3X6 A07;
    public AnonymousClass4aW A08;
    public AnonymousClass00H A09;
    public C92284h3 A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass4GR A0D;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4GR, java.lang.Object] */
    public WallpaperCategoriesActivity() {
        this(0);
        this.A0D = new Object();
        this.A06 = null;
    }

    public void BrZ(int i) {
    }

    public void Bra(int i) {
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131624124);
        AnonymousClass1ZO.A04((ViewGroup) C110885hR.A0A(this, 2131429504), new C91264fP(this, 14));
        AnonymousClass1ZO.A03(this);
        AnonymousClass1KB r6 = this.A05;
        C95224lt r7 = new C95224lt(r6);
        this.A02 = r7;
        C18030ve r10 = this.A0E;
        this.A0A = new C92284h3(this, this, r6, r7, this.A0D, this.A08, r10, this.A08);
        this.A06 = C88594aB.A03(this);
        boolean A1a = AnonymousClass3MY.A1a(getIntent(), "is_using_global_wallpaper");
        setSupportActionBar((Toolbar) C110885hR.A0A(this, 2131436965));
        C72473Md.A17(this);
        if (this.A06 == null || A1a) {
            i = 2131898418;
            if (C28281Zt.A0B(this)) {
                i = 2131898408;
            }
        } else {
            i = 2131898407;
        }
        setTitle(i);
        this.A06 = C88594aB.A03(this);
        this.A0B = this.A04.A0G();
        AnonymousClass1DT r1 = this.A08.A02;
        C17960vV.A07(r1);
        C91614fy.A00(this, r1, 32);
        ArrayList A13 = AnonymousClass000.A13();
        boolean z = this.A08.A0E(this, this.A06).A04;
        C17890vO.A1D(A13, 0);
        C17890vO.A1D(A13, 1);
        C17890vO.A1D(A13, 2);
        C17890vO.A1D(A13, 3);
        C17890vO.A1D(A13, 5);
        if (!z) {
            C17890vO.A1D(A13, 4);
        }
        RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131428919);
        C127736eq r11 = new C127736eq(this, z);
        Handler A0D2 = C17890vO.A0D();
        AnonymousClass11C r8 = this.A08;
        AnonymousClass3X6 r5 = new AnonymousClass3X6(A0D2, this.A01, r8, this.A03, (C139176yM) this.A09.get(), r11, this.A05, A13);
        this.A07 = r5;
        recyclerView.setLayoutManager(new WallpaperGridLayoutManager(this, r5));
        recyclerView.A0r(new AnonymousClass28M(this.A00, AnonymousClass3MZ.A01(this, 2131169294)));
        recyclerView.setAdapter(this.A07);
    }

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A03 = AnonymousClass3MZ.A0l(r2);
            this.A05 = AnonymousClass3MY.A0Z(r2);
            this.A01 = (C24771Lp) r2.A0o.get();
            this.A09 = C000200d.A00(A0K.A4e);
            this.A08 = (AnonymousClass4aW) r1.A5C.get();
            this.A04 = AnonymousClass3Ma.A0b(r2);
            this.A00 = (C84314Ja) A0K.A0d.get();
        }
    }

    public void Brb(int i) {
        if (i == 112) {
            AnonymousClass4aW.A09(this.A06, (C85344Na) null, this.A08, C28281Zt.A0B(this), true);
            C72453Mb.A14(this);
        } else if (i == 113) {
            AnonymousClass4aW r2 = this.A08;
            C98844ro.A02(r2.A0H, r2, 35);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A06 == null) {
            menu.add(0, 999, 0, 2131898431).setShowAsAction(0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            boolean A1a = AnonymousClass3MY.A1a(getIntent(), "com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity.fromThemes");
            setResult(i2);
            if (A1a || this.A0A.Bky(intent, i, i2)) {
                finish();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator A0l = C17890vO.A0l(this.A07.A09);
        while (A0l.hasNext()) {
            ((A34) A0l.next()).A0B(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 999) {
            AnonymousClass4VU r1 = new AnonymousClass4VU(113);
            r1.A02(getString(2131898429));
            r1.A04(getString(2131898430));
            r1.A03(getString(2131898766));
            CMl(r1.A00());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (this.A0B != this.A04.A0G()) {
            this.A0B = this.A04.A0G();
            this.A07.notifyDataSetChanged();
        }
    }

    public WallpaperCategoriesActivity(int i) {
        this.A0C = false;
        C91034f2.A00(this, 38);
    }
}
