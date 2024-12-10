package X;

import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.viewmodel.ProfileCreationViewModel;

/* renamed from: X.AMq  reason: case insensitive filesystem */
public class C20479AMq implements AnonymousClass1M6 {
    public final int A00;
    public final Object A01;

    public C20479AMq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bmw(UserJid userJid) {
        switch (this.A00) {
            case 0:
                AnonymousClass8F7 r1 = (AnonymousClass8F7) this.A01;
                if (r1.A03.equals(userJid)) {
                    r1.A0V();
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(userJid, 0);
                CatalogListActivity catalogListActivity = (CatalogListActivity) this.A01;
                if (catalogListActivity.A4f().equals(userJid) && !catalogListActivity.A02.A0O(catalogListActivity.A4f())) {
                    CatalogListActivity.A03(catalogListActivity);
                    return;
                }
                return;
            case 2:
                C18070vi.A0d(userJid, 0);
                AnonymousClass8BY.A1F(this.A01, userJid);
                return;
            case 3:
                C18070vi.A0d(userJid, 0);
                C168648jP r12 = (C168648jP) this.A01;
                if (r12.A4e().equals(userJid)) {
                    C20485AMw aMw = r12.A4d().A0I;
                    C21445AkC.A01(aMw.A04, aMw, 9);
                    return;
                }
                return;
            case 4:
                C18070vi.A0d(userJid, 0);
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A01;
                C26911Ty r13 = catalogSearchFragment.A08;
                if (r13 != null) {
                    C20478AMp.A00(r13, userJid, catalogSearchFragment, 6);
                    return;
                } else {
                    C18070vi.A11("businessProfileManager");
                    throw null;
                }
            default:
                ProfileCreationViewModel profileCreationViewModel = (ProfileCreationViewModel) this.A01;
                PhoneUserJid A002 = AnonymousClass11S.A00(profileCreationViewModel.A01);
                if (A002 != null) {
                    C20478AMp.A00(profileCreationViewModel.A02, A002, profileCreationViewModel, 8);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ void Bmt(UserJid userJid) {
    }
}
