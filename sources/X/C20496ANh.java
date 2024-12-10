package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ANh  reason: case insensitive filesystem */
public final class C20496ANh implements BAL {
    public final /* synthetic */ CatalogManager A00;
    public final /* synthetic */ AnonymousClass9a1 A01;
    public final /* synthetic */ UserJid A02;

    public void C1H(C183899a0 r7) {
        C18070vi.A0d(r7, 0);
        AnonymousClass9a1 r5 = this.A01;
        String str = r7.A01;
        if (C18070vi.A18(str, "success")) {
            PostcodeViewModel postcodeViewModel = r5.A00;
            C21459AkQ.A01(postcodeViewModel.A0E, postcodeViewModel, r7, r5.A01, 29);
        }
        r5.A00.A0D.A0E(str);
    }

    public C20496ANh(CatalogManager catalogManager, AnonymousClass9a1 r2, UserJid userJid) {
        this.A01 = r2;
        this.A00 = catalogManager;
        this.A02 = userJid;
    }

    public void C1G(String str, int i) {
        if (406 == i || 421 == i) {
            CatalogManager.A01(this.A00, this.A02);
        }
        this.A01.A00.A0D.A0E(str);
    }
}
