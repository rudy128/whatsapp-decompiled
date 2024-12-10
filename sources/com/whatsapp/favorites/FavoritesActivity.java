package com.whatsapp.favorites;

import X.A09;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1Xr;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3W8;
import X.AnonymousClass3XF;
import X.AnonymousClass4CZ;
import X.AnonymousClass4PZ;
import X.AnonymousClass4aX;
import X.AnonymousClass5HY;
import X.AnonymousClass5HZ;
import X.BM5;
import X.C000200d;
import X.C003401n;
import X.C104185Ne;
import X.C108505bo;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C62482rT;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C80923yN;
import X.C91014f0;
import X.C96044nD;
import X.C99274sY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class FavoritesActivity extends AnonymousClass1FY implements C108505bo {
    public RecyclerView A00;
    public AnonymousClass4PZ A01;
    public AnonymousClass3XF A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public BM5 A05;
    public boolean A06;
    public final C18100vl A07;

    public FavoritesActivity() {
        this(0);
        this.A07 = C99274sY.A00(new AnonymousClass5HZ(this), new AnonymousClass5HY(this), new C104185Ne(this), AnonymousClass3MW.A15(FavoriteListViewModel.class));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820564, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private final Drawable A03() {
        int i = 2131232624;
        if (C72463Mc.A1a(((FavoriteListViewModel) this.A07.getValue()).A09)) {
            i = 2131231806;
        }
        Drawable A052 = AnonymousClass4aX.A05(this, AnonymousClass3MX.A06(this, i), 2131103154);
        C18070vi.A0X(A052);
        return A052;
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = (AnonymousClass4PZ) A0K.A2o.get();
            this.A03 = C000200d.A00(r2.A2f);
            this.A04 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void Bl2() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            r0.get();
            startActivity(AnonymousClass1LU.A0X(this, AnonymousClass4CZ.CHATS, ((FavoriteListViewModel) this.A07.getValue()).A00));
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void Bty(C62482rT r2, int i) {
        AnonymousClass3XF r0 = this.A02;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        r0.A0I(i);
        ((FavoriteListViewModel) this.A07.getValue()).A0U(r2);
    }

    public void Btz(int i, int i2) {
        AnonymousClass3XF r2 = this.A02;
        if (r2 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        List list = r2.A04;
        list.add(i2, list.remove(i));
        r2.A01.A01(i, i2);
    }

    public void Bu0() {
        FavoriteListViewModel favoriteListViewModel = (FavoriteListViewModel) this.A07.getValue();
        AnonymousClass3XF r0 = this.A02;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        } else {
            favoriteListViewModel.A0V(r0.A04);
        }
    }

    public void Bu1(C80923yN r2) {
        BM5 bm5 = this.A05;
        if (bm5 == null) {
            C18070vi.A11("favoriteListItemTouchHelper");
            throw null;
        } else {
            bm5.A0A(r2);
        }
    }

    public void C0V(View view, C96044nD r5) {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            r0.get();
            A09 a09 = new A09(view, r5.A01.A03, 10);
            a09.A02 = AnonymousClass1Xr.A02(view);
            a09.A01(this);
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        A2r(9);
        super.onCreate(bundle);
        setContentView(2131625310);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MY.A0H(this, 2131434428);
        this.A00 = recyclerView;
        BM5 bm5 = new BM5(new AnonymousClass3W8(this));
        this.A05 = bm5;
        if (recyclerView == null) {
            C18070vi.A11("recyclerView");
            throw null;
        }
        bm5.A0D(recyclerView);
        setTitle(2131890376);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131890376);
            supportActionBar.A0W(true);
        }
        AnonymousClass3MX.A1Q(new FavoritesActivity$initObservables$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C18100vl r1 = this.A07;
        ((FavoriteListViewModel) r1.getValue()).A0T();
        ((FavoriteListViewModel) r1.getValue()).A00 = getIntent().getIntExtra("ENTRY_POINT", 6);
        if (C18020vd.A00(C18040vf.A02, this.A0E, 4708) == 0) {
            AnonymousClass3MX.A0L(this, 2131430810).setText(2131890383);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (!(menu == null || (findItem = menu.findItem(2131432501)) == null)) {
            findItem.setIcon(A03());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 2131432501) {
            return super.onOptionsItemSelected(menuItem);
        }
        C18100vl r0 = this.A07;
        AnonymousClass3MY.A1Y(((FavoriteListViewModel) r0.getValue()).A07, !C72463Mc.A1a(((FavoriteListViewModel) r0.getValue()).A09));
        menuItem.setIcon(A03());
        return true;
    }

    public FavoritesActivity(int i) {
        this.A06 = false;
        C91014f0.A00(this, 7);
    }
}
