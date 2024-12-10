package X;

import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;

/* renamed from: X.Ay1  reason: case insensitive filesystem */
public final class C22123Ay1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22123Ay1(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            CatalogListActivity catalogListActivity = this.this$0;
            AnonymousClass00H r0 = catalogListActivity.A0F;
            if (r0 != null) {
                ((C19957A0o) r0.get()).A01(catalogListActivity, new AOE(catalogListActivity, 0), str);
            } else {
                C18070vi.A11("businessProfileDialogUtils");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
