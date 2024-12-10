package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9nc  reason: invalid class name and case insensitive filesystem */
public final class C192019nc {
    public final /* synthetic */ C186469eF A00;

    public void A01(C195539tV r9, int i) {
        C18070vi.A0d(r9, 0);
        C186469eF r3 = this.A00;
        C17900vP.A0i("CatalogManager onFetchCollectionsFailure, errorCode =", AnonymousClass000.A10(), i);
        CatalogManager catalogManager = r3.A00;
        catalogManager.A01 = false;
        if (i == 404) {
            Log.i("CatalogManager onFetchCollectionsFailure, remove collection cache");
            CatalogManager.A00(catalogManager).A0L(r3.A01, false);
        } else if (406 == i) {
            UserJid userJid = r3.A01;
            CatalogManager.A01(catalogManager, userJid);
            Log.i("CatalogManager onFetchCollectionsFailure, remove collection cache");
            CatalogManager.A00(catalogManager).A0L(userJid, false);
        } else if (421 == i) {
            Log.i("CatalogManager onFetchCollectionsFailure, fetch business profile");
            CatalogManager.A01(catalogManager, r9.A05);
        }
        C20114A7x A002 = CatalogManager.A00(catalogManager);
        UserJid userJid2 = r3.A01;
        ArrayList A13 = AnonymousClass000.A13();
        A002.A0E(new C194219rN(new C193429q5(false, (String) null), C179409Hv.UNKNOWN, A13), userJid2, true);
        AnonymousClass1DT r1 = catalogManager.A04;
        C18070vi.A0d(userJid2, 1);
        r1.A0E(new C182949Wi(userJid2));
    }

    public C192019nc(C186469eF r1) {
        this.A00 = r1;
    }

    public void A00(C194219rN r9, C195539tV r10) {
        boolean z;
        C186469eF r3 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogManager onFetchCollectionsSuccess, pageinfo:");
        A10.append(r9.A00);
        A10.append(", #collections:");
        List list = r9.A02;
        C17900vP.A0b(AnonymousClass8BT.A0l(list), A10);
        CatalogManager catalogManager = r3.A00;
        catalogManager.A01 = false;
        String str = r10.A06;
        if (str == null) {
            z = false;
        } else if (str.equals(r3.A02)) {
            z = true;
        } else {
            return;
        }
        C17900vP.A0n("CatalogManager onFetchCollectionsSuccess, save collections into cache isAppend:", AnonymousClass000.A10(), z);
        C20114A7x A002 = CatalogManager.A00(catalogManager);
        UserJid userJid = r3.A01;
        A002.A0E(r9, userJid, z);
        boolean z2 = r3.A03;
        if (!z2 || !list.isEmpty()) {
            Log.i("CatalogManager onFetchCollectionsSuccess, post collections");
            catalogManager.A04.A0E(new C168588jG(new C185609cr(list, z2, false), userJid));
            return;
        }
        Log.i("CatalogManager onFetchCollectionsSuccess, post collections as empty");
        AnonymousClass1DT r1 = catalogManager.A04;
        C18070vi.A0d(userJid, 1);
        r1.A0E(new C182949Wi(userJid));
    }
}
