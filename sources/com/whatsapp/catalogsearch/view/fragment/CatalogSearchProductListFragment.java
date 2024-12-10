package com.whatsapp.catalogsearch.view.fragment;

import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass8l7;
import X.AnonymousClass9VR;
import X.C167928i0;
import X.C18100vl;
import X.C21904AuU;
import X.C26911Ty;

public final class CatalogSearchProductListFragment extends Hilt_CatalogSearchProductListFragment {
    public AnonymousClass9VR A00;
    public C26911Ty A01;
    public CatalogSearchFragment A02;
    public AnonymousClass00H A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21904AuU(this));

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1x(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            super.A1x(r3)
            boolean r0 = r3 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.Fragment r1 = r2.A0E
            boolean r0 = r1 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment
            if (r0 == 0) goto L_0x001c
            r3 = r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment.CatalogSearchProductListHost"
            X.C18070vi.A0z(r1, r0)
        L_0x0017:
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r3 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r3
            r2.A02 = r3
            return
        L_0x001c:
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r3)
            java.lang.String r0 = " or parentFragment must implement CatalogSearchProductListFragment.CatalogSearchProductListHost"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment.A1x(android.content.Context):void");
    }

    public final void A29() {
        C167928i0 A26 = A26();
        if (A26 instanceof AnonymousClass8l7) {
            A26.A00.clear();
            A26.A08.clear();
            A26.notifyDataSetChanged();
        }
    }
}
