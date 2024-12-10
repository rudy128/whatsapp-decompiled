package com.whatsapp.catalogsearch.view.fragment;

import X.AEW;
import X.AFX;
import X.AGK;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1PM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VZ;
import X.AnonymousClass8m3;
import X.AnonymousClass8m4;
import X.AnonymousClass8mH;
import X.AnonymousClass9MB;
import X.B7J;
import X.C108945cZ;
import X.C108975cc;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C185779d8;
import X.C19973A1i;
import X.C201811d;
import X.C20339AGv;
import X.C21897AuN;
import X.C21898AuO;
import X.C21901AuR;
import X.C21902AuS;
import X.C21903AuT;
import X.C22170Aym;
import X.C22171Ayn;
import X.C22172Ayo;
import X.C22437B7t;
import X.C23520Bik;
import X.C26911Ty;
import X.C42491yG;
import X.C42741yf;
import X.C61172pF;
import X.C72453Mb;
import X.C72463Mc;
import X.C89884dB;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class CatalogSearchFragment extends Hilt_CatalogSearchFragment implements C22437B7t {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public Toolbar A07;
    public C26911Ty A08;
    public AEW A09;
    public AnonymousClass1PM A0A;
    public C18000vb A0B;
    public AnonymousClass4VZ A0C;
    public AnonymousClass10I A0D;
    public WDSButton A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public MenuItem A0H;
    public View A0I;
    public View A0J;
    public boolean A0K;
    public final C18100vl A0L = AnonymousClass1DF.A01(new C21897AuN(this));
    public final C18100vl A0M = AnonymousClass1DF.A01(new C21898AuO(this));
    public final C18100vl A0N = AnonymousClass1DF.A01(new C21901AuR(this));
    public final C18100vl A0O = AnonymousClass1DF.A01(new C21902AuS(this));
    public final C18100vl A0P = AnonymousClass1DF.A01(new C21903AuT(this));
    public final AnonymousClass00H A0Q = C201811d.A00(49512);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625357, viewGroup, false);
        this.A01 = inflate.findViewById(2131429506);
        this.A02 = inflate.findViewById(2131434862);
        this.A05 = C17880vN.A0E(inflate, 2131434864);
        this.A0I = inflate.findViewById(2131434866);
        this.A0J = inflate.findViewById(2131434867);
        this.A04 = inflate.findViewById(2131434956);
        this.A06 = C17880vN.A0E(inflate, 2131434958);
        this.A0E = AnonymousClass3MW.A0r(inflate, 2131434957);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A07 = (Toolbar) A1D().findViewById(2131436270);
        View findViewById = A1D().findViewById(2131434898);
        this.A03 = findViewById;
        if (this.A07 == null || findViewById == null) {
            throw AnonymousClass000.A0n("Required @layout/toolbar_with_search not found in host activity");
        }
        AnonymousClass1FL A1D = A1D();
        C18000vb r5 = this.A0B;
        if (r5 != null) {
            this.A0C = new AnonymousClass4VZ(A1D, this.A03, new AGK(this, 2), this.A07, r5);
            View view2 = this.A02;
            if (view2 != null) {
                C89884dB.A00(view2, this, 8);
                C42491yG.A02(view2);
            }
            C18100vl r4 = this.A0P;
            C20339AGv.A00(A1G(), C108945cZ.A0Q(((CatalogSearchViewModel) r4.getValue()).A07), new C22170Aym(this), 29);
            C20339AGv.A00(A1G(), ((CatalogSearchViewModel) r4.getValue()).A00, new C22171Ayn(this), 29);
            C20339AGv.A00(A1G(), ((CatalogSearchViewModel) r4.getValue()).A01, new C22172Ayo(this), 29);
            WDSButton wDSButton = this.A0E;
            if (wDSButton != null) {
                C89884dB.A00(wDSButton, this, 9);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public boolean A24(MenuItem menuItem) {
        View findViewById;
        C18070vi.A0d(menuItem, 0);
        if (2131432620 != menuItem.getItemId()) {
            return false;
        }
        View view = this.A01;
        if (view != null) {
            view.setVisibility(0);
        }
        AnonymousClass4VZ r0 = this.A0C;
        if (r0 == null) {
            C18070vi.A11("searchToolbarHelper");
            throw null;
        }
        r0.A06(false);
        CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0P.getValue();
        C18100vl r2 = this.A0L;
        UserJid userJid = (UserJid) r2.getValue();
        int i = this.A00;
        AEW aew = this.A09;
        C18070vi.A0d(userJid, 0);
        C19973A1i a1i = (C19973A1i) catalogSearchViewModel.A02.get();
        CatalogSearchViewModel.A00(catalogSearchViewModel, new AnonymousClass8mH(C19973A1i.A00(a1i, aew, "categories", C18020vd.A05(C18040vf.A02, a1i.A00, 1514))));
        C61172pF r8 = (C61172pF) catalogSearchViewModel.A03.get();
        int i2 = 1;
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = -1;
                }
            }
        }
        C61172pF.A00(r8, userJid, Integer.valueOf(i2), (Integer) null, (String) null, 1);
        ((C185779d8) catalogSearchViewModel.A04.get()).A01.A0F("");
        View view2 = this.A03;
        if (!(view2 == null || (findViewById = view2.findViewById(2131434851)) == null)) {
            C89884dB.A00(findViewById, this, 10);
        }
        View view3 = this.A03;
        if (view3 != null) {
            view3.setBackgroundResource(2131232920);
        }
        AnonymousClass4VZ r02 = this.A0C;
        if (r02 != null) {
            TextView A0E2 = AnonymousClass3Ma.A0E(r02.A00, 2131434969);
            A0E2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
            C72463Mc.A0w(A14(), A14(), A0E2, 2130971105, 2131102431);
            A0E2.setHintTextColor(AnonymousClass3MZ.A02(A14(), A14(), 2130970055, 2131101191));
            A0E2.setTextSize(0, AnonymousClass3MZ.A09(this).getDimension(2131169432));
            AnonymousClass1PM r1 = this.A0A;
            if (r1 != null) {
                C42741yf A022 = r1.A02((UserJid) r2.getValue());
                if (A022 != null) {
                    A0E2.setHint(AnonymousClass3MX.A16(this, A022.A08, new Object[1], 0, 2131895526));
                }
                AnonymousClass4VZ r03 = this.A0C;
                if (r03 != null) {
                    r03.A00.A03 = new AFX(this, 1);
                    return true;
                }
            } else {
                C18070vi.A11("verifiedNameManager");
                throw null;
            }
        }
        C18070vi.A11("searchToolbarHelper");
        throw null;
    }

    public void Bu9(int i) {
    }

    public static final C23520Bik A00(CatalogSearchFragment catalogSearchFragment, AnonymousClass9MB r5) {
        int i;
        if (r5 instanceof AnonymousClass8m4) {
            i = 2131888009;
        } else if (r5 instanceof AnonymousClass8m3) {
            i = 2131888006;
        } else {
            throw AnonymousClass3MW.A14();
        }
        String A0n = AnonymousClass3MY.A0n(catalogSearchFragment, i);
        catalogSearchFragment.A0Q.get();
        String A0n2 = AnonymousClass3MY.A0n(catalogSearchFragment, 2131899286);
        C23520Bik A022 = C23520Bik.A02(catalogSearchFragment.A17(), A0n, 4000);
        A022.A0G(A0n2, new C89884dB(A022, 7));
        return A022;
    }

    public static final void A02(CatalogSearchFragment catalogSearchFragment) {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        AnonymousClass4VZ r0 = catalogSearchFragment.A0C;
        if (r0 != null) {
            r0.A00.getVisibility();
            AnonymousClass4VZ r02 = catalogSearchFragment.A0C;
            if (r02 != null) {
                r02.A00.clearFocus();
                Fragment A0Q2 = catalogSearchFragment.A1E().A0Q("SEARCH_RESULT_LIST_FRAGMENT");
                if ((A0Q2 instanceof CatalogSearchProductListFragment) && (catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0Q2) != null) {
                    catalogSearchProductListFragment.A29();
                    return;
                }
                return;
            }
        }
        C18070vi.A11("searchToolbarHelper");
        throw null;
    }

    public void A1r() {
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0M.getValue());
            super.A1r();
            return;
        }
        C18070vi.A11("businessProfileObservers");
        throw null;
    }

    public void A26(boolean z) {
        View view = this.A01;
        if (view != null && view.getVisibility() == 0) {
            C72453Mb.A1D(this.A01);
            AnonymousClass4VZ r0 = this.A0C;
            if (r0 == null) {
                C18070vi.A11("searchToolbarHelper");
                throw null;
            }
            r0.A05(z);
            UserJid userJid = (UserJid) this.A0L.getValue();
            C18070vi.A0d(userJid, 0);
            C61172pF.A00((C61172pF) ((CatalogSearchViewModel) this.A0P.getValue()).A03.get(), userJid, (Integer) null, (Integer) null, (String) null, 7);
        }
    }

    public boolean A27() {
        View view = this.A01;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        A26(true);
        AnonymousClass1FL A1D = A1D();
        if (!(A1D instanceof B7J)) {
            return true;
        }
        ((B7J) A1D).Bo1();
        return true;
    }

    public static final void A01(Bundle bundle, CatalogSearchFragment catalogSearchFragment) {
        catalogSearchFragment.A0K = bundle.getBoolean("all_category_has_navigated_to_category_tabs", C108975cc.A1J(bundle));
    }

    public static final void A03(CatalogSearchFragment catalogSearchFragment, String str) {
        A02(catalogSearchFragment);
        C18100vl r4 = catalogSearchFragment.A0P;
        C18100vl r2 = catalogSearchFragment.A0L;
        ((CatalogSearchViewModel) r4.getValue()).A0T(catalogSearchFragment.A09, (UserJid) r2.getValue(), str);
        UserJid userJid = (UserJid) r2.getValue();
        C18070vi.A0d(userJid, 0);
        C61172pF.A00((C61172pF) ((CatalogSearchViewModel) r4.getValue()).A03.get(), userJid, (Integer) null, (Integer) null, (String) null, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r5, java.lang.String r6, X.C18090vk r7, boolean r8) {
        /*
            X.1GP r0 = r5.A1E()
            androidx.fragment.app.Fragment r3 = r0.A0Q(r6)
            if (r3 != 0) goto L_0x000d
            if (r8 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r0 = "SEARCH_CATEGORY_FRAGMENT"
            boolean r4 = r6.equals(r0)
            r2 = 8
            r1 = 1
            if (r4 == 0) goto L_0x0025
            android.view.View r0 = r5.A0I
            if (r0 == 0) goto L_0x0036
            if (r8 == r1) goto L_0x0032
            if (r8 == 0) goto L_0x0033
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0025:
            android.view.View r0 = r5.A0J
            if (r0 == 0) goto L_0x0036
            if (r8 == r1) goto L_0x0032
            if (r8 == 0) goto L_0x0033
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0032:
            r2 = 0
        L_0x0033:
            r0.setVisibility(r2)
        L_0x0036:
            if (r3 != 0) goto L_0x003e
            java.lang.Object r3 = r7.invoke()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
        L_0x003e:
            X.1jj r2 = X.C72453Mb.A0Y(r5)
            boolean r0 = r3.A1b()
            if (r0 != 0) goto L_0x0053
            r0 = 2131434867(0x7f0b1d73, float:1.849156E38)
            if (r4 == 0) goto L_0x0050
            r0 = 2131434866(0x7f0b1d72, float:1.8491558E38)
        L_0x0050:
            r2.A0C(r3, r6, r0)
        L_0x0053:
            X.1GP r1 = r3.A0I
            if (r8 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x008b
            X.1GP r0 = r2.A0K
            if (r1 == r0) goto L_0x008b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot show Fragment attached to a different FragmentManager. Fragment "
            r1.append(r0)
            X.AnonymousClass8BS.A1D(r3, r1)
            java.lang.String r0 = " is already attached to a FragmentManager."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x0070:
            if (r1 == 0) goto L_0x0089
            X.1GP r0 = r2.A0K
            if (r1 == r0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot hide Fragment attached to a different FragmentManager. Fragment "
            r1.append(r0)
            X.AnonymousClass8BS.A1D(r3, r1)
            java.lang.String r0 = " is already attached to a FragmentManager."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x0089:
            r1 = 4
            goto L_0x008c
        L_0x008b:
            r1 = 5
        L_0x008c:
            X.1kD r0 = new X.1kD
            r0.<init>(r3, r1)
            r2.A0F(r0)
            r2.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A04(com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment, java.lang.String, X.0vk, boolean):void");
    }

    public void A1j() {
        super.A1j();
        if (this.A0K) {
            this.A0K = false;
            A26(false);
        }
    }

    public void A1s() {
        super.A1s();
        View view = this.A02;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        WDSButton wDSButton = this.A0E;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0H = null;
        this.A07 = null;
        this.A03 = null;
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        this.A0I = null;
        this.A0J = null;
        this.A04 = null;
        this.A06 = null;
        this.A0E = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A1Z(true);
        this.A00 = A15().getInt("search_entry_point");
        this.A09 = (AEW) A15().getParcelable("business_profile");
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            C17880vN.A0V(r0).registerObserver(this.A0M.getValue());
        } else {
            C18070vi.A11("businessProfileObservers");
            throw null;
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A16 = C18070vi.A16(menu, menuInflater);
        MenuItem findItem = menu.findItem(2131432620);
        this.A0H = findItem;
        if (findItem != null) {
            findItem.setVisible(A16);
        }
    }
}
