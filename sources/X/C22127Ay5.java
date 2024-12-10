package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Ay5  reason: case insensitive filesystem */
public final class C22127Ay5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ProductListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22127Ay5(ProductListActivity productListActivity) {
        super(1);
        this.this$0 = productListActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C18070vi.A0d(obj, 0);
        ProductListActivity productListActivity = this.this$0;
        C26911Ty r3 = productListActivity.A08;
        if (r3 != null) {
            UserJid userJid = productListActivity.A0H;
            if (userJid == null) {
                str = "businessId";
            } else {
                r3.A0D(new C20471AMi(productListActivity, obj, 6), userJid);
                return C27621Wu.A00;
            }
        } else {
            str = "businessProfileManager";
        }
        C18070vi.A11(str);
        throw null;
    }
}
