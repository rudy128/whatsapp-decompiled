package X;

import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;

public class AOB implements B7Q {
    public final int A00;
    public final Object A01;

    public AOB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C1t(C20287AEv aEv, int i) {
        if (this.A00 != 0) {
            CatalogSearchProductListFragment catalogSearchProductListFragment = (CatalogSearchProductListFragment) this.A01;
            UserJid A27 = catalogSearchProductListFragment.A27();
            String str = aEv.A0H;
            C18070vi.A0d(str, 2);
            C61172pF.A00((C61172pF) ((CatalogSearchViewModel) catalogSearchProductListFragment.A04.getValue()).A03.get(), A27, (Integer) null, Integer.valueOf(i), str, 3);
            return;
        }
        C169018kE r4 = (C169018kE) this.A01;
        C18030ve r0 = r4.A0E;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r0, 1514) && r4.A00 != -1) {
            AnonymousClass00H r02 = r4.A0O;
            if (r02 != null) {
                C190919lj r5 = (C190919lj) r02.get();
                UserJid A4c = r4.A4c();
                String A4d = r4.A4d();
                int i2 = r4.A01;
                int i3 = r4.A00;
                String str2 = aEv.A0H;
                C18070vi.A0d(str2, 6);
                Integer valueOf = Integer.valueOf(i);
                if (C18020vd.A05(r2, r5.A02, 1514)) {
                    r5.A03.CGF(new C21401AjU(r5, A4c, true, valueOf, A4d, str2, i3, i2, 3));
                    return;
                }
                return;
            }
            C18070vi.A11("categoriesLogger");
            throw null;
        }
    }
}
