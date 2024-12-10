package X;

import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;

/* renamed from: X.Axw  reason: case insensitive filesystem */
public final class C22118Axw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22118Axw(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CatalogListActivity catalogListActivity;
        int i;
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        this.this$0.CEx();
        if (str.length() != 0) {
            int hashCode = str.hashCode();
            if (hashCode != -1930003499) {
                if (hashCode != -1867169789) {
                    if (hashCode == 688255102 && str.equals("unserviceable_location")) {
                        catalogListActivity = this.this$0;
                        i = 2131897355;
                    }
                } else if (str.equals("success")) {
                    PostcodeChangeBottomSheet postcodeChangeBottomSheet = this.this$0.A07;
                    if (postcodeChangeBottomSheet != null) {
                        postcodeChangeBottomSheet.A2M();
                    }
                    CatalogListActivity.A0Q(this.this$0);
                }
                catalogListActivity = this.this$0;
                i = 2131896261;
            } else {
                if (str.equals("invalid_postcode")) {
                    PostcodeChangeBottomSheet postcodeChangeBottomSheet2 = this.this$0.A07;
                    if (postcodeChangeBottomSheet2 != null) {
                        postcodeChangeBottomSheet2.A2N();
                    }
                }
                catalogListActivity = this.this$0;
                i = 2131896261;
            }
            catalogListActivity.BhQ(i);
        }
        return C27621Wu.A00;
    }
}
