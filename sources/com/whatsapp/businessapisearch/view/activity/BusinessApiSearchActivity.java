package com.whatsapp.businessapisearch.view.activity;

import X.A07;
import X.A17;
import X.AFN;
import X.AGK;
import X.AnonymousClass00H;
import X.AnonymousClass0I4;
import X.AnonymousClass1GR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VZ;
import X.AnonymousClass8BY;
import X.AnonymousClass8e9;
import X.C003401n;
import X.C108955ca;
import X.C133326oZ;
import X.C171608rz;
import X.C17880vN;
import X.C20334AGq;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel;

public class BusinessApiSearchActivity extends AnonymousClass8e9 {
    public Menu A00;
    public AnonymousClass0I4 A01;
    public BusinessApiHomeFragment A02;
    public A07 A03;
    public BusinessApiSearchActivityViewModel A04;
    public A17 A05;
    public AnonymousClass4VZ A06;
    public AnonymousClass00H A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public void onCreate(Bundle bundle) {
        String str;
        Fragment fragment;
        super.onCreate(bundle);
        if (AnonymousClass3MY.A1a(getIntent(), "directory_source")) {
            str = "DIRECTORY";
        } else {
            str = "BUSINESSAPISEARCH";
        }
        this.A08 = str;
        if (bundle != null) {
            this.A0A = bundle.getBoolean("arg_show_search_view", true);
        } else {
            A4b();
        }
        setContentView(2131624023);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        C003401n A0S = C72463Mc.A0S(this, A0G);
        A0S.A0G();
        A0S.A0W(true);
        if ("DIRECTORY".equals(this.A08)) {
            setTitle(2131886977);
            AnonymousClass4VZ r1 = this.A06;
            if (r1 != null) {
                r1.A05(true);
            }
            A4c();
        } else if (bundle != null) {
            AnonymousClass1GR r2 = getSupportFragmentManager().A0U;
            if (r2.A04().isEmpty()) {
                fragment = null;
            } else {
                fragment = (Fragment) r2.A04().get(AnonymousClass3MX.A01(r2.A04()));
            }
            if (fragment instanceof BusinessApiHomeFragment) {
                setTitle(2131886976);
            }
        }
        this.A06 = new AnonymousClass4VZ(this, findViewById(2131434898), new AGK(this, 0), A0G, this.A00);
        if (this.A0A && bundle != null) {
            A4d(false);
        }
        BusinessApiSearchActivityViewModel businessApiSearchActivityViewModel = (BusinessApiSearchActivityViewModel) AnonymousClass3MW.A0N(this).A00(BusinessApiSearchActivityViewModel.class);
        this.A04 = businessApiSearchActivityViewModel;
        C20334AGq.A00(this, businessApiSearchActivityViewModel.A01, 46);
    }

    public static void A0Q(BusinessApiSearchActivity businessApiSearchActivity) {
        AnonymousClass4VZ r1 = businessApiSearchActivity.A06;
        if (r1 != null) {
            r1.A05(true);
        }
        businessApiSearchActivity.A4c();
        businessApiSearchActivity.getSupportFragmentManager().A0c();
    }

    public void A4b() {
        String str = this.A08;
        int A042 = C72453Mb.A04("BUSINESSAPISEARCH".equals(str) ? 1 : 0);
        BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("arg_home_view_state", A042);
        A0D.putString("entrypoint_type", str);
        businessApiHomeFragment.A1R(A0D);
        A03(businessApiHomeFragment, this, false);
        if ("DIRECTORY".equals(this.A08)) {
            setTitle(2131886977);
            A4c();
            return;
        }
        setTitle(2131886976);
    }

    public void A4c() {
        Menu menu = this.A00;
        if (menu != null && menu.findItem(1) == null) {
            AnonymousClass8BY.A0C(this, this.A00, 1).setShowAsAction(2);
        }
        this.A09 = true;
    }

    public void A4d(boolean z) {
        AnonymousClass4VZ r1 = this.A06;
        if (r1 != null) {
            r1.A06(false);
            AnonymousClass4VZ r2 = this.A06;
            String string = getString(2131886975);
            SearchView searchView = r2.A00;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
            this.A06.A00.requestFocus();
            if (this.A01.A00(this.A08)) {
                A17 a17 = this.A05;
                C171608rz r12 = new C171608rz();
                r12.A01 = C17880vN.A0i();
                r12.A03 = Integer.valueOf(z ? 1 : 0);
                r12.A00 = Boolean.valueOf(z);
                A17.A00(r12, a17);
            }
            AFN.A00(this.A06.A03.findViewById(2131434851), this, 0);
        }
    }

    public void onBackPressed() {
        AnonymousClass4VZ r0 = this.A06;
        if (r0 != null && r0.A0C()) {
            BusinessApiHomeFragment businessApiHomeFragment = this.A02;
            if (businessApiHomeFragment != null) {
                businessApiHomeFragment.A26();
            }
            this.A06.A05(true);
        }
        BVe().A07();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A00 = menu;
        if (this.A09) {
            A4c();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public static void A03(Fragment fragment, BusinessApiSearchActivity businessApiSearchActivity, boolean z) {
        String A0x = C108955ca.A0x(fragment);
        C34001jj A0H = AnonymousClass3Ma.A0H(businessApiSearchActivity);
        A0H.A0D(fragment, A0x, 2131428566);
        if (z) {
            A0H.A0H(A0x);
        }
        A0H.A00(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Fragment fragment;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            String str = this.A08;
            if ("DIRECTORY".equals(str)) {
                Intent A002 = ((C133326oZ) this.A07.get()).A00(getApplicationContext());
                A002.putExtra("from_api_biz_search", true);
                startActivity(A002);
                return true;
            }
            BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("arg_home_view_state", 2);
            A0D.putString("entrypoint_type", str);
            businessApiHomeFragment.A1R(A0D);
            A03(businessApiHomeFragment, this, true);
            A4d(true);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            BusinessApiHomeFragment businessApiHomeFragment2 = this.A02;
            if (businessApiHomeFragment2 != null) {
                businessApiHomeFragment2.A26();
                return true;
            }
            AnonymousClass1GR r2 = getSupportFragmentManager().A0U;
            if (r2.A04().isEmpty()) {
                fragment = null;
            } else {
                fragment = (Fragment) r2.A04().get(AnonymousClass3MX.A01(r2.A04()));
            }
            if (fragment instanceof BusinessApiHomeFragment) {
                onBackPressed();
                return true;
            }
            A4b();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            android.view.Menu r1 = r3.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0010
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.4VZ r0 = r3.A06
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0021
            r2 = 1
        L_0x0021:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
