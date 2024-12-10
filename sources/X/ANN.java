package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;

public class ANN implements B7E {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ANN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void Btm(C195149ss r3, int i) {
        if (this.A00 != 0) {
            C17900vP.A0i("GetCategoriesGraphQLService.Listener/onFailure errorCode =", AnonymousClass000.A10(), i);
            if (406 == i || 421 == i) {
                CatalogManager.A01((CatalogManager) this.A02, r3.A02);
            }
            ((BAI) this.A01).BuD(r3, i);
            return;
        }
        ((BAH) this.A01).Btw();
    }
}
