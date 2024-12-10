package X;

import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.ANz  reason: case insensitive filesystem */
public class C20514ANz implements B7O {
    public final int A00;
    public final Object A01;

    public C20514ANz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C2L(long j) {
        FragmentContainerView fragmentContainerView;
        VariantsCarouselBaseFragment variantsCarouselBaseFragment;
        long j2 = j;
        if (this.A00 != 0) {
            ProductBottomSheet productBottomSheet = (ProductBottomSheet) this.A01;
            ProductBottomSheetViewModel productBottomSheetViewModel = productBottomSheet.A06;
            List list = null;
            if (productBottomSheetViewModel == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            VariantsCarouselBaseFragment variantsCarouselBaseFragment2 = productBottomSheet.A04;
            if (variantsCarouselBaseFragment2 != null) {
                VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = variantsCarouselBaseFragment2.A02;
                if (variantsCarouselFragmentViewModel != null) {
                    list = variantsCarouselFragmentViewModel.A03;
                } else {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
            }
            productBottomSheetViewModel.A0U(list, j);
            return;
        }
        C168648jP r2 = (C168648jP) this.A01;
        C20287AEv A002 = AnonymousClass9PQ.A00(r2.A0K, r2.A0J);
        C28931bI r0 = r2.A0h;
        List list2 = null;
        if (!(r0 == null || (fragmentContainerView = (FragmentContainerView) r0.A02()) == null || (variantsCarouselBaseFragment = (VariantsCarouselBaseFragment) fragmentContainerView.getFragment()) == null)) {
            VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel2 = variantsCarouselBaseFragment.A02;
            if (variantsCarouselFragmentViewModel2 != null) {
                list2 = variantsCarouselFragmentViewModel2.A03;
            } else {
                AnonymousClass3MW.A1H();
                throw null;
            }
        }
        AnonymousClass8GC A4d = r2.A4d();
        UserJid A4e = r2.A4e();
        String str = r2.A10;
        String str2 = r2.A12;
        String str3 = r2.A0z;
        if (A002 == null) {
            C72463Mc.A1B(A4d.A07);
        } else {
            A4d.A0D.A01(A002, A4e, str, str2, str3, list2, j2);
        }
    }
}
