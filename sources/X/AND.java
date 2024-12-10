package X;

import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;

public class AND implements BAK {
    public final int A00;
    public final Object A01;

    public AND(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BuO(String str, int i) {
        if (this.A00 != 0) {
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) this.A01;
            if (C18070vi.A18(str, productBottomSheetViewModel.A04)) {
                B3T.A00(productBottomSheetViewModel.A0S);
                productBottomSheetViewModel.A0V(true);
            }
        }
    }

    public void BuP(String str) {
        if (this.A00 != 0) {
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) this.A01;
            if (C18070vi.A18(str, productBottomSheetViewModel.A04)) {
                if (str != null) {
                    C20738AWt.A00(C17880vN.A0V(productBottomSheetViewModel.A0T), str, 1);
                }
                C20287AEv A0A = ((C20114A7x) productBottomSheetViewModel.A0N.get()).A0A(productBottomSheetViewModel.A03, str);
                productBottomSheetViewModel.A02 = A0A;
                if (A0A == null || productBottomSheetViewModel.A0V(false)) {
                    B3T.A00(productBottomSheetViewModel.A0S);
                    return;
                }
                if (!productBottomSheetViewModel.A08) {
                    productBottomSheetViewModel.A01 = productBottomSheetViewModel.A02;
                }
                C199419zy r1 = (C199419zy) productBottomSheetViewModel.A0S.get();
                C199419zy.A00(r1, new B0W(r1, false));
                productBottomSheetViewModel.A0F.A0E((Object) null);
                productBottomSheetViewModel.A09 = true;
                productBottomSheetViewModel.A08 = true;
                ProductBottomSheetViewModel.A00(productBottomSheetViewModel);
                return;
            }
            return;
        }
        C187599g4 r3 = (C187599g4) this.A01;
        C20287AEv A0I = AnonymousClass8BX.A0I(r3.A04, str);
        if (A0I != null) {
            C21450AkH.A01(r3.A03, r3, A0I, 34);
        }
    }
}
