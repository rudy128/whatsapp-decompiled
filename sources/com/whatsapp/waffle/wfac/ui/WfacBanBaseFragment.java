package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass1FL;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass6VI;
import X.AnonymousClass758;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C133456om;
import X.C1411974r;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C29491cN;
import X.C31081ez;
import X.C36401np;
import X.C62562rb;
import X.C73203Rj;
import X.C83434Fc;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.base.WaFragment;

public abstract class WfacBanBaseFragment extends WaFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass11C A01;
    public AnonymousClass11P A02;
    public C19830z4 A03;
    public AnonymousClass11O A04;
    public C18030ve A05;
    public AnonymousClass1LU A06;
    public C36401np A07;
    public WfacBanViewModel A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A08 = (WfacBanViewModel) AnonymousClass3Ma.A0I(this).A00(WfacBanViewModel.class);
    }

    public boolean A24(MenuItem menuItem) {
        C133456om r3;
        int i;
        int i2;
        String str;
        StringBuilder A19 = AnonymousClass3MZ.A19(menuItem, 0);
        A19.append("WfacBanBaseFragment/onOptionsItemSelected/option item : ");
        C31081ez.A02(C17880vN.A0t(A19, menuItem.getItemId()));
        switch (menuItem.getItemId()) {
            case 101:
                if (C108985cd.A0P(this).A0A.A0E() + 1 > 2) {
                    C83434Fc.A00((String) null, 20).A2C(A1F(), "WfacBanBaseFragment");
                } else {
                    C108985cd.A0P(this).A0D(A14(), 20);
                }
                r3 = C108975cc.A0Q(this);
                WfacBanViewModel wfacBanViewModel = this.A08;
                if (wfacBanViewModel != null) {
                    i = wfacBanViewModel.A0T();
                    WfacBanViewModel wfacBanViewModel2 = this.A08;
                    if (wfacBanViewModel2 != null) {
                        i2 = wfacBanViewModel2.A00;
                        str = "account_switched";
                        break;
                    } else {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                } else {
                    C18070vi.A11("viewModel");
                    throw null;
                }
            case 102:
                C29491cN A0P = C108985cd.A0P(this);
                C62562rb A032 = C108985cd.A0P(this).A03();
                if (A032 != null) {
                    String A082 = A0P.A08(A032.A06);
                    C73203Rj A033 = AnonymousClass4a6.A03(this);
                    A033.A0E(2131895101);
                    A033.A0S(AnonymousClass6VI.A00(AnonymousClass3MY.A0o(this, A082, 0, 2131895100)));
                    AnonymousClass758.A01(A033, this, 39, 2131895098);
                    A033.A0X(new C1411974r(33), 2131898766);
                    AnonymousClass3MY.A0L(A033).show();
                    return true;
                }
                throw C17880vN.A0g();
            case 103:
                AnonymousClass1L9 r6 = this.A00;
                if (r6 != null) {
                    AnonymousClass1FL A1D = A1D();
                    if (this.A06 != null) {
                        AnonymousClass1FL A1D2 = A1D();
                        C19830z4 r0 = this.A03;
                        if (r0 != null) {
                            int A0E = r0.A0E();
                            AnonymousClass11O r02 = this.A04;
                            if (r02 != null) {
                                r6.A08(A1D, AnonymousClass1LU.A1Y(A1D2, (String) null, r02.A01(), A0E, false));
                                r3 = C108975cc.A0Q(this);
                                WfacBanViewModel wfacBanViewModel3 = this.A08;
                                if (wfacBanViewModel3 != null) {
                                    i = wfacBanViewModel3.A0T();
                                    WfacBanViewModel wfacBanViewModel4 = this.A08;
                                    if (wfacBanViewModel4 != null) {
                                        i2 = wfacBanViewModel4.A00;
                                        str = "account_removed";
                                        break;
                                    } else {
                                        C18070vi.A11("viewModel");
                                        throw null;
                                    }
                                } else {
                                    C18070vi.A11("viewModel");
                                    throw null;
                                }
                            } else {
                                C18070vi.A11("waStartupSharedPreferences");
                                throw null;
                            }
                        } else {
                            C18070vi.A11("waSharedPreferences");
                            throw null;
                        }
                    } else {
                        AnonymousClass3MW.A1F();
                        throw null;
                    }
                } else {
                    C18070vi.A11("activityUtils");
                    throw null;
                }
            case 104:
                WfacBanViewModel wfacBanViewModel5 = this.A08;
                if (wfacBanViewModel5 != null) {
                    wfacBanViewModel5.A0V(A1D());
                    r3 = C108975cc.A0Q(this);
                    WfacBanViewModel wfacBanViewModel6 = this.A08;
                    if (wfacBanViewModel6 != null) {
                        i = wfacBanViewModel6.A0T();
                        WfacBanViewModel wfacBanViewModel7 = this.A08;
                        if (wfacBanViewModel7 != null) {
                            i2 = wfacBanViewModel7.A00;
                            str = "reg_new_number_started";
                            break;
                        } else {
                            C18070vi.A11("viewModel");
                            throw null;
                        }
                    } else {
                        C18070vi.A11("viewModel");
                        throw null;
                    }
                } else {
                    C18070vi.A11("viewModel");
                    throw null;
                }
            default:
                return false;
        }
        r3.A01(str, i, i2);
        return true;
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        String str;
        int i;
        boolean A15 = C18070vi.A15(menu, menuInflater);
        C31081ez.A02("WfacBanBaseFragment/onCreateOptionsMenu/add options menu items");
        if (C108985cd.A0P(this).A0F()) {
            int i2 = 104;
            if (C108985cd.A0P(this).A03() == null) {
                C31081ez.A02("WfacBanBaseFragment/onCreateOptionsMenu/getCurrentAccount is null");
                if (C108985cd.A0P(this).A0E()) {
                    C31081ez.A02("WfacBanBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/inactiveAccountsPresent");
                    i2 = 103;
                } else {
                    str = "WfacBanBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/no inactiveAccountsPresent";
                    C31081ez.A02(str);
                    i = 2131898550;
                    C108955ca.A1G(menu, A15, i2, i);
                }
            } else if (C108985cd.A0P(this).A0E()) {
                C31081ez.A02("WfacBanBaseFragment/onCreateOptionsMenu/inactiveAccountsPresent");
                C108955ca.A1G(menu, A15 ? 1 : 0, 101, 2131886391);
                i2 = 102;
            } else {
                str = "WfacBanBaseFragment/onCreateOptionsMenu/no inactiveAccountsPresent";
                C31081ez.A02(str);
                i = 2131898550;
                C108955ca.A1G(menu, A15, i2, i);
            }
            i = 2131895098;
            C108955ca.A1G(menu, A15, i2, i);
        }
    }
}
