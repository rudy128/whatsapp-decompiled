package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ha  reason: invalid class name and case insensitive filesystem */
public class C56512ha {
    public final /* synthetic */ C36251na A00;

    public C56512ha(C36251na r1) {
        this.A00 = r1;
    }

    public C198719yn A00(UserJid userJid) {
        C36251na r2 = this.A00;
        AnonymousClass10E A02 = r2.A02;
        C26911Ty r3 = (C26911Ty) A02.A1J.get();
        CatalogManager catalogManager = (CatalogManager) A02.A1s.get();
        C20114A7x a7x = (C20114A7x) A02.A1q.get();
        AnonymousClass10I AL0 = AnonymousClass10E.AL0(A02);
        return new C198719yn(r3, (C189889k1) A02.A1n.get(), r2.A01.A07(), a7x, catalogManager, (C19973A1i) A02.A1r.get(), userJid, AL0);
    }
}
