package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class AN2 implements BAG {
    public final /* synthetic */ C168578j9 A00;

    public void BuB(UserJid userJid, int i) {
        String str;
        String str2;
        C17900vP.A0j("CatalogListBaseActivity onFetchCatalogFail ", AnonymousClass000.A10(), i);
        C168578j9 r3 = this.A00;
        if (!C42171xk.A00(userJid, r3.A4f())) {
            str2 = "CatalogListBaseActivity onFetchCatalogFail different jid";
        } else {
            r3.A4e().A02 = true;
            r3.A4e().A01 = Integer.valueOf(i);
            AnonymousClass00H r0 = r3.A0K;
            if (r0 == null) {
                str = "catalogManager";
            } else if (((CatalogManager) r0.get()).A01) {
                str2 = "CatalogListBaseActivity onFetchCatalogFail waiting for collections response";
            } else {
                Log.i("CatalogListBaseActivity onFetchCatalogFail handle error");
                if (i == 404) {
                    Log.i("CatalogListBaseActivity onCatalogMissing");
                    r3.A0Q = false;
                    r3.invalidateOptionsMenu();
                }
                r3.A4d().A0b(i);
                C20004A2u a2u = r3.A0E;
                if (a2u != null) {
                    a2u.A06("catalog_collections_view_tag", false);
                    return;
                }
                str = "bizQPLManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        Log.i(str2);
    }

    public AN2(C168578j9 r1) {
        this.A00 = r1;
    }

    public void BuC(UserJid userJid, boolean z, boolean z2) {
        String str;
        Log.i("CatalogListBaseActivity onFetchCatalogSuccess");
        C168578j9 r3 = this.A00;
        if (!C42171xk.A00(userJid, r3.A4f())) {
            str = "CatalogListBaseActivity onFetchCatalogSuccess called with different jid";
        } else {
            if (!z && z2) {
                r3.A4e().A02 = true;
            }
            r3.A4e().A01 = null;
            AnonymousClass00H r0 = r3.A0K;
            if (r0 == null) {
                C18070vi.A11("catalogManager");
                throw null;
            } else if (((CatalogManager) r0.get()).A01) {
                str = "CatalogListBaseActivity onFetchCatalogSuccess waiting for collections response";
            } else {
                Log.i("CatalogListBaseActivity onFetchCatalogSuccess fetch business profile");
                C26911Ty r2 = r3.A03;
                if (r2 != null) {
                    r2.A0D(new C20471AMi(r3, userJid, 5), userJid);
                    return;
                } else {
                    C18070vi.A11("businessProfileManager");
                    throw null;
                }
            }
        }
        Log.i(str);
    }
}
