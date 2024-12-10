package X;

import android.app.Application;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

public final class AHA implements C24051Ir {
    public final Application A00;
    public final C192829p3 A01;
    public final C196469v7 A02;
    public final C185479ce A03;
    public final CatalogManager A04;
    public final UserJid A05;
    public final AnonymousClass2UJ A06;
    public final AnonymousClass10I A07;
    public final C18600wl A08;

    public AHA(Application application, C192829p3 r3, C196469v7 r4, C185479ce r5, CatalogManager catalogManager, UserJid userJid, AnonymousClass2UJ r8, AnonymousClass10I r9, C18600wl r10) {
        C108965cb.A1O(catalogManager, 3, r4);
        C18070vi.A0d(r5, 9);
        this.A05 = userJid;
        this.A00 = application;
        this.A04 = catalogManager;
        this.A01 = r3;
        this.A06 = r8;
        this.A02 = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A03 = r5;
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        UserJid userJid = this.A05;
        Application application = this.A00;
        CatalogManager catalogManager = this.A04;
        C192829p3 r2 = this.A01;
        AnonymousClass2UJ r7 = this.A06;
        return new AnonymousClass8F1(application, r2, this.A02, this.A03, catalogManager, userJid, r7, this.A07, this.A08);
    }
}
