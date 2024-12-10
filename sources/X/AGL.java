package X;

import android.content.Context;
import android.view.MenuItem;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Map;

public final /* synthetic */ class AGL implements AnonymousClass03O {
    public final /* synthetic */ ProductBottomSheet A00;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        ProductBottomSheet productBottomSheet = this.A00;
        if (menuItem.getItemId() != 2131427523) {
            return false;
        }
        ProductBottomSheetViewModel productBottomSheetViewModel = productBottomSheet.A06;
        if (productBottomSheetViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        Context A14 = productBottomSheet.A14();
        C20287AEv aEv = productBottomSheetViewModel.A02;
        if (aEv == null || (str = aEv.A0H) == null) {
            return true;
        }
        UserJid userJid = productBottomSheetViewModel.A03;
        if (userJid != null) {
            boolean A0O = productBottomSheetViewModel.A0H.A0O(userJid);
            C20057A5g.A03(A14, productBottomSheetViewModel.A0I, (C19957A0o) productBottomSheetViewModel.A0L.get(), userJid, (Integer) null, (Integer) null, str, 3, A0O, A0O, false);
        }
        A41.A00((C193529qF) null, (A41) productBottomSheetViewModel.A0P.get(), productBottomSheetViewModel.A03, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 47);
        return true;
    }

    public /* synthetic */ AGL(ProductBottomSheet productBottomSheet) {
        this.A00 = productBottomSheet;
    }
}
