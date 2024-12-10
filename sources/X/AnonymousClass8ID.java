package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.catalog.view.CarouselScrollbarView;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;

/* renamed from: X.8ID  reason: invalid class name */
public class AnonymousClass8ID extends C39711tW {
    public final int A00;
    public final Object A01;

    public AnonymousClass8ID(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A0t(new AnonymousClass8ID(obj, i));
    }

    public void A03(RecyclerView recyclerView, int i) {
        switch (this.A00) {
            case 0:
                CarouselScrollbarView.A00((CarouselScrollbarView) this.A01);
                return;
            case 8:
                ((IndiaUpiBankPickerActivity) this.A01).A0L = true;
                return;
            default:
                super.A03(recyclerView, i);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0275, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0279, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        r0.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0230;
                case 1: goto L_0x0217;
                case 2: goto L_0x01a9;
                case 3: goto L_0x0009;
                case 4: goto L_0x0150;
                case 5: goto L_0x0111;
                case 6: goto L_0x00c4;
                case 7: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A04(r10, r11, r12)
        L_0x0008:
            return
        L_0x0009:
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.Object r3 = r9.A01
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r3 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r3
            com.whatsapp.biz.catalog.view.activity.ProductListActivity.A03(r3)
            X.8I0 r0 = r3.A0E
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "productSectionsListAdapter"
            goto L_0x0275
        L_0x001c:
            boolean r0 = r0.A0U()
            if (r0 != 0) goto L_0x0008
            X.1qy r0 = r10.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.A0J()
            int r1 = r0.A0K()
            int r0 = r0.A1O()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            X.8F5 r0 = r3.A0F
            if (r0 != 0) goto L_0x0238
            java.lang.String r0 = "productListViewModel"
            goto L_0x0275
        L_0x0043:
            if (r12 <= 0) goto L_0x0008
            java.lang.Object r3 = r9.A01
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r3 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            X.C18070vi.A0b(r0)
            X.1qy r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.A0J()
            int r1 = r0.A0K()
            int r0 = r0.A1O()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
            X.8i0 r0 = r3.A26()
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0008
            boolean r0 = r3 instanceof com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment
            if (r0 == 0) goto L_0x024a
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment r3 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment) r3
            X.8i0 r0 = r3.A26()
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0008
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = r3.A02
            if (r1 == 0) goto L_0x0008
            X.0vl r0 = r1.A0P
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r4 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r4
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.1DS r0 = r0.A00
            java.lang.String r3 = X.C108945cZ.A1F(r0)
            if (r3 != 0) goto L_0x009d
            java.lang.String r3 = ""
        L_0x009d:
            X.0vl r0 = r1.A0L
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.AEW r1 = r1.A09
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.A1i r0 = (X.C19973A1i) r0
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x023c
            X.8mE r1 = X.AnonymousClass8mE.A00
            X.8mI r0 = new X.8mI
            r0.<init>(r1)
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel.A00(r4, r0)
            return
        L_0x00c4:
            java.lang.Object r3 = r9.A01
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment r3 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment) r3
            r0 = -1
            boolean r1 = r10.canScrollVertically(r0)
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r0 = com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment.A00(r3)
            if (r1 == 0) goto L_0x0101
            r0.A4d()
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r2 = com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment.A00(r3)
            r0 = 2131434972(0x7f0b1ddc, float:1.8491773E38)
            android.view.View r1 = r2.findViewById(r0)
            float r0 = X.C28891bE.A00(r2)
        L_0x00e5:
            X.AnonymousClass1HF.A0W(r1, r0)
            if (r12 == 0) goto L_0x0008
            int r1 = r10.getScrollState()
            r0 = 1
            if (r1 != r0) goto L_0x0008
            android.view.View r0 = r3.A0B
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 == 0) goto L_0x0008
            android.view.View r1 = r3.A0B
            if (r1 == 0) goto L_0x0008
            X.1L4 r0 = r3.A0D
            goto L_0x0189
        L_0x0101:
            r0.A4b()
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r1 = com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment.A00(r3)
            r0 = 2131434972(0x7f0b1ddc, float:1.8491773E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 0
            goto L_0x00e5
        L_0x0111:
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.1qy r0 = r10.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0008
            int r5 = r0.A0J()
            int r4 = r0.A0K()
            int r3 = r0.A1O()
            java.lang.Object r2 = r9.A01
            X.8kE r2 = (X.C169018kE) r2
            X.8F1 r0 = r2.A4b()
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = r0.A04
            X.1DT r0 = r0.A03
            java.lang.Object r1 = r0.A06()
            int r5 = r5 + r3
            int r4 = r4 - r5
            r0 = 4
            if (r4 > r0) goto L_0x014c
            boolean r0 = r1 instanceof X.C168608jI
            if (r0 == 0) goto L_0x014c
            r1 = 13
            X.AkD r0 = new X.AkD
            r0.<init>(r2, r1)
            r10.post(r0)
        L_0x014c:
            X.C169018kE.A03(r2)
            return
        L_0x0150:
            java.lang.Object r2 = r9.A01
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r2 = (com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment) r2
            com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r3 = r2.A25()
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x018d
            r3.A4c()
            r0 = 2131434972(0x7f0b1ddc, float:1.8491773E38)
            android.view.View r1 = r3.findViewById(r0)
            float r0 = X.C28891bE.A00(r3)
        L_0x016f:
            X.AnonymousClass1HF.A0W(r1, r0)
            if (r12 == 0) goto L_0x0008
            int r1 = r10.getScrollState()
            r0 = 1
            if (r1 != r0) goto L_0x0008
            android.view.View r0 = r2.A0B
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 == 0) goto L_0x0008
            android.view.View r1 = r2.A0B
            if (r1 == 0) goto L_0x0008
            X.1L4 r0 = r2.A05
        L_0x0189:
            r0.A01(r1)
            return
        L_0x018d:
            android.view.Menu r0 = r3.A00
            if (r0 == 0) goto L_0x019d
            r1 = 1
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L_0x019d
            android.view.Menu r0 = r3.A00
            r0.removeItem(r1)
        L_0x019d:
            r0 = 0
            r3.A09 = r0
            r0 = 2131434972(0x7f0b1ddc, float:1.8491773E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 0
            goto L_0x016f
        L_0x01a9:
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            int r0 = r10.getScrollState()
            if (r0 == 0) goto L_0x0008
            X.1qy r3 = r10.getLayoutManager()
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x01d0
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            if (r3 == 0) goto L_0x01d0
            int r2 = r3.A0J()
            int r1 = r3.A0K()
            int r0 = r3.A1O()
            int r2 = r2 + r0
            int r1 = r1 - r2
            r0 = 4
            if (r1 > r0) goto L_0x0008
        L_0x01d0:
            java.lang.Object r0 = r9.A01
            X.8j9 r0 = (X.C168578j9) r0
            X.8F8 r2 = r0.A4e()
            com.whatsapp.jid.UserJid r4 = r0.A4f()
            X.A1i r1 = r2.A0M
            X.AEW r0 = r2.A00
            boolean r0 = r1.A03(r0, r4)
            if (r0 == 0) goto L_0x020f
            X.A7x r0 = r2.A0I
            X.9q5 r0 = r0.A05(r4)
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x020f
        L_0x01f2:
            com.whatsapp.biz.catalog.manager.CatalogManager r3 = r2.A0L
            int r2 = r2.A05
            r1 = 0
            boolean r0 = com.whatsapp.biz.catalog.manager.CatalogManager.A05(r3, r4)
            int r0 = X.C72453Mb.A03(r0)
            int r0 = r0 * 4
            com.whatsapp.biz.catalog.manager.CatalogManager.A02(r3, r4, r2, r0, r1)
        L_0x0204:
            r1 = 45
            X.Ajr r0 = new X.Ajr
            r0.<init>(r10, r1)
            r10.post(r0)
            return
        L_0x020f:
            com.whatsapp.biz.catalog.manager.CatalogManager r1 = r2.A0L
            int r0 = r2.A05
            r1.A0E(r4, r0)
            goto L_0x0204
        L_0x0217:
            r0 = 5
            if (r12 <= r0) goto L_0x0228
            java.lang.Object r1 = r9.A01
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            X.9kw r0 = r1.A08
            if (r0 == 0) goto L_0x0225
            r0.A00()
        L_0x0225:
            r0 = 0
            r1.A08 = r0
        L_0x0228:
            java.lang.Object r0 = r9.A01
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r0 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r0
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A0V(r0)
            return
        L_0x0230:
            java.lang.Object r0 = r9.A01
            com.whatsapp.biz.catalog.view.CarouselScrollbarView r0 = (com.whatsapp.biz.catalog.view.CarouselScrollbarView) r0
            com.whatsapp.biz.catalog.view.CarouselScrollbarView.A00(r0)
            return
        L_0x0238:
            r0.A0T()
            return
        L_0x023c:
            X.00H r0 = r4.A05
            java.lang.Object r1 = r0.get()
            X.9y8 r1 = (X.C198309y8) r1
            X.9Hl r0 = X.C179309Hl.CONTINUE
            X.C198309y8.A00(r0, r1, r2, r3)
            return
        L_0x024a:
            com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment r3 = (com.whatsapp.businessproductlist.view.fragment.CollectionProductListFragment) r3
            X.0vl r0 = r3.A0I
            java.lang.Object r4 = r0.getValue()
            X.8Ey r4 = (X.AnonymousClass8Ey) r4
            com.whatsapp.jid.UserJid r5 = r3.A27()
            java.lang.String r6 = r3.A0F
            if (r6 == 0) goto L_0x0273
            int r1 = r3.A00
            r0 = -1
            boolean r8 = X.AnonymousClass000.A1S(r1, r0)
            X.1OX r1 = X.C41561wd.A00(r4)
            X.0wl r0 = r4.A02
            r7 = 0
            com.whatsapp.businessproductlist.view.viewmodel.CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1 r3 = new com.whatsapp.businessproductlist.view.viewmodel.CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass3MW.A1X(r0, r3, r1)
            return
        L_0x0273:
            java.lang.String r0 = "collectionId"
        L_0x0275:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ID.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
