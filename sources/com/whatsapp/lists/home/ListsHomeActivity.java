package com.whatsapp.lists.home;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DS;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1G4;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3TY;
import X.AnonymousClass4Y1;
import X.AnonymousClass4aX;
import X.AnonymousClass5IF;
import X.AnonymousClass5IG;
import X.AnonymousClass5O5;
import X.AnonymousClass5T9;
import X.C003401n;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import X.C91644g1;
import X.C99274sY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;

public final class ListsHomeActivity extends AnonymousClass1FY {
    public Integer A00;
    public boolean A01;
    public final C18100vl A02;

    public ListsHomeActivity() {
        this(0);
        this.A02 = C99274sY.A00(new AnonymousClass5IG(this), new AnonymousClass5IF(this), new AnonymousClass5O5(this), AnonymousClass3MW.A15(AnonymousClass3TY.class));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820578, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (!(menu == null || (findItem = menu.findItem(2131432502)) == null)) {
            AnonymousClass3TY r5 = (AnonymousClass3TY) this.A02.getValue();
            boolean z = r5.A00;
            AnonymousClass1G4 r2 = r5.A01;
            boolean z2 = ((AnonymousClass4Y1) r2.getValue()).A00;
            if (!z) {
                z2 = AnonymousClass000.A1P(z2 ? 1 : 0);
            }
            r2.getValue();
            r2.setValue(new AnonymousClass4Y1(z2));
            r5.A00 = false;
            int i = 2131233284;
            if (((AnonymousClass4Y1) r2.getValue()).A00) {
                i = 2131233241;
            }
            Drawable A05 = AnonymousClass4aX.A05(this, AnonymousClass3MX.A06(this, i), 2131103154);
            C18070vi.A0X(A05);
            findItem.setIcon(A05);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public static final void A03(ListsHomeActivity listsHomeActivity) {
        C003401n supportActionBar = listsHomeActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i = 2131891998;
            if (((AnonymousClass4Y1) ((AnonymousClass3TY) listsHomeActivity.A02.getValue()).A01.getValue()).A00) {
                i = 2131898933;
            }
            supportActionBar.A0S(C18070vi.A0F(listsHomeActivity, i));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624070);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0S(getString(2131891741));
            supportActionBar.A0W(true);
        }
        int intExtra = getIntent().getIntExtra("EXTRA_ENTRY_POINT", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            valueOf = null;
        }
        this.A00 = valueOf;
        boolean A1a = AnonymousClass3MY.A1a(getIntent(), "LAUNCH_FROM_DEEPLINK");
        if (bundle == null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0G = true;
            Integer num = this.A00;
            ListsHomeFragment listsHomeFragment = new ListsHomeFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putBoolean("launch_from_deeplink", A1a);
            C72463Mc.A10(A0D, num);
            listsHomeFragment.A1R(A0D);
            A0H.A09(listsHomeFragment, 2131430999);
            A0H.A01();
        }
        AnonymousClass3MX.A1Q(new ListsHomeActivity$listenToViewStateChanges$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        A03(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 2131432502) {
            ListsHomeBottomSheet listsHomeBottomSheet = new ListsHomeBottomSheet();
            Bundle A0D = C17880vN.A0D();
            C72463Mc.A10(A0D, this.A00);
            listsHomeBottomSheet.A1R(A0D);
            listsHomeBottomSheet.A2C(getSupportFragmentManager(), "ListsHomeBottomSheet");
            C91644g1.A00(this, (AnonymousClass1DS) listsHomeBottomSheet.A01.getValue(), new AnonymousClass5T9(this), 46);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        Fragment A0O = getSupportFragmentManager().A0O(2131430999);
        if (A0O instanceof ListsHomeFragment) {
            ((ListsHomeFragment) A0O).A25();
        }
        A03(this);
    }

    public ListsHomeActivity(int i) {
        this.A01 = false;
        C91014f0.A00(this, 40);
    }
}
