package X;

import android.content.Intent;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Axz  reason: case insensitive filesystem */
public final class C22121Axz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22121Axz(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid;
        String str;
        Intent A0A;
        String str2;
        C22366B4u b4u = (C22366B4u) obj;
        C18070vi.A0d(b4u, 0);
        CatalogListActivity catalogListActivity = this.this$0;
        if (b4u instanceof AO2) {
            AO2 ao2 = (AO2) b4u;
            userJid = ao2.A00;
            str = ao2.A01;
            AnonymousClass00H r0 = catalogListActivity.A0O;
            if (r0 != null) {
                A0A = AnonymousClass3MZ.A06(r0);
                A0A.setClassName(catalogListActivity.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity");
                str2 = "selected_category_parent_id";
            }
            AnonymousClass3MW.A1F();
            throw null;
        }
        if (b4u instanceof AO1) {
            userJid = ((AO1) b4u).A00;
            AnonymousClass00H r02 = catalogListActivity.A0O;
            if (r02 != null) {
                r02.get();
                str = "catalog_category_dummy_root_id";
                A0A = C17880vN.A0A();
                A0A.setClassName(catalogListActivity.getPackageName(), "com.whatsapp.catalogcategory.view.activity.CatalogAllCategoryActivity");
                str2 = "category_parent_id";
            }
        } else {
            if (b4u instanceof AO3) {
                AO3 ao3 = (AO3) b4u;
                UserJid userJid2 = ao3.A00;
                String str3 = ao3.A01;
                String str4 = ao3.A02;
                AnonymousClass00H r03 = catalogListActivity.A0O;
                if (r03 != null) {
                    r03.get();
                    Integer A0h = C17880vN.A0h();
                    catalogListActivity.A01.A0D(catalogListActivity, AnonymousClass1LU.A1C(catalogListActivity, userJid2, A0h, A0h, str3, str4, (String) null), 3000);
                }
            }
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1F();
        throw null;
        A0A.putExtra(str2, str);
        A0A.putExtra("business_owner_jid", userJid);
        catalogListActivity.A01.A08(catalogListActivity, A0A);
        return C27621Wu.A00;
    }
}
