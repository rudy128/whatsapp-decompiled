package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.AMr  reason: case insensitive filesystem */
public class C20480AMr implements BAF {
    public final int A00;
    public final Object A01;

    public C20480AMr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Brd(UserJid userJid) {
        if (this.A00 != 0) {
            Log.e("CatalogSearchCatalogPageRequestFactory/reloadDCBusinessInfo/");
            ((C198689yk) this.A01).A02.A0G("product-search-enc-dc-refetch-failed", "", false);
            return;
        }
        Log.e("DirectConnectionHelperAsync/awaitGenerateDirectConnectionError/onDirectConnectionError");
        ((C30391dr) this.A01).resumeWith(AnonymousClass000.A0h());
    }

    public void Bre(UserJid userJid) {
        if (this.A00 == 0) {
            ((C30391dr) this.A01).resumeWith(AnonymousClass000.A0i());
        }
    }
}
