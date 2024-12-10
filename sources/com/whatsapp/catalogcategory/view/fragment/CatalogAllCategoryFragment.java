package com.whatsapp.catalogcategory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1L9;
import X.AnonymousClass3MX;
import X.AnonymousClass8HR;
import X.AnonymousClass9VQ;
import X.AnonymousClass9XB;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C179299Hk;
import X.C18070vi;
import X.C18100vl;
import X.C20324AGg;
import X.C20339AGv;
import X.C21456AkN;
import X.C21728Are;
import X.C21893AuJ;
import X.C21894AuK;
import X.C22164Ayg;
import X.C22165Ayh;
import X.C22166Ayi;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import java.util.ArrayList;

public final class CatalogAllCategoryFragment extends Hilt_CatalogAllCategoryFragment {
    public RecyclerView A00;
    public AnonymousClass1L9 A01;
    public AnonymousClass9VQ A02;
    public AnonymousClass8HR A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21893AuJ(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C21894AuK(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A0G = C108955ca.A0G(layoutInflater, viewGroup, 2131625343, false);
        RecyclerView recyclerView = (RecyclerView) C18070vi.A05(A0G, 2131432071);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.A0R = true;
        this.A00 = recyclerView;
        AnonymousClass8HR r1 = new AnonymousClass8HR((C20324AGg) this.A04.getValue(), new C21728Are(this.A05.getValue(), 22));
        this.A03 = r1;
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 == null) {
            C18070vi.A11("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(r1);
        return A0G;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C18100vl r4 = this.A05;
        C20339AGv.A00(A1G(), ((CatalogAllCategoryViewModel) r4.getValue()).A01, new C22164Ayg(this), 27);
        C20339AGv.A00(A1G(), ((CatalogAllCategoryViewModel) r4.getValue()).A00, new C22165Ayh(this), 27);
        C20339AGv.A00(A1G(), ((CatalogAllCategoryViewModel) r4.getValue()).A02, new C22166Ayi(this), 27);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String string = A15().getString("parent_category_id");
        Parcelable parcelable = A15().getParcelable("category_biz_id");
        String string2 = A15().getString("category_display_context", "CATALOG_CATEGORY_FLOW");
        C18070vi.A0b(string2);
        C179299Hk valueOf = C179299Hk.valueOf(string2);
        if (string == null || parcelable == null) {
            throw AnonymousClass000.A0k("Required categoryParentId and bizJid not found");
        }
        CatalogAllCategoryViewModel catalogAllCategoryViewModel = (CatalogAllCategoryViewModel) this.A05.getValue();
        int A1J = C108975cc.A1J(valueOf);
        AnonymousClass3MX.A1J(C108945cZ.A0Q(catalogAllCategoryViewModel.A09), A1J);
        if (valueOf == C179299Hk.CATALOG_CATEGORY_FLOW) {
            AnonymousClass1DS A0Q = C108945cZ.A0Q(catalogAllCategoryViewModel.A08);
            ArrayList A13 = AnonymousClass000.A13();
            do {
                A13.add(new AnonymousClass9XB(1));
                A1J++;
            } while (A1J < 5);
            A0Q.A0F(A13);
        }
        catalogAllCategoryViewModel.A05.CGF(new C21456AkN(catalogAllCategoryViewModel, parcelable, valueOf, string, 9));
    }
}
