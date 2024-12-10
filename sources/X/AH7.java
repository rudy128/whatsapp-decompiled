package X;

import android.app.Application;
import com.whatsapp.biz.catalog.manager.CatalogManager;

public final class AH7 implements C24051Ir {
    public final Application A00;
    public final C190919lj A01;
    public final CatalogManager A02;
    public final C18600wl A03;

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        return new AnonymousClass8Ey(this.A00, this.A01, this.A02, this.A03);
    }

    public AH7(Application application, C190919lj r2, CatalogManager catalogManager, C18600wl r4) {
        C18070vi.A0k(catalogManager, r2);
        this.A00 = application;
        this.A02 = catalogManager;
        this.A01 = r2;
        this.A03 = r4;
    }
}
