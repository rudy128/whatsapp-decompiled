package X;

import android.app.Application;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Alp  reason: case insensitive filesystem */
public final /* synthetic */ class C21542Alp implements C22821Di {
    public final /* synthetic */ ProductBottomSheetViewModel A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;

    public final Object invoke(Object obj) {
        ProductBottomSheetViewModel productBottomSheetViewModel = this.A00;
        UserJid userJid = this.A01;
        String str = this.A02;
        C194359rb r5 = (C194359rb) obj;
        if (r5 == null) {
            C199419zy r2 = (C199419zy) productBottomSheetViewModel.A0S.get();
            C199419zy.A00(r2, new B0X(r2, AnonymousClass000.A1W(productBottomSheetViewModel.A02)));
        }
        Application application = productBottomSheetViewModel.A0C;
        ((CatalogManager) productBottomSheetViewModel.A0O.get()).A0G(new C195469tO(r5, userJid, Integer.valueOf(AnonymousClass3MW.A01(application.getResources(), 2131167707)), Integer.valueOf(AnonymousClass3MW.A01(application.getResources(), 2131167707)), str, productBottomSheetViewModel.A0J.A03, false));
        return C27621Wu.A00;
    }

    public /* synthetic */ C21542Alp(ProductBottomSheetViewModel productBottomSheetViewModel, UserJid userJid, String str) {
        this.A00 = productBottomSheetViewModel;
        this.A01 = userJid;
        this.A02 = str;
    }
}
