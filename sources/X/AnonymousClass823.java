package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.823  reason: invalid class name */
public final class AnonymousClass823 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $selectedCategoryId;
    public final /* synthetic */ CatalogCategoryTabsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass823(CatalogCategoryTabsActivity catalogCategoryTabsActivity, String str) {
        super(1);
        this.this$0 = catalogCategoryTabsActivity;
        this.$selectedCategoryId = str;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.292, X.8Et, X.1b8] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        ? r6 = new AnonymousClass292(AnonymousClass3MX.A0O(this.this$0), 1);
        C72453Mb.A1R(list);
        r6.A00 = list;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.this$0;
        View A0C = AnonymousClass3MY.A0C(catalogCategoryTabsActivity, 2131436808);
        CatalogCategoryTabsActivity catalogCategoryTabsActivity2 = this.this$0;
        String str = this.$selectedCategoryId;
        ViewPager viewPager = (ViewPager) A0C;
        catalogCategoryTabsActivity2.A04.getValue();
        C18070vi.A0d(str, 1);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C18070vi.A18(((C194889sS) it.next()).A01, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        viewPager.setAdapter(r6);
        viewPager.setCurrentItem(i);
        catalogCategoryTabsActivity.A00 = viewPager;
        View A0A = C110885hR.A0A(this.this$0, 2131436004);
        CatalogCategoryTabsActivity catalogCategoryTabsActivity3 = this.this$0;
        TabLayout tabLayout = (TabLayout) A0A;
        ViewPager viewPager2 = catalogCategoryTabsActivity3.A00;
        if (viewPager2 == null) {
            C18070vi.A11("viewPager");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager2);
        C108985cd.A1I(new AnonymousClass7BP(tabLayout, catalogCategoryTabsActivity3, list), tabLayout.A0g);
        Iterator it2 = C28851b7.A08(0, C108945cZ.A07(tabLayout)).iterator();
        while (it2.hasNext()) {
            int A00 = ((AnonymousClass20T) it2).A00();
            View childAt = C108955ca.A0H(tabLayout.getChildAt(0)).getChildAt(A00);
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(childAt);
            int dimensionPixelSize = AnonymousClass000.A0Y(tabLayout).getDimensionPixelSize(2131165905);
            int dimensionPixelSize2 = AnonymousClass000.A0Y(tabLayout).getDimensionPixelSize(2131165906);
            if (A00 == 0) {
                int dimensionPixelSize3 = AnonymousClass000.A0Y(tabLayout).getDimensionPixelSize(2131165907);
                if (AnonymousClass3MW.A1Z(catalogCategoryTabsActivity3.A00)) {
                    A0P.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2);
                } else {
                    A0P.setMargins(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                }
            } else {
                A0P.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            }
            childAt.requestLayout();
        }
        return C27621Wu.A00;
    }
}
