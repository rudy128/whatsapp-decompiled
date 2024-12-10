package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AMj  reason: case insensitive filesystem */
public final /* synthetic */ class C20472AMj implements B77 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ ANI A02;

    public final void Bmx(AEW aew) {
        ANI ani = this.A02;
        UserJid userJid = this.A01;
        int i = this.A00;
        ((CatalogManager) ani.A08.get()).A09(new ANB(userJid, ani), new C188519hY((AnonymousClass9NJ) null, (C194359rb) null, userJid, true, (String) null, (String) null, 6, i, i, false));
    }

    public /* synthetic */ C20472AMj(UserJid userJid, ANI ani, int i) {
        this.A02 = ani;
        this.A01 = userJid;
        this.A00 = i;
    }
}
