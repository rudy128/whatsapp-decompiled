package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity$setUpdatePostcodeTooltipView$1;

/* renamed from: X.Ay0  reason: case insensitive filesystem */
public final class C22122Ay0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22122Ay0(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4ZN r6 = (AnonymousClass4ZN) obj;
        C18070vi.A0d(r6, 0);
        CatalogListActivity catalogListActivity = this.this$0;
        View findViewById = catalogListActivity.findViewById(2131428905);
        C18000vb r2 = catalogListActivity.A00;
        C18070vi.A0W(r2);
        C18070vi.A0b(findViewById);
        catalogListActivity.A08 = new C190439kw(findViewById, r2, r6.A03(catalogListActivity).toString());
        AnonymousClass3MX.A1Q(new CatalogListActivity$setUpdatePostcodeTooltipView$1(catalogListActivity, (C30391dr) null), AnonymousClass2SS.A00(catalogListActivity));
        return C27621Wu.A00;
    }
}
