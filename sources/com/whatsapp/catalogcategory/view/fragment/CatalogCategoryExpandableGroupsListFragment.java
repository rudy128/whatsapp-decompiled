package com.whatsapp.catalogcategory.view.fragment;

import X.AG3;
import X.AG4;
import X.AG5;
import X.AG6;
import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1L9;
import X.AnonymousClass8DF;
import X.AnonymousClass8lp;
import X.AnonymousClass9VQ;
import X.AnonymousClass9XB;
import X.AnonymousClass9XC;
import X.C108945cZ;
import X.C108955ca;
import X.C169508ln;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C20324AGg;
import X.C20339AGv;
import X.C21467AkY;
import X.C21895AuL;
import X.C21896AuM;
import X.C22167Ayj;
import X.C22168Ayk;
import X.C22169Ayl;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class CatalogCategoryExpandableGroupsListFragment extends Hilt_CatalogCategoryExpandableGroupsListFragment {
    public int A00 = -1;
    public ExpandableListView A01;
    public AnonymousClass1L9 A02;
    public AnonymousClass9VQ A03;
    public AnonymousClass8DF A04;
    public UserJid A05;
    public String A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C21895AuL(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C21896AuM(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A0G = C108955ca.A0G(layoutInflater, viewGroup, 2131625356, false);
        this.A01 = (ExpandableListView) C18070vi.A05(A0G, 2131430712);
        AnonymousClass8DF r1 = new AnonymousClass8DF((C20324AGg) this.A07.getValue());
        this.A04 = r1;
        ExpandableListView expandableListView = this.A01;
        if (expandableListView != null) {
            expandableListView.setAdapter(r1);
            ExpandableListView expandableListView2 = this.A01;
            if (expandableListView2 != null) {
                expandableListView2.setOnChildClickListener(new AG3(this));
                ExpandableListView expandableListView3 = this.A01;
                if (expandableListView3 != null) {
                    expandableListView3.setOnGroupClickListener(new AG4(this));
                    ExpandableListView expandableListView4 = this.A01;
                    if (expandableListView4 != null) {
                        expandableListView4.setOnGroupExpandListener(new AG6(this));
                        ExpandableListView expandableListView5 = this.A01;
                        if (expandableListView5 != null) {
                            expandableListView5.setOnGroupCollapseListener(new AG5(this));
                            return A0G;
                        }
                    }
                }
            }
        }
        C18070vi.A11("expandableListView");
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C18100vl r4 = this.A08;
        C20339AGv.A00(A1G(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A00, new C22167Ayj(this), 28);
        C20339AGv.A00(A1G(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A01, new C22168Ayk(this), 28);
        C20339AGv.A00(A1G(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A02, new C22169Ayl(this), 28);
    }

    public void A1u() {
        String str;
        super.A1u();
        int i = this.A00;
        if (i != -1) {
            ExpandableListView expandableListView = this.A01;
            if (expandableListView == null) {
                str = "expandableListView";
                C18070vi.A11(str);
                throw null;
            }
            expandableListView.expandGroup(i);
        }
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        UserJid userJid = this.A05;
        if (userJid == null) {
            str = "bizJid";
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass9XC r1 = (AnonymousClass9XC) catalogCategoryGroupsViewModel.A00.A06();
        if (r1 instanceof AnonymousClass8lp) {
            catalogCategoryGroupsViewModel.A0T(userJid, ((AnonymousClass8lp) r1).A00);
        }
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        String A0s = C108955ca.A0s(A15(), "parent_category_id");
        C18070vi.A0X(A0s);
        this.A06 = A0s;
        Parcelable parcelable = A15().getParcelable("category_biz_id");
        C17960vV.A07(parcelable);
        C18070vi.A0X(parcelable);
        this.A05 = (UserJid) parcelable;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        String str2 = this.A06;
        if (str2 == null) {
            str = "categoryParentId";
        } else {
            UserJid userJid = this.A05;
            if (userJid == null) {
                str = "bizJid";
            } else {
                AnonymousClass1DS A0Q = C108945cZ.A0Q(catalogCategoryGroupsViewModel.A06);
                ArrayList A13 = AnonymousClass000.A13();
                int i = 0;
                do {
                    A13.add(new AnonymousClass9XB(1));
                    i++;
                } while (i < 5);
                A0Q.A0F(new C169508ln(A13));
                C21467AkY.A00(catalogCategoryGroupsViewModel.A05, catalogCategoryGroupsViewModel, userJid, str2, 4);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
