package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.9Nc  reason: invalid class name and case insensitive filesystem */
public abstract class C180579Nc {
    public void A00() {
        C192829p3 r0;
        C167948i2 r02 = (C167948i2) this;
        int i = r02.A00;
        Object obj = r02.A01;
        switch (i) {
            case 0:
                r0 = ((C168578j9) obj).A4e().A0E;
                break;
            case 1:
                AnonymousClass8F5 r03 = ((ProductListActivity) obj).A0F;
                if (r03 != null) {
                    r0 = r03.A04;
                    break;
                } else {
                    C18070vi.A11("productListViewModel");
                    throw null;
                }
            case 2:
                r0 = ((C168648jP) obj).A4d().A0D;
                break;
            case 3:
                r0 = ((ProductBottomSheetViewModel) obj).A00;
                if (r0 == null) {
                    return;
                }
                break;
            case 4:
                r0 = ((C169018kE) obj).A4b().A02;
                break;
            case 5:
                r0 = ((AnonymousClass8FU) ((BusinessProductListBaseFragment) obj).A0K.getValue()).A02;
                break;
            default:
                r0 = ((C161538Fq) obj).A02;
                break;
        }
        r0.A00();
    }
}
