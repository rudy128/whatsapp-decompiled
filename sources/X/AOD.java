package X;

import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

public final /* synthetic */ class AOD implements B7R {
    public final /* synthetic */ ProductDetailActivity A00;

    public final void C3F(String str) {
        ProductDetailActivity productDetailActivity = this.A00;
        C20287AEv aEv = productDetailActivity.A0K;
        if (aEv != null) {
            String str2 = aEv.A0H;
            String str3 = productDetailActivity.A4c().A03;
            String str4 = str;
            C187669gB r4 = new C187669gB(productDetailActivity.A4e(), str2, str4, str3, productDetailActivity.A4c().A0D.get(), (long) productDetailActivity.A4c().A0E.getAndIncrement());
            productDetailActivity.CNA(2131888002);
            productDetailActivity.A05.CGN(new C21450AkH(productDetailActivity, r4, 33));
        }
    }

    public /* synthetic */ AOD(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }
}
