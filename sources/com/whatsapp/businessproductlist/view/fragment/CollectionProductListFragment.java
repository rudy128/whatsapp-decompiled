package com.whatsapp.businessproductlist.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8Ey;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C20004A2u;
import X.C20339AGv;
import X.C21528Alb;
import X.C21535Ali;
import X.C22437B7t;
import X.C24921Me;
import X.C26911Ty;
import X.C30391dr;
import X.C41561wd;
import X.C56482hX;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.businessproductlist.view.viewmodel.CollectionProductListViewModel$fetchProductsFromStart$1;
import com.whatsapp.jid.UserJid;

public class CollectionProductListFragment extends Hilt_CollectionProductListFragment {
    public int A00 = -1;
    public AnonymousClass1L9 A01;
    public C56482hX A02;
    public AnonymousClass1KB A03;
    public AnonymousClass11S A04;
    public C26911Ty A05;
    public AnonymousClass1M9 A06;
    public AnonymousClass1PM A07;
    public C24921Me A08;
    public C18030ve A09;
    public C20004A2u A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public C18600wl A0H;
    public final C18100vl A0I = C21528Alb.A00(this, 27);

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass8Ey r3 = (AnonymousClass8Ey) this.A0I.getValue();
        UserJid A27 = A27();
        String str = this.A0F;
        if (str != null) {
            boolean A1S = AnonymousClass000.A1S(this.A00, -1);
            AnonymousClass3MW.A1X(r3.A02, new CollectionProductListViewModel$fetchProductsFromStart$1(r3, A27, str, (C30391dr) null, A1S), C41561wd.A00(r3));
            return;
        }
        C18070vi.A11("collectionId");
        throw null;
    }

    public void A1u() {
        super.A1u();
        if (this.A0E != null) {
            C22437B7t b7t = this.A06;
            C18070vi.A0b(b7t);
            b7t.Bu9(AnonymousClass3MY.A03(this.A0E));
            this.A0E = null;
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String string = A15().getString("collection-id", "");
        C18070vi.A0d(string, 0);
        this.A0F = string;
        this.A0G = A15().getString("collection-index");
        this.A00 = A15().getInt("category_browsing_entry_point", -1);
        A15().getInt("category_level", -1);
        C18100vl r3 = this.A0I;
        C20339AGv.A00(this, ((AnonymousClass8Ey) r3.getValue()).A00.A03, C21535Ali.A00(this, 21), 24);
        C20339AGv.A00(this, ((AnonymousClass8Ey) r3.getValue()).A00.A05, C21535Ali.A00(this, 22), 24);
    }
}
