package X;

import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;

/* renamed from: X.Axu  reason: case insensitive filesystem */
public final class C22116Axu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22116Axu(CatalogListActivity catalogListActivity) {
        super(1);
        this.this$0 = catalogListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CatalogListActivity catalogListActivity = this.this$0;
        if (catalogListActivity.A05 != null) {
            String string = catalogListActivity.getResources().getString(2131887985, AnonymousClass8BV.A1b(obj));
            C18070vi.A0X(string);
            WaTextView waTextView = catalogListActivity.A05;
            if (waTextView != null) {
                waTextView.setText(string);
            }
        }
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = catalogListActivity.A07;
        if (postcodeChangeBottomSheet != null) {
            PostcodeViewModel postcodeViewModel = catalogListActivity.A06;
            if (postcodeViewModel != null) {
                String A1F = C108945cZ.A1F(postcodeViewModel.A04);
                PostcodeViewModel postcodeViewModel2 = catalogListActivity.A06;
                if (postcodeViewModel2 != null) {
                    PostcodeViewModel.A00(postcodeViewModel2, postcodeChangeBottomSheet, A1F);
                }
            }
            C18070vi.A11("postcodeViewModel");
            throw null;
        }
        return C27621Wu.A00;
    }
}
