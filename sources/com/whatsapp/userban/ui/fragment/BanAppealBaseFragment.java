package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass00H;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass1FL;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass6VI;
import X.AnonymousClass758;
import X.C108955ca;
import X.C108985cd;
import X.C1411974r;
import X.C17880vN;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C29491cN;
import X.C62562rb;
import X.C73203Rj;
import X.C83434Fc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.base.WaFragment;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public abstract class BanAppealBaseFragment extends WaFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass11P A01;
    public C19830z4 A02;
    public AnonymousClass11O A03;
    public C18030ve A04;
    public AnonymousClass00H A05;
    public BanAppealViewModel A06;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A06 = (BanAppealViewModel) AnonymousClass3Ma.A0I(this).A00(BanAppealViewModel.class);
    }

    public boolean A24(MenuItem menuItem) {
        String str;
        StringBuilder A19 = AnonymousClass3MZ.A19(menuItem, 0);
        A19.append("BanAppealBaseFragment/onOptionsItemSelected/option item : ");
        C17900vP.A0o(A19, menuItem.getItemId());
        switch (menuItem.getItemId()) {
            case 101:
                if (C108985cd.A0O(this).A0A.A0E() + 1 > 2) {
                    C83434Fc.A00((String) null, 16).A2C(A1F(), "BanAppealBaseFragment");
                    return true;
                }
                C108985cd.A0O(this).A0D(A14(), 16);
                return true;
            case 102:
                C29491cN A0O = C108985cd.A0O(this);
                C62562rb A032 = C108985cd.A0O(this).A03();
                if (A032 != null) {
                    String A08 = A0O.A08(A032.A06);
                    C73203Rj A033 = AnonymousClass4a6.A03(this);
                    A033.A0E(2131895101);
                    A033.A0S(AnonymousClass6VI.A00(AnonymousClass3MY.A0o(this, A08, 0, 2131895100)));
                    AnonymousClass758.A01(A033, this, 36, 2131895098);
                    A033.A0X(new C1411974r(32), 2131898766);
                    AnonymousClass3MY.A0L(A033).show();
                    return true;
                }
                throw C17880vN.A0g();
            case 103:
                AnonymousClass1L9 r7 = this.A00;
                if (r7 != null) {
                    AnonymousClass1FL A1D = A1D();
                    AnonymousClass1FL A1D2 = A1D();
                    C19830z4 r0 = this.A02;
                    if (r0 != null) {
                        int A0E = r0.A0E();
                        AnonymousClass11O r02 = this.A03;
                        if (r02 != null) {
                            r7.A08(A1D, AnonymousClass1LU.A1Y(A1D2, (String) null, r02.A01(), A0E, false));
                            return true;
                        }
                        str = "waStartupSharedPreferences";
                    } else {
                        str = "waSharedPreferences";
                    }
                } else {
                    str = "activityUtils";
                }
                C18070vi.A11(str);
                throw null;
            case 104:
                BanAppealViewModel banAppealViewModel = this.A06;
                if (banAppealViewModel != null) {
                    banAppealViewModel.A0W(A1D(), false);
                    return true;
                }
                break;
            case 105:
                BanAppealViewModel banAppealViewModel2 = this.A06;
                if (banAppealViewModel2 != null) {
                    AnonymousClass3MY.A1M(banAppealViewModel2.A0B, true);
                    break;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!C108985cd.A0O(this).A0F()) {
            return null;
        }
        A1Z(true);
        return null;
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        int i;
        int i2;
        boolean A15 = C18070vi.A15(menu, menuInflater);
        if (C108985cd.A0O(this).A0F()) {
            if (C108985cd.A0O(this).A03() == null) {
                Log.i("BanAppealBaseFragment/onCreateOptionsMenu/getCurrentAccount is null");
                if (C108985cd.A0O(this).A0E()) {
                    Log.i("BanAppealBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/inactiveAccountsPresent");
                    i = 103;
                } else {
                    Log.i("BanAppealBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/no inactiveAccountsPresent");
                    i = 104;
                    i2 = 2131894997;
                    C108955ca.A1G(menu, A15, i, i2);
                }
            } else if (C108985cd.A0O(this).A0E()) {
                Log.i("BanAppealBaseFragment/onCreateOptionsMenu/inactiveAccountsPresent");
                C108955ca.A1G(menu, A15 ? 1 : 0, 101, 2131886391);
                i = 102;
            } else {
                return;
            }
            i2 = 2131895098;
            C108955ca.A1G(menu, A15, i, i2);
        }
    }
}
