package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.7BP  reason: invalid class name */
public final class AnonymousClass7BP implements C1606189f {
    public final /* synthetic */ TabLayout A00;
    public final /* synthetic */ CatalogCategoryTabsActivity A01;
    public final /* synthetic */ List A02;

    public void C8J(C136836uU r1) {
    }

    public void C8N(C136836uU r1) {
    }

    public AnonymousClass7BP(TabLayout tabLayout, CatalogCategoryTabsActivity catalogCategoryTabsActivity, List list) {
        this.A02 = list;
        this.A00 = tabLayout;
        this.A01 = catalogCategoryTabsActivity;
    }

    public void C8K(C136836uU r8) {
        List list = this.A02;
        TabLayout tabLayout = this.A00;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.A01;
        C194889sS r3 = (C194889sS) list.get(tabLayout.getSelectedTabPosition());
        ViewPager viewPager = catalogCategoryTabsActivity.A00;
        if (viewPager == null) {
            C18070vi.A11("viewPager");
            throw null;
        }
        viewPager.A0J(tabLayout.getSelectedTabPosition(), false);
        String str = r3.A01;
        UserJid userJid = r3.A00;
        boolean z = r3.A03;
        ((C190919lj) ((CatalogCategoryTabsViewModel) catalogCategoryTabsActivity.A04.getValue()).A03.get()).A00(userJid, str, 1, 3, tabLayout.getSelectedTabPosition(), z);
    }
}
