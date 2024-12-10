package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.9oc  reason: invalid class name and case insensitive filesystem */
public final class C192569oc {
    public final A8Q A00;
    public final CatalogManager A01;
    public final C182909We A02;
    public final C19988A2a A03;

    public void A01(UserJid userJid, Set set, C22821Di r13) {
        UserJid userJid2;
        C18070vi.A0d(set, 0);
        Iterator it = set.iterator();
        do {
            userJid2 = userJid;
            if (it.hasNext()) {
            } else {
                LinkedHashMap A13 = C17880vN.A13();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String A0v = C17880vN.A0v(it2);
                    A13.put(A0v, this.A03.A01(userJid, A0v));
                }
                r13.invoke(new AnonymousClass8lT(A13, true));
                return;
            }
        } while (this.A03.A04(userJid, C17880vN.A0v(it)));
        Set set2 = set;
        if (set.contains("catalog_category_dummy_root_id")) {
            set2 = C25511Om.A00;
        }
        ANA ana = new ANA(this, userJid, set, r13);
        int i = this.A02.A00;
        C195149ss r4 = new C195149ss(userJid2, this.A00.A03, set2, i, i);
        AN9 an9 = new AN9(ana, this, 1);
        CatalogManager catalogManager = this.A01;
        ((A5Q) catalogManager.A0P.getValue()).A03(r4, new ANN(an9, catalogManager, 1));
    }

    public C192569oc(A8Q a8q, CatalogManager catalogManager, C182909We r4, C19988A2a a2a) {
        C18070vi.A0j(catalogManager, a2a);
        C18070vi.A0d(a8q, 4);
        this.A01 = catalogManager;
        this.A03 = a2a;
        this.A02 = r4;
        this.A00 = a8q;
    }

    public void A00(UserJid userJid, String str, C22821Di r6) {
        A01(userJid, C18070vi.A0P(str), new C21530Ald(1, str, r6));
    }
}
